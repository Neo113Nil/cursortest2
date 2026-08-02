package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.net.Error;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class g9b implements e1k, x08, o1b {
    public static final /* synthetic */ kgx[] y = {new MutablePropertyReference1Impl("createChatDisposable", 0, "getCreateChatDisposable()Lcom/yandex/alicekit/core/Disposable;", g9b.class), oyr.B(qoi0.a, g9b.class, "childDisposable", "getChildDisposable()Lcom/yandex/alicekit/core/Disposable;", 0)};
    public final ChatRequest a;
    public final qp3 b;
    public final qp3 c;
    public tls w;
    public final /* synthetic */ h9b x;

    public g9b(h9b h9bVar, ChatRequest chatRequest, tls tlsVar) {
        e1k e1kVar;
        this.x = h9bVar;
        this.a = chatRequest;
        qp3 qp3Var = new qp3();
        this.b = qp3Var;
        qp3 qp3Var2 = new qp3();
        this.c = qp3Var2;
        this.w = tlsVar;
        ChatRequest chatRequest2 = (ChatRequest) chatRequest.handle(new c29(19, h9bVar));
        kgx[] kgxVarArr = y;
        if (chatRequest2 == null) {
            tls tlsVar2 = this.w;
            e1kVar = tlsVar2 != null ? (e1k) tlsVar2.invoke(chatRequest) : null;
            kgx kgxVar = kgxVarArr[1];
            qp3Var2.b(e1kVar);
            return;
        }
        o1b0 f = h9bVar.f(chatRequest2);
        if (f == null) {
            v1b a = ((w1b) h9bVar.e.get()).a(chatRequest2, this);
            kgx kgxVar2 = kgxVarArr[0];
            qp3Var.b(a);
        } else {
            tls tlsVar3 = this.w;
            e1kVar = tlsVar3 != null ? (e1k) tlsVar3.invoke(d(f.b)) : null;
            kgx kgxVar3 = kgxVarArr[1];
            qp3Var2.b(e1kVar);
        }
    }

    @Override // defpackage.o1b
    public final void a(Error error) {
        kse.a(this.x.a);
        kgx kgxVar = y[1];
        e1k e1kVar = (e1k) this.c.a();
        o1b o1bVar = e1kVar instanceof o1b ? (o1b) e1kVar : null;
        if (o1bVar != null) {
            o1bVar.a(error);
        }
    }

    @Override // defpackage.o1b
    public final void c(String str) {
        kse.a(this.x.a);
        kgx[] kgxVarArr = y;
        kgx kgxVar = kgxVarArr[0];
        this.b.b(null);
        tls tlsVar = this.w;
        e1k e1kVar = tlsVar != null ? (e1k) tlsVar.invoke(d(str)) : null;
        kgx kgxVar2 = kgxVarArr[1];
        this.c.b(e1kVar);
    }

    @Override // defpackage.x08
    public final void cancel() {
        close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kse.a(this.x.a);
        this.w = null;
        kgx[] kgxVarArr = y;
        kgx kgxVar = kgxVarArr[0];
        this.b.b(null);
        kgx kgxVar2 = kgxVarArr[1];
        this.c.b(null);
    }

    public final ChatRequest d(String str) {
        ChatRequest chatRequest = this.a;
        return (chatRequest instanceof InviteThread ? (InviteThread) chatRequest : null) != null ? p8b.a(ChatId.Companion.a(str).b(((InviteThread) chatRequest).getParentMessageTs()).a) : chatRequest;
    }
}
