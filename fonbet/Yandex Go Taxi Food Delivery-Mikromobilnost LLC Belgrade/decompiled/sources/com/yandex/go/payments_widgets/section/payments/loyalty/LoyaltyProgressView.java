package com.yandex.go.payments_widgets.section.payments.loyalty;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.kdc;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tvz;
import defpackage.uvz;
import defpackage.vvz;
import defpackage.w511;
import defpackage.wvz;
import defpackage.y6i0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001a\u001a\u00020\u00192\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b\"\u0010#J/\u0010(\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0014¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\bR\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00109¨\u0006B"}, d2 = {"Lcom/yandex/go/payments_widgets/section/payments/loyalty/LoyaltyProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "updateRect", "()V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "backgroundStrokeWidth", "progressStrokeWidth", "Lvvz;", "progressArcColor", "configurePaints", "(IFFLvvz;)V", "Lkdc;", "arcProgressColor", "createSolidColorInt", "(Lkdc;)I", "", "arcProgressColors", "arcProgressColorPositions", "Landroid/graphics/LinearGradient;", "createLinearGradientShader", "(Ljava/util/List;Ljava/util/List;)Landroid/graphics/LinearGradient;", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lwvz;", Constants.KEY_DATA, "bindData", "(Lwvz;)V", "release", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "progressPaint", "", "defaultGradientColors", "[I", "defaultBackgroundColor", CA20Status.STATUS_USER_I, "maxProgress", "F", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "padding", "", "isInited", "Z", "sweepAngle", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoyaltyProgressView extends View {
    private final Paint backgroundPaint;
    private final int defaultBackgroundColor;
    private final int[] defaultGradientColors;
    private boolean isInited;
    private final float maxProgress;
    private float padding;
    private final Paint progressPaint;
    private final RectF rectF;
    private float sweepAngle;

    public LoyaltyProgressView(Context context) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.progressPaint = new Paint(1);
        this.defaultGradientColors = new int[]{Color.parseColor("#FF5C4D"), Color.parseColor("#EB469F"), Color.parseColor("#8341EF"), Color.parseColor("#3F68F9")};
        this.defaultBackgroundColor = -1;
        this.maxProgress = 100.0f;
        this.rectF = new RectF();
    }

    private final void configurePaints(int backgroundColor, float backgroundStrokeWidth, float progressStrokeWidth, vvz progressArcColor) {
        Paint paint = this.backgroundPaint;
        paint.setColor(backgroundColor);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(backgroundStrokeWidth);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint paint2 = this.progressPaint;
        paint2.setStyle(style);
        paint2.setStrokeWidth(progressStrokeWidth);
        paint2.setStrokeCap(cap);
        if (progressArcColor instanceof uvz) {
            paint2.setColor(createSolidColorInt(((uvz) progressArcColor).a));
        } else if (!(progressArcColor instanceof tvz)) {
            w511.b();
        } else {
            tvz tvzVar = (tvz) progressArcColor;
            paint2.setShader(createLinearGradientShader(tvzVar.a, tvzVar.b));
        }
    }

    private final LinearGradient createLinearGradientShader(List<? extends kdc> arcProgressColors, List<Float> arcProgressColorPositions) {
        int[] iArr;
        if (arcProgressColors.size() <= 1) {
            arcProgressColors = null;
        }
        if (arcProgressColors != null) {
            List<? extends kdc> list = arcProgressColors;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(s8o.m((kdc) it.next(), getContext())));
            }
            iArr = kotlin.collections.a.I0(arrayList);
        } else {
            iArr = this.defaultGradientColors;
        }
        float height = getHeight() / 2.0f;
        return new LinearGradient(0.0f, height, getWidth(), height, iArr, arcProgressColorPositions != null ? kotlin.collections.a.G0(arcProgressColorPositions) : null, Shader.TileMode.REPEAT);
    }

    private final int createSolidColorInt(kdc arcProgressColor) {
        return arcProgressColor != null ? s8o.m(arcProgressColor, getContext()) : this.defaultBackgroundColor;
    }

    private final void updateRect() {
        RectF rectF = this.rectF;
        float f = this.padding;
        rectF.set(f, f, getWidth() - this.padding, getHeight() - this.padding);
    }

    public final void bindData(wvz data) {
        this.sweepAngle = (y6i0.c(data.a, 0.0f, this.maxProgress) / this.maxProgress) * 360.0f;
        float w = tje.w(data.d, getContext());
        this.padding = w / 2.0f;
        updateRect();
        configurePaints(createSolidColorInt(data.b), w, tje.w(data.e, getContext()), data.c);
        this.isInited = true;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isInited) {
            canvas.drawArc(this.rectF, 0.0f, 360.0f, false, this.backgroundPaint);
            float f = this.sweepAngle;
            if (f > 0.0f) {
                canvas.drawArc(this.rectF, -90.0f, f, false, this.progressPaint);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int min = Math.min(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        if (this.isInited) {
            updateRect();
        }
    }

    public final void release() {
        this.isInited = false;
    }
}
