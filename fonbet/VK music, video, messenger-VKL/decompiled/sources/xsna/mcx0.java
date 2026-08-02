package xsna;

import android.util.Size;
import android.widget.FrameLayout;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;

/* compiled from: WatchTogetherFullscreenRendererHelper.kt */
/* loaded from: classes7.dex */
public final class mcx0 extends yk90 {
    public final mjt l;

    public mcx0(zzz zzzVar, FrameLayout frameLayout, rct0 rct0Var, wly wlyVar, k490 k490Var) {
        super(zzzVar, frameLayout, rct0Var, wlyVar, k490Var);
        this.l = new mjt(zzzVar);
    }

    @Override // xsna.yk90
    public final void c(TextureViewRenderer textureViewRenderer) {
        super.c(textureViewRenderer);
        textureViewRenderer.setMirror(false);
    }

    public final ConversationDisplayLayoutItem g() {
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = this.k;
        if (conversationVideoTrackParticipantKey == null) {
            return null;
        }
        FrameLayout frameLayout = this.b;
        VideoDisplayLayout a = this.l.a(new Size(frameLayout.getWidth(), frameLayout.getHeight()));
        if (a == null) {
            return null;
        }
        return new ConversationDisplayLayoutItem(conversationVideoTrackParticipantKey, a);
    }
}
