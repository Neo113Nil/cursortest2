package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ph00 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ph00(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.f;
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                qh00.b(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var);
                break;
            case 1:
                gzs gzsVar2 = (gzs) this.c;
                gzs gzsVar3 = (gzs) this.f;
                q630 q630Var2 = (q630) this.d;
                ((Integer) obj2).getClass();
                wjd0.a(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, gzsVar2, gzsVar3, q630Var2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.v0) this.f).a((spg0) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                sum0 sum0Var = (sum0) this.f;
                List list = (List) this.c;
                izs izsVar = (izs) this.d;
                ((Integer) obj2).intValue();
                sum0Var.e(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, list, izsVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ph00(int i, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        this.b = 1;
        this.c = gzsVar;
        this.f = gzsVar2;
        this.d = q630Var;
        this.e = i;
    }
}
