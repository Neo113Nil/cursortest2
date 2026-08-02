package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.internal.authorized.j;

/* loaded from: classes15.dex */
public final class ct21 implements e1k, dl21 {
    public final xs21 a;
    public final Handler b;
    public xi3 c;
    public e1k w;
    public boolean x;
    public final /* synthetic */ j y;

    public ct21(j jVar, xs21 xs21Var) {
        this.y = jVar;
        this.a = xs21Var;
        Handler handler = new Handler((Looper) jVar.a.get());
        this.b = handler;
        handler.post(new bt21(this, 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.x) {
            return;
        }
        this.x = true;
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(null);
        handler.post(new bt21(this, 1));
        eu11.a(new bt21(this, 2));
    }

    @Override // defpackage.dl21
    public final void e(cl21 cl21Var) {
        z83.g(null, this.y.a.get(), Looper.myLooper());
        z83.f(this.w, null);
        this.w = this.a.e(cl21Var);
    }
}
