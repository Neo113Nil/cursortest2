package defpackage;

import android.graphics.Typeface;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes10.dex */
public interface lp11 {
    static Typeface i(TaxiApplication taxiApplication, int i) {
        Typeface b = wuj0.b(i, taxiApplication);
        return b == null ? Typeface.DEFAULT : b;
    }

    Typeface b(int i, int i2);
}
