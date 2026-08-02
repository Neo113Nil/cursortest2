package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.ProgressView;
import com.vk.writebar.WriteBar;
import java.util.Timer;
import kotlin.LazyThreadSafetyMode;

/* compiled from: WriteBarCommentHolder.kt */
/* loaded from: classes7.dex */
public final class y0y0 {
    public final WriteBar a;
    public final com.vk.writebar.c b;
    public final WriteBar c;
    public z0y0 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new uhs0(this, 13));
    public final bpn0 f = new bpn0(new tfm0(this, 29));
    public final bpn0 g = new bpn0(new hvr0(this, 22));
    public final bpn0 h = new bpn0(new guw0(this, 3));
    public final bpn0 i = new bpn0(new dtv0(this, 6));
    public final bpn0 j = new bpn0(new w0y0(this, 0));
    public Timer k;
    public x0y0 l;

    public y0y0(WriteBar writeBar, com.vk.writebar.c cVar, WriteBar writeBar2) {
        this.a = writeBar;
        this.b = cVar;
        this.c = writeBar2;
    }

    public final ProgressView a() {
        return (ProgressView) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        this.e.getValue();
        jjc.g(a(), new cim0(this, 21));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean c(String str) {
        z0y0 z0y0Var;
        Timer timer = this.k;
        if (timer == null) {
            return false;
        }
        timer.cancel();
        this.k = null;
        this.l = null;
        ValueAnimator valueAnimator = a().y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        a().setVisibility(8);
        if (this.e.isInitialized()) {
            ((ViewGroup) this.f.getValue()).setVisibility(8);
        }
        d();
        WriteBar writeBar = this.c;
        writeBar.J(true);
        ProgressView a = a();
        j6r0.a(a);
        a.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a.setScaleX(0.1f);
        a.setScaleY(0.1f);
        a.setVisibility(4);
        if (str != null && (z0y0Var = this.d) != null) {
            z0y0Var.b(str);
        }
        writeBar.setAddAttachAllowed(true);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void d() {
        if (this.e.isInitialized()) {
            com.vk.writebar.c cVar = this.b;
            boolean z = false;
            boolean z2 = cVar.h.isInitialized() && cVar.c().getVisibility() == 0;
            View view = (View) this.i.getValue();
            if (f4m.h((ViewGroup) this.f.getValue()) && (z2 || this.c.getState().g != 0)) {
                z = true;
            }
            awt0.v(view, z);
        }
    }
}
