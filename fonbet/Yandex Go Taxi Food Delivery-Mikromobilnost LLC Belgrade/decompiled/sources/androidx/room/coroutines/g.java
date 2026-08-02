package androidx.room.coroutines;

import defpackage.tje;
import defpackage.wls;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public abstract class g {
    public static final Object a(wls wlsVar) {
        Thread.interrupted();
        return tje.Y(EmptyCoroutineContext.a, new RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(wlsVar, null));
    }
}
