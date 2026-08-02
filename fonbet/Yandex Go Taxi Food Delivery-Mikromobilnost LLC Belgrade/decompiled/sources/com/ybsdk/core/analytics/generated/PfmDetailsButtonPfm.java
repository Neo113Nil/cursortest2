package com.ybsdk.core.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/analytics/generated/PfmDetailsButtonPfm;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "SAVE", "RESET", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmDetailsButtonPfm {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PfmDetailsButtonPfm[] $VALUES;
    private final String originalValue;
    public static final PfmDetailsButtonPfm SAVE = new PfmDetailsButtonPfm("SAVE", 0, "save");
    public static final PfmDetailsButtonPfm RESET = new PfmDetailsButtonPfm("RESET", 1, "reset");

    private static final /* synthetic */ PfmDetailsButtonPfm[] $values() {
        return new PfmDetailsButtonPfm[]{SAVE, RESET};
    }

    static {
        PfmDetailsButtonPfm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PfmDetailsButtonPfm(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PfmDetailsButtonPfm valueOf(String str) {
        return (PfmDetailsButtonPfm) Enum.valueOf(PfmDetailsButtonPfm.class, str);
    }

    public static PfmDetailsButtonPfm[] values() {
        return (PfmDetailsButtonPfm[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
