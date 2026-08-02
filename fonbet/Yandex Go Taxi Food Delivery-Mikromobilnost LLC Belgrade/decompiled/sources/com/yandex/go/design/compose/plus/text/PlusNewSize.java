package com.yandex.go.design.compose.plus.text;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/design/compose/plus/text/PlusNewSize;", "", "Caption1", "Caption1Bold", "Caption2", "plus"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlusNewSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusNewSize[] $VALUES;
    public static final PlusNewSize Caption1;
    public static final PlusNewSize Caption1Bold;
    public static final PlusNewSize Caption2;

    static {
        PlusNewSize plusNewSize = new PlusNewSize("Caption1", 0);
        Caption1 = plusNewSize;
        PlusNewSize plusNewSize2 = new PlusNewSize("Caption1Bold", 1);
        Caption1Bold = plusNewSize2;
        PlusNewSize plusNewSize3 = new PlusNewSize("Caption2", 2);
        Caption2 = plusNewSize3;
        PlusNewSize[] plusNewSizeArr = {plusNewSize, plusNewSize2, plusNewSize3};
        $VALUES = plusNewSizeArr;
        $ENTRIES = a.a(plusNewSizeArr);
    }

    public static PlusNewSize valueOf(String str) {
        return (PlusNewSize) Enum.valueOf(PlusNewSize.class, str);
    }

    public static PlusNewSize[] values() {
        return (PlusNewSize[]) $VALUES.clone();
    }
}
