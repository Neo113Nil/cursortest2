package xsna;

import android.os.Bundle;
import com.vk.log.L;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.media_options.MediaOption;
import xsna.srw0;

/* compiled from: ParticipantMediaRequestDialog.kt */
/* loaded from: classes7.dex */
public final class uk90 extends ug6 {
    public static final /* synthetic */ int l1 = 0;
    public final int k1 = R.string.voip_media_request_dialog_participant_title;

    @Override // xsna.ug6
    public final int Yn() {
        return this.k1;
    }

    @Override // xsna.ug6
    public final void Zn() {
        bo(rl3.y0(new MediaOption[]{MediaOption.AUDIO, MediaOption.VIDEO}));
    }

    @Override // xsna.ug6
    public final void ao() {
        bo(Collections.singleton(MediaOption.AUDIO));
    }

    public final void bo(Set<? extends MediaOption> set) {
        Bundle arguments = getArguments();
        CallMemberId callMemberId = arguments != null ? (CallMemberId) arguments.getParcelable("participant_id_key") : null;
        if (callMemberId == null) {
            L.l("onRequestMicrophoneClicked null id");
            return;
        }
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.b0().a(new ParticipantId(callMemberId.b, false, callMemberId.c), set);
        ((kdw0) this.f1.getValue()).b(new srw0.b.a("", srw0.d.b.a, set));
    }
}
