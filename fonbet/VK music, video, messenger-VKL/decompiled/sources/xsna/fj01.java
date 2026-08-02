package xsna;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzby;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class fj01 extends fa01 {
    public zzby f;
    public final ej01 g;
    public final dj01 h;
    public final rd50 i;

    public fj01(mb01 mb01Var) {
        super(mb01Var);
        this.g = new ej01(this);
        this.h = new dj01(this);
        this.i = new rd50(this);
    }

    @Override // xsna.fa01
    public final boolean n() {
        return false;
    }

    public final void o() {
        k();
        if (this.f == null) {
            this.f = new zzby(Looper.getMainLooper());
        }
    }
}
