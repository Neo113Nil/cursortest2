package com.vungle.ads.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class i1 extends Lambda implements gzs {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Bitmap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.a = imageView;
        this.b = bitmap;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        this.a.setImageBitmap(this.b);
        return s3q0.a;
    }
}
