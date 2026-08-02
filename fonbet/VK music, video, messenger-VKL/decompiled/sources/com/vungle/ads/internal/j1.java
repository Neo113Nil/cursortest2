package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class j1 extends Lambda implements izs {
    public final /* synthetic */ ImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ImageView imageView) {
        super(1);
        this.a = imageView;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = this.a;
        if (imageView != null) {
            Handler handler = com.vungle.ads.internal.util.y.a;
            com.vungle.ads.internal.util.y.a(new i1(imageView, bitmap));
        }
        return s3q0.a;
    }
}
