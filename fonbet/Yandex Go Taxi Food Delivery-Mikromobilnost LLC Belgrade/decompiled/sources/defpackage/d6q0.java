package defpackage;

import flex.engine.section.c;

/* loaded from: classes9.dex */
public final /* synthetic */ class d6q0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ int c;

    public /* synthetic */ d6q0(c cVar, int i, int i2) {
        this.a = i2;
        this.b = cVar;
        this.c = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                if (cVar.U) {
                    cVar.U = false;
                } else {
                    float f = i2;
                    Float f2 = cVar.S;
                    r1 = (int) (f * (f2 != null ? f2.floatValue() : 1.0f));
                }
                return Integer.valueOf(r1);
            default:
                Float f3 = cVar.S;
                float floatValue = f3 != null ? f3.floatValue() : 1.0f;
                return Integer.valueOf(floatValue > 0.0f ? (int) (i2 * floatValue) : 0);
        }
    }
}
