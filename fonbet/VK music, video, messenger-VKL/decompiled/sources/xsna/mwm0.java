package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.a;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.video.profile.di.VideoProfileNavigationComponentImpl;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import xsna.b78;
import xsna.crq0;
import xsna.s1c0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mwm0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mwm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        gvw0 gvw0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((izs) ((zak0) ((nwm0) obj).f).getValue()).invoke(new CommunityProfileAction.e.i.a(true));
                return s3q0.a;
            case 1:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 2:
                ((pwn0) obj).onClose();
                return s3q0.a;
            case 3:
                ((qvl0) obj).onStart();
                return s3q0.a;
            case 4:
                throw null;
            case 5:
                return ((mtq0) obj).itemView.getContext().getString(R.string.drafts_posts_title_short);
            case 6:
                mxq0 mxq0Var = (mxq0) obj;
                s1c0.a aVar = new s1c0.a();
                aVar.x = true;
                aVar.b = true;
                aVar.n = false;
                aVar.o = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = mxq0Var.n.d.mo2getContext();
                aVar.s = sf2Var.a();
                aVar.t = BuildInfo.r();
                aVar.p = mxq0Var.d == WallGetMode.MAIN;
                return aVar.a();
            case 7:
                Context requireContext = ((jpr0) obj).b.getRequireContext();
                asu0.a.getClass();
                return new zdh0(asu0.n(), requireContext);
            case 8:
                int i2 = VideoCatalogRootVh.M0;
                rwi.d().d().a((Activity) obj);
                return s3q0.a;
            case 9:
                ((vos0) obj).a = true;
                return s3q0.a;
            case 10:
                VideoMinimizableDiscoveryFragment.b bVar = ((VideoMinimizableDiscoveryFragment) obj).U;
                return (bVar != null ? bVar : null).b.g.f;
            case 11:
                ((cys0) obj).b0.invoke(a.c0.b);
                return s3q0.a;
            case 12:
                ((g5t0) ((wh50) obj).getValue()).f.invoke(a.C0514a.a);
                return s3q0.a;
            case 13:
                return ((VideoProfileNavigationComponentImpl) obj).a.x9();
            case 14:
                ((dat0) obj).f.Ff("video_quality");
                return s3q0.a;
            case 15:
                return ((kkt0) obj).c.p9();
            case 16:
                qcy<Object>[] qcyVarArr = VideoUploadVh.w;
                ((VideoUploadVh) obj).g();
                return s3q0.a;
            case 17:
                b5u0 b5u0Var = (b5u0) obj;
                ValueAnimator valueAnimator = b5u0Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                b5u0Var.d = null;
                bwt0.p0(b5u0Var.b, false);
                return s3q0.a;
            case 18:
                ((b78.a) obj).a().invoke(new sx40.a.d(PlayerContext.MINI));
                return s3q0.a;
            case 19:
                return new bhg(((reu0) obj).a.Mb());
            case 20:
                return (zia) ((xhu0) obj).b.getValue();
            case 21:
                ((mjw0) obj).f(true);
                return s3q0.a;
            case 22:
                int i3 = ylw0.x1;
                return ((VoipCallComponent) m7m.d((ylw0) obj).a(fpf0.a(VoipCallComponent.class))).L1();
            case 23:
                tnw0 tnw0Var = (tnw0) obj;
                com.vk.voip.ui.c cVar = tnw0Var.a;
                FragmentImpl invoke = tnw0Var.b.invoke();
                FragmentActivity kn = invoke.kn();
                evw0 evw0Var = kn instanceof evw0 ? (evw0) kn : null;
                if (evw0Var == null || (gvw0Var = evw0Var.getPermissions()) == null) {
                    gvw0Var = new gvw0(invoke.requireContext(), new ivw0());
                }
                return new k3x0(cVar, gvw0Var);
            case 24:
                return Boolean.valueOf(((r4x0) obj).h());
            case 25:
                ((r8r0) obj).invoke();
                return s3q0.a;
            default:
                return new qwm0(((knx0) obj).a);
        }
    }

    public /* synthetic */ mwm0(crq0.a aVar, crq0.b bVar) {
        this.b = 4;
        this.c = aVar;
    }
}
