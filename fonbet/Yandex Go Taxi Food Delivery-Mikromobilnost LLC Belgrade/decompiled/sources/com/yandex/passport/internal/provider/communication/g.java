package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import defpackage.d6z;
import defpackage.oo31;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class g {
    public static Object a(Bundle bundle) {
        HostResponse hostResponse = (HostResponse) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "HostResponse");
        if (hostResponse != null) {
            return d6z.d(hostResponse);
        }
        Serializable serializable = bundle.getSerializable(Constants.KEY_EXCEPTION);
        if (!(serializable instanceof Throwable)) {
            serializable = null;
        }
        Throwable th = (Throwable) serializable;
        Result result = th != null ? new Result(new Result.Failure(th)) : null;
        return result != null ? result.getValue() : new Result.Failure(new IllegalStateException("Unknown object in bundle"));
    }
}
