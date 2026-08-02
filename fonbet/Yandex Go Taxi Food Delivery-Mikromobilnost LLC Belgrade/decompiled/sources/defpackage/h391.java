package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class h391 extends fc91 {
    public final g a;
    public final j b;

    public h391(g gVar) {
        cvw.l(gVar);
        this.a = gVar;
        j jVar = gVar.F;
        g.f(jVar);
        this.b = jVar;
    }

    @Override // defpackage.kua1
    public final void a(String str, String str2, Bundle bundle) {
        j jVar = this.b;
        ((g) jVar.b).D.getClass();
        jVar.Lg(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // defpackage.kua1
    public final void b(String str) {
        g gVar = this.a;
        bh91 bh91Var = gVar.G;
        g.d(bh91Var);
        gVar.D.getClass();
        bh91Var.Ig(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.kua1
    public final void c(String str) {
        g gVar = this.a;
        bh91 bh91Var = gVar.G;
        g.d(bh91Var);
        gVar.D.getClass();
        bh91Var.Hg(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.kua1
    public final int d(String str) {
        j jVar = this.b;
        jVar.getClass();
        cvw.i(str);
        ((g) jVar.b).getClass();
        return 25;
    }

    @Override // defpackage.kua1
    public final void e(Bundle bundle) {
        j jVar = this.b;
        ((g) jVar.b).D.getClass();
        jVar.Tg(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.kua1
    public final Map f(String str, String str2, boolean z) {
        j jVar = this.b;
        g gVar = (g) jVar.b;
        aaa1 aaa1Var = gVar.z;
        y1a1 y1a1Var = gVar.y;
        g.g(aaa1Var);
        if (aaa1Var.Mg()) {
            g.g(y1a1Var);
            y1a1Var.z.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (rms.k()) {
            g.g(y1a1Var);
            y1a1Var.z.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        aaa1 aaa1Var2 = gVar.z;
        g.g(aaa1Var2);
        aaa1Var2.Qg(atomicReference, 5000L, "get user properties", new p3a1(jVar, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            g.g(y1a1Var);
            y1a1Var.z.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        w53 w53Var = new w53(list.size());
        for (zzpl zzplVar : list) {
            Object zza = zzplVar.zza();
            if (zza != null) {
                w53Var.put(zzplVar.zzb, zza);
            }
        }
        return w53Var;
    }

    @Override // defpackage.kua1
    public final void g(String str, String str2, Bundle bundle) {
        j jVar = this.a.F;
        g.f(jVar);
        jVar.Ug(str, str2, bundle);
    }

    @Override // defpackage.kua1
    public final List h(String str, String str2) {
        j jVar = this.b;
        g gVar = (g) jVar.b;
        aaa1 aaa1Var = gVar.z;
        y1a1 y1a1Var = gVar.y;
        g.g(aaa1Var);
        if (aaa1Var.Mg()) {
            g.g(y1a1Var);
            y1a1Var.z.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (rms.k()) {
            g.g(y1a1Var);
            y1a1Var.z.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        aaa1 aaa1Var2 = gVar.z;
        g.g(aaa1Var2);
        aaa1Var2.Qg(atomicReference, 5000L, "get conditional user properties", new kz(jVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ieb1.uh(list);
        }
        g.g(y1a1Var);
        y1a1Var.z.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.kua1
    public final String zzh() {
        jya1 jya1Var = ((g) this.b.b).E;
        g.f(jya1Var);
        qwa1 qwa1Var = jya1Var.w;
        if (qwa1Var != null) {
            return qwa1Var.a;
        }
        return null;
    }

    @Override // defpackage.kua1
    public final String zzi() {
        jya1 jya1Var = ((g) this.b.b).E;
        g.f(jya1Var);
        qwa1 qwa1Var = jya1Var.w;
        if (qwa1Var != null) {
            return qwa1Var.b;
        }
        return null;
    }

    @Override // defpackage.kua1
    public final String zzj() {
        return (String) this.b.A.get();
    }

    @Override // defpackage.kua1
    public final String zzk() {
        return this.b.Vg();
    }

    @Override // defpackage.kua1
    public final long zzl() {
        ieb1 ieb1Var = this.a.B;
        g.e(ieb1Var);
        return ieb1Var.Bh();
    }
}
