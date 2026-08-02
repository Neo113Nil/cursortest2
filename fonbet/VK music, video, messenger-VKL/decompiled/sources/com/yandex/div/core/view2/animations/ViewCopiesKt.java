package com.yandex.div.core.view2.animations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import com.vkontakte.android.R;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import xsna.gzs;
import xsna.kxt0;
import xsna.s3q0;
import xsna.vlp0;
import xsna.ymp0;

/* compiled from: ViewCopies.kt */
/* loaded from: classes7.dex */
public final class ViewCopiesKt {
    public static final View createOrGetVisualCopy(final View view, ViewGroup viewGroup, vlp0 vlp0Var, int[] iArr) {
        Object tag = view.getTag(R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        setScreenshotFromView(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        invalidatePosition(imageView, viewGroup, iArr);
        view.setTag(R.id.save_overlay_view, imageView);
        replace(view, imageView, vlp0Var, viewGroup);
        setHierarchyImageChangeCallback(view, new gzs<s3q0>() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ViewCopiesKt.setScreenshotFromView(imageView, view);
            }
        });
        if (imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                    imageView.removeOnAttachStateChangeListener(this);
                    ViewCopiesKt.setHierarchyImageChangeCallback(view, null);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                }
            });
            return imageView;
        }
        setHierarchyImageChangeCallback(view, null);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawAndSet(ImageView imageView, View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        imageView.setImageBitmap(createBitmap);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports == null || divBorderSupports.getDivBorderDrawer() == null) {
            return;
        }
        imageView.setClipToOutline(view.getClipToOutline());
        imageView.setOutlineProvider(view.getOutlineProvider());
    }

    private static final void invalidatePosition(View view, ViewGroup viewGroup, int[] iArr) {
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        view.offsetLeftAndRight(iArr[0] - iArr2[0]);
        view.offsetTopAndBottom(iArr[1] - iArr2[1]);
    }

    private static final void replace(final View view, final View view2, vlp0 vlp0Var, ViewGroup viewGroup) {
        final ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(view2);
        vlp0Var.addListener(new ymp0() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$replace$1
            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionEnd(vlp0 vlp0Var2) {
                view.setTag(R.id.save_overlay_view, null);
                view.setVisibility(0);
                overlay.remove(view2);
                vlp0Var2.removeListener(this);
            }

            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionPause(vlp0 vlp0Var2) {
                overlay.remove(view2);
            }

            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionResume(vlp0 vlp0Var2) {
                if (view2.getParent() == null) {
                    overlay.add(view2);
                }
            }

            @Override // xsna.ymp0, xsna.vlp0.i
            public void onTransitionStart(vlp0 vlp0Var2) {
                view.setVisibility(4);
            }
        });
    }

    public static final void setHierarchyImageChangeCallback(View view, gzs<s3q0> gzsVar) {
        if (view instanceof DivImageView) {
            ((DivImageView) view).setImageChangeCallback(gzsVar);
        } else if (view instanceof ViewGroup) {
            kxt0 kxt0Var = new kxt0((ViewGroup) view);
            while (kxt0Var.hasNext()) {
                setHierarchyImageChangeCallback(kxt0Var.next(), gzsVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenshotFromView(final ImageView imageView, final View view) {
        Bitmap bitmap;
        if (!(view instanceof DivBorderSupports)) {
            ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
            Object drawable = imageView2 != null ? imageView2.getDrawable() : null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        if (ViewsKt.isActuallyLaidOut(view)) {
            drawAndSet(imageView, view);
        } else if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$setScreenshotFromView$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view2.removeOnLayoutChangeListener(this);
                    ViewCopiesKt.drawAndSet(imageView, view);
                }
            });
        } else {
            drawAndSet(imageView, view);
        }
    }
}
