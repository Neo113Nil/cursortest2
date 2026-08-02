package xsna;

import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import xsna.b78;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tq8 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tq8(int i, lg90 lg90Var, q630 q630Var, int i2) {
        this.b = 7;
        this.c = i;
        this.d = lg90Var;
        this.e = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((hr8) this.d).j((ButtonSize) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                fbc.i(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.c) | 1;
                ((jai) this.d).d(this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 3:
                ((Integer) obj2).getClass();
                k8k.a((String) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((GroupHeader$Right.a.C0743a) this.d).a((com.vk.core.compose.component.group.header.b) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                fc50.a((ee50) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1), this.c);
                break;
            case 6:
                izs izsVar2 = (izs) this.d;
                String str = (String) this.e;
                ((Integer) obj2).getClass();
                tig0.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, str, izsVar2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(65);
                q9j0.b(this.c, (lg90) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.n((b78.i) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ tq8(GroupHeader$Right.a.C0743a c0743a, com.vk.core.compose.component.group.header.b bVar, int i) {
        this.b = 4;
        this.d = c0743a;
        this.e = bVar;
        this.c = i;
    }

    public /* synthetic */ tq8(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ tq8(ee50 ee50Var, q630 q630Var, int i, int i2) {
        this.b = 5;
        this.d = ee50Var;
        this.e = q630Var;
        this.c = i2;
    }
}
