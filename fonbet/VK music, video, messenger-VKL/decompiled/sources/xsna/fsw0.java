package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: VoipMediaMuteManager.kt */
/* loaded from: classes7.dex */
public interface fsw0 {

    /* compiled from: VoipMediaMuteManager.kt */
    public static final class a {
        public final MediaOptionState a;
        public final MediaOptionState b;

        public a(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2) {
            this.a = mediaOptionState;
            this.b = mediaOptionState2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SetupOptions(audioOptionState=" + this.a + ", videoOptionState=" + this.b + ')';
        }
    }

    void a(ParticipantId participantId, Set set);

    void b(CallMemberId callMemberId, Map<MediaOption, ? extends MediaOptionState> map);

    void c(a aVar);

    void e(Set set);

    void f(Map map);
}
