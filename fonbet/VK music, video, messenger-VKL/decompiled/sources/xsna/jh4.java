package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import xsna.psn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jh4(Object obj, Object obj2, int i, int i2) {
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
                kh4.a((izs) this.d, (wh50) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((m9g) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                i0n.a((r970) this.e, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((psn0.a) this.d).a((TabMode) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                emi emiVar = (emi) this.d;
                jai jaiVar = (jai) this.e;
                ((Integer) obj2).getClass();
                emiVar.g(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, jaiVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jh4(r970 r970Var, izs izsVar, int i) {
        this.b = 2;
        this.e = r970Var;
        this.d = izsVar;
        this.c = i;
    }

    public /* synthetic */ jh4(psn0.a aVar, TabMode tabMode, int i) {
        this.b = 3;
        this.d = aVar;
        this.e = tabMode;
        this.c = i;
    }
}
