package com.yandex.passport.internal.ui.bouncer.roundabout.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.yandex.passport.R;
import com.yandex.passport.common.resources.DrawableResource;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.g;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.m;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.o;
import com.yandex.passport.internal.ui.bouncer.roundabout.w;
import defpackage.jl40;
import defpackage.pw01;
import defpackage.uc20;
import defpackage.w511;
import defpackage.wis0;
import defpackage.xuj0;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes15.dex */
public final class b implements pw01 {
    public final Context a;
    public final o b;
    public final int c = ((int) (24.0f * uc20.a.density)) / 2;
    public final int d = w.b;
    public final String e;

    public b(Context context, o oVar) {
        this.a = context;
        this.b = oVar;
        this.e = b.class.getName() + LicenseUtility.SEPARATOR + oVar;
    }

    @Override // defpackage.pw01
    public final String a() {
        return this.e;
    }

    @Override // defpackage.pw01
    public final Bitmap b(Bitmap bitmap, wis0 wis0Var) {
        DrawableResource drawableResource;
        Integer valueOf;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = this.d;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (i - bitmap.getWidth()) / 2.0f, (i - bitmap.getHeight()) / 2.0f, new Paint(3));
        o oVar = this.b;
        if (oVar instanceof g) {
            drawableResource = DrawableResource.m264boximpl(DrawableResource.m265constructorimpl(R.drawable.passport_roundabout_child));
        } else {
            if (oVar instanceof m) {
                switch (a.a[((m) oVar).a.ordinal()]) {
                    case 1:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_fb);
                        break;
                    case 2:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_google);
                        break;
                    case 3:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_mail);
                        break;
                    case 4:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_ok);
                        break;
                    case 5:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_twitter);
                        break;
                    case 6:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_vk);
                        break;
                    case 7:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_esia);
                        break;
                    case 8:
                        valueOf = null;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                if (valueOf != null) {
                    drawableResource = DrawableResource.m264boximpl(DrawableResource.m265constructorimpl(valueOf.intValue()));
                }
            }
            drawableResource = null;
        }
        Context context = this.a;
        Drawable m267drawableForContextimpl = drawableResource != null ? DrawableResource.m267drawableForContextimpl(drawableResource.m274unboximpl(), context) : null;
        if (m267drawableForContextimpl != null) {
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            int i2 = R.color.passport_roundabout_background;
            TypedValue typedValue = xuj0.a;
            paint.setColor(context.getColor(i2));
            int i3 = this.c;
            int i4 = i - i3;
            float f = i4;
            canvas.drawCircle(f, f, i3, paint);
            int intrinsicWidth = m267drawableForContextimpl.getIntrinsicWidth() / 2;
            int intrinsicHeight = m267drawableForContextimpl.getIntrinsicHeight() / 2;
            m267drawableForContextimpl.setBounds(new Rect(i4 - intrinsicWidth, i4 - intrinsicHeight, intrinsicWidth + i4, i4 + intrinsicHeight));
            m267drawableForContextimpl.draw(canvas);
        }
        return createBitmap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return jl40.l(this.b, ((b) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return b.class.hashCode();
    }
}
