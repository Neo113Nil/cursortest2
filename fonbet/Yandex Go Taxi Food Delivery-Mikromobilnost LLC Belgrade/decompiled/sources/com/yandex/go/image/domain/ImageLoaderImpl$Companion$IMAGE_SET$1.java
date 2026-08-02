package com.yandex.go.image.domain;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ImageLoaderImpl$Companion$IMAGE_SET$1 extends FunctionReferenceImpl implements wls {
    public static final ImageLoaderImpl$Companion$IMAGE_SET$1 b = new ImageLoaderImpl$Companion$IMAGE_SET$1(2, 0, ImageView.class, "setImageDrawable", "setImageDrawable(Landroid/graphics/drawable/Drawable;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((ImageView) obj).setImageDrawable((Drawable) obj2);
        return zy11.a;
    }
}
