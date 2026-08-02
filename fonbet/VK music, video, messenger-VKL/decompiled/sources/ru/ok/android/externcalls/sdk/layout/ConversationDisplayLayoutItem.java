package ru.ok.android.externcalls.sdk.layout;

import androidx.annotation.NonNull;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;

/* loaded from: classes9.dex */
public final class ConversationDisplayLayoutItem {

    @NonNull
    private final VideoDisplayLayout layout;

    @NonNull
    private final ConversationVideoTrackParticipantKey videoTrackParticipantKey;

    public ConversationDisplayLayoutItem(@NonNull ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, @NonNull VideoDisplayLayout videoDisplayLayout) {
        this.videoTrackParticipantKey = conversationVideoTrackParticipantKey;
        this.layout = videoDisplayLayout;
    }

    @NonNull
    public VideoDisplayLayout getLayout() {
        return this.layout;
    }

    @NonNull
    public ConversationVideoTrackParticipantKey getVideoTrackParticipantKey() {
        return this.videoTrackParticipantKey;
    }
}
