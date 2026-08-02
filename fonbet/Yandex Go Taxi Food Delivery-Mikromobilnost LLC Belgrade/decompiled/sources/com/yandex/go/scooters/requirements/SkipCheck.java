package com.yandex.go.scooters.requirements;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/go/scooters/requirements/SkipCheck;", "", "DEBT", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkipCheck {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SkipCheck[] $VALUES;
    public static final SkipCheck DEBT;

    static {
        SkipCheck skipCheck = new SkipCheck("DEBT", 0);
        DEBT = skipCheck;
        SkipCheck[] skipCheckArr = {skipCheck};
        $VALUES = skipCheckArr;
        $ENTRIES = kotlin.enums.a.a(skipCheckArr);
    }

    public static SkipCheck valueOf(String str) {
        return (SkipCheck) Enum.valueOf(SkipCheck.class, str);
    }

    public static SkipCheck[] values() {
        return (SkipCheck[]) $VALUES.clone();
    }
}
