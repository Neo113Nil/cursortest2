package coil.view;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcoil/size/Precision;", "", "EXACT", "INEXACT", "AUTOMATIC", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Precision {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Precision[] $VALUES;
    public static final Precision AUTOMATIC;
    public static final Precision EXACT;
    public static final Precision INEXACT;

    static {
        Precision precision = new Precision("EXACT", 0);
        EXACT = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        INEXACT = precision2;
        Precision precision3 = new Precision("AUTOMATIC", 2);
        AUTOMATIC = precision3;
        Precision[] precisionArr = {precision, precision2, precision3};
        $VALUES = precisionArr;
        $ENTRIES = a.a(precisionArr);
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) $VALUES.clone();
    }
}
