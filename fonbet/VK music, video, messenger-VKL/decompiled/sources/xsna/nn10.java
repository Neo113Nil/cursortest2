package xsna;

import android.graphics.Matrix;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: matrix.kt */
/* loaded from: classes4.dex */
public final class nn10 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final xqo0 b;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(nn10.class, "reusableArray", "getReusableArray()[F");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl};
        b = new xqo0(new af0(26));
    }

    public static final float a(Matrix matrix) {
        double d = d(matrix);
        matrix.getValues(b());
        return (float) Math.hypot(d, b()[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float[] b() {
        qcy<Object> qcyVar = a[0];
        return (float[]) b.b.get();
    }

    public static final float c(Matrix matrix) {
        matrix.getValues(b());
        return ((float) Math.atan2(b()[1], b()[0])) * 57.295776f;
    }

    public static final float d(Matrix matrix) {
        matrix.getValues(b());
        return b()[0];
    }

    public static final float e(Matrix matrix) {
        matrix.getValues(b());
        return b()[4];
    }
}
