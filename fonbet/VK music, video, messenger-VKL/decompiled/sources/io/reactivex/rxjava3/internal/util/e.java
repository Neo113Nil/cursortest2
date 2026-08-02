package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import xsna.ss9;

/* compiled from: EndConsumerHelper.java */
/* loaded from: classes11.dex */
public final class e {
    public static void a(AtomicReference atomicReference, io.reactivex.rxjava3.disposables.c cVar, Class cls) {
        Objects.requireNonNull(cVar, "next is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.dispose();
                if (atomicReference.get() != DisposableHelper.DISPOSED) {
                    String name = cls.getName();
                    io.reactivex.rxjava3.plugins.a.a(new ProtocolViolationException(ss9.a("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
                    return;
                }
                return;
            }
        }
    }
}
