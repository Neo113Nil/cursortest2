package com.yandex.go.platform.deeplink;

import com.yandex.go.platform.web_api.JsExternalNavigationInfo;
import com.yandex.go.platform.web_api.NavigationType;
import com.yandex.go.platform.web_api.data.Payload$Deeplink;
import com.yandex.go.platform.web_api.data.Payload$RawObject;
import com.yandex.go.platform.web_api.data.c;
import defpackage.b64;
import defpackage.cvu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qbx;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.tse;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.deeplink.DeeplinkHandler$sendPayloadToFront$1", f = "DeeplinkHandler.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DeeplinkHandler$sendPayloadToFront$1 extends SuspendLambda implements wls {
    final /* synthetic */ c $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkHandler$sendPayloadToFront$1(a aVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkHandler$sendPayloadToFront$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkHandler$sendPayloadToFront$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.platform.js_api.c cVar = (com.yandex.go.platform.js_api.c) this.this$0.e.invoke();
            this.label = 1;
            if (cVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        qbx qbxVar = (qbx) this.this$0.f.invoke();
        c cVar2 = this.$payload;
        qbxVar.getClass();
        if (cVar2 instanceof Payload$Deeplink) {
            Payload$Deeplink payload$Deeplink = (Payload$Deeplink) cVar2;
            JsExternalNavigationInfo jsExternalNavigationInfo = new JsExternalNavigationInfo(payload$Deeplink.b ? NavigationType.INTERNAL_DEEPLINK : NavigationType.EXTERNAL_DEEPLINK, payload$Deeplink.a);
            rbx rbxVar = sbx.d;
            rbxVar.getClass();
            p = rbxVar.c(jsExternalNavigationInfo, JsExternalNavigationInfo.Companion.serializer());
        } else {
            if (!(cVar2 instanceof Payload$RawObject)) {
                w511.b();
                return null;
            }
            LinkedHashMap c = com.yandex.go.platform.utils.b.c(new JSONObject(((Payload$RawObject) cVar2).a));
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : c.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    Map map = (Map) value;
                    if (jSONObject.opt(str) == null) {
                        jSONObject.put(str, kotlin.collections.b.f());
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key = entry2.getKey();
                        Object value2 = entry2.getValue();
                        String obj2 = key != null ? key.toString() : null;
                        String obj3 = value2 != null ? value2.toString() : null;
                        if (obj2 != null && obj3 != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(obj3);
                                Object opt = jSONObject.opt(str);
                                JSONObject jSONObject3 = opt instanceof JSONObject ? (JSONObject) opt : null;
                                if (jSONObject3 != null) {
                                    jSONObject3.put(obj2, jSONObject2);
                                }
                            } catch (JSONException unused) {
                                Object opt2 = jSONObject.opt(str);
                                JSONObject jSONObject4 = opt2 instanceof JSONObject ? (JSONObject) opt2 : null;
                                if (jSONObject4 == null) {
                                    jSONObject4 = new JSONObject();
                                    jSONObject.put(str, jSONObject4);
                                }
                                jSONObject4.put(obj2, obj3);
                            }
                        }
                    }
                } else if (value instanceof String) {
                    jSONObject.put(str, value);
                } else {
                    Objects.toString(value);
                }
            }
            String b = com.yandex.go.platform.utils.b.b(com.yandex.go.platform.utils.b.c(jSONObject));
            NavigationType navigationType = NavigationType.PUSH;
            String l = unr0.l('}', "{", b);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type", navigationType.name().toLowerCase(Locale.ROOT));
            jSONObject5.put("payload", l);
            p = b64.p(new StringBuilder("{"), cvu0.v(com.yandex.go.platform.utils.b.b(com.yandex.go.platform.utils.b.c(jSONObject5)), "\n", "\\\\n", false), '}');
        }
        qbxVar.a.evaluateJavascript("window.externalNavigation(" + p + ')', null);
        return zy11.a;
    }
}
