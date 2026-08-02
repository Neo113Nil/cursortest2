package ru.ok.call_effects;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import java.io.File;
import ru.ok.call_effects.internal.GlViewImpl;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.o7j;
import xsna.rr2;
import xsna.zcl;

/* compiled from: AnimojiEffect.kt */
/* loaded from: classes9.dex */
public final class AnimojiEffect {
    public static final Companion Companion = new Companion(null);
    private static final int FRAME_H = 1024;
    private static final int FRAME_W = 1024;
    private int bgColor = -1;
    private final Context context;
    private EffectHolder effectHolder;
    private GlViewImpl glView;
    private boolean landmarksSet;
    private float[] lastLandmarks;
    private volatile FrameBuffer outBuffer;
    private boolean released;
    private String resourcePackPath;
    private byte[] svg;
    private boolean svgPathSet;

    /* compiled from: AnimojiEffect.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bitmap softwareRasterizeSvg(String str, int i, int i2) {
            return EffectNativeSink.softwareRasterizeSvg(str, i, i2);
        }

        public final EffectNativeSink.SVGErrorInfo validateSvg(String str) {
            return EffectNativeSink.validateSvg(str);
        }

        private Companion() {
        }
    }

    public AnimojiEffect(Context context) {
        this.context = context;
    }

    private final void maybeRecreateBufferForSize(int i, int i2) {
        EffectHolder effectHolder;
        FrameBuffer frameBuffer;
        FrameBuffer frameBuffer2 = this.outBuffer;
        if (frameBuffer2 == null || frameBuffer2.getWidth() != i || (frameBuffer = this.outBuffer) == null || frameBuffer.getHeight() != i2) {
            FrameBuffer frameBuffer3 = this.outBuffer;
            if (frameBuffer3 != null) {
                frameBuffer3.release();
            }
            this.outBuffer = new FrameBuffer(i, i2);
            GlViewImpl glViewImpl = this.glView;
            if (glViewImpl != null) {
                glViewImpl.setSize(new Size(i, i2));
            }
            EffectHolder effectHolder2 = this.effectHolder;
            if (effectHolder2 != null) {
                effectHolder2.selectEffectSync(null, null);
            }
            EffectRegistry.EffectId effectId = EffectRegistry.EffectId.SVG_RENDERER_NEW;
            EffectHolder effectHolder3 = this.effectHolder;
            if (effectHolder3 != null) {
                effectHolder3.selectEffectSync(effectId, new rr2(effectId, this));
            }
            byte[] bArr = this.svg;
            if (bArr != null && (effectHolder = this.effectHolder) != null) {
                effectHolder.setVmojiSvg(bArr, this.bgColor);
            }
            maybeRedeliverLastLandmarks();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeRecreateBufferForSize$lambda-0, reason: not valid java name */
    public static final void m391maybeRecreateBufferForSize$lambda0(EffectRegistry.EffectId effectId, AnimojiEffect animojiEffect, EffectRegistry.EffectId effectId2, o7j o7jVar) {
        if (effectId2 == effectId) {
            o7jVar.accept(new File(animojiEffect.resourcePackPath));
        }
    }

    private final void maybeRedeliverLastLandmarks() {
        float[] fArr = this.lastLandmarks;
        if (fArr == null) {
            this.landmarksSet = false;
            return;
        }
        EffectHolder effectHolder = this.effectHolder;
        if (effectHolder != null) {
            effectHolder.setVmojiLandmarks(fArr);
        }
        this.landmarksSet = true;
    }

    public static final Bitmap softwareRasterizeSvg(String str, int i, int i2) {
        return Companion.softwareRasterizeSvg(str, i, i2);
    }

    public static final EffectNativeSink.SVGErrorInfo validateSvg(String str) {
        return Companion.validateSvg(str);
    }

    public final Context getContext() {
        return this.context;
    }

    public final void init(Handler handler, String str) {
        GlViewImpl glViewImpl = new GlViewImpl(this.context, handler, null, 4, null);
        glViewImpl.setSize(new Size(1024, 1024));
        this.glView = glViewImpl;
        this.effectHolder = new EffectHolder(glViewImpl, new ExtraAudioSupplier(this.context), new ExtraVideoSupplier(this.context, null));
        this.resourcePackPath = str;
    }

    public final int outHeight() {
        FrameBuffer frameBuffer = this.outBuffer;
        if (frameBuffer != null) {
            return frameBuffer.getHeight();
        }
        return 0;
    }

    public final Integer outTextureId() {
        FrameBuffer frameBuffer;
        if (this.landmarksSet && this.svgPathSet && (frameBuffer = this.outBuffer) != null) {
            return Integer.valueOf(frameBuffer.getTextureId());
        }
        return null;
    }

    public final int outWidth() {
        FrameBuffer frameBuffer = this.outBuffer;
        if (frameBuffer != null) {
            return frameBuffer.getWidth();
        }
        return 0;
    }

    public final void release() {
        EffectHolder effectHolder = this.effectHolder;
        if (effectHolder != null) {
            effectHolder.selectEffectSync(null, null);
        }
        this.effectHolder = null;
        this.glView = null;
        FrameBuffer frameBuffer = this.outBuffer;
        if (frameBuffer != null) {
            frameBuffer.release();
        }
        this.outBuffer = null;
    }

    public final void render(int i, int i2) {
        EffectHolder effectHolder;
        if (this.landmarksSet && this.svgPathSet) {
            maybeRecreateBufferForSize(i, i2);
            FrameBuffer frameBuffer = this.outBuffer;
            if (frameBuffer == null || (effectHolder = this.effectHolder) == null) {
                return;
            }
            effectHolder.render(frameBuffer.getTextureId(), i, i2, i, i2, false, false);
        }
    }

    public final void setBgColor(int i) {
        EffectHolder effectHolder = this.effectHolder;
        if (effectHolder != null) {
            effectHolder.setVmojiBgColor(i);
        }
        this.bgColor = i;
    }

    public final void setLandmarks(float[] fArr) {
        this.landmarksSet = true;
        this.lastLandmarks = fArr;
        EffectHolder effectHolder = this.effectHolder;
        if (effectHolder != null) {
            effectHolder.setVmojiLandmarks(fArr);
        }
    }

    public final void setSvg(byte[] bArr, int i) {
        this.svgPathSet = true;
        EffectHolder effectHolder = this.effectHolder;
        if (effectHolder != null) {
            effectHolder.setVmojiSvg(bArr, i);
        }
        maybeRedeliverLastLandmarks();
        this.svg = bArr;
        this.bgColor = i;
    }
}
