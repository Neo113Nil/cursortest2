package ru.ok.android.externcalls.sdk.video;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import xsna.zcl;

/* compiled from: VideoRender.kt */
/* loaded from: classes11.dex */
public final class VideoRender<T extends VideoSink & RendererView> {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "VideoRender";
    private final ConcurrentHashMap<ConversationVideoTrackParticipantKey, List<T>> delegates = new ConcurrentHashMap<>();

    /* compiled from: VideoRender.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void addDelegate(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, T t) {
        List<T> putIfAbsent;
        if (contains(conversationVideoTrackParticipantKey, t)) {
            return;
        }
        GlobalRTCLogger.log(LOG_TAG, "adding " + t + " to " + conversationVideoTrackParticipantKey);
        ConcurrentHashMap<ConversationVideoTrackParticipantKey, List<T>> concurrentHashMap = this.delegates;
        List<T> list = concurrentHashMap.get(conversationVideoTrackParticipantKey);
        if (list == null && (putIfAbsent = concurrentHashMap.putIfAbsent(conversationVideoTrackParticipantKey, (list = new CopyOnWriteArrayList<>()))) != null) {
            list = putIfAbsent;
        }
        list.add(t);
    }

    public final List<VideoSink> asOkVideoSink(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        return Collections.singletonList(new VideoSinkWrapper(conversationVideoTrackParticipantKey, this.delegates));
    }

    public final void clear() {
        Iterator<T> it = this.delegates.values().iterator();
        while (it.hasNext()) {
            ((List) it.next()).clear();
        }
        this.delegates.clear();
    }

    public final boolean contains(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        List<T> list = this.delegates.get(conversationVideoTrackParticipantKey);
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void removeDelegate(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, T t) {
        GlobalRTCLogger.log(LOG_TAG, "removing " + t + " from " + conversationVideoTrackParticipantKey);
        List<T> list = this.delegates.get(conversationVideoTrackParticipantKey);
        if (list != null) {
            list.remove(t);
        }
    }

    public final void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
        List<T> list = this.delegates.get(conversationVideoTrackParticipantKey);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RendererView) ((VideoSink) it.next())).setMirror(z);
            }
        }
    }

    public final boolean contains(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, T t) {
        List<T> list = this.delegates.get(conversationVideoTrackParticipantKey);
        return list != null && list.contains(t);
    }
}
