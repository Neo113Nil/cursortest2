package com.ybsdk.core.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/analytics/generated/PfmScrollDirectionPfm;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "LEFT", "RIGHT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmScrollDirectionPfm {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PfmScrollDirectionPfm[] $VALUES;
    public static final PfmScrollDirectionPfm LEFT = new PfmScrollDirectionPfm("LEFT", 0, "left");
    public static final PfmScrollDirectionPfm RIGHT = new PfmScrollDirectionPfm("RIGHT", 1, "right");
    private final String originalValue;

    private static final /* synthetic */ PfmScrollDirectionPfm[] $values() {
        return new PfmScrollDirectionPfm[]{LEFT, RIGHT};
    }

    static {
        PfmScrollDirectionPfm[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PfmScrollDirectionPfm(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PfmScrollDirectionPfm valueOf(String str) {
        return (PfmScrollDirectionPfm) Enum.valueOf(PfmScrollDirectionPfm.class, str);
    }

    public static PfmScrollDirectionPfm[] values() {
        return (PfmScrollDirectionPfm[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
