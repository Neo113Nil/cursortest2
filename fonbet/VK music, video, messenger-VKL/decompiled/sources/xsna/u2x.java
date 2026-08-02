package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.g8s;

/* compiled from: InputSelectImpl.kt */
/* loaded from: classes17.dex */
public final class u2x extends g8s.b {
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public u2x(s2x s2xVar, InputSelect$State inputSelect$State, boolean z, SemanticsConfiguration semanticsConfiguration) {
        this.c = androidx.compose.runtime.k.b(s2xVar);
        this.d = androidx.compose.runtime.k.b(inputSelect$State);
        this.e = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.f = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.g8s
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-644863140);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-644863140, i2, -1, "com.vk.core.compose.component.form.InputSelectImpl.Content (InputSelectImpl.kt:30)");
            }
            s2x s2xVar = (s2x) ((zak0) this.c).getValue();
            q630 f = txj0.f(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.f).getValue()), 1.0f);
            wh50 wh50Var = this.b;
            z0v0.a(s2xVar, s200.H(f, ((pco) ((zak0) wh50Var).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Boolean) ((zak0) this.a).getValue()).booleanValue() ? 0 : ((pco) ((zak0) wh50Var).getValue()).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), (InputSelect$State) ((zak0) this.d).getValue(), ((Boolean) ((zak0) this.e).getValue()).booleanValue(), M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zs0(this, q630Var, i, 2);
        }
    }
}
