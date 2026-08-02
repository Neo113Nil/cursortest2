package xsna;

import android.content.Context;
import kotlin.NotImplementedError;

/* compiled from: WindowMetricsCalculator.kt */
/* loaded from: classes12.dex */
public interface grx0 {
    public static final a a = a.a;

    /* compiled from: WindowMetricsCalculator.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final hrx0 b = new hrx0();
    }

    default frx0 a(Context context) {
        throw new NotImplementedError("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }
}
