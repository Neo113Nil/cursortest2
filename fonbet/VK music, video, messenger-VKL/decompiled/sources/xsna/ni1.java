package xsna;

import com.vk.community.design.view.donut.DonutUserStackView;
import kotlin.Pair;
import xsna.dt1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ni1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ni1(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                oi1.a((al1) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((xj4) this.e).a((q630) this.c, (dt1.b) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((DonutUserStackView.a) this.e).e((Pair) this.f, (zzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.k0) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                izs izsVar = (izs) this.f;
                b280 b280Var = (b280) this.e;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                k080.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var, b280Var);
                break;
            default:
                ((Integer) obj2).intValue();
                kuo0.n((q630) this.c, (tuo0) this.e, (yto0) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ni1(xj4 xj4Var, q630 q630Var, dt1.b bVar, int i) {
        this.b = 1;
        this.e = xj4Var;
        this.c = q630Var;
        this.f = bVar;
        this.d = i;
    }

    public /* synthetic */ ni1(izs izsVar, b280 b280Var, q630 q630Var, int i) {
        this.b = 4;
        this.f = izsVar;
        this.e = b280Var;
        this.c = q630Var;
        this.d = i;
    }

    public /* synthetic */ ni1(q630 q630Var, tuo0 tuo0Var, yto0 yto0Var, int i) {
        this.b = 5;
        this.c = q630Var;
        this.e = tuo0Var;
        this.f = yto0Var;
        this.d = i;
    }
}
