package defpackage;

import com.google.android.gms.common.Feature;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes7.dex */
public abstract class em91 {
    public static final Feature a;
    public static final Feature[] b;

    static {
        Feature feature = new Feature(CommonUrlParts.APP_SET_ID, 1L);
        a = feature;
        b = new Feature[]{feature};
    }
}
