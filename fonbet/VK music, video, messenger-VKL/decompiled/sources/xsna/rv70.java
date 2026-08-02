package xsna;

import androidx.annotation.NonNull;

/* compiled from: OffsetEdgeTreatment.java */
/* loaded from: classes13.dex */
public final class rv70 extends ryo {
    public final ho00 b;
    public final float c;

    public rv70(@NonNull ho00 ho00Var, float f) {
        this.b = ho00Var;
        this.c = f;
    }

    @Override // xsna.ryo
    public final boolean a() {
        this.b.getClass();
        return true;
    }

    @Override // xsna.ryo
    public final void b(float f, float f2, float f3, @NonNull com.google.android.material.shape.d dVar) {
        this.b.b(f, f2 - this.c, f3, dVar);
    }
}
