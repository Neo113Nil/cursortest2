package xsna;

import android.widget.FrameLayout;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;

/* compiled from: VideoRendererHelper.kt */
/* loaded from: classes7.dex */
public final class xct0 extends yk90 {
    public final mjt l;

    /* compiled from: VideoRendererHelper.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    /* compiled from: VideoRendererHelper.kt */
    public static final /* synthetic */ class b extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public xct0(zzz zzzVar, FrameLayout frameLayout, rct0 rct0Var, wly wlyVar, k490 k490Var) {
        super(zzzVar, frameLayout, rct0Var, wlyVar, k490Var);
        this.l = new mjt(zzzVar);
    }

    @Override // xsna.yk90
    public final FrameDecorator d(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        boolean n = mnh0.n(this.e.a(), conversationVideoTrackParticipantKey.getParticipantId());
        zzz zzzVar = this.a;
        return n ? new j7i(new a(zzzVar, zzz.class, "currentAngle", "getCurrentAngle()F", 0), this.d) : new ags(new b(zzzVar, zzz.class, "currentAngle", "getCurrentAngle()F", 0));
    }
}
