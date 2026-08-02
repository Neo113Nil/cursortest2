package xsna;

import android.graphics.Matrix;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: MatrixExtKt.kt */
/* loaded from: classes18.dex */
public final class ln10 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final wqo0 b;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(ln10.class, "matrixFloats", "getMatrixFloats()[F");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl};
        b = new wqo0(new de4(22));
    }

    public static final float[] a() {
        qcy<Object> qcyVar = a[0];
        wqo0 wqo0Var = b;
        wqo0Var.getClass();
        return (float[]) wqo0Var.get();
    }

    public static final float b(Matrix matrix) {
        matrix.getValues(a());
        return a()[0];
    }
}
