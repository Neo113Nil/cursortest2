package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivBorder;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ax01;
import defpackage.bcl;
import defpackage.e06;
import defpackage.ecl;
import defpackage.fgr0;
import defpackage.ggr0;
import defpackage.gwk0;
import defpackage.i3y;
import defpackage.jkk;
import defpackage.jnk;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.m8l;
import defpackage.nfh;
import defpackage.ogk;
import defpackage.pgk;
import defpackage.rvo;
import defpackage.scc;
import defpackage.sls;
import defpackage.uvo;
import defpackage.vsg0;
import defpackage.w511;
import defpackage.wfx;
import defpackage.x4l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements uvo {
    public float A;
    public float[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final Div2View a;
    public final View b;
    public DivBorder c;
    public final nfh w;
    public final i3y x;
    public final i3y y;
    public final DivBorderDrawer$RoundedRectOutlineProvider z;

    public a(View view, Div2View div2View) {
        this.a = div2View;
        this.b = view;
        nfh nfhVar = new nfh();
        nfhVar.c = this;
        nfhVar.a = new Path();
        nfhVar.b = new RectF();
        this.w = nfhVar;
        this.x = kotlin.a.a(new sls() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$borderParams$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new ogk(a.this);
            }
        });
        this.y = kotlin.a.a(new sls() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$shadowParams$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new pgk(a.this);
            }
        });
        this.z = new DivBorderDrawer$RoundedRectOutlineProvider(0.0f, 1, null);
        this.G = true;
        this.H = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ba, code lost:
    
        if ((r5.getParent() instanceof com.yandex.div.core.view2.divs.widgets.DivFrameLayout) == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(DivBorder divBorder, rvo rvoVar) {
        float f;
        float[] fArr;
        boolean z;
        View view;
        x4l x4lVar;
        jnk jnkVar;
        x4l x4lVar2;
        jnk jnkVar2;
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        boolean z2;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        bcl bclVar;
        bcl bclVar2;
        Expression expression9;
        bcl bclVar3;
        DisplayMetrics e = e();
        float I = (divBorder == null || (bclVar3 = divBorder.e) == null) ? 0.0f : gwk0.I(bclVar3, rvoVar, e);
        this.A = I;
        boolean z3 = true;
        boolean z4 = I > 0.0f;
        this.D = z4;
        if (z4) {
            int intValue = (divBorder == null || (bclVar2 = divBorder.e) == null || (expression9 = bclVar2.a) == null) ? 0 : ((Number) expression9.a(rvoVar)).intValue();
            i3y i3yVar = this.x;
            ogk ogkVar = (ogk) i3yVar.getValue();
            float f2 = this.A;
            Paint paint = ogkVar.a;
            paint.setStrokeWidth(Math.min(ogkVar.d, Math.max(1.0f, ogkVar.h.A * 0.1f)) + f2);
            paint.setColor(intValue);
            ((ogk) i3yVar.getValue()).c = ((divBorder == null || (bclVar = divBorder.e) == null) ? null : bclVar.b) instanceof ecl;
        }
        View view2 = this.b;
        if (divBorder != null) {
            float p = com.yandex.div.core.view2.divs.a.p(Integer.valueOf(view2.getWidth()), e);
            float p2 = com.yandex.div.core.view2.divs.a.p(Integer.valueOf(view2.getHeight()), e);
            jkk jkkVar = divBorder.b;
            Expression expression10 = divBorder.a;
            if (jkkVar == null || (expression5 = jkkVar.c) == null) {
                expression5 = expression10;
            }
            float o = com.yandex.div.core.view2.divs.a.o(expression5 != null ? (Long) expression5.a(rvoVar) : null, e);
            if (jkkVar == null || (expression6 = jkkVar.d) == null) {
                expression6 = expression10;
            }
            float o2 = com.yandex.div.core.view2.divs.a.o(expression6 != null ? (Long) expression6.a(rvoVar) : null, e);
            f = 0.0f;
            if (jkkVar == null || (expression7 = jkkVar.a) == null) {
                expression7 = expression10;
            }
            float o3 = com.yandex.div.core.view2.divs.a.o(expression7 != null ? (Long) expression7.a(rvoVar) : null, e);
            if (jkkVar != null && (expression8 = jkkVar.b) != null) {
                expression10 = expression8;
            }
            float o4 = com.yandex.div.core.view2.divs.a.o(expression10 != null ? (Long) expression10.a(rvoVar) : null, e);
            Float f3 = (Float) Collections.min(scc.g(Float.valueOf(p / (o + o2)), Float.valueOf(p / (o3 + o4)), Float.valueOf(p2 / (o + o3)), Float.valueOf(p2 / (o2 + o4))));
            if (f3.floatValue() > 0.0f && f3.floatValue() < 1.0f) {
                o *= f3.floatValue();
                o2 *= f3.floatValue();
                o3 *= f3.floatValue();
                o4 *= f3.floatValue();
            }
            fArr = new float[]{o, o, o2, o2, o4, o4, o3, o3};
        } else {
            f = 0.0f;
            fArr = null;
        }
        this.B = fArr;
        if (fArr == null) {
            z = false;
        } else {
            if (fArr.length == 0) {
                w511.i("Array is empty.");
                return;
            }
            float f4 = fArr[0];
            int length = fArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                } else {
                    if (!Float.valueOf(fArr[i]).equals(Float.valueOf(f4))) {
                        z2 = false;
                        break;
                    }
                    i++;
                }
            }
            z = !z2;
        }
        this.C = z;
        boolean z5 = this.E;
        boolean booleanValue = (divBorder == null || (expression4 = divBorder.c) == null) ? false : ((Boolean) expression4.a(rvoVar)).booleanValue();
        this.F = booleanValue;
        if (booleanValue) {
            if ((divBorder != null ? divBorder.d : null) == null) {
            }
            this.E = z3;
            view2.setElevation((this.F && !z3) ? view2.getContext().getResources().getDimension(vsg0.div_shadow_elevation) : f);
            if (this.E) {
                pgk f5 = f();
                m8l m8lVar = divBorder != null ? divBorder.d : null;
                f5.b = (m8lVar == null || (expression3 = m8lVar.b) == null) ? f5.a : com.yandex.div.core.view2.divs.a.q(Long.valueOf(((Number) expression3.a(rvoVar)).longValue()), f5.j.e());
                f5.c = (m8lVar == null || (expression2 = m8lVar.c) == null) ? ModalContentViewContainer.BASE_SHADOW_COLOR : ((Number) expression2.a(rvoVar)).intValue();
                f5.d = (m8lVar == null || (expression = m8lVar.a) == null) ? 0.14f : (float) ((Number) expression.a(rvoVar)).doubleValue();
                f5.h = ((m8lVar == null || (x4lVar2 = m8lVar.d) == null || (jnkVar2 = x4lVar2.a) == null) ? com.yandex.div.core.view2.divs.a.p(Float.valueOf(f), r6) : com.yandex.div.core.view2.divs.a.G(jnkVar2, r6, rvoVar)) - f5.b;
                f5.i = ((m8lVar == null || (x4lVar = m8lVar.d) == null || (jnkVar = x4lVar.b) == null) ? com.yandex.div.core.view2.divs.a.p(Float.valueOf(0.5f), r6) : com.yandex.div.core.view2.divs.a.G(jnkVar, r6, rvoVar)) - f5.b;
            }
            g();
            if (!this.E || z5) {
                Object parent = view2.getParent();
                view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        z3 = false;
        this.E = z3;
        if (this.F) {
            view2.setElevation((this.F && !z3) ? view2.getContext().getResources().getDimension(vsg0.div_shadow_elevation) : f);
            if (this.E) {
            }
            g();
            if (this.E) {
            }
            Object parent2 = view2.getParent();
            if (parent2 instanceof View) {
            }
            if (view != null) {
            }
        }
        view2.setElevation((this.F && !z3) ? view2.getContext().getResources().getDimension(vsg0.div_shadow_elevation) : f);
        if (this.E) {
        }
        g();
        if (this.E) {
        }
        Object parent22 = view2.getParent();
        if (parent22 instanceof View) {
        }
        if (view != null) {
        }
    }

    public final void b(Canvas canvas) {
        if (i()) {
            canvas.clipPath((Path) this.w.a);
        }
    }

    public final void c(Canvas canvas) {
        if (this.D) {
            i3y i3yVar = this.x;
            canvas.drawPath(((ogk) i3yVar.getValue()).b, ((ogk) i3yVar.getValue()).a);
        }
    }

    public final void d(Canvas canvas) {
        View view = this.b;
        if (kp50.D(view)) {
            Object parent = view.getParent();
            if (!(parent instanceof ax01) || !kp50.D((View) parent)) {
                return;
            }
        }
        if (this.E) {
            float f = f().h;
            float f2 = f().i;
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                NinePatch ninePatch = f().g;
                if (ninePatch != null) {
                    ninePatch.draw(canvas, f().f, f().e);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final DisplayMetrics e() {
        return this.b.getResources().getDisplayMetrics();
    }

    public final pgk f() {
        return (pgk) this.y.getValue();
    }

    public final void g() {
        float[] fArr;
        NinePatch ninePatch;
        DashPathEffect dashPathEffect;
        float[] fArr2 = this.B;
        if (fArr2 != null && (fArr = (float[]) fArr2.clone()) != null) {
            this.w.w(fArr);
            float f = this.A / 2.0f;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = Math.max(0.0f, fArr[i] - f);
            }
            NinePatch ninePatch2 = null;
            if (this.D) {
                ogk ogkVar = (ogk) this.x.getValue();
                a aVar = ogkVar.h;
                float f2 = aVar.A;
                View view = aVar.b;
                float min = (f2 - Math.min(ogkVar.d, Math.max(1.0f, 0.1f * f2))) / 2.0f;
                float width = view.getWidth();
                float height = view.getHeight();
                RectF rectF = ogkVar.g;
                rectF.set(min, min, width - min, height - min);
                Path path = ogkVar.b;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = ogkVar.a;
                if (ogkVar.c) {
                    float height2 = (rectF.height() * 2.0f) + (rectF.width() * 2.0f);
                    if (fArr.length != 8) {
                        int i2 = wfx.a;
                    } else {
                        int v = jx81.v(0, fArr.length - 1, 2);
                        if (v >= 0) {
                            int i3 = 0;
                            while (true) {
                                float f3 = fArr[i3];
                                height2 = ((height2 - f3) - fArr[i3 + 1]) + ((float) (Math.sqrt(((r15 * r15) + (f3 * f3)) / 8.0d) * 3.141592653589793d));
                                if (i3 == v) {
                                    break;
                                } else {
                                    i3 += 2;
                                }
                            }
                        }
                        if (height2 < 0.0f) {
                            height2 = 0.0f;
                        }
                    }
                    float f4 = ogkVar.f;
                    float f5 = ogkVar.e;
                    if (height2 > 0.0f) {
                        float f6 = f5 + f4;
                        float f7 = (int) (height2 / f6);
                        float f8 = height2 - (f6 * f7);
                        f5 += ((f8 * f5) / f6) / f7;
                        f4 += ((f8 * f4) / f6) / f7;
                    }
                    dashPathEffect = new DashPathEffect(new float[]{f5, f4}, 0.0f);
                } else {
                    dashPathEffect = null;
                }
                paint.setPathEffect(dashPathEffect);
            }
            if (this.E) {
                pgk f9 = f();
                Rect rect = f9.f;
                a aVar2 = f9.j;
                View view2 = aVar2.b;
                rect.set(0, 0, (int) ((f9.b * 2.0f) + view2.getWidth()), (int) ((f9.b * 2.0f) + view2.getHeight()));
                Paint paint2 = f9.e;
                paint2.setColor(f9.c);
                paint2.setAlpha((int) (view2.getAlpha() * f9.d * 255.0f));
                Paint paint3 = ggr0.a;
                float f10 = f9.b;
                e06 m = aVar2.a.getDiv2Component().m();
                fgr0 fgr0Var = new fgr0(fArr, f10);
                LinkedHashMap linkedHashMap = ggr0.b;
                NinePatch ninePatch3 = (NinePatch) linkedHashMap.get(fgr0Var);
                if (ninePatch3 == null) {
                    float max = Math.max(fArr[1] + fArr[2], fArr[5] + fArr[6]) + f10;
                    float max2 = Math.max(fArr[0] + fArr[7], fArr[3] + fArr[4]) + f10;
                    if (max <= 0.0f || max2 <= 0.0f) {
                        ninePatch = null;
                    } else {
                        float d = m.d(f10);
                        float c = m.c(f10);
                        float f11 = f10 * 2.0f;
                        Bitmap createBitmap = Bitmap.createBitmap((int) ((max + f11) * c), (int) ((f11 + max2) * c), Bitmap.Config.ALPHA_8);
                        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
                        roundRectShape.resize(max, max2);
                        Canvas canvas = new Canvas();
                        canvas.setBitmap(createBitmap);
                        int save = canvas.save();
                        canvas.translate(d, d);
                        try {
                            save = canvas.save();
                            canvas.scale(c, c, 0.0f, 0.0f);
                            try {
                                roundRectShape.draw(canvas, ggr0.a);
                                canvas.restoreToCount(save);
                                Bitmap b = m.b(d, createBitmap);
                                createBitmap.recycle();
                                if (c < 1.0f) {
                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(b, (int) (b.getWidth() / c), (int) (b.getHeight() / c), true);
                                    b.recycle();
                                    b = createScaledBitmap;
                                }
                                int width2 = b.getWidth();
                                int height3 = b.getHeight() / 2;
                                int i4 = width2 / 2;
                                ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                                order.put((byte) 1);
                                order.put((byte) 2);
                                order.put((byte) 2);
                                order.put((byte) 9);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(0);
                                order.putInt(i4 - 1);
                                order.putInt(i4 + 1);
                                order.putInt(height3 - 1);
                                order.putInt(height3 + 1);
                                for (int i5 = 0; i5 < 9; i5++) {
                                    order.putInt(1);
                                }
                                ninePatch = new NinePatch(b, order.array());
                            } finally {
                                canvas.restoreToCount(save);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (ninePatch != null) {
                        linkedHashMap.put(fgr0Var, ninePatch);
                        ninePatch2 = ninePatch;
                    }
                } else {
                    ninePatch2 = ninePatch3;
                }
                f9.g = ninePatch2;
            }
        }
        h();
    }

    @Override // defpackage.uvo
    public final List getSubscriptions() {
        return this.H;
    }

    public final void h() {
        float f;
        boolean i = i();
        ViewOutlineProvider viewOutlineProvider = null;
        View view = this.b;
        if (i) {
            view.setClipToOutline(false);
            if (!this.E && !kp50.D(view)) {
                viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
            }
            view.setOutlineProvider(viewOutlineProvider);
            return;
        }
        float[] fArr = this.B;
        if (fArr == null) {
            f = 0.0f;
        } else {
            if (fArr.length == 0) {
                w511.i("Array is empty.");
                return;
            }
            f = fArr[0];
        }
        if (f != 0.0f) {
            DivBorderDrawer$RoundedRectOutlineProvider divBorderDrawer$RoundedRectOutlineProvider = this.z;
            divBorderDrawer$RoundedRectOutlineProvider.setCornerRadius(f);
            view.setOutlineProvider(divBorderDrawer$RoundedRectOutlineProvider);
            view.setClipToOutline(this.G);
            return;
        }
        view.setClipToOutline(false);
        if (!this.E && !kp50.D(view)) {
            viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        }
        view.setOutlineProvider(viewOutlineProvider);
    }

    public final boolean i() {
        if (!this.G) {
            return false;
        }
        if (this.a.getForceCanvasClipping() || this.E) {
            return true;
        }
        return (!this.F && (this.C || this.D)) || kp50.D(this.b);
    }
}
