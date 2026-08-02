package ru.ok.gleffects.impl;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.ok.gleffects.EffectAudioController;
import ru.ok.gleffects.EffectListener;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.EffectResourceProvider;
import ru.ok.gleffects.EffectVideoController;
import ru.ok.gleffects.impl.EffectNativeSink;

/* loaded from: classes9.dex */
public final class EffectFactory {
    private final Context context;
    private Typeface defaultTypeface;
    private final EffectRegistry registry;

    public EffectFactory(@NonNull Context context, @NonNull EffectRegistry effectRegistry) {
        this.context = context;
        this.registry = effectRegistry;
    }

    @NonNull
    public EffectNativeSink createEffect(@NonNull EffectRegistry.EffectId effectId, int i, int i2, @NonNull EffectAudioController effectAudioController, @NonNull EffectVideoController effectVideoController, @NonNull EffectListener effectListener, @Nullable EffectResourceProvider effectResourceProvider) {
        Long effectHandle = this.registry.getEffectHandle(effectId);
        if (effectHandle != null) {
            return new EffectNativeSink.Builder(effectId, effectHandle.longValue()).setAudioController(effectAudioController).setVideoController(effectVideoController).setDefaultTypeface(this.defaultTypeface).setResourceProvider(effectResourceProvider).setListener(effectListener).setSize(i, i2).build();
        }
        throw new IllegalArgumentException("Effect " + effectId + " not found.\nWas released: " + this.registry.wasReleased + "\nHandles: " + this.registry.getHandlesMap() + "\n");
    }

    public void setDefaultTypeface(Typeface typeface) {
        this.defaultTypeface = typeface;
    }
}
