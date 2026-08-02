package defpackage;

import androidx.compose.foundation.gestures.e;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final /* synthetic */ class n62 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ n62(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r4 > 0.999999f) goto L17;
     */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        float f;
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                Object value = eVar.l.getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = eVar.j.getFloatValue();
                oz40 oz40Var = eVar.g;
                if (Float.isNaN(floatValue)) {
                    return oz40Var.getValue();
                }
                float f2 = eVar.d().f(oz40Var.getValue());
                if (Float.isNaN(f2) || floatValue == f2) {
                    return oz40Var.getValue();
                }
                Object a = eVar.d().a(floatValue);
                return a == null ? oz40Var.getValue() : a;
            case 1:
                float f3 = eVar.d().f(eVar.h.getValue());
                float f4 = eVar.d().f(eVar.i.getValue()) - f3;
                float abs = Math.abs(f4);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (eVar.g() - f3) / f4;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = 0.0f;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 2:
                return eVar.d();
            default:
                return new Pair(eVar.d(), eVar.i.getValue());
        }
    }
}
