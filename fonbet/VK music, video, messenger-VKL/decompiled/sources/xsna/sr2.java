package xsna;

import android.widget.FrameLayout;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;

/* compiled from: AnimojiFullscreenRendererHelper.kt */
/* loaded from: classes7.dex */
public final class sr2 extends yk90 {
    public final mjt l;
    public volatile VideoDisplayLayout m;
    public volatile Float n;

    /* compiled from: AnimojiFullscreenRendererHelper.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public sr2(zzz zzzVar, FrameLayout frameLayout, rct0 rct0Var, wly wlyVar, k490 k490Var) {
        super(zzzVar, frameLayout, rct0Var, wlyVar, k490Var);
        this.l = new mjt(zzzVar);
    }

    @Override // xsna.yk90
    public final void b(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        super.b(conversationVideoTrackParticipantKey);
        TextureViewRenderer textureViewRenderer = this.j;
        if (textureViewRenderer != null) {
            textureViewRenderer.setFrameSkipCondition(new g20(this, 2));
        }
    }

    @Override // xsna.yk90
    public final FrameDecorator d(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        return new ags(new a(this.a, zzz.class, "currentAngle", "getCurrentAngle()F", 0));
    }
}
