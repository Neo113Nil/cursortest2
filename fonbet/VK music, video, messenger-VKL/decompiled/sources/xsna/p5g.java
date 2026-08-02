package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.c;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ColorBorder.kt */
/* loaded from: classes17.dex */
public final class p5g implements k18 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    /* compiled from: ColorBorder.kt */
    public static final class a {
        public static p5g a(float f, int i, int i2, long j, androidx.compose.runtime.a aVar, boolean z) {
            boolean z2 = (i2 & 2) != 0 ? false : z;
            f870.A().getClass();
            aVar.K(400476303);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(400476303, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeAvatarDefault.borderGapColor (MilkshakeAvatarDefault.kt:53)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getBackground().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            if ((i2 & 8) != 0) {
                f = Float.NaN;
            }
            float f2 = f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(673916255, i, -1, "com.vk.core.compose.component.image.border.ColorBorder.Companion.invoke (ColorBorder.kt:105)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                p5g p5gVar = new p5g(z2, j, j2, f2, null);
                aVar.R(p5gVar);
                x = p5gVar;
            }
            p5g p5gVar2 = (p5g) x;
            ((zak0) p5gVar2.b).setValue(Boolean.valueOf(z2));
            ((zak0) p5gVar2.a).setValue(new l5g(j));
            ((zak0) p5gVar2.d).setValue(new pco(f2));
            ((zak0) p5gVar2.c).setValue(new l5g(j2));
            ((zak0) p5gVar2.e).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return p5gVar2;
        }
    }

    public p5g(boolean z, long j, long j2, float f, SemanticsConfiguration semanticsConfiguration) {
        this.a = zy60.d(j);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = zy60.d(j2);
        this.d = cq.f(f);
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    public static void d(oio oioVar, r5j0 r5j0Var, float f, long j) {
        frm0 frm0Var;
        androidx.compose.ui.graphics.c cVar;
        float f2 = f / 2;
        frm0 frm0Var2 = new frm0(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30);
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        androidx.compose.ui.graphics.c a2 = r5j0Var.a(floatToRawIntBits, oioVar.getLayoutDirection(), oioVar);
        if (a2 instanceof c.b) {
            cVar = new c.b(((c.b) a2).a.j(floatToRawIntBits2));
            frm0Var = frm0Var2;
        } else if (a2 instanceof c.C0013c) {
            aog0 aog0Var = ((c.C0013c) a2).a;
            int i = (int) (floatToRawIntBits2 >> 32);
            int i2 = (int) (floatToRawIntBits2 & 4294967295L);
            frm0Var = frm0Var2;
            cVar = new c.C0013c(new aog0(Float.intBitsToFloat(i) + aog0Var.a, Float.intBitsToFloat(i2) + aog0Var.b, Float.intBitsToFloat(i) + aog0Var.c, Float.intBitsToFloat(i2) + aog0Var.d, aog0Var.e, aog0Var.f, aog0Var.g, aog0Var.h));
        } else {
            frm0Var = frm0Var2;
            if (!(a2 instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((c.a) a2).a.e(floatToRawIntBits2);
            cVar = a2;
        }
        androidx.compose.ui.graphics.d.c(oioVar, cVar, j, frm0Var, 52);
    }

    @Override // xsna.k18
    public final void a(final long j, final r5j0 r5j0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-274329712);
        if ((i & 6) == 0) {
            i2 = (M.p(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(r5j0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-274329712, i2, -1, "com.vk.core.compose.component.image.border.ColorBorder.invoke (ColorBorder.kt:43)");
            }
            int i3 = i2 & 14;
            final float c = c(((i2 >> 6) & 112) | i3, j, M);
            final float b = f870.A().b(i3, j, M);
            q630 d = rte0.d(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.e).getValue()), r5j0Var);
            boolean n = ((i2 & 7168) == 2048) | M.n(c) | M.n(b) | ((i2 & 112) == 32);
            Object x = M.x();
            if (n || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.n5g
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float I0 = oioVar.I0(c);
                        p5g p5gVar = this;
                        boolean booleanValue = ((Boolean) ((zak0) p5gVar.b).getValue()).booleanValue();
                        r5j0 r5j0Var2 = r5j0Var;
                        if (booleanValue) {
                            p5g.d(oioVar, r5j0Var2, oioVar.I0(b) + I0, ((l5g) ((zak0) p5gVar.c).getValue()).a);
                        }
                        p5g.d(oioVar, r5j0Var2, I0, ((l5g) ((zak0) p5gVar.a).getValue()).a);
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            xa4.i(0, M, (izs) x, d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o5g
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    p5g.this.a(j, r5j0Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    @Override // xsna.k18
    public final float b(int i, long j, androidx.compose.runtime.a aVar) {
        float f;
        aVar.K(959763920);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(959763920, i, -1, "com.vk.core.compose.component.image.border.ColorBorder.calculateWidth (ColorBorder.kt:87)");
        }
        int i2 = i & 14;
        float c = c(i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, j, aVar);
        if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
            aVar.K(-1084836373);
            f = f870.A().b(i2, j, aVar);
            aVar.j();
        } else {
            aVar.K(-1084835278);
            aVar.j();
            f = 0;
        }
        float f2 = c + f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f2;
    }

    public final float c(int i, long j, androidx.compose.runtime.a aVar) {
        float f;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1935061122, i, -1, "com.vk.core.compose.component.image.border.ColorBorder.calculateWidthWithoutGap (ColorBorder.kt:90)");
        }
        wh50 wh50Var = this.d;
        if (pco.b(((pco) ((zak0) wh50Var).getValue()).b, Float.NaN)) {
            aVar.K(354944271);
            int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            aVar.K(-1139452404);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1139452404, i2, -1, "com.vk.core.compose.component.image.border.Border.calculateWidth (Border.kt:21)");
            }
            f = f870.A().d(xcv0.e(j), aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            aVar.j();
        } else {
            aVar.K(354997963);
            aVar.j();
            f = ((pco) ((zak0) wh50Var).getValue()).b;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f;
    }
}
