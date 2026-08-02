package defpackage;

import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.gestures.e;

/* loaded from: classes10.dex */
public final class k62 implements j1t0 {
    public final /* synthetic */ e a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ j62 c;

    public k62(e eVar, tls tlsVar, j62 j62Var) {
        this.a = eVar;
        this.b = tlsVar;
        this.c = j62Var;
    }

    @Override // defpackage.j1t0
    public final float a(float f) {
        e eVar = this.a;
        float g = eVar.g();
        Object b = c.b(eVar.d(), g, f, this.b, this.c);
        if (!((Boolean) eVar.a.invoke(b)).booleanValue()) {
            b = eVar.h.getValue();
        }
        return eVar.d().f(b) - g;
    }

    @Override // defpackage.j1t0
    public final float b(float f, float f2) {
        return 0.0f;
    }
}
