package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MusicPlayingOverlay.kt */
/* loaded from: classes3.dex */
public final class jz40 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final q630 q630Var, final boolean z) {
        int i2;
        Object iz40Var;
        List list;
        int i3;
        a.C0011a.C0012a c0012a;
        float f;
        long j;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-457407900);
        if ((i & 6) == 0) {
            i2 = i | (M.l(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-457407900, i2, -1, "com.vk.music.compose.TrackPlayingBars (MusicPlayingOverlay.kt:91)");
            }
            q630 m = hr80.m(q630Var, l5g.c(14, l5g.b, 0.24f), androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            azl azlVar = (azl) M.r(uvi.h);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(945008972, 6, -1, "com.vk.music.compose.Defaults.columnCount (MusicPlayingOverlay.kt:47)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.K(533832537);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1916875384, 6, -1, "com.vk.music.compose.Defaults.columnWidth (MusicPlayingOverlay.kt:50)");
            }
            float f2 = 2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final float I0 = azlVar.I0(f2);
            M.j();
            M.K(533835037);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1926648157, 6, -1, "com.vk.music.compose.Defaults.columnMaxHeight (MusicPlayingOverlay.kt:53)");
            }
            float f3 = 18;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final float I02 = azlVar.I0(f3);
            M.j();
            M.K(533837661);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(450406859, 6, -1, "com.vk.music.compose.Defaults.columnMinHeight (MusicPlayingOverlay.kt:56)");
            }
            float f4 = 4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final float I03 = azlVar.I0(f4);
            M.j();
            final float I04 = azlVar.I0(f2);
            float I05 = azlVar.I0(f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-397189396, 6, -1, "com.vk.music.compose.Defaults.columnColor (MusicPlayingOverlay.kt:62)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getIcon().c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean J = M.J(azlVar) | M.l(false);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            Object obj = x;
            if (J || x == c0012a2) {
                float f5 = 10;
                List l = e43.l(new pco(f5), new pco(16), new pco(f3), new pco(f5));
                ArrayList arrayList = new ArrayList(c5g.u(l, 10));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf((azlVar.I0(((pco) it.next()).b) - I03) / (I02 - I03)));
                }
                M.R(arrayList);
                obj = arrayList;
            }
            List list2 = (List) obj;
            boolean J2 = M.J(azlVar) | M.l(false);
            Object x2 = M.x();
            Object obj2 = x2;
            if (J2 || x2 == c0012a2) {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(qf2.a(((Number) it2.next()).floatValue()));
                }
                M.R(arrayList2);
                obj2 = arrayList2;
            }
            List list4 = (List) obj2;
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool = Boolean.FALSE;
            int i5 = i2 & 14;
            boolean y = (i5 == 4) | M.y(list4) | M.y(list2) | M.o(4);
            Object x3 = M.x();
            if (y || x3 == c0012a2) {
                list = list4;
                i3 = 14;
                c0012a = c0012a2;
                f = I05;
                j = j2;
                i4 = 4;
                iz40Var = new iz40(z, list, 4, list2, null);
                M.R(iz40Var);
            } else {
                i3 = 14;
                iz40Var = x3;
                c0012a = c0012a2;
                list = list4;
                f = I05;
                j = j2;
                i4 = 4;
            }
            bap.f(valueOf, bool, (wzs) iz40Var, M, i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(400274237, 6, -1, "com.vk.music.compose.Defaults.canvasSize (MusicPlayingOverlay.kt:59)");
            }
            float f6 = i3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 q = txj0.q(q630.a.a, f6);
            boolean n = M.n(I0) | M.o(i4) | M.n(f) | M.n(I02) | M.n(I03) | M.y(list);
            final long j3 = j;
            boolean p = n | M.p(j3) | M.n(I04);
            Object x4 = M.x();
            if (p || x4 == c0012a) {
                final float f7 = f;
                final List list5 = list;
                x4 = new izs() { // from class: xsna.gz40
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        oio oioVar = (oio) obj3;
                        char c2 = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() >> 32));
                        float f8 = I0;
                        float f9 = f7;
                        float f10 = 2;
                        float f11 = intBitsToFloat - (((3 * f9) + (4 * f8)) / f10);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                        float f12 = I02;
                        float f13 = (f12 / f10) + intBitsToFloat2;
                        int i6 = 0;
                        for (int i7 = 4; i6 < i7; i7 = 4) {
                            float f14 = I03;
                            float floatValue = (((Number) ((if2) list5.get(i6)).d()).floatValue() * (f12 - f14)) + f14;
                            float f15 = I04;
                            char c3 = c2;
                            oio.C1(oioVar, j3, (Float.floatToRawIntBits(f13 - floatValue) & 4294967295L) | (Float.floatToRawIntBits(((f8 + f9) * i6) + f11) << c2), (Float.floatToRawIntBits(f8) << c2) | (Float.floatToRawIntBits(floatValue) & 4294967295L), (Float.floatToRawIntBits(f15) << c3) | (Float.floatToRawIntBits(f15) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                            i6++;
                            c2 = c3;
                            f12 = f12;
                        }
                        return s3q0.a;
                    }
                };
                M.R(x4);
            }
            xa4.i(0, M, (izs) x4, q);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hz40
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    jz40.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj3, q630Var, z);
                    return s3q0.a;
                }
            };
        }
    }
}
