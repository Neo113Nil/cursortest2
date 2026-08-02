package coil.transform;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcoil/transform/PixelOpacity;", "", "UNCHANGED", "TRANSLUCENT", "OPAQUE", "coil-gif_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PixelOpacity {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PixelOpacity[] $VALUES;
    public static final PixelOpacity OPAQUE;
    public static final PixelOpacity TRANSLUCENT;
    public static final PixelOpacity UNCHANGED;

    static {
        PixelOpacity pixelOpacity = new PixelOpacity("UNCHANGED", 0);
        UNCHANGED = pixelOpacity;
        PixelOpacity pixelOpacity2 = new PixelOpacity("TRANSLUCENT", 1);
        TRANSLUCENT = pixelOpacity2;
        PixelOpacity pixelOpacity3 = new PixelOpacity("OPAQUE", 2);
        OPAQUE = pixelOpacity3;
        PixelOpacity[] pixelOpacityArr = {pixelOpacity, pixelOpacity2, pixelOpacity3};
        $VALUES = pixelOpacityArr;
        $ENTRIES = a.a(pixelOpacityArr);
    }

    public static PixelOpacity valueOf(String str) {
        return (PixelOpacity) Enum.valueOf(PixelOpacity.class, str);
    }

    public static PixelOpacity[] values() {
        return (PixelOpacity[]) $VALUES.clone();
    }
}
