package com.yandex.mobile.drive.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.state.db.StateEntry;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.vs11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/mobile/drive/view/CameraTopBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "", "radius", "F", "", "radii", "[F", "Landroid/graphics/Path;", StateEntry.COLUMN_PATH, "Landroid/graphics/Path;", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CameraTopBar extends View {
    private final Path path;
    private float[] radii;
    private final float radius;

    public CameraTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = 30.0f * vs11.a;
        this.radius = f;
        this.radii = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        this.path = path;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() - this.radius;
        this.path.reset();
        this.path.addRoundRect(getLeft(), getTop() + height, getRight(), getBottom() + height, this.radii, Path.Direction.CW);
        canvas.clipPath(this.path);
        canvas.drawColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
    }

    public /* synthetic */ CameraTopBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraTopBar(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
