package xsna;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedHashSet;

/* compiled from: MediaPropertiesProviderImpl.kt */
/* loaded from: classes4.dex */
public final class ov10 implements nv10 {
    public mv10 a = new mv10(0);
    public final LinkedHashSet b = new LinkedHashSet();

    @Override // xsna.nv10
    public final void a(wio wioVar) {
        this.b.add(wioVar);
    }

    @Override // xsna.nv10
    public final void b(wio wioVar) {
        this.b.remove(wioVar);
    }

    @Override // xsna.nv10
    public final mv10 provide() {
        return new mv10(new Matrix(this.a.a), new Matrix(this.a.b), new Matrix(this.a.c), hif0.b(this.a.d), new RectF(this.a.e), hif0.b(this.a.f), this.a.g);
    }
}
