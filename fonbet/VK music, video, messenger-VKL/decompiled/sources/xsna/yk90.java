package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* compiled from: ParticipantRenderHelper.kt */
/* loaded from: classes7.dex */
public abstract class yk90 {
    public final zzz a;
    public final FrameLayout b;
    public final rct0 c;
    public final wly d;
    public final k490 e;
    public final boolean f = true;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final ArrayList h = new ArrayList();
    public boolean i;
    public TextureViewRenderer j;
    public ConversationVideoTrackParticipantKey k;

    /* compiled from: ParticipantRenderHelper.kt */
    public interface a {
        void c();

        void d();
    }

    /* compiled from: ParticipantRenderHelper.kt */
    public static final /* synthetic */ class b extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public yk90(zzz zzzVar, FrameLayout frameLayout, rct0 rct0Var, wly wlyVar, k490 k490Var) {
        this.a = zzzVar;
        this.b = frameLayout;
        this.c = rct0Var;
        this.d = wlyVar;
        this.e = k490Var;
        new Size(0, 0);
    }

    public final void a(a aVar) {
        this.h.add(aVar);
        if (this.i) {
            aVar.c();
        }
    }

    public void b(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        TextureViewRenderer textureViewRenderer;
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey2 = this.k;
        rct0 rct0Var = this.c;
        if (conversationVideoTrackParticipantKey2 != null && !conversationVideoTrackParticipantKey2.equals(conversationVideoTrackParticipantKey) && (textureViewRenderer = this.j) != null) {
            rct0Var.removeParticipantView(conversationVideoTrackParticipantKey2, textureViewRenderer);
        }
        TextureViewRenderer textureViewRenderer2 = this.j;
        boolean z = false;
        if (textureViewRenderer2 == null) {
            FrameLayout frameLayout = this.b;
            TextureViewRenderer mo349createVideoViewInstance = rct0Var.mo349createVideoViewInstance(frameLayout.getContext());
            this.j = mo349createVideoViewInstance;
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.addView(mo349createVideoViewInstance, 0, e());
            z = true;
            textureViewRenderer2 = mo349createVideoViewInstance;
        }
        rct0Var.setParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer2, d(conversationVideoTrackParticipantKey));
        if (z) {
            c(textureViewRenderer2);
        }
        this.k = conversationVideoTrackParticipantKey;
    }

    public void c(TextureViewRenderer textureViewRenderer) {
        if (this.f) {
            textureViewRenderer.setClipToOutline(false);
            RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
            textureViewRenderer.setScalingType(scalingType, scalingType);
            textureViewRenderer.setUseAlternateLayout(true);
        }
        x1u x1uVar = new x1u(2, this, yk90.class, "onFrameRendered", "onFrameRendered(II)V", 0, 1);
        if (textureViewRenderer != null) {
            textureViewRenderer.setFrameSizeListener(x1uVar);
        }
    }

    public FrameDecorator d(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        return new ags(new b(this.a, zzz.class, "currentAngle", "getCurrentAngle()F", 0));
    }

    public FrameLayout.LayoutParams e() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public void f() {
        TextureViewRenderer textureViewRenderer = this.j;
        if (textureViewRenderer != null) {
            ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey = this.k;
            rct0 rct0Var = this.c;
            if (conversationVideoTrackParticipantKey != null) {
                rct0Var.removeParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
            }
            this.k = null;
            rct0Var.releaseParticipantView(textureViewRenderer);
            this.b.removeView(textureViewRenderer);
            this.j = null;
        }
        if (this.i) {
            this.i = false;
            new Size(0, 0);
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((a) it.next()).d();
            }
        }
    }
}
