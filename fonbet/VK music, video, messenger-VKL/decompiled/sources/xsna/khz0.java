package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import xsna.mez0;
import xsna.ocz0;
import xsna.zfz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class khz0 {
    public final mez0 a;
    public final String b = "IntrNativeAdCtrlImpl";
    public weq c;
    public final zfz0 d;

    public khz0(qnk qnkVar, weq weqVar, zfz0 zfz0Var) {
        this.a = new mez0(qnkVar, 1);
        this.c = weqVar;
        this.d = zfz0Var;
    }

    public final void a(xey0 xey0Var, mez0.c cVar, int i, fiz0 fiz0Var, Context context) {
        ocz0.b bVar;
        if (xey0Var == null || context == null) {
            return;
        }
        String l = (i != 2 || xey0Var.l() == null) ? xey0Var.J : xey0Var.l();
        if (l == null) {
            return;
        }
        boolean z = xey0Var instanceof ocz0;
        if (z) {
            String packageName = context.getPackageName();
            if (Objects.equals(packageName, "ru.vk.store") || Objects.equals(packageName, "ru.vk.store.qa")) {
                c(xey0Var, l, i, cVar, fiz0Var, context);
                return;
            }
        }
        if (z && (bVar = ((ocz0) xey0Var).V) != null && bVar.H != null) {
            this.a.e(xey0Var, l, i, fiz0Var, cVar, context);
            gu8.c(this.b, "click was handled internally");
            return;
        }
        if (xey0Var.x) {
            c(xey0Var, l, i, cVar, fiz0Var, context);
            return;
        }
        if (fiz0Var != null && fiz0Var.b()) {
            Uri.Builder buildUpon = Uri.parse(l).buildUpon();
            buildUpon.appendQueryParameter("click_target", String.valueOf(fiz0Var.b));
            l = buildUpon.build().toString();
        }
        jhz0 jhz0Var = new jhz0(this, xey0Var, i, fiz0Var, context, cVar);
        mez0 mez0Var = this.a;
        mez0Var.getClass();
        mez0.e.put(xey0Var, Boolean.TRUE);
        o8z0.c(new kez0(mez0Var.a, l, mez0Var.c, xey0Var.T, new kfg0(mez0Var, xey0Var, jhz0Var)));
    }

    public final void b(xey0 xey0Var, fiz0 fiz0Var, zfz0.a aVar, Context context) {
        int i;
        if (xey0Var == null || context == null) {
            return;
        }
        if (fiz0Var == null) {
            xey0Var.T.g(2, 7003, "ClickHandlerV2: additionalData is null");
            return;
        }
        zfz0 zfz0Var = this.d;
        weq weqVar = this.c;
        zfz0Var.getClass();
        xey0Var.T.b(2, 3, 7000, null, fiz0.a(fiz0Var));
        ndz0 ndz0Var = zfz0Var.b;
        synchronized (ndz0Var) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!ndz0Var.a && elapsedRealtime >= ndz0Var.c) {
                ndz0Var.a = true;
                HashMap hashMap = new HashMap();
                if (fiz0Var.b()) {
                    hashMap.put("click_target", String.valueOf(fiz0Var.b));
                }
                h8z0.f(xey0Var.a, "click", hashMap, 2);
                aVar.c();
                int i2 = !TextUtils.isEmpty(xey0Var.I) ? 0 : (!(fiz0Var.a == 64) || TextUtils.isEmpty(xey0Var.l())) ? 2 : 1;
                String l = i2 != 0 ? i2 != 1 ? xey0Var.J : xey0Var.l() : xey0Var.I;
                if (l != null) {
                    zfz0Var.a(xey0Var, context, l, i2, hashMap, fiz0Var, weqVar);
                }
                ndz0 ndz0Var2 = zfz0Var.b;
                synchronized (ndz0Var2) {
                    i = ndz0Var2.b;
                }
                if (i > 0) {
                    return;
                }
                ndz0 ndz0Var3 = zfz0Var.b;
                synchronized (ndz0Var3) {
                    ndz0Var3.a = false;
                    ndz0Var3.c = SystemClock.elapsedRealtime() + 800;
                }
                return;
            }
            xey0Var.T.g(2, 7005, "ClickHandlerV2: click not permitted until previuos was not handled");
        }
    }

    public final void c(xey0 xey0Var, String str, int i, mez0.c cVar, fiz0 fiz0Var, Context context) {
        boolean c;
        weq weqVar = this.c;
        if (weqVar == null) {
            c = false;
        } else {
            String l = xey0Var.l();
            List<String> list = xey0Var.s;
            String str2 = !TextUtils.isEmpty(str) ? str.equals(l) ? "ctaClick" : "click" : (TextUtils.isEmpty(xey0Var.H) && TextUtils.isEmpty(xey0Var.I)) ? null : "deeplinkClick";
            c = weqVar.c(str, list);
            if (c && str2 != null) {
                HashMap hashMap = new HashMap();
                if (fiz0Var != null && fiz0Var.b()) {
                    hashMap.put("click_target", String.valueOf(fiz0Var.b));
                }
                h8z0.f(xey0Var.a, str2, hashMap, 2);
                cVar.c();
            }
        }
        String str3 = this.b;
        if (c) {
            gu8.c(str3, "click was handled by external app");
        } else {
            this.a.e(xey0Var, str, i, fiz0Var, cVar, context);
            gu8.c(str3, "click was handled internally");
        }
    }
}
