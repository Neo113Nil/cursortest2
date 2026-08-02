package xsna;

import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.TabMode;
import xsna.b78;
import xsna.r1k0;
import xsna.ssn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nv1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nv1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((ov1) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((hr8) this.d).f((ButtonSize) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                fbc.l(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                tso.k((mm3) this.d, this.c, (izs) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((yju) this.d).b((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((ikg0) this.d).a((com.vk.core.compose.component.group.header.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                ((qpg0) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 7:
                gzs gzsVar = (gzs) this.d;
                q630 q630Var2 = (q630) this.e;
                ((Integer) obj2).getClass();
                gbh0.e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, gzsVar, q630Var2);
                break;
            case 8:
                ((Integer) obj2).getClass();
                p1k0.a((r1k0.a) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((ssn0.a) this.d).a((TabMode) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.m((b78.i) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nv1(mm3 mm3Var, int i, izs izsVar, int i2) {
        this.b = 3;
        this.d = mm3Var;
        this.c = i;
        this.e = izsVar;
    }

    public /* synthetic */ nv1(ikg0 ikg0Var, com.vk.core.compose.component.group.header.b bVar, int i) {
        this.b = 5;
        this.d = ikg0Var;
        this.e = bVar;
        this.c = i;
    }

    public /* synthetic */ nv1(ssn0.a aVar, TabMode tabMode, int i) {
        this.b = 9;
        this.d = aVar;
        this.e = tabMode;
        this.c = i;
    }
}
