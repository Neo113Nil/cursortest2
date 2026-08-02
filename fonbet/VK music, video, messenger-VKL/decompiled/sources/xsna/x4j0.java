package xsna;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.CustomShadowParams;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.GradientParams;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.Shadow;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import xsna.q630;
import xsna.yk8;

/* compiled from: modifierExt.kt */
/* loaded from: classes17.dex */
public final class x4j0 implements kio {
    public final CustomShadowParams a;
    public final float b;
    public final kpi c = new kpi();

    public x4j0(CustomShadowParams customShadowParams, float f) {
        this.a = customShadowParams;
        this.b = f;
    }

    @Override // xsna.q630.b, xsna.q630
    public final <R> R a(R r, wzs<? super R, ? super q630.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // xsna.kio
    public final void v(toy toyVar) {
        er9 er9Var = toyVar.b;
        for (Shadow shadow : this.a.c) {
            final float I0 = toyVar.I0(this.b);
            final kpi kpiVar = this.c;
            kpiVar.c = shadow;
            kpiVar.a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (er9Var.d() >> 32)), Float.intBitsToFloat((int) (er9Var.d() & 4294967295L)));
            kpiVar.b = I0;
            Shadow shadow2 = kpiVar.c;
            float f = shadow2.b;
            float f2 = shadow2.c;
            izs izsVar = new izs() { // from class: xsna.jpi
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    oio oioVar = (oio) obj;
                    kpi kpiVar2 = kpi.this;
                    GradientParams a = kpiVar2.a();
                    androidx.compose.ui.graphics.a aVar = kpiVar2.h;
                    Pair[] s = cdi.s(a, kpiVar2.f());
                    Pair[] pairArr = (Pair[]) Arrays.copyOf(s, s.length);
                    float e = kpiVar2.e();
                    ArrayList arrayList = new ArrayList(pairArr.length);
                    for (Pair pair : pairArr) {
                        arrayList.add(new l5g(((l5g) pair.j()).a));
                    }
                    ArrayList arrayList2 = new ArrayList(pairArr.length);
                    for (Pair pair2 : pairArr) {
                        arrayList2.add(Float.valueOf(((Number) pair2.i()).floatValue()));
                    }
                    kpiVar2.d = new gte0(arrayList, arrayList2, 0L, e);
                    Pair[] s2 = cdi.s(kpiVar2.c.g, kpiVar2.f());
                    kpiVar2.e = yk8.a.c((Pair[]) Arrays.copyOf(s2, s2.length), 0L, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(kpiVar2.d() + kpiVar2.c.d) << 32), 0);
                    RectF rectF = kpiVar2.f;
                    RectF rectF2 = kpiVar2.a;
                    rectF.set(rectF2);
                    float f3 = I0;
                    rectF.inset(f3, f3);
                    RectF rectF3 = kpiVar2.g;
                    rectF3.set(-kpiVar2.c.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kpiVar2.d(), rectF.height());
                    y7z y7zVar = kpiVar2.e;
                    if (y7zVar == null) {
                        y7zVar = null;
                    }
                    kpi.c(oioVar, y7zVar, rectF3, kpiVar2.d(), rectF.bottom, 2);
                    y7z y7zVar2 = kpiVar2.e;
                    if (y7zVar2 == null) {
                        y7zVar2 = null;
                    }
                    kpi.c(oioVar, y7zVar2, rectF3, rectF2.right - kpiVar2.d(), f3, 0);
                    float width = rectF2.width() - (kpiVar2.d() * 2);
                    float height = rectF.height();
                    oio.P(oioVar, f870.c(kpiVar2.f()), (Float.floatToRawIntBits(kpiVar2.d()) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    rectF3.set(-kpiVar2.c.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kpiVar2.d(), rectF.width());
                    y7z y7zVar3 = kpiVar2.e;
                    if (y7zVar3 == null) {
                        y7zVar3 = null;
                    }
                    kpi.c(oioVar, y7zVar3, rectF3, f3, kpiVar2.d(), 3);
                    y7z y7zVar4 = kpiVar2.e;
                    if (y7zVar4 == null) {
                        y7zVar4 = null;
                    }
                    kpi.c(oioVar, y7zVar4, rectF3, rectF2.width() - f3, rectF2.bottom - kpiVar2.d(), 1);
                    long c = f870.c(kpiVar2.f());
                    float d = kpiVar2.d();
                    long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(d) & 4294967295L);
                    float width2 = rectF.width();
                    float d2 = f3 - kpiVar2.d();
                    oio.P(oioVar, c, floatToRawIntBits, (Float.floatToRawIntBits(width2) << 32) | (Float.floatToRawIntBits(d2) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    long c2 = f870.c(kpiVar2.f());
                    float height2 = rectF.height() + f3;
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(height2) & 4294967295L);
                    float width3 = rectF.width();
                    float d3 = f3 - kpiVar2.d();
                    oio.P(oioVar, c2, floatToRawIntBits2, (Float.floatToRawIntBits(width3) << 32) | (Float.floatToRawIntBits(d3) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    aVar.reset();
                    gte0 gte0Var = kpiVar2.d;
                    if (gte0Var == null) {
                        gte0Var = null;
                    }
                    float f4 = rectF.right;
                    float f5 = rectF.bottom;
                    kpi.b(oioVar, gte0Var, aVar, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), kpiVar2.e(), 0);
                    gte0 gte0Var2 = kpiVar2.d;
                    if (gte0Var2 == null) {
                        gte0Var2 = null;
                    }
                    float f6 = rectF.left;
                    float f7 = rectF.bottom;
                    kpi.b(oioVar, gte0Var2, aVar, (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32), kpiVar2.e(), 1);
                    gte0 gte0Var3 = kpiVar2.d;
                    if (gte0Var3 == null) {
                        gte0Var3 = null;
                    }
                    float f8 = rectF.left;
                    float f9 = rectF.top;
                    kpi.b(oioVar, gte0Var3, aVar, (Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32), kpiVar2.e(), 2);
                    gte0 gte0Var4 = kpiVar2.d;
                    if (gte0Var4 == null) {
                        gte0Var4 = null;
                    }
                    float f10 = rectF.right;
                    float f11 = rectF.top;
                    kpi.b(oioVar, gte0Var4, aVar, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), kpiVar2.e(), 3);
                    return s3q0.a;
                }
            };
            float f3 = -f;
            float f4 = -f2;
            er9Var.c.a.d(f, f2, f3, f4);
            try {
                izsVar.invoke(toyVar);
            } finally {
                er9Var.c.a.d(f3, f4, -f3, -f4);
            }
        }
        toyVar.s1();
    }
}
