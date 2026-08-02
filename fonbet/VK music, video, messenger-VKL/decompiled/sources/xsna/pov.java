package xsna;

import android.graphics.Matrix;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: ISticker.kt */
/* loaded from: classes5.dex */
public final class pov {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final wqo0 b;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(pov.class, "matrixFloats", "getMatrixFloats()[F");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl};
        b = new wqo0(new mg(14));
    }

    public static final float[] a() {
        qcy<Object> qcyVar = a[0];
        wqo0 wqo0Var = b;
        wqo0Var.getClass();
        return (float[]) wqo0Var.get();
    }

    public static final float b(Matrix matrix) {
        matrix.getValues(a());
        return Math.round(Math.atan2(a()[1], a()[0]) * 57.29577951308232d);
    }

    public static final float c(Matrix matrix) {
        matrix.getValues(a());
        return a()[0];
    }

    public static final float d(Matrix matrix) {
        matrix.getValues(a());
        return a()[4];
    }

    public static final float e(Matrix matrix) {
        matrix.getValues(a());
        return a()[2];
    }

    public static final float f(Matrix matrix) {
        matrix.getValues(a());
        return a()[5];
    }
}
