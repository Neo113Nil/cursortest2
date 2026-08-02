package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackSupportEntity;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackTelemostEntity;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackTelemostRequest;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackToolsEntity;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import io.appmetrica.analytics.AppMetricaYandex;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes15.dex */
public final class hoq0 extends ky4 {
    public final dh7 y;

    public hoq0(ChatRequest chatRequest, dh7 dh7Var) {
        super(chatRequest);
        this.y = dh7Var;
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        if (hrVar instanceof hoq0) {
            return Objects.equals(this.y.a, ((hoq0) hrVar).y.a);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01fe, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0252, code lost:
    
        if (r10 == null) goto L42;
     */
    @Override // defpackage.b9b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(j3b j3bVar, s020 s020Var) {
        String str;
        w4b0 w4b0Var;
        kl7 kl7Var = (kl7) ((m8g) s020Var).j0.get();
        o1b0 o1b0Var = kl7Var.a;
        jl21 jl21Var = kl7Var.j;
        k020 k020Var = kl7Var.f;
        bbj bbjVar = kl7Var.d;
        q6v q6vVar = kl7Var.e;
        ml21 ml21Var = kl7Var.c;
        dh7 dh7Var = this.y;
        String str2 = dh7Var.f;
        String str3 = dh7Var.e;
        int i = dh7Var.b;
        String str4 = dh7Var.a;
        Integer num = dh7Var.g;
        Looper looper = kl7Var.h;
        z83.g(null, looper, Looper.myLooper());
        w3i w3iVar = kl7Var.i;
        z83.g(null, looper, Looper.myLooper());
        Set set = dh7Var.c;
        Set set2 = dh7Var.d;
        HashSet hashSet = new HashSet(set.size());
        for (Iterator it = set.iterator(); it.hasNext(); it = it) {
            hashSet.add(((CallFeedbackReason) it.next()).name);
        }
        HashSet hashSet2 = new HashSet(set2.size());
        for (Iterator it2 = set2.iterator(); it2.hasNext(); it2 = it2) {
            hashSet2.add(((CallFeedbackReason) it2.next()).name);
        }
        CallFeedbackToolsEntity callFeedbackToolsEntity = new CallFeedbackToolsEntity();
        callFeedbackToolsEntity.userGuid = ml21Var.a;
        callFeedbackToolsEntity.callGuid = str4;
        callFeedbackToolsEntity.score = i;
        callFeedbackToolsEntity.details = str3;
        callFeedbackToolsEntity.audioReasons = (String[]) hashSet.toArray(new String[0]);
        callFeedbackToolsEntity.videoReasons = (String[]) hashSet2.toArray(new String[0]);
        callFeedbackToolsEntity.environment = (String) kl7Var.b.c(new g5o());
        callFeedbackToolsEntity.meetingId = str2;
        callFeedbackToolsEntity.callEndedReason = num != null ? pdb1.a(num.intValue()) : null;
        Moshi moshi = (Moshi) w3iVar.y;
        xf7 xf7Var = (xf7) w3iVar.b;
        String str5 = (String) w3iVar.x;
        fzq fzqVar = new fzq(moshi.adapter(CallFeedbackToolsEntity.class), callFeedbackToolsEntity);
        t4j0 b = w3iVar.b();
        b.e("POST", fzqVar);
        xf7Var.newCall(new d5j0(b)).I(new o501(10));
        m2v m2vVar = kl7Var.g;
        m2vVar.getClass();
        Set set3 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            arrayList.add(((CallFeedbackReason) it3.next()).name);
        }
        Set set4 = set2;
        ArrayList arrayList2 = new ArrayList(tcc.n(set4, 10));
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((CallFeedbackReason) it4.next()).name);
        }
        LinkedHashMap l = b.l(new Pair("datetime", ((SimpleDateFormat) m2vVar.w).format(new Date())), new Pair("call_guid", str4), new Pair("user_guid", ((ml21) m2vVar.b).a), new Pair("session_id", (String) m2vVar.c), new Pair("meeting_id", str2), new Pair("meeting_end_reason", num), new Pair("score", Integer.valueOf(i)), new Pair(IssuingDistributionPointExtension.REASONS, a.J0(a.m0(arrayList2, arrayList))));
        if (str3 != null) {
            l.put("text", str3);
        }
        ((x22) m2vVar.a).reportEvent("RTC_USER_CALL_QUALITY_SCORE", l);
        CallFeedbackSupportEntity callFeedbackSupportEntity = new CallFeedbackSupportEntity();
        x4b0 A = k020Var.A();
        String str6 = "-";
        if (A != null && (str = A.e) != null) {
            if (str.length() <= 0) {
                str = null;
            }
        }
        str = "-";
        callFeedbackSupportEntity.login = str;
        bbjVar.getClass();
        Context context = bbjVar.a;
        callFeedbackSupportEntity.os = g8e.o("android ", String.valueOf(Build.VERSION.SDK_INT));
        callFeedbackSupportEntity.appVersion = vqb1.d(context);
        callFeedbackSupportEntity.device = g8e.p(Build.MANUFACTURER, " ", Build.MODEL);
        callFeedbackSupportEntity.client = "Android";
        callFeedbackSupportEntity.score = i;
        callFeedbackSupportEntity.guid = ml21Var.a;
        callFeedbackSupportEntity.callGuid = str4;
        gm51 gm51Var = (gm51) q6vVar;
        Context context2 = gm51Var.a;
        Context context3 = gm51Var.a;
        callFeedbackSupportEntity.uuid = AppMetricaYandex.getUuid(context2);
        callFeedbackSupportEntity.deviceId = AppMetricaYandex.getDeviceId(context3);
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
        }
        str3 = "-";
        callFeedbackSupportEntity.details = str3;
        String a = jl21Var.a();
        if (a != null) {
            if (a.length() <= 0) {
                a = null;
            }
            if (a != null) {
                str6 = a;
            }
        }
        callFeedbackSupportEntity.email = str6;
        callFeedbackSupportEntity.meetingId = str2;
        callFeedbackSupportEntity.callEndReason = num != null ? pdb1.a(num.intValue()) : null;
        callFeedbackSupportEntity.service = Collections.singletonList("10294459");
        callFeedbackSupportEntity.messageSubject = Collections.singletonList("10294469");
        Boolean bool = dh7Var.h;
        callFeedbackSupportEntity.isInitiator = bool != null ? bool.toString() : null;
        Long l2 = dh7Var.i;
        callFeedbackSupportEntity.timestamp = l2 != null ? l2.toString() : null;
        callFeedbackSupportEntity.chatId = o1b0Var.b;
        fzq fzqVar2 = new fzq(moshi.adapter(CallFeedbackSupportEntity.class), callFeedbackSupportEntity);
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h("https://forms-ext-api.yandex.ru/v3/surveys/9481/form/");
        t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str5);
        t4j0Var.c.a("Content-Type", "application/json");
        t4j0Var.e("POST", fzqVar2);
        xf7Var.newCall(new d5j0(t4j0Var)).I(new o501(10));
        x4b0 A2 = k020Var.A();
        LinkedHashSet h = v4r0.h(set, set4);
        ArrayList arrayList3 = new ArrayList(tcc.n(h, 10));
        Iterator it5 = h.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((CallFeedbackReason) it5.next()).name);
        }
        fzq fzqVar3 = new fzq(moshi.adapter(CallFeedbackTelemostRequest.class), new CallFeedbackTelemostRequest(new CallFeedbackTelemostEntity(null, dh7Var.f, ml21Var.a, null, vqb1.d(context), A2 != null ? A2.i : false, (A2 == null || (w4b0Var = (w4b0) a.R(A2.a())) == null) ? null : Long.valueOf(w4b0Var.a).toString(), dh7Var.b, arrayList3, dh7Var.e, A2 != null ? A2.e : null, g8e.o("android ", String.valueOf(Build.VERSION.SDK_INT)), g8e.p(Build.MANUFACTURER, " ", Build.MODEL), null, dh7Var.a, AppMetricaYandex.getUuid(context3), AppMetricaYandex.getDeviceId(context3), jl21Var.a(), num != null ? pdb1.a(num.intValue()) : null, dh7Var.h, dh7Var.i, o1b0Var.b, 8201, null)));
        t4j0 t4j0Var2 = new t4j0();
        gsu gsuVar = (gsu) w3iVar.z;
        t4j0Var2.h("https://" + ((String) gsuVar.a.c(gsuVar.f)) + "/v1/telemost/stat/log");
        t4j0Var2.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str5);
        String string = ((SharedPreferences) w3iVar.A).getString("oauth_token", null);
        if (string != null) {
            t4j0Var2.a("Authorization", "OAuth ".concat(string));
        }
        t4j0Var2.e("POST", fzqVar3);
        xf7Var.newCall(new d5j0(t4j0Var2)).I(new o501(10));
        h();
    }
}
