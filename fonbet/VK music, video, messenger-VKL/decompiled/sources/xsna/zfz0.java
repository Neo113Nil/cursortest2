package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class zfz0 {
    public static final List d = Arrays.asList("google_play", "app_store", "rustore", "appgallery", "galaxystore", "mistore");
    public static final List e = Arrays.asList("lead_form", "leadform");
    public final qnk a;
    public final ndz0 b;
    public final z8z0 c;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void c();
    }

    public zfz0(qnk qnkVar) {
        this.a = qnkVar;
        ndz0 ndz0Var = new ndz0();
        ndz0Var.a = false;
        ndz0Var.b = 0;
        ndz0Var.c = 0L;
        this.b = ndz0Var;
        this.c = new z8z0();
    }

    public static boolean b(List list, List list2) {
        if (list == null || list2 == null || list.isEmpty() || list2.isEmpty()) {
            return false;
        }
        return !Collections.disjoint(list, new HashSet(list2));
    }

    public final void a(xey0 xey0Var, Context context, String str, int i, HashMap hashMap, fiz0 fiz0Var, weq weqVar) {
        if (i != 0) {
            if (i == 1) {
                h8z0.f(xey0Var.a, "ctaClick", hashMap, 2);
                c(xey0Var, context, str, hashMap, fiz0Var, weqVar);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                c(xey0Var, context, str, hashMap, fiz0Var, weqVar);
                return;
            }
        }
        int i2 = 1;
        h8z0.f(xey0Var.a, "deeplinkClick", hashMap, 2);
        if (z8z0.b(context, xey0Var.H, str)) {
            xey0Var.T.b(2, 3, 7002, null, fiz0.a(fiz0Var));
            return;
        }
        boolean z = fiz0Var.a == 64;
        String l = xey0Var.l();
        if (!z || l == null || TextUtils.isEmpty(l)) {
            l = xey0Var.J;
            i2 = 2;
        }
        String str2 = l;
        if (str2 != null) {
            a(xey0Var, context, str2, i2, hashMap, fiz0Var, weqVar);
        } else {
            xey0Var.T.b(2, 3, 7001, null, fiz0.a(fiz0Var));
        }
    }

    public final void c(final xey0 xey0Var, final Context context, String str, HashMap hashMap, final fiz0 fiz0Var, weq weqVar) {
        String str2 = str;
        ndz0 ndz0Var = this.b;
        z8z0 z8z0Var = this.c;
        if (!hashMap.isEmpty() && (str2.equals(xey0Var.J) || str2.equals(xey0Var.l()))) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            for (Map.Entry entry : hashMap.entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            str2 = buildUpon.build().toString();
        }
        final String str3 = str2;
        if (weqVar != null && weqVar.c(str3, xey0Var.s)) {
            xey0Var.T.b(2, 3, 7002, null, fiz0.a(fiz0Var));
            return;
        }
        List list = xey0Var.s;
        if (b(list, d)) {
            xey0Var.T.b(2, 3, z8z0.b(context, xey0Var.H, str3) ? 7002 : 7001, null, fiz0.a(fiz0Var));
            return;
        }
        if (b(list, e)) {
            xey0Var.T.b(2, 3, 7002, null, fiz0.a(fiz0Var));
            if (xey0Var.x) {
                mfz0.a(str3, this.a, context);
                return;
            }
            synchronized (ndz0Var) {
                ndz0Var.b++;
            }
            o8z0.c(new uhw(this, str3, new x3g0(this, str3, xey0Var, context, fiz0Var), 2));
            return;
        }
        if (xey0Var.x) {
            z8z0Var.a(xey0Var, context, str3);
            xey0Var.T.b(2, 3, 7002, null, fiz0.a(fiz0Var));
        } else {
            synchronized (ndz0Var) {
                ndz0Var.b++;
            }
            o8z0.c(new uhw(this, str3, new t8z0(str3, xey0Var, context, fiz0Var) { // from class: xsna.yfz0
                public final /* synthetic */ String c;
                public final /* synthetic */ xey0 d;
                public final /* synthetic */ Context e;

                @Override // xsna.t8z0
                public final void accept(Object obj) {
                    zfz0 zfz0Var = zfz0.this;
                    String str4 = this.c;
                    xey0 xey0Var2 = this.d;
                    Context context2 = this.e;
                    String str5 = (String) obj;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    zfz0Var.c.a(xey0Var2, context2, str4);
                    ndz0 ndz0Var2 = zfz0Var.b;
                    synchronized (ndz0Var2) {
                        int i = ndz0Var2.b - 1;
                        ndz0Var2.b = i;
                        if (i == 0) {
                            synchronized (ndz0Var2) {
                                ndz0Var2.a = false;
                                ndz0Var2.c = SystemClock.elapsedRealtime() + 800;
                            }
                        }
                    }
                }
            }, 2));
        }
    }
}
