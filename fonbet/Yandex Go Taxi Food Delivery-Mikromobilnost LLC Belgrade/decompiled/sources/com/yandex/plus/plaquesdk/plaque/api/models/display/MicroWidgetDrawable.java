package com.yandex.plus.plaquesdk.plaque.api.models.display;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import defpackage.be20;
import defpackage.de20;
import defpackage.fe20;
import defpackage.he20;
import defpackage.ie20;
import defpackage.je20;
import defpackage.jl40;
import defpackage.khc;
import defpackage.kl40;
import defpackage.oe20;
import defpackage.qe20;
import defpackage.se20;
import defpackage.tcc;
import defpackage.ue20;
import defpackage.w511;
import defpackage.xd20;
import defpackage.zd20;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/plaquesdk/plaque/api/models/display/MicroWidgetDrawable;", "Landroid/graphics/drawable/RippleDrawable;", "Landroid/content/Context;", "context", "Lue20;", "backgroundSettings", "", "viewHeight", "<init>", "(Landroid/content/Context;Lue20;I)V", "another", "", "hasSameGradient", "(Lcom/yandex/plus/plaquesdk/plaque/api/models/display/MicroWidgetDrawable;)Z", "hasSameShape", "Lue20;", "Landroid/graphics/drawable/PaintDrawable;", C0553n3.g, "Landroid/graphics/drawable/PaintDrawable;", "", "initialCornerRadii", "[F", "getInitialCornerRadii", "()[F", "value", "cornerRadii", "getCornerRadii", "setCornerRadii", "([F)V", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MicroWidgetDrawable extends RippleDrawable {
    private final PaintDrawable background;
    private final ue20 backgroundSettings;
    private float[] cornerRadii;
    private final float[] initialCornerRadii;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MicroWidgetDrawable(Context context, ue20 ue20Var, int i) {
        super(r9, r13, null);
        char c;
        Integer valueOf;
        ColorStateList valueOf2;
        ShapeDrawable.ShaderFactory shaderFactory;
        Object obj;
        char c2;
        PaintDrawable paintDrawable;
        char c3;
        char c4;
        se20 se20Var = ue20Var.b;
        oe20 oe20Var = se20Var.d;
        oe20 oe20Var2 = se20Var.c;
        oe20 oe20Var3 = se20Var.b;
        oe20 oe20Var4 = se20Var.a;
        je20 je20Var = ue20Var.a;
        PaintDrawable paintDrawable2 = null;
        if (!ue20Var.c) {
            valueOf2 = ColorStateList.valueOf(0);
            c = 1;
        } else if (je20Var instanceof zd20) {
            zd20 zd20Var = (zd20) je20Var;
            if (zd20Var.a().isEmpty()) {
                valueOf = null;
                c = 1;
            } else {
                int a = ((qe20) a.P(zd20Var.a())).a();
                int size = zd20Var.a().size();
                for (int i2 = 1; i2 < size; i2++) {
                    c = 1;
                    if (((qe20) zd20Var.a().get(i2)).a() != a) {
                        valueOf = null;
                        break;
                    }
                }
                c = 1;
                valueOf = Integer.valueOf(a);
            }
            valueOf2 = valueOf == null ? ColorStateList.valueOf(0) : ColorStateList.valueOf(khc.b(~valueOf.intValue()));
        } else {
            c = 1;
            if (je20Var instanceof he20) {
                valueOf = Integer.valueOf(((he20) je20Var).b());
                if (valueOf == null) {
                }
            }
            valueOf = null;
            if (valueOf == null) {
            }
        }
        if (je20Var instanceof he20) {
            shaderFactory = new MicroWidgetDrawableFactory$createSolidColorShader$1((he20) je20Var);
        } else if (je20Var instanceof be20) {
            shaderFactory = kl40.n((be20) je20Var);
        } else if (je20Var instanceof de20) {
            shaderFactory = kl40.o((de20) je20Var);
        } else {
            boolean z = je20Var instanceof xd20;
            ie20 ie20Var = ie20.a;
            if (z) {
                List<fe20> b = ((xd20) je20Var).b();
                final ArrayList arrayList = new ArrayList();
                for (fe20 fe20Var : b) {
                    if (fe20Var instanceof he20) {
                        obj = new MicroWidgetDrawableFactory$createSolidColorShader$1((he20) fe20Var);
                    } else if (fe20Var instanceof be20) {
                        obj = kl40.n((be20) fe20Var);
                    } else if (fe20Var instanceof de20) {
                        obj = kl40.o((de20) fe20Var);
                    } else {
                        if (!jl40.l(fe20Var, ie20Var)) {
                            w511.b();
                            throw null;
                        }
                        obj = null;
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: com.yandex.plus.plaquesdk.plaque.api.models.display.MicroWidgetDrawableFactory$createCombinedShader$1
                        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                        public Shader resize(int width, int height) {
                            List<ShapeDrawable.ShaderFactory> list = arrayList;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((ShapeDrawable.ShaderFactory) it.next()).resize(width, height));
                            }
                            Shader shader = (Shader) arrayList2.get(0);
                            int size2 = arrayList2.size();
                            int i3 = 1;
                            while (i3 < size2) {
                                ComposeShader composeShader = new ComposeShader((Shader) arrayList2.get(i3), shader, PorterDuff.Mode.DST_OVER);
                                i3++;
                                shader = composeShader;
                            }
                            return shader;
                        }
                    };
                }
            } else if (!jl40.l(je20Var, ie20Var)) {
                w511.b();
                throw null;
            }
            shaderFactory = null;
        }
        if (shaderFactory == null) {
            paintDrawable = null;
            c2 = 6;
            c3 = 5;
            c4 = 4;
        } else {
            c2 = 6;
            paintDrawable = new PaintDrawable();
            c3 = 5;
            float q = kl40.q(context, oe20Var4, i);
            float q2 = kl40.q(context, oe20Var3, i);
            float q3 = kl40.q(context, oe20Var2, i);
            float q4 = kl40.q(context, oe20Var, i);
            c4 = 4;
            float[] fArr = new float[8];
            fArr[0] = q;
            fArr[c] = q;
            fArr[2] = q2;
            fArr[3] = q2;
            fArr[4] = q3;
            fArr[5] = q3;
            fArr[6] = q4;
            fArr[7] = q4;
            paintDrawable.setShape(new RoundRectShape(fArr, null, null));
            paintDrawable.setShaderFactory(shaderFactory);
        }
        this.backgroundSettings = ue20Var;
        if (getNumberOfLayers() != 0) {
            Drawable drawable = getDrawable(0);
            if (drawable instanceof PaintDrawable) {
                paintDrawable2 = (PaintDrawable) drawable;
            }
        }
        this.background = paintDrawable2;
        float q5 = kl40.q(context, oe20Var4, i);
        float q6 = kl40.q(context, oe20Var3, i);
        float q7 = kl40.q(context, oe20Var2, i);
        float q8 = kl40.q(context, oe20Var, i);
        float[] fArr2 = new float[8];
        fArr2[0] = q5;
        fArr2[c] = q5;
        fArr2[2] = q6;
        fArr2[3] = q6;
        fArr2[c4] = q7;
        fArr2[c3] = q7;
        fArr2[c2] = q8;
        fArr2[7] = q8;
        this.initialCornerRadii = fArr2;
        this.cornerRadii = fArr2;
    }

    public final float[] getCornerRadii() {
        return this.cornerRadii;
    }

    public final float[] getInitialCornerRadii() {
        return this.initialCornerRadii;
    }

    public final boolean hasSameGradient(MicroWidgetDrawable another) {
        return jl40.l(this.backgroundSettings.a, another.backgroundSettings.a);
    }

    public final boolean hasSameShape(MicroWidgetDrawable another) {
        return this.backgroundSettings.b.equals(another.backgroundSettings.b);
    }

    public final void setCornerRadii(float[] fArr) {
        if (fArr.length != 8 || Arrays.equals(fArr, this.cornerRadii)) {
            return;
        }
        PaintDrawable paintDrawable = this.background;
        if (paintDrawable != null) {
            paintDrawable.setCornerRadii(fArr);
            invalidateDrawable(paintDrawable);
        }
        this.cornerRadii = fArr;
    }
}
