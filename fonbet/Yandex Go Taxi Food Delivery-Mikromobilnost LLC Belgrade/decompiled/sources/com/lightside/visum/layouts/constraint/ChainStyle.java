package com.lightside.visum.layouts.constraint;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/lightside/visum/layouts/constraint/ChainStyle;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "SPREAD", "SPREAD_INSIDE", "PACKED", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChainStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChainStyle[] $VALUES;
    public static final ChainStyle PACKED;
    public static final ChainStyle SPREAD;
    public static final ChainStyle SPREAD_INSIDE;
    private final int value;

    static {
        ChainStyle chainStyle = new ChainStyle("SPREAD", 0, 0);
        SPREAD = chainStyle;
        ChainStyle chainStyle2 = new ChainStyle("SPREAD_INSIDE", 1, 1);
        SPREAD_INSIDE = chainStyle2;
        ChainStyle chainStyle3 = new ChainStyle("PACKED", 2, 2);
        PACKED = chainStyle3;
        ChainStyle[] chainStyleArr = {chainStyle, chainStyle2, chainStyle3};
        $VALUES = chainStyleArr;
        $ENTRIES = kotlin.enums.a.a(chainStyleArr);
    }

    public ChainStyle(String str, int i, int i2) {
        this.value = i2;
    }

    public static ChainStyle valueOf(String str) {
        return (ChainStyle) Enum.valueOf(ChainStyle.class, str);
    }

    public static ChainStyle[] values() {
        return (ChainStyle[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
