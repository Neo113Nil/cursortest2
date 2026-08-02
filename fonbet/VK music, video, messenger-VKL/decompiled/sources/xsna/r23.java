package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes11.dex */
public final class r23 implements Runnable {
    public final /* synthetic */ o23 b;

    /* compiled from: AppCompatDelegateImpl.java */
    public class a extends f0u0 {
        public a() {
        }

        @Override // xsna.f0u0, xsna.e0u0
        public final void a() {
            r23.this.b.w.setVisibility(0);
        }

        @Override // xsna.e0u0
        public final void b() {
            o23 o23Var = r23.this.b;
            o23Var.w.setAlpha(1.0f);
            o23Var.z.d(null);
            o23Var.z = null;
        }
    }

    public r23(o23 o23Var) {
        this.b = o23Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        o23 o23Var = this.b;
        o23Var.x.showAtLocation(o23Var.w, 55, 0, 0);
        b0u0 b0u0Var = o23Var.z;
        if (b0u0Var != null) {
            b0u0Var.b();
        }
        if (!o23Var.B || (viewGroup = o23Var.C) == null || !viewGroup.isLaidOut()) {
            o23Var.w.setAlpha(1.0f);
            o23Var.w.setVisibility(0);
            return;
        }
        o23Var.w.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b0u0 b = iut0.b(o23Var.w);
        b.a(1.0f);
        o23Var.z = b;
        b.d(new a());
    }
}
