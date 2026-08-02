package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.dak0;
import xsna.wlp0;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class vq90 extends m7e0<List<? extends qq90>> {

    /* compiled from: Transition.kt */
    public static final class a implements gzs<Boolean> {
        public final /* synthetic */ wlp0 b;

        public a(wlp0 wlp0Var) {
            this.b = wlp0Var;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // xsna.gzs
        public final Boolean invoke() {
            return ((zak0) this.b.d).getValue();
        }
    }

    /* compiled from: Transition.kt */
    public static final class b implements gzs<wlp0.b<Boolean>> {
        public final /* synthetic */ wlp0 b;

        public b(wlp0 wlp0Var) {
            this.b = wlp0Var;
        }

        @Override // xsna.gzs
        public final wlp0.b<Boolean> invoke() {
            return this.b.e();
        }
    }

    @Override // xsna.m7e0
    public final mtk0<List<? extends qq90>> a(wlp0<Boolean> wlp0Var, String str, int i, androidx.compose.runtime.a aVar, int i2) {
        Object B;
        aVar.K(119461169);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(119461169, i2, -1, "androidx.compose.animation.graphics.vector.PathPropertyValues.createState (Animator.kt:228)");
        }
        int i3 = ((i2 << 3) & 896) | (i2 & 14);
        jtp0 jtp0Var = rte0.e;
        int i4 = ((i3 << 3) & 7168) | (i3 & 14);
        boolean g = wlp0Var.g();
        z46 z46Var = wlp0Var.a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (g) {
            aVar.K(1666827533);
            aVar.j();
            B = z46Var.B();
        } else {
            aVar.K(1666573488);
            boolean z = (((i4 & 14) ^ 6) > 4 && aVar.J(wlp0Var)) || (i4 & 6) == 4;
            B = aVar.x();
            if (z || B == c0012a) {
                dak0 a2 = dak0.a.a();
                izs<Object, s3q0> e = a2 != null ? a2.e() : null;
                dak0 b2 = dak0.a.b(a2);
                try {
                    Object B2 = z46Var.B();
                    dak0.a.d(a2, b2, e);
                    aVar.R(B2);
                    B = B2;
                } catch (Throwable th) {
                    dak0.a.d(a2, b2, e);
                    throw th;
                }
            }
            aVar.j();
        }
        boolean booleanValue = ((Boolean) B).booleanValue();
        aVar.K(-1210845840);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1210845840, 0, -1, "androidx.compose.animation.graphics.vector.PathPropertyValues.createState.<anonymous> (Animator.kt:237)");
        }
        float f = booleanValue ? i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        Float valueOf = Float.valueOf(f);
        int i5 = i4 & 14;
        int i6 = i5 ^ 6;
        boolean z2 = (i6 > 4 && aVar.J(wlp0Var)) || (i4 & 6) == 4;
        Object x = aVar.x();
        if (z2 || x == c0012a) {
            x = bbk0.b(new a(wlp0Var));
            aVar.R(x);
        }
        boolean booleanValue2 = ((Boolean) ((mtk0) x).getValue()).booleanValue();
        aVar.K(-1210845840);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1210845840, 0, -1, "androidx.compose.animation.graphics.vector.PathPropertyValues.createState.<anonymous> (Animator.kt:237)");
        }
        float f2 = booleanValue2 ? i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        Float valueOf2 = Float.valueOf(f2);
        boolean z3 = (i6 > 4 && aVar.J(wlp0Var)) || (i4 & 6) == 4;
        Object x2 = aVar.x();
        if (z3 || x2 == c0012a) {
            x2 = bbk0.b(new b(wlp0Var));
            aVar.R(x2);
        }
        wlp0.b bVar = (wlp0.b) ((mtk0) x2).getValue();
        aVar.K(2115989621);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2115989621, 0, -1, "androidx.compose.animation.graphics.vector.PathPropertyValues.createState.<anonymous> (Animator.kt:232)");
        }
        phr d = jq2.d(i, 0, luo.d, 2);
        if (!((Boolean) bVar.f()).booleanValue()) {
            d = new ggg0(d, i);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        wlp0.d c = ump0.c(wlp0Var, valueOf, valueOf2, d, jtp0Var, aVar, (458752 & (i4 << 6)) | i5);
        boolean y = aVar.y(this) | aVar.J(c);
        Object x3 = aVar.x();
        if (y || x3 == c0012a) {
            x3 = new com.vk.catalog2.common.ui.holders.b(21, this, c);
            aVar.R(x3);
        }
        f1m b3 = bbk0.b((gzs) x3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b3;
    }
}
