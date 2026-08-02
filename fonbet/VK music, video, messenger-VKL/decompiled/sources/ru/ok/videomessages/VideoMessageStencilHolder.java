package ru.ok.videomessages;

import android.graphics.Bitmap;
import android.util.Log;
import ru.ok.gleffects.util.TextureHelper;
import ru.ok.videomessages.exceptions.SOLibLoadException;

/* loaded from: classes9.dex */
public class VideoMessageStencilHolder implements IVideoMessageStencilHolder {
    private final String TAG = "VideoMessageStencilHolder";
    private boolean isRecording;
    private final long nativeInstance;

    static {
        VMLibraryLoader.loadLibrary("VideoMessageStencilHolder failed to load .so lib");
    }

    public VideoMessageStencilHolder(int i, int i2) {
        if (!VMLibraryLoader.isLoaded()) {
            throw new SOLibLoadException("VideoMessageStencilHolder failed to init", VMLibraryLoader.getLoadError());
        }
        long createNativeInstance = createNativeInstance(i, i2);
        this.nativeInstance = createNativeInstance;
        updateTextures(createNativeInstance);
    }

    private static native long createNativeInstance(int i, int i2);

    private static native void handleTextureId(long j, int i, int i2, int i3);

    private static native void onStartRecording(long j);

    private static native void onStopRecording(long j);

    private static native void release(long j);

    private static native void render(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private static native void updateTextures(long j);

    @Override // ru.ok.videomessages.IVideoMessageStencilHolder
    public boolean notifyRecording(boolean z) {
        if (this.isRecording == z) {
            return false;
        }
        this.isRecording = z;
        if (z) {
            onStartRecording(this.nativeInstance);
            return true;
        }
        onStopRecording(this.nativeInstance);
        return true;
    }

    @Override // ru.ok.videomessages.IVideoMessageStencilHolder
    public void release() {
        release(this.nativeInstance);
    }

    @Override // ru.ok.videomessages.IVideoMessageStencilHolder
    public void render(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        render(this.nativeInstance, i, i2, i3, i4, i5, z, z2);
    }

    @Override // ru.ok.videomessages.IVideoMessageStencilHolder
    public void setStencilBitmap(Bitmap bitmap, boolean z) {
        int width;
        int height;
        if (bitmap.isRecycled()) {
            Log.e("VideoMessageStencilHolder", "tried to push recycled bitmap to optimized video messages effect");
            width = 1;
            height = 1;
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        int[] loadTextureFromBitmap = TextureHelper.loadTextureFromBitmap(bitmap, z);
        handleTextureId(this.nativeInstance, loadTextureFromBitmap[0], width, height);
        TextureHelper.deleteTexture(loadTextureFromBitmap);
    }
}
