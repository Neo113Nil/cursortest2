package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.agz0;
import xsna.mok;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ehz0 implements giz0 {
    public static final d4r0 g = new d4r0(6);
    public static final a h = new a();
    public static int i;
    public final idy0 a;
    public final Handler b;
    public final agz0 c;
    public ook d;
    public b e;
    public fhz0 f;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements giz0 {
        @Override // xsna.giz0
        public final void a() {
        }

        @Override // xsna.giz0
        public final void b(y8z0 y8z0Var) {
        }

        @Override // xsna.giz0
        public final boolean a(fjz0 fjz0Var, Uri uri, giy0 giy0Var, Context context) {
            return false;
        }

        @Override // xsna.giz0
        public final void b() {
        }
    }

    public ehz0(Handler handler, idy0 idy0Var) {
        this.b = handler;
        this.a = idy0Var;
        this.c = new agz0((Application) idy0Var.a);
    }

    public static giz0 c(idy0 idy0Var) {
        int i2;
        if (i == 0) {
            try {
                gu8.c(null, "CustomTabsFacade: custom tabs found: ".concat(eok.class.getName()));
                i2 = 1;
            } catch (Throwable unused) {
                i2 = 2;
            }
            i = i2;
        }
        if (idy0Var != null && i == 1) {
            try {
                return new ehz0(o8z0.g, idy0Var);
            } catch (Throwable unused2) {
            }
        } else if (idy0Var == null) {
            gu8.c(null, "CustomTabsFacade: sac==null");
        }
        return h;
    }

    @Override // xsna.giz0
    public final void a() {
        agz0 agz0Var = this.c;
        synchronized (agz0Var) {
            agz0.a aVar = agz0Var.b;
            if (aVar != null) {
                agz0Var.a.unregisterActivityLifecycleCallbacks(aVar);
                agz0Var.b = null;
            }
        }
        try {
            fhz0 fhz0Var = this.f;
            if (fhz0Var != null) {
                this.a.a.unbindService(fhz0Var);
            }
            this.f = null;
            this.d = null;
            this.e = null;
        } catch (Throwable unused) {
            this.f = null;
            this.d = null;
            this.e = null;
        }
    }

    @Override // xsna.giz0
    public final void b() {
        a();
        d(this.a, null);
    }

    public final void d(idy0 idy0Var, y8z0 y8z0Var) {
        String str;
        this.e = new b(this.b);
        this.f = new fhz0(this, y8z0Var);
        PackageManager packageManager = idy0Var.a.getPackageManager();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            intent.setPackage(str);
            if (packageManager.resolveService(intent, 0) != null) {
                break;
            }
        }
        if (str != null) {
            Context context = idy0Var.a;
            fhz0 fhz0Var = this.f;
            fhz0Var.setApplicationContext(context.getApplicationContext());
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent2.setPackage(str);
            }
            z = context.bindService(intent2, fhz0Var, 33);
        }
        if (z) {
            return;
        }
        this.e = null;
        this.f = null;
        this.d = null;
    }

    @Override // xsna.giz0
    public final void b(y8z0 y8z0Var) {
        a();
        d(this.a, y8z0Var);
    }

    @Override // xsna.giz0
    public final boolean a(fjz0 fjz0Var, Uri uri, giy0 giy0Var, Context context) {
        b bVar = this.e;
        ook ookVar = this.d;
        if (bVar == null || ookVar == null) {
            return false;
        }
        bVar.e = new u9c0(fjz0Var, 13);
        agz0 agz0Var = this.c;
        t12 t12Var = new t12(fjz0Var, 18);
        u12 u12Var = new u12(fjz0Var, 18);
        synchronized (agz0Var) {
            if (agz0Var.b == null) {
                agz0.a aVar = new agz0.a(t12Var, u12Var);
                agz0Var.b = aVar;
                agz0Var.a.registerActivityLifecycleCallbacks(aVar);
            }
        }
        mok a2 = new mok.a(ookVar).a();
        if (Build.VERSION.SDK_INT >= 30 && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                context = context.getApplicationContext();
            }
        }
        if (!(context instanceof Activity)) {
            a2.a.addFlags(268435456);
        }
        try {
            Intent intent = a2.a;
            intent.setData(uri);
            context.startActivity(intent, a2.b);
            return true;
        } catch (Throwable th) {
            giy0Var.c(2, 7001, "cti, message=" + th.getMessage() + "\nurl=" + uri);
            return false;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b extends eok {
        public final Handler c;
        public final HashSet d = new HashSet();
        public volatile t8z0 e = ehz0.g;

        public b(Handler handler) {
            this.c = handler;
        }

        @Override // xsna.eok
        public final void onNavigationEvent(int i, Bundle bundle) {
            Integer valueOf = Integer.valueOf(i);
            HashSet hashSet = this.d;
            if (hashSet.contains(valueOf)) {
                return;
            }
            hashSet.add(Integer.valueOf(i));
            this.c.post(new vv(this, i, 1));
        }

        @Override // xsna.eok
        public final void extraCallback(String str, Bundle bundle) {
        }
    }
}
