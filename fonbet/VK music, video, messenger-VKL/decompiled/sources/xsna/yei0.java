package xsna;

import android.util.Size;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.design.view.play.PlayButton;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.video.profile.di.VideoProfileNavigationComponentImpl;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import xsna.huw0;
import xsna.mp90;
import xsna.swj0;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class yei0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yei0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ovj mainDispatcher;
        GetAsyncHeaderBiddingToken initialize$lambda$220$lambda$180;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                afi0 afi0Var = (afi0) obj;
                afi0Var.t.a();
                afi0Var.j(false);
                return s3q0.a;
            case 1:
                mainDispatcher = ((UnityAdsModule) obj).mainDispatcher();
                return mainDispatcher;
            case 2:
                initialize$lambda$220$lambda$180 = ServiceProvider.initialize$lambda$220$lambda$180((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$180;
            case 3:
                ((swj0) obj).b7(swj0.a.b.a);
                return s3q0.a;
            case 4:
                int i2 = StickyMusicPlayerBottomSheet.c0;
                return new jw40(((PlayerUIComponent) ((k7m) m7m.c((StickyMusicPlayerBottomSheet) obj)).a(fpf0.a(PlayerUIComponent.class))).a3());
            case 5:
                return ((vx70.b) obj).c();
            case 6:
                mmo0 mmo0Var = (mmo0) obj;
                mmo0Var.B = null;
                itl.f(mmo0Var).R();
                itl.f(mmo0Var).Q();
                mio.a(mmo0Var);
                return Boolean.TRUE;
            case 7:
                float f = 36;
                ((SwipeDrawableRefreshLayout) obj).s(-iah0.a(f), iah0.a(f));
                return s3q0.a;
            case 8:
                return ((pzp0) obj).k;
            case 9:
                return "getAndRemoveBySessionKey(sessionKey: " + ((xti0) obj) + ")";
            case 10:
                ((qvl0) obj).getClass();
                return s3q0.a;
            case 11:
                return ((mtq0) obj).itemView.getContext().getString(R.string.postponed_posts_title_short);
            case 12:
                return ((ClipActionsComponent) ((k7m) m7m.f((mxq0) obj)).mo408a(fpf0.a(ClipActionsComponent.class))).q5();
            case 13:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((jpr0) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).K2();
            case 14:
                ((ovr0) obj).l.d();
                return s3q0.a;
            case 15:
                gzs<s3q0> gzsVar = ((VideoCatalogRootVh) obj).t;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 16:
                return ((vcs0) obj).a.b();
            case 17:
                cms0 cms0Var = (cms0) obj;
                return new Size(cms0Var.e, cms0Var.f);
            case 18:
                ((vos0) obj).a = false;
                return s3q0.a;
            case 19:
                ((cys0) obj).b0.invoke(a.b0.b);
                return s3q0.a;
            case 20:
                wh50 wh50Var = (wh50) obj;
                if (((g5t0) wh50Var.getValue()).d) {
                    ((g5t0) wh50Var.getValue()).f.invoke(a.d.a);
                } else if (((g5t0) wh50Var.getValue()).c) {
                    ((g5t0) wh50Var.getValue()).f.invoke(a.b.a);
                }
                return s3q0.a;
            case 21:
                return ((AuthBridgeComponent) ((VideoProfileNavigationComponentImpl) obj).c.getValue()).s();
            case 22:
                dat0 dat0Var = (dat0) obj;
                dat0Var.b = null;
                dat0Var.f.Qc("video_quality");
                return s3q0.a;
            case 23:
                return (PlayButton) ((zct0) obj).findViewById(R.id.video_replay);
            case 24:
                return ((kkt0) obj).c.a5();
            case 25:
                qcy<Object>[] qcyVarArr = VideoUploadVh.w;
                fxc0.B().E().a(((VideoUploadVh) obj).v);
                return s3q0.a;
            case 26:
                ((VkTopBarVh) obj).c.b(new VkTopBarVh.b(), true);
                return s3q0.a;
            case 27:
                return new j3x0(((tnw0) obj).a);
            case 28:
                ((huw0.a) obj).l.a(mp90.c.b.a);
                return s3q0.a;
            default:
                return Boolean.valueOf(((r4x0) obj).e());
        }
    }
}
