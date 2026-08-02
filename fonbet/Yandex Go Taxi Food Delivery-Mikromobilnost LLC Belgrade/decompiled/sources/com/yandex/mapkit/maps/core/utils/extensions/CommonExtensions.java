package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.ny61;
import defpackage.x4e;
import defpackage.y6i0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0007\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0002¨\u0006\t"}, d2 = {"isZero", "", "", "closeTo", "other", "epsilon", "requireFinite", "", "coerceInUnitRange", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonExtensions {
    public static final boolean closeTo(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }

    public static /* synthetic */ boolean closeTo$default(double d, double d2, double d3, int i, Object obj) {
        if ((i & 2) != 0) {
            d3 = 1.0E-9d;
        }
        return closeTo(d, d2, d3);
    }

    public static final float coerceInUnitRange(float f) {
        return y6i0.c(f, 0.0f, 1.0f);
    }

    public static final boolean isZero(double d) {
        return closeTo$default(d, 0.0d, 0.0d, 2, (Object) null);
    }

    public static final double requireFinite(double d) {
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return d;
        }
        throw new IllegalStateException("Finite value required. Actual value is '" + d + "'");
    }

    public static final boolean isZero(float f) {
        return closeTo$default(f, 0.0f, 0.0f, 2, (Object) null);
    }

    public static final boolean closeTo(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }

    public static /* synthetic */ boolean closeTo$default(float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f3 = 1.0E-6f;
        }
        return closeTo(f, f2, f3);
    }

    public static final float requireFinite(float f) {
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return f;
        }
        ny61.r(x4e.f("Finite value required. Actual value is '", "'", f));
        return 0.0f;
    }
}
