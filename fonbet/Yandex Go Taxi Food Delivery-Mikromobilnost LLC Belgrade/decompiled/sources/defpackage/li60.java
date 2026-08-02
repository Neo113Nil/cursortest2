package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class li60 implements zab {
    public final boolean a;
    public final boolean b;
    public final Context c;
    public final o1b0 d;
    public final ml21 e;
    public final at2 f;
    public final uu10 g;
    public final pe10 h;
    public final poc i;
    public final h3y j;
    public final hdu k;
    public final lqo l;
    public final h3y m;
    public boolean n;

    public li60(boolean z, boolean z2, Context context, o1b0 o1b0Var, ml21 ml21Var, at2 at2Var, uu10 uu10Var, pe10 pe10Var, poc pocVar, h3y h3yVar, hdu hduVar, lqo lqoVar, h3y h3yVar2) {
        this.a = z;
        this.b = z2;
        this.c = context;
        this.d = o1b0Var;
        this.e = ml21Var;
        this.f = at2Var;
        this.g = uu10Var;
        this.h = pe10Var;
        this.i = pocVar;
        this.j = h3yVar;
        this.k = hduVar;
        this.l = lqoVar;
        this.m = h3yVar2;
    }

    public final String a(in21 in21Var, in21 in21Var2) {
        String str;
        if (in21Var == null) {
            return " ";
        }
        String str2 = in21Var.a;
        if (this.d.n && (str = in21Var.m) != null) {
            str2 = str;
        }
        String str3 = in21Var2 != null ? in21Var2.a : null;
        if (str3 != null && str3.length() != 0) {
            str2 = g8e.p(str2, " → ", str3);
        }
        return Build.VERSION.SDK_INT < 30 ? b64.j(str2, ":") : str2;
    }

    public final ii60 b(yab yabVar, n15 n15Var) {
        MessageData R = yabVar.R();
        if (!vkb1.f(R, ((tqq0) this.m.get()).c) && !yabVar.Q0()) {
            this.g.getClass();
            if (uu10.a(R)) {
                this.n = true;
                hdu h = n15Var.h(R);
                ReplyData n0 = yabVar.n0();
                ArrayList arrayList = (ArrayList) h.b;
                ml21 ml21Var = this.e;
                boolean contains = arrayList.contains(ml21Var.a);
                boolean z = n0 != null && jl40.l(ml21Var.a, n0.getAuthorGuid());
                boolean z2 = yabVar.b1() || R.notificationBehaviour == 2;
                if (!this.a || contains || z || z2) {
                    bv21 a = this.f.a();
                    in21 a2 = a.a(yabVar.a());
                    String k = yabVar.k();
                    return new ii60((String) h.a, yabVar.U(), yabVar.T().getTime(), R.type, yabVar.a(), a(a2, k != null ? a.a(k) : null), this.k.i(R), R, yabVar.e0(), false, contains, z, R.notificationBehaviour == 3, 512);
                }
            }
        }
        return null;
    }

    public final ii60 c(yab yabVar, n15 n15Var) {
        if (!this.n && this.b) {
            return null;
        }
        MessageData R = yabVar.R();
        if (vkb1.f(R, ((tqq0) this.m.get()).c)) {
            return null;
        }
        this.g.getClass();
        if (uu10.a(R)) {
            return new ii60((String) n15Var.h(R).a, yabVar.U(), yabVar.T().getTime(), R.type, "", null, this.k.i(R), R, yabVar.e0(), false, false, false, R.notificationBehaviour == 3, HProv.ALG_TYPE_GR3410);
        }
        return null;
    }
}
