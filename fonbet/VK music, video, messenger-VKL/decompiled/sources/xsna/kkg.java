package xsna;

import com.vk.core.compose.component.cell.content.RichCell$Middle;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kkg implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kkg(com.vk.core.compose.component.cell.content.x xVar, spg0 spg0Var, q630 q630Var, RichCell$Middle.Size size, int i) {
        this.e = xVar;
        this.f = spg0Var;
        this.c = q630Var;
        this.g = size;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.x) this.e).b((spg0) this.f, this.c, (RichCell$Middle.Size) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wqs.b((List) this.e, (izs) this.f, (xvy) this.g, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kkg(List list, izs izsVar, xvy xvyVar, q630 q630Var, int i) {
        this.e = list;
        this.f = izsVar;
        this.g = xvyVar;
        this.c = q630Var;
        this.d = i;
    }
}
