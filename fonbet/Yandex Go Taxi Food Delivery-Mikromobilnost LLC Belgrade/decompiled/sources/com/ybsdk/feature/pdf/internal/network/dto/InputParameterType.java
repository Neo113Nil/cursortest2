package com.ybsdk.feature.pdf.internal.network.dto;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/InputParameterType;", "", "<init>", "(Ljava/lang/String;I)V", BaseDatabaseHelper.TYPE_TEXT, "DATE_RANGE", "DATE", "PRODUCT", "TIMESTAMP", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputParameterType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InputParameterType[] $VALUES;
    public static final InputParameterType TEXT = new InputParameterType(BaseDatabaseHelper.TYPE_TEXT, 0);
    public static final InputParameterType DATE_RANGE = new InputParameterType("DATE_RANGE", 1);
    public static final InputParameterType DATE = new InputParameterType("DATE", 2);
    public static final InputParameterType PRODUCT = new InputParameterType("PRODUCT", 3);
    public static final InputParameterType TIMESTAMP = new InputParameterType("TIMESTAMP", 4);

    private static final /* synthetic */ InputParameterType[] $values() {
        return new InputParameterType[]{TEXT, DATE_RANGE, DATE, PRODUCT, TIMESTAMP};
    }

    static {
        InputParameterType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private InputParameterType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static InputParameterType valueOf(String str) {
        return (InputParameterType) Enum.valueOf(InputParameterType.class, str);
    }

    public static InputParameterType[] values() {
        return (InputParameterType[]) $VALUES.clone();
    }
}
