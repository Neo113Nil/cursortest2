package coil.view;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcoil/size/Scale;", "", "FILL", "FIT", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Scale {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Scale[] $VALUES;
    public static final Scale FILL;
    public static final Scale FIT;

    static {
        Scale scale = new Scale("FILL", 0);
        FILL = scale;
        Scale scale2 = new Scale("FIT", 1);
        FIT = scale2;
        Scale[] scaleArr = {scale, scale2};
        $VALUES = scaleArr;
        $ENTRIES = a.a(scaleArr);
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) $VALUES.clone();
    }
}
