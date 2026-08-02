package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* loaded from: classes10.dex */
public final class hvo implements gvo {
    public final ep7 b;
    public final Object a = new Object();
    public int c = 0;

    public hvo(ep7 ep7Var) {
        this.b = ep7Var;
    }

    @Override // defpackage.gvo
    public final Rational a() {
        return !b() ? Rational.ZERO : (Rational) this.b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // defpackage.gvo
    public final boolean b() {
        Range range = (Range) this.b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    @Override // defpackage.gvo
    public final Range c() {
        return (Range) this.b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }
}
