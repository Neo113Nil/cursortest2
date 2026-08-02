package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.internal.authorized.sync.PushTokenValidationException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes15.dex */
public final class o7c implements Runnable, x08 {
    public static final Object F = new Object();
    public boolean A;
    public boolean B;
    public final a220 b;
    public final Executor c;
    public final n0x0 w;
    public final x22 x;
    public final n0x0 y;
    public final Handler a = new Handler();
    public final f5g0 z = new f5g0();
    public long C = 5000;
    public long D = 1;
    public Exception E = null;

    public o7c(a220 a220Var, n0x0 n0x0Var, n0x0 n0x0Var2, Executor executor, x22 x22Var) {
        this.b = a220Var;
        this.y = n0x0Var2;
        this.c = executor;
        this.w = n0x0Var;
        this.x = x22Var;
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r6.equals("PHONE_REGISTRATION_ERROR") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Exception exc) {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        z83.h(null, this.A);
        this.E = exc;
        this.D++;
        this.y.a.e(exc.getMessage());
        char c = 0;
        this.A = false;
        if (this.B) {
            return;
        }
        if (!(exc instanceof PushTokenValidationException)) {
            String message = exc.getMessage();
            if (message != null) {
                switch (message.hashCode()) {
                    case -1579216525:
                        break;
                    case -1515255836:
                        if (message.equals("AUTHENTICATION_FAILED")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -829011630:
                        if (message.equals("INVALID_PARAMETERS")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 855732677:
                        if (message.equals("TOO_MANY_REGISTRATIONS")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1750400351:
                        if (message.equals("MISSING_INSTANCEID_SERVICE")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                }
            }
        } else if ("huawei".equals(Build.MANUFACTURER.toLowerCase(Locale.US))) {
            return;
        }
        handler.postAtTime(this, F, SystemClock.uptimeMillis() + this.C);
        this.C = Math.min(this.C * 2, 1800000L);
    }

    public final void b() {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        this.x.h("push_token_request_start", "attempt_number", Long.valueOf(this.D), "last_exception", this.E, "platform", this.b.a.d.getValue());
        if (this.A) {
            return;
        }
        this.A = true;
        handler.removeCallbacksAndMessages(F);
        try {
            this.c.execute(new v4a(14, this));
        } catch (RejectedExecutionException e) {
            a(e);
        }
    }

    @Override // defpackage.x08
    public final void cancel() {
        Handler handler = this.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        this.B = true;
        handler.removeCallbacksAndMessages(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        if (this.B) {
            return;
        }
        b();
    }
}
