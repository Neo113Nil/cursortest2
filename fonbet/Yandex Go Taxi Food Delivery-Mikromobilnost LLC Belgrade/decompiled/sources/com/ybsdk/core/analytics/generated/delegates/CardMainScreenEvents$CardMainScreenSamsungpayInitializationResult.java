package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult", "", "Lcom/ybsdk/core/analytics/generated/delegates/CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "NOT_SUPPORTED", "NEED_UPDATE", "NEED_ACTIVATION", "READY", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult[] $VALUES;
    private final String originalValue;
    public static final CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult NOT_SUPPORTED = new CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult("NOT_SUPPORTED", 0, "not_supported");
    public static final CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult NEED_UPDATE = new CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult("NEED_UPDATE", 1, "need_update");
    public static final CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult NEED_ACTIVATION = new CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult("NEED_ACTIVATION", 2, "need_activation");
    public static final CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult READY = new CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult("READY", 3, UgcLiveVideoData.UgcLiveStatus.READY);

    private static final /* synthetic */ CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult[] $values() {
        return new CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult[]{NOT_SUPPORTED, NEED_UPDATE, NEED_ACTIVATION, READY};
    }

    static {
        CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult valueOf(String str) {
        return (CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult) Enum.valueOf(CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult.class, str);
    }

    public static CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult[] values() {
        return (CardMainScreenEvents$CardMainScreenSamsungpayInitializationResult[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
