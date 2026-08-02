package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cp8;
import xsna.q630;

/* compiled from: TextImpl.kt */
/* loaded from: classes17.dex */
public final class gio0 extends cp8.d {
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    public gio0(String str, SemanticsConfiguration semanticsConfiguration, Float f) {
        this.e = androidx.compose.runtime.k.b(f);
        this.f = androidx.compose.runtime.k.b(str);
        this.g = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.cp8
    public final void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1586858865);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(lgu0Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED) != 1042)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1586858865, i2, -1, "com.vk.core.compose.component.button.TextImpl.Content (TextImpl.kt:29)");
            }
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.g).getValue();
            q630.a aVar3 = q630.a.a;
            q630 C = s200.C(com.vk.core.compose.component.semantics.b.b(aVar3, semanticsConfiguration), hr80.z().s(c(), M, 0));
            wh50 wh50Var = this.e;
            if (((Float) ((zak0) wh50Var).getValue()) != null) {
                C = C.g(tpg0Var.b(((Float) ((zak0) wh50Var).getValue()).floatValue(), aVar3, false));
            }
            aVar2 = M;
            yqv0.c((String) ((zak0) this.f).getValue(), C, ((l5g) lgu0Var.b(d(), M, i2 & 112).getValue()).a, null, null, 0, 0, null, 2, false, 0, 1, null, null, aVar2, 100663296, 48, 14072);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bo7(this, lgu0Var, i);
        }
    }
}
