package com.yandex.go.design.compose.spinner;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/design/compose/spinner/SpinnerSize;", "", "SMALL", "MEDIUM", "LARGE", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SpinnerSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SpinnerSize[] $VALUES;
    public static final SpinnerSize LARGE;
    public static final SpinnerSize MEDIUM;
    public static final SpinnerSize SMALL;

    static {
        SpinnerSize spinnerSize = new SpinnerSize("SMALL", 0);
        SMALL = spinnerSize;
        SpinnerSize spinnerSize2 = new SpinnerSize("MEDIUM", 1);
        MEDIUM = spinnerSize2;
        SpinnerSize spinnerSize3 = new SpinnerSize("LARGE", 2);
        LARGE = spinnerSize3;
        SpinnerSize[] spinnerSizeArr = {spinnerSize, spinnerSize2, spinnerSize3};
        $VALUES = spinnerSizeArr;
        $ENTRIES = a.a(spinnerSizeArr);
    }

    public static SpinnerSize valueOf(String str) {
        return (SpinnerSize) Enum.valueOf(SpinnerSize.class, str);
    }

    public static SpinnerSize[] values() {
        return (SpinnerSize[]) $VALUES.clone();
    }
}
