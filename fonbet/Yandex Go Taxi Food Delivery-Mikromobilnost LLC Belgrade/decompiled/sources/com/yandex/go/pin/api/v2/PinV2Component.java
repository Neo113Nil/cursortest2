package com.yandex.go.pin.api.v2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import defpackage.g1c0;
import defpackage.h1c0;
import defpackage.hgr0;
import defpackage.i1c0;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.tje;
import defpackage.uh6;
import defpackage.unr0;
import defpackage.xng0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002p@B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0014¢\u0006\u0004\b$\u0010%J7\u0010+\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J/\u00106\u001a\u00020\r2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0014¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\r2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010M\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u0014\u0010N\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010KR\u0014\u0010O\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010KR\u0014\u0010P\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010KR\u0014\u0010Q\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010KR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0011\u0010a\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010e\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0011\u0010k\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0011\u0010o\u001a\u00020l8F¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006q"}, d2 = {"Lcom/yandex/go/pin/api/v2/PinV2Component;", "Landroid/view/ViewGroup;", "Lnwy0;", "Landroid/content/Context;", "context", "Lh1c0;", "res", "<init>", "(Landroid/content/Context;Lh1c0;)V", "", "spec", "controlMeasureSpec", "(I)I", "Lzy11;", "refreshThemeColors", "()V", "Lcom/yandex/go/pin/api/v2/PinV2Component$Position;", "position", "", "animated", "updatePosition", "(Lcom/yandex/go/pin/api/v2/PinV2Component$Position;Z)V", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", ClidProvider.STATE, "updateControlState", "(Lru/yandex/taxi/widget/map/SourceOnMapControl$a;)V", "Li1c0;", "style", "updateControlStyle", "(Li1c0;)V", "", RemoteBioParameters.TIME, "setCustomAnimationTime", "(J)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDrawForeground", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lh1c0;", "Lru/yandex/taxi/widget/map/SourceOnMapControl;", "control", "Lru/yandex/taxi/widget/map/SourceOnMapControl;", "Lcom/yandex/go/pin/api/v2/b;", "stateHolder", "Lcom/yandex/go/pin/api/v2/b;", "Landroid/graphics/PointF;", "targetOffsetPoint", "Landroid/graphics/PointF;", "Lhgr0;", "shadow", "Lhgr0;", "", "stickWidth", "F", "stickHeight", "pinTargetOffset", "stickHideOffset", "shadowRadiusOffset", "anchorPointerVisibleOffset", "safeHeightSize", CA20Status.STATUS_USER_I, "Landroid/graphics/Paint;", "stickPaint", "Landroid/graphics/Paint;", "Lg1c0;", "pinShadow", "Lg1c0;", "anchorPointerPosition", "Lkdc;", "pointerColor", "Lkdc;", "outerBgColor", "Ljava/lang/Integer;", "getTargetOffset", "()Landroid/graphics/PointF;", "targetOffset", "Landroid/graphics/Rect;", "getPinFullVisibleBounds", "()Landroid/graphics/Rect;", "pinFullVisibleBounds", "getPinVisibleBounds", "pinVisibleBounds", "Lcom/yandex/mapkit/ScreenRect;", "getPinScreenRect", "()Lcom/yandex/mapkit/ScreenRect;", "pinScreenRect", "Landroid/view/View;", "getTouchTarget", "()Landroid/view/View;", "touchTarget", "Position", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PinV2Component extends ViewGroup implements nwy0 {
    public static final int $stable = 8;
    private float anchorPointerPosition;
    private final float anchorPointerVisibleOffset;
    private final SourceOnMapControl control;
    private Integer outerBgColor;
    private final g1c0 pinShadow;
    private final float pinTargetOffset;
    private kdc pointerColor;
    private final h1c0 res;
    private final int safeHeightSize;
    private final hgr0 shadow;
    private final float shadowRadiusOffset;
    private final b stateHolder;
    private final float stickHeight;
    private final float stickHideOffset;
    private final Paint stickPaint;
    private final float stickWidth;
    private final PointF targetOffsetPoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pin/api/v2/PinV2Component$Position;", "", "MOVE", "DEFAULT", "ANCHORED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Position {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position ANCHORED;
        public static final Position DEFAULT;
        public static final Position MOVE;

        static {
            Position position = new Position("MOVE", 0);
            MOVE = position;
            Position position2 = new Position("DEFAULT", 1);
            DEFAULT = position2;
            Position position3 = new Position("ANCHORED", 2);
            ANCHORED = position3;
            Position[] positionArr = {position, position2, position3};
            $VALUES = positionArr;
            $ENTRIES = kotlin.enums.a.a(positionArr);
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    public PinV2Component(Context context, h1c0 h1c0Var) {
        super(context);
        this.res = h1c0Var;
        SourceOnMapControl sourceOnMapControl = new SourceOnMapControl(context);
        addView(sourceOnMapControl);
        this.control = sourceOnMapControl;
        b bVar = new b(this, sourceOnMapControl);
        this.stateHolder = bVar;
        this.targetOffsetPoint = new PointF();
        this.shadow = new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom));
        this.stickWidth = tje.x(getContext(), 3.0f);
        this.stickHeight = tje.x(getContext(), 24.0f);
        this.pinTargetOffset = tje.x(context, 0.5f);
        float f = bVar.l;
        float f2 = bVar.n;
        float f3 = (f2 - f) / 2.0f;
        this.stickHideOffset = f3;
        this.shadowRadiusOffset = bVar.m - f2;
        this.anchorPointerVisibleOffset = f3;
        this.safeHeightSize = (int) tje.x(getContext(), 64.0f);
        this.stickPaint = unr0.f(true);
        this.pinShadow = new g1c0(context);
        setClipChildren(false);
        setWillNotDraw(false);
        bVar.e();
        bVar.g = true;
        sourceOnMapControl.updateShadows(h1c0Var.a);
        refreshThemeColors();
    }

    private final int controlMeasureSpec(int spec) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(spec), View.MeasureSpec.getMode(spec) == 0 ? 0 : Integer.MIN_VALUE);
    }

    private final void refreshThemeColors() {
        int t;
        this.stickPaint.setColor(qje.t(xng0.textMain, getContext()));
        Drawable drawable = this.res.b;
        Integer num = this.outerBgColor;
        if (num == null) {
            kdc kdcVar = this.pointerColor;
            num = kdcVar != null ? Integer.valueOf(s8o.m(kdcVar, getContext())) : null;
            if (num == null) {
                t = qje.t(xng0.bgMain, getContext());
                drawable.setTint(t);
                invalidate();
            }
        }
        t = num.intValue();
        drawable.setTint(t);
        invalidate();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        refreshThemeColors();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final Rect getPinFullVisibleBounds() {
        PointF targetOffsetPoint = getTargetOffsetPoint();
        int width = (int) ((this.control.getWidth() / 2) + this.shadow.c);
        int y = (int) (((this.control.getY() + (-this.shadow.c)) + this.shadow.b) - targetOffsetPoint.y);
        float f = this.pinShadow.f;
        float y2 = this.control.getY() + this.control.getHeight();
        hgr0 hgr0Var = this.shadow;
        return new Rect(-width, y, width, (int) Math.max(f, ((y2 + hgr0Var.c) + hgr0Var.b) - targetOffsetPoint.y));
    }

    public final ScreenRect getPinScreenRect() {
        Rect pinVisibleBounds = getPinVisibleBounds();
        PointF targetOffsetPoint = getTargetOffsetPoint();
        return new ScreenRect(new ScreenPoint(getLeft() + targetOffsetPoint.x + pinVisibleBounds.left, getTop() + targetOffsetPoint.y + pinVisibleBounds.top), new ScreenPoint(getLeft() + targetOffsetPoint.x + pinVisibleBounds.right, getTop() + targetOffsetPoint.y + pinVisibleBounds.bottom));
    }

    public final Rect getPinVisibleBounds() {
        int i = this.control.minWidgetHeight / 2;
        return new Rect(-i, -((int) ((this.stateHolder.m + this.control.minWidgetHeight) - this.pinTargetOffset)), i, (int) this.pinShadow.f);
    }

    /* renamed from: getTargetOffset, reason: from getter */
    public final PointF getTargetOffsetPoint() {
        return this.targetOffsetPoint;
    }

    public final View getTouchTarget() {
        return this.control;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        long j;
        float f;
        b bVar = this.stateHolder;
        bVar.c();
        if (!bVar.f && bVar.d == Position.MOVE && bVar.s < 0) {
            bVar.s = AnimationUtils.currentAnimationTimeMillis();
        }
        if (bVar.s > 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - bVar.s;
            float H = uh6.H(bVar.m, bVar.r, 1.0f - (Math.abs(((currentAnimationTimeMillis % r5) / bVar.t) - 0.5f) / 0.5f));
            bVar.o = H;
            bVar.k.setTranslationY(-H);
        }
        float y = this.control.getY() + this.control.getHeight();
        float height = getHeight() - y;
        b bVar2 = this.stateHolder;
        float f2 = bVar2.n;
        float f3 = bVar2.l;
        float f4 = this.stickHideOffset;
        float j2 = sb2.j((height - (f2 - f4)) / f4, 0.0f, 1.0f);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, getHeight() - this.pinTargetOffset);
        g1c0 g1c0Var = this.pinShadow;
        float j3 = sb2.j((height - f2) / this.shadowRadiusOffset, 0.0f, 1.0f);
        Paint paint = g1c0Var.k;
        float H2 = uh6.H(g1c0Var.f, g1c0Var.g, j3);
        boolean z = Math.abs(g1c0Var.e - H2) > 0.01f;
        g1c0Var.e = H2;
        if (z) {
            float f5 = (g1c0Var.b + H2) / 2.0f;
            j = 0;
            float f6 = (g1c0Var.c + H2) / 2.0f;
            float f7 = (f6 - H2) / f6;
            float[] fArr = g1c0Var.i;
            fArr[0] = Math.max(f7, 0.0f);
            f = 2.0f;
            int[] iArr = g1c0Var.j;
            iArr[0] = g1c0Var.a.evaluate((0.0f - f7) / (fArr[1] - f7), Integer.valueOf(g1c0Var.h), Integer.valueOf(iArr[1])).intValue();
            Matrix matrix = g1c0Var.d;
            matrix.reset();
            matrix.postScale(f5, f6);
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, g1c0Var.j, g1c0Var.i, Shader.TileMode.CLAMP);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
        } else {
            j = 0;
            f = 2.0f;
        }
        int i = (int) (j2 * 255.0f);
        paint.setAlpha(i);
        g1c0 g1c0Var2 = this.pinShadow;
        float f8 = g1c0Var2.b;
        float f9 = g1c0Var2.e;
        float f10 = ((-f8) / f) - f9;
        float f11 = g1c0Var2.c;
        float f12 = ((-f11) / f) - f9;
        float f13 = f * f9;
        canvas.drawOval(f10, f12, f8 + f10 + f13, f11 + f12 + f13, g1c0Var2.k);
        canvas.restore();
        float j4 = sb2.j((height - f3) / this.anchorPointerVisibleOffset, 0.0f, 1.0f);
        if (j4 < 1.0f) {
            this.anchorPointerPosition = (y - 1.0f) - (this.res.b.getBounds().height() * j4);
            canvas.save();
            canvas.translate(getWidth() / f, this.anchorPointerPosition);
            this.res.c.setAlpha((int) ((1.0f - j4) * 255.0f));
            this.res.c.draw(canvas);
            canvas.restore();
        } else {
            this.anchorPointerPosition = Float.NaN;
        }
        float f14 = y - (this.stickWidth / f);
        float width = getWidth();
        float f15 = this.stickWidth;
        float f16 = (width - f15) / f;
        float min = Math.min(this.stickHeight, height) + (f15 / f);
        this.stickPaint.setAlpha(i);
        float f17 = this.stickWidth;
        canvas.drawRoundRect(f16, f14, f16 + f17, min + f14, f17, f17, this.stickPaint);
        b bVar3 = this.stateHolder;
        bVar3.b();
        if (bVar3.f || bVar3.s <= j) {
            return;
        }
        bVar3.a.postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        if (Float.isNaN(this.anchorPointerPosition)) {
            return;
        }
        canvas.save();
        canvas.translate(getWidth() / 2.0f, this.anchorPointerPosition);
        h1c0 h1c0Var = this.res;
        h1c0Var.b.setAlpha(h1c0Var.c.getAlpha());
        this.res.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int width = (getWidth() - this.control.getMeasuredWidth()) / 2;
        this.control.layout(width, getHeight() - this.control.getMeasuredHeight(), this.control.getMeasuredWidth() + width, getHeight());
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChild(this.control, controlMeasureSpec(widthMeasureSpec), controlMeasureSpec(heightMeasureSpec));
        setMeasuredDimension(View.resolveSize(Math.max(this.control.getMeasuredWidth(), this.control.getMaxWidthSize()), widthMeasureSpec), View.resolveSize((int) (Math.max(this.safeHeightSize, this.control.getMeasuredHeight()) + this.stateHolder.m), heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        PointF pointF = this.targetOffsetPoint;
        pointF.x = w / 2.0f;
        pointF.y = h - this.pinTargetOffset;
    }

    public final void setCustomAnimationTime(long time) {
        this.control.setCustomAnimationTime(time);
    }

    public final void updateControlState(SourceOnMapControl.a state) {
        SourceOnMapControl.a.C0122a c0122a = state.j;
        this.pointerColor = c0122a != null ? c0122a.b() : null;
        refreshThemeColors();
        this.control.render(state);
    }

    public final void updateControlStyle(i1c0 style) {
        this.outerBgColor = style.c;
        this.control.updateStyle(style);
        refreshThemeColors();
    }

    public final void updatePosition(Position position, boolean animated) {
        this.stateHolder.g(position, animated, false);
    }
}
