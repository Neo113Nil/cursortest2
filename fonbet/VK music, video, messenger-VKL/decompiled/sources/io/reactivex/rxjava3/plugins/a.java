package io.reactivex.rxjava3.plugins;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.functions.f;
import rxdogtag2.i0;
import rxdogtag2.j0;
import rxdogtag2.k0;
import rxdogtag2.l0;
import rxdogtag2.m0;
import xsna.lug0;
import xsna.mug0;
import xsna.nug0;

/* compiled from: RxJavaPlugins.java */
/* loaded from: classes11.dex */
public final class a {
    public static volatile f<? super Throwable> a;
    public static volatile mug0 b;
    public static volatile nug0 c;
    public static volatile lug0 d;
    public static volatile j0 e;
    public static volatile l0 f;
    public static volatile i0 g;
    public static volatile k0 h;
    public static volatile m0 i;

    public static void a(Throwable th) {
        f<? super Throwable> fVar = a;
        if (th == null) {
            th = io.reactivex.rxjava3.internal.util.f.b("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException(th);
        }
        if (fVar != null) {
            try {
                fVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
