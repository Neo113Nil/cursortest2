package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class usz0 extends v601 {
    public final mb01 a;
    public final bf01 b;

    public usz0(@NonNull mb01 mb01Var) {
        exc0.i(mb01Var);
        this.a = mb01Var;
        bf01 bf01Var = mb01Var.q;
        mb01.j(bf01Var);
        this.b = bf01Var;
    }

    @Override // xsna.cf01
    public final void a(String str, String str2, Bundle bundle) {
        bf01 bf01Var = this.b;
        ((mb01) bf01Var.b).o.getClass();
        bf01Var.q(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // xsna.cf01
    public final void b(String str) {
        mb01 mb01Var = this.a;
        w601 m = mb01Var.m();
        mb01Var.o.getClass();
        m.l(SystemClock.elapsedRealtime(), str);
    }

    @Override // xsna.cf01
    public final void c(String str) {
        mb01 mb01Var = this.a;
        w601 m = mb01Var.m();
        mb01Var.o.getClass();
        m.m(SystemClock.elapsedRealtime(), str);
    }

    @Override // xsna.cf01
    public final Map d(String str, String str2, boolean z) {
        bf01 bf01Var = this.b;
        mb01 mb01Var = (mb01) bf01Var.b;
        kb01 kb01Var = mb01Var.k;
        k901 k901Var = mb01Var.j;
        mb01.k(kb01Var);
        if (kb01Var.u()) {
            mb01.k(k901Var);
            k901Var.i.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (fai.G()) {
            mb01.k(k901Var);
            k901Var.i.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        kb01 kb01Var2 = mb01Var.k;
        mb01.k(kb01Var2);
        kb01Var2.p(atomicReference, 5000L, "get user properties", new re01(bf01Var, atomicReference, str, str2, z));
        List<zzkw> list = (List) atomicReference.get();
        if (list == null) {
            mb01.k(k901Var);
            k901Var.i.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        zk3 zk3Var = new zk3(list.size());
        for (zzkw zzkwVar : list) {
            Object zza = zzkwVar.zza();
            if (zza != null) {
                zk3Var.put(zzkwVar.c, zza);
            }
        }
        return zk3Var;
    }

    @Override // xsna.cf01
    public final void e(Bundle bundle) {
        bf01 bf01Var = this.b;
        ((mb01) bf01Var.b).o.getClass();
        bf01Var.v(bundle, System.currentTimeMillis());
    }

    @Override // xsna.cf01
    public final void f(String str, String str2, Bundle bundle) {
        bf01 bf01Var = this.a.q;
        mb01.j(bf01Var);
        bf01Var.o(str, str2, bundle);
    }

    @Override // xsna.cf01
    public final List i(String str, String str2) {
        bf01 bf01Var = this.b;
        mb01 mb01Var = (mb01) bf01Var.b;
        kb01 kb01Var = mb01Var.k;
        k901 k901Var = mb01Var.j;
        mb01.k(kb01Var);
        if (kb01Var.u()) {
            mb01.k(k901Var);
            k901Var.i.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (fai.G()) {
            mb01.k(k901Var);
            k901Var.i.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        kb01 kb01Var2 = mb01Var.k;
        mb01.k(kb01Var2);
        kb01Var2.p(atomicReference, 5000L, "get conditional user properties", new pe01(bf01Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return sk01.t(list);
        }
        mb01.k(k901Var);
        k901Var.i.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // xsna.cf01
    public final int zza(String str) {
        bf01 bf01Var = this.b;
        bf01Var.getClass();
        exc0.f(str);
        ((mb01) bf01Var.b).getClass();
        return 25;
    }

    @Override // xsna.cf01
    public final long zzb() {
        sk01 sk01Var = this.a.m;
        mb01.i(sk01Var);
        return sk01Var.j0();
    }

    @Override // xsna.cf01
    public final String zzh() {
        return this.b.D();
    }

    @Override // xsna.cf01
    public final String zzi() {
        kg01 kg01Var = ((mb01) this.b.b).p;
        mb01.j(kg01Var);
        dg01 dg01Var = kg01Var.f;
        if (dg01Var != null) {
            return dg01Var.b;
        }
        return null;
    }

    @Override // xsna.cf01
    public final String zzj() {
        kg01 kg01Var = ((mb01) this.b.b).p;
        mb01.j(kg01Var);
        dg01 dg01Var = kg01Var.f;
        if (dg01Var != null) {
            return dg01Var.a;
        }
        return null;
    }

    @Override // xsna.cf01
    public final String zzk() {
        return this.b.D();
    }
}
