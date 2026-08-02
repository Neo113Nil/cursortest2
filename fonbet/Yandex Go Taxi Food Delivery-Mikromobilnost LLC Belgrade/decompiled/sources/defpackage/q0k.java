package defpackage;

import android.content.Context;
import com.yandex.messaging.domain.user.UserNameType;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class q0k {
    public final Context a;
    public final mzz b = new mzz(50);
    public final HashMap c = new HashMap();
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;
    public final h3y h;
    public final db4 i;

    public q0k(Context context, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, db4 db4Var) {
        this.e = h3yVar2;
        this.h = h3yVar3;
        this.f = h3yVar4;
        this.g = h3yVar5;
        tje.e();
        this.a = context;
        this.d = h3yVar;
        this.i = db4Var;
    }

    public static void a(q0k q0kVar, zog zogVar, x4b0 x4b0Var) {
        String g;
        Context context = q0kVar.a;
        String str = x4b0Var.g;
        String str2 = x4b0Var.a;
        if ("L".equals(str)) {
            g = context.getString(oyh0.messenger_own_message_prefix);
        } else {
            rp21 rp21Var = (rp21) q0kVar.h.get();
            long c = rp21Var.b.c();
            in21 a = rp21Var.a.a().a(str2);
            g = h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c), context.getResources(), x4b0Var.d);
        }
        zogVar.b(h3t0.a, new czj(g, str2, x4b0Var.c, Boolean.FALSE));
    }

    public final zyj b(String str, int i, nl21 nl21Var) {
        tje.e();
        z83.h(null, i == 0 || i == gvg0.avatar_size_20 || i == gvg0.avatar_size_24 || i == gvg0.avatar_size_32 || i == gvg0.avatar_size_48 || i == gvg0.avatar_size_108);
        tje.e();
        HashMap hashMap = this.c;
        WeakReference weakReference = (WeakReference) hashMap.get(str);
        zog zogVar = weakReference != null ? (zog) weakReference.get() : null;
        if (zogVar == null) {
            zog zogVar2 = new zog(this.a, "me".equals(str) ? new qnh(this) : new apf(this, str), this.i);
            hashMap.put(str, new WeakReference(zogVar2));
            zogVar = zogVar2;
        }
        this.b.d(str, zogVar);
        return new zyj(this, zogVar, i, nl21Var);
    }
}
