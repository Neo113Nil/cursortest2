package xsna;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* compiled from: DefaultOnHeaderDecodedListener.java */
/* loaded from: classes12.dex */
public final class tjl implements ImageDecoder.OnHeaderDecodedListener {
    public final auu a = auu.a();
    public final int b;
    public final int c;
    public final DecodeFormat d;
    public final DownsampleStrategy e;
    public final boolean f;
    public final PreferredColorSpace g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    public class a implements ImageDecoder.OnPartialImageListener {
        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public tjl(int i, int i2, @NonNull au80 au80Var) {
        this.b = i;
        this.c = i2;
        this.d = (DecodeFormat) au80Var.c(com.bumptech.glide.load.resource.bitmap.a.f);
        this.e = (DownsampleStrategy) au80Var.c(DownsampleStrategy.d);
        ht80<Boolean> ht80Var = com.bumptech.glide.load.resource.bitmap.a.i;
        this.f = au80Var.c(ht80Var) != null && ((Boolean) au80Var.c(ht80Var)).booleanValue();
        this.g = (PreferredColorSpace) au80Var.c(com.bumptech.glide.load.resource.bitmap.a.g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        auu auuVar = this.a;
        int i = this.b;
        int i2 = this.c;
        if (auuVar.c(i, i2, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(b * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.g;
        if (preferredColorSpace != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
