package yads;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class pz0 implements zj0 {
    @Override // yads.zj0
    public final Drawable a(byte[] bArr, Context context) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(ByteBuffer.wrap(bArr)));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            ((AnimatedImageDrawable) decodeDrawable).start();
        }
        return decodeDrawable;
    }
}
