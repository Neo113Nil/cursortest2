package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class c6v implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c6v(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((g6v) this.e).c((q630) this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((ci40) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                s050.b((l050) this.e, (gzs) this.c, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.s0) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((sum0) this.e).f((sum0.d) this.c, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ c6v(com.vk.core.compose.component.cell.content.o oVar, spg0 spg0Var, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = oVar;
        this.f = spg0Var;
        this.c = q630Var;
        this.d = i;
    }
}
