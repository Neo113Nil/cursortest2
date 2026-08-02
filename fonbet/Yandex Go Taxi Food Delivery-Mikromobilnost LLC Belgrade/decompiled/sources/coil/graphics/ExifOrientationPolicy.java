package coil.graphics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "IGNORE", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExifOrientationPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExifOrientationPolicy[] $VALUES;
    public static final ExifOrientationPolicy IGNORE;
    public static final ExifOrientationPolicy RESPECT_ALL;
    public static final ExifOrientationPolicy RESPECT_PERFORMANCE;

    static {
        ExifOrientationPolicy exifOrientationPolicy = new ExifOrientationPolicy("IGNORE", 0);
        IGNORE = exifOrientationPolicy;
        ExifOrientationPolicy exifOrientationPolicy2 = new ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
        RESPECT_PERFORMANCE = exifOrientationPolicy2;
        ExifOrientationPolicy exifOrientationPolicy3 = new ExifOrientationPolicy("RESPECT_ALL", 2);
        RESPECT_ALL = exifOrientationPolicy3;
        ExifOrientationPolicy[] exifOrientationPolicyArr = {exifOrientationPolicy, exifOrientationPolicy2, exifOrientationPolicy3};
        $VALUES = exifOrientationPolicyArr;
        $ENTRIES = a.a(exifOrientationPolicyArr);
    }

    public static ExifOrientationPolicy valueOf(String str) {
        return (ExifOrientationPolicy) Enum.valueOf(ExifOrientationPolicy.class, str);
    }

    public static ExifOrientationPolicy[] values() {
        return (ExifOrientationPolicy[]) $VALUES.clone();
    }
}
