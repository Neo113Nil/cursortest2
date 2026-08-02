package xsna;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: CallParticipantMapper.kt */
/* loaded from: classes7.dex */
public final class c79 {
    public final com.vk.voip.b a;

    /* compiled from: CallParticipantMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaOptionState.values().length];
            try {
                iArr[MediaOptionState.MUTED_PERMANENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOptionState.UNMUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c79(com.vk.voip.b bVar, gdp gdpVar) {
        this.a = bVar;
    }

    public static boolean a(MediaOptionState mediaOptionState) {
        int i = a.$EnumSwitchMapping$0[mediaOptionState.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
