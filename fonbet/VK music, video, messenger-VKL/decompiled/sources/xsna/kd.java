package xsna;

import android.content.Context;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderShowAllVh;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.design.view.nps.internal.stars.FeedbackResult;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridUploadListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.text.VkText;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albums.presentation.AlbumsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.configure.ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1;
import xsna.j9d0;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Boolean bool;
        am9 K3;
        int i = this.b;
        boolean z = true;
        AppChannelFragment.b bVar = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AbstractClipsGridUploadListFragment.i0;
                return ((ClipsUploadVkComponent) m7m.d((AbstractClipsGridUploadListFragment) obj).a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
            case 1:
                ((b11) obj).b.a(xz0.b);
                return s3q0.a;
            case 2:
                int i3 = AlbumDetailsFragment.p0;
                return Boolean.valueOf(((AlbumDetailsFragment) obj).requireArguments().getBoolean("EDIT_MODE_KEY", false));
            case 3:
                int i4 = AlbumsFragment.j0;
                return ((PhotosComponent) ((AlbumsFragment) obj).T.getValue()).p7().a();
            case 4:
                AppChannelFragment appChannelFragment = (AppChannelFragment) obj;
                int i5 = AppChannelFragment.l1;
                lxa lo = appChannelFragment.lo();
                a3b a3bVar = (a3b) appChannelFragment.H0.getValue();
                com.vk.im.popup.a aVar = (com.vk.im.popup.a) appChannelFragment.t0.getValue();
                ucb vo = appChannelFragment.vo();
                io.reactivex.rxjava3.disposables.b bVar2 = appChannelFragment.p0;
                kkm wo = appChannelFragment.wo();
                q7v0 p3 = ((VkOnboardingComponent) m7m.d(appChannelFragment).a(fpf0.a(VkOnboardingComponent.class))).p3();
                PhotoEditorComponent photoEditorComponent = (PhotoEditorComponent) m7m.d(appChannelFragment).a(fpf0.a(PhotoEditorComponent.class));
                long mo = appChannelFragment.mo();
                boolean isPostponed = appChannelFragment.isPostponed();
                ImFeatures imFeatures = ImFeatures.BLUR_POST;
                imFeatures.getClass();
                boolean a = com.vk.toggle.b.A.a(imFeatures);
                Channel b = appChannelFragment.lo().b();
                boolean z2 = b != null ? b.E : false;
                Channel b2 = appChannelFragment.lo().b();
                boolean z3 = b2 != null ? b2.M : false;
                Channel b3 = appChannelFragment.lo().b();
                if (b3 != null && (bool = b3.H) != null) {
                    z = bool.booleanValue();
                }
                boolean z4 = z;
                Channel b4 = appChannelFragment.lo().b();
                ChannelMsgSendState channelMsgSendState = new ChannelMsgSendState(isPostponed, false, a, z2, z3, z4, false, b4 != null ? b4.z : null, 66, null);
                if (appChannelFragment.isPostponed()) {
                    AppChannelFragment.b bVar3 = new AppChannelFragment.b(0, appChannelFragment, AppChannelFragment.class, "loadMessagesWithShimmer", "loadMessagesWithShimmer()V", 0);
                    appChannelFragment = appChannelFragment;
                    bVar = bVar3;
                }
                return new rbb(appChannelFragment, appChannelFragment, a3bVar, lo, aVar, vo, bVar2, wo, p3, photoEditorComponent, appChannelFragment, mo, channelMsgSendState, bVar, (q8b) appChannelFragment.c1.getValue(), ((StoryViewerComponent) m7m.d(appChannelFragment).a(fpf0.a(StoryViewerComponent.class))).tb(), (r920) appChannelFragment.M0.getValue(), appChannelFragment);
            case 5:
                int i6 = ArchiveFragment.e0;
                return ((ArchiveFragment) obj).fo().p7().a();
            case 6:
                return (ClipsViewerComponent) ((e7m) obj).a(fpf0.a(ClipsViewerComponent.class));
            case 7:
                yj40 yj40Var = (yj40) obj;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(yj40Var);
                return s3q0.a;
            case 8:
                int i7 = nh4.n1;
                return ((AudioModelsComponent) m7m.d((nh4) obj).a(fpf0.a(AudioModelsComponent.class))).r();
            case 9:
                return ((AutoSuggestStickersPopupWindow) obj).q;
            case 10:
                return ((MusicPrefsComponent) ((k7m) m7m.f((pw5) obj)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 11:
                j96 j96Var = (j96) obj;
                return new bmo0(j96Var.b, j96Var.b());
            case 12:
                izs<? super FeedbackResult, s3q0> izsVar = ((zn6) obj).g;
                if (izsVar != null) {
                    izsVar.invoke(FeedbackResult.STAR_4);
                }
                return s3q0.a;
            case 13:
                ((z89) obj).e(j9d0.a.a);
                return s3q0.a;
            case 14:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                bm9 presenter = cameraUIView.getPresenter();
                if (presenter != null && (K3 = presenter.K3()) != null) {
                    Context context = cameraUIView.getContext();
                    StoryPublishEvent storyPublishEvent = StoryPublishEvent.CAMERA_ACCESS_DENIED;
                    bm9 presenter2 = cameraUIView.getPresenter();
                    K3.e(context, storyPublishEvent, presenter2 != null ? presenter2.c4() : null);
                }
                cameraUIView.M(true);
                return s3q0.a;
            case 15:
                pua puaVar = (pua) obj;
                puaVar.e.k().y(puaVar.b, 389490);
                return s3q0.a;
            case 16:
                int i8 = ChannelFragment.a1;
                return ((ImCmdRxExecutorComponent) m7m.d((ChannelFragment) obj).a(fpf0.a(ImCmdRxExecutorComponent.class))).g();
            case 17:
                ((ChatFragment) obj).P.j.getClass();
                return new xwv();
            case 18:
                return (v8s) ((mtk0) obj).getValue();
            case 19:
                ClipsDraftComponentBase clipsDraftComponentBase = (ClipsDraftComponentBase) obj;
                ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1 clipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1 = (ClipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1) clipsDraftComponentBase;
                return new lud(clipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1.e, (xke) clipsRegisterComponentFactoriesKt$createSdkDraftsComponentFactory$1$createComponent$1.f.a, (qxn0) clipsDraftComponentBase.c.getValue());
            case 20:
                eyd eydVar = (eyd) obj;
                return new o0e(eydVar.c, eydVar.d, eydVar.b);
            case 21:
                qcy<Object>[] qcyVarArr = ClipsEntryPointsComponentImpl.f;
                return ((ClipsBlacklistsComponent) obj).f4();
            case 22:
                int i9 = ClipsFavoriteFoldersListFragment.U;
                return new m3e(new ClipsFavoriteFoldersListFragment.b(1, (ClipsFavoriteFoldersListFragment) obj, ClipsFavoriteFoldersListFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
            case 23:
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                return (ClipsViewerComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(ClipsViewerComponent.class));
            case 24:
                ((nuf) obj).invoke();
                return s3q0.a;
            case 25:
                gzs<s3q0> gzsVar = ((w9g) obj).N;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return Boolean.TRUE;
            case 26:
                return (VkText) ((cxg) obj).findViewById(R.id.caption);
            case 27:
                return ((LinksBridgeComponent) m7m.d(((o1i) obj).b).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 28:
                ComposeHeaderShowAllVh composeHeaderShowAllVh = (ComposeHeaderShowAllVh) obj;
                qcy<Object>[] qcyVarArr3 = ComposeHeaderShowAllVh.x;
                if (!jjc.d().a()) {
                    qcy<Object>[] qcyVarArr4 = ComposeHeaderShowAllVh.x;
                    composeHeaderShowAllVh.b(ClickType.SHOW_ALL);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            default:
                i1j i1jVar = (i1j) obj;
                VkSearchView vkSearchView = (VkSearchView) i1jVar.c.findViewById(R.id.voip_room_participant_search);
                vkSearchView.X4(false);
                i1jVar.d.e.b(new io.reactivex.rxjava3.internal.operators.observable.y(d02.y(vkSearchView, 200L, 2).U(new q9(new cj1(17), 4)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new is1(new r9(i1jVar, 27), 16)));
                return vkSearchView;
        }
    }
}
