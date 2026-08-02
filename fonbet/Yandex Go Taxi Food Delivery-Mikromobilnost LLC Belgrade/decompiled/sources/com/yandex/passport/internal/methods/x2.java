package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.d6z;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public abstract class x2 {
    public final MethodRef a;

    public x2(MethodRef methodRef) {
        this.a = methodRef;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(bundle);
        }
        return bundle;
    }

    public List b() {
        return EmptyList.a;
    }

    public abstract f c();

    public final Object d(Bundle bundle) {
        bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
        Serializable serializable = bundle.getSerializable(Constants.KEY_EXCEPTION);
        if (!(serializable instanceof Throwable)) {
            serializable = null;
        }
        Throwable th = (Throwable) serializable;
        Result result = th != null ? new Result(new Result.Failure(th)) : null;
        return result != null ? result.getValue() : d6z.d(c().c(bundle));
    }
}
