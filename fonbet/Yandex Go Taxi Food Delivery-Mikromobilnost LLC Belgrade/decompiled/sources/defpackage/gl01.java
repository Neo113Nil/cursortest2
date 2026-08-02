package defpackage;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.api.CrossBorderScenario;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.a;
import java.util.Locale;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final /* synthetic */ class gl01 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ gl01(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r0 r0Var;
        Object value;
        boolean z;
        switch (this.a) {
            case 0:
                CrossBorderScenario crossBorderScenario = (CrossBorderScenario) obj2;
                String str = (String) obj3;
                String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
                a aVar = this.b;
                wk01 b = zk01.b((xk01) aVar.X());
                if (b == null) {
                    z = false;
                } else {
                    pz40 Y = aVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, zk01.c((xk01) value, new il01(upperCase, 1))));
                    z = true;
                    a.b1(aVar, wk01.b(b, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, upperCase, -1, 7), null, TransferScenario.CROSS_BORDER, crossBorderScenario, str, 2);
                }
                return Boolean.valueOf(z);
            default:
                a aVar2 = this.b;
                aVar2.a0(new ycm0(aVar2, (String) obj2, (String) obj3, (String) obj));
                return zy11.a;
        }
    }
}
