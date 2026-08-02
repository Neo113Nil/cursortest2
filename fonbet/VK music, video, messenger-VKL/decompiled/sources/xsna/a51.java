package xsna;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: AeFpsRangeLegacyQuirk.java */
/* loaded from: classes11.dex */
public final class a51 implements rse0 {

    @Nullable
    public final Range<Integer> a;

    public a51(@NonNull tg9 tg9Var) {
        Range[] rangeArr = (Range[]) tg9Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range<Integer> range3 = new Range<>(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (range3.getUpper().intValue() == 30 && (range == null || range3.getLower().intValue() < range.getLower().intValue())) {
                    range = range3;
                }
            }
        }
        this.a = range;
    }
}
