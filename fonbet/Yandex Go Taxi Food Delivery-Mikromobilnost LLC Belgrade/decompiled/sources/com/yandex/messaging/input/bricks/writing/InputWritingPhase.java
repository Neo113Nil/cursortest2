package com.yandex.messaging.input.bricks.writing;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/input/bricks/writing/InputWritingPhase;", "", "Empty", "ReadyToSend", "SendingMessagesSettingsPanelState", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputWritingPhase {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InputWritingPhase[] $VALUES;
    public static final InputWritingPhase Empty;
    public static final InputWritingPhase ReadyToSend;
    public static final InputWritingPhase SendingMessagesSettingsPanelState;

    static {
        InputWritingPhase inputWritingPhase = new InputWritingPhase("Empty", 0);
        Empty = inputWritingPhase;
        InputWritingPhase inputWritingPhase2 = new InputWritingPhase("ReadyToSend", 1);
        ReadyToSend = inputWritingPhase2;
        InputWritingPhase inputWritingPhase3 = new InputWritingPhase("SendingMessagesSettingsPanelState", 2);
        SendingMessagesSettingsPanelState = inputWritingPhase3;
        InputWritingPhase[] inputWritingPhaseArr = {inputWritingPhase, inputWritingPhase2, inputWritingPhase3};
        $VALUES = inputWritingPhaseArr;
        $ENTRIES = kotlin.enums.a.a(inputWritingPhaseArr);
    }

    public static InputWritingPhase valueOf(String str) {
        return (InputWritingPhase) Enum.valueOf(InputWritingPhase.class, str);
    }

    public static InputWritingPhase[] values() {
        return (InputWritingPhase[]) $VALUES.clone();
    }
}
