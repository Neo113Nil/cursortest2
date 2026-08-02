package com.yx360.design.compose.atoms.inlineNotification;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yx360/design/compose/atoms/inlineNotification/DsInlineNotification$Tone", "", "Lcom/yx360/design/compose/atoms/inlineNotification/DsInlineNotification$Tone;", "Success", "Warning", "Danger", "Neutral", "yx360-design-compose-atoms_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsInlineNotification$Tone {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DsInlineNotification$Tone[] $VALUES;
    public static final DsInlineNotification$Tone Danger;
    public static final DsInlineNotification$Tone Neutral;
    public static final DsInlineNotification$Tone Success;
    public static final DsInlineNotification$Tone Warning;

    static {
        DsInlineNotification$Tone dsInlineNotification$Tone = new DsInlineNotification$Tone("Success", 0);
        Success = dsInlineNotification$Tone;
        DsInlineNotification$Tone dsInlineNotification$Tone2 = new DsInlineNotification$Tone("Warning", 1);
        Warning = dsInlineNotification$Tone2;
        DsInlineNotification$Tone dsInlineNotification$Tone3 = new DsInlineNotification$Tone("Danger", 2);
        Danger = dsInlineNotification$Tone3;
        DsInlineNotification$Tone dsInlineNotification$Tone4 = new DsInlineNotification$Tone("Neutral", 3);
        Neutral = dsInlineNotification$Tone4;
        DsInlineNotification$Tone[] dsInlineNotification$ToneArr = {dsInlineNotification$Tone, dsInlineNotification$Tone2, dsInlineNotification$Tone3, dsInlineNotification$Tone4};
        $VALUES = dsInlineNotification$ToneArr;
        $ENTRIES = a.a(dsInlineNotification$ToneArr);
    }

    public static DsInlineNotification$Tone valueOf(String str) {
        return (DsInlineNotification$Tone) Enum.valueOf(DsInlineNotification$Tone.class, str);
    }

    public static DsInlineNotification$Tone[] values() {
        return (DsInlineNotification$Tone[]) $VALUES.clone();
    }
}
