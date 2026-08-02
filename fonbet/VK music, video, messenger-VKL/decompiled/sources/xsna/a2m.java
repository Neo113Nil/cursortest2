package xsna;

import com.vk.core.compose.component.cell.content.RichCell$Middle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a2m implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a2m(int i, int i2, Object obj, Object obj2, Object obj3, q630 q630Var) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.g = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.e;
                izs izsVar = (izs) this.f;
                gzs gzsVar = (gzs) this.g;
                ((Integer) obj2).getClass();
                c2m.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, gzsVar, izsVar, this.c);
                break;
            default:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.f1) this.e).b((q9g) this.f, this.c, (RichCell$Middle.Size) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }
}
