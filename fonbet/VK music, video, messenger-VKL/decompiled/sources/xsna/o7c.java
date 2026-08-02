package xsna;

import com.vk.core.compose.component.defaults.PlaceholderMode;
import xsna.bsa0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class o7c implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o7c(PlaceholderMode placeholderMode, bsa0 bsa0Var, int i) {
        this.b = 2;
        this.d = placeholderMode;
        this.e = bsa0Var;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                p7c.b((n7c) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                ((ary) this.d).f(this.c, this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                bsa0.a.a((PlaceholderMode) this.d, (bsa0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                cef0.e((kef0) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((u4i0) this.d).c((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((taq0) this.d).a((ksr) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                tet0 tet0Var = (tet0) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                tet0Var.A(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ o7c(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ o7c(ary aryVar, int i, Object obj, int i2) {
        this.b = 1;
        this.d = aryVar;
        this.c = i;
        this.e = obj;
    }
}
