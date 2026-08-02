package com.yandex.plus.glide;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.RequestManager;
import defpackage.b5d0;
import defpackage.i3y;
import defpackage.ku2;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class b implements b5d0 {
    public final i3y a;
    public final WeakHashMap b = new WeakHashMap();

    public b(Context context) {
        this.a = kotlin.a.a(new ku2(context, 11));
    }

    public final void a(ImageView imageView) {
        ((RequestManager) this.a.getValue()).clear(imageView);
    }

    public final a b(String str) {
        return new a(((RequestManager) this.a.getValue()).load(str), new GlideImageLoader$wrap$1(this));
    }
}
