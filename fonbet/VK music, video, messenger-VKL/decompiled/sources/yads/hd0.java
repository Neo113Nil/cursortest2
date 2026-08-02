package yads;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class hd0 {
    public final Object a = new Object();
    public xm1 b;
    public gd0 c;

    public static gd0 a(xm1 xm1Var) {
        pd0 pd0Var = new pd0();
        pd0Var.b = null;
        Uri uri = xm1Var.b;
        y11 y11Var = new y11(uri != null ? uri.toString() : null, xm1Var.f, pd0Var);
        nb3 it = xm1Var.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (y11Var.d) {
                y11Var.d.put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = jr.a;
        ae0 ae0Var = new ae0(0);
        UUID uuid2 = xm1Var.a;
        nn0 nn0Var = xx0.d;
        uuid2.getClass();
        nn0Var.getClass();
        boolean z = xm1Var.d;
        boolean z2 = xm1Var.e;
        int[] a = wd1.a(xm1Var.g);
        for (int i : a) {
            if (i != 2 && i != 1) {
                throw new IllegalArgumentException();
            }
        }
        gd0 gd0Var = new gd0(uuid2, nn0Var, y11Var, hashMap, z, (int[]) a.clone(), z2, ae0Var, 300000L);
        byte[] a2 = xm1Var.a();
        if (!gd0Var.m.isEmpty()) {
            throw new IllegalStateException();
        }
        gd0Var.v = 0;
        gd0Var.w = a2;
        return gd0Var;
    }

    public final tk0 a(gn1 gn1Var) {
        gd0 gd0Var;
        gn1Var.c.getClass();
        xm1 xm1Var = gn1Var.c.c;
        if (xm1Var != null && mc3.a >= 18) {
            synchronized (this.a) {
                try {
                    if (!mc3.a(xm1Var, this.b)) {
                        this.b = xm1Var;
                        this.c = a(xm1Var);
                    }
                    gd0Var = this.c;
                    gd0Var.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gd0Var;
        }
        return tk0.a;
    }
}
