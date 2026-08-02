package com.yandex.go.places.impl.ui.common.map.location;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import defpackage.dug0;
import defpackage.mdh;
import defpackage.pav;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.am.g;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final pav b;
    public final tt2 c;
    public final g d;
    public final int e;
    public final int f;

    public a(Context context, pav pavVar, tt2 tt2Var, g gVar) {
        this.a = context;
        this.b = pavVar;
        this.c = tt2Var;
        this.d = gVar;
        this.e = tje.r(dug0.discovery_user_location_avatar_size, context);
        this.f = tje.r(dug0.discovery_user_location_avatar_extended_size, context);
    }

    public static final Bitmap a(a aVar, Bitmap bitmap, int i) {
        int i2 = aVar.f;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float width = (i2 - bitmap.getWidth()) / 2.0f;
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        float f = i2 / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        Paint paint2 = new Paint(1);
        Path path = new Path();
        path.addCircle(f, f, bitmap.getWidth() / 2.0f, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            canvas.drawBitmap(bitmap, width, width, paint2);
            return createBitmap;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final Object b(Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PlacesUserAvatarProviderImpl$loadUserAvatar$2(this, null), continuation);
    }
}
