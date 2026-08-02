package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.monetization.ads.utils.logger.collectors.MobileAdsLogsCollector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import yads.q91;

/* loaded from: classes7.dex */
public final class ns71 {
    public final df81 a;
    public final oq71 b;
    public final j291 c;
    public final ka81 d;
    public final nu71 e;
    public final fa71 f;

    public ns71(df81 df81Var, oq71 oq71Var, j291 j291Var, ka81 ka81Var, nu71 nu71Var, fa71 fa71Var) {
        this.a = df81Var;
        this.b = oq71Var;
        this.c = j291Var;
        this.d = ka81Var;
        this.e = nu71Var;
        this.f = fa71Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        if (defpackage.evu0.J(r0) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xk81 a() {
        PackageInfo packageInfo;
        al81 al81Var;
        String str;
        String str2;
        String str3;
        boolean z;
        List J0;
        bo81 bo81Var;
        PackageManager.PackageInfoFlags of;
        df81 df81Var = this.a;
        Context context = df81Var.a;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i >= 33) {
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        }
        df81Var.b.getClass();
        String str4 = Build.VERSION.RELEASE;
        if (str4 == null) {
            str4 = "Undefined";
        }
        String concat = "Android ".concat(str4);
        String i2 = oyr.i(i, "API ");
        String str5 = packageInfo.packageName;
        String str6 = packageInfo.versionName;
        if (str6 == null) {
            str6 = "";
        }
        b971 b971Var = new b971(str5, str6, concat, i2);
        oq71 oq71Var = this.b;
        rk71 rk71Var = oq71Var.b;
        Context context2 = oq71Var.a;
        rk71Var.getClass();
        eh71 a = rk71.a(context2);
        bo81 bo81Var2 = null;
        if (jl40.l(a, ib71.a)) {
            al81Var = new al81(true, EmptyList.a);
        } else {
            if (!(a instanceof ie71)) {
                w511.b();
                return null;
            }
            List list = ((ie71) a).a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((q91) it.next()).getMessage());
            }
            al81Var = new al81(false, arrayList);
        }
        al81 al81Var2 = al81Var;
        j291 j291Var = this.c;
        j291Var.getClass();
        ArrayList a2 = j291Var.a.a(tka1.b());
        ka81 ka81Var = this.d;
        ka81Var.a.getClass();
        Object obj = a081.f;
        synchronized (obj) {
        }
        Boolean c = ka81Var.a.c();
        ka81Var.a.getClass();
        synchronized (obj) {
        }
        zq71 zq71Var = ka81Var.b;
        zq71Var.getClass();
        Object obj2 = zq71.g;
        synchronized (obj2) {
            str = zq71Var.a;
        }
        if (str == null || evu0.J(str)) {
            zq71 zq71Var2 = ka81Var.b;
            zq71Var2.getClass();
            synchronized (obj2) {
                str2 = zq71Var2.d;
            }
            if (str2 == null || evu0.J(str2)) {
                zq71 zq71Var3 = ka81Var.b;
                zq71Var3.getClass();
                synchronized (obj2) {
                    str3 = zq71Var3.b;
                }
                if (str3 != null) {
                }
                ru71 ru71Var = new ru71(c, z2);
                a081 a081Var = this.e.a;
                a081Var.getClass();
                synchronized (obj) {
                    z = a081Var.d;
                }
                xx71 xx71Var = new xx71(z);
                fa71 fa71Var = this.f;
                fa71Var.getClass();
                synchronized (fa71.c) {
                    if (MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
                        jb71 jb71Var = fa71Var.a;
                        jb71Var.getClass();
                        synchronized (jb71.c) {
                            J0 = a.J0(jb71Var.a);
                        }
                        bo81Var2 = new bo81(J0, fa71Var.b.getAll());
                    }
                    bo81Var = bo81Var2;
                }
                return new xk81(b971Var, al81Var2, a2, ru71Var, xx71Var, bo81Var);
            }
        }
        z2 = true;
        ru71 ru71Var2 = new ru71(c, z2);
        a081 a081Var2 = this.e.a;
        a081Var2.getClass();
        synchronized (obj) {
        }
    }
}
