package xsna;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stickers.settings.StickerSettingsFeature;
import com.vk.stickers.settings.c;
import com.vk.stories.design.view.stats.tabs.recycler.TabRecyclerPaginatedView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.f;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.d;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vk.video.profile.di.VideoProfileComponent;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.JsonElement;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dug0;
import xsna.jw00;
import xsna.kkl0;
import xsna.lgs0;
import xsna.mjw0;
import xsna.p7w0;
import xsna.x7j0;
import xsna.xcw0;
import xsna.yfs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class j6l0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j6l0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50, types: [T, kotlinx.serialization.json.JsonElement] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [xsna.ikt0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoFile videoFile;
        VideoFile videoFile2;
        qhj0 qhj0Var;
        int i = this.b;
        int i2 = 5;
        int i3 = 8;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                StickerSettingsFeature stickerSettingsFeature = (StickerSettingsFeature) obj2;
                com.vk.stickers.settings.a aVar = stickerSettingsFeature.g;
                stickerSettingsFeature.T(new c.d(aVar.c.F(), aVar.c.R()));
                return s3q0.a;
            case 1:
                gpl0 gpl0Var = (gpl0) obj2;
                nn50<State, TaskId, OutTask, Patch, Event> nn50Var = gpl0Var.b;
                Map map = (Map) obj;
                jw00 jw00Var = (jw00) map.get(jw00.a.c);
                int a = jw00Var != null ? jw00Var.a() : ((ukl0) nn50Var.getCurrentState()).f.c;
                jw00 jw00Var2 = (jw00) map.get(jw00.c.c);
                gpl0Var.e(new kkl0.a(a, jw00Var2 != null ? jw00Var2.a() : ((ukl0) nn50Var.getCurrentState()).f.d));
                return s3q0.a;
            case 2:
                KeyEvent.Callback childAt = ((ViewGroup) obj2).getChildAt(((Integer) obj).intValue());
                if (childAt instanceof y8m0) {
                    return (y8m0) childAt;
                }
                return null;
            case 3:
                zjm0 zjm0Var = (zjm0) obj2;
                Iterator it = ((Iterable) ((Map.Entry) obj).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((IPersistingStoryUpload) next).V7().a == zjm0Var.a) {
                            r5 = next;
                        }
                    }
                }
                return Boolean.valueOf(r5 != null);
            case 4:
                ((Ref$FloatRef) obj2).element = ((Float) obj).floatValue();
                return s3q0.a;
            case 5:
                ((tdm0) obj2).l.invoke(x7j0.d.b);
                return s3q0.a;
            case 6:
                ((com.vk.stories.design.view.stats.tabs.stickers.mvi.b) obj2).T(new f.a.b((Poll) obj));
                return s3q0.a;
            case 7:
                com.vk.stories.design.view.stats.tabs.viewers.mvi.d dVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.d) obj2;
                StoryStatisticsViewersViewState.g gVar = (StoryStatisticsViewersViewState.g) obj;
                View view = dVar.f;
                bwt0.p0(view, false);
                TabRecyclerPaginatedView tabRecyclerPaginatedView = dVar.e;
                bwt0.p0(tabRecyclerPaginatedView, true);
                int i4 = d.a.$EnumSwitchMapping$0[gVar.a.ordinal()];
                if (i4 == 1) {
                    tabRecyclerPaginatedView.z();
                } else if (i4 == 2) {
                    tabRecyclerPaginatedView.D();
                } else if (i4 == 3) {
                    bwt0.p0(view, true);
                    bwt0.p0(tabRecyclerPaginatedView, false);
                } else if (i4 == 4) {
                    tabRecyclerPaginatedView.x();
                } else {
                    if (i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tabRecyclerPaginatedView.C();
                }
                StoryStatisticsViewersViewState.b bVar = gVar.b;
                if (bVar instanceof StoryStatisticsViewersViewState.b.C1819b) {
                    tabRecyclerPaginatedView.B();
                } else if (bVar instanceof StoryStatisticsViewersViewState.b.a) {
                    tabRecyclerPaginatedView.A();
                } else {
                    tabRecyclerPaginatedView.j();
                }
                return s3q0.a;
            case 8:
                ((rg50) obj2).C(((Integer) obj).intValue());
                return s3q0.a;
            case 9:
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                com.vk.im.ui.components.theme_chooser.a aVar2 = ((com.vk.im.ui.components.theme_chooser.b) obj2).o;
                aVar2.getClass();
                if (themeChooserState.b()) {
                    ThemeChooserState themeChooserState2 = aVar2.a;
                    return ThemeChooserState.a(themeChooserState, null, themeChooserState2.b, themeChooserState2.c, themeChooserState2.d, false, null, null, null, 241);
                }
                ThemeChooserState themeChooserState3 = aVar2.b;
                return ThemeChooserState.a(themeChooserState, null, themeChooserState3.b, themeChooserState3.c, themeChooserState3.d, false, null, null, null, 241);
            case 10:
                ((Ref$ObjectRef) obj2).element = (JsonElement) obj;
                return s3q0.a;
            case 11:
                ((niq0) obj2).C(new hiq0((ExtendedUserProfile) obj));
                return s3q0.a;
            case 12:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.vk.profile.user.impl.ui.i iVar = ((UserProfileFragment) obj2).Q;
                (iVar != null ? iVar : null).g.setRefreshing(booleanValue);
                return s3q0.a;
            case 13:
                return new Pair((bwq0) obj, Boolean.valueOf(!((WallWithCounters) obj2).isEmpty()));
            case 14:
                int i5 = UsersDiscoverFragment.t0;
                ((UsersDiscoverFragment) obj2).a0();
                return s3q0.a;
            case 15:
                ((nrr0) obj2).l.y();
                return s3q0.a;
            case 16:
                tvr0 tvr0Var = (tvr0) obj2;
                T t = tvr0Var.l;
                izs<? super com.vk.voip.ui.settings.participants_view.j, s3q0> izsVar = tvr0Var.m;
                if (t != 0 && izsVar != null) {
                    izsVar.invoke(new j.g(((CallSettingsItem.i) t).a));
                }
                return s3q0.a;
            case 17:
                tgi0 tgi0Var = (tgi0) obj;
                int i6 = VideoAlbumEditorFragment.l0;
                qgi0.h(tgi0Var, ((VideoAlbumEditorFragment) obj2).getString(R.string.accessibility_toolbar_back));
                qgi0.r(tgi0Var, "edit_cancel_button");
                return s3q0.a;
            case 18:
                com.vk.video.ui.discovery.minimizable.g gVar2 = (com.vk.video.ui.discovery.minimizable.g) obj2;
                Optional optional = (Optional) obj;
                io.reactivex.rxjava3.subjects.d<lgs0> dVar2 = gVar2.d0;
                io.reactivex.rxjava3.subjects.d<yfs0> dVar3 = gVar2.e0;
                lgs0 P0 = dVar2.P0();
                if ((P0 instanceof lgs0.a) && (videoFile2 = (VideoFile) optional.orElse(null)) != null) {
                    dVar2.onNext(lgs0.a.h((lgs0.a) P0, videoFile2));
                }
                yfs0 P02 = dVar3.P0();
                if ((P02 instanceof yfs0.a) && (videoFile = (VideoFile) optional.orElse(null)) != null) {
                    dVar3.onNext(yfs0.a.h((yfs0.a) P02, videoFile, null, 62));
                }
                return s3q0.a;
            case 19:
                return (VideoProfileComponent) ((g8m) obj2).b(fpf0.a(VideoProfileComponent.class), new l7t0((UserId) obj));
            case 20:
                ((edt0) obj2).d = null;
                return s3q0.a;
            case 21:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj2;
                int i7 = VideoSeekPreviewImage.G;
                return qVar;
            case 22:
                final kkt0 kkt0Var = (kkt0) obj2;
                dug0.c cVar = (dug0.c) obj;
                if (cVar.d()) {
                    kkt0Var.i.o(cVar.b * kkt0Var.b.f);
                } else if (cVar.c()) {
                    kkt0Var.j = ((lkt0) kkt0Var.g.getValue()).b(cVar.c, new o7j() { // from class: xsna.ikt0
                        @Override // xsna.o7j
                        public final void accept(Object obj3) {
                            final float floatValue = ((Float) obj3).floatValue();
                            final kkt0 kkt0Var2 = kkt0.this;
                            i0q0.f(new gzs() { // from class: xsna.jkt0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    kkt0 kkt0Var3 = kkt0.this;
                                    if (kkt0Var3.b.e) {
                                        kkt0Var3.i.o((floatValue / 2) + 0.5f);
                                    }
                                    return s3q0.a;
                                }
                            });
                        }
                    }).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oo20(new qjm0(kkt0Var, i3), 29));
                }
                return s3q0.a;
            case 23:
                yau0 yau0Var = (yau0) obj2;
                yau0Var.d = true;
                fvv0 fvv0Var = yau0Var.b;
                tau0 d = fvv0Var.d();
                if (d != null) {
                    d.g("mini_app_vk_connect_launch_screen_permissions_accepted", MiniAppPolicyScreenEventType.VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED);
                }
                ux90 T = fvv0Var.T();
                T.b.b(T.c().subscribe(new qg60(new rop(T, 28), i2), new m3y(new m8(xgx0.a, 8), i3)));
                yau0Var.c.w(false);
                return s3q0.a;
            case 24:
                ((reu0) obj2).a.a(0, 8, 8);
                return s3q0.a;
            case 25:
                aru0 aru0Var = (aru0) obj;
                nxp nxpVar = ((yqu0) obj2).c;
                Uri.Builder buildUpon = Uri.parse(nxpVar.c).buildUpon();
                String str = nxpVar.b;
                Uri a2 = nxpVar.a();
                buildUpon.appendQueryParameter("client_id", str);
                buildUpon.appendQueryParameter("redirect_uri", a2.toString());
                buildUpon.appendQueryParameter(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, aru0Var.b);
                buildUpon.appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "code");
                buildUpon.appendQueryParameter("state", aru0Var.c);
                buildUpon.appendQueryParameter(SharedKt.PARAM_CLIENT_SECRET, aru0Var.d);
                buildUpon.appendQueryParameter("timestamp", aru0Var.a);
                buildUpon.appendQueryParameter("external_client_id", str);
                String str2 = aru0Var.e;
                if (str2 != null) {
                    buildUpon.appendQueryParameter(SignalingProtocol.KEY_PERMISSIONS, str2);
                }
                buildUpon.appendQueryParameter("access_type", eok.ONLINE_EXTRAS_KEY);
                return buildUpon.build();
            case 26:
                v2v0 v2v0Var = (v2v0) ((a3v0) obj2).a;
                if (v2v0Var != null) {
                    v2v0Var.S4();
                }
                return s3q0.a;
            case 27:
                ((m6w0) obj2).T(new p7w0.d.a((Throwable) obj));
                return s3q0.a;
            case 28:
                xcw0 xcw0Var = (xcw0) obj;
                ((lcw0) obj2).getClass();
                return Boolean.valueOf((xcw0Var instanceof xcw0.y) || (xcw0Var instanceof xcw0.v) || (xcw0Var instanceof xcw0.p) || (xcw0Var instanceof xcw0.q) || (xcw0Var instanceof xcw0.o) || (xcw0Var instanceof xcw0.s) || (xcw0Var instanceof xcw0.d) || (xcw0Var instanceof xcw0.b) || (xcw0Var instanceof xcw0.b0) || (xcw0Var instanceof xcw0.f0) || (xcw0Var instanceof xcw0.u) || (xcw0Var instanceof xcw0.l0));
            default:
                mjw0 mjw0Var = (mjw0) obj2;
                qhj0 qhj0Var2 = mjw0Var.e;
                qhj0 qhj0Var3 = mjw0Var.f;
                List<iew0> list = (List) obj;
                GroupCallViewModel.b.getClass();
                int i8 = mjw0.b.$EnumSwitchMapping$0[GroupCallViewModel.e.ordinal()];
                if (i8 == 1) {
                    qhj0Var = qhj0Var2;
                } else {
                    if (i8 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qhj0Var = qhj0Var3;
                }
                if (list.isEmpty()) {
                    qhj0Var2.y3(list);
                    qhj0Var3.y3(list);
                }
                qhj0Var.y3(list);
                return s3q0.a;
        }
    }
}
