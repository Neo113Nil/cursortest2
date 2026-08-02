package defpackage;

import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class obb1 implements Callable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ n b;

    public obb1(n nVar, zzr zzrVar) {
        this.a = zzrVar;
        Objects.requireNonNull(nVar);
        this.b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzr zzrVar = this.a;
        String str = zzrVar.zza;
        cvw.l(str);
        n nVar = this.b;
        wia1 a = nVar.a(str);
        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
        if (a.i(zzjkVar) && wia1.c(100, zzrVar.zzs).i(zzjkVar)) {
            return nVar.W(zzrVar).E();
        }
        nVar.B0().H.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
