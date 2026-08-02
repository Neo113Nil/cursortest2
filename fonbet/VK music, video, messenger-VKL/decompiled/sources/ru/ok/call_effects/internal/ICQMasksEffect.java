package ru.ok.call_effects.internal;

import android.content.Context;
import android.os.Handler;
import android.util.Size;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import ru.ok.call_effects.CallEffects;
import ru.ok.face.entity.FaceFigure;
import ru.ok.gl.effects.media.controller.audio.ExtraAudioSupplier;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;
import ru.ok.gl.objects.FrameBuffer;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.util.AsyncEffectResourceProvider;
import xsna.epx;

/* compiled from: ICQMasksEffect.kt */
/* loaded from: classes9.dex */
public final class ICQMasksEffect {
    private final Context context;
    private CallEffects.Effect effect;
    private final EffectHolder effectHolder;
    private final GlViewImpl glView;
    private boolean isReleased;

    public ICQMasksEffect(Context context, Handler handler) {
        this.context = context;
        GlViewImpl glViewImpl = new GlViewImpl(context, handler, null, 4, null);
        this.glView = glViewImpl;
        this.effectHolder = new EffectHolder(glViewImpl, new ExtraAudioSupplier(context), new ExtraVideoSupplier(context, null));
    }

    public final void handleFaceMeshes(Collection<? extends FaceFigure> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends FaceFigure> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mesh);
        }
        this.effectHolder.handleFaceMeshes(arrayList);
    }

    public final boolean isEnabled() {
        return this.effect != null;
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
        this.effectHolder.render(frameBuffer.getTextureId(), frameBuffer.getWidth(), frameBuffer.getHeight(), frameBuffer.getWidth(), frameBuffer.getHeight(), z2, z);
    }

    public final void setEngineModelPath(String str) {
        this.effectHolder.setMaskEngineAsset(str);
    }

    public final boolean trySelectMask(CallEffects.Effect effect, Size size) {
        if (this.isReleased) {
            return false;
        }
        if (epx.f(this.effect, effect) && epx.f(this.glView.getSize(), size)) {
            return true;
        }
        this.glView.setSize(size);
        this.effectHolder.getEffectRegistry().getEffectHandle(effect.getId());
        this.effectHolder.selectEffect(null, null);
        EffectHolder effectHolder = this.effectHolder;
        EffectRegistry.EffectId id = effect.getId();
        File resourcePack = effect.getResourcePack();
        effectHolder.selectEffect(id, new AsyncEffectResourceProvider(new File(resourcePack != null ? resourcePack.getAbsolutePath() : null)));
        this.effect = effect;
        return true;
    }

    public final void unselectEffect() {
        if (this.isReleased || this.effect == null) {
            return;
        }
        this.effect = null;
        this.effectHolder.selectEffect(null, null);
    }
}
