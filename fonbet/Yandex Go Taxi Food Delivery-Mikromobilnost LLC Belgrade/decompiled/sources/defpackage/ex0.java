package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl;
import com.yandex.go.chargers.design.components.ChargersButtonsView;
import com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a;
import com.yandex.messaging.internal.view.timeline.c;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.yx360.design.compose.atoms.DsCheckbox$State;
import com.yx360.design.compose.atoms.b;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.eatskit.internal.nativeapi.EatsNativeApi;

/* loaded from: classes13.dex */
public final /* synthetic */ class ex0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ ex0(boolean z, DsCheckbox$State dsCheckbox$State, tls tlsVar) {
        this.a = 8;
        this.b = z;
        this.w = dsCheckbox$State;
        this.c = tlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 updateConstraints$lambda$0;
        zy11 requestOpenUri$lambda$0;
        zy11 hideOverlay$lambda$12;
        zy11 render$lambda$2;
        zy11 renderAmountBlockWithAnimation$lambda$55;
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        Object obj = this.w;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tls tlsVar = (tls) obj2;
                v81 v81Var = (v81) obj;
                if (z) {
                    tlsVar.invoke(v81Var);
                    break;
                }
                break;
            case 1:
                tls tlsVar2 = (tls) obj2;
                ie3 ie3Var = (ie3) obj;
                if (z) {
                    tlsVar2.invoke(ie3Var);
                    break;
                }
                break;
            case 2:
                a aVar = (a) obj2;
                String str = (String) obj;
                aVar.g0(false);
                if (z) {
                    aVar.f0(str, true);
                    break;
                }
                break;
            case 3:
                c cVar = (c) obj;
                break;
            case 4:
                Context context = (Context) obj2;
                String str2 = (String) obj;
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t("Metrica8Facade");
                d5z0Var.a("Activate AppMetrica public reporter", new Object[0]);
                ReporterConfig.Builder newConfigBuilder = ReporterConfig.newConfigBuilder(str2);
                if (z) {
                    newConfigBuilder.withLogs();
                }
                AppMetrica.activateReporter(context, newConfigBuilder.build());
                break;
            case 5:
                break;
            case 6:
                updateConstraints$lambda$0 = ChargersButtonsView.updateConstraints$lambda$0(z, (ChargersButtonsView) obj2, (List) obj);
                break;
            case 7:
                v920 v920Var = (v920) obj2;
                flg flgVar = (flg) v920Var.w;
                zac zacVar = (zac) ((lrb1) obj);
                String str3 = zacVar.c;
                r0 r0Var = flgVar.a;
                Boolean bool = (Boolean) ((Map) r0Var.getValue()).get(str3);
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) r0Var.getValue());
                linkedHashMap.put(str3, Boolean.valueOf(!booleanValue));
                r0Var.m(null, linkedHashMap);
                lhg lhgVar = (lhg) v920Var.x;
                String str4 = zacVar.c;
                if (!z) {
                    lhgVar.b(gw00.e(new Pair("target_id", str4)), "DashboardCollapseButton");
                    break;
                } else {
                    lhgVar.b(gw00.e(new Pair("target_id", str4)), "DashboardExpandButton");
                    break;
                }
            case 8:
                DsCheckbox$State dsCheckbox$State = (DsCheckbox$State) obj;
                tls tlsVar3 = (tls) obj2;
                if (z) {
                    int i3 = b.c[dsCheckbox$State.ordinal()];
                    if (i3 == 1) {
                        tlsVar3.invoke(DsCheckbox$State.Unselected);
                    } else if (i3 != 2 && i3 != 3) {
                        w511.b();
                        break;
                    } else {
                        tlsVar3.invoke(DsCheckbox$State.Selected);
                    }
                }
                break;
            case 9:
                requestOpenUri$lambda$0 = EatsNativeApi.requestOpenUri$lambda$0((EatsNativeApi) obj2, (String) obj, z);
                break;
            case 10:
                hideOverlay$lambda$12 = FlexRouteHandlerImpl.hideOverlay$lambda$12((FlexRouteHandlerImpl) obj2, (String) obj, z);
                break;
            case 11:
                tls tlsVar4 = (tls) obj2;
                qcu qcuVar = (qcu) obj;
                if (z) {
                    tlsVar4.invoke(qcuVar.c);
                    break;
                }
                break;
            case 12:
                tls tlsVar5 = (tls) obj2;
                ixz ixzVar = (ixz) obj;
                if (!z) {
                    tlsVar5.invoke(new ywz(ixzVar.a));
                    break;
                }
                break;
            case 13:
                mt10 mt10Var = (mt10) obj2;
                mt10Var.a.setImageDrawable(((kt10) obj).f);
                if (!z) {
                    mt10Var.c();
                    break;
                }
                break;
            case 14:
                com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c cVar2 = (com.yandex.go.places.organization.card.impl.ui.card.flex.v1.c) obj2;
                dac0 dac0Var = cVar2.M;
                y7c0 y7c0Var = cVar2.H;
                jsj jsjVar = cVar2.I;
                xsj xsjVar = new xsj(cVar2, i2);
                com.yandex.go.places.organization.card.impl.ui.card.flex.v1.a aVar2 = new com.yandex.go.places.organization.card.impl.ui.card.flex.v1.a(cVar2);
                f470 f470Var = cVar2.i0;
                cVar2.W.a.getClass();
                break;
            case 15:
                render$lambda$2 = ProductCardListView.render$lambda$2((ProductCardListView) obj2, (h7f0) obj, z);
                break;
            case 16:
                renderAmountBlockWithAnimation$lambda$55 = QrPaymentsMainFragment.renderAmountBlockWithAnimation$lambda$55(z, (t9g0) obj2, (QrPaymentsMainFragment) obj);
                break;
            case 17:
                tls tlsVar6 = (tls) obj2;
                kuk0 kuk0Var = (kuk0) obj;
                if (z) {
                    tlsVar6.invoke(kuk0Var);
                    break;
                }
                break;
            case 18:
                tls tlsVar7 = (tls) obj2;
                lww0 lww0Var = (lww0) obj;
                if (z) {
                    tlsVar7.invoke(lww0Var);
                    break;
                }
                break;
            default:
                tls tlsVar8 = (tls) obj2;
                puz0 puz0Var = (puz0) obj;
                if (z) {
                    tlsVar8.invoke(puz0Var);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ex0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = z;
    }

    public /* synthetic */ ex0(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.w = obj2;
    }

    public /* synthetic */ ex0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj2;
        this.w = obj3;
        this.b = z;
    }

    public /* synthetic */ ex0(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.w = obj2;
    }
}
