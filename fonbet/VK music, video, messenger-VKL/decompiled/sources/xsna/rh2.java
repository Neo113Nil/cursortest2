package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import java.util.Map;
import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rh2(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.c | 1);
                wh2.c((dz40.e) this.d, this.e, (izs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((wna) this.d).c((q630) this.e, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((rfj) this.d).c((Map) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.c | 1);
                v3z.b(this.e, (izs) this.f, (q630) this.d, (androidx.compose.runtime.a) obj, I2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                vkf0.c((hwu) this.d, (izs) this.f, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                i5k0.d((j5k0) this.d, (izs) this.f, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rh2(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.f = izsVar;
        this.e = q630Var;
        this.c = i;
    }

    public /* synthetic */ rh2(Object obj, izs izsVar, q630 q630Var, int i) {
        this.b = 3;
        this.e = obj;
        this.f = izsVar;
        this.d = q630Var;
        this.c = i;
    }
}
