package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.f;
import xsna.m3b0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class n77 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n77(bei0 bei0Var, oei0 oei0Var, jai jaiVar) {
        this.b = 5;
        this.d = bei0Var;
        this.e = oei0Var;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.i) this.d).i((f.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((r3m) this.d).j((y3m) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                nrx.b((krx) this.d, (u7p0) this.e, q630.a.a, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(9));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((y740) this.d).i((z740) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((a4b0) this.d).q((m3b0.b) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            default:
                bei0 bei0Var = (bei0) this.d;
                oei0 oei0Var = (oei0) this.e;
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1799563674, intValue, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:136)");
                    }
                    egi.a(bei0Var, kai.c(-284825865, new ez7(oei0Var, jaiVar, bei0Var, 6), aVar), aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n77(i6v0 i6v0Var, Object obj, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = i6v0Var;
        this.e = obj;
        this.c = izsVar;
    }
}
