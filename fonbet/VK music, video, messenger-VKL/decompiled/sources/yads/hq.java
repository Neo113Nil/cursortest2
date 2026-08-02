package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class hq implements zj0 {
    @Override // yads.zj0
    public final Drawable a(byte[] bArr, Context context) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return new BitmapDrawable(context.getResources(), decodeByteArray);
        }
        throw new IllegalArgumentException("Cannot decode bitmap from data");
    }
}
