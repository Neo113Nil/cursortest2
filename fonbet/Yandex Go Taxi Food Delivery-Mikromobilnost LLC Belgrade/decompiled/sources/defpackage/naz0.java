package defpackage;

import androidx.room.util.a;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;

/* loaded from: classes15.dex */
public final class naz0 {
    public final o1b0 a;
    public final at2 b;
    public final k020 c;
    public final lqo d;

    public naz0(o1b0 o1b0Var, at2 at2Var, k020 k020Var, lqo lqoVar) {
        this.a = o1b0Var;
        this.b = at2Var;
        this.c = k020Var;
        this.d = lqoVar;
    }

    public final String a() {
        o1b0 o1b0Var = this.a;
        if (!o1b0Var.n) {
            return null;
        }
        return (String) a.b(this.b.Y().a, true, false, new hcb(o1b0Var.a, 9));
    }

    public final String b() {
        if (this.d.a(tz10.s)) {
            return this.b.z().a(this.a.a);
        }
        return null;
    }

    public final String c() {
        o1b0 o1b0Var = this.a;
        String str = o1b0Var.b;
        return ChatId.Companion.f(str) ? "thread" : o1b0Var.e ? "saved messages" : o1b0Var.f ? "bot" : o1b0Var.d ? "personal" : ChatId.Companion.f(str) ? "thread" : ChatNamespaces.b(str) ? "channel" : "group";
    }

    public final String d() {
        o1b0 o1b0Var = this.a;
        if (o1b0Var.d || o1b0Var.e) {
            return null;
        }
        meb Y = this.b.Y();
        Long l = o1b0Var.i;
        return (String) a.b(Y.a, true, false, new hcb(l != null ? l.longValue() : o1b0Var.a, 8));
    }

    public final String e() {
        o1b0 o1b0Var = this.a;
        if (o1b0Var.d || o1b0Var.e || this.c.k(o1b0Var.a).L) {
            return null;
        }
        return d();
    }
}
