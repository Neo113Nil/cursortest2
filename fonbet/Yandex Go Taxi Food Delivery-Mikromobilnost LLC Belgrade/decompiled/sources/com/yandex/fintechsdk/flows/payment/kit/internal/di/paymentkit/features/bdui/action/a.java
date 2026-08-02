package com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action;

import android.os.Parcelable;
import androidx.lifecycle.p;
import com.yandex.fintechsdk.flows.payment.kit.api.model.BoundCard;
import com.yandex.fintechsdk.flows.payment.kit.api.model.BoundSbpToken;
import com.yandex.fintechsdk.flows.payment.kit.api.model.GooglePay;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedCardMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedGooglePayMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedNewSbpTokenMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodContext;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedSbpQrMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedSbpTokenMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedYBMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.c;
import com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import defpackage.b451;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.hh5;
import defpackage.icq0;
import defpackage.jcq0;
import defpackage.lcq0;
import defpackage.lg5;
import defpackage.lz40;
import defpackage.q3a0;
import defpackage.s2a0;
import defpackage.scc;
import defpackage.tje;
import defpackage.v2a0;
import defpackage.z22;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class a extends lg5 {
    public final z22 a;
    public final v2a0 b;
    public final p c;
    public final hh5 d;
    public final s2a0 e;
    public final Scenario f;
    public final lz40 g;
    public final com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.a h;

    public a(z22 z22Var, v2a0 v2a0Var, p pVar, hh5 hh5Var, s2a0 s2a0Var, Scenario scenario, lz40 lz40Var, com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.a aVar) {
        this.a = z22Var;
        this.b = v2a0Var;
        this.c = pVar;
        this.d = hh5Var;
        this.e = s2a0Var;
        this.f = scenario;
        this.g = lz40Var;
        this.h = aVar;
    }

    @Override // defpackage.lg5
    public final void a(Map map, String str, Map map2) {
        Object obj;
        s2a0 s2a0Var = this.e;
        FinishFlowStatus.Companion.getClass();
        Iterator<E> it = FinishFlowStatus.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (cvu0.t(((FinishFlowStatus) obj).name(), str, true)) {
                    break;
                }
            }
        }
        FinishFlowStatus finishFlowStatus = (FinishFlowStatus) obj;
        if (finishFlowStatus == null) {
            finishFlowStatus = FinishFlowStatus.UNKNOWN;
        }
        q3a0 q3a0Var = new q3a0(finishFlowStatus, map, s2a0Var.a().c);
        s2a0Var.c = q3a0Var;
        s2a0Var.a.g(q3a0Var);
    }

    @Override // defpackage.lg5
    public final void b(String str, Map map) {
        String str2;
        Parcelable googlePay;
        if (str.equals("update_widget")) {
            String str3 = map != null ? (String) map.get("widget_type") : null;
            LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            linkedHashMap.remove("widget_type");
            this.h.b.a.g(new b451(str3, linkedHashMap));
            return;
        }
        if (!str.equalsIgnoreCase("binding_success") && !str.equalsIgnoreCase("didBoundCard") && (!evu0.y(str, "boundCard", true) || !evu0.y(str, "success", true))) {
            if (map != null) {
                Scenario scenario = this.f;
                if (scenario instanceof Scenario.TransportCards) {
                    tje.N(this.c, null, null, new BduiActionsDelegateImpl$sendExternalEvent$1(this, str, map, null), 3);
                    return;
                } else {
                    if (scenario instanceof Scenario.DynamicLinkFlow) {
                        tje.N(this.c, null, null, new BduiActionsDelegateImpl$sendExternalEvent$2(this, str, map, null), 3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (map == null || (str2 = (String) map.get("binding_id")) == null) {
            str2 = map != null ? (String) map.get("bindingId") : null;
        }
        if (str2 == null) {
            return;
        }
        Scenario scenario2 = this.f;
        if (scenario2 instanceof Scenario.CardBinding) {
            googlePay = new BoundCard(str2);
        } else if (scenario2 instanceof Scenario.SbpTokenBinding) {
            googlePay = new BoundSbpToken(str2);
        } else if (!(scenario2 instanceof Scenario.GooglePlayBinding)) {
            return;
        } else {
            googlePay = new GooglePay(str2);
        }
        this.e.c = new q3a0(FinishFlowStatus.SUCCESS, null, googlePay);
    }

    @Override // defpackage.lg5
    public final void c(String str, Map map) {
        Parcelable parcelable;
        if (str.equalsIgnoreCase("payment_method_selected")) {
            LinkedHashMap linkedHashMap = null;
            Object obj = map != null ? map.get(SelectedPaymentMethodPayload.KEY_METHOD_ID) : null;
            String str2 = obj instanceof String ? (String) obj : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj2 = map != null ? map.get(SelectedPaymentMethodPayload.KEY_METHOD_TYPE) : null;
            SelectedPaymentMethodPayload selectedPaymentMethodPayload = new SelectedPaymentMethodPayload(str2, obj2 instanceof String ? (String) obj2 : null, (Map<String, ? extends Object>) (map == null ? b.f() : map));
            Scenario scenario = this.f;
            if ((scenario instanceof Scenario.SelectMethod ? (Scenario.SelectMethod) scenario : null) == null) {
                return;
            }
            z22 z22Var = this.a;
            if (selectedPaymentMethodPayload.getMethodId().length() == 0) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(icq0.c);
            }
            String methodType = selectedPaymentMethodPayload.getMethodType();
            if (methodType == null || methodType.length() == 0) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(jcq0.c);
            }
            Collection collection = (List) com.yandex.fintechsdk.flows.payment.kit.internal.model.a.m.a.get(this.b.a);
            if (collection == null) {
                collection = EmptyList.a;
            }
            Iterator it = kotlin.collections.a.m0(scc.g(new c(SelectedCardMethod.Companion), new c(SelectedSbpTokenMethod.Companion), new c(SelectedNewSbpTokenMethod.INSTANCE), new c(SelectedSbpQrMethod.INSTANCE), new c(SelectedYBMethod.Companion), new c(SelectedGooglePayMethod.Companion)), collection).iterator();
            while (true) {
                if (!it.hasNext()) {
                    parcelable = null;
                    break;
                }
                c cVar = (c) it.next();
                try {
                    parcelable = !((Boolean) cVar.a.invoke(selectedPaymentMethodPayload)).booleanValue() ? null : (Parcelable) cVar.b.invoke(selectedPaymentMethodPayload);
                } catch (Throwable th) {
                    String methodType2 = selectedPaymentMethodPayload.getMethodType();
                    if (methodType2 != null) {
                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) this.a).a(new lcq0(th.getMessage(), selectedPaymentMethodPayload.getMethodId(), methodType2, cVar.getClass().getName()));
                    }
                }
                if (parcelable != null) {
                    break;
                }
            }
            SelectedPaymentMethodContext selectedPaymentMethodContext = new SelectedPaymentMethodContext(selectedPaymentMethodPayload, parcelable);
            s2a0 s2a0Var = this.e;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
            s2a0Var.c = new q3a0(FinishFlowStatus.SUCCESS, linkedHashMap, selectedPaymentMethodContext);
        }
    }

    @Override // defpackage.lg5
    public final void d(String str, String str2, String str3) {
        FinishFlowStatus finishFlowStatus = str.equals("success") ? FinishFlowStatus.SUCCESS : FinishFlowStatus.FAIL;
        MapBuilder mapBuilder = new MapBuilder();
        if (str2 != null) {
            mapBuilder.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
        }
        if (str3 != null) {
            mapBuilder.put("reasonCode", str3);
        }
        MapBuilder j = mapBuilder.j();
        if (j.isEmpty()) {
            j = null;
        }
        s2a0 s2a0Var = this.e;
        q3a0 q3a0Var = s2a0Var.c;
        s2a0Var.c = new q3a0(finishFlowStatus, j, q3a0Var != null ? q3a0Var.c : null);
    }
}
