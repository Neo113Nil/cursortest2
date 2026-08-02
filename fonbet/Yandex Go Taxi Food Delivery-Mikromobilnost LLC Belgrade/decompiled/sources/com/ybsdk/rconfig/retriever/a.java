package com.ybsdk.rconfig.retriever;

import android.content.SharedPreferences;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechGetRemoteConfigInitiatedTrigger;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechRemoteConfigCallCallType;
import com.ybsdk.feature.remote.config.api.retriever.RemoteConfigUpdateTrigger;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.RemoteConfigResponse;
import com.ybsdk.rconfig.configs.RemoteConfigCallType;
import defpackage.avi0;
import defpackage.bvi0;
import defpackage.fcy0;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.i5z0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u0k0;
import defpackage.u4r0;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.wui0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class a {
    public final bvi0 a;
    public final Api b;
    public final AppAnalyticsReporter c;
    public final u0k0 d;

    public a(bvi0 bvi0Var, Api api, AppAnalyticsReporter appAnalyticsReporter, u0k0 u0k0Var) {
        this.a = bvi0Var;
        this.b = api;
        this.c = appAnalyticsReporter;
        this.d = u0k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RemoteConfigUpdateTrigger remoteConfigUpdateTrigger, RemoteConfigCallType remoteConfigCallType, ContinuationImpl continuationImpl) {
        RemoteConfigRetriever$download$1 remoteConfigRetriever$download$1;
        int i;
        TechEvents$TechGetRemoteConfigInitiatedTrigger techEvents$TechGetRemoteConfigInitiatedTrigger;
        TechEvents$TechRemoteConfigCallCallType techEvents$TechRemoteConfigCallCallType;
        if (continuationImpl instanceof RemoteConfigRetriever$download$1) {
            remoteConfigRetriever$download$1 = (RemoteConfigRetriever$download$1) continuationImpl;
            int i2 = remoteConfigRetriever$download$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteConfigRetriever$download$1.label = i2 - Integer.MIN_VALUE;
                Object obj = remoteConfigRetriever$download$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteConfigRetriever$download$1.label;
                if (i == 0) {
                    if (i == 1 || i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                AppAnalyticsReporter appAnalyticsReporter = this.c;
                fcy0 fcy0Var = appAnalyticsReporter.m0;
                switch (wui0.b[remoteConfigUpdateTrigger.ordinal()]) {
                    case 1:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.RETRY;
                        break;
                    case 2:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.INITIAL;
                        break;
                    case 3:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.LOGOUT;
                        break;
                    case 4:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.PIN_CHECK;
                        break;
                    case 5:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.PIN_CREATED;
                        break;
                    case 6:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.UNKNOWN_USER;
                        break;
                    case 7:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.SDK_STATE_CHANGE;
                        break;
                    case 8:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.LOGIN;
                        break;
                    case 9:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.UI_OPEN;
                        break;
                    case 10:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.YB_REGISTRATION;
                        break;
                    case 11:
                        techEvents$TechGetRemoteConfigInitiatedTrigger = TechEvents$TechGetRemoteConfigInitiatedTrigger.PASSPORT_LOGIN;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put("trigger", techEvents$TechGetRemoteConfigInitiatedTrigger.getOriginalValue());
                fcy0Var.a.a("tech.get_remote_config.initiated", linkedHashMap);
                fcy0 fcy0Var2 = appAnalyticsReporter.m0;
                int[] iArr = wui0.a;
                int i3 = iArr[remoteConfigCallType.ordinal()];
                if (i3 == 1) {
                    techEvents$TechRemoteConfigCallCallType = TechEvents$TechRemoteConfigCallCallType.DEFAULT_RESULT;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    techEvents$TechRemoteConfigCallCallType = TechEvents$TechRemoteConfigCallCallType.PLAIN;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                linkedHashMap2.put("call_type", techEvents$TechRemoteConfigCallCallType.getOriginalValue());
                fcy0Var2.a.a("tech.remote_config.call", linkedHashMap2);
                String string = ((avi0) this.a).a.getString("remote_config_version", null);
                int i4 = iArr[remoteConfigCallType.ordinal()];
                if (i4 == 1) {
                    remoteConfigRetriever$download$1.label = 1;
                    Object c = c(string, remoteConfigRetriever$download$1);
                    if (c != obj2) {
                        return c;
                    }
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    remoteConfigRetriever$download$1.label = 2;
                    Object b = b(string, remoteConfigRetriever$download$1);
                    if (b != obj2) {
                        return b;
                    }
                }
                return obj2;
            }
        }
        remoteConfigRetriever$download$1 = new RemoteConfigRetriever$download$1(this, continuationImpl);
        Object obj3 = remoteConfigRetriever$download$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteConfigRetriever$download$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        RemoteConfigRetriever$downloadWithPlainCall$1 remoteConfigRetriever$downloadWithPlainCall$1;
        int i;
        if (continuationImpl instanceof RemoteConfigRetriever$downloadWithPlainCall$1) {
            remoteConfigRetriever$downloadWithPlainCall$1 = (RemoteConfigRetriever$downloadWithPlainCall$1) continuationImpl;
            int i2 = remoteConfigRetriever$downloadWithPlainCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteConfigRetriever$downloadWithPlainCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = remoteConfigRetriever$downloadWithPlainCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteConfigRetriever$downloadWithPlainCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    RemoteConfigRetriever$downloadWithPlainCall$2 remoteConfigRetriever$downloadWithPlainCall$2 = new RemoteConfigRetriever$downloadWithPlainCall$2(this, str, null);
                    remoteConfigRetriever$downloadWithPlainCall$1.label = 1;
                    obj = tje.k0(mdhVar, remoteConfigRetriever$downloadWithPlainCall$2, remoteConfigRetriever$downloadWithPlainCall$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        remoteConfigRetriever$downloadWithPlainCall$1 = new RemoteConfigRetriever$downloadWithPlainCall$1(this, continuationImpl);
        Object obj2 = remoteConfigRetriever$downloadWithPlainCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteConfigRetriever$downloadWithPlainCall$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        RemoteConfigRetriever$downloadWithResult$1 remoteConfigRetriever$downloadWithResult$1;
        int i;
        Object obj;
        boolean z;
        if (continuationImpl instanceof RemoteConfigRetriever$downloadWithResult$1) {
            remoteConfigRetriever$downloadWithResult$1 = (RemoteConfigRetriever$downloadWithResult$1) continuationImpl;
            int i2 = remoteConfigRetriever$downloadWithResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteConfigRetriever$downloadWithResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = remoteConfigRetriever$downloadWithResult$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = remoteConfigRetriever$downloadWithResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    RemoteConfigRetriever$downloadWithResult$2 remoteConfigRetriever$downloadWithResult$2 = new RemoteConfigRetriever$downloadWithResult$2(this, str, null);
                    remoteConfigRetriever$downloadWithResult$1.L$0 = str;
                    remoteConfigRetriever$downloadWithResult$1.label = 1;
                    Object d = com.ybsdk.core.utils.ext.c.d("REMOTE_CONFIG_DOWNLOAD", remoteConfigRetriever$downloadWithResult$2, remoteConfigRetriever$downloadWithResult$1);
                    obj = d;
                    if (d == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) remoteConfigRetriever$downloadWithResult$1.L$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                z = obj instanceof Result.Failure;
                if (!z) {
                    d(str, (RemoteConfigResponse) obj);
                }
                if (!z) {
                    return obj;
                }
                return zy11.a;
            }
        }
        remoteConfigRetriever$downloadWithResult$1 = new RemoteConfigRetriever$downloadWithResult$1(this, continuationImpl);
        Object obj22 = remoteConfigRetriever$downloadWithResult$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = remoteConfigRetriever$downloadWithResult$1.label;
        if (i != 0) {
        }
        z = obj instanceof Result.Failure;
        if (!z) {
        }
        if (!z) {
        }
    }

    public final void d(String str, RemoteConfigResponse remoteConfigResponse) {
        if (jl40.l(str, remoteConfigResponse.getVersion())) {
            i5z0.a.a("Remote config update not required", new Object[0]);
            return;
        }
        fcy0 fcy0Var = this.c.m0;
        List<RemoteConfigResponse.TypedExperiments> typedExperiments = remoteConfigResponse.getTypedExperiments();
        int d = gw00.d(tcc.n(typedExperiments, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (RemoteConfigResponse.TypedExperiments typedExperiments2 : typedExperiments) {
            Pair pair = new Pair(typedExperiments2.getName(), typedExperiments2.getValue());
            linkedHashMap.put(pair.c(), pair.f());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put(ConfigConstants.CONFIG, linkedHashMap);
        fcy0Var.a.a("tech.remote_config_updated", linkedHashMap2);
        avi0 avi0Var = (avi0) this.a;
        SharedPreferences sharedPreferences = avi0Var.a;
        Set<String> keySet = sharedPreferences.getAll().keySet();
        Set d2 = u4r0.d("remote_config_version");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (RemoteConfigResponse.TypedExperiments typedExperiments3 : remoteConfigResponse.getTypedExperiments()) {
            d2.add(typedExperiments3.getName());
            edit.putString(typedExperiments3.getName(), typedExperiments3.getValue());
        }
        edit.putString("remote_config_version", remoteConfigResponse.getVersion());
        Iterator it = v4r0.g(keySet, d2).iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
        Iterator it2 = avi0Var.b.iterator();
        while (it2.hasNext()) {
            ((com.ybsdk.rconfig.c) it2.next()).a();
        }
        i5z0.a.a(g8e.o("Remote config update to version ", remoteConfigResponse.getVersion()), new Object[0]);
    }
}
