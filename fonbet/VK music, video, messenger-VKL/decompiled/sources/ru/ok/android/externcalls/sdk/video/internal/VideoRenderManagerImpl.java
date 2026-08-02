package ru.ok.android.externcalls.sdk.video.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.DelayedVideoRendererSource;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.gzs;
import xsna.jgp;
import xsna.zcl;

/* compiled from: VideoRenderManagerImpl.kt */
/* loaded from: classes9.dex */
public final class VideoRenderManagerImpl implements VideoRenderManager, DelayedVideoRendererSource {
    private final HashMap<CallParticipant.ParticipantId, Map<CallVideoTrackParticipantKey, List<VideoSink>>> cache;
    private final Call call;
    private final ConversationRenderers conversationRenderers;
    private final boolean isEarlyVideoEnabled;
    private final gzs<Conversation.State> state;
    private final ParticipantStore store;

    /* compiled from: VideoRenderManagerImpl.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoTrackType.values().length];
            try {
                iArr[VideoTrackType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoTrackType.SCREEN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoTrackType.MOVIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoTrackType.STREAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoTrackType.ANIMOJI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoRenderManagerImpl(gzs<? extends Conversation.State> gzsVar, Call call, ConversationRenderers conversationRenderers, ParticipantStore participantStore, boolean z) {
        this.state = gzsVar;
        this.call = call;
        this.conversationRenderers = conversationRenderers;
        this.store = participantStore;
        this.isEarlyVideoEnabled = z;
        this.cache = new HashMap<>();
    }

    private final void setRenderersForMe(CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<? extends VideoSink> list) {
        int i = WhenMappings.$EnumSwitchMapping$0[callVideoTrackParticipantKey.getType().ordinal()];
        if (i == 1) {
            List<? extends VideoSink> list2 = list;
            this.call.setLocalVideoRenderer((list2 == null || list2.isEmpty()) ? null : list.get(0));
        } else if (i != 2) {
            if (i == 3 || i == 4) {
                setRenderers(callVideoTrackParticipantKey, list);
                this.call.setRemoteVideoRenderers(callVideoTrackParticipantKey, list);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                this.call.setLocalAnimojiRenderers(list);
            }
        }
    }

    private final void setRenderersForOthers(CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<? extends VideoSink> list) {
        setRenderers(callVideoTrackParticipantKey, list);
        this.call.setRemoteVideoRenderers(callVideoTrackParticipantKey, list);
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public CallOpenGLRenderer getCallRenderer() {
        if (this.state.invoke() != Conversation.State.Finished) {
            return this.call.displayRenderer;
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public EglBase.Context getEglBaseContext() {
        if (this.call.rootEglBase == null || this.state.invoke() == Conversation.State.Finished) {
            return null;
        }
        return this.call.rootEglBase.getEglBaseContext();
    }

    @Override // ru.ok.android.webrtc.DelayedVideoRendererSource
    public Map<CallVideoTrackParticipantKey, List<VideoSink>> getRemoteVideoRenderers(CallParticipant.ParticipantId participantId) {
        Map<CallVideoTrackParticipantKey, List<VideoSink>> map = this.cache.get(participantId);
        return map == null ? jgp.b : map;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        return this.conversationRenderers.getRenderers(participantId);
    }

    @Override // ru.ok.android.webrtc.DelayedVideoRendererSource
    public boolean isEnabled() {
        return true;
    }

    @Override // ru.ok.android.externcalls.sdk.video.VideoRenderManager
    public void setRenderers(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, List<? extends VideoSink> list) {
        ConversationParticipant conversationParticipant = this.store.get(conversationVideoTrackParticipantKey.getParticipantId());
        if (conversationParticipant == null) {
            return;
        }
        boolean z = conversationParticipant == this.store.getMe() && conversationVideoTrackParticipantKey.getType() == VideoTrackType.VIDEO;
        if (conversationParticipant.isUseable() || (this.isEarlyVideoEnabled && z)) {
            CallParticipant callParticipant = conversationParticipant.getCallParticipant();
            VideoSink videoSink = null;
            CallParticipant.ParticipantId participantId = callParticipant != null ? callParticipant.getParticipantId() : null;
            if (participantId != null) {
                CallVideoTrackParticipantKey build = new CallVideoTrackParticipantKey.Builder().setType(conversationVideoTrackParticipantKey.getType()).setParticipantId(participantId).setMovieId(conversationVideoTrackParticipantKey.getMovieId()).build();
                this.conversationRenderers.setRenderers(conversationVideoTrackParticipantKey, list);
                if (conversationParticipant == this.store.getMe()) {
                    setRenderersForMe(build, list);
                    return;
                } else {
                    setRenderersForOthers(build, list);
                    return;
                }
            }
            if (this.isEarlyVideoEnabled && z) {
                Call call = this.call;
                List<? extends VideoSink> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    videoSink = list.get(0);
                }
                call.setLocalVideoRenderer(videoSink);
            }
        }
    }

    public /* synthetic */ VideoRenderManagerImpl(gzs gzsVar, Call call, ConversationRenderers conversationRenderers, ParticipantStore participantStore, boolean z, int i, zcl zclVar) {
        this(gzsVar, call, conversationRenderers, participantStore, (i & 16) != 0 ? false : z);
    }

    private final void setRenderers(CallVideoTrackParticipantKey callVideoTrackParticipantKey, List<? extends VideoSink> list) {
        HashMap<CallParticipant.ParticipantId, Map<CallVideoTrackParticipantKey, List<VideoSink>>> hashMap = this.cache;
        CallParticipant.ParticipantId participantId = callVideoTrackParticipantKey.getParticipantId();
        Map<CallVideoTrackParticipantKey, List<VideoSink>> map = hashMap.get(participantId);
        if (map == null) {
            map = new HashMap<>();
            hashMap.put(participantId, map);
        }
        map.put(callVideoTrackParticipantKey, list);
    }
}
