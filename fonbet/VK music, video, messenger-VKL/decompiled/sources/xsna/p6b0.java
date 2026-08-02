package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.presentation.components.InvalidPlayingIndicationConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlayingIndication.kt */
/* loaded from: classes3.dex */
public final class p6b0 {
    public static final u5b0 a;

    static {
        float f = 2;
        float f2 = 18;
        float f3 = 10;
        a = new u5b0(f, f2, 4, f, f, l5g.d, e43.l(new pco(f3), new pco(14), new pco(f2), new pco(f3)), new l5g(l5g.c(14, l5g.b, 0.6f)));
    }

    public static final void a(final u5b0 u5b0Var, boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z2;
        androidx.compose.runtime.a aVar2;
        u5b0 u5b0Var2;
        Object k6b0Var;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        androidx.compose.runtime.a M = aVar.M(905684256);
        if ((i & 6) == 0) {
            i2 = i | (M.J(u5b0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i5 = i2 | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(905684256, i5, -1, "com.vk.music.stickyplayer.presentation.components.PlayingIndication (PlayingIndication.kt:88)");
            }
            boolean z3 = (i5 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                List<pco> list = u5b0Var.h;
                float f4 = u5b0Var.c;
                float f5 = u5b0Var.d;
                int i6 = u5b0Var.a;
                if (i6 > 0) {
                    float f6 = 0;
                    if (pco.a(u5b0Var.b, f6) > 0 && pco.a(f5, f6) > 0 && pco.a(f4, f5) > 0 && pco.a(u5b0Var.e, f6) > 0 && pco.a(u5b0Var.f, f6) >= 0 && list.size() == i6) {
                        List<pco> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                float f7 = ((pco) it.next()).b;
                                if (pco.a(f7, f4) <= 0 && pco.a(f7, f5) >= 0) {
                                }
                            }
                        }
                        M.R(u5b0Var);
                        x = u5b0Var;
                    }
                }
                throw new InvalidPlayingIndicationConfigException("Invalid config " + u5b0Var);
            }
            u5b0 u5b0Var3 = (u5b0) x;
            azl azlVar = (azl) M.r(uvi.h);
            final float I0 = azlVar.I0(u5b0Var3.b);
            final float I02 = azlVar.I0(u5b0Var3.c);
            float I03 = azlVar.I0(u5b0Var3.d);
            float I04 = azlVar.I0(u5b0Var3.f);
            float I05 = azlVar.I0(u5b0Var3.e);
            Object x2 = M.x();
            if (x2 == c0012a) {
                List<pco> list3 = u5b0Var3.h;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(qf2.a((azlVar.I0(((pco) it2.next()).b) - I03) / (I02 - I03)));
                }
                M.R(arrayList);
                x2 = arrayList;
            }
            final List list4 = (List) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = jq2.d(250, 0, luo.a, 2);
                M.R(x3);
            }
            dtp0 dtp0Var = (dtp0) x3;
            float d = b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
            Float valueOf = Float.valueOf(d);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i7 = i5 & 112;
            boolean n = M.n(d) | (i7 == 32) | M.J(u5b0Var3) | M.y(list4);
            Object x4 = M.x();
            if (n || x4 == c0012a) {
                u5b0Var2 = u5b0Var3;
                i3 = i5;
                i4 = i7;
                f = I05;
                f2 = I03;
                f3 = I04;
                k6b0Var = new k6b0(d, z, u5b0Var2, list4, dtp0Var, null);
                M.R(k6b0Var);
            } else {
                u5b0Var2 = u5b0Var3;
                i4 = i7;
                i3 = i5;
                k6b0Var = x4;
                f = I05;
                f2 = I03;
                f3 = I04;
            }
            aVar2 = M;
            z2 = z;
            bap.e(valueOf, valueOf2, u5b0Var2, (wzs) k6b0Var, aVar2, i4);
            boolean n2 = aVar2.n(I0) | aVar2.J(u5b0Var2) | aVar2.n(f) | aVar2.n(I02) | aVar2.n(f2) | aVar2.y(list4) | aVar2.n(f3);
            Object x5 = aVar2.x();
            if (n2 || x5 == c0012a) {
                final u5b0 u5b0Var4 = u5b0Var2;
                final float f8 = f;
                final float f9 = f3;
                final float f10 = f2;
                izs izsVar = new izs() { // from class: xsna.c6b0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        float f11;
                        float f12;
                        oio oioVar = (oio) obj;
                        char c = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                        u5b0 u5b0Var5 = u5b0Var4;
                        int i8 = u5b0Var5.a;
                        float f13 = I0;
                        float f14 = f8;
                        float f15 = 2;
                        float f16 = intBitsToFloat - ((((i8 - 1) * f14) + (i8 * f13)) / f15);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                        float f17 = I02;
                        float f18 = (f17 / f15) + intBitsToFloat2;
                        l5g l5gVar = u5b0Var5.i;
                        if (l5gVar != null) {
                            f12 = f14;
                            f11 = f17;
                            oio.P(oioVar, l5gVar.a, 0L, oioVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        } else {
                            f11 = f17;
                            f12 = f14;
                        }
                        int i9 = 0;
                        while (i9 < i8) {
                            float f19 = ((f13 + f12) * i9) + f16;
                            float f20 = f10;
                            float floatValue = (((Number) ((if2) list4.get(i9)).d()).floatValue() * (f11 - f20)) + f20;
                            int i10 = i9;
                            long j = u5b0Var5.g;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f19) << c) | (Float.floatToRawIntBits(f18 - floatValue) & 4294967295L);
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(f13) << c);
                            float f21 = f9;
                            char c2 = c;
                            oio.C1(oioVar, j, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f21) << c2) | (Float.floatToRawIntBits(f21) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                            i9 = i10 + 1;
                            c = c2;
                            u5b0Var5 = u5b0Var5;
                        }
                        return s3q0.a;
                    }
                };
                aVar2.R(izsVar);
                x5 = izsVar;
            }
            xa4.i((i3 >> 6) & 14, aVar2, (izs) x5, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.g6b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    p6b0.a(u5b0.this, z2, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
