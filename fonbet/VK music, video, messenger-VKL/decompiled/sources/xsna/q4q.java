package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import xsna.du8;

/* compiled from: ExifInterfaceImageHeaderParser.java */
/* loaded from: classes12.dex */
public final class q4q implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(@NonNull InputStream inputStream, @NonNull cl3 cl3Var) throws IOException {
        int d = new p4q(inputStream).d(1, "Orientation");
        if (d == 0) {
            return -1;
        }
        return d;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int b(@NonNull ByteBuffer byteBuffer, @NonNull cl3 cl3Var) throws IOException {
        AtomicReference<byte[]> atomicReference = du8.a;
        return a(new du8.a(byteBuffer), cl3Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType c(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public final ImageHeaderParser.ImageType d(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
