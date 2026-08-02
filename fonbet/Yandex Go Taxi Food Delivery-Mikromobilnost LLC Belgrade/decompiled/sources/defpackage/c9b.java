package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.net.Error;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class c9b implements e1k, o1b {
    public static final /* synthetic */ kgx[] y = {new MutablePropertyReference1Impl("createChatDisposable", 0, "getCreateChatDisposable()Lcom/yandex/alicekit/core/Disposable;", c9b.class), oyr.B(qoi0.a, c9b.class, "subOperation", "getSubOperation()Lcom/yandex/messaging/Cancelable;", 0)};
    public final ChatRequest a;
    public final an8 b;
    public final qp3 c;
    public final op3 w;
    public final /* synthetic */ h9b x;

    public c9b(h9b h9bVar, ChatRequest chatRequest, an8 an8Var) {
        this.x = h9bVar;
        this.a = chatRequest;
        this.b = an8Var;
        qp3 qp3Var = new qp3();
        this.c = qp3Var;
        this.w = new op3();
        v1b a = ((w1b) h9bVar.e.get()).a(chatRequest, this);
        kgx kgxVar = y[0];
        qp3Var.b(a);
    }

    @Override // defpackage.o1b
    public final void a(Error error) {
    }

    @Override // defpackage.o1b
    public final void c(String str) {
        h9b h9bVar = this.x;
        kse.a(h9bVar.a);
        kgx[] kgxVarArr = y;
        kgx kgxVar = kgxVarArr[0];
        this.c.b(null);
        o1b0 f = h9bVar.f(p8b.a(str));
        if (f == null) {
            ny61.g("Required value was null.");
            return;
        }
        x08 r = this.b.r(h9bVar.b(f, this.a));
        kgx kgxVar2 = kgxVarArr[1];
        this.w.b(r);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kse.a(this.x.a);
        kgx[] kgxVarArr = y;
        kgx kgxVar = kgxVarArr[0];
        this.c.b(null);
        kgx kgxVar2 = kgxVarArr[1];
        this.w.b(null);
    }
}
