package com.yandex.mapkit.styling.transportnavigation;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.m810;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"createTransportStop", "Lcom/yandex/runtime/image/ImageProvider;", "color", "", "size", "", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultRouteViewStyleProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageProvider createTransportStop(int i, float f) {
        int max = Math.max(1, m810.b(f));
        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        float f2 = f / 2.0f;
        new Canvas(createBitmap).drawCircle(f2, f2, (f - 1.0f) / 2.0f, paint);
        return ImageProvider.fromBitmap(createBitmap);
    }
}
