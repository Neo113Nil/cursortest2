package com.ybsdk.core.analytics.generated;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/analytics/generated/PlusStatusDiffRate;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "INACTIVE", "FREEZE", Card.ACTIVE, "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlusStatusDiffRate {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlusStatusDiffRate[] $VALUES;
    private final String originalValue;
    public static final PlusStatusDiffRate INACTIVE = new PlusStatusDiffRate("INACTIVE", 0, ClidProvider.APP_INACTIVE);
    public static final PlusStatusDiffRate FREEZE = new PlusStatusDiffRate("FREEZE", 1, "freeze");
    public static final PlusStatusDiffRate ACTIVE = new PlusStatusDiffRate(Card.ACTIVE, 2, ClidProvider.APP_ACTIVE);

    private static final /* synthetic */ PlusStatusDiffRate[] $values() {
        return new PlusStatusDiffRate[]{INACTIVE, FREEZE, ACTIVE};
    }

    static {
        PlusStatusDiffRate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PlusStatusDiffRate(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PlusStatusDiffRate valueOf(String str) {
        return (PlusStatusDiffRate) Enum.valueOf(PlusStatusDiffRate.class, str);
    }

    public static PlusStatusDiffRate[] values() {
        return (PlusStatusDiffRate[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
