package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.im.mediascope.MediaScopeCommand;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MediaScopeService.kt */
/* loaded from: classes2.dex */
public final class zx10 {
    public final wy2 a;
    public final vx10 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public int d;
    public boolean e;
    public boolean f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public final xab j;
    public final ou5 k;

    /* compiled from: MediaScopeService.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            boolean z;
            Throwable th2 = th;
            ((zx10) this.receiver).getClass();
            if (th2 instanceof ConnectException) {
                String message = th2.getMessage();
                if (message != null ? drm0.D(message, "ERR_CONNECTION_CLOSED", false) : false) {
                    z = true;
                    if (!z || (th2 instanceof SSLHandshakeException)) {
                        L.G("MediaScope request was registered");
                    } else if (th2 instanceof SocketTimeoutException) {
                        L.G("MediaScope request timed out");
                    } else {
                        L.E(th2, new Object[0]);
                    }
                    return s3q0.a;
                }
            }
            z = false;
            if (z) {
            }
            L.G("MediaScope request was registered");
            return s3q0.a;
        }
    }

    public zx10(wy2 wy2Var, vx10 vx10Var) {
        this.a = wy2Var;
        this.b = vx10Var;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.g = emptyDisposable;
        this.h = emptyDisposable;
        this.i = emptyDisposable;
        this.j = new xab(this, 4);
        this.k = new ou5(this, 6);
    }

    public final io.reactivex.rxjava3.disposables.c a(MediaScopeCommand mediaScopeCommand) {
        return io.reactivex.rxjava3.core.a.l(new b7w(1, this, mediaScopeCommand)).q(asu0.a.c()).subscribe(io.reactivex.rxjava3.internal.functions.a.c, new ez(new a(1, this, zx10.class, "logError", "logError(Ljava/lang/Throwable;)V", 0), 27));
    }

    public final void b() {
        int i = this.d - 1;
        if (i < 0) {
            i = 0;
        }
        this.d = i;
        if (i != 0 || this.f) {
            return;
        }
        this.f = true;
        this.c.postDelayed(this.k, 700L);
    }
}
