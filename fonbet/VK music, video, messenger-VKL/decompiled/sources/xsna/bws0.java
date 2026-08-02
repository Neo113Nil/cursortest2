package xsna;

import android.content.Context;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayoutWithFixedTouches;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.nb30;

/* compiled from: VideoMinimizableDiscoveryMotionStatesManager.kt */
/* loaded from: classes7.dex */
public final class bws0 implements bb30 {
    public final /* synthetic */ com.vk.video.ui.discovery.minimizable.m b;

    public bws0(com.vk.video.ui.discovery.minimizable.m mVar) {
        this.b = mVar;
    }

    @Override // xsna.bb30
    public final void a(nb30 nb30Var) {
        L.e(this, "onTransitionCompleted", nb30Var);
        com.vk.video.ui.discovery.minimizable.m mVar = this.b;
        ArrayList arrayList = mVar.y;
        mVar.o(nb30Var);
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait = DiscoveryScreenMotionStates$Portrait.DiscoveryWithDialogUnderVideo;
        if (nb30Var != discoveryScreenMotionStates$Portrait && nb30Var != DiscoveryScreenMotionStates$Portrait.DialogFullscreen) {
            mVar.v = false;
        }
        if (nb30Var == DiscoveryScreenMotionStates$Portrait.Fullscreen) {
            mVar.u = true;
        } else if (nb30Var == DiscoveryScreenMotionStates$Landscape.Fullscreen) {
            Context context = mVar.a;
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                mVar.u = true;
            }
        } else if (nb30Var == DiscoveryScreenMotionStates$Portrait.Hidden || nb30Var == DiscoveryScreenMotionStates$Landscape.Hidden || nb30Var == DiscoveryScreenMotionStates$Portrait.Miniplayer || nb30Var == DiscoveryScreenMotionStates$Landscape.Miniplayer || nb30Var == DiscoveryScreenMotionStates$Portrait.Discovery || nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio || nb30Var == DiscoveryScreenMotionStates$Landscape.Discovery || nb30Var == DiscoveryScreenMotionStates$Landscape.DiscoveryWithDialog) {
            mVar.u = false;
        } else if (nb30Var == discoveryScreenMotionStates$Portrait || nb30Var == DiscoveryScreenMotionStates$Portrait.DialogFullscreen) {
            mVar.u = mVar.v;
        }
        if (!mVar.i()) {
            mVar.w = false;
        }
        if (nb30Var == DiscoveryScreenMotionStates$Portrait.Discovery) {
            mVar.x = false;
        } else if (nb30Var == DiscoveryScreenMotionStates$Portrait.DiscoveryMatchVideoRatio) {
            mVar.x = true;
        }
        mVar.p();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((gzs) it.next()).invoke();
        }
        arrayList.clear();
    }

    @Override // xsna.bb30
    public final void b(nb30 nb30Var, nb30 nb30Var2) {
        nb30 c = this.b.c();
        c(nb30Var, nb30Var2, (epx.f(c, nb30Var) || epx.f(c, nb30.a.b)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }

    @Override // xsna.bb30
    public final void c(nb30 nb30Var, nb30 nb30Var2, float f) {
        Interpolator d;
        L.e(this, "onTransitionProgressChanged", nb30Var, nb30Var2, Float.valueOf(f));
        nb30.a.C3393a c3393a = nb30.a.a;
        if (nb30Var.equals(c3393a) || nb30Var2.equals(c3393a)) {
            return;
        }
        nb30.a.b bVar = nb30.a.b;
        if (nb30Var.equals(bVar) || nb30Var2.equals(bVar)) {
            return;
        }
        com.vk.video.ui.discovery.minimizable.m mVar = this.b;
        VideoMinimizableState f2 = mVar.f(nb30Var);
        VideoMinimizableState f3 = mVar.f(nb30Var2);
        if (epx.f(f2, f3)) {
            return;
        }
        of ofVar = mVar.c;
        if ((ofVar instanceof MotionLayoutWithFixedTouches) && (d = ((MotionLayoutWithFixedTouches) ofVar).getScene().d()) != null) {
            f = d.getInterpolation(f);
        }
        VideoMinimizableState.Animating animating = new VideoMinimizableState.Animating(f2, f3, f);
        mVar.q = animating;
        mVar.h.invoke(animating, mVar.p);
    }

    @Override // xsna.bb30
    public final void d(nb30 nb30Var, nb30 nb30Var2) {
        nb30 c = this.b.c();
        c(nb30Var, nb30Var2, (epx.f(c, nb30Var) || epx.f(c, nb30.a.b)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
    }
}
