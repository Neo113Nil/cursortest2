package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.music.impl.ui.musictrack.playingindication.InvalidPlayingIndicationStateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PlayingIndication.kt */
/* loaded from: classes16.dex */
public final class q6b0 {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final t6b0 t6b0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        final float I0;
        final float I02;
        Object x;
        a.C0011a.C0012a c0012a;
        boolean y;
        Object x2;
        boolean n;
        Object x3;
        float f = t6b0Var.g;
        float f2 = t6b0Var.f;
        float f3 = t6b0Var.c;
        float f4 = t6b0Var.d;
        float f5 = t6b0Var.e;
        List<pco> list = t6b0Var.i;
        androidx.compose.runtime.a M = aVar.M(-1302973730);
        int i2 = (M.J(t6b0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1302973730, i2, -1, "com.vk.catalog.mvi.block.music.impl.ui.musictrack.playingindication.PlayingIndication (PlayingIndication.kt:30)");
            }
            int i3 = t6b0Var.b;
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
                    final float I03 = azlVar.I0(f3);
                    I0 = azlVar.I0(f4);
                    I02 = azlVar.I0(f5);
                    final float I04 = azlVar.I0(f);
                    final float I05 = azlVar.I0(f2);
                    x = M.x();
                    c0012a = a.C0011a.a;
                    Object obj = x;
                    if (x == c0012a) {
                        List<pco> list3 = list;
                        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                        Iterator<T> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(qf2.a((azlVar.I0(((pco) it2.next()).b) - I02) / (I0 - I02)));
                        }
                        M.R(arrayList);
                        obj = arrayList;
                    }
                    final List list4 = (List) obj;
                    Boolean valueOf = Boolean.valueOf(t6b0Var.a);
                    int i4 = i2 & 14;
                    y = (i4 != 4) | M.y(list4);
                    x2 = M.x();
                    if (!y || x2 == c0012a) {
                        x2 = new l6b0(t6b0Var, list4, null);
                        M.R(x2);
                    }
                    bap.g(valueOf, (wzs) x2, M, 0);
                    q630 d = txj0.d(q630Var, 1.0f);
                    n = M.n(I03) | (i4 != 4) | M.n(I05) | M.n(I0) | M.n(I02) | M.y(list4) | M.n(I04);
                    x3 = M.x();
                    if (!n || x3 == c0012a) {
                        izs izsVar = new izs() { // from class: xsna.d6b0
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                float f8;
                                float f9;
                                oio oioVar = (oio) obj2;
                                char c = ' ';
                                float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                                t6b0 t6b0Var2 = t6b0Var;
                                int i5 = t6b0Var2.b;
                                float f10 = I03;
                                float f11 = I05;
                                float f12 = 2;
                                float f13 = intBitsToFloat - ((((i5 - 1) * f11) + (i5 * f10)) / f12);
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                                float f14 = I0;
                                float f15 = (f14 / f12) + intBitsToFloat2;
                                l5g l5gVar = t6b0Var2.j;
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
                                    float f17 = I02;
                                    float floatValue = (((Number) ((if2) list4.get(i6)).d()).floatValue() * (f8 - f17)) + f17;
                                    int i7 = i6;
                                    long j = t6b0Var2.h;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(f16) << c) | (Float.floatToRawIntBits(f15 - floatValue) & 4294967295L);
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(f10) << c);
                                    float f18 = I04;
                                    char c2 = c;
                                    oio.C1(oioVar, j, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f18) << c2) | (Float.floatToRawIntBits(f18) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                                    i6 = i7 + 1;
                                    c = c2;
                                    t6b0Var2 = t6b0Var2;
                                }
                                return s3q0.a;
                            }
                        };
                        M.R(izsVar);
                        x3 = izsVar;
                    }
                    xa4.i(0, M, (izs) x3, d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            com.vk.metrics.eventtracking.b.a.q(new InvalidPlayingIndicationStateException("Invalid state: " + t6b0Var));
            azl azlVar2 = (azl) M.r(uvi.h);
            final float I032 = azlVar2.I0(f3);
            I0 = azlVar2.I0(f4);
            I02 = azlVar2.I0(f5);
            final float I042 = azlVar2.I0(f);
            final float I052 = azlVar2.I0(f2);
            x = M.x();
            c0012a = a.C0011a.a;
            Object obj2 = x;
            if (x == c0012a) {
            }
            final List list42 = (List) obj2;
            Boolean valueOf2 = Boolean.valueOf(t6b0Var.a);
            int i42 = i2 & 14;
            y = (i42 != 4) | M.y(list42);
            x2 = M.x();
            if (!y) {
            }
            x2 = new l6b0(t6b0Var, list42, null);
            M.R(x2);
            bap.g(valueOf2, (wzs) x2, M, 0);
            q630 d2 = txj0.d(q630Var, 1.0f);
            n = M.n(I032) | (i42 != 4) | M.n(I052) | M.n(I0) | M.n(I02) | M.y(list42) | M.n(I042);
            x3 = M.x();
            if (!n) {
            }
            izs izsVar2 = new izs() { // from class: xsna.d6b0
                @Override // xsna.izs
                public final Object invoke(Object obj22) {
                    float f8;
                    float f9;
                    oio oioVar = (oio) obj22;
                    char c = ' ';
                    float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                    t6b0 t6b0Var2 = t6b0Var;
                    int i5 = t6b0Var2.b;
                    float f10 = I032;
                    float f11 = I052;
                    float f12 = 2;
                    float f13 = intBitsToFloat - ((((i5 - 1) * f11) + (i5 * f10)) / f12);
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                    float f14 = I0;
                    float f15 = (f14 / f12) + intBitsToFloat2;
                    l5g l5gVar = t6b0Var2.j;
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
                        float f17 = I02;
                        float floatValue = (((Number) ((if2) list42.get(i6)).d()).floatValue() * (f8 - f17)) + f17;
                        int i7 = i6;
                        long j = t6b0Var2.h;
                        long floatToRawIntBits = (Float.floatToRawIntBits(f16) << c) | (Float.floatToRawIntBits(f15 - floatValue) & 4294967295L);
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(floatValue) & 4294967295L) | (Float.floatToRawIntBits(f10) << c);
                        float f18 = I042;
                        char c2 = c;
                        oio.C1(oioVar, j, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(f18) << c2) | (Float.floatToRawIntBits(f18) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                        i6 = i7 + 1;
                        c = c2;
                        t6b0Var2 = t6b0Var2;
                    }
                    return s3q0.a;
                }
            };
            M.R(izsVar2);
            x3 = izsVar2;
            xa4.i(0, M, (izs) x3, d2);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rv7(t6b0Var, q630Var, i, 4);
        }
    }
}
