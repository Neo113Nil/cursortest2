package io.reactivex.rxjava3.internal.subscriptions;

import defpackage.k0;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.b;
import io.reactivex.rxjava3.plugins.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.jxm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SubscriptionHelper implements jxm0 {
    private static final /* synthetic */ SubscriptionHelper[] $VALUES;
    public static final SubscriptionHelper CANCELLED;

    static {
        SubscriptionHelper subscriptionHelper = new SubscriptionHelper("CANCELLED", 0);
        CANCELLED = subscriptionHelper;
        $VALUES = new SubscriptionHelper[]{subscriptionHelper};
    }

    public SubscriptionHelper() {
        throw null;
    }

    public static boolean a(AtomicReference<jxm0> atomicReference) {
        jxm0 andSet;
        jxm0 jxm0Var = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (jxm0Var == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void b(AtomicReference<jxm0> atomicReference, AtomicLong atomicLong, long j) {
        jxm0 jxm0Var = atomicReference.get();
        if (jxm0Var != null) {
            jxm0Var.request(j);
            return;
        }
        if (e(j)) {
            b.a(atomicLong, j);
            jxm0 jxm0Var2 = atomicReference.get();
            if (jxm0Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    jxm0Var2.request(andSet);
                }
            }
        }
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, jxm0 jxm0Var) {
        if (d(atomicReference, jxm0Var)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                jxm0Var.request(andSet);
            }
        }
    }

    public static boolean d(AtomicReference<jxm0> atomicReference, jxm0 jxm0Var) {
        Objects.requireNonNull(jxm0Var, "s is null");
        while (!atomicReference.compareAndSet(null, jxm0Var)) {
            if (atomicReference.get() != null) {
                jxm0Var.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                a.a(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean e(long j) {
        if (j > 0) {
            return true;
        }
        a.a(new IllegalArgumentException(k0.a(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean f(jxm0 jxm0Var, jxm0 jxm0Var2) {
        if (jxm0Var2 == null) {
            a.a(new NullPointerException("next is null"));
            return false;
        }
        if (jxm0Var == null) {
            return true;
        }
        jxm0Var2.cancel();
        a.a(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static SubscriptionHelper valueOf(String str) {
        return (SubscriptionHelper) Enum.valueOf(SubscriptionHelper.class, str);
    }

    public static SubscriptionHelper[] values() {
        return (SubscriptionHelper[]) $VALUES.clone();
    }

    @Override // xsna.jxm0
    public final void cancel() {
    }

    @Override // xsna.jxm0
    public final void request(long j) {
    }
}
