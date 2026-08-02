package ru.ok.videomessages;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public interface IVideoMessageStencilHolder {
    boolean notifyRecording(boolean z);

    void release();

    void render(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    void setStencilBitmap(Bitmap bitmap, boolean z);
}
