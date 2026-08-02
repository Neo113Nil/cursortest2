package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.core.exceptions.FileFormatException;
import com.vk.dto.common.ImageSizeKey;
import com.vk.im.converters.ImJpegConverter;
import xsna.kjw;

/* compiled from: ImPhotoConverter.kt */
@SuppressLint({"MissingPermission"})
/* loaded from: classes2.dex */
public final class faw extends ImJpegConverter {
    public final gzs<Boolean> c;
    public final b d;

    /* compiled from: ImPhotoConverter.kt */
    public static final class a implements b {
        @Override // xsna.faw.b
        public final int L0() {
            return ImageSizeKey.SIZE_W_2560.getWidth();
        }

        @Override // xsna.faw.b
        public final boolean a() {
            return true;
        }

        @Override // xsna.faw.b
        public final int getMaxWidth() {
            return ImageSizeKey.SIZE_W_2560.getWidth();
        }
    }

    /* compiled from: ImPhotoConverter.kt */
    public interface b {
        int L0();

        default boolean a() {
            return true;
        }

        int getMaxWidth();
    }

    public faw(sim simVar) {
        this(simVar, new a());
    }

    @Override // com.vk.im.converters.ImJpegConverter, xsna.f8r
    public final boolean b(Context context, Uri uri) {
        if (kjw.i(context, uri)) {
            try {
                kjw.a g = kjw.g(context, uri, false);
                if ((!this.c.invoke().booleanValue() || !d(g)) && g.a <= 8192 && g.b <= 8192) {
                    return false;
                }
            } catch (FileFormatException unused) {
            }
        }
        return true;
    }

    @Override // com.vk.im.converters.ImJpegConverter
    public final Bitmap c(Context context, Uri uri) {
        kjw.a g = kjw.g(context, uri, false);
        int i = g.b;
        int i2 = g.a;
        if (this.c.invoke().booleanValue() && d(g)) {
            b bVar = this.d;
            return kjw.c(context, uri, bVar.getMaxWidth(), bVar.L0(), bVar.a());
        }
        if (i2 <= 8192 && i <= 8192) {
            return kjw.b(context, uri);
        }
        float f = 8192;
        float f2 = i2;
        float f3 = i;
        float min = Math.min(f / f2, f / f3);
        return kjw.c(context, uri, (int) (f2 * min), (int) (f3 * min), true);
    }

    public final boolean d(kjw.a aVar) {
        int i = aVar.a;
        int i2 = aVar.b;
        boolean z = i >= i2;
        b bVar = this.d;
        return (z && i > bVar.getMaxWidth()) || (!z && i2 > bVar.L0());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public faw(gzs<Boolean> gzsVar, b bVar) {
        super(r6m.h(1) ? 95 : 86);
        r6m.a.getClass();
        this.c = gzsVar;
        this.d = bVar;
    }
}
