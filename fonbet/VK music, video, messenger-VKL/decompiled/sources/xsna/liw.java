package xsna;

import android.graphics.Bitmap;
import xsna.cq70;

/* compiled from: ImageDecodeOptions.java */
/* loaded from: classes12.dex */
public class liw {
    public static final liw d = new liw(a());
    public final boolean a;
    public final Bitmap.Config b;
    public final Bitmap.Config c;

    public liw(miw miwVar) {
        this.a = miwVar.a;
        this.b = miwVar.b;
        this.c = miwVar.c;
    }

    public static miw a() {
        miw miwVar = new miw();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        miwVar.b = config;
        miwVar.c = config;
        return miwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        liw liwVar = (liw) obj;
        return this.a == liwVar.a && this.b == liwVar.b && this.c == liwVar.c;
    }

    public final int hashCode() {
        int ordinal = (this.b.ordinal() + ((674909381 + (this.a ? 1 : 0)) * 31)) * 31;
        Bitmap.Config config = this.c;
        return (ordinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        cq70.a b = cq70.b(this);
        b.a(100, "minDecodeIntervalMs");
        b.a(Integer.MAX_VALUE, "maxDimensionPx");
        b.c("decodePreviewFrame", false);
        b.c("useLastFrameForPreview", false);
        b.c("useEncodedImageForPreview", false);
        b.c("decodeAllFrames", false);
        b.c("forceStaticImage", this.a);
        b.d(this.b.name(), "bitmapConfigName");
        b.d(this.c.name(), "animatedBitmapConfigName");
        b.d(null, "customImageDecoder");
        b.d(null, "bitmapTransformation");
        b.d(null, "colorSpace");
        return i5s.a(sb, b.toString(), "}");
    }
}
