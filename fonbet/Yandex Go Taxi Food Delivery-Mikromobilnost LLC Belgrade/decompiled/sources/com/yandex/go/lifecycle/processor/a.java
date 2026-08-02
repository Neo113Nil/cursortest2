package com.yandex.go.lifecycle.processor;

import com.yandex.go.coroutines.h;
import defpackage.h3y;
import defpackage.jse;
import defpackage.seu;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public abstract class a {
    public final jse a;
    public final h b;

    public a(h3y h3yVar, jse jseVar) {
        this.a = jseVar;
        this.b = new h(new BaseLifecycleProcessor$processorListeners$1(this, h3yVar, null));
    }

    public abstract String a();

    public final Object b(SuspendLambda suspendLambda) {
        Object obj = this.b.c;
        if (obj == seu.H) {
            obj = null;
        }
        Set set = (Set) obj;
        return set == null ? this.b.a(suspendLambda) : set;
    }
}
