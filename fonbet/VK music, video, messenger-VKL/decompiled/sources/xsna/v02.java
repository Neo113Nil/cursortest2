package xsna;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class v02 implements fz1 {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ f12<Object> d;

    public v02(f12<Object> f12Var) {
        this.d = f12Var;
    }

    @Override // xsna.fz1
    public final void a(float f, float f2) {
        f12<Object> f12Var = this.d;
        float floatValue = ((vak0) f12Var.j).getFloatValue();
        ((vak0) f12Var.j).g(f);
        ((vak0) f12Var.l).g(f2);
        if (Float.isNaN(floatValue)) {
            return;
        }
        boolean z = f >= floatValue;
        vgo<Object> c = f12Var.c();
        kg50 kg50Var = f12Var.j;
        wh50 wh50Var = f12Var.g;
        zak0 zak0Var = (zak0) wh50Var;
        vak0 vak0Var = (vak0) kg50Var;
        if (vak0Var.getFloatValue() == c.c(zak0Var.getValue())) {
            Object b = f12Var.c().b(vak0Var.getFloatValue() + (z ? 1.0f : -1.0f), z);
            if (b == null) {
                b = zak0Var.getValue();
            }
            if (z) {
                this.a = zak0Var.getValue();
                this.b = b;
            } else {
                this.a = b;
                this.b = zak0Var.getValue();
            }
        } else {
            Object b2 = f12Var.c().b(vak0Var.getFloatValue(), false);
            if (b2 == null) {
                b2 = zak0Var.getValue();
            }
            Object b3 = f12Var.c().b(vak0Var.getFloatValue(), true);
            if (b3 == null) {
                b3 = zak0Var.getValue();
            }
            this.a = b2;
            this.b = b3;
        }
        this.c = Math.abs(f12Var.c().c(this.a) - f12Var.c().c(this.b));
        if (Math.abs(((vak0) kg50Var).getFloatValue() - f12Var.c().c(((zak0) wh50Var).getValue())) >= this.c / 2.0f) {
            Object obj = z ? this.b : this.a;
            if (obj == null) {
                obj = ((zak0) wh50Var).getValue();
            }
            if (f12Var.a.invoke(obj).booleanValue()) {
                f12Var.g(obj);
            }
        }
    }
}
