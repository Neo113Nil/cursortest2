package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: LazyListLayoutInfo.kt */
/* loaded from: classes11.dex */
public interface fvy {
    default long a() {
        return 0L;
    }

    default int b() {
        return 0;
    }

    default int c() {
        return 0;
    }

    int d();

    default int e() {
        return 0;
    }

    List<xuy> f();

    int g();

    default Orientation getOrientation() {
        return Orientation.Vertical;
    }

    int h();

    default boolean i() {
        return false;
    }
}
