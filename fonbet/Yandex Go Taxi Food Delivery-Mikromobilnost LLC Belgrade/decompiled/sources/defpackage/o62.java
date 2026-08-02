package defpackage;

import androidx.compose.foundation.gestures.e;

/* loaded from: classes10.dex */
public final class o62 {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ e d;

    public o62(e eVar) {
        this.d = eVar;
    }

    public final void a(float f, float f2) {
        e eVar = this.d;
        tx40 tx40Var = eVar.j;
        float floatValue = tx40Var.getFloatValue();
        tx40Var.setFloatValue(f);
        eVar.k.setFloatValue(f2);
        if (Float.isNaN(floatValue)) {
            return;
        }
        boolean z = f >= floatValue;
        lah d = eVar.d();
        oz40 oz40Var = eVar.g;
        if (tx40Var.getFloatValue() == d.f(oz40Var.getValue())) {
            Object b = eVar.d().b(tx40Var.getFloatValue() + (z ? 1.0f : -1.0f), z);
            if (b == null) {
                b = oz40Var.getValue();
            }
            if (z) {
                this.a = oz40Var.getValue();
                this.b = b;
            } else {
                this.a = b;
                this.b = oz40Var.getValue();
            }
        } else {
            Object b2 = eVar.d().b(tx40Var.getFloatValue(), false);
            if (b2 == null) {
                b2 = oz40Var.getValue();
            }
            Object b3 = eVar.d().b(tx40Var.getFloatValue(), true);
            if (b3 == null) {
                b3 = oz40Var.getValue();
            }
            this.a = b2;
            this.b = b3;
        }
        this.c = Math.abs(eVar.d().f(this.a) - eVar.d().f(this.b));
        if (Math.abs(tx40Var.getFloatValue() - eVar.d().f(oz40Var.getValue())) >= this.c / 2.0f) {
            Object obj = z ? this.b : this.a;
            if (obj == null) {
                obj = oz40Var.getValue();
            }
            if (((Boolean) eVar.a.invoke(obj)).booleanValue()) {
                eVar.h(obj);
            }
        }
    }
}
