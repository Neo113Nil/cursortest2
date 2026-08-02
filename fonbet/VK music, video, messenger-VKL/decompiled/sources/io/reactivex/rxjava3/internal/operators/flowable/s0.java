package io.reactivex.rxjava3.internal.operators.flowable;

import android.Manifest;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.ScalarSubscription;
import java.util.Objects;
import xsna.axm0;
import xsna.ffe0;

/* compiled from: FlowableScalarXMap.java */
/* loaded from: classes8.dex */
public final class s0 {

    /* compiled from: FlowableScalarXMap.java */
    public static final class a<T, R> extends io.reactivex.rxjava3.core.g<R> {
        public final T c;
        public final io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> d;

        public a(T t, io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar) {
            this.c = t;
            this.d = lVar;
        }

        @Override // io.reactivex.rxjava3.core.g
        public final void l(axm0<? super R> axm0Var) {
            try {
                ffe0<? extends R> apply = this.d.apply(this.c);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                ffe0<? extends R> ffe0Var = apply;
                if (!(ffe0Var instanceof io.reactivex.rxjava3.functions.n)) {
                    ffe0Var.subscribe(axm0Var);
                    return;
                }
                try {
                    Object obj = ((io.reactivex.rxjava3.functions.n) ffe0Var).get();
                    if (obj != null) {
                        axm0Var.onSubscribe(new ScalarSubscription(obj, axm0Var));
                    } else {
                        axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                        axm0Var.onComplete();
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                    axm0Var.onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                axm0Var.onError(th2);
            }
        }
    }

    public static a a(Object obj, io.reactivex.rxjava3.functions.l lVar) {
        return new a(obj, lVar);
    }

    public static <T, R> boolean b(ffe0<T> ffe0Var, axm0<? super R> axm0Var, io.reactivex.rxjava3.functions.l<? super T, ? extends ffe0<? extends R>> lVar) {
        if (!(ffe0Var instanceof io.reactivex.rxjava3.functions.n)) {
            return false;
        }
        try {
            Manifest.permission_group permission_groupVar = (Object) ((io.reactivex.rxjava3.functions.n) ffe0Var).get();
            if (permission_groupVar == null) {
                axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                axm0Var.onComplete();
                return true;
            }
            try {
                ffe0<? extends R> apply = lVar.apply(permission_groupVar);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                ffe0<? extends R> ffe0Var2 = apply;
                if (!(ffe0Var2 instanceof io.reactivex.rxjava3.functions.n)) {
                    ffe0Var2.subscribe(axm0Var);
                    return true;
                }
                try {
                    Object obj = ((io.reactivex.rxjava3.functions.n) ffe0Var2).get();
                    if (obj != null) {
                        axm0Var.onSubscribe(new ScalarSubscription(obj, axm0Var));
                        return true;
                    }
                    axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                    axm0Var.onComplete();
                    return true;
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                    axm0Var.onError(th);
                    return true;
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                axm0Var.onSubscribe(EmptySubscription.INSTANCE);
                axm0Var.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.b(th3);
            axm0Var.onSubscribe(EmptySubscription.INSTANCE);
            axm0Var.onError(th3);
            return true;
        }
    }
}
