package com.yandex.go.safety.center.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/safety/center/model/PresentationContact$Mode", "", "Lcom/yandex/go/safety/center/model/PresentationContact$Mode;", "NORMAL", "ADDING", "REMOVING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PresentationContact$Mode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PresentationContact$Mode[] $VALUES;
    public static final PresentationContact$Mode ADDING;
    public static final PresentationContact$Mode NORMAL;
    public static final PresentationContact$Mode REMOVING;

    static {
        PresentationContact$Mode presentationContact$Mode = new PresentationContact$Mode("NORMAL", 0);
        NORMAL = presentationContact$Mode;
        PresentationContact$Mode presentationContact$Mode2 = new PresentationContact$Mode("ADDING", 1);
        ADDING = presentationContact$Mode2;
        PresentationContact$Mode presentationContact$Mode3 = new PresentationContact$Mode("REMOVING", 2);
        REMOVING = presentationContact$Mode3;
        PresentationContact$Mode[] presentationContact$ModeArr = {presentationContact$Mode, presentationContact$Mode2, presentationContact$Mode3};
        $VALUES = presentationContact$ModeArr;
        $ENTRIES = a.a(presentationContact$ModeArr);
    }

    public static PresentationContact$Mode valueOf(String str) {
        return (PresentationContact$Mode) Enum.valueOf(PresentationContact$Mode.class, str);
    }

    public static PresentationContact$Mode[] values() {
        return (PresentationContact$Mode[]) $VALUES.clone();
    }
}
