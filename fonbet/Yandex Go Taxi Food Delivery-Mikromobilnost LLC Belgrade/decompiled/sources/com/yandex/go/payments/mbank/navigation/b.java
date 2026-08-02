package com.yandex.go.payments.mbank.navigation;

import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import defpackage.ag41;
import defpackage.ff41;
import defpackage.g9a0;
import defpackage.gf41;
import defpackage.h4a0;
import defpackage.h55;
import defpackage.if0;
import defpackage.nf0;
import defpackage.ny61;
import defpackage.pne;
import defpackage.scg;
import defpackage.sq41;
import defpackage.tje;
import defpackage.tls;
import defpackage.wi0;
import defpackage.wnt;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.zi0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final nf0 D;
    public final wnt E;
    public final y50 F;
    public final zuj0 G;
    public final gf41 H;
    public final h4a0 I;
    public final g9a0 J;
    public final yvf0 K;
    public final o L;
    public final wi0 M;
    public final BindUniversalPaymentMethodApi N;
    public zi0 O;

    public b(nf0 nf0Var, wnt wntVar, y50 y50Var, zuj0 zuj0Var, gf41 gf41Var, h4a0 h4a0Var, g9a0 g9a0Var, yvf0 yvf0Var, o oVar, wi0 wi0Var, BindUniversalPaymentMethodApi bindUniversalPaymentMethodApi) {
        super(null);
        this.D = nf0Var;
        this.E = wntVar;
        this.F = y50Var;
        this.G = zuj0Var;
        this.H = gf41Var;
        this.I = h4a0Var;
        this.J = g9a0Var;
        this.K = yvf0Var;
        this.L = oVar;
        this.M = wi0Var;
        this.N = bindUniversalPaymentMethodApi;
    }

    public static final String P(b bVar, WebviewBindingFlow.PaymentMethodBindResponseSignal paymentMethodBindResponseSignal, Map map, WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action action) {
        Object obj;
        String str;
        h4a0 h4a0Var = bVar.I;
        h4a0Var.getClass();
        h4a0Var.a.a("PaymentMethod.AddMBank.Info", new HashMap(), 1, new HashMap());
        Iterator it = paymentMethodBindResponseSignal.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((WebviewBindingFlow.PaymentMethodBindResponseSignalParam) obj).b == action) {
                break;
            }
        }
        WebviewBindingFlow.PaymentMethodBindResponseSignalParam paymentMethodBindResponseSignalParam = (WebviewBindingFlow.PaymentMethodBindResponseSignalParam) obj;
        if (paymentMethodBindResponseSignalParam == null || (str = paymentMethodBindResponseSignalParam.a) == null) {
            return null;
        }
        return (String) map.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0111, code lost:
    
        if (kotlinx.coroutines.a.i(r8, r2) == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(b bVar, ff41 ff41Var, String str, WebviewBindingFlow webviewBindingFlow, ContinuationImpl continuationImpl) {
        AddMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1 addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1;
        int i;
        ff41 ff41Var2;
        WebviewBindingFlow webviewBindingFlow2;
        pne pneVar;
        bVar.getClass();
        if (continuationImpl instanceof AddMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1) {
            addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1 = (AddMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1) continuationImpl;
            int i2 = addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = bVar.L;
                    AuthType authType = AuthType.COOKIES;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$0 = ff41Var;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$1 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$2 = webviewBindingFlow;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.label = 1;
                    obj = oVar.b(str, authType, addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1);
                    if (obj != coroutineSingletons) {
                        ff41Var2 = ff41Var;
                        webviewBindingFlow2 = webviewBindingFlow;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    zi0 zi0Var = bVar.O;
                    if (zi0Var != null) {
                        zi0Var.i();
                    }
                    return zy11.a;
                }
                webviewBindingFlow2 = (WebviewBindingFlow) addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$2;
                ff41Var2 = (ff41) addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$0;
                kotlin.b.b(obj);
                pneVar = !(obj instanceof pne) ? (pne) obj : null;
                if (pneVar != null) {
                    ny61.k();
                    return null;
                }
                zzz zzzVar = new zzz(new a(bVar, webviewBindingFlow2, ff41Var2));
                CoreWebViewConfig.Companion.getClass();
                CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                aVar.b = pneVar.a;
                aVar.a = new sq41(zzzVar, "mBankAccount");
                ((ag41) ((scg) ff41Var2).a()).a(new UiWebViewConfig(aVar.a(), null, true, false, false, false, null, false, true, null, false, false, null, null, null, 1, 0, false, false, null, false, false, 4030202, null));
                long j = webviewBindingFlow2.e * 1000;
                if (j > 0) {
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$0 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$1 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$2 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$3 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$4 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$5 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.L$6 = null;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.J$0 = j;
                    addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.label = 2;
                }
                return zy11.a;
            }
        }
        addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1 = new AddMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1(bVar, continuationImpl);
        Object obj2 = addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addMBankAccountBaseRouter$updateAddMBankAccountWebConfig$1.label;
        if (i != 0) {
        }
        if (!(obj2 instanceof pne)) {
        }
        if (pneVar != null) {
        }
    }

    public static void R(b bVar, WebviewBindingFlow webviewBindingFlow, tls tlsVar, int i) {
        tje.N(bVar.o(), null, null, new AddMBankAccountBaseRouter$withSpinner$1((i & 1) != 0 ? null : webviewBindingFlow, bVar, tlsVar, null, null), 3);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new AddMBankAccountBaseRouter$onLaunch$1(this, (if0) obj, null), 3);
    }
}
