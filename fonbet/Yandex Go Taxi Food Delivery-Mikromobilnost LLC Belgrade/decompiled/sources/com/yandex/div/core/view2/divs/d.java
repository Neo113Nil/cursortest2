package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.view.View;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div2.DivImageScale;
import defpackage.ffx;
import defpackage.osk;
import defpackage.p7b1;
import defpackage.rfk;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes11.dex */
public final class d extends osk {
    public final /* synthetic */ Div2View c;
    public final /* synthetic */ rfk d;
    public final /* synthetic */ ScalingDrawable e;
    public final /* synthetic */ View f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Div2View div2View, rfk rfkVar, ScalingDrawable scalingDrawable, View view, float f) {
        super(div2View);
        this.c = div2View;
        this.d = rfkVar;
        this.e = scalingDrawable;
        this.f = view;
        this.g = f;
    }

    @Override // defpackage.k25
    public final void i(final Bitmap bitmap, BitmapSource bitmapSource) {
        rfk rfkVar = this.d;
        List list = rfkVar.g;
        final ScalingDrawable scalingDrawable = this.e;
        if (list == null || list.isEmpty()) {
            scalingDrawable.setBitmap(bitmap);
            return;
        }
        DivImageScale divImageScale = rfkVar.f;
        List list2 = rfkVar.g;
        final float f = this.g;
        p7b1.c(bitmap, divImageScale, this.f, this.c, list2, new tls() { // from class: com.yandex.div.core.view2.divs.DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ScalingDrawable.this.setAdditionalScale((bitmap.getWidth() * f) / r4.getWidth());
                ScalingDrawable.this.setBitmap((Bitmap) obj);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.k25
    public final void j(Drawable drawable, BitmapSource bitmapSource) {
        this.e.setDrawable(drawable);
    }

    @Override // defpackage.k25
    public final void k(PictureDrawable pictureDrawable, BitmapSource bitmapSource) {
        List list;
        rfk rfkVar = this.d;
        if (rfkVar.a == 1.0d && ((list = rfkVar.g) == null || list.isEmpty())) {
            this.e.setPicture(pictureDrawable.getPicture());
        } else {
            i(ffx.d0(pictureDrawable, 0, 0, 7), bitmapSource);
        }
    }
}
