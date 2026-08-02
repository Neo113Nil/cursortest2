package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;

/* loaded from: classes10.dex */
public final class kkp implements AutoCloseable {
    public final OutputConfiguration a;
    public final ImageReader b;

    public kkp(OutputConfiguration outputConfiguration, ImageReader imageReader) {
        this.a = outputConfiguration;
        this.b = imageReader;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ImageReader imageReader = this.b;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkp)) {
            return false;
        }
        kkp kkpVar = (kkp) obj;
        return this.a.equals(kkpVar.a) && jl40.l(this.b, kkpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ImageReader imageReader = this.b;
        return hashCode + (imageReader == null ? 0 : imageReader.hashCode());
    }

    public final String toString() {
        return "CloseableOutputConfiguration(value=" + this.a + ", backingImageReader=" + this.b + ')';
    }
}
