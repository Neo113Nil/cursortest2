package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class es5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ es5(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((is5) this.e).b((ds5) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                v5c.a((f3c) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d) | 1;
                ((jai) this.e).g(this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 3:
                String str = (String) this.e;
                izs izsVar = (izs) this.f;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                f7t.c(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, izsVar, q630Var);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.group.header.a) this.e).a((com.vk.core.compose.component.group.header.b) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ccm0.c((String) this.e, (Cell$Middle.Size) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
