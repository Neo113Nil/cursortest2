package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes7.dex */
public final class pm81 implements jv81 {
    @Override // defpackage.jv81
    public final Drawable a(Context context, byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return new BitmapDrawable(context.getResources(), decodeByteArray);
        }
        ny61.g("Cannot decode bitmap from data");
        return null;
    }
}
