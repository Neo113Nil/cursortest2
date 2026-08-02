package defpackage;

import android.content.Context;
import androidx.room.util.a;
import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import com.yandex.messaging.domain.user.UserNameType;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.images.b;

/* loaded from: classes15.dex */
public class p150 {
    public final Context a;
    public final o1b0 b;
    public final at2 c;
    public final oeb d;
    public final rp21 e;
    public final z5z f;
    public final h3y g;
    public final String h;
    public final String i;
    public final bv21 j;
    public final meb k;

    public p150(Context context, o1b0 o1b0Var, at2 at2Var, oeb oebVar, rp21 rp21Var, z5z z5zVar, h3y h3yVar) {
        this.a = context;
        this.b = o1b0Var;
        this.c = at2Var;
        this.d = oebVar;
        this.e = rp21Var;
        this.f = z5zVar;
        this.g = h3yVar;
        this.h = context.getString(oyh0.messaging_default_group_chat_name);
        this.i = context.getString(oyh0.messaging_saved_messages_chat);
        this.j = at2Var.a();
        this.k = at2Var.Y();
    }

    public final String a() {
        o1b0 o1b0Var = this.b;
        if (o1b0Var.e) {
            return "";
        }
        if (!o1b0Var.d) {
            return o1b0Var.b;
        }
        String str = o1b0Var.c;
        return str == null ? "" : str;
    }

    public final String b(String str) {
        rp21 rp21Var = this.e;
        long c = rp21Var.b.c();
        in21 a = rp21Var.a.a().a(str);
        return h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c), this.a.getResources(), null);
    }

    public final String c() {
        String avatarId;
        String a = this.d.a(this.b);
        if (a == null) {
            return null;
        }
        boolean z = ((iv21) this.g.get()).c;
        int i = 20;
        bv21 bv21Var = this.j;
        if (!z) {
            return (String) a.b(bv21Var.a, true, false, new il01(a, i));
        }
        LocalizedData a2 = this.f.a(a);
        return (a2 == null || (avatarId = a2.getAvatarId()) == null) ? (String) a.b(bv21Var.a, true, false, new il01(a, i)) : b.f(avatarId);
    }

    public final String d() {
        String displayName;
        String a = this.d.a(this.b);
        if (a == null) {
            return "";
        }
        if (!((iv21) this.g.get()).c) {
            return b(a);
        }
        LocalizedData a2 = this.f.a(a);
        return (a2 == null || (displayName = a2.getDisplayName()) == null) ? b(a) : displayName;
    }

    public final String e() {
        o1b0 o1b0Var = this.b;
        if (o1b0Var.e) {
            return "messenger://saved_messages_icon_uri";
        }
        if (o1b0Var.d || ChatId.Companion.f(o1b0Var.b)) {
            return c();
        }
        if (!o1b0Var.p) {
            return f();
        }
        String f = f();
        return f == null ? c() : f;
    }

    public final String f() {
        String str = (String) a.b(this.k.a, true, false, new hcb(this.b.a, 15));
        if (str != null) {
            return b.f(str);
        }
        return null;
    }

    public final String g() {
        return (String) a.b(this.k.a, true, false, new hcb(this.b.a, 17));
    }

    public final String h() {
        String d;
        o1b0 o1b0Var = this.b;
        if (o1b0Var.e) {
            d = this.i;
        } else if (o1b0Var.d || ChatId.Companion.f(o1b0Var.b)) {
            d = d();
        } else if (o1b0Var.p) {
            d = g();
            if (d == null) {
                d = d();
            }
        } else {
            d = g();
        }
        if (d != null) {
            if (evu0.J(d)) {
                d = null;
            }
            if (d != null) {
                return d;
            }
        }
        return this.h;
    }

    public final m150 i() {
        n1b0 a;
        Integer a2;
        h3t0 takeSnapshot = this.c.takeSnapshot();
        String h = h();
        String a3 = a();
        String e = e();
        o1b0 o1b0Var = this.b;
        boolean z = o1b0Var.n;
        String str = o1b0Var.b;
        boolean z2 = o1b0Var.d;
        boolean z3 = true;
        if (!z && ((z || z2 || ChatId.Companion.f(str)) && (!ChatId.Companion.f(str) || z2 || (a = o1b0Var.a()) == null || (a2 = a.c.c().a()) == null || a2.intValue() != 1))) {
            z3 = false;
        }
        return new m150(takeSnapshot, h, a3, e, z3);
    }
}
