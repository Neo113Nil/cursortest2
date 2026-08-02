package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.net.Error;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class e9b implements e1k, o1b {
    public static final /* synthetic */ kgx[] x;
    public final ChatRequest a;
    public final d9b b;
    public final qp3 c;
    public final /* synthetic */ h9b w;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("createChatDisposable", 0, "getCreateChatDisposable()Lcom/yandex/alicekit/core/Disposable;", e9b.class);
        qoi0.a.getClass();
        x = new kgx[]{mutablePropertyReference1Impl};
    }

    public e9b(h9b h9bVar, ChatRequest chatRequest, d9b d9bVar) {
        this.w = h9bVar;
        this.a = chatRequest;
        this.b = d9bVar;
        qp3 qp3Var = new qp3();
        this.c = qp3Var;
        o1b0 f = h9bVar.f(chatRequest);
        if (f != null) {
            d9bVar.c(h9bVar.b(f, chatRequest));
            return;
        }
        v1b a = ((w1b) h9bVar.e.get()).a(chatRequest, this);
        kgx kgxVar = x[0];
        qp3Var.b(a);
    }

    @Override // defpackage.o1b
    public final void a(Error error) {
        kse.a(this.w.a);
        z83.i();
        z83.i();
        this.b.a(error);
    }

    @Override // defpackage.o1b
    public final void c(String str) {
        h9b h9bVar = this.w;
        kse.a(h9bVar.a);
        z83.i();
        z83.i();
        z83.i();
        o1b0 f = h9bVar.f(p8b.a(str));
        if (f == null) {
            ny61.g("Required value was null.");
        } else {
            this.b.c(h9bVar.b(f, this.a));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kse.a(this.w.a);
        kgx kgxVar = x[0];
        this.c.b(null);
    }
}
