package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.X3;

/* loaded from: classes10.dex */
public final class xz0 implements be {
    public final a01 a;
    public final c01 b;

    public /* synthetic */ xz0(Context context) {
        this(new a01(context), new c01(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // yads.be
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final td a() {
        td tdVar;
        ResolveInfo resolveInfo;
        a01 a01Var = this.a;
        a01Var.getClass();
        try {
            a01Var.a.getClass();
        } catch (Throwable unused) {
        }
        if (AdvertisingIdClient.class != 0) {
            qn2 qn2Var = a01Var.a;
            Object[] objArr = {a01Var.c};
            qn2Var.getClass();
            Object a = qn2.a(AdvertisingIdClient.class, "getAdvertisingIdInfo", objArr);
            if (a != null) {
                String str = (String) pn2.a(a, "getId", new Object[0]);
                Boolean bool = (Boolean) pn2.a(a, X3.j.M, new Object[0]);
                a01Var.b.getClass();
                if (bool != null && str != null) {
                    tdVar = new td(str, bool.booleanValue());
                    if (tdVar == null) {
                        return tdVar;
                    }
                    c01 c01Var = this.b;
                    c01Var.d.getClass();
                    Intent a2 = e01.a();
                    ht2 ht2Var = c01Var.a;
                    Context context = c01Var.b;
                    ht2Var.getClass();
                    try {
                        resolveInfo = context.getPackageManager().resolveService(a2, 0);
                    } catch (Throwable unused2) {
                        resolveInfo = null;
                    }
                    if (resolveInfo == null) {
                        return null;
                    }
                    try {
                        zz0 zz0Var = new zz0();
                        if (!c01Var.b.bindService(a2, zz0Var, 1)) {
                            return null;
                        }
                        td a3 = c01Var.c.a(zz0Var);
                        c01Var.b.unbindService(zz0Var);
                        return a3;
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            }
        }
        tdVar = null;
        if (tdVar == null) {
        }
    }

    public xz0(a01 a01Var, c01 c01Var) {
        this.a = a01Var;
        this.b = c01Var;
    }
}
