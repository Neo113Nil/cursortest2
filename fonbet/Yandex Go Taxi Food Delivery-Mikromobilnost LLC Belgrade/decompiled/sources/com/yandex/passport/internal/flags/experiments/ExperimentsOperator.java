package com.yandex.passport.internal.flags.experiments;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/flags/experiments/ExperimentsOperator;", "", "", "operator", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "com/yandex/passport/internal/flags/experiments/j", "EQUAL", "LESS_OR_EQUAL", "MORE_OR_EQUAL", "NOT_EQUAL", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExperimentsOperator {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExperimentsOperator[] $VALUES;
    public static final j Companion;
    public static final ExperimentsOperator EQUAL;
    public static final ExperimentsOperator LESS_OR_EQUAL;
    public static final ExperimentsOperator MORE_OR_EQUAL;
    public static final ExperimentsOperator NOT_EQUAL;
    private final String operator;

    static {
        ExperimentsOperator experimentsOperator = new ExperimentsOperator("EQUAL", 0, "=");
        EQUAL = experimentsOperator;
        ExperimentsOperator experimentsOperator2 = new ExperimentsOperator("LESS_OR_EQUAL", 1, "<=");
        LESS_OR_EQUAL = experimentsOperator2;
        ExperimentsOperator experimentsOperator3 = new ExperimentsOperator("MORE_OR_EQUAL", 2, ">=");
        MORE_OR_EQUAL = experimentsOperator3;
        ExperimentsOperator experimentsOperator4 = new ExperimentsOperator("NOT_EQUAL", 3, "!=");
        NOT_EQUAL = experimentsOperator4;
        ExperimentsOperator[] experimentsOperatorArr = {experimentsOperator, experimentsOperator2, experimentsOperator3, experimentsOperator4};
        $VALUES = experimentsOperatorArr;
        $ENTRIES = kotlin.enums.a.a(experimentsOperatorArr);
        Companion = new j();
    }

    public ExperimentsOperator(String str, int i, String str2) {
        this.operator = str2;
    }

    public static ExperimentsOperator valueOf(String str) {
        return (ExperimentsOperator) Enum.valueOf(ExperimentsOperator.class, str);
    }

    public static ExperimentsOperator[] values() {
        return (ExperimentsOperator[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getOperator() {
        return this.operator;
    }
}
