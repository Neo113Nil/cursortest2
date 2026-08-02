package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ColorPickerView.java */
/* loaded from: classes12.dex */
public final class j7g extends View {
    public int b;
    public float c;
    public float d;
    public final Integer[] e;
    public int f;
    public Integer g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public t5g l;
    public final ArrayList<c380> m;
    public final d7g n;
    public g9g o;

    public j7g(Context context) {
        super(context);
        this.b = 10;
        this.c = 1.0f;
        this.d = 1.0f;
        this.e = new Integer[]{null, null, null, null, null};
        this.f = 0;
        Paint paint = gg90.a().a;
        paint.setColor(0);
        this.h = paint;
        Paint paint2 = gg90.a().a;
        paint2.setColor(-1);
        this.i = paint2;
        Paint paint3 = gg90.a().a;
        paint3.setColor(-16777216);
        this.j = paint3;
        this.k = gg90.a().a;
        this.m = new ArrayList<>();
        setImportantForAccessibility(1);
        d7g d7gVar = new d7g(this);
        this.n = d7gVar;
        iut0.q(this, d7gVar);
    }

    private void setHighlightedColor(int i) {
        throw null;
    }

    public final t5g a(int i) {
        Color.colorToHSV(i, new float[3]);
        boolean z = true;
        boolean z2 = false;
        double d = 3.141592653589793d;
        double d2 = 180.0d;
        double cos = Math.cos((r0[0] * 3.141592653589793d) / 180.0d) * r0[1];
        double sin = Math.sin((r0[0] * 3.141592653589793d) / 180.0d) * r0[1];
        Iterator it = this.o.a().iterator();
        t5g t5gVar = null;
        double d3 = Double.MAX_VALUE;
        while (it.hasNext()) {
            t5g t5gVar2 = (t5g) it.next();
            boolean z3 = z;
            float[] fArr = t5gVar2.d;
            boolean z4 = z2;
            double d4 = d;
            double d5 = d2;
            double cos2 = Math.cos((fArr[z4 ? 1 : 0] * d4) / d5) * fArr[z3 ? 1 : 0];
            double d6 = cos - cos2;
            double sin2 = sin - (Math.sin((fArr[z4 ? 1 : 0] * d4) / d5) * fArr[z3 ? 1 : 0]);
            double d7 = (sin2 * sin2) + (d6 * d6);
            if (d7 < d3) {
                d3 = d7;
                t5gVar = t5gVar2;
            }
            z = z3 ? 1 : 0;
            z2 = z4 ? 1 : 0;
            d = d4;
            d2 = d5;
        }
        return t5gVar;
    }

    public final t5g b(float f, float f2) {
        Iterator it = this.o.a().iterator();
        t5g t5gVar = null;
        double d = Double.MAX_VALUE;
        while (it.hasNext()) {
            t5g t5gVar2 = (t5g) it.next();
            double d2 = t5gVar2.a - f;
            double d3 = t5gVar2.b - f2;
            double d4 = (d3 * d3) + (d2 * d2);
            if (d > d4) {
                t5gVar = t5gVar2;
                d = d4;
            }
        }
        return t5gVar;
    }

    public final void c() {
        int selectedColor = getSelectedColor();
        ArrayList<c380> arrayList = this.m;
        if (arrayList != null) {
            Iterator<c380> it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(selectedColor);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.n.c.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public Integer[] getAllColors() {
        return this.e;
    }

    public List<t5g> getColorCircleList() {
        return this.o.a();
    }

    public int getSelectedColor() {
        t5g t5gVar = this.l;
        return ((t5gVar != null ? Color.HSVToColor(t5gVar.a(this.c)) : 0) & 16777215) | (Math.round(this.d * 255.0f) << 24);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        if (this.o != null) {
            float width = canvas.getWidth() / 2.0f;
            float f = (width - 2.05f) - (width / this.b);
            float f2 = (f / (r4 - 1)) / 2.0f;
            f9g c = this.o.c();
            c.a = this.b;
            c.b = f;
            c.c = f2;
            c.d = 2.05f;
            c.e = this.d;
            c.f = this.c;
            c.g = canvas;
            this.o.b(c);
            this.o.draw();
            Integer num = this.g;
            if (num != null) {
                this.l = a(num.intValue());
                float[] fArr = new float[3];
                Color.colorToHSV(this.g.intValue(), fArr);
                t5g t5gVar = this.l;
                t5gVar.b(t5gVar.a, t5gVar.b, t5gVar.c, fArr);
                this.g = null;
            }
        }
        t5g t5gVar2 = this.l;
        if (t5gVar2 != null) {
            this.l = a(t5gVar2.f);
            float width2 = (((canvas.getWidth() / 2.0f) - 2.05f) / this.b) / 2.0f;
            int HSVToColor = Color.HSVToColor(this.l.a(this.c));
            Paint paint = this.h;
            paint.setColor(HSVToColor);
            paint.setAlpha((int) (this.d * 255.0f));
            t5g t5gVar3 = this.l;
            canvas.drawCircle(t5gVar3.a, t5gVar3.b, 2.0f * width2, this.i);
            t5g t5gVar4 = this.l;
            canvas.drawCircle(t5gVar4.a, t5gVar4.b, 1.5f * width2, this.j);
            t5g t5gVar5 = this.l;
            canvas.drawCircle(t5gVar5.a, t5gVar5.b, width2, this.k);
            t5g t5gVar6 = this.l;
            canvas.drawCircle(t5gVar6.a, t5gVar6.b, width2, paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = mode == 0 ? i : mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i) : mode == 1073741824 ? View.MeasureSpec.getSize(i) : 0;
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i = mode2 == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : mode == 1073741824 ? View.MeasureSpec.getSize(i2) : 0;
        }
        if (i < size) {
            size = i;
        }
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r0 != 2) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                c();
            }
            return true;
        }
        this.l = b(motionEvent.getX(), motionEvent.getY());
        invalidate();
        return true;
    }

    public void setAlphaValue(float f) {
        this.d = f;
        this.g = Integer.valueOf(Color.HSVToColor(Math.round(f * 255.0f), this.l.a(this.c)));
        invalidate();
    }

    public void setColor(int i) {
        setInitialColor(i);
        invalidate();
    }

    public void setCurrentColorCircle(t5g t5gVar) {
        this.l = t5gVar;
    }

    public void setDensity(int i) {
        this.b = Math.max(2, i);
        invalidate();
    }

    public void setInitialColor(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.d = Color.alpha(i) / 255.0f;
        this.c = fArr[2];
        this.e[this.f] = Integer.valueOf(i);
        this.g = Integer.valueOf(i);
        if (this.o.a() != null) {
            this.l = a(i);
        }
    }

    public void setLightness(float f) {
        this.c = f;
        this.g = Integer.valueOf(Color.HSVToColor(Math.round(this.d * 255.0f), this.l.a(f)));
        invalidate();
    }

    public void setRenderer(g9g g9gVar) {
        this.o = g9gVar;
        invalidate();
    }

    public void setSelectedColor(int i) {
        Integer[] numArr = this.e;
        if (numArr == null || numArr.length < i) {
            return;
        }
        this.f = i;
        setHighlightedColor(i);
        Integer num = numArr[i];
        if (num == null) {
            return;
        }
        setColor(num.intValue());
    }
}
