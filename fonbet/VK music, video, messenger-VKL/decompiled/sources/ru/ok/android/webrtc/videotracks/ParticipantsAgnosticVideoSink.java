package ru.ok.android.webrtc.videotracks;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;

/* loaded from: classes9.dex */
public class ParticipantsAgnosticVideoSink implements VideoSink {
    public final Map a;
    public final MappingProcessor b;

    public ParticipantsAgnosticVideoSink(@NonNull Map<CallVideoTrackParticipantKey, List<VideoSink>> map, @NonNull MappingProcessor mappingProcessor) {
        this.a = map;
        this.b = mappingProcessor;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId;
        List list;
        if ((videoFrame.getRotatedWidth() > 16 || videoFrame.getRotatedHeight() > 16) && (compactParticipantId = videoFrame.getCompactParticipantId()) != null) {
            CallVideoTrackParticipantKey queryKey = this.b.queryKey((int) compactParticipantId.longValue());
            if (queryKey == null || (list = (List) this.a.get(queryKey)) == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }
}
