package xsna;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: points.kt */
/* loaded from: classes4.dex */
public final class omb0 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final xqo0 b;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(omb0.class, "reusablePoint", "getReusablePoint()[F");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl};
        b = new xqo0(new w9(26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final float[] a() {
        qcy<Object> qcyVar = a[0];
        return (float[]) b.b.get();
    }

    public static final ArrayList b(List list, Matrix matrix) {
        List<glb0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (glb0 glb0Var : list2) {
            a()[0] = glb0Var.a;
            a()[1] = glb0Var.b;
            matrix.mapPoints(a());
            arrayList.add(new glb0(a()[0], a()[1], glb0Var.c));
        }
        jw5.q(a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return arrayList;
    }
}
