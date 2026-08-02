package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xw5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xw5(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                List list = (List) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                cx5.b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, list, q630Var);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.c | 1);
                uzg.a(this.d, (izs) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                wrx.b((q630) this.e, (s890) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                String str = (String) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).intValue();
                g8c0.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, str, izsVar);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((jxe0) this.d).c((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                kuo0.m((tuo0) this.d, (yto0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xw5(q630 q630Var, s890 s890Var, int i) {
        this.b = 2;
        this.e = q630Var;
        this.d = s890Var;
        this.c = i;
    }
}
