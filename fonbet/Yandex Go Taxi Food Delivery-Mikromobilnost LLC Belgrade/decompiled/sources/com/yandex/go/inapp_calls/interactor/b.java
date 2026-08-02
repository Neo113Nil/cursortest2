package com.yandex.go.inapp_calls.interactor;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.v;
import com.yandex.go.inapp_calls.analytics.InAppCallsAnalytics$ErrorType;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.mjv;
import defpackage.njv;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.pux0;
import defpackage.xk60;
import defpackage.y72;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes12.dex */
public final class b {
    public final Context a;
    public final y72 b;
    public final q c;
    public final xk60 d;
    public final o3h e;
    public final njv f;

    public b(Context context, y72 y72Var, q qVar, xk60 xk60Var, o3h o3hVar, njv njvVar) {
        this.a = context;
        this.b = y72Var;
        this.c = qVar;
        this.d = xk60Var;
        this.e = o3hVar;
        this.f = njvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        NotLoadedFeatureNotificationInteractor$showNotLoadedNotification$1 notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1;
        int i;
        String str5;
        String str6;
        String str7;
        Object b;
        String str8;
        long j;
        boolean l;
        if (continuationImpl instanceof NotLoadedFeatureNotificationInteractor$showNotLoadedNotification$1) {
            notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1 = (NotLoadedFeatureNotificationInteractor$showNotLoadedNotification$1) continuationImpl;
            int i2 = notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.label;
                v vVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str5 = str;
                    notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$0 = str5;
                    str6 = str2;
                    notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$1 = str6;
                    str7 = str3;
                    notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$2 = str7;
                    notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$3 = str4;
                    notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.J$0 = 0L;
                    notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.label = 1;
                    b = this.c.d.b(notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str8 = str4;
                    j = 0;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.J$0;
                    str8 = (String) notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$3;
                    str7 = (String) notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$2;
                    String str9 = (String) notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$1;
                    String str10 = (String) notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    str5 = str10;
                    j = j2;
                    str6 = str9;
                }
                InAppCallExperiment inAppCallExperiment = (InAppCallExperiment) b;
                InAppCallExperiment.Companion.getClass();
                l = jl40.l(inAppCallExperiment, InAppCallExperiment.r);
                zy11 zy11Var = zy11.a;
                njv njvVar = this.f;
                if (!l) {
                    InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType = InAppCallsAnalytics$ErrorType.UPDATE_NOTIFICATION_UNAVAILABLE;
                    njvVar.getClass();
                    njv.h(inAppCallsAnalytics$ErrorType);
                    return zy11Var;
                }
                InAppCallExperiment.IncomingCallFailedConfig incomingCallFailedConfig = inAppCallExperiment.n;
                String i3 = InAppCallExperiment.i(inAppCallExperiment, incomingCallFailedConfig != null ? incomingCallFailedConfig.a : null);
                InAppCallExperiment.IncomingCallFailedConfig incomingCallFailedConfig2 = inAppCallExperiment.n;
                String i4 = InAppCallExperiment.i(inAppCallExperiment, incomingCallFailedConfig2 != null ? incomingCallFailedConfig2.b : null);
                if ((i3 == null || i3.length() == 0) && (i4 == null || i4.length() == 0)) {
                    InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType2 = InAppCallsAnalytics$ErrorType.UPDATE_NOTIFICATION_UNAVAILABLE;
                    njvVar.getClass();
                    njv.h(inAppCallsAnalytics$ErrorType2);
                } else {
                    Uri.Builder builder = new Uri.Builder();
                    ((pux0) this.e).getClass();
                    Uri build = builder.scheme(pux0.c).authority("inapp_call_update").build();
                    Class a = this.b.a(AndroidComponentRepository$Component.MAIN_ACTIVITY);
                    Context context = this.a;
                    njvVar = njvVar;
                    vVar = this.d.i(i4, i3, null, "incoming_call", PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) a).setData(build).setAction("android.intent.action.VIEW").addFlags(SelfTester_JCP.IMITA), SelfTester_JCP.DECRYPT_CBC), j);
                }
                if (vVar == null) {
                    return zy11Var;
                }
                NotificationShareData.a builder2 = NotificationShareData.INSTANCE.builder();
                builder2.e = "incoming_call";
                builder2.b = str5;
                this.d.g("incoming_call", 4, d6z.Y(inAppCallExperiment, inAppCallExperiment.p.a), null, false);
                this.d.l(builder2, vVar);
                njvVar.k("IncomingCallFailed", "Show", new Pair[0]);
                mjv mjvVar = njvVar.b;
                mjvVar.getClass();
                HashMap hashMap = new HashMap();
                if (str6 != null) {
                    hashMap.put("call_guid", str6);
                }
                if (str7 != null) {
                    hashMap.put("call_platform_id", str7);
                }
                if (str8 != null) {
                    hashMap.put("linkage_id", str8);
                }
                mjvVar.a.a("InAppCalls.DynamicFeatureScreen.CallMissedNotificationShow", hashMap, 2, new HashMap());
                return zy11Var;
            }
        }
        notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1 = new NotLoadedFeatureNotificationInteractor$showNotLoadedNotification$1(this, continuationImpl);
        Object obj2 = notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notLoadedFeatureNotificationInteractor$showNotLoadedNotification$1.label;
        v vVar2 = null;
        if (i != 0) {
        }
        InAppCallExperiment inAppCallExperiment2 = (InAppCallExperiment) b;
        InAppCallExperiment.Companion.getClass();
        l = jl40.l(inAppCallExperiment2, InAppCallExperiment.r);
        zy11 zy11Var2 = zy11.a;
        njv njvVar2 = this.f;
        if (!l) {
        }
    }
}
