package xsna;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.design.compose.playing.InvalidPlayingIndicationConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlayingIndication.kt */
/* loaded from: classes3.dex */
public final class n6b0 {
    public static final void a(final s5b0 s5b0Var, boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final boolean z2;
        androidx.compose.runtime.a aVar2;
        s5b0 s5b0Var2;
        Object j6b0Var;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        androidx.compose.runtime.a M = aVar.M(-921801092);
        int i4 = i | (M.J(s5b0Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-921801092, i4, -1, "com.vk.music.design.compose.playing.PlayingIndication (PlayingIndication.kt:29)");
            }
            boolean z3 = (i4 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                List<pco> list = s5b0Var.h;
                float f4 = s5b0Var.c;
                float f5 = s5b0Var.d;
                int i5 = s5b0Var.a;
                if (i5 > 0) {
                    float f6 = 0;
                    if (pco.a(s5b0Var.b, f6) > 0 && pco.a(f5, f6) > 0 && pco.a(f4, f5) > 0 && pco.a(s5b0Var.e, f6) > 0 && pco.a(s5b0Var.f, f6) >= 0 && list.size() == i5) {
                        List<pco> list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                float f7 = ((pco) it.next()).b;
                                if (pco.a(f7, f4) <= 0 && pco.a(f7, f5) >= 0) {
                                }
                            }
                        }
                        M.R(s5b0Var);
                        x = s5b0Var;
                    }
                }
                throw new InvalidPlayingIndicationConfigException("Invalid config " + s5b0Var);
            }
            s5b0 s5b0Var3 = (s5b0) x;
            azl azlVar = (azl) M.r(uvi.h);
            final float I0 = azlVar.I0(s5b0Var3.b);
            final float I02 = azlVar.I0(s5b0Var3.c);
            float I03 = azlVar.I0(s5b0Var3.d);
            float I04 = azlVar.I0(s5b0Var3.f);
            float I05 = azlVar.I0(s5b0Var3.e);
            Object x2 = M.x();
            if (x2 == c0012a) {
                List<pco> list3 = s5b0Var3.h;
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
            float f8 = Settings.Global.getFloat(((Context) M.r(AndroidCompositionLocals_androidKt.b)).getContentResolver(), "animator_duration_scale", 1.0f);
            Float valueOf = Float.valueOf(f8);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i6 = i4 & 112;
            boolean n = M.n(f8) | (i6 == 32) | M.J(s5b0Var3) | M.y(list4);
            Object x4 = M.x();
            if (n || x4 == c0012a) {
                s5b0Var2 = s5b0Var3;
                i2 = i4;
                i3 = i6;
                f = I05;
                f2 = I03;
                f3 = I04;
                j6b0Var = new j6b0(f8, z, s5b0Var2, list4, dtp0Var, null);
                M.R(j6b0Var);
            } else {
                s5b0Var2 = s5b0Var3;
                i3 = i6;
                i2 = i4;
                j6b0Var = x4;
                f = I05;
                f2 = I03;
                f3 = I04;
            }
            aVar2 = M;
            z2 = z;
            bap.e(valueOf, valueOf2, s5b0Var2, (wzs) j6b0Var, aVar2, i3);
            boolean n2 = aVar2.n(I0) | aVar2.J(s5b0Var2) | aVar2.n(f) | aVar2.n(I02) | aVar2.n(f2) | aVar2.y(list4) | aVar2.n(f3);
            Object x5 = aVar2.x();
            if (n2 || x5 == c0012a) {
                final s5b0 s5b0Var4 = s5b0Var2;
                final float f9 = f;
                final float f10 = f3;
                final float f11 = f2;
                izs izsVar = new izs() { // from class: xsna.a6b0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        float f12;
                        float f13;
                        oio oioVar = (oio) obj;
                        char c = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                        s5b0 s5b0Var5 = s5b0Var4;
                        int i7 = s5b0Var5.a;
                        float f14 = I0;
                        float f15 = f9;
                        float f16 = 2;
                        float f17 = intBitsToFloat - ((((i7 - 1) * f15) + (i7 * f14)) / f16);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                        float f18 = I02;
                        float f19 = (f18 / f16) + intBitsToFloat2;
                        l5g l5gVar = s5b0Var5.i;
                        if (l5gVar != null) {
                            f13 = f15;
                            f12 = f18;
                            oio.P(oioVar, l5gVar.a, 0L, oioVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        } else {
                            f12 = f18;
                            f13 = f15;
                        }
                        int i8 = 0;
                        while (i8 < i7) {
                            float f20 = ((f14 + f13) * i8) + f17;
                            float f21 = f11;
                            float floatValue = (((Number) ((if2) list4.get(i8)).d()).floatValue() * (f12 - f21)) + f21;
                            int i9 = i8;
                            long j = s5b0Var5.g;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f20) << c) | (Float.floatToRawIntBits(f19 - floatValue) & 4294967295L);
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(f14) << c);
                            float f22 = f10;
                            char c2 = c;
                            oio.C1(oioVar, j, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f22) << c2) | (Float.floatToRawIntBits(f22) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                            i8 = i9 + 1;
                            c = c2;
                            s5b0Var5 = s5b0Var5;
                        }
                        return s3q0.a;
                    }
                };
                aVar2.R(izsVar);
                x5 = izsVar;
            }
            xa4.i((i2 >> 6) & 14, aVar2, (izs) x5, q630Var);
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
            s.d = new wzs(z2, q630Var, i) { // from class: xsna.e6b0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    n6b0.a(s5b0.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
