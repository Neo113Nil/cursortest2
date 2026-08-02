package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.jxm0;
import defpackage.nj1;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class mj1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ mj1(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        zy11 zy11Var = zy11.a;
        final wls wlsVar = this.b;
        switch (i) {
            case 0:
                final nj1 nj1Var = new nj1((ListItemSwitchComponent) obj, i3);
                ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) ((View) nj1Var.R);
                listItemSwitchComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                listItemSwitchComponent.setBackgroundResource(dzg0.bg_main_ripple);
                listItemSwitchComponent.setDebounceClickListener(new jg(10, listItemSwitchComponent));
                listItemSwitchComponent.setOnCheckedListener(new xyw0() { // from class: com.yandex.go.scooters.onboarding.agreement.a
                    @Override // defpackage.xyw0
                    public final void a(boolean z) {
                        jxm0 jxm0Var = (jxm0) nj1.this.T;
                        if (jxm0Var != null) {
                            ((ScootersAgreementModalView$initAcceptList$adapter$1) wlsVar).invoke(jxm0Var, Boolean.valueOf(z));
                        }
                    }
                });
                break;
            case 1:
                zvd0 zvd0Var = (zvd0) obj;
                wlsVar.invoke(zvd0Var, Float.valueOf(Float.intBitsToFloat((int) (kx91.g(zvd0Var, false) >> 32))));
                zvd0Var.a();
                break;
            case 2:
                zvd0 zvd0Var2 = (zvd0) obj;
                wlsVar.invoke(zvd0Var2, Float.valueOf(Float.intBitsToFloat((int) (kx91.g(zvd0Var2, false) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
                zvd0Var2.a();
                break;
            case 3:
                yji0 yji0Var = new yji0((View) obj, wlsVar, 0);
                yji0Var.T(true);
                break;
            case 4:
                yji0 yji0Var2 = new yji0((View) obj, wlsVar, 2);
                yji0Var2.T(true);
                break;
            case 5:
                yji0 yji0Var3 = new yji0((View) obj, wlsVar, 1);
                yji0Var3.T(true);
                break;
            case 6:
                break;
            case 7:
                hrv hrvVar = (hrv) obj;
                Boolean bool = (Boolean) wlsVar.invoke(Integer.valueOf(hrvVar.a), hrvVar.b);
                bool.getClass();
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                xi2 xi2Var = (xi2) obj;
                wlsVar.invoke(xi2Var.e.getValue(), gtq0.f.b.invoke(xi2Var.f));
                break;
            default:
                n70 n70Var = (n70) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                n70Var.W(new ycm0(((a361) n70Var.N).a, n70Var, ref$ObjectRef, wlsVar));
                n70Var.b0(new z00(6, ref$ObjectRef));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mj1(wls wlsVar, xz4 xz4Var, int i) {
        this.a = i;
        this.b = wlsVar;
    }
}
