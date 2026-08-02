package io.reactivex.rxjava3.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.w;
import xsna.asu0;

/* compiled from: AndroidSchedulers.java */
/* loaded from: classes11.dex */
public final class a {
    public static final w a;

    /* compiled from: AndroidSchedulers.java */
    /* renamed from: io.reactivex.rxjava3.android.schedulers.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C2114a {
        public static final b a = new b(new Handler(Looper.getMainLooper()));
    }

    static {
        w wVar;
        if (io.reactivex.rxjava3.android.plugins.a.a == null) {
            try {
                wVar = C2114a.a;
                if (wVar == null) {
                    throw new NullPointerException("Scheduler Callable returned null");
                }
            } finally {
            }
        } else {
            try {
                wVar = asu0.a.d();
            } finally {
            }
        }
        a = wVar;
    }

    @SuppressLint({"NewApi"})
    public static b a(Looper looper) {
        if (looper != null) {
            return new b(new Handler(looper));
        }
        throw new NullPointerException("looper == null");
    }

    public static w b() {
        w wVar = a;
        if (wVar != null) {
            return wVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
