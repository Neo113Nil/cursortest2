package ru.ok.call_effects.internal;

import android.content.Context;
import android.os.Handler;
import android.util.Size;
import ru.ok.call_effects.CallEffects;
import ru.ok.call_effects.Configuration;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import xsna.epx;

/* compiled from: BeautyFilterEffect.kt */
/* loaded from: classes9.dex */
public final class BeautyFilterEffect {
    private CallEffects.BeautyFilter beautyFilter;
    private final Configuration configuration;
    private final EffectHolder effectHolder;
    private final GlViewImpl glView;
    private boolean isReleased;

    public BeautyFilterEffect(Context context, Handler handler, Configuration configuration) {
        this.configuration = configuration;
        GlViewImpl glViewImpl = new GlViewImpl(context, handler, null, 4, null);
        this.glView = glViewImpl;
        this.effectHolder = new EffectHolder(glViewImpl, new ExtraAudioSupplier(context), new ExtraVideoSupplier(context, null));
    }

    private final void enable(CallEffects.BeautyFilter beautyFilter) {
        this.effectHolder.selectEffect(EffectRegistry.EffectId.BEAUTY_ROMA, null);
        this.effectHolder.setBeautyEPS(getBeautyEpsFromIntensity(beautyFilter.getIntensity()));
    }

    private final int getBeautyEpsFromIntensity(float f) {
        if (f <= 0.3f) {
            return 50;
        }
        return f <= 0.7f ? 100 : 250;
    }

    public final void disable() {
        if (this.isReleased) {
            return;
        }
        this.effectHolder.selectEffect(null, null);
        this.beautyFilter = null;
    }

    public final boolean isEnabled() {
        return this.beautyFilter != null;
    }

    public final void release() {
        if (this.isReleased) {
            return;
        }
        this.effectHolder.releaseFromGl();
        this.isReleased = true;
    }

    public final void render(FrameBuffer frameBuffer, boolean z, boolean z2) {
        if (this.isReleased) {
            return;
        }
        this.effectHolder.render(frameBuffer.getTextureId(), frameBuffer.getWidth(), frameBuffer.getHeight(), frameBuffer.getWidth(), frameBuffer.getHeight(), z, z2);
    }

    public final boolean trySetEnabled(CallEffects.BeautyFilter beautyFilter, Size size) {
        if (this.isReleased) {
            return false;
        }
        if (epx.f(beautyFilter, this.beautyFilter) && epx.f(this.glView.getSize(), size)) {
            return true;
        }
        boolean f = epx.f(this.glView.getSize(), size);
        this.glView.setSize(size);
        if (beautyFilter != null) {
            if (!f) {
                this.effectHolder.selectEffect(null, null);
            }
            enable(beautyFilter);
        } else {
            disable();
        }
        this.beautyFilter = beautyFilter;
        return true;
    }
}
