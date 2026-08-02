package defpackage;

import android.os.Looper;
import com.yandex.messaging.ChatAliasRequest;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.InviteChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import com.yandex.messaging.internal.SavedMessages;
import com.yandex.messaging.internal.net.Error;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class f9b implements e1k, o1b {
    public static final /* synthetic */ kgx[] z;
    public final ChatRequest a;
    public final b9b b;
    public final qp3 c;
    public o1b0 w;
    public String x;
    public final /* synthetic */ h9b y;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("createChatDisposable", 0, "getCreateChatDisposable()Lcom/yandex/alicekit/core/Disposable;", f9b.class);
        qoi0.a.getClass();
        z = new kgx[]{mutablePropertyReference1Impl};
    }

    public f9b(h9b h9bVar, ChatRequest chatRequest, b9b b9bVar) {
        this.y = h9bVar;
        this.a = chatRequest;
        this.b = b9bVar;
        qp3 qp3Var = new qp3();
        this.c = qp3Var;
        h9bVar.j.b(this);
        o1b0 f = h9bVar.f(chatRequest);
        if (f == null) {
            v1b a = ((w1b) h9bVar.e.get()).a(chatRequest, this);
            kgx kgxVar = z[0];
            qp3Var.b(a);
        } else {
            this.w = f;
            s020 b = h9bVar.b(f, chatRequest);
            this.x = h9b.a(h9bVar, f.b);
            b9bVar.k(d(f), b);
        }
    }

    @Override // defpackage.o1b
    public final void a(Error error) {
        kse.a(this.y.a);
        z83.i();
        z83.i();
        this.b.a(error);
    }

    @Override // defpackage.o1b
    public final void c(String str) {
        h9b h9bVar = this.y;
        kse.a(h9bVar.a);
        z83.i();
        z83.i();
        z83.i();
        o1b0 f = h9bVar.f(p8b.a(str));
        if (f == null) {
            ny61.g("Required value was null.");
            return;
        }
        this.x = h9b.a(h9bVar, f.b);
        s020 b = h9bVar.b(f, this.a);
        this.b.k(h9bVar.c.k(f.a), b);
        this.w = f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h9b h9bVar = this.y;
        kse.a(h9bVar.a);
        kgx kgxVar = z[0];
        this.c.b(null);
        h9bVar.j.d(this);
    }

    public final j3b d(o1b0 o1b0Var) {
        m3b m3bVar = this.y.g;
        l3b l3bVar = (l3b) m3bVar.b.get(o1b0Var.b);
        j3b j3bVar = null;
        if (l3bVar != null) {
            j3b j3bVar2 = l3bVar.a;
            if (l3bVar.b) {
                j3bVar = j3bVar2;
            }
        }
        if (j3bVar != null) {
            return j3bVar;
        }
        j3b k = this.y.c.k(o1b0Var.a);
        m3b m3bVar2 = this.y.g;
        String str = o1b0Var.b;
        ChatRequest chatRequest = this.a;
        synchronized (m3bVar2) {
            try {
                m3bVar2.a.getClass();
                Looper.myLooper();
                z83.i();
                l3b l3bVar2 = new l3b(k, true);
                if (chatRequest instanceof InviteChatRequest) {
                    m3bVar2.c.put(((InviteChatRequest) chatRequest).inviteHash(), str);
                } else if (chatRequest instanceof PrivateChatRequest) {
                    m3bVar2.d.put(((PrivateChatRequest) chatRequest).addressee(), str);
                } else if (chatRequest instanceof ChatAliasRequest) {
                    m3bVar2.e.put(((ChatAliasRequest) chatRequest).alias(), str);
                } else if (chatRequest instanceof SavedMessages) {
                    m3bVar2.b.put(((SavedMessages) chatRequest).uniqueRequestId(), l3bVar2);
                }
                m3bVar2.b.put(str, l3bVar2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return k;
    }
}
