package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.core.graphics.BlendModeCompat;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask$MaskMode;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import com.airbnb.lottie.utils.a;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l35 implements ccm, e35, tix {
    public float A;
    public BlurMaskFilter B;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final LPaint d = new LPaint(1);
    public final LPaint e;
    public final LPaint f;
    public final LPaint g;
    public final LPaint h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final LottieDrawable o;
    public final mxx p;
    public final jb7 q;
    public final kor r;
    public l35 s;
    public l35 t;
    public List u;
    public final ArrayList v;
    public final iw01 w;
    public boolean x;
    public boolean y;
    public LPaint z;

    public l35(LottieDrawable lottieDrawable, mxx mxxVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new LPaint(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new LPaint(1, mode2);
        LPaint lPaint = new LPaint(1);
        this.g = lPaint;
        this.h = new LPaint(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = lottieDrawable;
        this.p = mxxVar;
        List list = mxxVar.h;
        if (mxxVar.u == Layer$MatteType.INVERT) {
            lPaint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            lPaint.setXfermode(new PorterDuffXfermode(mode));
        }
        ge2 ge2Var = mxxVar.i;
        ge2Var.getClass();
        iw01 iw01Var = new iw01(ge2Var);
        this.w = iw01Var;
        iw01Var.b(this);
        if (list != null && !list.isEmpty()) {
            jb7 jb7Var = new jb7(list);
            this.q = jb7Var;
            Iterator it = ((ArrayList) jb7Var.b).iterator();
            while (it.hasNext()) {
                ((i35) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.q.c).iterator();
            while (it2.hasNext()) {
                i35 i35Var = (i35) it2.next();
                c(i35Var);
                i35Var.a(this);
            }
        }
        mxx mxxVar2 = this.p;
        if (mxxVar2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        kor korVar = new kor(mxxVar2.t);
        this.r = korVar;
        korVar.b = true;
        korVar.a(new hw01(3, this));
        boolean z = ((Float) this.r.f()).floatValue() == 1.0f;
        if (z != this.x) {
            this.x = z;
            this.o.invalidateSelf();
        }
        c(this.r);
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        l35 l35Var = this.s;
        mxx mxxVar = this.p;
        if (l35Var != null) {
            six a = sixVar2.a(l35Var.p.c);
            if (sixVar.b(i, this.s.p.c)) {
                arrayList.add(a.g(this.s));
            }
            if (sixVar.e(i, this.s.p.c) && sixVar.f(i, mxxVar.c)) {
                this.s.n(sixVar, sixVar.d(i, this.s.p.c) + i, arrayList, a);
            }
        }
        String str = mxxVar.c;
        String str2 = mxxVar.c;
        if (sixVar.e(i, str)) {
            if (!"__container".equals(str2)) {
                sixVar2 = sixVar2.a(str2);
                if (sixVar.b(i, str2)) {
                    arrayList.add(sixVar2.g(this));
                }
            }
            if (sixVar.f(i, str2)) {
                n(sixVar, sixVar.d(i, str2) + i, arrayList, sixVar2);
            }
        }
    }

    @Override // defpackage.ccm
    public void b(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((l35) this.u.get(size)).w.e());
                }
            } else {
                l35 l35Var = this.t;
                if (l35Var != null) {
                    matrix2.preConcat(l35Var.w.e());
                }
            }
        }
        matrix2.preConcat(this.w.e());
    }

    public final void c(i35 i35Var) {
        if (i35Var == null) {
            return;
        }
        this.v.add(i35Var);
    }

    @Override // defpackage.e35
    public final void d() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
    }

    @Override // defpackage.ccm
    public final void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        float f;
        int i2;
        int i3;
        LPaint lPaint;
        BlendModeCompat blendModeCompat;
        float f2;
        Integer num;
        AsyncUpdates asyncUpdates = upx.a;
        if (this.x) {
            mxx mxxVar = this.p;
            boolean z = mxxVar.v;
            LBlendMode lBlendMode = mxxVar.y;
            if (z) {
                return;
            }
            h();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((l35) this.u.get(size)).w.e());
            }
            AsyncUpdates asyncUpdates2 = upx.a;
            iw01 iw01Var = this.w;
            i35 i35Var = iw01Var.p;
            int intValue = (int) ((((i / 255.0f) * ((i35Var == null || (num = (Integer) i35Var.f()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !k() && lBlendMode == LBlendMode.NORMAL) {
                matrix2.preConcat(iw01Var.e());
                i(canvas, matrix2, intValue, aVar);
                l();
                return;
            }
            RectF rectF = this.i;
            b(rectF, matrix2, false);
            if (this.s != null && mxxVar.u != Layer$MatteType.INVERT) {
                RectF rectF2 = this.l;
                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.b(rectF2, matrix, true);
                if (!rectF.intersect(rectF2)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(iw01Var.e());
            RectF rectF3 = this.k;
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean k = k();
            jb7 jb7Var = this.q;
            Path path = this.a;
            if (k) {
                int size2 = ((List) jb7Var.w).size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        cy00 cy00Var = (cy00) ((List) jb7Var.w).get(i4);
                        Path path2 = (Path) ((i35) ((ArrayList) jb7Var.b).get(i4)).f();
                        if (path2 != null) {
                            path.set(path2);
                            path.transform(matrix2);
                            i2 = size2;
                            int i5 = k35.b[cy00Var.a.ordinal()];
                            if (i5 == 1 || i5 == 2 || ((i5 == 3 || i5 == 4) && cy00Var.d)) {
                                break;
                            }
                            RectF rectF4 = this.m;
                            path.computeBounds(rectF4, false);
                            if (i4 == 0) {
                                rectF3.set(rectF4);
                            } else {
                                i3 = i4;
                                rectF3.set(Math.min(rectF3.left, rectF4.left), Math.min(rectF3.top, rectF4.top), Math.max(rectF3.right, rectF4.right), Math.max(rectF3.bottom, rectF4.bottom));
                                i4 = i3 + 1;
                                size2 = i2;
                            }
                        } else {
                            i2 = size2;
                        }
                        i3 = i4;
                        i4 = i3 + 1;
                        size2 = i2;
                    } else if (!rectF.intersect(rectF3)) {
                        f = 0.0f;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            f = 0.0f;
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF.intersect(rectF5)) {
                rectF.set(f, f, f, f);
            }
            AsyncUpdates asyncUpdates3 = upx.a;
            if (rectF.width() >= 1.0f && rectF.height() >= 1.0f) {
                LPaint lPaint2 = this.d;
                lPaint2.setAlpha(255);
                lBlendMode.getClass();
                switch (vpx.a[lBlendMode.ordinal()]) {
                    case 2:
                        blendModeCompat = BlendModeCompat.MULTIPLY;
                        break;
                    case 3:
                        blendModeCompat = BlendModeCompat.SCREEN;
                        break;
                    case 4:
                        blendModeCompat = BlendModeCompat.OVERLAY;
                        break;
                    case 5:
                        blendModeCompat = BlendModeCompat.DARKEN;
                        break;
                    case 6:
                        blendModeCompat = BlendModeCompat.LIGHTEN;
                        break;
                    case 7:
                        blendModeCompat = BlendModeCompat.PLUS;
                        break;
                    default:
                        blendModeCompat = null;
                        break;
                }
                int i6 = la90.a;
                lPaint2.setBlendMode(blendModeCompat != null ? y5e.G(blendModeCompat) : null);
                zw21.e(canvas, rectF, lPaint2);
                LBlendMode lBlendMode2 = LBlendMode.MULTIPLY;
                LPaint lPaint3 = this.h;
                if (lBlendMode != lBlendMode2) {
                    f2 = 1.0f;
                    canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, lPaint3);
                } else {
                    f2 = 1.0f;
                }
                i(canvas, matrix2, intValue, aVar);
                if (k()) {
                    LPaint lPaint4 = this.e;
                    canvas.saveLayer(rectF, lPaint4);
                    int i7 = 0;
                    while (true) {
                        List list = (List) jb7Var.w;
                        ArrayList arrayList = (ArrayList) jb7Var.b;
                        if (i7 < list.size()) {
                            cy00 cy00Var2 = (cy00) list.get(i7);
                            i35 i35Var2 = (i35) arrayList.get(i7);
                            i35 i35Var3 = (i35) ((ArrayList) jb7Var.c).get(i7);
                            int[] iArr = k35.b;
                            int i8 = i7;
                            Mask$MaskMode mask$MaskMode = cy00Var2.a;
                            boolean z2 = cy00Var2.d;
                            int i9 = iArr[mask$MaskMode.ordinal()];
                            if (i9 != 1) {
                                LPaint lPaint5 = this.f;
                                if (i9 == 2) {
                                    if (i8 == 0) {
                                        lPaint2.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
                                        lPaint2.setAlpha(255);
                                        canvas.drawRect(rectF, lPaint2);
                                    }
                                    if (z2) {
                                        zw21.e(canvas, rectF, lPaint5);
                                        canvas.drawRect(rectF, lPaint2);
                                        lPaint5.setAlpha((int) (((Integer) i35Var3.f()).intValue() * 2.55f));
                                        path.set((Path) i35Var2.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, lPaint5);
                                        canvas.restore();
                                    } else {
                                        path.set((Path) i35Var2.f());
                                        path.transform(matrix2);
                                        canvas.drawPath(path, lPaint5);
                                    }
                                } else if (i9 != 3) {
                                    if (i9 == 4) {
                                        if (z2) {
                                            zw21.e(canvas, rectF, lPaint2);
                                            canvas.drawRect(rectF, lPaint2);
                                            path.set((Path) i35Var2.f());
                                            path.transform(matrix2);
                                            lPaint2.setAlpha((int) (((Integer) i35Var3.f()).intValue() * 2.55f));
                                            canvas.drawPath(path, lPaint5);
                                            canvas.restore();
                                        } else {
                                            path.set((Path) i35Var2.f());
                                            path.transform(matrix2);
                                            lPaint2.setAlpha((int) (((Integer) i35Var3.f()).intValue() * 2.55f));
                                            canvas.drawPath(path, lPaint2);
                                        }
                                    }
                                } else if (z2) {
                                    zw21.e(canvas, rectF, lPaint4);
                                    canvas.drawRect(rectF, lPaint2);
                                    lPaint5.setAlpha((int) (((Integer) i35Var3.f()).intValue() * 2.55f));
                                    path.set((Path) i35Var2.f());
                                    path.transform(matrix2);
                                    canvas.drawPath(path, lPaint5);
                                    canvas.restore();
                                } else {
                                    zw21.e(canvas, rectF, lPaint4);
                                    path.set((Path) i35Var2.f());
                                    path.transform(matrix2);
                                    lPaint2.setAlpha((int) (((Integer) i35Var3.f()).intValue() * 2.55f));
                                    canvas.drawPath(path, lPaint2);
                                    canvas.restore();
                                }
                            } else if (!arrayList.isEmpty()) {
                                for (int i10 = 0; i10 < list.size(); i10++) {
                                    if (((cy00) list.get(i10)).a == Mask$MaskMode.MASK_MODE_NONE) {
                                    }
                                }
                                lPaint2.setAlpha(255);
                                canvas.drawRect(rectF, lPaint2);
                                i7 = i8 + 1;
                            }
                            i7 = i8 + 1;
                        } else {
                            AsyncUpdates asyncUpdates4 = upx.a;
                            canvas.restore();
                        }
                    }
                }
                if (this.s != null) {
                    canvas.saveLayer(rectF, this.g);
                    canvas.drawRect(rectF.left - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2, lPaint3);
                    this.s.f(canvas, matrix, i, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.y && (lPaint = this.z) != null) {
                lPaint.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas.drawRect(rectF, this.z);
            }
            l();
        }
    }

    public void g(puz puzVar, Object obj) {
        this.w.c(puzVar, obj);
    }

    public final void h() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (l35 l35Var = this.t; l35Var != null; l35Var = l35Var.t) {
            this.u.add(l35Var);
        }
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i, a aVar);

    public cot j() {
        return this.p.w;
    }

    public final boolean k() {
        jb7 jb7Var = this.q;
        return (jb7Var == null || ((ArrayList) jb7Var.b).isEmpty()) ? false : true;
    }

    public final void l() {
        mwa0 mwa0Var = this.o.getComposition().a;
        String str = this.p.c;
        HashMap hashMap = mwa0Var.c;
        if (mwa0Var.a) {
            w910 w910Var = (w910) hashMap.get(str);
            if (w910Var == null) {
                w910Var = new w910();
                hashMap.put(str, w910Var);
            }
            w910Var.a();
            if (str.equals("__container")) {
                j63 j63Var = mwa0Var.b;
                j63Var.getClass();
                r53 r53Var = new r53(j63Var);
                if (r53Var.hasNext()) {
                    r53Var.next().getClass();
                    ny61.u();
                }
            }
        }
    }

    public final void m(i35 i35Var) {
        this.v.remove(i35Var);
    }

    public void n(six sixVar, int i, ArrayList arrayList, six sixVar2) {
    }

    public void o(boolean z) {
        if (z && this.z == null) {
            this.z = new LPaint();
        }
        this.y = z;
    }

    public void p(float f) {
        AsyncUpdates asyncUpdates = upx.a;
        iw01 iw01Var = this.w;
        i35 i35Var = iw01Var.p;
        if (i35Var != null) {
            i35Var.j(f);
        }
        i35 i35Var2 = iw01Var.v;
        if (i35Var2 != null) {
            i35Var2.j(f);
        }
        i35 i35Var3 = iw01Var.w;
        if (i35Var3 != null) {
            i35Var3.j(f);
        }
        i35 i35Var4 = iw01Var.l;
        if (i35Var4 != null) {
            i35Var4.j(f);
        }
        i35 i35Var5 = iw01Var.m;
        if (i35Var5 != null) {
            i35Var5.j(f);
        }
        i35 i35Var6 = iw01Var.n;
        if (i35Var6 != null) {
            i35Var6.j(f);
        }
        i35 i35Var7 = iw01Var.o;
        if (i35Var7 != null) {
            i35Var7.j(f);
        }
        kor korVar = iw01Var.q;
        if (korVar != null) {
            korVar.j(f);
        }
        kor korVar2 = iw01Var.r;
        if (korVar2 != null) {
            korVar2.j(f);
        }
        kor korVar3 = iw01Var.s;
        if (korVar3 != null) {
            korVar3.j(f);
        }
        kor korVar4 = iw01Var.t;
        if (korVar4 != null) {
            korVar4.j(f);
        }
        kor korVar5 = iw01Var.u;
        if (korVar5 != null) {
            korVar5.j(f);
        }
        int i = 0;
        jb7 jb7Var = this.q;
        if (jb7Var != null) {
            ArrayList arrayList = (ArrayList) jb7Var.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((i35) arrayList.get(i2)).j(f);
            }
            AsyncUpdates asyncUpdates2 = upx.a;
        }
        kor korVar6 = this.r;
        if (korVar6 != null) {
            korVar6.j(f);
        }
        l35 l35Var = this.s;
        if (l35Var != null) {
            l35Var.p(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                AsyncUpdates asyncUpdates3 = upx.a;
                return;
            } else {
                ((i35) arrayList2.get(i)).j(f);
                i++;
            }
        }
    }
}
