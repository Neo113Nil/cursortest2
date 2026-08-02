package xsna;

import com.vk.im.engine.models.LongPollType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LongPollSyncStorageFactory.kt */
/* loaded from: classes2.dex */
public final class y400 {
    public final xgl0 a;

    /* compiled from: LongPollSyncStorageFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LongPollType.values().length];
            try {
                iArr[LongPollType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongPollType.CHANNELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public y400(xgl0 xgl0Var) {
        this.a = xgl0Var;
    }

    public final w400 a(LongPollType longPollType) {
        int i = a.$EnumSwitchMapping$0[longPollType.ordinal()];
        xgl0 xgl0Var = this.a;
        if (i == 1) {
            return new z400(xgl0Var);
        }
        if (i == 2) {
            return new x400(xgl0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
