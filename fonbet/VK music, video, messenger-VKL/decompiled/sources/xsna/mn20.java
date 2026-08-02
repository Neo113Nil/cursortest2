package xsna;

import xsna.nn20;

/* compiled from: MilkshakeGroupHeaderScreenContent.kt */
/* loaded from: classes18.dex */
public final class mn20 implements zju {
    public final /* synthetic */ v5v a;
    public final /* synthetic */ nn20.a b;

    public mn20(v5v v5vVar, nn20.a aVar) {
        this.a = v5vVar;
        this.b = aVar;
    }

    @Override // xsna.zju
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-1762417004);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1762417004, i2, -1, "com.vk.design.demo.presentation.screens.groupheader.MilkshakeGroupHeaderScreenContent.GroupHeaderComposeComponent.<anonymous>.<no name provided>.Highlight (MilkshakeGroupHeaderScreenContent.kt:271)");
            }
            d8v0.a(this.a.b, null, null, null, ((Boolean) ((zak0) this.b.i).getValue()).booleanValue(), false, true, null, jaiVar, M, 806879232, 430);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xf4(this, jaiVar, i, 8);
        }
    }
}
