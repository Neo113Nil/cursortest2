package xsna;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.fx10;

/* compiled from: RegisteredMediaRouteProviderWatcher.java */
/* loaded from: classes12.dex */
public final class kqf0 {
    public final Context a;
    public final h1u b;
    public final PackageManager d;
    public boolean f;
    public boolean g;
    public final ArrayList<jqf0> e = new ArrayList<>();
    public final a h = new a();
    public final b i = new b();
    public final Handler c = new Handler();

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            kqf0.this.a();
        }
    }

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            kqf0.this.a();
        }
    }

    public kqf0(Context context, h1u h1uVar) {
        this.a = context;
        this.b = h1uVar;
        this.d = context.getPackageManager();
    }

    public final void a() {
        h1u h1uVar;
        ArrayList<jqf0> arrayList;
        int i;
        if (this.g) {
            ArrayList<ServiceInfo> arrayList2 = new ArrayList();
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.a;
            PackageManager packageManager = this.d;
            if (i2 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.f || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it2.hasNext();
                h1uVar = this.b;
                boolean z = true;
                arrayList = this.e;
                if (!hasNext) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if ((fx10.c == null ? false : fx10.c().i()) && !arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo3 : arrayList2) {
                            if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = arrayList.get(i4).j;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        jqf0 jqf0Var = new jqf0(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        jqf0Var.q = new cxd0(this, jqf0Var);
                        if (!jqf0Var.m) {
                            jqf0Var.m = true;
                            jqf0Var.p();
                        }
                        i = i3 + 1;
                        arrayList.add(i3, jqf0Var);
                        h1uVar.a(jqf0Var, false);
                    } else if (i4 >= i3) {
                        jqf0 jqf0Var2 = arrayList.get(i4);
                        if (!jqf0Var2.m) {
                            jqf0Var2.m = true;
                            jqf0Var2.p();
                        }
                        if (jqf0Var2.o == null) {
                            if (!jqf0Var2.m || (jqf0Var2.f == null && jqf0Var2.l.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                jqf0Var2.o();
                                jqf0Var2.l();
                            }
                        }
                        i = i3 + 1;
                        Collections.swap(arrayList, i4, i3);
                    }
                    i3 = i;
                }
            }
            if (i3 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                    jqf0 jqf0Var3 = arrayList.get(size2);
                    fx10.g d = h1uVar.d(jqf0Var3);
                    if (d != null) {
                        jqf0Var3.getClass();
                        fx10.b();
                        jqf0Var3.e = null;
                        jqf0Var3.k(null);
                        h1uVar.p(d, null);
                        h1uVar.a.b(514, d);
                        h1uVar.m.remove(d);
                    }
                    arrayList.remove(jqf0Var3);
                    jqf0Var3.q = null;
                    if (jqf0Var3.m) {
                        jqf0Var3.m = false;
                        jqf0Var3.p();
                    }
                }
            }
        }
    }
}
