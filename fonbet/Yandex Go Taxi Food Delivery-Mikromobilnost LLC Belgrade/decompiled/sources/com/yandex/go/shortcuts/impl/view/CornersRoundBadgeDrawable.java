package com.yandex.go.shortcuts.impl.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.Gravity;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.bse;
import defpackage.mug0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.background.PathFillDrawable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/go/shortcuts/impl/view/CornersRoundBadgeDrawable;", "Lru/yandex/taxi/widget/background/PathFillDrawable;", "Lbse;", "sizes", "", "gravity", "<init>", "(Lbse;I)V", "Landroid/content/Context;", "context", "contentHeight", "(Landroid/content/Context;ILjava/lang/Integer;)V", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Rect;", "bounds", "Lzy11;", "applyGravity", "(Landroid/graphics/Path;Landroid/graphics/Rect;)V", "onBoundsChange", "(Landroid/graphics/Rect;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "padding", "", "getPadding", "(Landroid/graphics/Rect;)Z", "getIntrinsicHeight", "()I", "getIntrinsicWidth", "isAutoMirrored", "()Z", "Lbse;", CA20Status.STATUS_USER_I, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CornersRoundBadgeDrawable extends PathFillDrawable {
    private final int gravity;
    private final bse sizes;

    public CornersRoundBadgeDrawable(Context context, int i, Integer num) {
        this(num != null ? new bse(context, num.intValue()) : new bse(context, context.getResources().getDimensionPixelSize(mug0.shortcuts_corner_badge_content_height)), i);
    }

    private final void applyGravity(Path path, Rect bounds) {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.gravity, getLayoutDirection());
        int i = absoluteGravity & 7;
        int i2 = absoluteGravity & 112;
        float f = (i == 3 || i != 5) ? 1.0f : -1.0f;
        float f2 = 0.0f;
        float width = (i == 3 || i != 5) ? 0.0f : bounds.width();
        float f3 = (i2 == 48 || i2 != 80) ? 1.0f : -1.0f;
        if (i2 != 48 && i2 == 80) {
            f2 = bounds.height();
        }
        Matrix matrix = new Matrix();
        matrix.preScale(f, f3);
        matrix.postTranslate(width, f2);
        path.transform(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.sizes.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.sizes.b * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        padding.set(this.sizes.d);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.background.PathFillDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        bse bseVar = this.sizes;
        int min = Math.min(bseVar.a / 2, bseVar.b);
        Path path = getPath();
        path.rewind();
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = this.sizes.c;
        path.arcTo(i, i2 - i3, (i3 * 2.0f) + i, i2 + i3, 180.0f, -90.0f, true);
        float f = min * 2.0f;
        int i4 = bounds.right;
        int i5 = bounds.top;
        int i6 = this.sizes.c;
        path.arcTo(i4 - f, i5 + i6, i4, i5 + i6 + f, -90.0f, 90.0f, false);
        int i7 = bounds.right;
        int i8 = bounds.bottom;
        path.arcTo(i7 - f, i8 - f, i7, i8, 0.0f, 90.0f, false);
        path.lineTo(bounds.left + f, bounds.bottom);
        int i9 = bounds.left;
        int i10 = bounds.bottom;
        path.arcTo(i9, i10 - f, i9 + f, i10, 90.0f, 90.0f, false);
        path.close();
        applyGravity(path, bounds);
    }

    @Override // ru.yandex.taxi.widget.background.PathFillDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        clearBitmap();
        super.setAlpha(alpha);
    }

    public /* synthetic */ CornersRoundBadgeDrawable(Context context, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, (i2 & 4) != 0 ? null : num);
    }

    private CornersRoundBadgeDrawable(bse bseVar, int i) {
        this.sizes = bseVar;
        this.gravity = i;
    }
}
