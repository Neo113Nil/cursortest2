package xsna;

import androidx.compose.runtime.a;
import com.vk.fullscreenvideo.ControlsState;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kxs implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kxs(int i, Object obj, Object obj2, Object obj3, izs izsVar) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ControlsState.a aVar = (ControlsState.a) this.d;
                eqj eqjVar = (eqj) this.e;
                gzs gzsVar = (gzs) this.f;
                dqj dqjVar = (dqj) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar2.J(dqjVar) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-522638768, intValue, -1, "com.vk.fullscreenvideo.bottom.FullscreenBottomControls.<anonymous>.<anonymous> (FullscreenBottomControls.kt:75)");
                    }
                    bqj.a(dqjVar, this.c, ahn.E(q630.a.a, ods0.b(dqjVar.c)), aVar.c, 8, eqjVar, gzsVar, aVar2, (intValue & 14) | 24576, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                List list = (List) this.d;
                wzs wzsVar = (wzs) this.e;
                wh50 wh50Var = (wh50) this.f;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(551579606, intValue2, -1, "com.vk.search.ui.VideoSearchFilterSpinner.<anonymous> (VideoSearchFilterSpinner.kt:46)");
                    }
                    boolean J = aVar3.J(wzsVar);
                    Object x = aVar3.x();
                    if (J || x == a.C0011a.a) {
                        x = new gd1(9, wzsVar, wh50Var);
                        aVar3.R(x);
                    }
                    ret0.a(0, aVar3, list, this.c, (wzs) x);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
