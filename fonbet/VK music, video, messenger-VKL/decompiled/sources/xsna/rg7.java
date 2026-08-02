package xsna;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.i870;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class rg7 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rg7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                vg7 vg7Var = (vg7) this.c;
                dh7 dh7Var = (dh7) this.d;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(739637099);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(739637099, intValue, -1, "com.vk.core.tool.compose.blur.blurEffect.<anonymous> (BlurEffect.kt:42)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = Boolean.valueOf(Build.VERSION.SDK_INT >= 33);
                    aVar.R(x);
                }
                q630 a = (((Boolean) x).booleanValue() && ((View) aVar.r(AndroidCompositionLocals_androidKt.f)).isHardwareAccelerated()) ? qri.a(q630Var, a5x.a, new jrc(1, dh7Var, vg7Var)) : hr80.m(rte0.d(q630Var, vog0.b(dh7Var.d())), l5g.c(14, dh7Var.c(), dh7Var.a()), androidx.compose.ui.graphics.e.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return a;
            default:
                i870.a aVar2 = (i870.a) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(130192622, intValue2, -1, "com.vk.notifications.design.compose.list.common.NotificationButtons.<anonymous> (NotificationButtons.kt:24)");
                    }
                    tlo0 tlo0Var = aVar2.a;
                    iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
                    String obj4 = tlo0Var.a((Context) aVar3.r(iyk0Var)).toString();
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    Boolean bool = aVar2.e;
                    q630.a aVar4 = q630.a.a;
                    q630 E = ahn.E(aVar4, "NotificationPrimaryButton");
                    boolean J = aVar3.J(izsVar) | aVar3.J(aVar2);
                    Object x2 = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x2 == c0012a) {
                        x2 = new mh3(18, izsVar, aVar2);
                        aVar3.R(x2);
                    }
                    h870.a(obj4, buttonStyle, bool, E, (gzs) x2, aVar3, 3120);
                    tlo0 tlo0Var2 = aVar2.b;
                    if (tlo0Var2 == null) {
                        aVar3.K(213434551);
                    } else {
                        aVar3.K(213434552);
                        String obj5 = tlo0Var2.a((Context) aVar3.r(iyk0Var)).toString();
                        ButtonStyle buttonStyle2 = ButtonStyle.Tertiary;
                        Boolean bool2 = aVar2.e;
                        q630 E2 = ahn.E(aVar4, "notificationSecondaryButton");
                        boolean J2 = aVar3.J(aVar2) | aVar3.J(izsVar);
                        Object x3 = aVar3.x();
                        if (J2 || x3 == c0012a) {
                            x3 = new d5(15, aVar2, izsVar);
                            aVar3.R(x3);
                        }
                        h870.a(obj5, buttonStyle2, bool2, E2, (gzs) x3, aVar3, 3120);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
