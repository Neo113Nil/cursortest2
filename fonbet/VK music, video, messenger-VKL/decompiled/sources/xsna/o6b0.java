package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.playlist.framework.presentation.indication.InvalidPlayingIndicationConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlayingIndication.kt */
/* loaded from: classes3.dex */
public final class o6b0 {
    public static final void a(final t5b0 t5b0Var, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        float f = t5b0Var.f;
        float f2 = t5b0Var.e;
        float f3 = t5b0Var.b;
        float f4 = t5b0Var.c;
        float f5 = t5b0Var.d;
        List<pco> list = t5b0Var.h;
        androidx.compose.runtime.a M = aVar.M(-1691381634);
        int i2 = (M.J(t5b0Var) ? 4 : 2) | i | (M.l(z) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1691381634, i2, -1, "com.vk.music.playlist.framework.presentation.indication.PlayingIndication (PlayingIndication.kt:32)");
            }
            int i3 = t5b0Var.a;
            if (i3 > 0) {
                float f6 = 0;
                if (pco.a(f3, f6) > 0 && pco.a(f5, f6) > 0 && pco.a(f4, f5) > 0 && pco.a(f2, f6) > 0 && pco.a(f, f6) >= 0 && list.size() == i3) {
                    List<pco> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            float f7 = ((pco) it.next()).b;
                            if (pco.a(f7, f5) >= 0 && pco.a(f7, f4) <= 0) {
                            }
                        }
                    }
                    azl azlVar = (azl) M.r(uvi.h);
                    final float I0 = azlVar.I0(f3);
                    final float I02 = azlVar.I0(f4);
                    final float I03 = azlVar.I0(f5);
                    final float I04 = azlVar.I0(f);
                    final float I05 = azlVar.I0(f2);
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    Object obj = x;
                    if (x == c0012a) {
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(qf2.a((azlVar.I0(((pco) it2.next()).b) - I03) / (I02 - I03)));
                        }
                        M.R(arrayList);
                        obj = arrayList;
                    }
                    final List list3 = (List) obj;
                    Boolean valueOf = Boolean.valueOf(z);
                    int i4 = i2 & 14;
                    boolean y = (i4 == 4) | ((i2 & 112) == 32) | M.y(list3);
                    Object x2 = M.x();
                    if (y || x2 == c0012a) {
                        x2 = new h6b0(z, t5b0Var, list3, null);
                        M.R(x2);
                    }
                    bap.g(valueOf, (wzs) x2, M, (i2 >> 3) & 14);
                    boolean n = M.n(I0) | (i4 == 4) | M.n(I05) | M.n(I02) | M.n(I03) | M.y(list3) | M.n(I04);
                    Object x3 = M.x();
                    if (n || x3 == c0012a) {
                        izs izsVar = new izs() { // from class: xsna.b6b0
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                float f8;
                                float f9;
                                oio oioVar = (oio) obj2;
                                char c = ' ';
                                float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                                t5b0 t5b0Var2 = t5b0Var;
                                int i5 = t5b0Var2.a;
                                float f10 = I0;
                                float f11 = I05;
                                float f12 = 2;
                                float f13 = intBitsToFloat - ((((i5 - 1) * f11) + (i5 * f10)) / f12);
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                                float f14 = I02;
                                float f15 = (f14 / f12) + intBitsToFloat2;
                                l5g l5gVar = t5b0Var2.i;
                                if (l5gVar != null) {
                                    f9 = f11;
                                    f8 = f14;
                                    oio.P(oioVar, l5gVar.a, 0L, oioVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                                } else {
                                    f8 = f14;
                                    f9 = f11;
                                }
                                int i6 = 0;
                                while (i6 < i5) {
                                    float f16 = ((f10 + f9) * i6) + f13;
                                    float f17 = I03;
                                    float floatValue = (((Number) ((if2) list3.get(i6)).d()).floatValue() * (f8 - f17)) + f17;
                                    int i7 = i6;
                                    long j = t5b0Var2.g;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(f16) << c) | (Float.floatToRawIntBits(f15 - floatValue) & 4294967295L);
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(f10) << c);
                                    float f18 = I04;
                                    char c2 = c;
                                    oio.C1(oioVar, j, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f18) << c2) | (Float.floatToRawIntBits(f18) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                                    i6 = i7 + 1;
                                    c = c2;
                                    t5b0Var2 = t5b0Var2;
                                }
                                return s3q0.a;
                            }
                        };
                        M.R(izsVar);
                        x3 = izsVar;
                    }
                    xa4.i(6, M, (izs) x3, q630Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            throw new InvalidPlayingIndicationConfigException("Invalid config " + t5b0Var);
        }
        M.h();
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, q630Var, i) { // from class: xsna.f6b0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(385);
                    o6b0.a(t5b0.this, this.c, this.d, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
