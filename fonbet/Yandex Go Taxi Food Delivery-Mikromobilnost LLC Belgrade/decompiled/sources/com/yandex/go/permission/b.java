package com.yandex.go.permission;

import defpackage.bvf0;
import defpackage.j7j0;
import defpackage.jst;
import defpackage.jx81;
import defpackage.k40;
import defpackage.ndn;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.qke;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.w7j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class b implements v7j0 {
    public final tse a;
    public final k40 b;
    public final w7j0 c;
    public final j7j0 d;

    public b(tse tseVar, k40 k40Var, w7j0 w7j0Var, j7j0 j7j0Var) {
        this.a = tseVar;
        this.b = k40Var;
        this.c = w7j0Var;
        this.d = j7j0Var;
    }

    public final boolean a(int i) {
        int i2 = -1;
        k40 k40Var = this.b;
        switch (i) {
            case 1:
                return k40Var.a.b();
            case 2:
                return k40Var.j();
            case 3:
                return k40Var.a.c();
            case 4:
            default:
                ny61.g(oyr.i(i, "Unknown permission: "));
                return false;
            case 5:
                return k40Var.m();
            case 6:
                try {
                    i2 = qke.h(k40Var.a.a, "android.permission.WRITE_EXTERNAL_STORAGE");
                } catch (Exception e) {
                    jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1)));
                }
                if (i2 != 0) {
                    return false;
                }
                break;
            case 7:
                return k40Var.l();
            case 8:
                return k40Var.l() && k40Var.a.c();
            case 9:
                try {
                    i2 = qke.h(k40Var.a.a, "android.permission.READ_CONTACTS");
                } catch (Exception e2) {
                    jst.e.x(e2, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{"android.permission.READ_CONTACTS"}, 1)));
                }
                if (i2 != 0) {
                    return false;
                }
                break;
            case 10:
                return k40Var.i();
            case 11:
                return k40Var.a.h();
            case 12:
                return k40Var.a.f();
            case 13:
                return k40Var.a.e();
            case 14:
                return k40Var.k();
            case 15:
                return k40Var.a.g();
        }
        return true;
    }

    public final boolean b(String str) {
        int i;
        try {
            i = qke.h(this.b.a.a, str);
        } catch (Exception e) {
            jst.e.x(e, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{str}, 1)));
            i = -1;
        }
        return i == 0;
    }

    public final pzt0 c(int i, Consumer consumer) {
        return tje.N(this.a, null, null, new RequestPermissionInteractorImpl$requestPermissionIfNeeded$1(consumer, this, i, null), 3);
    }

    public final Object d(int i, Continuation continuation) {
        return a(i) ? Boolean.TRUE : bvf0.n(new RequestPermissionInteractorImpl$requestPermissionIfNeeded$3(this, i, null), continuation);
    }

    public final pzt0 e(ArrayList arrayList, ndn ndnVar) {
        return tje.N(this.a, null, null, new RequestPermissionInteractorImpl$requestPermissionsIfNeeded$1(ndnVar, this, arrayList, null), 3);
    }

    public final boolean f(int i) {
        k40 k40Var = this.b;
        if (i == 1) {
            return androidx.core.app.b.M(k40Var.b, "android.permission.ACCESS_FINE_LOCATION") && androidx.core.app.b.M(k40Var.b, "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (i == 3) {
            return androidx.core.app.b.M(k40Var.b, "android.permission.CAMERA");
        }
        if (i == 5) {
            return androidx.core.app.b.M(k40Var.b, "android.permission.READ_PHONE_STATE");
        }
        if (i == 15) {
            return androidx.core.app.b.M(k40Var.b, "android.permission.ACCESS_FINE_LOCATION");
        }
        if (i == 11) {
            if (jx81.e()) {
                return androidx.core.app.b.M(k40Var.b, "android.permission.BLUETOOTH_SCAN");
            }
            k40Var.getClass();
            return true;
        }
        if (i != 12) {
            ny61.g(oyr.i(i, "Unknown permission: "));
            return false;
        }
        if (jx81.f()) {
            return androidx.core.app.b.M(k40Var.b, "android.permission.POST_NOTIFICATIONS");
        }
        k40Var.getClass();
        return false;
    }
}
