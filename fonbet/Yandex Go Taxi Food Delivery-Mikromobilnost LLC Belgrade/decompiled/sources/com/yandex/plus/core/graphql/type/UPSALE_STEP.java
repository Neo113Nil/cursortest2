package com.yandex.plus.core.graphql.type;

import defpackage.jr11;
import defpackage.k4o;
import defpackage.p4o;
import defpackage.scc;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/core/graphql/type/UPSALE_STEP;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Companion", "jr11", "CHECKOUT", "PRESALE", "UPSALE", "UNKNOWN__", "plus-shared-data-graphql-queries_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UPSALE_STEP {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UPSALE_STEP[] $VALUES;
    public static final UPSALE_STEP CHECKOUT;
    public static final jr11 Companion;
    public static final UPSALE_STEP PRESALE;
    public static final UPSALE_STEP UNKNOWN__;
    public static final UPSALE_STEP UPSALE;
    private static final p4o type;
    private final String rawValue;

    static {
        UPSALE_STEP upsale_step = new UPSALE_STEP("CHECKOUT", 0, "CHECKOUT");
        CHECKOUT = upsale_step;
        UPSALE_STEP upsale_step2 = new UPSALE_STEP("PRESALE", 1, "PRESALE");
        PRESALE = upsale_step2;
        UPSALE_STEP upsale_step3 = new UPSALE_STEP("UPSALE", 2, "UPSALE");
        UPSALE = upsale_step3;
        UPSALE_STEP upsale_step4 = new UPSALE_STEP("UNKNOWN__", 3, "UNKNOWN__");
        UNKNOWN__ = upsale_step4;
        UPSALE_STEP[] upsale_stepArr = {upsale_step, upsale_step2, upsale_step3, upsale_step4};
        $VALUES = upsale_stepArr;
        $ENTRIES = a.a(upsale_stepArr);
        Companion = new jr11();
        scc.g("CHECKOUT", "PRESALE", "UPSALE");
        type = new p4o("UPSALE_STEP");
    }

    public UPSALE_STEP(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static UPSALE_STEP valueOf(String str) {
        return (UPSALE_STEP) Enum.valueOf(UPSALE_STEP.class, str);
    }

    public static UPSALE_STEP[] values() {
        return (UPSALE_STEP[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
