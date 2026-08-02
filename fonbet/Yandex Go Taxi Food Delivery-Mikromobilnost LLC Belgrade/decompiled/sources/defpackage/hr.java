package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.net.Error;

/* loaded from: classes15.dex */
public abstract class hr {
    public i00 a;

    public void a(Error error) {
        h();
    }

    public void b() {
    }

    public boolean f(hr hrVar) {
        return false;
    }

    public boolean g(hr hrVar) {
        return false;
    }

    public final void h() {
        i00 i00Var = this.a;
        if (i00Var == null) {
            ny61.g("Required value was null.");
            return;
        }
        z83.g(null, i00Var.a, Looper.myLooper());
        this.a = null;
        i00Var.c.remove(this);
    }
}
