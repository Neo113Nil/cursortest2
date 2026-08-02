package com.ybsdk.feature.trackid.push.internal;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.OtpCodeEvents$OtpCodePushHandleResultResult;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.TrackIdPushOverrideDefaultContentConfig;
import defpackage.d5t;
import defpackage.g8e;
import defpackage.k32;
import defpackage.l0p;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.qrp0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tv3;
import defpackage.us3;
import defpackage.uyj;
import defpackage.v190;
import defpackage.wlp;
import defpackage.x4c;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.trackid.push.internal.data.a a;
    public final us3 b;
    public final tv3 c;

    public a(com.ybsdk.feature.trackid.push.internal.data.a aVar, us3 us3Var, tv3 tv3Var) {
        this.a = aVar;
        this.b = us3Var;
        this.c = tv3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        TrackIdPushContentOverrider$override$1 trackIdPushContentOverrider$override$1;
        int i;
        Object obj;
        String str;
        Object value;
        b bVar = this.c.a;
        AppAnalyticsReporter appAnalyticsReporter = this.b.a;
        if (continuationImpl instanceof TrackIdPushContentOverrider$override$1) {
            trackIdPushContentOverrider$override$1 = (TrackIdPushContentOverrider$override$1) continuationImpl;
            int i2 = trackIdPushContentOverrider$override$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackIdPushContentOverrider$override$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = trackIdPushContentOverrider$override$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackIdPushContentOverrider$override$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    bVar.getClass();
                    if (((CommonFeatureFlag) bVar.d(wlp.u0).getData()).isEnabled()) {
                        String optString = jSONObject.optString("track_id");
                        if (optString.length() == 0) {
                            obj = new Result.Failure(new IllegalStateException("no track_id found or it's empty"));
                        } else {
                            appAnalyticsReporter.O.a.a("otp_code.push.received", g8e.w(1, "track_id", optString));
                            obj = optString;
                        }
                    } else {
                        obj = new Result.Failure(new IllegalStateException("otp_push override feature is disabled"));
                    }
                    if (obj instanceof Result.Failure) {
                        return obj;
                    }
                    String str2 = (String) obj;
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    TrackIdPushContentOverrider$override$2$1 trackIdPushContentOverrider$override$2$1 = new TrackIdPushContentOverrider$override$2$1(this, str2, null);
                    trackIdPushContentOverrider$override$1.L$0 = str2;
                    trackIdPushContentOverrider$override$1.label = 1;
                    obj2 = tje.k0(mdhVar, trackIdPushContentOverrider$override$2$1, trackIdPushContentOverrider$override$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) trackIdPushContentOverrider$override$1.L$0;
                    kotlin.b.b(obj2);
                }
                value = ((Result) obj2).getValue();
                if (value instanceof Result.Failure) {
                    d5t d5tVar = (d5t) value;
                    for (k32 k32Var : d5tVar.b) {
                        appAnalyticsReporter.b(k32Var.a, k32Var.b);
                    }
                    return new v190(d5tVar.a, d5tVar.c, d5tVar.d);
                }
                Throwable a = Result.a(value);
                if (a != null) {
                    x4c.g("failed to override track_id push", a, null, Collections.singletonList(qrp0.b), 4);
                    l0p l0pVar = appAnalyticsReporter.O;
                    OtpCodeEvents$OtpCodePushHandleResultResult otpCodeEvents$OtpCodePushHandleResultResult = ((a instanceof ErrorResponseException) && ((ErrorResponseException) a).getErrorResponse().getCode() == 401) ? OtpCodeEvents$OtpCodePushHandleResultResult.UNAUTHORIZED : OtpCodeEvents$OtpCodePushHandleResultResult.UNKNOWN_ERROR;
                    LinkedHashMap w = g8e.w(2, "track_id", str);
                    w.put(TarifficatorScenarioActivity.RESULT_KEY, otpCodeEvents$OtpCodePushHandleResultResult.getOriginalValue());
                    l0pVar.a.a("otp_code.push.handle.result", w);
                }
                TrackIdPushOverrideDefaultContentConfig trackIdPushOverrideDefaultContentConfig = (TrackIdPushOverrideDefaultContentConfig) bVar.d(q5z.m0(bVar.d)).getData();
                return new v190(trackIdPushOverrideDefaultContentConfig.getDeeplink(), trackIdPushOverrideDefaultContentConfig.getTitle(), trackIdPushOverrideDefaultContentConfig.getSubtitle());
            }
        }
        trackIdPushContentOverrider$override$1 = new TrackIdPushContentOverrider$override$1(this, continuationImpl);
        Object obj22 = trackIdPushContentOverrider$override$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackIdPushContentOverrider$override$1.label;
        if (i != 0) {
        }
        value = ((Result) obj22).getValue();
        if (value instanceof Result.Failure) {
        }
    }
}
