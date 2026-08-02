package one.video.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.function.Consumer;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.f;
import one.video.player.tracks.c;
import one.video.view.OneVideoPlayerView;
import xsna.a72;
import xsna.ach0;
import xsna.asp;
import xsna.avt0;
import xsna.bpn0;
import xsna.c950;
import xsna.cms0;
import xsna.d1u0;
import xsna.e1u0;
import xsna.epx;
import xsna.f1u0;
import xsna.g1u0;
import xsna.gsq0;
import xsna.h1u0;
import xsna.l1u0;
import xsna.ma;
import xsna.s3q0;
import xsna.sht0;
import xsna.u14;
import xsna.wm80;
import xsna.zrp;

/* compiled from: OneVideoPlayerView.kt */
/* loaded from: classes8.dex */
public class OneVideoPlayerView extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final RenderType b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public OneVideoPlayer f;
    public final b g;
    public ach0 h;
    public avt0 i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoPlayerView.kt */
    public static final class RenderType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RenderType[] $VALUES;
        public static final RenderType SURFACE;
        public static final RenderType TEXTURE;

        static {
            RenderType renderType = new RenderType("TEXTURE", 0);
            TEXTURE = renderType;
            RenderType renderType2 = new RenderType("SURFACE", 1);
            SURFACE = renderType2;
            RenderType[] renderTypeArr = {renderType, renderType2};
            $VALUES = renderTypeArr;
            $ENTRIES = new asp(renderTypeArr);
        }

        public RenderType() {
            throw null;
        }

        public static RenderType valueOf(String str) {
            return (RenderType) Enum.valueOf(RenderType.class, str);
        }

        public static RenderType[] values() {
            return (RenderType[]) $VALUES.clone();
        }
    }

    /* compiled from: OneVideoPlayerView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RenderType.values().length];
            try {
                iArr[RenderType.TEXTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderType.SURFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OneVideoPlayerView.kt */
    public static final class b implements f {
        public b() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, c cVar) {
            cms0 cms0Var;
            h1u0 surfaceHolder = OneVideoPlayerView.this.getSurfaceHolder();
            Size c = (cVar == null || (cms0Var = (cms0) cVar.c) == null) ? null : cms0Var.c();
            Consumer<Size> consumer = surfaceHolder.a;
            if (consumer != null) {
                consumer.accept(c);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void f(OneVideoPlayer oneVideoPlayer) {
            OneVideoPlayerView oneVideoPlayerView = OneVideoPlayerView.this;
            ach0 keepAwakeManager = oneVideoPlayerView.getKeepAwakeManager();
            if (keepAwakeManager != null) {
                keepAwakeManager.b(oneVideoPlayerView);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void j(OneVideoPlayer oneVideoPlayer) {
            OneVideoPlayerView oneVideoPlayerView = OneVideoPlayerView.this;
            ach0 keepAwakeManager = oneVideoPlayerView.getKeepAwakeManager();
            if (keepAwakeManager != null) {
                keepAwakeManager.c(oneVideoPlayerView);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer) {
            OneVideoPlayerView oneVideoPlayerView = OneVideoPlayerView.this;
            ach0 keepAwakeManager = oneVideoPlayerView.getKeepAwakeManager();
            if (keepAwakeManager != null) {
                keepAwakeManager.b(oneVideoPlayerView);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void r(OneVideoPlayer oneVideoPlayer) {
            OneVideoPlayerView oneVideoPlayerView = OneVideoPlayerView.this;
            ach0 keepAwakeManager = oneVideoPlayerView.getKeepAwakeManager();
            if (keepAwakeManager != null) {
                keepAwakeManager.b(oneVideoPlayerView);
            }
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void s(OneVideoPlayer oneVideoPlayer) {
            OneVideoPlayerView oneVideoPlayerView = OneVideoPlayerView.this;
            ach0 keepAwakeManager = oneVideoPlayerView.getKeepAwakeManager();
            if (keepAwakeManager != null) {
                keepAwakeManager.c(oneVideoPlayerView);
            }
        }
    }

    public OneVideoPlayerView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static h1u0 a(OneVideoPlayerView oneVideoPlayerView) {
        int i = a.$EnumSwitchMapping$0[oneVideoPlayerView.getRenderType().ordinal()];
        if (i == 1) {
            TextureView textureView = (TextureView) oneVideoPlayerView.getRenderView();
            h1u0 h1u0Var = new h1u0(null);
            gsq0 gsq0Var = new gsq0(h1u0Var, 4);
            gsq0Var.invoke(textureView);
            textureView.addOnLayoutChangeListener(new e1u0(gsq0Var));
            textureView.setSurfaceTextureListener(new f1u0(h1u0Var));
            return h1u0Var;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        SurfaceView surfaceView = (SurfaceView) oneVideoPlayerView.getRenderView();
        h1u0 h1u0Var2 = new h1u0(new d1u0(surfaceView));
        gsq0 gsq0Var2 = new gsq0(h1u0Var2, 4);
        gsq0Var2.invoke(surfaceView);
        surfaceView.addOnLayoutChangeListener(new e1u0(gsq0Var2));
        surfaceView.getHolder().addCallback(new g1u0(h1u0Var2));
        return h1u0Var2;
    }

    public static l1u0 b(OneVideoPlayerView oneVideoPlayerView) {
        return new l1u0(oneVideoPlayerView.getRenderView());
    }

    public static void d(OneVideoPlayerView oneVideoPlayerView, final Bitmap bitmap, final ma maVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        Surface surface = oneVideoPlayerView.getSurfaceHolder().b;
        if (surface == null) {
            handler.post(new a72(maVar, 15));
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(oneVideoPlayerView.getWidth(), oneVideoPlayerView.getHeight(), Bitmap.Config.ARGB_8888);
        }
        PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: xsna.xm80
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                int i2 = OneVideoPlayerView.j;
                ma maVar2 = ma.this;
                if (i == 0) {
                    maVar2.invoke(bitmap);
                } else {
                    maVar2.invoke(null);
                }
            }
        }, handler);
    }

    private final View getRenderView() {
        return (View) this.c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h1u0 getSurfaceHolder() {
        return (h1u0) this.e.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"NewApi"})
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas beginRecording;
        avt0 avt0Var = this.i;
        if (avt0Var == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (!canvas.isHardwareAccelerated()) {
            super.dispatchDraw(canvas);
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        RenderNode renderNode = avt0Var.a.a;
        renderNode.setPosition(0, 0, width, height);
        beginRecording = renderNode.beginRecording();
        try {
            super.dispatchDraw(beginRecording);
            s3q0 s3q0Var2 = s3q0.a;
        } finally {
            renderNode.endRecording();
            canvas.drawRenderNode(renderNode);
        }
    }

    public final ach0 getKeepAwakeManager() {
        return this.h;
    }

    public OneVideoPlayer getPlayer() {
        return this.f;
    }

    public RenderType getRenderType() {
        return this.b;
    }

    public final Rect getTextureRect() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, getWidth() + i, getHeight() + i2);
    }

    public final l1u0 getTransformConsumer() {
        return (l1u0) this.d.getValue();
    }

    public final avt0 getViewDrawCacher() {
        return this.i;
    }

    public final void setKeepAwakeManager(ach0 ach0Var) {
        ach0 ach0Var2 = this.h;
        boolean z = false;
        if (ach0Var2 != null && ach0Var2.a(this)) {
            z = true;
        }
        ach0 ach0Var3 = this.h;
        if (ach0Var3 != null) {
            ach0Var3.b(this);
        }
        this.h = ach0Var;
        if (!z || ach0Var == null) {
            return;
        }
        ach0Var.c(this);
    }

    public void setPlayer(OneVideoPlayer oneVideoPlayer) {
        c E;
        cms0 cms0Var;
        Size c;
        Consumer<Size> consumer;
        OneVideoPlayer oneVideoPlayer2 = this.f;
        if (oneVideoPlayer2 == oneVideoPlayer) {
            return;
        }
        b bVar = this.g;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(bVar);
        }
        OneVideoPlayer oneVideoPlayer3 = this.f;
        if (oneVideoPlayer3 != null) {
            oneVideoPlayer3.j0(null);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(bVar);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.j0(getSurfaceHolder());
        }
        if (oneVideoPlayer != null && (E = oneVideoPlayer.E()) != null && (cms0Var = (cms0) E.c) != null && (c = cms0Var.c()) != null && (consumer = getSurfaceHolder().a) != null) {
            consumer.accept(c);
        }
        getRenderView().setVisibility(oneVideoPlayer == null ? 8 : 0);
        this.f = oneVideoPlayer;
    }

    public final void setViewDrawCacher(avt0 avt0Var) {
        if (epx.f(this.i, avt0Var)) {
            return;
        }
        this.i = avt0Var;
        invalidate();
    }

    public OneVideoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public OneVideoPlayerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ OneVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public OneVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = RenderType.TEXTURE;
        this.c = new bpn0(new u14(16, this, context));
        this.d = new bpn0(new wm80(this, 0));
        this.e = new bpn0(new c950(this, 9));
        setBackgroundColor(-16777216);
        this.g = new b();
    }
}
