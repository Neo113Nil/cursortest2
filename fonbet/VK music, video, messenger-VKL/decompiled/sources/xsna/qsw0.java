package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.msw0;
import xsna.srw0;

/* compiled from: VoipMediaSettingDialogParticipantActionHandler.kt */
/* loaded from: classes7.dex */
public final class qsw0 implements msw0.a, pdw0 {
    public final com.vk.voip.ui.c a;
    public final CallMemberId b;
    public final odw0 c = new odw0();

    /* compiled from: VoipMediaSettingDialogParticipantActionHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaOptionState.values().length];
            try {
                iArr[MediaOptionState.UNMUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaOptionState.UNMUTED_BUT_MUTED_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qsw0(com.vk.voip.ui.c cVar, CallMemberId callMemberId) {
        this.a = cVar;
        this.b = callMemberId;
    }

    @Override // xsna.pdw0
    public final io.reactivex.rxjava3.core.q<mdw0> a() {
        return this.c.a;
    }

    @Override // xsna.msw0.a
    public final void b(msw0.c cVar) {
        MediaOption mediaOption = cVar.a;
        MediaOptionState mediaOptionState = cVar.b;
        int i = a.$EnumSwitchMapping$0[mediaOptionState.ordinal()];
        CallMemberId callMemberId = this.b;
        com.vk.voip.ui.c cVar2 = this.a;
        if (i == 1 || i == 2) {
            cVar2.getClass();
            com.vk.voip.ui.c.b0().b(callMemberId, on00.f(new Pair(mediaOption, MediaOptionState.UNMUTED_BUT_MUTED_ONCE)));
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            cVar2.getClass();
            com.vk.voip.ui.c.b0().b(callMemberId, on00.f(new Pair(mediaOption, MediaOptionState.UNMUTED)));
        }
        this.c.b(new srw0.b.C3687b(srw0.d.b.a, new Pair(mediaOption, mediaOptionState)));
    }

    @Override // xsna.msw0.a
    public final void c(msw0.c cVar) {
        MediaOption mediaOption = cVar.a;
        MediaOptionState mediaOptionState = cVar.b;
        int i = a.$EnumSwitchMapping$0[mediaOptionState.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            this.a.getClass();
            com.vk.voip.ui.c.b0().b(this.b, on00.f(new Pair(mediaOption, MediaOptionState.MUTED_PERMANENT)));
            this.c.b(new srw0.b.C3687b(srw0.d.b.a, new Pair(mediaOption, mediaOptionState)));
        }
    }
}
