package com.ybsdk.widgets.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.tcc;
import defpackage.x5i0;
import defpackage.y5i0;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\f&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/ybsdk/widgets/common/RadialGradientTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "width", "height", "Ly5i0;", "spec", "Landroid/graphics/Shader;", "createShader", "(IILy5i0;)Landroid/graphics/Shader;", "viewState", "Lzy11;", "setRadialGradient", "(Ly5i0;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "radialGradientViewState", "Ly5i0;", "gradientShader", "Landroid/graphics/Shader;", "Landroid/graphics/PorterDuffXfermode;", "gradientOverlayXfermode", "Landroid/graphics/PorterDuffXfermode;", "x5i0", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RadialGradientTextView extends AppCompatTextView {
    private final PorterDuffXfermode gradientOverlayXfermode;
    private Shader gradientShader;
    private y5i0 radialGradientViewState;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.valueOf(((x5i0) obj).a).compareTo(Float.valueOf(((x5i0) obj2).a));
        }
    }

    public /* synthetic */ RadialGradientTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Shader createShader(int width, int height, y5i0 spec) {
        List x0 = kotlin.collections.a.x0(spec.d, new a());
        ArrayList arrayList = new ArrayList(tcc.n(x0, 10));
        Iterator it = x0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((x5i0) it.next()).b));
        }
        int[] I0 = kotlin.collections.a.I0(arrayList);
        ArrayList arrayList2 = new ArrayList(tcc.n(x0, 10));
        Iterator it2 = x0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(y6i0.c(((x5i0) it2.next()).a, 0.0f, 1.0f)));
        }
        return new RadialGradient(y6i0.c(spec.a, 0.0f, 1.0f) * width, y6i0.c(spec.b, 0.0f, 1.0f) * height, y6i0.c(spec.c, 0.0f, 1.0f) * Math.max(width, height), I0, kotlin.collections.a.G0(arrayList2), Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        CharSequence text;
        y5i0 y5i0Var = this.radialGradientViewState;
        if (y5i0Var == null || y5i0Var.d.isEmpty()) {
            super.onDraw(canvas);
            return;
        }
        Layout layout = getLayout();
        if (layout == null || (text = getText()) == null || text.length() == 0) {
            super.onDraw(canvas);
            return;
        }
        TextPaint paint = getPaint();
        Shader shader = paint.getShader();
        Xfermode xfermode = paint.getXfermode();
        int color = paint.getColor();
        paint.setShader(null);
        paint.setXfermode(null);
        super.onDraw(canvas);
        Shader shader2 = this.gradientShader;
        if (shader2 == null) {
            shader2 = createShader(getWidth(), getHeight(), y5i0Var);
            this.gradientShader = shader2;
        }
        canvas.save();
        canvas.translate(getScrollX() + getCompoundPaddingLeft(), getScrollY() + getExtendedPaddingTop());
        paint.setShader(shader2);
        paint.setXfermode(this.gradientOverlayXfermode);
        paint.setColor(-1);
        layout.draw(canvas);
        paint.setShader(shader);
        paint.setXfermode(xfermode);
        paint.setColor(color);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.gradientShader = null;
    }

    public final void setRadialGradient(y5i0 viewState) {
        this.radialGradientViewState = viewState;
        this.gradientShader = null;
        invalidate();
    }

    public RadialGradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RadialGradientTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RadialGradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gradientOverlayXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
    }
}
