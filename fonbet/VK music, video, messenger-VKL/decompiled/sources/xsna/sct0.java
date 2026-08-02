package xsna;

import android.content.Context;
import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import java.util.Collection;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import ru.ok.android.webrtc.videotracks.VideoTrackType;

/* compiled from: VideoRendererControllerImpl.kt */
/* loaded from: classes11.dex */
public final class sct0 implements rct0, ParticipantVideoViewManager<TextureViewRenderer> {
    public final OKVoipEngine.l a;
    public final ParticipantVideoViewManager<TextureViewRenderer> b;
    public final OKVoipEngine.o c;

    public sct0(OKVoipEngine.l lVar, ParticipantVideoViewManager participantVideoViewManager, OKVoipEngine.o oVar) {
        this.a = lVar;
        this.b = participantVideoViewManager;
        this.c = oVar;
    }

    @Override // xsna.rct0
    public final ConversationVideoTrackParticipantKey a() {
        Conversation conversation = (Conversation) this.a.get();
        if (conversation != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversation.getMe().getExternalId()).setType(VideoTrackType.ANIMOJI).build();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void clear() {
        this.b.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    /* renamed from: createVideoViewInstance */
    public final TextureViewRenderer mo349createVideoViewInstance(Context context) {
        TextureViewRenderer mo349createVideoViewInstance = this.b.mo349createVideoViewInstance(context);
        mo349createVideoViewInstance.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        L.A("VideoRendererController", "TextureView created: " + mo349createVideoViewInstance);
        return mo349createVideoViewInstance;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        return this.b.getOwnVideoTrack();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void rebindParticipantView(ConversationParticipant conversationParticipant) {
        this.c.invoke(new qsd0(6, this, conversationParticipant));
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void rebindParticipantViews() {
        this.b.rebindParticipantViews();
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void releaseParticipantView(TextureViewRenderer textureViewRenderer) {
        TextureViewRenderer textureViewRenderer2 = textureViewRenderer;
        L.e("VideoRendererController", "TextureView released: " + textureViewRenderer2);
        this.b.releaseParticipantView(textureViewRenderer2);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void removeOwnVideoParticipantView(TextureViewRenderer textureViewRenderer) {
        this.b.removeOwnVideoParticipantView(textureViewRenderer);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer) {
        this.c.invoke(new defpackage.t(this, conversationVideoTrackParticipantKey, textureViewRenderer, 3));
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
        this.b.setMirror(conversationVideoTrackParticipantKey, z);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setOwnVideoParticipantView(TextureViewRenderer textureViewRenderer, FrameDecorator frameDecorator) {
        this.c.invoke(new mi1(this, textureViewRenderer, frameDecorator, 6));
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer) {
        this.b.setParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> collection) {
        this.b.updateDisplayLayout(collection);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager
    public final void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer, FrameDecorator frameDecorator) {
        this.c.invoke(new y2t(this, conversationVideoTrackParticipantKey, textureViewRenderer, frameDecorator, 3));
    }
}
