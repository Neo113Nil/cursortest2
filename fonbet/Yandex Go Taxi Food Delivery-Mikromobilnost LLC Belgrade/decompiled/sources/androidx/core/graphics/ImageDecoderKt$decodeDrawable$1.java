package androidx.core.graphics;

import android.graphics.ImageDecoder;
import defpackage.zls;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes10.dex */
public final class ImageDecoderKt$decodeDrawable$1 implements ImageDecoder.OnHeaderDecodedListener {
    final /* synthetic */ zls $action;

    public ImageDecoderKt$decodeDrawable$1(zls zlsVar) {
        this.$action = zlsVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        this.$action.invoke(imageDecoder, imageInfo, source);
    }
}
