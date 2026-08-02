package com.ybsdk.core.analytics.generated.delegates;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CardMainScreenEvents$CardMainScreenLoadedStatus", "", "Lcom/ybsdk/core/analytics/generated/delegates/CardMainScreenEvents$CardMainScreenLoadedStatus;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", Card.ACTIVE, "FROZEN", "BLOCKED", "REISSUE", "DELETED", "CLOSED", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMainScreenEvents$CardMainScreenLoadedStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardMainScreenEvents$CardMainScreenLoadedStatus[] $VALUES;
    private final String originalValue;
    public static final CardMainScreenEvents$CardMainScreenLoadedStatus ACTIVE = new CardMainScreenEvents$CardMainScreenLoadedStatus(Card.ACTIVE, 0, ClidProvider.APP_ACTIVE);
    public static final CardMainScreenEvents$CardMainScreenLoadedStatus FROZEN = new CardMainScreenEvents$CardMainScreenLoadedStatus("FROZEN", 1, "frozen");
    public static final CardMainScreenEvents$CardMainScreenLoadedStatus BLOCKED = new CardMainScreenEvents$CardMainScreenLoadedStatus("BLOCKED", 2, "blocked");
    public static final CardMainScreenEvents$CardMainScreenLoadedStatus REISSUE = new CardMainScreenEvents$CardMainScreenLoadedStatus("REISSUE", 3, "reissue");
    public static final CardMainScreenEvents$CardMainScreenLoadedStatus DELETED = new CardMainScreenEvents$CardMainScreenLoadedStatus("DELETED", 4, "deleted");
    public static final CardMainScreenEvents$CardMainScreenLoadedStatus CLOSED = new CardMainScreenEvents$CardMainScreenLoadedStatus("CLOSED", 5, "closed");

    private static final /* synthetic */ CardMainScreenEvents$CardMainScreenLoadedStatus[] $values() {
        return new CardMainScreenEvents$CardMainScreenLoadedStatus[]{ACTIVE, FROZEN, BLOCKED, REISSUE, DELETED, CLOSED};
    }

    static {
        CardMainScreenEvents$CardMainScreenLoadedStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CardMainScreenEvents$CardMainScreenLoadedStatus(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardMainScreenEvents$CardMainScreenLoadedStatus valueOf(String str) {
        return (CardMainScreenEvents$CardMainScreenLoadedStatus) Enum.valueOf(CardMainScreenEvents$CardMainScreenLoadedStatus.class, str);
    }

    public static CardMainScreenEvents$CardMainScreenLoadedStatus[] values() {
        return (CardMainScreenEvents$CardMainScreenLoadedStatus[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
