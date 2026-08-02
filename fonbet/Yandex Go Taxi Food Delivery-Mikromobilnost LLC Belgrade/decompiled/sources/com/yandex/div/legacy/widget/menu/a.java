package com.yandex.div.legacy.widget.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.k;
import defpackage.atg0;
import defpackage.fzg0;
import defpackage.g8a1;
import defpackage.ogh0;
import defpackage.uiz0;
import defpackage.z83;
import defpackage.zgv;

/* loaded from: classes11.dex */
public final class a {
    public final Context a;
    public final View b;
    public uiz0 f;
    public FrameLayout h;
    public ImageView i;
    public final int k;
    public final int l;
    public k m;
    public int c = 51;
    public int d = -1;
    public int e = fzg0.ic_more_vert_white_24dp;
    public View[] g = null;
    public boolean j = false;

    public a(Context context, AppCompatTextView appCompatTextView, int i, int i2) {
        this.a = context;
        this.b = appCompatTextView;
        this.k = i;
        this.l = i2;
    }

    public final View a() {
        FrameLayout frameLayout;
        if (this.j && (frameLayout = this.h) != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = this.h;
        Context context = this.a;
        if (frameLayout2 == null || this.i == null) {
            Resources resources = context.getResources();
            NonScrollImageView nonScrollImageView = new NonScrollImageView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.c;
            nonScrollImageView.setLayoutParams(layoutParams);
            nonScrollImageView.setId(ogh0.overflow_menu);
            int dimensionPixelSize = resources.getDimensionPixelSize(this.k);
            nonScrollImageView.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(this.l), dimensionPixelSize, 0);
            this.i = nonScrollImageView;
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout3.addView(this.b);
            frameLayout3.addView(nonScrollImageView);
            View[] viewArr = this.g;
            if (viewArr != null) {
                for (View view : viewArr) {
                    g8a1.h(atg0.overflow_menu_size, 4, view);
                }
            }
            this.h = frameLayout3;
        }
        z83.c(null, this.j);
        ImageView imageView = this.i;
        Drawable mutate = new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(context.getResources(), this.e)).mutate();
        mutate.setColorFilter(this.d, PorterDuff.Mode.SRC_IN);
        mutate.setAlpha(255);
        imageView.setImageDrawable(mutate);
        this.i.setOnClickListener(new zgv(24, this));
        this.j = true;
        return this.h;
    }
}
