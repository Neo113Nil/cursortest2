package defpackage;

import com.google.android.gms.common.api.internal.d;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class ey81 extends ny81 {
    public final WeakReference a;

    public ey81(d dVar) {
        this.a = new WeakReference(dVar);
    }

    @Override // defpackage.ny81
    public final void a() {
        d dVar = (d) this.a.get();
        if (dVar == null) {
            return;
        }
        d.r(dVar);
    }
}
