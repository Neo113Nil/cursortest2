package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.validation.b;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoHide;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.OnlineInfo;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.log.L;
import com.vk.messagetemplates.impl.details.TemplateDetailsState;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.recycler.holders.VideoSnippetAutoPlayHolder;
import com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stories.StorySettingsActivity;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.video.profile.exceptions.DeactivatedUserException;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.vmoji.character.product.VmojiProductsFragment;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.adw0;
import xsna.c9t0;
import xsna.e8w0;
import xsna.hh8;
import xsna.i8w0;
import xsna.ikv0;
import xsna.o9w0;
import xsna.qyr0;
import xsna.w7t0;
import xsna.xn50;
import xsna.yyb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mdm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mdm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v21, types: [xsna.wvn] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r1;
        nt80<dfw0> nt80Var;
        int i = this.b;
        boolean z = true;
        z = true;
        r2 = null;
        dfw0 dfw0Var = null;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) obj2;
                VkCellButton vkCellButton = storySettingsActivity.F;
                if (vkCellButton == null) {
                    vkCellButton = null;
                }
                bwt0.p0(vkCellButton, false);
                ikv0.a aVar = new ikv0.a(bwt0.u(storySettingsActivity));
                aVar.u = new ikv0.d(storySettingsActivity.i.getString(R.string.done), (String) null, (ikv0.d.a) null, 6);
                aVar.p(storySettingsActivity.getWindow());
                return s3q0.a;
            case 1:
                ((mfm0) obj2).e.setBlurVisibility(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 2:
                uy9 uy9Var = (uy9) obj2;
                ((uov) uy9Var.c).setActionInProgress(false);
                uov uovVar = (uov) uy9Var.c;
                uovVar.play();
                sdi.v((Throwable) obj, uovVar.getView());
                return s3q0.a;
            case 3:
                int[] iArr = (int[]) obj2;
                ljo0 ljo0Var = (ljo0) obj;
                int i3 = SubscriptionInfoView.p;
                int i4 = ljo0Var.b.f;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                for (int i5 = 0; i5 < i4; i5++) {
                    f = Math.max(f, ljo0Var.i(i5));
                }
                iArr[0] = (int) Math.ceil(f);
                return s3q0.a;
            case 4:
                ((j3n0) obj2).d();
                return s3q0.a;
            case 5:
                acn0 acn0Var = (acn0) obj2;
                Object obj3 = acn0Var.l;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                WebAction webAction = ((ien0) obj4).h.o.c;
                if (webAction != null) {
                    u7n0 u7n0Var = acn0Var.p;
                    Context context = acn0Var.itemView.getContext();
                    Object obj5 = acn0Var.l;
                    Object obj6 = obj5;
                    if (obj5 == null) {
                        obj6 = null;
                    }
                    u7n0Var.b(context, webAction, (f9n0) obj6, null);
                }
                return s3q0.a;
            case 6:
                MsgTemplate msgTemplate = (MsgTemplate) obj2;
                return TemplateDetailsState.a((TemplateDetailsState) obj, msgTemplate != null ? msgTemplate.c : null, msgTemplate != null ? msgTemplate.d : null, false, 9);
            case 7:
                ((n0) obj2).invoke();
                cvk.u(R.string.error_network, false);
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                ((nqq0) obj2).d.a(new UserProfileAction.f.a.C1686a((GiftItem) obj));
                return s3q0.a;
            case 9:
                ((zwq0) obj2).t();
                return s3q0.a;
            case 10:
                return UserStorageModel.zb((UserStorageModel) obj, null, null, null, (OnlineInfo) obj2, null, null, 0, -1025);
            case 11:
                mqr0 mqr0Var = (mqr0) obj2;
                jj0 jj0Var = mqr0Var.l;
                yyb.a aVar2 = mqr0Var.o;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                DialogMember c = aVar2.c();
                yyb.a aVar3 = mqr0Var.o;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                ProfilesInfo e = aVar3.e();
                yyb.a aVar4 = mqr0Var.o;
                jj0Var.f(c, e, (aVar4 != null ? aVar4 : null).d());
                return s3q0.a;
            case 12:
                qyr0 qyr0Var = (qyr0) obj2;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = qyr0.m1;
                g47Var.e(tci.l(qyr0Var.eo()), new b98(qyr0Var.requireContext(), i2));
                g47Var.a(tci.k(qyr0Var.eo()));
                g47Var.d(new qyr0.b(qyr0Var.eo()));
                return s3q0.a;
            case 13:
                s0s0 s0s0Var = (s0s0) obj2;
                zu50 zu50Var = s0s0Var.g;
                if (zu50Var != null) {
                    zu50Var.a();
                }
                s0s0Var.g = null;
                s0s0Var.h.onNext(new VideoAdvertisementsRepository.a.C1194a(false));
                s0s0Var.i = null;
                return s3q0.a;
            case 14:
                dw20 dw20Var = ((r2s0) obj2).b;
                if (dw20Var != null) {
                    String str = dw20.d1;
                    dw20Var.Sn(null);
                }
                return s3q0.a;
            case 15:
                mcs0 mcs0Var = (mcs0) obj2;
                vqt vqtVar = (vqt) obj;
                com.vk.lists.c cVar = mcs0Var.i;
                int i6 = vqtVar.c;
                int i7 = vqtVar.b;
                VKList<NewsComment> vKList = vqtVar.a;
                cVar.q(i6 > 0 ? vKList.size() + i6 : vKList.size());
                mcs0Var.m.e(Math.max(0, i7 - vqtVar.c));
                if (cVar.i() >= i7) {
                    cVar.r(false);
                }
                String j = cVar.j();
                if (j == null || j.length() == 0 || vKList.isEmpty()) {
                    cVar.r(false);
                }
                return s3q0.a;
            case 16:
                VideoFile videoFile = (VideoFile) obj2;
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    for (UIBlock uIBlock : arrayList) {
                        if (uIBlock instanceof UIBlockVideo) {
                            UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                            if (!uIBlockVideo.B.C2() && epx.f(uIBlockVideo.B.r1(), videoFile.r1())) {
                                return Boolean.valueOf(z);
                            }
                        }
                        if ((uIBlock instanceof UIBlockVideoHide) && epx.f(((UIBlockVideoHide) uIBlock).Fb(), videoFile.r1())) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 17:
                gzs gzsVar = (gzs) obj2;
                int i8 = VideoNewProfileHeaderViewV2.y;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 18:
                c9t0 c9t0Var = (c9t0) obj;
                b1y b1yVar = ((o9t0) obj2).d;
                if (!(c9t0Var instanceof c9t0.c)) {
                    return w7t0.a.a;
                }
                Throwable th = ((c9t0.c) c9t0Var).d;
                b1yVar.getClass();
                Resources resources = (Resources) b1yVar.c;
                boolean z2 = th instanceof DeactivatedUserException;
                return new w7t0.b(resources.getString(z2 ? R.string.video_profile_user_doesnt_exist_title : R.string.video_profile_network_error_title), resources.getString(z2 ? R.string.video_profile_user_doesnt_exist_description : R.string.video_profile_network_error_message), !z2);
            case 19:
                VideoSnippetAutoPlayHolder videoSnippetAutoPlayHolder = (VideoSnippetAutoPlayHolder) obj2;
                Integer num = (Integer) obj;
                ?? q6 = videoSnippetAutoPlayHolder.q6();
                if (q6 != 0 && (r1 = videoSnippetAutoPlayHolder.s0) != 0) {
                    r1.a(num.intValue(), q6);
                }
                videoSnippetAutoPlayHolder.A0 = num;
                return s3q0.a;
            case 20:
                uut0 uut0Var = (uut0) obj2;
                md90 md90Var = (md90) obj;
                if (uut0Var.g) {
                    uut0Var.g = false;
                    uut0Var.i.removeCallbacksAndMessages(null);
                }
                k5t k5tVar = uut0Var.j;
                wc1 wc1Var = k5tVar.c;
                if (wc1Var != null) {
                    List<q4t> list = md90Var.a;
                    HashMap<wc1, md90> hashMap = k5tVar.b;
                    md90 md90Var2 = hashMap.get(wc1Var);
                    if (md90Var2 == null) {
                        md90Var2 = new md90(EmptyList.b, 0, 0);
                        hashMap.put(wc1Var, md90Var2);
                    }
                    List<q4t> list2 = md90Var2.a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(list2.size());
                    for (q4t q4tVar : list2) {
                        linkedHashMap.put(Long.valueOf(q4tVar.c()), q4tVar);
                    }
                    List<q4t> list3 = list;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(list3.size());
                    for (q4t q4tVar2 : list3) {
                        linkedHashMap2.put(Long.valueOf(q4tVar2.c()), q4tVar2);
                    }
                    List O0 = j5g.O0(pn00.n(linkedHashMap, linkedHashMap2).values());
                    int size = list3.isEmpty() ^ true ? md90Var.c : O0.size();
                    O0.size();
                    hashMap.put(wc1Var, new md90(O0, O0.size(), size));
                    uut0Var.a.a(k5tVar);
                    uut0Var.d.d(k5tVar.a());
                }
                return s3q0.a;
            case 21:
                VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) obj;
                Bundle arguments = ((ubu0) obj2).getArguments();
                VkAuthCredentials vkAuthCredentials2 = arguments != null ? (VkAuthCredentials) arguments.getParcelable("authCredentials") : null;
                return vkAuthCredentials2 == null ? vkAuthCredentials : vkAuthCredentials2;
            case 22:
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) obj2;
                int width = ((View) obj).getWidth();
                int i9 = eeu0.i;
                if (width >= i9) {
                    if (i9 > iah0.f().widthPixels) {
                        i9 = -1;
                    }
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    Window window = dVar.getWindow();
                    layoutParams.copyFrom(window != null ? window.getAttributes() : null);
                    layoutParams.width = i9;
                    Window window2 = dVar.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(layoutParams);
                    }
                }
                return s3q0.a;
            case 23:
                ((b.a) obj2).dispose();
                return s3q0.a;
            case 24:
                e8w0 e8w0Var = (e8w0) obj2;
                i8w0.a aVar5 = (i8w0.a) obj;
                e8w0.a aVar6 = e8w0Var.u;
                f6w0 f6w0Var = e8w0Var.t;
                View view = e8w0Var.h;
                ef90 ef90Var = e8w0Var.r;
                View view2 = e8w0Var.i;
                RecyclerView recyclerView = e8w0Var.m;
                aVar6.setItems(aVar5.d);
                e8w0Var.n.setRefreshing(aVar5.e);
                TextView textView = e8w0Var.k;
                textView.setText(aVar5.b.getName());
                TextView textView2 = e8w0Var.l;
                bwt0.p0(textView2, aVar5.c);
                if (bwt0.K(textView2)) {
                    textView.setTextSize(16.0f);
                } else {
                    textView.setTextSize(23.0f);
                }
                if (aVar5.a == CharacterContext.MY_CHARACTER) {
                    recyclerView.addOnScrollListener(ef90Var);
                    f4m.r(0, view);
                    view2.setVisibility(0);
                } else {
                    recyclerView.removeOnScrollListener(ef90Var);
                    f4m.r(cn70.b(4), view);
                    f4m.j(view2);
                }
                VmojiProductModel vmojiProductModel = aVar5.f;
                if (vmojiProductModel == null) {
                    f6w0Var.a(false);
                    f4m.v(0, recyclerView);
                } else {
                    f6w0Var.b(vmojiProductModel);
                    f4m.v(e8w0Var.s.getHeight(), recyclerView);
                }
                bwt0.i0(view2, new btl0(5, e8w0Var, aVar5));
                return s3q0.a;
            case 25:
                ((VmojiProductsFragment.b) obj2).invoke(o9w0.a.b);
                return s3q0.a;
            case 26:
                cdw0 cdw0Var = (cdw0) obj2;
                int i10 = cdw0.o1;
                adw0.a aVar7 = adw0.a.b;
                cdw0Var.getClass();
                xn50.a.c(cdw0Var, aVar7);
                return s3q0.a;
            case 27:
                ((zhw0) obj2).T(liw0.b);
                return s3q0.a;
            case 28:
                akw0 akw0Var = (akw0) obj2;
                hh8 b = akw0Var.c.b();
                b.getClass();
                hh8.a aVar8 = b instanceof hh8.a ? (hh8.a) b : null;
                if (aVar8 != null && (nt80Var = aVar8.f) != null) {
                    dfw0Var = nt80Var.a();
                }
                if (dfw0Var != null) {
                    akw0Var.i.c(dfw0Var);
                }
                return s3q0.a;
            default:
                VoipDataProvider voipDataProvider = (VoipDataProvider) obj2;
                voipDataProvider.getClass();
                return xa4.I(new io.reactivex.rxjava3.internal.operators.single.b(new qca0(new fgu0(z ? 1 : 0, voipDataProvider, (List) obj), 3)).q(voipDataProvider.k).m(voipDataProvider.d.b), 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        }
    }
}
