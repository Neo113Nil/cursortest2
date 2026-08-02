package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.internal.authorized.sync.g;

/* loaded from: classes15.dex */
public final class n420 implements n5t0, vff0 {
    public final g a;
    public final afu b;
    public boolean c;
    public final /* synthetic */ o420 w;

    public n420(o420 o420Var, g gVar) {
        this.w = o420Var;
        this.a = gVar;
        bfu bfuVar = o420Var.b;
        bfuVar.getClass();
        this.b = new afu(bfuVar, this);
        o420Var.c.a(this);
    }

    @Override // defpackage.n5t0
    public final x08 a(o5t0 o5t0Var, t1k0 t1k0Var) {
        z83.g(null, this.w.a, Looper.myLooper());
        return this.c ? wfz.z : this.b.a(o5t0Var, t1k0Var);
    }

    @Override // defpackage.vff0
    public final void b() {
        z83.g(null, this.w.a, Looper.myLooper());
        this.c = true;
        this.b.close();
    }

    @Override // defpackage.n5t0
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.n5t0
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.n5t0
    public final void d(ClientMessage clientMessage) {
        z83.g(null, this.w.a, Looper.myLooper());
        if (this.c) {
            return;
        }
        this.b.d(clientMessage);
    }

    @Override // defpackage.n5t0
    public final void e() {
        z83.g(null, this.w.a, Looper.myLooper());
        z83.c(null, this.c);
        this.b.e();
    }

    public final boolean g() {
        z83.g(null, this.a.S, Looper.myLooper());
        return !r3.T.isEmpty();
    }

    @Override // defpackage.n5t0
    public final String getProviderName() {
        return this.b.c.getProviderName();
    }
}
