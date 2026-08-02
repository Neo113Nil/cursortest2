package com.yandex.passport.internal.ui.domik;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/UnsubscribeMailingStatus;", "", "", "serverStatus", "Ljava/lang/String;", "analyticStatus", "Companion", "com/yandex/passport/internal/ui/domik/t", "NOT_SHOWED", "SHOWED_CHECKED", "SHOWED_UNCHECKED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnsubscribeMailingStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UnsubscribeMailingStatus[] $VALUES;
    public static final t Companion;
    public static final UnsubscribeMailingStatus NOT_SHOWED;
    public static final UnsubscribeMailingStatus SHOWED_CHECKED;
    public static final UnsubscribeMailingStatus SHOWED_UNCHECKED;
    private final String analyticStatus;
    private final String serverStatus;

    static {
        UnsubscribeMailingStatus unsubscribeMailingStatus = new UnsubscribeMailingStatus("NOT_SHOWED", 0, null, "not_showed");
        NOT_SHOWED = unsubscribeMailingStatus;
        UnsubscribeMailingStatus unsubscribeMailingStatus2 = new UnsubscribeMailingStatus("SHOWED_CHECKED", 1, "true", "showed_checked");
        SHOWED_CHECKED = unsubscribeMailingStatus2;
        UnsubscribeMailingStatus unsubscribeMailingStatus3 = new UnsubscribeMailingStatus("SHOWED_UNCHECKED", 2, "false", "showed_unchecked");
        SHOWED_UNCHECKED = unsubscribeMailingStatus3;
        UnsubscribeMailingStatus[] unsubscribeMailingStatusArr = {unsubscribeMailingStatus, unsubscribeMailingStatus2, unsubscribeMailingStatus3};
        $VALUES = unsubscribeMailingStatusArr;
        $ENTRIES = kotlin.enums.a.a(unsubscribeMailingStatusArr);
        Companion = new t();
    }

    public UnsubscribeMailingStatus(String str, int i, String str2, String str3) {
        this.serverStatus = str2;
        this.analyticStatus = str3;
    }

    public static UnsubscribeMailingStatus valueOf(String str) {
        return (UnsubscribeMailingStatus) Enum.valueOf(UnsubscribeMailingStatus.class, str);
    }

    public static UnsubscribeMailingStatus[] values() {
        return (UnsubscribeMailingStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticStatus() {
        return this.analyticStatus;
    }
}
