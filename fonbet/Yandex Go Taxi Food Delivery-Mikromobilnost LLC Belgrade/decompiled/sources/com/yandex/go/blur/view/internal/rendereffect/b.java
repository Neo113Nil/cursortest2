package com.yandex.go.blur.view.internal.rendereffect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.yandex.go.blur.core.BlurEffect$Progressive$Easing;
import defpackage.a76;
import defpackage.b64;
import defpackage.c6w;
import defpackage.cy4;
import defpackage.d6w;
import defpackage.fjy;
import defpackage.g8e;
import defpackage.h76;
import defpackage.hl1;
import defpackage.i3y;
import defpackage.i76;
import defpackage.lqi0;
import defpackage.mzz;
import defpackage.rzo;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vng;
import defpackage.vqy;
import defpackage.w511;
import defpackage.y66;
import defpackage.y6i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* loaded from: classes12.dex */
public class b extends cy4 {
    public static final RenderEffect k;
    public final Context e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final int i;
    public final int j;

    static {
        RenderEffect createOffsetEffect;
        createOffsetEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
        k = createOffsetEffect;
        kotlin.a.b(LazyThreadSafetyMode.NONE, new lqi0(6));
    }

    public b(Context context, int i, int i2, int i3, boolean z, boolean z2) {
        this.e = context;
        this.f = z;
        this.g = i;
        this.h = z2;
        this.i = i2;
        this.j = tje.u(i3, context);
    }

    @Override // defpackage.v66
    public String a() {
        return "blur/system_render_effect";
    }

    @Override // defpackage.cy4
    public final void e(Map map, View view) {
        b bVar;
        View view2;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            a76 a76Var = (a76) entry.getValue();
            RenderEffect renderEffect = null;
            if (a76Var.a() <= 0.0f) {
                bVar = this;
                view2 = view;
            } else {
                bVar = this;
                view2 = view;
                vqy vqyVar = new vqy(a76Var, bVar, str, view2, 23);
                i3y i3yVar = i76.a;
                RenderEffect f = hl1.f(((mzz) i3yVar.getValue()).c(a76Var));
                if (f == null) {
                    f = hl1.f(vqyVar.invoke(a76Var));
                    if (f != null) {
                        ((mzz) i3yVar.getValue()).d(a76Var, f);
                    }
                }
                renderEffect = f;
            }
            if (renderEffect != null) {
                arrayList.add(renderEffect);
            }
            this = bVar;
            view = view2;
        }
        View view3 = view;
        if (arrayList.isEmpty()) {
            view3.setRenderEffect(null);
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            w511.x("Empty collection can't be reduced.");
            return;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = RenderEffect.createChainEffect(hl1.f(it.next()), hl1.f(next));
        }
        view3.setRenderEffect(hl1.f(next));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.List] */
    public RenderEffect i(String str, y66 y66Var, View view) {
        RenderEffect createBlendModeEffect;
        RenderEffect renderEffect;
        RenderEffect createShaderEffect;
        RenderEffect createBlendModeEffect2;
        Shader.TileMode tileMode;
        if (!this.h) {
            return null;
        }
        if (!(y66Var instanceof y66)) {
            w511.b();
            return null;
        }
        float f = y66Var.d;
        float f2 = y66Var.f;
        float floatValue = ((Number) y66Var.e.c()).floatValue();
        Pair pair = y66Var.c;
        int d = y6i0.d((int) Math.ceil(((float) Math.hypot(floatValue - ((Number) pair.c()).floatValue(), ((Number) r5.f()).floatValue() - ((Number) pair.f()).floatValue())) / this.j), 2, Math.max(2, this.i));
        RectF P = vng.P(y66Var, new RenderEffectBlurDelegate$createProgressiveBlurEffect$segments$1(view, rzo.class, "absoluteCoordinates", "getAbsoluteCoordinates(Landroid/view/View;)J", 1));
        BlurEffect$Progressive$Easing blurEffect$Progressive$Easing = y66Var.g;
        PathInterpolator pathInterpolator = new PathInterpolator(blurEffect$Progressive$Easing.getStartControlX(), blurEffect$Progressive$Easing.getStartControlY(), blurEffect$Progressive$Easing.getEndControlX(), blurEffect$Progressive$Easing.getEndControlY());
        Pair pair2 = f2 >= f ? new Pair(Float.valueOf(f), Float.valueOf(f2)) : new Pair(Float.valueOf(f2), Float.valueOf(f));
        float floatValue2 = ((Number) pair2.getFirst()).floatValue();
        float floatValue3 = ((Number) pair2.getSecond()).floatValue();
        float f3 = d;
        int i = 1;
        d6w d6wVar = new d6w(0, d, 1);
        int i2 = 2;
        ?? arrayList = new ArrayList(tcc.n(d6wVar, 10));
        c6w it = d6wVar.iterator();
        while (it.c) {
            float nextInt = it.nextInt();
            float f4 = nextInt / f3;
            int i3 = i;
            float b = g8e.b(f2, f, pathInterpolator.getInterpolation(f4), f);
            float f5 = P.left;
            float f6 = f;
            float f7 = P.top;
            float f8 = P.right;
            float f9 = P.bottom;
            int[] iArr = {0, -1, -1, 0};
            float f10 = floatValue3 - floatValue2;
            float f11 = (((nextInt - 2.0f) / f3) * f10) + floatValue2;
            float f12 = (((nextInt - 1.0f) / f3) * f10) + floatValue2;
            float f13 = (f4 * f10) + floatValue2;
            float f14 = (((nextInt + 1.0f) / f3) * f10) + floatValue2;
            float[] fArr = new float[4];
            fArr[0] = f11;
            fArr[i3] = f12;
            fArr[i2] = f13;
            fArr[3] = f14;
            int i4 = fjy.a[y66Var.h.ordinal()];
            if (i4 == i3) {
                tileMode = Shader.TileMode.CLAMP;
            } else {
                if (i4 != i2) {
                    w511.b();
                    return null;
                }
                tileMode = Build.VERSION.SDK_INT >= 31 ? Shader.TileMode.DECAL : Shader.TileMode.CLAMP;
            }
            arrayList.add(new Pair(Float.valueOf(b), new LinearGradient(f5, f7, f8, f9, iArr, fArr, tileMode)));
            f = f6;
            i = 1;
            i2 = 2;
        }
        if (f2 >= f) {
            arrayList = kotlin.collections.a.q0(arrayList);
        }
        Iterable<Pair> iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(tcc.n(iterable, 10));
        for (Pair pair3 : iterable) {
            float floatValue4 = ((Number) pair3.getFirst()).floatValue();
            Shader shader = (Shader) pair3.getSecond();
            float w = tje.w(y66Var.a, this.e) * floatValue4;
            if (w > 0.0f) {
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                renderEffect = RenderEffect.createBlurEffect(w, w, Shader.TileMode.CLAMP);
            } else {
                renderEffect = k;
            }
            createShaderEffect = RenderEffect.createShaderEffect(shader);
            BlendMode blendMode = BlendMode.DST_IN;
            createBlendModeEffect2 = RenderEffect.createBlendModeEffect(renderEffect, createShaderEffect, BlendMode.DST_IN);
            arrayList2.add(createBlendModeEffect2);
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            w511.x("Empty collection can't be reduced.");
            return null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            RenderEffect f15 = hl1.f(it2.next());
            RenderEffect f16 = hl1.f(next);
            BlendMode blendMode2 = BlendMode.SRC_OVER;
            next = RenderEffect.createBlendModeEffect(f16, f15, BlendMode.SRC_OVER);
        }
        RenderEffect f17 = hl1.f(next);
        RenderEffect renderEffect2 = k;
        BlendMode blendMode3 = BlendMode.SRC_OVER;
        createBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect2, f17, BlendMode.SRC_OVER);
        return createBlendModeEffect;
    }

    public RenderEffect j(String str, ArrayList arrayList, View view) {
        RenderEffect createBitmapEffect;
        if (this.f) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int i = this.g;
            int i2 = measuredWidth2 / i;
            int measuredHeight2 = view.getMeasuredHeight() / i;
            if (measuredWidth > 0 && measuredHeight > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(i2, measuredHeight2, Bitmap.Config.ALPHA_8);
                float f = 1.0f / i;
                new Canvas(createBitmap).scale(f, f);
                new Path();
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    createBitmapEffect = RenderEffect.createBitmapEffect(createBitmap, null, new Rect(0, 0, measuredWidth, measuredHeight));
                    return createBitmapEffect;
                }
                Pair pair = (Pair) it.next();
                b64.D(pair.getSecond());
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context, h76 h76Var) {
        this(context, h76Var.b, h76Var.d, h76Var.e, r5, h76Var.c);
        boolean z = h76Var.a;
    }
}
