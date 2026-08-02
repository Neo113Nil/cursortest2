package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import java.util.Objects;

/* loaded from: classes15.dex */
public final class afu implements n5t0 {
    public final Looper a = Looper.myLooper();
    public final n420 b;
    public final n5t0 c;
    public final /* synthetic */ bfu w;

    public afu(bfu bfuVar, n420 n420Var) {
        this.w = bfuVar;
        this.b = n420Var;
        fn6 fn6Var = bfuVar.c;
        fe51 fe51Var = (fe51) fn6Var.f;
        String str = fe51Var.a;
        c820 c820Var = str == null ? null : new c820(fn6Var, n420Var, str, fe51Var.b);
        Objects.requireNonNull(c820Var);
        this.c = c820Var;
        bfuVar.a.b.add(this);
    }

    @Override // defpackage.n5t0
    public final x08 a(o5t0 o5t0Var, t1k0 t1k0Var) {
        z83.g(null, this.a, Looper.myLooper());
        return this.c.a(o5t0Var, t1k0Var);
    }

    @Override // defpackage.n5t0
    public final void c() {
        z83.g(null, this.a, Looper.myLooper());
        this.c.c();
    }

    @Override // defpackage.n5t0
    public final void close() {
        z83.g(null, this.a, Looper.myLooper());
        this.w.a.b.remove(this);
        this.c.close();
    }

    @Override // defpackage.n5t0
    public final void d(ClientMessage clientMessage) {
        z83.g(null, this.a, Looper.myLooper());
        n5t0 n5t0Var = this.c;
        Objects.requireNonNull(n5t0Var);
        n5t0Var.d(clientMessage);
    }

    @Override // defpackage.n5t0
    public final void e() {
        z83.g(null, this.a, Looper.myLooper());
        this.c.e();
    }

    @Override // defpackage.n5t0
    public final String getProviderName() {
        return this.c.getProviderName();
    }
}
