package com.lightside.cookies.android.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.d6w;
import defpackage.m810;
import defpackage.vf31;
import defpackage.xf31;
import defpackage.y6i0;
import defpackage.zf31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00026(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR*\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00107\u001a\b\u0018\u000106R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/lightside/cookies/android/views/VerticalSeekView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "value", "mainColor", CA20Status.STATUS_USER_I, "getMainColor", "()I", "setMainColor", "(I)V", "inactiveColor", "getInactiveColor", "setInactiveColor", "Ld6w;", "newRange", "range", "Ld6w;", "getRange", "()Ld6w;", "setRange", "(Ld6w;)V", "getValue", "setValue", "Lvf31;", "seekListener", "Lvf31;", "getSeekListener", "()Lvf31;", "setSeekListener", "(Lvf31;)V", "Landroid/graphics/Paint;", "activePaint", "Landroid/graphics/Paint;", "inactivePaint", "Landroid/graphics/drawable/ShapeDrawable;", "roundRectDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Lxf31;", "seekSession", "Lxf31;", "", "newPosition", "getPosition", "()F", "setPosition", "(F)V", "position", "android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalSeekView extends View {
    private final Paint activePaint;
    private int inactiveColor;
    private final Paint inactivePaint;
    private int mainColor;
    private d6w range;
    private final ShapeDrawable roundRectDrawable;
    private vf31 seekListener;
    private xf31 seekSession;
    private int value;

    public VerticalSeekView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mainColor = -7829368;
        this.inactiveColor = -1;
        this.range = new d6w(0, 100, 1);
        Paint paint = new Paint(1);
        paint.setColor(this.mainColor);
        this.activePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(this.inactiveColor);
        this.inactivePaint = paint2;
        float f = zf31.d;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(this.mainColor);
        this.roundRectDrawable = shapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPosition() {
        float f = this.value;
        d6w d6wVar = this.range;
        return f / (((Number) d6wVar.d()).intValue() - ((Number) d6wVar.e()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPosition(float f) {
        setValue(m810.b(f * (((Number) r0.d()).intValue() - ((Number) r0.e()).intValue())) + this.range.a);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == 0) {
            this.seekSession = new xf31(this);
        }
        xf31 xf31Var = this.seekSession;
        if (xf31Var == null) {
            return false;
        }
        VerticalSeekView verticalSeekView = xf31Var.b;
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                xf31Var.a(event.getY());
                verticalSeekView.getSeekListener();
                verticalSeekView.seekSession = null;
                return true;
            }
            if (action != 2) {
                if (action != 3) {
                    return false;
                }
                verticalSeekView.setPosition(xf31Var.a);
                verticalSeekView.getSeekListener();
                verticalSeekView.seekSession = null;
                return true;
            }
        }
        xf31Var.a(event.getY());
        return true;
    }

    public final int getInactiveColor() {
        return this.inactiveColor;
    }

    public final int getMainColor() {
        return this.mainColor;
    }

    public final d6w getRange() {
        return this.range;
    }

    public final vf31 getSeekListener() {
        return null;
    }

    public final int getValue() {
        return this.value;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int width = getWidth() - paddingRight;
        int height = getHeight() - paddingBottom;
        int i = zf31.a;
        float paddingLeft = (width / 2.0f) + getPaddingLeft();
        float f = paddingLeft - (i / 2);
        float position = ((1.0f - getPosition()) * height) + getPaddingTop();
        float f2 = f + i;
        canvas.drawRect(f, getPaddingTop(), f2, position, this.inactivePaint);
        canvas.drawRect(f, position, f2, getHeight() - getPaddingBottom(), this.activePaint);
        canvas.drawCircle(paddingLeft, position, this.seekSession == null ? zf31.b : zf31.c, this.activePaint);
    }

    public final void setInactiveColor(int i) {
        this.inactiveColor = i;
        this.inactivePaint.setColor(i);
        invalidate();
    }

    public final void setMainColor(int i) {
        this.mainColor = i;
        this.activePaint.setColor(i);
        this.roundRectDrawable.getPaint().setColor(i);
        invalidate();
    }

    public final void setRange(d6w d6wVar) {
        float position = getPosition();
        this.range = d6wVar;
        setPosition(position);
    }

    public final void setSeekListener(vf31 vf31Var) {
    }

    public final void setValue(int i) {
        this.value = y6i0.e(i, this.range);
        invalidate();
    }

    public VerticalSeekView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ VerticalSeekView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public VerticalSeekView(Context context) {
        this(context, null, 0, 6, null);
    }
}
