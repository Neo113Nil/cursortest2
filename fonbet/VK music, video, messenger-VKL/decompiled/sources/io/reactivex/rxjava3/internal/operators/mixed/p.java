package io.reactivex.rxjava3.internal.operators.mixed;

import android.Manifest;
import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.maybe.k0;
import io.reactivex.rxjava3.internal.operators.single.k0;
import java.util.Objects;

/* compiled from: ScalarXMapZHelper.java */
/* loaded from: classes11.dex */
public final class p {
    public static <T> boolean a(Object obj, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.e> lVar, io.reactivex.rxjava3.core.c cVar) {
        io.reactivex.rxjava3.core.e eVar;
        if (!(obj instanceof io.reactivex.rxjava3.functions.n)) {
            return false;
        }
        try {
            Manifest.permission_group permission_groupVar = (Object) ((io.reactivex.rxjava3.functions.n) obj).get();
            if (permission_groupVar != null) {
                io.reactivex.rxjava3.core.e apply = lVar.apply(permission_groupVar);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                eVar = apply;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                eVar.subscribe(cVar);
                return true;
            }
            cVar.onSubscribe(EmptyDisposable.INSTANCE);
            cVar.onComplete();
            return true;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            cVar.onSubscribe(EmptyDisposable.INSTANCE);
            cVar.onError(th);
            return true;
        }
    }

    public static <T, R> boolean b(Object obj, io.reactivex.rxjava3.functions.l<? super T, ? extends io.reactivex.rxjava3.core.o<? extends R>> lVar, v<? super R> vVar) {
        io.reactivex.rxjava3.core.o<? extends R> oVar;
        if (!(obj instanceof io.reactivex.rxjava3.functions.n)) {
            return false;
        }
        try {
            Manifest.permission_group permission_groupVar = (Object) ((io.reactivex.rxjava3.functions.n) obj).get();
            if (permission_groupVar != null) {
                io.reactivex.rxjava3.core.o<? extends R> apply = lVar.apply(permission_groupVar);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                oVar = apply;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                oVar.subscribe(k0.M0(vVar));
                return true;
            }
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onComplete();
            return true;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
            return true;
        }
    }

    public static <T, R> boolean c(Object obj, io.reactivex.rxjava3.functions.l<? super T, ? extends b0<? extends R>> lVar, v<? super R> vVar) {
        b0<? extends R> b0Var;
        if (!(obj instanceof io.reactivex.rxjava3.functions.n)) {
            return false;
        }
        try {
            Manifest.permission_group permission_groupVar = (Object) ((io.reactivex.rxjava3.functions.n) obj).get();
            if (permission_groupVar != null) {
                b0<? extends R> apply = lVar.apply(permission_groupVar);
                Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                b0Var = apply;
            } else {
                b0Var = null;
            }
            if (b0Var != null) {
                b0Var.subscribe(new k0.a(vVar));
                return true;
            }
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onComplete();
            return true;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            vVar.onSubscribe(EmptyDisposable.INSTANCE);
            vVar.onError(th);
            return true;
        }
    }
}
