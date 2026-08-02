package androidx.compose.material3;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/SnackbarResult;", "", "Dismissed", "ActionPerformed", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SnackbarResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SnackbarResult[] $VALUES;
    public static final SnackbarResult ActionPerformed;
    public static final SnackbarResult Dismissed;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        Dismissed = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        ActionPerformed = snackbarResult2;
        SnackbarResult[] snackbarResultArr = {snackbarResult, snackbarResult2};
        $VALUES = snackbarResultArr;
        $ENTRIES = kotlin.enums.a.a(snackbarResultArr);
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) $VALUES.clone();
    }
}
