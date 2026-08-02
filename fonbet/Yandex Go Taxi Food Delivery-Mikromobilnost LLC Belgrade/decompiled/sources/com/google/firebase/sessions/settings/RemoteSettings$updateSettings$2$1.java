package com.google.firebase.sessions.settings;

import android.util.Log;
import defpackage.e7z0;
import defpackage.mvg;
import defpackage.myq0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.wls;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lzy11;", "<anonymous>", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteSettings$updateSettings$2$1) create((JSONObject) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Double d;
        Integer num;
        c cVar;
        myq0 myq0Var;
        JSONException jSONException;
        Integer num2;
        Double d2;
        Boolean bool2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Integer num3 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Objects.toString(jSONObject);
            if (jSONObject.has("app_quality")) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("app_quality");
                try {
                    bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                        } catch (JSONException e) {
                            jSONException = e;
                            num2 = null;
                        }
                    } catch (JSONException e2) {
                        jSONException = e2;
                        num2 = null;
                        d2 = null;
                    }
                } catch (JSONException e3) {
                    jSONException = e3;
                    num2 = null;
                    d2 = null;
                    bool2 = null;
                }
                try {
                    if (jSONObject2.has("cache_duration")) {
                        num3 = (Integer) jSONObject2.get("cache_duration");
                    }
                } catch (JSONException e4) {
                    jSONException = e4;
                    qje.e(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", jSONException));
                    num = num2;
                    d = d2;
                    bool = bool2;
                    cVar = this.this$0.e;
                    if (num3 == null) {
                    }
                    this.this$0.a.getClass();
                    myq0Var = new myq0(bool, d, num, new Integer(r0), new Long(e7z0.a().c));
                    this.label = 1;
                    if (cVar.c(myq0Var, this) == coroutineSingletons) {
                    }
                    return zy11.a;
                }
                num = num2;
                d = d2;
                bool = bool2;
            } else {
                bool = null;
                d = null;
                num = null;
            }
            cVar = this.this$0.e;
            int intValue = num3 == null ? num3.intValue() : a.g;
            this.this$0.a.getClass();
            myq0Var = new myq0(bool, d, num, new Integer(intValue), new Long(e7z0.a().c));
            this.label = 1;
            if (cVar.c(myq0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
