package xsna;

import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class pjr0<K, A> extends tf6<K, A> {
    public final A i;

    /* JADX WARN: Multi-variable type inference failed */
    public pjr0(@Nullable Object obj, a900 a900Var) {
        super(Collections.EMPTY_LIST);
        k(a900Var);
        this.i = obj;
    }

    @Override // xsna.tf6
    public final float c() {
        return 1.0f;
    }

    @Override // xsna.tf6
    public final A f() {
        a900<A> a900Var = this.e;
        A a = this.i;
        float f = this.d;
        return a900Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, a, f, f, f);
    }

    @Override // xsna.tf6
    public final A g(nhy<K> nhyVar, float f) {
        return f();
    }

    @Override // xsna.tf6
    public final void i() {
        if (this.e != null) {
            super.i();
        }
    }

    @Override // xsna.tf6
    public final void j(float f) {
        this.d = f;
    }
}
