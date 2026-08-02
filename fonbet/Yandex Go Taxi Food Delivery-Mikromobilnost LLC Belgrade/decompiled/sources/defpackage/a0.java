package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.focus.FocusStateImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.BduiVariableControllerImpl;
import com.yandex.go.navigator.map_interactions.parkings.ui.ToggleButtonsUiAction;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.axm0;
import defpackage.nj1;
import java.io.File;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.logistics.care.camera.ui.ConfirmAction;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes12.dex */
public final /* synthetic */ class a0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ a0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 variableListener$lambda$1$lambda$0;
        zy11 onHyperLinkAction$lambda$7;
        int i = this.a;
        Object obj2 = ws6.a;
        xs6 xs6Var = xs6.a;
        hpr hprVar = hpr.a;
        epr eprVar = epr.a;
        dpr dprVar = dpr.a;
        int i2 = 0;
        Object obj3 = null;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        final tls tlsVar = this.b;
        switch (i) {
            case 0:
                tlsVar.invoke(new u0((String) obj));
                break;
            case 1:
                tlsVar.invoke(new x0((f7v0) obj));
                break;
            case 2:
                tlsVar.invoke(Boolean.valueOf(((FocusStateImpl) ((ivr) obj)).b()));
                break;
            case 3:
                tlsVar.invoke(new l21((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 4:
                final nj1 nj1Var = new nj1((ListItemComponent) obj, i3);
                View view = (View) nj1Var.R;
                ListItemComponent listItemComponent = (ListItemComponent) view;
                listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                listItemComponent.setBackgroundResource(dzg0.bg_main_ripple);
                listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
                listItemComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.onboarding.agreement.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        axm0 axm0Var = (axm0) nj1.this.T;
                        if (axm0Var != null) {
                            ((ScootersAgreementModalView$initTerms$adapter$1) tlsVar).invoke(axm0Var.c);
                        }
                    }
                });
                ((ListItemComponent) view).setTrailImage(dzg0.ic_chevron);
                break;
            case 5:
                tlsVar.invoke(new qib((String) obj));
                break;
            case 6:
                rzx rzxVar = (rzx) obj;
                tlsVar.invoke(gwk0.o(rzxVar).j(rzxVar, true));
                break;
            case 7:
                tlsVar.invoke(new w12((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 8:
                tlsVar.invoke(new hx2((v8r0) obj));
                break;
            case 9:
                n70 n70Var = (n70) obj;
                n70Var.W(new ms3(i2, n70Var, tlsVar));
                break;
            case 10:
                sy60 sy60Var = (sy60) obj;
                if (sy60Var instanceof qgc0) {
                    tlsVar.invoke(sy60Var);
                }
                sy60Var.a();
                break;
            case 11:
                variableListener$lambda$1$lambda$0 = BduiVariableControllerImpl.setVariableListener$lambda$1$lambda$0(tlsVar, (c231) obj);
                break;
            case 12:
                tlsVar.invoke(new cvx0(((Integer) obj).intValue()));
                break;
            case 13:
                tlsVar.invoke(new dvx0((String) obj));
                break;
            case 14:
                tlsVar.invoke(new tr5((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 15:
                tlsVar.invoke(new mr5((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
                break;
            case 16:
                tlsVar.invoke(new nr5(((Boolean) obj).booleanValue()));
                break;
            case 17:
                onHyperLinkAction$lambda$7 = BottomSheetDialogView.onHyperLinkAction$lambda$7(tlsVar, (String) obj);
                break;
            case 18:
                ipr iprVar = (ipr) obj;
                if (jl40.l(iprVar, dprVar)) {
                    obj2 = ts6.a;
                } else if (!jl40.l(iprVar, eprVar)) {
                    obj2 = jl40.l(iprVar, hprVar) ? xs6Var : null;
                }
                if (obj2 != null) {
                    tlsVar.invoke(obj2);
                    break;
                }
                break;
            case 19:
                int i4 = ss6.a[((ToggleButtonsUiAction) obj).ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        w511.b();
                        break;
                    } else {
                        obj2 = xs6Var;
                    }
                }
                tlsVar.invoke(obj2);
                break;
            case 20:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new ms3(i3, n70Var2, tlsVar));
                break;
            case 21:
                ipr iprVar2 = (ipr) obj;
                if (jl40.l(iprVar2, dprVar)) {
                    obj3 = f68.a;
                } else if (jl40.l(iprVar2, eprVar)) {
                    obj3 = i68.a;
                } else if (jl40.l(iprVar2, hprVar)) {
                    obj3 = j68.a;
                }
                if (obj3 != null) {
                    tlsVar.invoke(obj3);
                    break;
                }
                break;
            case 22:
                int i5 = gs8.a[((ConfirmAction) obj).ordinal()];
                if (i5 == 1) {
                    tlsVar.invoke(ur8.a);
                } else if (i5 != 2) {
                    w511.b();
                    break;
                } else {
                    tlsVar.invoke(tr8.a);
                }
                break;
            case 23:
                tlsVar.invoke(new zr8((File) obj, false));
                break;
            case 24:
                tlsVar.invoke(new qr8((List) obj));
                break;
            case 25:
                tlsVar.invoke(new zr8((File) obj, true));
                break;
            case 26:
                tlsVar.invoke(new vm9((String) obj));
                break;
            case 27:
                tlsVar.invoke(new ds9((String) obj));
                break;
            case 28:
                tlsVar.invoke(new ds9((String) obj));
                break;
            default:
                tlsVar.invoke(new ds9((String) obj));
                break;
        }
        return zy11Var;
    }
}
