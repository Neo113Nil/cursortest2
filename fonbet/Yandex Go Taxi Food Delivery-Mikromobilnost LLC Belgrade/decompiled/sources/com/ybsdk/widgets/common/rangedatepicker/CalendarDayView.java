package com.ybsdk.widgets.common.rangedatepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.cf7;
import defpackage.df7;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.l1i0;
import defpackage.lhc;
import defpackage.lsg;
import defpackage.rje;
import defpackage.ung0;
import defpackage.w511;
import defpackage.xty0;
import defpackage.ze7;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0001GB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0013\u0010\u0012\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0013\u0010\u0013\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\fJ\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b&\u0010%J/\u0010+\u001a\u00020\n2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b-\u0010\fR\u0014\u0010.\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u00101\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00102\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00107\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010=R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010B\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010E\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/ybsdk/widgets/common/rangedatepicker/CalendarDayView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawBackground", "(Landroid/graphics/Canvas;)V", "", "color", "drawCellColorCircle", "(Landroid/graphics/Canvas;I)V", "drawSelectionCircle", "drawTodayCircle", "drawTodayColoredRing", "Lze7;", "day", "createTextColor", "(Lze7;)I", "Lcom/ybsdk/widgets/common/rangedatepicker/DayState;", "rangeState", "Llsg;", "dayPosition", "Landroid/graphics/RectF;", "calculateRangeBounds", "(Lcom/ybsdk/widgets/common/rangedatepicker/DayState;Llsg;)Landroid/graphics/RectF;", "Landroid/graphics/Path;", "createRangePathOrNull", "(Lze7;)Landroid/graphics/Path;", "drawRangeBackground", "newDay", "setTextStyle", "(Lze7;)V", "render", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDraw", "backgroundRangeColor", CA20Status.STATUS_USER_I, "selectedVertexRangeColor", "primaryColor", "primaryColorInverted", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "todayStrokePaint", "todayColoredRingPaint", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "rangePath", "Landroid/graphics/Path;", "Lze7;", "", "todayColoredRingCx", "F", "todayColoredRingCy", "todayColoredRingOuterRadius", "getBounds", "()Landroid/graphics/Rect;", "bounds", "Companion", "cf7", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarDayView extends AppCompatTextView {

    @Deprecated
    public static final int DISABLED_DAY_ALPHA = 76;
    private static final float backgroundRangeCornerRadius;
    private static final float backgroundRangeHeight;
    private static final float backgroundRangeHeightHalf;
    private static final Set<DayState> edgeStates;
    private final Paint backgroundPaint;
    private final int backgroundRangeColor;
    private ze7 day;
    private final int primaryColor;
    private final int primaryColorInverted;
    private Path rangePath;
    private final Rect rect;
    private final int selectedVertexRangeColor;
    private float todayColoredRingCx;
    private float todayColoredRingCy;
    private float todayColoredRingOuterRadius;
    private final Paint todayColoredRingPaint;
    private final Paint todayStrokePaint;
    private static final cf7 Companion = new cf7();
    private static final float todayStrokeWidth = kp50.t(1);
    private static final float todayColoredRingGap = kp50.t(2);
    private static final float todayColoredRingStrokeWidth = kp50.t(2);

    static {
        float t = kp50.t(32);
        backgroundRangeHeight = t;
        backgroundRangeHeightHalf = t / 2.0f;
        backgroundRangeCornerRadius = kp50.t(56);
        edgeStates = j73.f0(new DayState[]{DayState.SINGLE_SELECTION, DayState.RANGE_START, DayState.RANGE_END});
    }

    public CalendarDayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.backgroundRangeColor = rje.a(context, ung0.ybColor_fill_default_100);
        this.selectedVertexRangeColor = rje.a(context, ung0.ybColor_fill_default_800);
        this.primaryColor = rje.a(context, ung0.ybColor_textIcon_primary);
        this.primaryColorInverted = rje.a(context, ung0.ybColor_textIcon_primaryInverted);
        this.backgroundPaint = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(todayStrokeWidth);
        paint.setColor(rje.a(context, ung0.ybColor_fill_default_200));
        this.todayStrokePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(todayColoredRingStrokeWidth);
        paint2.setColor(rje.a(context, ung0.ybColor_textIcon_primary));
        this.todayColoredRingPaint = paint2;
        this.rect = new Rect();
        setTextAppearance(l1i0.Widget_YB_Text_Body2);
        setGravity(17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r8.d == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r8.c == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RectF calculateRangeBounds(DayState rangeState, lsg dayPosition) {
        Rect bounds = getBounds();
        int width = bounds.width() / 2;
        float f = bounds.left;
        float f2 = bounds.right;
        boolean z = false;
        switch (df7.a[rangeState.ordinal()]) {
            case 3:
                z = true;
            case 1:
            case 2:
            case 4:
                if (z) {
                    float height = bounds.height();
                    float f3 = backgroundRangeHeight;
                    float f4 = bounds.top + ((height - f3) / 2.0f);
                    RectF rectF = new RectF();
                    rectF.set(f, f4, f2, f3 + f4);
                    break;
                }
                break;
            case 5:
                f += width;
                if (!dayPosition.b) {
                    break;
                }
                if (z) {
                }
                break;
            case 6:
                f2 -= width;
                if (!dayPosition.a) {
                    break;
                }
                if (z) {
                }
                break;
            default:
                w511.b();
                break;
        }
        return null;
    }

    private final Path createRangePathOrNull(ze7 day) {
        DayState dayState = day.b;
        lsg lsgVar = day.c;
        RectF calculateRangeBounds = calculateRangeBounds(dayState, lsgVar);
        if (calculateRangeBounds == null) {
            return null;
        }
        boolean z = lsgVar.a || lsgVar.c;
        boolean z2 = lsgVar.b || lsgVar.d;
        boolean contains = edgeStates.contains(day.b);
        float f = 0.0f;
        float f2 = (contains || !z) ? 0.0f : backgroundRangeCornerRadius;
        if (!contains && z2) {
            f = backgroundRangeCornerRadius;
        }
        float[] fArr = {f2, f2, f, f, f, f, f2, f2};
        Path path = new Path();
        path.addRoundRect(calculateRangeBounds, fArr, Path.Direction.CW);
        return path;
    }

    private final int createTextColor(ze7 day) {
        int i;
        Integer num;
        Integer num2 = day.e;
        if (num2 != null && (num = day.f) != null) {
            return num.intValue();
        }
        if (num2 != null) {
            return this.primaryColor;
        }
        switch (df7.a[day.b.ordinal()]) {
            case 1:
            case 2:
            case 3:
                i = this.primaryColor;
                break;
            case 4:
            case 5:
            case 6:
                i = this.primaryColorInverted;
                break;
            default:
                w511.b();
                return 0;
        }
        boolean z = day.d;
        if (z) {
            return lhc.f(i, 76);
        }
        if (!z) {
            return i;
        }
        w511.b();
        return 0;
    }

    private final void drawBackground(Canvas canvas) {
        ze7 ze7Var = this.day;
        if (ze7Var == null) {
            return;
        }
        DayState dayState = ze7Var.b;
        Integer num = ze7Var.e;
        if (num != null) {
            drawCellColorCircle(canvas, num.intValue());
            if (dayState == DayState.TODAY) {
                drawTodayColoredRing(canvas);
            }
            return;
        }
        switch (df7.a[dayState.ordinal()]) {
            case 1:
                break;
            case 2:
                drawTodayCircle(canvas);
                break;
            case 3:
                drawRangeBackground(canvas);
                break;
            case 4:
                drawSelectionCircle(canvas);
                break;
            case 5:
            case 6:
                drawRangeBackground(canvas);
                drawSelectionCircle(canvas);
                break;
            default:
                w511.b();
                break;
        }
    }

    private final void drawCellColorCircle(Canvas canvas, int i) {
        Rect bounds = getBounds();
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        this.backgroundPaint.setColor(i);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), backgroundRangeHeightHalf, this.backgroundPaint);
    }

    private final void drawRangeBackground(Canvas canvas) {
        Path path = this.rangePath;
        if (path == null) {
            return;
        }
        this.backgroundPaint.setColor(this.backgroundRangeColor);
        canvas.drawPath(path, this.backgroundPaint);
    }

    private final void drawSelectionCircle(Canvas canvas) {
        Rect bounds = getBounds();
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        this.backgroundPaint.setColor(this.selectedVertexRangeColor);
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), backgroundRangeHeightHalf, this.backgroundPaint);
    }

    private final void drawTodayCircle(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.centerX(), bounds.centerY(), backgroundRangeHeightHalf, this.todayStrokePaint);
    }

    private final void drawTodayColoredRing(Canvas canvas) {
        canvas.drawCircle(this.todayColoredRingCx, this.todayColoredRingCy, this.todayColoredRingOuterRadius, this.todayColoredRingPaint);
    }

    private final Rect getBounds() {
        Rect rect = this.rect;
        getDrawingRect(rect);
        return rect;
    }

    private final void setTextStyle(ze7 newDay) {
        setTextAppearance((newDay.e == null && edgeStates.contains(newDay.b)) ? l1i0.Widget_YB_Text_Title2 : l1i0.Widget_YB_Text_Body2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        drawBackground(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        getDrawingRect(this.rect);
        this.todayColoredRingCx = this.rect.exactCenterX();
        this.todayColoredRingCy = this.rect.exactCenterY();
        this.todayColoredRingOuterRadius = (todayColoredRingStrokeWidth / 2.0f) + backgroundRangeHeightHalf + todayColoredRingGap;
        ze7 ze7Var = this.day;
        if (ze7Var == null) {
            return;
        }
        Path createRangePathOrNull = createRangePathOrNull(ze7Var);
        if (jl40.l(this.rangePath, createRangePathOrNull)) {
            return;
        }
        this.rangePath = createRangePathOrNull;
        invalidate();
    }

    public final void render(ze7 newDay) {
        String num;
        if (jl40.l(newDay, this.day)) {
            return;
        }
        this.day = newDay;
        Text.Constant constant = null;
        this.rangePath = newDay != null ? createRangePathOrNull(newDay) : null;
        if (newDay != null && (num = Integer.valueOf(newDay.a.get(5)).toString()) != null) {
            constant = d.e(num);
        }
        xty0.d(this, constant);
        if (newDay == null) {
            return;
        }
        setTextStyle(newDay);
        setTextColor(createTextColor(newDay));
    }

    public /* synthetic */ CalendarDayView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarDayView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
