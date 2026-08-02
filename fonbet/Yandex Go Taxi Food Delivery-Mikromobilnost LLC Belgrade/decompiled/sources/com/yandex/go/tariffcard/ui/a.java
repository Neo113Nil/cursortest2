package com.yandex.go.tariffcard.ui;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.tje;
import defpackage.xw31;

/* loaded from: classes14.dex */
public final class a extends RecyclerView.g {
    public final RecyclerView a;
    public final ImageView b;
    public final ru.yandex.taxi.design.utils.b c;
    public final ike d;

    public a(RecyclerView recyclerView, ImageView imageView, ru.yandex.taxi.design.utils.b bVar) {
        this.a = recyclerView;
        this.b = imageView;
        this.c = bVar;
        ike b = bvf0.b();
        this.d = b;
        tje.N(b, null, null, new BottomContainerShadowListener$1(this, null), 3);
    }

    public static final void a(a aVar, Drawable drawable) {
        ImageView imageView = aVar.b;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        xw31.E(imageView, Integer.valueOf(-rect.left), Integer.valueOf(-rect.top), Integer.valueOf(-rect.right), Integer.valueOf(ru.yandex.taxi.design.utils.c.h(32, imageView) + (-rect.bottom)));
        imageView.setBackground(drawable);
    }

    public final void b() {
        RecyclerView recyclerView = this.a;
        boolean canScrollVertically = recyclerView.canScrollVertically(1);
        ImageView imageView = this.b;
        if (canScrollVertically && imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
        } else {
            if (recyclerView.canScrollVertically(1) || imageView.getVisibility() != 0) {
                return;
            }
            imageView.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        b();
    }
}
