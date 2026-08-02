package ru.ok.android.externcalls.sdk.video;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* compiled from: VideoSinkWrapper.kt */
/* loaded from: classes9.dex */
public final class VideoSinkWrapper<T extends VideoSink> implements VideoSink {
    private final Map<ConversationVideoTrackParticipantKey, List<T>> delegates;
    private final ConversationVideoTrackParticipantKey key;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSinkWrapper(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, Map<ConversationVideoTrackParticipantKey, ? extends List<? extends T>> map) {
        this.key = conversationVideoTrackParticipantKey;
        this.delegates = map;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        List<T> list = this.delegates.get(this.key);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }

    public String toString() {
        return this.key.getParticipantId() + X3.j.d + hashCode() + X3.j.e;
    }
}
