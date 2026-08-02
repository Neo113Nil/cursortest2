package ru.ok.android.externcalls.sdk.feedback;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ParticipantFeedbackSource.kt */
/* loaded from: classes9.dex */
public final class ParticipantFeedbackSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ParticipantFeedbackSource[] $VALUES;
    public static final ParticipantFeedbackSource USER_CLICK = new ParticipantFeedbackSource("USER_CLICK", 0);
    public static final ParticipantFeedbackSource GESTURES = new ParticipantFeedbackSource("GESTURES", 1);
    public static final ParticipantFeedbackSource UNKNOWN = new ParticipantFeedbackSource(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);

    private static final /* synthetic */ ParticipantFeedbackSource[] $values() {
        return new ParticipantFeedbackSource[]{USER_CLICK, GESTURES, UNKNOWN};
    }

    static {
        ParticipantFeedbackSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private ParticipantFeedbackSource(String str, int i) {
    }

    public static zrp<ParticipantFeedbackSource> getEntries() {
        return $ENTRIES;
    }

    public static ParticipantFeedbackSource valueOf(String str) {
        return (ParticipantFeedbackSource) Enum.valueOf(ParticipantFeedbackSource.class, str);
    }

    public static ParticipantFeedbackSource[] values() {
        return (ParticipantFeedbackSource[]) $VALUES.clone();
    }
}
