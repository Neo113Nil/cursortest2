package xsna;

import android.util.Size;
import com.vk.voip.dto.call_member.CallMemberId;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.videotracks.VideoTrackType;

/* compiled from: VoipP2PLayoutUpdater.kt */
/* loaded from: classes7.dex */
public final class ltw0 {
    public final com.vk.voip.b a;

    public ltw0(com.vk.voip.b bVar) {
        this.a = bVar;
    }

    public static ConversationDisplayLayoutItem a(CallMemberId callMemberId, VideoTrackType videoTrackType, Size size) {
        return new ConversationDisplayLayoutItem(new ConversationVideoTrackParticipantKey.Builder().setParticipantId(mnh0.H(callMemberId)).setType(videoTrackType).build(), new VideoDisplayLayout.Builder().setFit(VideoDisplayLayout.Fit.COVER).setWidth(size.getWidth()).setHeight(size.getHeight()).build());
    }
}
