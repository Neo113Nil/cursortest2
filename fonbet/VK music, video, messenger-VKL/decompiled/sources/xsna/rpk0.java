package xsna;

import com.vk.voip.dto.type.StartCallType;

/* compiled from: StartCallType.kt */
/* loaded from: classes7.dex */
public final class rpk0 {

    /* compiled from: StartCallType.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StartCallType.values().length];
            try {
                iArr[StartCallType.NEW_TOKENIZED_GROUP_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StartCallType.NEW_GROUP_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StartCallType.JOIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StartCallType.ANONYMOUS_JOIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StartCallType.TOKENIZED_JOIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(StartCallType startCallType) {
        return startCallType == StartCallType.INCOMING;
    }

    public static final boolean b(StartCallType startCallType) {
        int i = startCallType == null ? -1 : a.$EnumSwitchMapping$0[startCallType.ordinal()];
        return i == 3 || i == 4 || i == 5;
    }

    public static final boolean c(StartCallType startCallType) {
        int i = startCallType == null ? -1 : a.$EnumSwitchMapping$0[startCallType.ordinal()];
        return i == 1 || i == 2;
    }
}
