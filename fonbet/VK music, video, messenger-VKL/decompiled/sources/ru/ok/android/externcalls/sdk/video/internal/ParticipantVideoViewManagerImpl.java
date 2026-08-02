package ru.ok.android.externcalls.sdk.video.internal;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import ru.ok.android.externcalls.sdk.video.VideoRender;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: ParticipantVideoViewManagerImpl.kt */
/* loaded from: classes11.dex */
public final class ParticipantVideoViewManagerImpl<R extends View & VideoSink & RendererView> implements ParticipantVideoViewManager<R> {
    private final gzs<Conversation> conversation;
    private final izs<Context, R> factory;
    private final boolean isEarlyVideoEnabled;
    private final gzs<s3q0> onOwnCameraRendererSet;
    private final VideoRender<R> videoRender;

    /* JADX WARN: Multi-variable type inference failed */
    public ParticipantVideoViewManagerImpl(gzs<? extends Conversation> gzsVar, izs<? super Context, ? extends R> izsVar, gzs<s3q0> gzsVar2, boolean z) {
        this.conversation = gzsVar;
        this.factory = izsVar;
        this.onOwnCameraRendererSet = gzsVar2;
        this.isEarlyVideoEnabled = z;
        this.videoRender = new VideoRender<>();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation invoke = this.conversation.invoke();
        if (invoke != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(invoke.getMe().getExternalId()).build();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void rebindParticipantView(ConversationParticipant conversationParticipant) {
        Conversation invoke = this.conversation.invoke();
        if (invoke != null) {
            rebindParticipantView(invoke, conversationParticipant);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void rebindParticipantViews() {
        Conversation invoke = this.conversation.invoke();
        if (invoke != null && invoke.getState() == Conversation.State.Connected) {
            Iterator<ConversationParticipant> it = invoke.getParticipants().iterator();
            while (it.hasNext()) {
                rebindParticipantView(invoke, it.next());
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
        this.videoRender.setMirror(conversationVideoTrackParticipantKey, z);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> collection) {
        DisplayLayoutSender displayLayoutSender;
        Conversation invoke = this.conversation.invoke();
        if (invoke == null || (displayLayoutSender = invoke.getDisplayLayoutSender()) == null) {
            return;
        }
        displayLayoutSender.sendDisplayLayouts(collection);
    }

    private final void rebindParticipantView(Conversation conversation, ConversationParticipant conversationParticipant) {
        if (conversationParticipant.isUseable()) {
            for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : conversation.getVideoRenderManager().getRenderers(conversationParticipant.getExternalId()).keySet()) {
                conversation.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* renamed from: createVideoViewInstance, reason: merged with bridge method [inline-methods] */
    public R mo349createVideoViewInstance(Context context) {
        return this.factory.invoke(context);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void releaseParticipantView(R r) {
        r.release();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void removeOwnVideoParticipantView(R r) {
        ConversationVideoTrackParticipantKey ownVideoTrack = getOwnVideoTrack();
        if (ownVideoTrack != null) {
            removeParticipantView(ownVideoTrack, (ConversationVideoTrackParticipantKey) r);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
        ConversationParticipant conversationParticipant;
        Conversation invoke = this.conversation.invoke();
        R r2 = r;
        if (this.videoRender.contains(conversationVideoTrackParticipantKey, r2)) {
            this.videoRender.removeDelegate(conversationVideoTrackParticipantKey, r2);
            if (invoke == null || (conversationParticipant = invoke.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId())) == null || !conversationParticipant.isUseable()) {
                return;
            }
            invoke.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void setOwnVideoParticipantView(R r, FrameDecorator frameDecorator) {
        setParticipantView(getOwnVideoTrack(), r);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r, FrameDecorator frameDecorator) {
        Conversation invoke = this.conversation.invoke();
        if (invoke == null) {
            return;
        }
        boolean z = conversationVideoTrackParticipantKey != null && epx.f(invoke.getMe().getExternalId(), conversationVideoTrackParticipantKey.getParticipantId()) && conversationVideoTrackParticipantKey.getType() == VideoTrackType.VIDEO;
        if (!((z && this.isEarlyVideoEnabled) || invoke.getState() == Conversation.State.Connected) || conversationVideoTrackParticipantKey == null) {
            return;
        }
        R r2 = r;
        if (this.videoRender.contains(conversationVideoTrackParticipantKey, r2)) {
            return;
        }
        ConversationParticipant conversationParticipant = invoke.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId());
        if (conversationParticipant == null) {
            return;
        }
        if (conversationParticipant.isUseable() || (this.isEarlyVideoEnabled && z)) {
            this.videoRender.addDelegate(conversationVideoTrackParticipantKey, r2);
            if (z) {
                this.onOwnCameraRendererSet.invoke();
            } else {
                r.setMirror(false);
            }
            invoke.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            CallOpenGLRenderer callRenderer = invoke.getVideoRenderManager().getCallRenderer();
            if (callRenderer != null) {
                r.init(callRenderer, null, frameDecorator);
            }
        }
    }

    public /* synthetic */ ParticipantVideoViewManagerImpl(gzs gzsVar, izs izsVar, gzs gzsVar2, boolean z, int i, zcl zclVar) {
        this(gzsVar, izsVar, gzsVar2, (i & 8) != 0 ? false : z);
    }
}
