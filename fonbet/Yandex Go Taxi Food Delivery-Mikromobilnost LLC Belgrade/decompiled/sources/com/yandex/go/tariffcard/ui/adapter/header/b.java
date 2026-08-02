package com.yandex.go.tariffcard.ui.adapter.header;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import defpackage.a22;
import defpackage.avj0;
import defpackage.eex0;
import defpackage.gdc;
import defpackage.ig2;
import defpackage.jl40;
import defpackage.ldu;
import defpackage.lys;
import defpackage.mdu;
import defpackage.mqg0;
import defpackage.mzz;
import defpackage.ndu;
import defpackage.nhx0;
import defpackage.odu;
import defpackage.sg2;
import defpackage.t8u;
import defpackage.w511;
import defpackage.xw31;
import defpackage.zdu;
import defpackage.zo31;

/* loaded from: classes14.dex */
public final class b extends lys implements ig2 {
    public static final /* synthetic */ int W = 0;
    public final a22 S;
    public final nhx0 T;
    public final d U;
    public final mzz V;

    public b(eex0 eex0Var, e eVar, a22 a22Var, nhx0 nhx0Var) {
        super(eex0Var);
        this.S = a22Var;
        this.T = nhx0Var;
        this.U = eVar.a(eex0Var.b, eex0Var.g, eex0Var.c, eex0Var.j, eex0Var.n, eex0Var.o, eex0Var.m, eex0Var.e, eex0Var.k, eex0Var.d, eex0Var.l, eex0Var.f);
        this.V = new mzz(2);
    }

    @Override // defpackage.wys
    public final boolean X() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0123 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    @Override // defpackage.wys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj) {
        int i;
        int i2;
        boolean z;
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        GradientDrawable gradientDrawable3;
        mdu mduVar;
        mdu mduVar2;
        t8u t8uVar = (t8u) obj;
        this.U.a(t8uVar.a);
        Drawable drawable = t8uVar.c;
        odu oduVar = t8uVar.d;
        eex0 eex0Var = (eex0) ((zo31) this.R);
        GoImageView goImageView = eex0Var.i;
        GoImageView goImageView2 = eex0Var.h;
        goImageView.setImageDrawable(drawable);
        eex0Var.i.setVisibility(0);
        int min = Math.min((int) (xw31.u() * 0.6d), (xw31.v() * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth());
        zdu zduVar = new zdu(min, oduVar);
        mzz mzzVar = this.V;
        Drawable drawable2 = (Drawable) mzzVar.c(zduVar);
        ldu lduVar = ldu.a;
        if (drawable2 == null) {
            a22 a22Var = this.S;
            a22Var.getClass();
            int v = xw31.v();
            ColorDrawable colorDrawable = new ColorDrawable(((avj0) a22Var.a).a(mqg0.transparent));
            boolean z2 = oduVar instanceof ndu;
            ndu nduVar = z2 ? (ndu) oduVar : null;
            Float valueOf = (nduVar == null || (mduVar2 = nduVar.a) == null) ? null : Float.valueOf(mduVar2.c);
            ndu nduVar2 = z2 ? (ndu) oduVar : null;
            Float valueOf2 = (nduVar2 == null || (mduVar = nduVar2.b) == null) ? null : Float.valueOf(mduVar.c);
            if (z2) {
                mdu mduVar3 = ((ndu) oduVar).a;
                Integer valueOf3 = mduVar3 != null ? Integer.valueOf(mduVar3.a) : null;
                Integer valueOf4 = mduVar3 != null ? Integer.valueOf(mduVar3.b) : null;
                if (valueOf3 == null || valueOf4 == null) {
                    i2 = 0;
                    z = z2;
                } else {
                    i2 = 0;
                    z = z2;
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{valueOf3.intValue(), valueOf4.intValue()});
                    if (z) {
                        gradientDrawable2 = gradientDrawable;
                        if (!jl40.l(oduVar, lduVar)) {
                            w511.b();
                            return;
                        }
                    } else {
                        mdu mduVar4 = ((ndu) oduVar).b;
                        Integer valueOf5 = mduVar4 != null ? Integer.valueOf(mduVar4.a) : null;
                        Integer valueOf6 = mduVar4 != null ? Integer.valueOf(mduVar4.b) : null;
                        if (valueOf5 == null || valueOf6 == null) {
                            gradientDrawable2 = gradientDrawable;
                        } else {
                            gradientDrawable2 = gradientDrawable;
                            gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{valueOf6.intValue(), valueOf5.intValue()});
                            if (gradientDrawable2 == null || gradientDrawable3 != null) {
                                Drawable[] drawableArr = new Drawable[3];
                                drawableArr[i2] = colorDrawable;
                                drawableArr[1] = gradientDrawable2;
                                drawableArr[2] = gradientDrawable3;
                                LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
                                layerDrawable.setLayerSize(i2, v, min);
                                layerDrawable.setLayerGravity(1, 48);
                                if (valueOf != null) {
                                    layerDrawable.setLayerSize(1, v, (int) (valueOf.floatValue() * min));
                                }
                                layerDrawable.setLayerGravity(2, 80);
                                if (valueOf2 != null) {
                                    layerDrawable.setLayerSize(2, v, (int) (valueOf2.floatValue() * min));
                                }
                                drawable2 = layerDrawable;
                            } else {
                                drawable2 = null;
                            }
                            if (drawable2 != null) {
                                mzzVar.d(zduVar, drawable2);
                            }
                        }
                    }
                    gradientDrawable3 = null;
                    if (gradientDrawable2 == null) {
                    }
                    Drawable[] drawableArr2 = new Drawable[3];
                    drawableArr2[i2] = colorDrawable;
                    drawableArr2[1] = gradientDrawable2;
                    drawableArr2[2] = gradientDrawable3;
                    LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr2);
                    layerDrawable2.setLayerSize(i2, v, min);
                    layerDrawable2.setLayerGravity(1, 48);
                    if (valueOf != null) {
                    }
                    layerDrawable2.setLayerGravity(2, 80);
                    if (valueOf2 != null) {
                    }
                    drawable2 = layerDrawable2;
                    if (drawable2 != null) {
                    }
                }
            } else {
                i2 = 0;
                z = z2;
                if (!jl40.l(oduVar, lduVar)) {
                    w511.b();
                    return;
                }
            }
            gradientDrawable = null;
            if (z) {
            }
            gradientDrawable3 = null;
            if (gradientDrawable2 == null) {
            }
            Drawable[] drawableArr22 = new Drawable[3];
            drawableArr22[i2] = colorDrawable;
            drawableArr22[1] = gradientDrawable2;
            drawableArr22[2] = gradientDrawable3;
            LayerDrawable layerDrawable22 = new LayerDrawable(drawableArr22);
            layerDrawable22.setLayerSize(i2, v, min);
            layerDrawable22.setLayerGravity(1, 48);
            if (valueOf != null) {
            }
            layerDrawable22.setLayerGravity(2, 80);
            if (valueOf2 != null) {
            }
            drawable2 = layerDrawable22;
            if (drawable2 != null) {
            }
        }
        goImageView2.setImageDrawable(drawable2);
        if (jl40.l(oduVar, lduVar)) {
            i = 8;
        } else {
            if (!(oduVar instanceof ndu)) {
                w511.b();
                return;
            }
            i = 0;
        }
        goImageView2.setVisibility(i);
        eex0Var.a.setLayoutParams(new ViewGroup.LayoutParams(-1, min));
        gdc gdcVar = new gdc(mqg0.black);
        eex0Var.k.updateShimmeringColor(gdcVar);
        eex0Var.l.updateShimmeringColor(gdcVar);
        eex0Var.m.updateShimmeringColor(gdcVar);
        Z(new HeaderUltimaItemViewHolder$bind$1(this, null), "UPDATE_INSETS_TASK", false);
    }

    @Override // defpackage.ig2
    public final sg2 n() {
        return this.T.c;
    }

    @Override // defpackage.ig2
    public final View y() {
        return ((eex0) ((zo31) this.R)).p;
    }
}
