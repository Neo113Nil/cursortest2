package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.RichCell$Middle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class vrx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vrx(Object obj, spg0 spg0Var, q630 q630Var, Enum r4, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = spg0Var;
        this.c = q630Var;
        this.g = r4;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                wrx.a((uyh0) this.e, this.c, (s890) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((kzk0) this.e).c((spg0) this.f, this.c, (Cell$Middle.Size) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((m6p0) this.e).b((spg0) this.f, this.c, (RichCell$Middle.Size) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wap0.b((xap0) this.e, (jap0) this.f, (gzs) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vrx(uyh0 uyh0Var, q630 q630Var, s890 s890Var, izs izsVar, int i) {
        this.b = 0;
        this.e = uyh0Var;
        this.c = q630Var;
        this.f = s890Var;
        this.g = izsVar;
        this.d = i;
    }

    public /* synthetic */ vrx(xap0 xap0Var, jap0 jap0Var, gzs gzsVar, q630 q630Var, int i) {
        this.b = 3;
        this.e = xap0Var;
        this.f = jap0Var;
        this.g = gzsVar;
        this.c = q630Var;
        this.d = i;
    }
}
