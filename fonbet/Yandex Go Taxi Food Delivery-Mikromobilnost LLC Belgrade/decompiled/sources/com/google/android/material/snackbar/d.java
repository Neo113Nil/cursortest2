package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.cc5;
import defpackage.d1t0;

/* loaded from: classes11.dex */
public final class d {
    public static d e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager$1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            d dVar = d.this;
            d1t0 d1t0Var = (d1t0) message.obj;
            synchronized (dVar.a) {
                try {
                    if (dVar.c != d1t0Var) {
                        if (dVar.d == d1t0Var) {
                        }
                    }
                    dVar.a(d1t0Var, 2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    });
    public d1t0 c;
    public d1t0 d;

    public static d b() {
        if (e == null) {
            e = new d();
        }
        return e;
    }

    public final boolean a(d1t0 d1t0Var, int i) {
        cc5 cc5Var = (cc5) d1t0Var.a.get();
        if (cc5Var == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(d1t0Var);
        Handler handler = b.w;
        handler.sendMessage(handler.obtainMessage(1, i, 0, cc5Var.a));
        return true;
    }

    public final boolean c(cc5 cc5Var) {
        d1t0 d1t0Var = this.c;
        return (d1t0Var == null || cc5Var == null || d1t0Var.a.get() != cc5Var) ? false : true;
    }

    public final void d(cc5 cc5Var) {
        synchronized (this.a) {
            try {
                if (c(cc5Var)) {
                    d1t0 d1t0Var = this.c;
                    if (!d1t0Var.c) {
                        d1t0Var.c = true;
                        this.b.removeCallbacksAndMessages(d1t0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(cc5 cc5Var) {
        synchronized (this.a) {
            try {
                if (c(cc5Var)) {
                    d1t0 d1t0Var = this.c;
                    if (d1t0Var.c) {
                        d1t0Var.c = false;
                        f(d1t0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(d1t0 d1t0Var) {
        int i = d1t0Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(d1t0Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, d1t0Var), i);
    }

    public final void g() {
        d1t0 d1t0Var = this.d;
        if (d1t0Var != null) {
            this.c = d1t0Var;
            this.d = null;
            cc5 cc5Var = (cc5) d1t0Var.a.get();
            if (cc5Var == null) {
                this.c = null;
            } else {
                Handler handler = b.w;
                handler.sendMessage(handler.obtainMessage(0, cc5Var.a));
            }
        }
    }
}
