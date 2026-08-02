package xsna;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.messages.dto.MessagesConversationDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationsExtendedResponseDto;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.confirmaccount.impl.VkConfirmUserByServiceActivity;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerState;
import com.vk.feed.design.view.posting.preview.spinner.PostingVkSpinnerWrapperView;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.im.ui.components.theme_chooser.c;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.profile.design.view.avatar.UserProfileAvatarView;
import com.vk.profile.design.view.skeleton.AvatarViewWrapper;
import com.vk.profile.design.view.skeleton.ProfileHeaderSkeletonView;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.g;
import com.vk.profile.user.impl.ui.view.skeleton.UserProfileSkeletonView;
import com.vk.reefton.Reef;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cq5;
import xsna.d5v;
import xsna.dpt0;
import xsna.eeu0;
import xsna.enc0;
import xsna.h7u0;
import xsna.kdk0;
import xsna.tra0;
import xsna.xn50;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bnc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bnc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v84, types: [androidx.fragment.app.Fragment, xsna.zzu0] */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 2;
        int i2 = 20;
        int i3 = 4;
        int i4 = 10;
        byte b = 0;
        switch (this.b) {
            case 0:
                enc0 enc0Var = (enc0) this.c;
                VkTopBar vkTopBar = enc0Var.m;
                PostingVkSpinnerWrapperView postingVkSpinnerWrapperView = enc0Var.K;
                new ActionsAvailabilityState.Availability.NotAvailable(null);
                vkTopBar.setAfter(null);
                int i5 = enc0.a.$EnumSwitchMapping$3[((LoadingState) obj).ordinal()];
                if (i5 == 1) {
                    postingVkSpinnerWrapperView.setSubtitle(null);
                    postingVkSpinnerWrapperView.setSpinnerState(PostingSpinnerState.Loading);
                } else if (i5 != 2) {
                    postingVkSpinnerWrapperView.setSubtitle(null);
                    postingVkSpinnerWrapperView.setSpinnerState(PostingSpinnerState.Error);
                } else {
                    postingVkSpinnerWrapperView.setSubtitle(enc0Var.c.getContext().getString(R.string.posting_settings_loading_error));
                    postingVkSpinnerWrapperView.setSpinnerState(PostingSpinnerState.Error);
                }
                break;
            case 1:
                break;
            case 2:
                PublishFragment publishFragment = (PublishFragment) this.c;
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                PublishFragmentInternalComponent eo = publishFragment.eo();
                eo.getClass();
                break;
            case 3:
                e6f0 e6f0Var = (e6f0) this.c;
                e6f0Var.p = (Throwable) obj;
                e6f0Var.o = true;
                break;
            case 4:
                Reef reef = (Reef) this.c;
                vof0 vof0Var = (vof0) obj;
                break;
            case 5:
                ((tra0.a) obj).q((tra0) this.c, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 6:
                break;
            case 7:
                ((SearchStaticMapPreviewVh) this.c).c();
                break;
            case 8:
                s8i0 s8i0Var = (s8i0) this.c;
                d5v d5vVar = (d5v) ((Pair) obj).g();
                if (d5vVar instanceof d5v.b) {
                    s8i0Var.g.invoke(((d5v.b) d5vVar).a);
                }
                break;
            case 9:
                xii0 xii0Var = (xii0) this.c;
                MessagesSearchConversationsExtendedResponseDto messagesSearchConversationsExtendedResponseDto = (MessagesSearchConversationsExtendedResponseDto) obj;
                MapBuilder a = xii0Var.a(messagesSearchConversationsExtendedResponseDto.g(), messagesSearchConversationsExtendedResponseDto.e(), messagesSearchConversationsExtendedResponseDto.d());
                List<MessagesConversationDto> f = messagesSearchConversationsExtendedResponseDto.f();
                ArrayList arrayList = new ArrayList(c5g.u(f, 10));
                for (MessagesConversationDto messagesConversationDto : f) {
                    arrayList.add(epx.f(messagesConversationDto.g().d(), xii0Var.f.getUid()) ? xii0Var.h : xii0.b(messagesConversationDto, a));
                }
                break;
            case 10:
                odk0 odk0Var = (odk0) this.c;
                kdk0.c cVar = kdk0.c.b;
                odk0Var.getClass();
                xn50.a.c(odk0Var, cVar);
                break;
            case 11:
                mtk0 mtk0Var = (mtk0) this.c;
                VkSpinner vkSpinner = (VkSpinner) ((FrameLayout) obj).getChildAt(0);
                vkSpinner.setProgress(((Number) mtk0Var.getValue()).intValue(), true);
                vkSpinner.setProgressIndicatorDirection(VkSpinner.IndicatorDirection.CounterClockwise);
                break;
            case 12:
                vvl0 vvl0Var = (vvl0) this.c;
                zjm0 zjm0Var = (zjm0) obj;
                p870 p870Var = vvl0Var.b;
                p870Var.c(110);
                p870Var.e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, zjm0Var);
                vvl0Var.q(zjm0Var);
                break;
            case 13:
                com.vk.stories.design.view.stats.tabs.viewers.mvi.d dVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.d) this.c;
                StoryStatisticsViewersViewState.c cVar2 = (StoryStatisticsViewersViewState.c) obj;
                Context context = dVar.d;
                ListBuilder e = e43.e();
                StoryStatisticsViewersViewState.d dVar2 = cVar2.a;
                StoryStatisticsViewersViewState.f fVar = cVar2.b;
                ArrayList<StoriesContainer> arrayList2 = dVar2.a;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<T> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        b += ((StoriesContainer) it.next()).g.size();
                    }
                    e.add(new zem0(context.getResources().getQuantityString(R.plurals.story_statistics_viewers_replies_counted, b, Integer.valueOf(b)), null));
                    e.add(new u3u0(arrayList2));
                }
                StoryStatisticsViewersViewState.e eVar = fVar.a;
                if (eVar != null) {
                    int i6 = eVar.a;
                    int i7 = eVar.b;
                    String quantityString = context.getResources().getQuantityString(R.plurals.story_statistics_viewers_views_counted, i6, Integer.valueOf(i6));
                    e.add(new zem0(i7 > 0 ? y57.a("\u202d", context.getResources().getQuantityString(R.plurals.story_statistics_viewers_reactions_counted, i7, Integer.valueOf(i7)), "  ·  ", quantityString) : "\u202d".concat(quantityString), null));
                }
                VKList<StoryUserViewer> vKList = fVar.b;
                if (vKList != null) {
                    e.addAll(vKList);
                }
                ListBuilder g = e.g();
                uhm0 uhm0Var = dVar.g;
                m.d a2 = androidx.recyclerview.widget.m.a(new pxm(uhm0Var.j, g, uhm0Var.i), true);
                uhm0Var.j = g;
                a2.b(uhm0Var);
                break;
            case 14:
                StreamInfoFragment streamInfoFragment = (StreamInfoFragment) this.c;
                int i8 = StreamInfoFragment.S;
                streamInfoFragment.tn();
                break;
            case 15:
                ((com.vk.im.ui.components.theme_chooser.b) this.c).u = (c.AbstractC1159c) obj;
                break;
            case 16:
                kmq0 kmq0Var = (kmq0) this.c;
                int i9 = UserProfileAvatarView.j;
                kmq0Var.i.invoke();
                break;
            case 17:
                g.b bVar = (g.b) obj;
                com.vk.profile.user.impl.ui.i iVar = ((UserProfileFragment) this.c).Q;
                UserProfileSkeletonView userProfileSkeletonView = (iVar != null ? iVar : null).h.d;
                ProfileHeaderSkeletonView profileHeaderSkeletonView = userProfileSkeletonView.b;
                VkText vkText = profileHeaderSkeletonView.t;
                AvatarViewWrapper avatarViewWrapper = profileHeaderSkeletonView.v;
                String str = bVar.b;
                boolean z = str != null;
                bwt0.p0(vkText, z);
                bwt0.p0(profileHeaderSkeletonView.u, !z);
                if (z) {
                    vkText.setText(str);
                }
                VKAvatarView.c1(avatarViewWrapper, bVar.d ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, bVar.e ? cq5.h.a : cq5.b.a, 4);
                String str2 = bVar.c;
                if (str2 != null && (!new Regex("https://.*vk\\.com/images/camera_\\d{2,3}.png").a(str2) || !bVar.f)) {
                    avatarViewWrapper.load(str2);
                }
                bwt0.p0(userProfileSkeletonView, bVar.a);
                break;
            case 18:
                UsersDiscoverFragment usersDiscoverFragment = (UsersDiscoverFragment) this.c;
                int i10 = UsersDiscoverFragment.t0;
                usersDiscoverFragment.a0();
                break;
            case 19:
                kfr0 kfr0Var = (kfr0) this.c;
                List<WebUserShortInfo> list = (List) obj;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (WebUserShortInfo webUserShortInfo : list) {
                    JSONObject put = new JSONObject().put("id", webUserShortInfo.b).put("sex", webUserShortInfo.e ? "1" : "2").put("last_name", webUserShortInfo.d).put("first_name", webUserShortInfo.c);
                    WebImageSize e2 = webUserShortInfo.h.e(200);
                    arrayList3.add(put.put("photo_200", e2 != null ? e2.b : null));
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    jSONArray.put((JSONObject) it2.next());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("users", jSONArray);
                kfr0Var.c.n(JsApiMethodType.GET_FRIENDS, jSONObject);
                break;
            case 20:
                ((nrr0) this.c).l.h();
                break;
            case 21:
                xbs0 xbs0Var = (xbs0) this.c;
                VideoStatistic videoStatistic = (VideoStatistic) obj;
                xbs0Var.H = videoStatistic;
                xbs0Var.k8(videoStatistic.i);
                xbs0Var.e.ua(videoStatistic.i);
                com.vk.lists.c cVar3 = xbs0Var.P;
                if (cVar3 != null) {
                    cVar3.d();
                }
                break;
            case 22:
                ((com.vk.video.ui.discovery.minimizable.g) this.c).C(new c.i0((lgs0) obj));
                break;
            case 23:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.c;
                int i11 = VideoMinimizableDiscoveryFragment.p1;
                videoMinimizableDiscoveryFragment.getFeature().L0((AboutVideoItem.a) obj);
                break;
            case 24:
                dpt0.a aVar = (dpt0.a) this.c;
                (com.vk.toggle.d.R() ? new h7u0.a(aVar.c) : new eeu0.a(aVar.c)).B(R.string.video_urls_title).q(R.string.video_urls_descr).setPositiveButton(R.string.video_urls_ok, new cpt0()).m();
                break;
            case 25:
                ggu0 ggu0Var = (ggu0) this.c;
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                r6y r6yVar = ggu0Var.C;
                ((d6y) r6yVar.N.getValue()).a(jSONObject2.toString());
                ((w1y) r6yVar.O.getValue()).a(jSONObject2.toString());
                ggu0Var.d.t(true);
                r6yVar.VKWebAppClose(jSONObject2.toString());
                break;
            case 26:
                VkConfirmUserByServiceActivity vkConfirmUserByServiceActivity = (VkConfirmUserByServiceActivity) this.c;
                int i12 = VkConfirmUserByServiceActivity.m;
                vkConfirmUserByServiceActivity.i = true;
                vkConfirmUserByServiceActivity.setResult(-1, new Intent().putExtra("callbackURL", (String) obj));
                vkConfirmUserByServiceActivity.finish();
                break;
            case 27:
                ?? r0 = ((yzu0) this.c).b;
                Toast.makeText(r0.getContext(), ((Throwable) obj).getMessage(), 0).show();
                r0.reset();
                break;
            case 28:
                y5j.a aVar2 = (y5j.a) this.c;
                q5j q5jVar = (q5j) obj;
                m6j m6jVar = q5jVar.d;
                s5j s5jVar = q5jVar.c;
                jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.g, aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                break;
            default:
                lwv0 lwv0Var = (lwv0) this.c;
                Throwable th = (Throwable) obj;
                FragmentActivity activity = lwv0Var.e.getActivity();
                if (activity != null) {
                    iah0.x(activity, false);
                }
                r6y r6yVar2 = lwv0Var.b;
                if (r6yVar2 != null) {
                    r6yVar2.z(JsApiMethodType.KEEP_SCREEN_ON, th);
                }
                xgx0.a.getClass();
                xgx0.d(th);
                break;
        }
        return s3q0.a;
    }
}
