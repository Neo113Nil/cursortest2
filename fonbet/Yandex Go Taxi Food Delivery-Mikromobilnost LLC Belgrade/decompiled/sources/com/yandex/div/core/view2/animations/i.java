package com.yandex.div.core.view2.animations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.transition.R;
import com.yandex.div.internal.view.DivImageView;
import defpackage.ffx;
import defpackage.h8;
import defpackage.lx80;
import defpackage.sls;
import defpackage.ugk;
import defpackage.yp31;
import defpackage.zy11;

/* loaded from: classes11.dex */
public abstract class i {
    public static final View a(final View view, ViewGroup viewGroup, lx80 lx80Var, int[] iArr) {
        Object tag = view.getTag(R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        d(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        imageView.offsetLeftAndRight(iArr[0] - iArr2[0]);
        imageView.offsetTopAndBottom(iArr[1] - iArr2[1]);
        view.setTag(R.id.save_overlay_view, imageView);
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(imageView);
        lx80Var.a(new yp31(view, overlay, imageView));
        c(new sls() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                i.d(imageView, view);
                return zy11.a;
            }
        }, view);
        if (imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                    imageView.removeOnAttachStateChangeListener(this);
                    i.c(null, view);
                }
            });
            return imageView;
        }
        c(null, view);
        return imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ImageView imageView, View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        imageView.setImageBitmap(createBitmap);
        ugk ugkVar = view instanceof ugk ? (ugk) view : null;
        if (ugkVar == null || ugkVar.getDivBorderDrawer() == null) {
            return;
        }
        imageView.setClipToOutline(view.getClipToOutline());
        imageView.setOutlineProvider(view.getOutlineProvider());
    }

    public static final void c(sls slsVar, View view) {
        if (view instanceof DivImageView) {
            ((DivImageView) view).setImageChangeCallback(slsVar);
        } else if (view instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) view);
            while (h8Var.hasNext()) {
                c(slsVar, (View) h8Var.next());
            }
        }
    }

    public static final void d(final ImageView imageView, final View view) {
        Bitmap bitmap;
        if (!(view instanceof ugk)) {
            ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
            Object drawable = imageView2 != null ? imageView2.getDrawable() : null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        if (ffx.V(view)) {
            b(imageView, view);
        } else if (!ffx.V(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$setScreenshotFromView$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    i.b(imageView, view);
                }
            });
        } else {
            b(imageView, view);
        }
    }
}
