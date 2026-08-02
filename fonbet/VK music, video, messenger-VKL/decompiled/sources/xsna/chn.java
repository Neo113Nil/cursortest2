package xsna;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: DistanceUtils.kt */
/* loaded from: classes17.dex */
public final class chn {
    public static final chn a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final DecimalFormat c;
    public static final wqo0 d;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(chn.class, "distanceArray", "getDistanceArray()[F", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new chn();
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        c = decimalFormat;
        d = new wqo0(new af0(12));
    }
}
