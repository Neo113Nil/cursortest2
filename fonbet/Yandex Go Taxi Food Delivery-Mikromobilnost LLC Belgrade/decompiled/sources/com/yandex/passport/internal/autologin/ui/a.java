package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.passport.R;
import defpackage.m810;
import defpackage.pw01;
import defpackage.vng;
import defpackage.wis0;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a implements pw01 {
    public final Context a;
    public final int b;
    public final int c;
    public final String d;

    public a(Context context, boolean z) {
        this.a = context;
        boolean z2 = (context.getResources().getConfiguration().uiMode & 48) == 32;
        int i = z ? R.drawable.passport_autologin_id_team : z2 ? R.drawable.passport_autologin_id_dark : R.drawable.passport_autologin_id_light;
        this.b = i;
        this.c = R.color.passport_autologin_notification_background;
        StringBuilder sb = new StringBuilder();
        sb.append(sb.getClass().getName());
        sb.append(Extension.O_BRAKE);
        sb.append("icon=");
        sb.append(i);
        sb.append(",night=");
        this.d = x4e.i(sb, z2, Extension.C_BRAKE);
    }

    @Override // defpackage.pw01
    public final String a() {
        return this.d;
    }

    @Override // defpackage.pw01
    public final Bitmap b(Bitmap bitmap, wis0 wis0Var) {
        Context context = this.a;
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = 20.0f * f;
        float f3 = 14.0f * f;
        float f4 = 8.0f * f;
        float f5 = f * 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float width = (bitmap.getWidth() - f2) + f5;
        float height = (bitmap.getHeight() - f2) + f5;
        Paint paint = new Paint(1);
        paint.setColor(context.getResources().getColor(this.c, null));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(new RectF(width, height, width + f2, height + f2), f4, f4, paint);
        float f6 = (f2 - f3) / 2.0f;
        float f7 = width + f6;
        float f8 = height + f6;
        Drawable t = vng.t(this.b, context);
        if (t != null) {
            t.setBounds(new Rect(m810.b(f7), m810.b(f8), m810.b(f7 + f3), m810.b(f8 + f3)));
            t.draw(canvas);
        }
        return createBitmap;
    }
}
