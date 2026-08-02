package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class DisposableHelper implements c {
    private static final /* synthetic */ DisposableHelper[] $VALUES;
    public static final DisposableHelper DISPOSED;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        DISPOSED = disposableHelper;
        $VALUES = new DisposableHelper[]{disposableHelper};
    }

    public DisposableHelper() {
        throw null;
    }

    public static boolean a(AtomicReference<c> atomicReference) {
        c andSet;
        c cVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (cVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean b(c cVar) {
        return cVar == DISPOSED;
    }

    public static boolean c(AtomicReference<c> atomicReference, c cVar) {
        while (true) {
            c cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean d(AtomicReference<c> atomicReference, c cVar) {
        while (true) {
            c cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(cVar2, cVar)) {
                if (atomicReference.get() != cVar2) {
                    break;
                }
            }
            if (cVar2 == null) {
                return true;
            }
            cVar2.dispose();
            return true;
        }
    }

    public static boolean e(AtomicReference<c> atomicReference, c cVar) {
        Objects.requireNonNull(cVar, "d is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                io.reactivex.rxjava3.plugins.a.a(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(c cVar, c cVar2) {
        if (cVar2 == null) {
            io.reactivex.rxjava3.plugins.a.a(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        io.reactivex.rxjava3.plugins.a.a(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
    }
}
