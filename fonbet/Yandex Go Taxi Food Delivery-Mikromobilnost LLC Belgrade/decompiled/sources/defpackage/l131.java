package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.node.d;
import androidx.compose.ui.viewinterop.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorView;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.c;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.a;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.screens.initial.InitialFragmentScreenParams;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.n0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final /* synthetic */ class l131 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l131(kt60 kt60Var, int i) {
        this.a = 3;
        this.b = kt60Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        zy11 verticalsView$lambda$0;
        String str;
        InternalSdkState internalSdkState;
        int i = this.a;
        int i2 = 14;
        o430 o430Var = did.a;
        boolean z = false;
        boolean z2 = true;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((lhn) obj3).a.put((String) obj2, (y3x) obj);
                return zy11Var;
            case 1:
                GoFrameLayout goFrameLayout = (GoFrameLayout) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    boolean e = btsVar.e(goFrameLayout);
                    Object Q = btsVar.Q();
                    if (e || Q == o430Var) {
                        Q = new x240(15, goFrameLayout);
                        btsVar.o0(Q);
                    }
                    b.a((tls) Q, c530.a, null, btsVar, 48, 4);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 2:
                FrameLayout frameLayout = (FrameLayout) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean e2 = btsVar2.e(frameLayout);
                    Object Q2 = btsVar2.Q();
                    if (e2 || Q2 == o430Var) {
                        Q2 = new x240(i2, frameLayout);
                        btsVar2.o0(Q2);
                    }
                    b.a((tls) Q2, null, null, btsVar2, 0, 6);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                a8a1.e((kt60) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                verticalsView$lambda$0 = VerticalTariffSelectorView.verticalsView$lambda$0((VerticalTariffSelectorView) obj3, ((Integer) obj).intValue(), (ob31) obj2);
                return verticalsView$lambda$0;
            case 5:
                o9z0 o9z0Var = (o9z0) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                boolean V = btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2);
                dmw0 dmw0Var = btsVar3.a;
                if (V) {
                    c530 c530Var = c530.a;
                    f530 c = ljs0.c(c530Var, 1.0f);
                    sic a = qic.a(lr20.c, x4c.G, btsVar3, 0);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d = androidx.compose.ui.b.d(btsVar3, c);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar3, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar3, wlsVar2, o);
                    wls wlsVar3 = d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar3, hashCode, wlsVar3);
                    }
                    wls wlsVar4 = d.d;
                    qje.W(btsVar3, wlsVar4, d);
                    f530 e3 = ljs0.e(ljs0.c(c530Var, 1.0f), 60.0f);
                    Object Q3 = btsVar3.Q();
                    if (Q3 == o430Var) {
                        Q3 = new ke31(10);
                        btsVar3.o0(Q3);
                    }
                    f530 b = fnq0.b(e3, false, (tls) Q3);
                    z910 d2 = pi6.d(x4c.b, false);
                    int hashCode2 = Long.hashCode(btsVar3.T);
                    r1b0 o2 = btsVar3.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar3, b);
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, wlsVar, d2);
                    qje.W(btsVar3, wlsVar2, o2);
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar3, hashCode2, wlsVar3);
                    }
                    qje.W(btsVar3, wlsVar4, d3);
                    ymb1.j(o9z0Var.a, an91.o(c530Var, 16.0f, 20.0f, 16.0f, 0.0f, 8), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 4, null, null, btsVar3, 24624, HProv.ALG_TYPE_SECURECHANNEL, 57324);
                    btsVar3.t(true);
                    w9z0 w9z0Var = o9z0Var.b;
                    if (w9z0Var == null) {
                        btsVar3.e0(-1700865945);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-1700865944);
                        f530 n = an91.n(c530Var, 16.0f, 8.0f, 16.0f, 16.0f);
                        Object Q4 = btsVar3.Q();
                        if (Q4 == o430Var) {
                            Q4 = new ke31(8);
                            btsVar3.o0(Q4);
                        }
                        ru.yandex.taxi.logistics.sdk.ui.component.misc.b.c(n, w9z0Var, (tls) Q4, false, 0L, null, btsVar3, 3456, 48);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 6:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                int intValue4 = ((Integer) obj).intValue();
                View view = (View) obj2;
                boolean z3 = view.getForeground() != null;
                if (intValue4 > ref$IntRef.element && view.getVisibility() == 0 && view.getAlpha() > 0.0f && (view.getBackground() != null || z3)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                ((n0) obj3).g(new b841(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
                return zy11Var;
            case 8:
                bo41 bo41Var = (bo41) obj3;
                String str2 = (String) obj;
                List list = (List) obj2;
                Integer num = (str2.hashCode() == 42 && str2.equals("*")) ? bo41Var.f : (Integer) bo41Var.c.get(str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    ((v221) obj4).getClass();
                    arrayList.add(obj4);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v221 v221Var = (v221) it.next();
                    v221Var.c(bo41Var.e(v221Var, num));
                }
                return zy11Var;
            default:
                lu51 lu51Var = (lu51) obj3;
                np51 np51Var = lu51Var.a;
                OpenScreenRequirement openScreenRequirement = (OpenScreenRequirement) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (openScreenRequirement instanceof OpenScreenRequirement.WithoutRequirements) {
                    x4c.g("WithoutRequirements should not call method", null, null, null, 14);
                } else {
                    DeeplinkNavigation deeplinkNavigation = booleanValue ? DeeplinkNavigation.Replace.INSTANCE : DeeplinkNavigation.Add.INSTANCE;
                    if (a.b(openScreenRequirement) && lu51Var.d.m().getValue() == null) {
                        i5z0.a.a("resolve requirement and navigate to authlanding", new Object[0]);
                        ((l3h) ((j3h) lu51Var.b.get())).d(com.ybsdk.feature.deeplink.api.a.a(DeeplinkAction.AuthLanding.INSTANCE, deeplinkNavigation));
                    } else {
                        boolean z4 = a.c(openScreenRequirement) && ((internalSdkState = np51Var.b) == null || !c.a(internalSdkState));
                        if (a.a(openScreenRequirement)) {
                            if (np51Var.a()) {
                                InternalSdkState internalSdkState2 = np51Var.b;
                                if (internalSdkState2 != null) {
                                    str = c.c(internalSdkState2);
                                    break;
                                } else {
                                    str = null;
                                    break;
                                }
                            }
                            if (!z4 || z2) {
                                i5z0.a.a("resolve requirement and navigate to initial screen", new Object[0]);
                                com.ybsdk.screens.initial.a aVar = lu51Var.c;
                                InitialFragmentScreenParams.Default r2 = new InitialFragmentScreenParams.Default(false);
                                aVar.getClass();
                                FragmentScreen b2 = com.ybsdk.screens.initial.a.b(r2);
                                com.ybsdk.core.navigation.cicerone.b bVar = lu51Var.f;
                                if (booleanValue) {
                                    (bVar != null ? bVar : null).h(b2);
                                } else {
                                    (bVar != null ? bVar : null).l(b2);
                                }
                            }
                        }
                        z2 = false;
                        if (!z4) {
                        }
                        i5z0.a.a("resolve requirement and navigate to initial screen", new Object[0]);
                        com.ybsdk.screens.initial.a aVar2 = lu51Var.c;
                        InitialFragmentScreenParams.Default r22 = new InitialFragmentScreenParams.Default(false);
                        aVar2.getClass();
                        FragmentScreen b22 = com.ybsdk.screens.initial.a.b(r22);
                        com.ybsdk.core.navigation.cicerone.b bVar2 = lu51Var.f;
                        if (booleanValue) {
                        }
                    }
                }
                return zy11Var;
        }
    }

    public /* synthetic */ l131(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
