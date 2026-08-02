package defpackage;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcn;
import com.google.android.gms.measurement.internal.g;

/* loaded from: classes.dex */
public final class m8b1 extends vw91 {
    public final rfw0 A;
    public zzcn w;
    public boolean x;
    public final eba1 y;
    public final mdi0 z;

    public m8b1(g gVar) {
        super(gVar);
        this.x = true;
        this.y = new eba1(this);
        this.z = new mdi0(this);
        this.A = new rfw0(this);
    }

    @Override // defpackage.vw91
    public final boolean Jg() {
        return false;
    }

    public final void Kg() {
        Gg();
        if (this.w == null) {
            this.w = new zzcn(Looper.getMainLooper());
        }
    }
}
