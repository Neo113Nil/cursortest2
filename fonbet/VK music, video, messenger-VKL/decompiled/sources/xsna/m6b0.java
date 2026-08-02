package xsna;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.design.compose.posting.indication.InvalidPlayingIndicationConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlayingIndication.kt */
/* loaded from: classes18.dex */
public final class m6b0 {
    public static final void a(v5b0 v5b0Var, boolean z, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        Object i6b0Var;
        float f;
        List list;
        float f2;
        float f3;
        int i2;
        float f4;
        v5b0 v5b0Var2;
        androidx.compose.runtime.a M = aVar.M(1472771189);
        int i3 = i | (M.l(z) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1472771189, i3, -1, "com.vk.feed.design.compose.posting.indication.PlayingIndication (PlayingIndication.kt:33)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                List<pco> list2 = v5b0Var.h;
                float f5 = v5b0Var.c;
                float f6 = v5b0Var.d;
                int i4 = v5b0Var.a;
                if (i4 > 0) {
                    float f7 = 0;
                    if (pco.a(v5b0Var.b, f7) > 0 && pco.a(f6, f7) > 0 && pco.a(f5, f6) > 0 && pco.a(v5b0Var.e, f7) > 0 && pco.a(v5b0Var.f, f7) >= 0 && list2.size() == i4) {
                        List<pco> list3 = list2;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                float f8 = ((pco) it.next()).b;
                                if (pco.a(f8, f5) <= 0 && pco.a(f8, f6) >= 0) {
                                }
                            }
                        }
                        M.R(v5b0Var);
                        x = v5b0Var;
                    }
                }
                throw new InvalidPlayingIndicationConfigException("Invalid config " + v5b0Var);
            }
            v5b0 v5b0Var3 = (v5b0) x;
            azl azlVar = (azl) M.r(uvi.h);
            final float I0 = azlVar.I0(v5b0Var3.b);
            float I02 = azlVar.I0(v5b0Var3.c);
            float I03 = azlVar.I0(v5b0Var3.d);
            float I04 = azlVar.I0(v5b0Var3.f);
            float I05 = azlVar.I0(v5b0Var3.e);
            Object x2 = M.x();
            if (x2 == c0012a) {
                List<pco> list4 = v5b0Var3.h;
                ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(qf2.a((azlVar.I0(((pco) it2.next()).b) - I03) / (I02 - I03)));
                }
                M.R(arrayList);
                x2 = arrayList;
            }
            List list5 = (List) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = jq2.d(250, 0, luo.a, 2);
                M.R(x3);
            }
            dtp0 dtp0Var = (dtp0) x3;
            float f9 = Settings.Global.getFloat(((Context) M.r(AndroidCompositionLocals_androidKt.b)).getContentResolver(), "animator_duration_scale", 1.0f);
            Float valueOf = Float.valueOf(f9);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i5 = i3 & 112;
            boolean n = M.n(f9) | (i5 == 32) | M.J(v5b0Var3) | M.y(list5);
            Object x4 = M.x();
            if (n || x4 == c0012a) {
                f = I02;
                list = list5;
                f2 = I05;
                f3 = I03;
                i2 = i5;
                f4 = I04;
                i6b0Var = new i6b0(f9, z, v5b0Var3, list, dtp0Var, null);
                v5b0Var2 = v5b0Var3;
                M.R(i6b0Var);
            } else {
                i2 = i5;
                f2 = I05;
                v5b0Var2 = v5b0Var3;
                f = I02;
                list = list5;
                f4 = I04;
                i6b0Var = x4;
                f3 = I03;
            }
            final v5b0 v5b0Var4 = v5b0Var2;
            bap.e(valueOf, valueOf2, v5b0Var4, (wzs) i6b0Var, M, i2);
            boolean n2 = M.n(I0) | M.J(v5b0Var4) | M.n(f2) | M.n(f) | M.n(f3) | M.y(list) | M.n(f4);
            Object x5 = M.x();
            if (n2 || x5 == c0012a) {
                final float f10 = f3;
                final float f11 = f4;
                final List list6 = list;
                final float f12 = f;
                final float f13 = f2;
                izs izsVar = new izs() { // from class: xsna.z5b0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        float f14;
                        float f15;
                        oio oioVar = (oio) obj;
                        char c = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                        v5b0 v5b0Var5 = v5b0Var4;
                        int i6 = v5b0Var5.a;
                        float f16 = I0;
                        float f17 = f13;
                        float f18 = 2;
                        float f19 = intBitsToFloat - ((((i6 - 1) * f17) + (i6 * f16)) / f18);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                        float f20 = f12;
                        float f21 = (f20 / f18) + intBitsToFloat2;
                        l5g l5gVar = v5b0Var5.i;
                        if (l5gVar != null) {
                            f15 = f17;
                            f14 = f20;
                            oio.P(oioVar, l5gVar.a, 0L, oioVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        } else {
                            f14 = f20;
                            f15 = f17;
                        }
                        int i7 = 0;
                        while (i7 < i6) {
                            float f22 = ((f16 + f15) * i7) + f19;
                            float f23 = f10;
                            float floatValue = (((Number) ((if2) list6.get(i7)).d()).floatValue() * (f14 - f23)) + f23;
                            int i8 = i7;
                            long j = v5b0Var5.g;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f22) << c) | (Float.floatToRawIntBits(f21 - floatValue) & 4294967295L);
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(f16) << c);
                            float f24 = f11;
                            char c2 = c;
                            oio.C1(oioVar, j, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f24) << c2) | (Float.floatToRawIntBits(f24) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                            i7 = i8 + 1;
                            c = c2;
                            v5b0Var5 = v5b0Var5;
                        }
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x5 = izsVar;
            }
            q630Var2 = q630Var;
            xa4.i(6, M, (izs) x5, q630Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new no0(i, 1, v5b0Var, q630Var2, z);
        }
    }
}
