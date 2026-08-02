package defpackage;

import com.yandex.messaging.input.bricks.writing.InputWritingPhase;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class l1w {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InputWritingPhase.values().length];
        try {
            iArr[InputWritingPhase.Empty.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InputWritingPhase.ReadyToSend.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InputWritingPhase.SendingMessagesSettingsPanelState.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
