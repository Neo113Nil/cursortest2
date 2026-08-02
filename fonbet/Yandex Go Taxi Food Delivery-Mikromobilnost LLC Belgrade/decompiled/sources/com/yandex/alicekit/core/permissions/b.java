package com.yandex.alicekit.core.permissions;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import defpackage.e2r;
import defpackage.f0b0;
import defpackage.h73;
import defpackage.hza0;
import defpackage.i3y;
import defpackage.mza0;
import defpackage.ny61;
import defpackage.nza0;
import defpackage.ohs0;
import defpackage.oyr;
import defpackage.pya0;
import defpackage.qke;
import defpackage.s5r;
import defpackage.sls;
import defpackage.tls;
import defpackage.yw01;
import defpackage.z83;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes11.dex */
public abstract class b {
    public final Activity a;
    public final SparseArray b = new SparseArray();
    public final ohs0 c = new ohs0();
    public final i3y d = kotlin.a.a(new sls() { // from class: com.yandex.alicekit.core.permissions.PermissionManager$metricaReporter$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            IReporter reporter = AppMetrica.getReporter(b.this.a.getApplicationContext(), "e48dd638-f5ba-4cb8-b272-53b6d275062f");
            reporter.putAppEnvironmentValue("AliceKitVersion", "250600.0");
            return reporter;
        }
    });

    public b(Activity activity) {
        this.a = activity;
    }

    public static e2r a(hza0 hza0Var) {
        int i = 1;
        return kotlin.sequences.b.p(new h73(i, hza0Var.b), new h73(i, hza0Var.c));
    }

    public final boolean b(Permission permission) {
        return qke.h(this.a, permission.getPermissionString()) == 0;
    }

    public final void c(int i, String[] strArr, int[] iArr) {
        zy11 zy11Var;
        Activity activity = this.a;
        HashSet hashSet = new HashSet(activity.getSharedPreferences("PermissionUtils.Prefs", 0).getStringSet("prefs_key_answered_permission_set", Collections.EMPTY_SET));
        for (String str : strArr) {
            if (!hashSet.contains(str)) {
                hashSet.add(str);
            }
        }
        activity.getSharedPreferences("PermissionUtils.Prefs", 0).edit().putStringSet("prefs_key_answered_permission_set", hashSet).apply();
        a aVar = new a(this, strArr, iArr);
        tls tlsVar = (tls) this.b.get(i);
        if (tlsVar != null) {
            tlsVar.invoke(aVar);
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var == null) {
            ((IReporter) this.d.getValue()).reportError("PermissionManager: Unexpected result with requestCode: " + i, null, null);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((mza0) it.next()).a(aVar);
        }
    }

    public final void d(int i) {
        this.b.remove(i);
    }

    public final void e(hza0 hza0Var) {
        zy11 zy11Var;
        int i = hza0Var.a;
        SparseArray sparseArray = this.b;
        sparseArray.get(i);
        z83.i();
        s5r s5rVar = new s5r(a(hza0Var));
        while (s5rVar.hasNext()) {
            if (!b((Permission) s5rVar.next())) {
                h(i, (String[]) kotlin.sequences.b.s(new yw01(kotlin.sequences.b.h(a(hza0Var), new tls() { // from class: com.yandex.alicekit.core.permissions.PermissionManager$notGrantedPermissions$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(b.this.b((Permission) obj));
                    }
                }), PermissionManager$performRequest$permissionsToRequest$1.w)).toArray(new String[0]));
                return;
            }
        }
        tls tlsVar = (tls) sparseArray.get(i);
        if (tlsVar != null) {
            tlsVar.invoke(new pya0(this, hza0Var));
            zy11Var = zy11.a;
        } else {
            zy11Var = null;
        }
        if (zy11Var != null) {
            return;
        }
        ny61.r(oyr.i(i, "Callback is not provided for request id: "));
    }

    public final void f(int i, final mza0 mza0Var) {
        tls tlsVar = new tls() { // from class: com.yandex.alicekit.core.permissions.PermissionManager$setListener$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                mza0.this.a((nza0) obj);
                return zy11.a;
            }
        };
        SparseArray sparseArray = this.b;
        sparseArray.get(i);
        z83.i();
        sparseArray.put(i, tlsVar);
    }

    public final void g(int i, int i2, int i3) {
        Activity activity = this.a;
        AlertDialog.a aVar = new AlertDialog.a(activity);
        aVar.c(i);
        aVar.setPositiveButton(i2, new f0b0(activity, 0));
        aVar.setNegativeButton(i3, null);
        AlertDialog create = aVar.create();
        create.show();
        View[] viewArr = {create.getListView(), create.getButton(-1), create.getButton(-2), create.getButton(-3)};
        for (int i4 = 0; i4 < 4; i4++) {
            View view = viewArr[i4];
            if (view != null) {
                view.setFilterTouchesWhenObscured(true);
            }
        }
    }

    public abstract void h(int i, String[] strArr);
}
