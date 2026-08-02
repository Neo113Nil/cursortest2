package com.yandex.go.superapp.orders.card.timeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.jl40;
import defpackage.lbm;
import defpackage.n301;
import defpackage.nac;
import defpackage.nwy0;
import defpackage.o301;
import defpackage.p301;
import defpackage.pav;
import defpackage.prb1;
import defpackage.q301;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vn70;
import defpackage.wn70;
import defpackage.zgz0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u00017B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0014\u0010-\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\"R\u0014\u0010.\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010'R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00102R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\"¨\u0006;"}, d2 = {"Lcom/yandex/go/superapp/orders/card/timeline/TrackingCardCircleTimelineView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwn70;", "style", "Lpav;", "imageLoader", "Lzy11;", "init", "(Lwn70;Lpav;)V", "Lp301;", "uiState", "render", "(Lp301;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "size", CA20Status.STATUS_USER_I, "", "center", "F", "imageSize", "imageCircleRadius", "Landroid/graphics/Paint;", "imageBackgroundPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "imageClipPath", "Landroid/graphics/Path;", "strokeWidth", "strokeMargin", "strokeRadius", "strokePaint", "Landroid/graphics/RectF;", "strokeRect", "Landroid/graphics/RectF;", "Lwn70;", "Lpav;", "currentUiState", "Lp301;", "", "Lq301;", "strokeSegments", "Ljava/util/List;", "strokeSegmentSweepAngle", "card"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrackingCardCircleTimelineView extends AppCompatImageView implements nwy0 {
    private final float center;
    private p301 currentUiState;
    private final Paint imageBackgroundPaint;
    private final float imageCircleRadius;
    private final Path imageClipPath;
    private pav imageLoader;
    private final float imageSize;
    private final int size;
    private final int strokeMargin;
    private final Paint strokePaint;
    private final float strokeRadius;
    private final RectF strokeRect;
    private float strokeSegmentSweepAngle;
    private List<q301> strokeSegments;
    private final float strokeWidth;
    private wn70 style;

    public TrackingCardCircleTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int u = tje.u(48, getContext());
        this.size = u;
        float f = u / 2.0f;
        this.center = f;
        float w = tje.w(36, getContext());
        this.imageSize = w;
        float f2 = w / 2.0f;
        this.imageCircleRadius = f2;
        this.imageBackgroundPaint = new Paint(1);
        Path path = new Path();
        path.addCircle(f, f, f2, Path.Direction.CW);
        this.imageClipPath = path;
        float w2 = tje.w(3, getContext());
        this.strokeWidth = w2;
        int u2 = tje.u(3, getContext());
        this.strokeMargin = u2;
        float f3 = (w2 / 2.0f) + f2 + u2;
        this.strokeRadius = f3;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(w2);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.strokePaint = paint;
        float f4 = f - f3;
        float f5 = f + f3;
        this.strokeRect = new RectF(f4, f4, f5, f5);
        this.style = new vn70(false, false);
        this.strokeSegments = EmptyList.a;
        setScaleType(ImageView.ScaleType.FIT_XY);
        setLayoutParams(new ViewGroup.LayoutParams(u, u));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$1(TrackingCardCircleTimelineView trackingCardCircleTimelineView) {
        trackingCardCircleTimelineView.setImageDrawable(null);
        return zy11.a;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        p301 p301Var = this.currentUiState;
        this.currentUiState = null;
        if (p301Var != null) {
            render(p301Var);
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void init(wn70 style, pav imageLoader) {
        this.style = style;
        this.imageLoader = imageLoader;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.center;
        canvas.drawCircle(f, f, this.imageCircleRadius, this.imageBackgroundPaint);
        int save = canvas.save();
        try {
            canvas.clipPath(this.imageClipPath);
            float f2 = this.strokeWidth;
            int i = this.strokeMargin;
            canvas.translate(i + f2, f2 + i);
            canvas.scale(0.75f, 0.75f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            for (q301 q301Var : this.strokeSegments) {
                this.strokePaint.setColor(q301Var.a);
                canvas.drawArc(this.strokeRect, q301Var.b, this.strokeSegmentSweepAngle, false, this.strokePaint);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final void render(p301 uiState) {
        lbm a;
        if (jl40.l(this.currentUiState, uiState)) {
            return;
        }
        this.currentUiState = uiState;
        Paint paint = this.imageBackgroundPaint;
        n301 n301Var = uiState.a;
        ArrayList arrayList = uiState.b;
        paint.setColor(s8o.m(prb1.b(n301Var.b, this.style), getContext()));
        float max = 360 / Math.max(arrayList.size(), 1);
        this.strokeSegmentSweepAngle = max - 15.0f;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList2.add(new q301(s8o.m(prb1.b(((o301) obj).a, this.style), getContext()), ((i * max) + 7.5f) - 90.0f));
            i = i2;
        }
        this.strokeSegments = arrayList2;
        pav pavVar = this.imageLoader;
        if (pavVar == null || (a = pavVar.a(this)) == null) {
            return;
        }
        nac nacVar = (nac) a;
        nacVar.i = new zgz0(13, this);
        nacVar.c(uiState.a.a);
    }

    public TrackingCardCircleTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackingCardCircleTimelineView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TrackingCardCircleTimelineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
