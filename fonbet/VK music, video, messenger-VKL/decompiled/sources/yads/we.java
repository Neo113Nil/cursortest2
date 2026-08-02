package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes10.dex */
public final class we {
    public final dg a;
    public final ip2 b;
    public final zg c;

    public /* synthetic */ we(Context context) {
        this(xe.a(context), new ip2(), new zg(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dp2 dp2Var, Map map, String str, j5 j5Var) {
        boolean z;
        int ordinal;
        bg bgVar;
        zg zgVar = this.c;
        qu2 a = zgVar.b.a(zgVar.c);
        boolean z2 = (a == null || a.s0) ? false : true;
        hx2 hx2Var = zgVar.b;
        hx2Var.getClass();
        synchronized (hx2.j) {
            z = hx2Var.g;
        }
        if (!zgVar.a() || z2 || !z) {
            return;
        }
        this.b.getClass();
        bg bgVar2 = null;
        try {
            ordinal = dp2Var.ordinal();
        } catch (Throwable unused) {
        }
        if (ordinal == 0) {
            bgVar = new bg(cg.e, ip2.c(str, map));
        } else if (ordinal == 4) {
            bgVar = new bg(cg.d, ip2.a(str, map));
        } else if (ordinal == 8) {
            bgVar = new bg(cg.c, ip2.a(map));
        } else if (ordinal == 21) {
            bgVar = new bg(cg.f, ip2.a(map, j5Var, str));
        } else if (ordinal == 26) {
            bgVar = new bg(cg.g, ip2.b(str, map));
        } else {
            if (ordinal != 36) {
                if (bgVar2 == null) {
                    ((ve) this.a).b(bgVar2);
                    return;
                }
                return;
            }
            bgVar = new bg(cg.h, ip2.d(str, map));
        }
        bgVar2 = bgVar;
        if (bgVar2 == null) {
        }
    }

    public we(dg dgVar, ip2 ip2Var, zg zgVar) {
        this.a = dgVar;
        this.b = ip2Var;
        this.c = zgVar;
    }
}
