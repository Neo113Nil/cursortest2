package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.internal.util.f;

/* compiled from: Exceptions.java */
/* loaded from: classes8.dex */
public final class a {
    public static void a(Throwable th) {
        throw f.f(th);
    }

    public static void b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
