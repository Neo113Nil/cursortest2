package xsna;

import com.vk.voip.media.mute.model.VoipMediaMuteOption;
import com.vk.voip.media.mute.model.VoipMediaMuteOptionState;

/* compiled from: VoipMediaMuteState.kt */
/* loaded from: classes7.dex */
public final class jsw0 {
    public static final jsw0 c;
    public static final jsw0 d;
    public static final jsw0 e;
    public static final jsw0 f;
    public static final jsw0 g;
    public static final jsw0 h;
    public static final jsw0 i;
    public static final jsw0 j;
    public final VoipMediaMuteOption a;
    public final VoipMediaMuteOptionState b;

    static {
        VoipMediaMuteOption voipMediaMuteOption = VoipMediaMuteOption.MICROPHONE;
        VoipMediaMuteOptionState voipMediaMuteOptionState = VoipMediaMuteOptionState.MUTED_PERMANENT;
        c = new jsw0(voipMediaMuteOption, voipMediaMuteOptionState);
        VoipMediaMuteOptionState voipMediaMuteOptionState2 = VoipMediaMuteOptionState.UNMUTED_BUT_MUTED_ONCE;
        d = new jsw0(voipMediaMuteOption, voipMediaMuteOptionState2);
        VoipMediaMuteOption voipMediaMuteOption2 = VoipMediaMuteOption.CAMERA;
        e = new jsw0(voipMediaMuteOption2, voipMediaMuteOptionState);
        f = new jsw0(voipMediaMuteOption2, voipMediaMuteOptionState2);
        VoipMediaMuteOption voipMediaMuteOption3 = VoipMediaMuteOption.SCREEN_SHARING;
        g = new jsw0(voipMediaMuteOption3, voipMediaMuteOptionState);
        h = new jsw0(voipMediaMuteOption3, voipMediaMuteOptionState2);
        VoipMediaMuteOption voipMediaMuteOption4 = VoipMediaMuteOption.MOVIE_SHARING;
        i = new jsw0(voipMediaMuteOption4, voipMediaMuteOptionState);
        j = new jsw0(voipMediaMuteOption4, voipMediaMuteOptionState2);
    }

    public jsw0(VoipMediaMuteOption voipMediaMuteOption, VoipMediaMuteOptionState voipMediaMuteOptionState) {
        this.a = voipMediaMuteOption;
        this.b = voipMediaMuteOptionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsw0)) {
            return false;
        }
        jsw0 jsw0Var = (jsw0) obj;
        return this.a == jsw0Var.a && this.b == jsw0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VoipMediaMuteState(media=" + this.a + ", state=" + this.b + ')';
    }
}
