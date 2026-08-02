package com.yandex.messaging.internal.view.timeline;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.gvg0;
import defpackage.hej;
import defpackage.im91;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\n\b'\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b\u000e\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\"R\u001a\u0010*\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001a¨\u0006."}, d2 = {"Lcom/yandex/messaging/internal/view/timeline/DialogItemDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "resources", "", "itemType", "<init>", "(Landroid/content/res/Resources;I)V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "updateRadii", "(Landroid/graphics/Rect;)V", "layoutDirection", "updateCornerRadii", "(I)V", "corner", "getRadius", "(I)I", "left", "top", "right", "bottom", "setBounds", "(IIII)V", "getOpacity", "()I", "onBoundsChange", "", "onLayoutDirectionChanged", "(I)Z", "", "corners", "([F)V", CA20Status.STATUS_USER_I, "mediumRadiusHeightLimit", "", "radius", "[I", "radii", "[F", "height", "outlineWidth", "getOutlineWidth", "Companion", "hej", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DialogItemDrawable extends Drawable {
    public static final int $stable = 8;
    private static final int CORNER_COUNT = 4;
    public static final hej Companion = new hej();
    private int height;
    private final int itemType;
    private final int mediumRadiusHeightLimit;
    private final int outlineWidth;
    private final float[] radii = new float[4];
    private final int[] radius;

    public DialogItemDrawable(Resources resources, int i) {
        this.itemType = i;
        this.outlineWidth = resources.getDimensionPixelSize(gvg0.timeline_message_stroke_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(gvg0.timeline_message_corner_radius_big);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(gvg0.timeline_message_corner_radius_medium);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(gvg0.timeline_message_corner_radius_small);
        int dimensionPixelSize4 = resources.getDimensionPixelSize(gvg0.timeline_message_corner_radius_attachment);
        this.mediumRadiusHeightLimit = resources.getDimensionPixelSize(gvg0.timeline_message_single_line_height);
        this.radius = new int[]{dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4};
    }

    private final int getRadius(int corner) {
        int i;
        int i2 = (this.itemType >> (corner * 4)) & 15;
        int[] iArr = this.radius;
        int i3 = iArr[i2];
        return (this.height <= this.mediumRadiusHeightLimit || i3 <= (i = iArr[1])) ? i3 : i;
    }

    private final void updateCornerRadii(int layoutDirection) {
        char c = layoutDirection == 1 ? (char) 1 : (char) 0;
        int i = c ^ 1;
        char c2 = c != 0 ? (char) 3 : (char) 2;
        char c3 = c != 0 ? (char) 2 : (char) 3;
        float[] fArr = this.radii;
        float f = fArr[c];
        float f2 = fArr[i];
        float f3 = fArr[c2];
        float f4 = fArr[c3];
        updateCornerRadii(new float[]{f, f, f2, f2, f3, f3, f4, f4});
    }

    private final void updateRadii(Rect bounds) {
        bounds.set(bounds);
        int width = bounds.width();
        int height = bounds.height();
        if (width > height) {
            width = height;
        }
        float f = width / 2.0f;
        for (int i = 0; i < 4; i++) {
            this.radii[i] = Float.min(f, getRadius(i));
        }
        updateCornerRadii(im91.h(this));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final int getOutlineWidth() {
        return this.outlineWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        updateRadii(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        updateCornerRadii(layoutDirection);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        this.height = bottom - top;
        super.setBounds(left, top, right, bottom);
    }

    public abstract void updateCornerRadii(float[] corners);
}
