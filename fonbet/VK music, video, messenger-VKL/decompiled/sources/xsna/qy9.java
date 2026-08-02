package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qy9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qy9(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                ry9.b(this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int I2 = ne7.I(this.d | 1);
                ((e6v) this.e).c(this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                izs izsVar = (izs) this.f;
                gzs gzsVar = (gzs) this.e;
                ((Integer) obj2).getClass();
                jww.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, gzsVar, izsVar, this.c);
                break;
            default:
                ((Integer) obj2).intValue();
                int I3 = ne7.I(this.d | 1);
                ((com.vk.core.compose.component.cell.content.p0) this.e).a((q9g) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qy9(izs izsVar, gzs gzsVar, q630 q630Var, int i) {
        this.b = 2;
        this.f = izsVar;
        this.e = gzsVar;
        this.c = q630Var;
        this.d = i;
    }

    public /* synthetic */ qy9(e6v e6vVar, q630 q630Var, Cell$Middle.Size size, int i) {
        this.b = 1;
        this.e = e6vVar;
        this.c = q630Var;
        this.f = size;
        this.d = i;
    }
}
