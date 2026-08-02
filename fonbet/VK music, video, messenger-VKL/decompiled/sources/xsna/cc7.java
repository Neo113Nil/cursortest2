package xsna;

import android.content.Context;
import android.graphics.Point;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: BitmapFactoryImageDecoder.java */
/* loaded from: classes12.dex */
public final class cc7 extends eqj0<DecoderInputBuffer, mkw, ImageDecoderException> {

    @Nullable
    public final Context n;
    public final int o;

    /* compiled from: BitmapFactoryImageDecoder.java */
    public static final class a {

        @Nullable
        public final Context a;

        public a(Context context) {
            context.getClass();
            this.a = context;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
        
            if (android.os.Build.VERSION.SDK_INT >= 34) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int a(androidx.media3.common.a aVar) {
            String str = aVar.n;
            if (str == null || !io20.n(str)) {
                return androidx.media3.exoplayer.k.f(0, 0, 0, 0);
            }
            String str2 = aVar.n;
            str2.getClass();
            switch (str2) {
                case "image/heic":
                case "image/heif":
                case "image/jpeg":
                case "image/webp":
                case "image/bmp":
                case "image/png":
                    return androidx.media3.exoplayer.k.f(4, 0, 0, 0);
            }
            return androidx.media3.exoplayer.k.f(1, 0, 0, 0);
        }
    }

    public cc7(Context context) {
        super(new DecoderInputBuffer[1], new mkw[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // xsna.eqj0
    public final DecoderInputBuffer c() {
        return new DecoderInputBuffer(1);
    }

    @Override // xsna.eqj0
    public final mkw d() {
        return new bc7(this);
    }

    @Override // xsna.eqj0
    public final ImageDecoderException e(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // xsna.eqj0
    @Nullable
    public final ImageDecoderException f(DecoderInputBuffer decoderInputBuffer, mkw mkwVar, boolean z) {
        mkw mkwVar2 = mkwVar;
        ByteBuffer byteBuffer = decoderInputBuffer.e;
        byteBuffer.getClass();
        fxc0.z(byteBuffer.hasArray());
        fxc0.p(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.o;
            if (i == -1) {
                Context context = this.n;
                if (context != null) {
                    Point z2 = y2r0.z(context);
                    int i2 = z2.x;
                    int i3 = z2.y;
                    androidx.media3.common.a aVar = decoderInputBuffer.c;
                    if (aVar != null) {
                        int i4 = aVar.M;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = aVar.N;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            mkwVar2.e = jd7.a(byteBuffer.array(), byteBuffer.remaining(), i, null);
            mkwVar2.c = decoderInputBuffer.g;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
