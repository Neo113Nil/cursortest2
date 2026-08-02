package xsna;

import com.vk.api.generated.calls.dto.CallsStartMuteAudioDto;
import com.vk.api.generated.calls.dto.CallsStartMuteScreenSharingDto;
import com.vk.api.generated.calls.dto.CallsStartMuteVideoDto;
import com.vk.voip.ui.imcalls.model.AudioMuteOption;
import com.vk.voip.ui.imcalls.model.SreenshareMuteOption;
import com.vk.voip.ui.imcalls.model.VideoMuteOption;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CreateCallInteractor.kt */
/* loaded from: classes7.dex */
public final class o6k {
    public final b25 a;
    public final rd9 b;

    public o6k(b25 b25Var, rd9 rd9Var) {
        this.a = b25Var;
        this.b = rd9Var;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(b99 b99Var) {
        CallsStartMuteAudioDto callsStartMuteAudioDto;
        CallsStartMuteVideoDto callsStartMuteVideoDto;
        CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto;
        boolean z = b99Var.a;
        AudioMuteOption.a aVar = AudioMuteOption.Companion;
        AudioMuteOption audioMuteOption = b99Var.b;
        aVar.getClass();
        int i = AudioMuteOption.a.C2061a.$EnumSwitchMapping$0[audioMuteOption.ordinal()];
        if (i == 1) {
            callsStartMuteAudioDto = CallsStartMuteAudioDto.MUTE;
        } else if (i == 2) {
            callsStartMuteAudioDto = CallsStartMuteAudioDto.MUTE_PERMANENT;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            callsStartMuteAudioDto = CallsStartMuteAudioDto.UNMUTE;
        }
        CallsStartMuteAudioDto callsStartMuteAudioDto2 = callsStartMuteAudioDto;
        VideoMuteOption.a aVar2 = VideoMuteOption.Companion;
        VideoMuteOption videoMuteOption = b99Var.c;
        aVar2.getClass();
        int i2 = VideoMuteOption.a.C2063a.$EnumSwitchMapping$0[videoMuteOption.ordinal()];
        if (i2 == 1) {
            callsStartMuteVideoDto = CallsStartMuteVideoDto.MUTE;
        } else if (i2 == 2) {
            callsStartMuteVideoDto = CallsStartMuteVideoDto.MUTE_PERMANENT;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            callsStartMuteVideoDto = CallsStartMuteVideoDto.UNMUTE;
        }
        CallsStartMuteVideoDto callsStartMuteVideoDto2 = callsStartMuteVideoDto;
        boolean z2 = b99Var.d;
        Boolean bool = b99Var.g;
        SreenshareMuteOption sreenshareMuteOption = b99Var.f;
        if (sreenshareMuteOption != null) {
            SreenshareMuteOption.Companion.getClass();
            int i3 = SreenshareMuteOption.a.C2062a.$EnumSwitchMapping$0[sreenshareMuteOption.ordinal()];
            if (i3 == 1) {
                callsStartMuteScreenSharingDto = CallsStartMuteScreenSharingDto.MUTE;
            } else if (i3 == 2) {
                callsStartMuteScreenSharingDto = CallsStartMuteScreenSharingDto.MUTE_PERMANENT;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                callsStartMuteScreenSharingDto = CallsStartMuteScreenSharingDto.UNMUTE;
            }
        } else {
            callsStartMuteScreenSharingDto = null;
        }
        CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto2 = callsStartMuteScreenSharingDto;
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean bool2 = Boolean.FALSE;
        return rsg0.w0(yfb.x(qd9.b(this.b, valueOf, null, null, null, null, null, null, bool2, bool2, callsStartMuteAudioDto2, callsStartMuteVideoDto2, callsStartMuteScreenSharingDto2, bool2, Boolean.valueOf(z), bool, null, 133841401)));
    }

    public final b99 b() {
        b25 b25Var = this.a;
        return new b99(!o25.b(b25Var), AudioMuteOption.Enabled, VideoMuteOption.Enabled, o25.b(b25Var), o25.b(b25Var), o25.b(b25Var) ? SreenshareMuteOption.DisabledPermanent : SreenshareMuteOption.Enabled, Boolean.valueOf(o25.b(b25Var)));
    }
}
