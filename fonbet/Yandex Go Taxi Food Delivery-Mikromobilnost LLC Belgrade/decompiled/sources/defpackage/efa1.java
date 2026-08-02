package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public final class efa1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ zzjd w;

    public /* synthetic */ efa1(zzjd zzjdVar, zzr zzrVar, Bundle bundle, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = bundle;
        this.w = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i = this.a;
        Bundle bundle = this.c;
        zzr zzrVar = this.b;
        zzjd zzjdVar = this.w;
        switch (i) {
            case 0:
                zzjdVar.zzL().w();
                break;
            default:
                zzjdVar.zzL().w();
                break;
        }
        return zzjdVar.zzL().X(zzrVar, bundle);
    }
}
