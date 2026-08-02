package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class h9b {
    public final kse a;
    public final l8g b;
    public final k020 c;
    public final p1b0 d;
    public final h3y e;
    public final wff0 f;
    public final m3b g;
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final zq60 j;
    public final sq60 k;

    public h9b(kse kseVar, l8g l8gVar, k020 k020Var, p1b0 p1b0Var, h3y h3yVar, wff0 wff0Var, m3b m3bVar) {
        this.a = kseVar;
        this.b = l8gVar;
        this.c = k020Var;
        this.d = p1b0Var;
        this.e = h3yVar;
        this.f = wff0Var;
        this.g = m3bVar;
        zq60 zq60Var = new zq60();
        this.j = zq60Var;
        this.k = new sq60(zq60Var);
        kse.a(kseVar);
    }

    public static final String a(h9b h9bVar, String str) {
        ChatId a = ChatId.Companion.a(str);
        ChatId.ThreadId threadId = a instanceof ChatId.ThreadId ? (ChatId.ThreadId) a : null;
        if (threadId != null) {
            return threadId.c().a;
        }
        return null;
    }

    public final s020 b(o1b0 o1b0Var, ChatRequest chatRequest) {
        kse.a(this.a);
        HashMap hashMap = this.h;
        s020 s020Var = (s020) hashMap.get(o1b0Var);
        if (s020Var != null && (!((m8g) s020Var).a.k || o1b0Var.k)) {
            return s020Var;
        }
        l8g l8gVar = this.b;
        l8gVar.getClass();
        chatRequest.getClass();
        m8g m8gVar = new m8g(l8gVar.a, l8gVar.b, l8gVar.c, o1b0Var, chatRequest);
        hashMap.put(o1b0Var, m8gVar);
        return m8gVar;
    }

    public final e1k c(ChatRequest chatRequest, b9b b9bVar) {
        kse.a(this.a);
        return this.f.d.get() ? e1k.M1 : new g9b(this, chatRequest, new a7b(3, this, b9bVar));
    }

    public final e1k d(ChatRequest chatRequest, d9b d9bVar) {
        kse.a(this.a);
        return this.f.d.get() ? e1k.M1 : new g9b(this, chatRequest, new a7b(2, this, d9bVar));
    }

    public final s020 e(String str) {
        kse kseVar = this.a;
        kse.a(kseVar);
        ExistingChatRequest a = p8b.a(str);
        kse.a(kseVar);
        o1b0 f = f(a);
        if (f != null) {
            return b(f, a);
        }
        return null;
    }

    public final o1b0 f(ChatRequest chatRequest) {
        HashMap hashMap = this.i;
        o1b0 o1b0Var = (o1b0) hashMap.get(chatRequest);
        if (o1b0Var != null && !o1b0Var.k) {
            return o1b0Var;
        }
        p1b0 p1b0Var = this.d;
        p1b0Var.getClass();
        o1b0 o1b0Var2 = (o1b0) chatRequest.handle(new aq80(p1b0Var));
        if (o1b0Var2 != null) {
            hashMap.put(chatRequest, o1b0Var2);
        }
        return o1b0Var2;
    }
}
