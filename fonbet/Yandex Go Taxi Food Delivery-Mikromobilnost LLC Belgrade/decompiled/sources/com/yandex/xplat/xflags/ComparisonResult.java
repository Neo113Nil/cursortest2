package com.yandex.xplat.xflags;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/xplat/xflags/ComparisonResult;", "", "", "value", CA20Status.STATUS_USER_I, "getValue", "()I", "Eq", "Less", "Greater", "IncorrectFirstArg", "IncorrectSecondArg", "xplat-xflags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ComparisonResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ComparisonResult[] $VALUES;
    public static final ComparisonResult Eq;
    public static final ComparisonResult Greater;
    public static final ComparisonResult IncorrectFirstArg;
    public static final ComparisonResult IncorrectSecondArg;
    public static final ComparisonResult Less;
    private final int value;

    static {
        ComparisonResult comparisonResult = new ComparisonResult("Eq", 0, 0);
        Eq = comparisonResult;
        ComparisonResult comparisonResult2 = new ComparisonResult("Less", 1, 1);
        Less = comparisonResult2;
        ComparisonResult comparisonResult3 = new ComparisonResult("Greater", 2, 2);
        Greater = comparisonResult3;
        ComparisonResult comparisonResult4 = new ComparisonResult("IncorrectFirstArg", 3, 3);
        IncorrectFirstArg = comparisonResult4;
        ComparisonResult comparisonResult5 = new ComparisonResult("IncorrectSecondArg", 4, 4);
        IncorrectSecondArg = comparisonResult5;
        ComparisonResult[] comparisonResultArr = {comparisonResult, comparisonResult2, comparisonResult3, comparisonResult4, comparisonResult5};
        $VALUES = comparisonResultArr;
        $ENTRIES = kotlin.enums.a.a(comparisonResultArr);
    }

    public ComparisonResult(String str, int i, int i2) {
        this.value = i2;
    }

    public static ComparisonResult valueOf(String str) {
        return (ComparisonResult) Enum.valueOf(ComparisonResult.class, str);
    }

    public static ComparisonResult[] values() {
        return (ComparisonResult[]) $VALUES.clone();
    }
}
