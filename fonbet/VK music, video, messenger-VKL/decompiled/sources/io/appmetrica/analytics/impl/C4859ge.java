package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collections;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.ge, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4859ge {
    public static final C4859ge a = new C4859ge();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final String c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.14.3", "50161178");

    public final synchronized ExponentialBackoffDataHolder a(EnumC4807ee enumC4807ee) {
        Object obj;
        try {
            LinkedHashMap linkedHashMap = b;
            obj = linkedHashMap.get(enumC4807ee);
            if (obj == null) {
                obj = new ExponentialBackoffDataHolder(new Ia(C5342za.I.y(), enumC4807ee), enumC4807ee.name());
                linkedHashMap.put(enumC4807ee, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) obj;
    }

    public static final NetworkTask a(C4927j5 c4927j5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C4939jh c4939jh = new C4939jh(aESRSARequestBodyEncrypter);
        Kb kb = new Kb(c4927j5);
        return new NetworkTask(new BlockingExecutor(), new B5(c4927j5.a), new AllHostsExponentialBackoffPolicy(a.a(EnumC4807ee.REPORT)), new Eh(c4927j5, c4939jh, kb, new FullUrlFormer(c4939jh, kb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c4927j5.i(), c4927j5.p(), c4927j5.u(), aESRSARequestBodyEncrypter), Collections.singletonList(new uo()), c);
    }
}
