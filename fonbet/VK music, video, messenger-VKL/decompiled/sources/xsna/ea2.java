package xsna;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import xsna.hlw;

/* compiled from: AndroidImageReaderProxy.java */
/* loaded from: classes11.dex */
public final class ea2 implements hlw {
    public final ImageReader a;

    public ea2(ImageReader imageReader) {
        this.a = imageReader;
    }

    @Override // xsna.hlw
    public final synchronized void a(@NonNull final hlw.a aVar, @NonNull final Executor executor) {
        this.a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: xsna.da2
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                executor.execute(new i(2, ea2.this, aVar));
            }
        }, dg00.a());
    }

    @Override // xsna.hlw
    @Nullable
    public final synchronized alw b() {
        Image image;
        try {
            image = this.a.acquireNextImage();
        } catch (RuntimeException e) {
            if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                throw e;
            }
            image = null;
        }
        if (image == null) {
            return null;
        }
        return new ca2(image);
    }

    @Override // xsna.hlw
    @Nullable
    public final synchronized alw c() {
        Image image;
        try {
            image = this.a.acquireLatestImage();
        } catch (RuntimeException e) {
            if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                throw e;
            }
            image = null;
        }
        if (image == null) {
            return null;
        }
        return new ca2(image);
    }

    @Override // xsna.hlw
    public final synchronized void close() {
        this.a.close();
    }

    @Override // xsna.hlw
    public final synchronized void d() {
        this.a.setOnImageAvailableListener(null, null);
    }

    @Override // xsna.hlw
    public final synchronized int e() {
        return this.a.getMaxImages();
    }

    @Override // xsna.hlw
    @Nullable
    public final synchronized Surface getSurface() {
        return this.a.getSurface();
    }
}
