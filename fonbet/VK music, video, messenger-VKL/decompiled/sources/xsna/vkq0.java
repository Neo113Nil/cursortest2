package xsna;

import android.annotation.SuppressLint;
import android.app.Application;
import android.location.Location;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.location.LocationRequest;
import com.vk.geo.impl.model.Coordinate;
import com.vk.location.common.LocationCommon;
import com.vk.permission.PermissionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: UserLocationWorkDelegate.kt */
/* loaded from: classes2.dex */
public final class vkq0 {
    public final Application a;
    public final yvj b;
    public final boolean c;
    public final boolean d;
    public final xu0 e;
    public final q69 f;
    public final i37 g;
    public jdr0 h;
    public yok0 i;
    public volatile Coordinate j;
    public final AtomicInteger k = new AtomicInteger(1);
    public volatile izs<? super Coordinate, s3q0> l;

    /* compiled from: UserLocationWorkDelegate.kt */
    public static final class a implements fzz {
        public a() {
        }

        @Override // xsna.fzz
        public final void a(Location location) {
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            Parcelable.Creator<Coordinate> creator = Coordinate.CREATOR;
            long a = gqr.a((float) latitude, (float) longitude);
            vkq0.this.j = new Coordinate(a);
            vkq0.this.g.invoke(new Coordinate(a));
        }
    }

    public vkq0(Application application, hpj hpjVar, boolean z, boolean z2, xu0 xu0Var, q69 q69Var, i37 i37Var) {
        this.a = application;
        this.b = hpjVar;
        this.c = z;
        this.d = z2;
        this.e = xu0Var;
        this.f = q69Var;
        this.g = i37Var;
        PermissionHelper permissionHelper = PermissionHelper.a;
        String[] strArr = PermissionHelper.i;
        permissionHelper.getClass();
        if (PermissionHelper.b(application, strArr)) {
            a(this, false, 2);
        }
    }

    public static void a(vkq0 vkq0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = vkq0Var.d;
        }
        vkq0Var.i = myc0.h(vkq0Var.b, hqu0.b(), null, new ukq0(vkq0Var, null, z, null), 2);
    }

    public final void b() {
        AtomicInteger atomicInteger;
        do {
            atomicInteger = this.k;
        } while (!atomicInteger.compareAndSet(atomicInteger.get(), 2));
        PermissionHelper permissionHelper = PermissionHelper.a;
        String[] strArr = PermissionHelper.i;
        permissionHelper.getClass();
        Application application = this.a;
        boolean b = PermissionHelper.b(application, strArr);
        q69 q69Var = this.f;
        if (!b) {
            if (this.c) {
                q69Var.invoke(dnt.a);
            }
        } else {
            LocationCommon.a.getClass();
            if (!LocationCommon.b(application)) {
                q69Var.invoke(ent.a);
            } else {
                d();
                a(this, true, 2);
            }
        }
    }

    public final void c(izs<? super Coordinate, s3q0> izsVar) {
        this.l = izsVar;
        PermissionHelper permissionHelper = PermissionHelper.a;
        Application application = this.a;
        String[] strArr = PermissionHelper.i;
        permissionHelper.getClass();
        if (!PermissionHelper.b(application, strArr)) {
            this.e.invoke();
            return;
        }
        Application application2 = this.a;
        LocationCommon.a.getClass();
        if (LocationCommon.b(application2)) {
            d();
            a(this, false, 3);
        } else {
            if (this.k.get() == 2) {
                this.f.invoke(ent.a);
            }
            this.e.invoke();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void d() {
        LocationCommon.a.getClass();
        Application application = this.a;
        if (!LocationCommon.b(application)) {
            this.f.invoke(ent.a);
        }
        if (this.h != null) {
            return;
        }
        a aVar = new a();
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.k(10000L);
        locationRequest.n();
        jdr0 jdr0Var = new jdr0(aVar);
        com.google.android.gms.common.api.a<a.d.c> aVar2 = wyz.a;
        new zzbp(application).requestLocationUpdates(locationRequest, jdr0Var, Looper.getMainLooper());
        this.h = jdr0Var;
    }
}
