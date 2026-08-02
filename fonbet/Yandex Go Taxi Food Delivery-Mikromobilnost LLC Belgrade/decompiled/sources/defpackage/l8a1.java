package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import coil3.size.Precision;
import com.yandex.go.design.compose.slot.SlotSize;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import yads.d4;

/* loaded from: classes11.dex */
public abstract class l8a1 {
    public static final Object a = new Object();
    public static q041 b;

    public static final void a(String str, CharSequence charSequence, CharSequence charSequence2, boolean z, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1219186603);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(charSequence) ? 32 : 16) | (btsVar2.k(charSequence2) ? 256 : 128) | (btsVar2.a(z) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i3 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar = btsVar2;
            ydb1.a(null, wwg.S(-822390187, true, new jk30(str), btsVar2), wwg.S(860928954, true, new cwo(i3, charSequence, charSequence2, z), btsVar2), null, null, null, SlotSize.L, false, btsVar, 1573296, 185);
            f530Var2 = c530.a;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(i, 9, str, charSequence, charSequence2, f530Var2, z);
        }
    }

    public static dl61 b(fe81 fe81Var, d4 d4Var) {
        String str;
        String str2;
        switch (d4Var.ordinal()) {
            case 0:
            case 5:
                dl61 dl61Var = so61.a;
                String str3 = fe81Var != null ? fe81Var.c.a : null;
                if (str3 == null || str3.length() == 0) {
                    str = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
                    str2 = "Invalid Ad Unit Id. AdUnitId should be not empty string";
                } else {
                    str = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
                    str2 = "Provided ad unit id doesn't exist";
                }
                return so61.a(2, str2, String.format(Locale.US, str, Arrays.copyOf(new Object[]{str3}, 1)));
            case 1:
                return so61.c;
            case 2:
                return so61.h;
            case 3:
                return so61.d;
            case 4:
                return so61.e;
            case 6:
                return so61.n;
            case 7:
                return so61.g;
            case 8:
                return so61.j;
            case 9:
                return so61.k;
            case 10:
                return so61.p;
            case 11:
                return so61.q;
            case 12:
                return so61.r;
            case 13:
                return so61.s;
            case 14:
                return so61.t;
            case 15:
                return so61.o;
            default:
                w511.b();
                return null;
        }
    }

    public static void c(Context context) {
        if (b == null) {
            q041 q041Var = new q041(context);
            b = q041Var;
            synchronized (q041Var.a) {
                q041Var.g = true;
            }
        }
    }

    public static void d(Intent intent) {
        synchronized (a) {
            try {
                if (b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    b.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Bitmap e(q7v q7vVar, lg70 lg70Var, List list) {
        if (q7vVar instanceof w06) {
            Bitmap bitmap = ((w06) q7vVar).a;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            if (j73.y(zx21.a, config)) {
                return bitmap;
            }
        }
        return om91.e(cma1.j(q7vVar, lg70Var.a.getResources()), (Bitmap.Config) s8o.p(lg70Var, lev.a), lg70Var.b, lg70Var.c, (xis0) s8o.p(lg70Var, kev.b), lg70Var.d == Precision.INEXACT);
    }

    public static ComponentName f(Context context, Intent intent) {
        synchronized (a) {
            try {
                c(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    b.a();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
