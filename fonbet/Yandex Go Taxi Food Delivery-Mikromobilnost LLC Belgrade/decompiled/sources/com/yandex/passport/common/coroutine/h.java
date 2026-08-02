package com.yandex.passport.common.coroutine;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes8.dex */
public final /* synthetic */ class h implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ AtomicInteger b;

    public /* synthetic */ h(String str, AtomicInteger atomicInteger) {
        this.a = str;
        this.b = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "Passport-".concat(this.a) + LicenseUtility.SEPARATOR + this.b.getAndIncrement());
    }
}
