package ru.ok.call_effects.internal;

import android.content.Context;
import android.os.Handler;
import android.util.Size;
import javax.microedition.khronos.egl.EGLConfig;
import kotlin.KotlinNothingValueException;
import ru.ok.gleffects.GlView;
import xsna.zcl;

/* compiled from: GlViewImpl.kt */
/* loaded from: classes9.dex */
public final class GlViewImpl implements GlView {
    private final Context context;
    private final Handler glThreadHandler;
    private Size size;

    public GlViewImpl(Context context, Handler handler, Size size) {
        this.context = context;
        this.glThreadHandler = handler;
        this.size = size;
    }

    private final Void throwNotInitialized() {
        throw new IllegalStateException("Size is not initialized");
    }

    @Override // ru.ok.gleffects.GlView
    public Context getContext() {
        return this.context;
    }

    @Override // ru.ok.gleffects.GlView
    public EGLConfig getEglConfig() {
        throw new RuntimeException("egl10 context doesn't exist and (wasn't) used");
    }

    @Override // ru.ok.gleffects.GlView
    public int getHeight() {
        Size size = this.size;
        if (size != null) {
            return size.getHeight();
        }
        throwNotInitialized();
        throw new KotlinNothingValueException();
    }

    public final Size getSize() {
        return this.size;
    }

    @Override // ru.ok.gleffects.GlView
    public int getWidth() {
        Size size = this.size;
        if (size != null) {
            return size.getWidth();
        }
        throwNotInitialized();
        throw new KotlinNothingValueException();
    }

    @Override // ru.ok.gleffects.GlView
    public void queueEvent(Runnable runnable) {
        this.glThreadHandler.post(runnable);
    }

    public final void setSize(Size size) {
        this.size = size;
    }

    public /* synthetic */ GlViewImpl(Context context, Handler handler, Size size, int i, zcl zclVar) {
        this(context, handler, (i & 4) != 0 ? null : size);
    }
}
