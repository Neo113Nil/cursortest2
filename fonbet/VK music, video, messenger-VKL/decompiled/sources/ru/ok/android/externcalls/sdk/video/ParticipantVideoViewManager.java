package ru.ok.android.externcalls.sdk.video;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import ru.ok.android.externcalls.sdk.video.internal.ParticipantVideoViewManagerImpl;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.u0f;

/* compiled from: ParticipantVideoViewManager.kt */
/* loaded from: classes11.dex */
public interface ParticipantVideoViewManager<R extends RendererView> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ParticipantVideoViewManager.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParticipantVideoViewManager newInstance$default(Companion companion, gzs gzsVar, izs izsVar, gzs gzsVar2, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                gzsVar2 = new u0f(6);
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.newInstance(gzsVar, izsVar, gzsVar2, z);
        }

        public final <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(gzs<? extends Conversation> gzsVar, izs<? super Context, ? extends T> izsVar, gzs<s3q0> gzsVar2, boolean z) {
            return new ParticipantVideoViewManagerImpl(gzsVar, izsVar, gzsVar2, z);
        }
    }

    static <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(gzs<? extends Conversation> gzsVar, izs<? super Context, ? extends T> izsVar, gzs<s3q0> gzsVar2, boolean z) {
        return Companion.newInstance(gzsVar, izsVar, gzsVar2, z);
    }

    /* renamed from: createVideoViewInstance */
    R mo349createVideoViewInstance(Context context);

    ConversationVideoTrackParticipantKey getOwnVideoTrack();

    default void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r, FrameDecorator frameDecorator) {
    }

    default void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
        setParticipantView(conversationVideoTrackParticipantKey, r, new FrameDecorator() { // from class: xsna.fl90
            @Override // ru.ok.android.externcalls.sdk.ui.FrameDecorator
            public final VideoFrame apply(VideoFrame videoFrame) {
                VideoFrame participantView$lambda$0;
                participantView$lambda$0 = ParticipantVideoViewManager.setParticipantView$lambda$0(videoFrame);
                return participantView$lambda$0;
            }
        });
    }

    default void clear() {
    }

    default void rebindParticipantViews() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static VideoFrame setParticipantView$lambda$0(VideoFrame videoFrame) {
        return videoFrame;
    }

    default void rebindParticipantView(ConversationParticipant conversationParticipant) {
    }

    default void releaseParticipantView(R r) {
    }

    default void removeOwnVideoParticipantView(R r) {
    }

    default void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> collection) {
    }

    default void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
    }

    default void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
    }

    default void setOwnVideoParticipantView(R r, FrameDecorator frameDecorator) {
    }
}
