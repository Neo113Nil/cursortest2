package defpackage;

import com.yandex.go.inapp_calls.InAppCallsDynamicApi;
import com.yandex.go.inapp_calls.analytics.InAppCallsAnalytics$ErrorType;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$CallType;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$Reason;
import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$Source;
import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes.dex */
public final class njv implements yiv {
    public static volatile boolean f;
    public static volatile boolean g;
    public final lx4 a;
    public final mjv b;
    public final npv c;
    public final kjv d = new kjv(this);
    public final ljv e = new ljv(this, "PermissionsDialog");

    public njv(lx4 lx4Var, mjv mjvVar, npv npvVar) {
        this.a = lx4Var;
        this.b = mjvVar;
        this.c = npvVar;
    }

    public static String a(DefaultOutgoingCallType defaultOutgoingCallType) {
        int i = ijv.a[defaultOutgoingCallType.ordinal()];
        if (i == 1) {
            return "voip";
        }
        if (i == 2) {
            return "phone";
        }
        if (i == 3) {
            return "ask";
        }
        w511.b();
        return null;
    }

    public static void h(InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType) {
        xby.l(jst.e, g8e.o("InAppCalls.Error.", inAppCallsAnalytics$ErrorType.getAnalyticsName()), null, null, inAppCallsAnalytics$ErrorType.getAnalyticsName(), 6);
    }

    public static void i(Throwable th) {
        String message;
        if (!(th instanceof InAppCallsDynamicApi.InAppCallException)) {
            hst hstVar = jst.e;
            String message2 = th.getMessage();
            xby.l(hstVar, "InAppCalls.Error.OTHER", null, th, message2 == null ? "" : message2, 2);
        } else {
            hst hstVar2 = jst.e;
            InAppCallsDynamicApi.InAppCallException inAppCallException = (InAppCallsDynamicApi.InAppCallException) th;
            String o = g8e.o("InAppCalls.Error.", inAppCallException.getAnalyticsName());
            Throwable cause = th.getCause();
            xby.l(hstVar2, o, null, inAppCallException, (cause == null || (message = cause.getMessage()) == null) ? "" : message, 2);
        }
    }

    public final void b(String str, String str2, boolean z) {
        k("ForceUpdate", "Start", new Pair[0]);
        if (str == null) {
            str = "";
        }
        InAppCallsAnalytics$Reason inAppCallsAnalytics$Reason = z ? InAppCallsAnalytics$Reason.Notification : InAppCallsAnalytics$Reason.OutgoingCall;
        mjv mjvVar = this.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("forwarding_id", str);
        if (str2 != null) {
            hashMap.put("linkage_id", str2);
        }
        if (inAppCallsAnalytics$Reason != null) {
            hashMap.put(CRLReasonCodeExtension.REASON, inAppCallsAnalytics$Reason.getEventValue());
        }
        mjvVar.a.a("InAppCalls.DynamicFeatureDownload.Started", hashMap, 2, new HashMap());
    }

    public final void c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        InAppCallsAnalytics$CallType inAppCallsAnalytics$CallType = z4 ? InAppCallsAnalytics$CallType.Inapp : InAppCallsAnalytics$CallType.Phone;
        if (str == null) {
            str = "";
        }
        Boolean valueOf = Boolean.valueOf(z3);
        mjv mjvVar = this.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("call_type", inAppCallsAnalytics$CallType.getEventValue());
        hashMap.put("linkage_id", str2);
        oo31.q(z, hashMap, "auto", z2, "is_remember_option_enabled");
        hashMap.put("is_permission_granted", valueOf);
        hashMap.put("forwarding_id", str);
        mjvVar.a.a("InAppCalls.CallSelection.Selected", hashMap, 2, new HashMap());
    }

    public final void d(String str, String str2, boolean z) {
        if (str == null) {
            str = "";
        }
        mjv mjvVar = this.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("forwarding_id", str);
        if (str2 != null) {
            hashMap.put("linkage_id", str2);
        }
        mjvVar.a.a("InAppCalls.DynamicFeature.Check", hashMap, 2, x4e.r(z, hashMap, "available"));
    }

    public final void e(boolean z, boolean z2, String str, String str2) {
        if (str == null) {
            str = "";
        }
        InAppCallsAnalytics$Reason inAppCallsAnalytics$Reason = z2 ? InAppCallsAnalytics$Reason.Notification : InAppCallsAnalytics$Reason.OutgoingCall;
        mjv mjvVar = this.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("forwarding_id", str);
        if (str2 != null) {
            hashMap.put("linkage_id", str2);
        }
        if (inAppCallsAnalytics$Reason != null) {
            hashMap.put(CRLReasonCodeExtension.REASON, inAppCallsAnalytics$Reason.getEventValue());
        }
        mjvVar.a.a("InAppCalls.DynamicFeatureDownload.Finished", hashMap, 2, x4e.r(z, hashMap, "success"));
    }

    public final void f(String str, String str2, String str3, InAppCallsAnalytics$Source inAppCallsAnalytics$Source) {
        mjv mjvVar = this.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("call_guid", str);
        }
        if (str2 != null) {
            hashMap.put("call_platform_id", str2);
        }
        if (inAppCallsAnalytics$Source != null) {
            hashMap.put("source", inAppCallsAnalytics$Source.getEventValue());
        }
        if (str3 != null) {
            hashMap.put("linkage_id", str3);
        }
        mjvVar.a.a("InAppCalls.IncomingCallPush.Ignored", hashMap, 2, new HashMap());
    }

    public final void g(String str, String str2, String str3, InAppCallsAnalytics$Source inAppCallsAnalytics$Source) {
        mjv mjvVar = this.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("call_guid", str);
        }
        if (str2 != null) {
            hashMap.put("call_platform_id", str2);
        }
        if (inAppCallsAnalytics$Source != null) {
            hashMap.put("source", inAppCallsAnalytics$Source.getEventValue());
        }
        if (str3 != null) {
            hashMap.put("linkage_id", str3);
        }
        mjvVar.a.a("InAppCalls.IncomingCallPush.Received", hashMap, 3, new HashMap());
    }

    public final void j(String str, InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason, String str2) {
        mjv mjvVar = this.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("forwarding_id", str2);
        }
        hashMap.put("linkage_id", str);
        hashMap.put(CRLReasonCodeExtension.REASON, inAppCallsAnalytics$PhoneCallFallbackReason.getEventValue());
        mjvVar.a.a("InAppCalls.PhoneCall.Fallback", hashMap, 1, new HashMap());
    }

    public final void k(String str, String str2, Pair... pairArr) {
        i d = ((j) this.a).d(b64.l("InAppCalls.", str, Extension.DOT_CHAR, str2));
        Map u = b.u(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(u.size()));
        for (Map.Entry entry : u.entrySet()) {
            linkedHashMap.put(((ic90) entry.getKey()).b(), entry.getValue());
        }
        d.h(linkedHashMap);
        d.m();
    }
}
