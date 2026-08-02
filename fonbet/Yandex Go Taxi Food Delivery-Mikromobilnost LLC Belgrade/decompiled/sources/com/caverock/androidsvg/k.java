package com.caverock.androidsvg;

import com.adjust.sdk.Constants;
import defpackage.bnl0;
import defpackage.kdd0;
import defpackage.yll0;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class k implements Cloneable {
    public SVG$Style$LineCap A;
    public SVG$Style$LineJoin B;
    public Float C;
    public j[] D;
    public j E;
    public Float F;
    public yll0 G;
    public ArrayList H;
    public j I;
    public Integer J;
    public SVG$Style$FontStyle K;
    public SVG$Style$TextDecoration L;
    public SVG$Style$TextDirection M;
    public SVG$Style$TextAnchor N;
    public Boolean O;
    public kdd0 P;
    public String Q;
    public String R;
    public String S;
    public Boolean T;
    public Boolean U;
    public bnl0 V;
    public Float W;
    public String Z;
    public long a = 0;
    public SVG$Style$FillRule a0;
    public bnl0 b;
    public String b0;
    public SVG$Style$FillRule c;
    public bnl0 c0;
    public Float d0;
    public bnl0 e0;
    public Float f0;
    public SVG$Style$VectorEffect g0;
    public SVG$Style$RenderQuality h0;
    public Float w;
    public bnl0 x;
    public Float y;
    public j z;

    public static k a() {
        k kVar = new k();
        kVar.a = -1L;
        yll0 yll0Var = yll0.b;
        kVar.b = yll0Var;
        SVG$Style$FillRule sVG$Style$FillRule = SVG$Style$FillRule.NonZero;
        kVar.c = sVG$Style$FillRule;
        Float valueOf = Float.valueOf(1.0f);
        kVar.w = valueOf;
        kVar.x = null;
        kVar.y = valueOf;
        kVar.z = new j(1.0f);
        kVar.A = SVG$Style$LineCap.Butt;
        kVar.B = SVG$Style$LineJoin.Miter;
        kVar.C = Float.valueOf(4.0f);
        kVar.D = null;
        kVar.E = new j(0.0f);
        kVar.F = valueOf;
        kVar.G = yll0Var;
        kVar.H = null;
        kVar.I = new j(12.0f, SVG$Unit.pt);
        kVar.J = Integer.valueOf(Constants.MINIMAL_ERROR_STATUS_CODE);
        kVar.K = SVG$Style$FontStyle.Normal;
        kVar.L = SVG$Style$TextDecoration.None;
        kVar.M = SVG$Style$TextDirection.LTR;
        kVar.N = SVG$Style$TextAnchor.Start;
        Boolean bool = Boolean.TRUE;
        kVar.O = bool;
        kVar.P = null;
        kVar.Q = null;
        kVar.R = null;
        kVar.S = null;
        kVar.T = bool;
        kVar.U = bool;
        kVar.V = yll0Var;
        kVar.W = valueOf;
        kVar.Z = null;
        kVar.a0 = sVG$Style$FillRule;
        kVar.b0 = null;
        kVar.c0 = null;
        kVar.d0 = valueOf;
        kVar.e0 = null;
        kVar.f0 = valueOf;
        kVar.g0 = SVG$Style$VectorEffect.None;
        kVar.h0 = SVG$Style$RenderQuality.auto;
        return kVar;
    }

    public final Object clone() {
        k kVar = (k) super.clone();
        j[] jVarArr = this.D;
        if (jVarArr != null) {
            kVar.D = (j[]) jVarArr.clone();
        }
        return kVar;
    }
}
