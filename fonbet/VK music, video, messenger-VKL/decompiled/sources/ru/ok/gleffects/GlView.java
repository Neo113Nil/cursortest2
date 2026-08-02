package ru.ok.gleffects;

import android.content.Context;
import androidx.annotation.NonNull;
import javax.microedition.khronos.egl.EGLConfig;

/* loaded from: classes11.dex */
public interface GlView {
    @NonNull
    Context getContext();

    @NonNull
    EGLConfig getEglConfig();

    int getHeight();

    int getWidth();

    void queueEvent(@NonNull Runnable runnable);
}
