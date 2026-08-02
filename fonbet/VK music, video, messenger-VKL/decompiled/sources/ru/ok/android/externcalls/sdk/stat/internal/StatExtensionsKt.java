package ru.ok.android.externcalls.sdk.stat.internal;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.Conversation;

/* compiled from: StatExtensions.kt */
/* loaded from: classes9.dex */
public final class StatExtensionsKt {

    /* compiled from: StatExtensions.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Conversation.CallType.values().length];
            try {
                iArr[Conversation.CallType.Incoming.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Conversation.CallType.Outgoing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Conversation.CallType.Join.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String asString(Conversation.CallType callType, boolean z) {
        if (z) {
            return "anonym_join";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[callType.ordinal()];
        if (i == 1) {
            return "incoming";
        }
        if (i == 2) {
            return "outgoing";
        }
        if (i == 3) {
            return "join";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ String asString$default(Conversation.CallType callType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return asString(callType, z);
    }
}
