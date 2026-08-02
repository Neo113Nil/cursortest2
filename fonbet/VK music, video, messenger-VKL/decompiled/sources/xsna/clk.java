package xsna;

import xsna.c9p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class clk implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ clk(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((dlk) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((ala0) this.d).d(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ich0.f((izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((c9p0.d) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ clk(dlk dlkVar, int i) {
        this.b = 0;
        this.d = dlkVar;
        this.c = i;
    }

    public /* synthetic */ clk(c9p0.d dVar, int i) {
        this.b = 3;
        this.d = dVar;
        this.c = i;
    }
}
