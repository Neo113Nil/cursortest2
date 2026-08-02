package androidx.compose.material3;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/SnackbarDuration;", "", "Short", "Long", "Indefinite", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SnackbarDuration {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SnackbarDuration[] $VALUES;
    public static final SnackbarDuration Indefinite;
    public static final SnackbarDuration Long;
    public static final SnackbarDuration Short;

    static {
        SnackbarDuration snackbarDuration = new SnackbarDuration("Short", 0);
        Short = snackbarDuration;
        SnackbarDuration snackbarDuration2 = new SnackbarDuration("Long", 1);
        Long = snackbarDuration2;
        SnackbarDuration snackbarDuration3 = new SnackbarDuration("Indefinite", 2);
        Indefinite = snackbarDuration3;
        SnackbarDuration[] snackbarDurationArr = {snackbarDuration, snackbarDuration2, snackbarDuration3};
        $VALUES = snackbarDurationArr;
        $ENTRIES = kotlin.enums.a.a(snackbarDurationArr);
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) $VALUES.clone();
    }
}
