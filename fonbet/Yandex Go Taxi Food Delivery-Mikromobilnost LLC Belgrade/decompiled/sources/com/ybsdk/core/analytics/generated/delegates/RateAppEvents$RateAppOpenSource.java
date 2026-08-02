package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/RateAppEvents$RateAppOpenSource", "", "Lcom/ybsdk/core/analytics/generated/delegates/RateAppEvents$RateAppOpenSource;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "TRANSFER", "TOPUP", "C2B", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RateAppEvents$RateAppOpenSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RateAppEvents$RateAppOpenSource[] $VALUES;
    private final String originalValue;
    public static final RateAppEvents$RateAppOpenSource TRANSFER = new RateAppEvents$RateAppOpenSource("TRANSFER", 0, "transfer");
    public static final RateAppEvents$RateAppOpenSource TOPUP = new RateAppEvents$RateAppOpenSource("TOPUP", 1, TopupFragment.WEBVIEW_NAME);
    public static final RateAppEvents$RateAppOpenSource C2B = new RateAppEvents$RateAppOpenSource("C2B", 2, "c2b");

    private static final /* synthetic */ RateAppEvents$RateAppOpenSource[] $values() {
        return new RateAppEvents$RateAppOpenSource[]{TRANSFER, TOPUP, C2B};
    }

    static {
        RateAppEvents$RateAppOpenSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RateAppEvents$RateAppOpenSource(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RateAppEvents$RateAppOpenSource valueOf(String str) {
        return (RateAppEvents$RateAppOpenSource) Enum.valueOf(RateAppEvents$RateAppOpenSource.class, str);
    }

    public static RateAppEvents$RateAppOpenSource[] values() {
        return (RateAppEvents$RateAppOpenSource[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
