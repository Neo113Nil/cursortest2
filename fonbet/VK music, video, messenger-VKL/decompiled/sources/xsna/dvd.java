package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tra0;

/* compiled from: ClipsEditDescriptionView.kt */
/* loaded from: classes16.dex */
public final class dvd {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final us2 us2Var, final List list, final String str, final gzs gzsVar, final izs izsVar, final q630 q630Var, yzs yzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final izs izsVar2;
        yzs yzsVar2;
        final yzs yzsVar3;
        sg50 sg50Var;
        Object obj;
        int i4;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-2142960185);
        if ((i & 6) == 0) {
            i3 = (M.J(us2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            izsVar2 = izsVar;
            i3 |= M.y(izsVar2) ? 16384 : 8192;
        } else {
            izsVar2 = izsVar;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            yzsVar2 = yzsVar;
        } else {
            yzsVar2 = yzsVar;
            if ((i & 1572864) == 0) {
                i3 |= M.y(yzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        if (M.t(i3 & 1, (i3 & 599187) != 599186)) {
            final yzs yzsVar4 = i6 != 0 ? null : yzsVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2142960185, i3, -1, "com.vk.clips.design.compose.description.DescriptionTextArea (ClipsEditDescriptionView.kt:54)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var2 = (sg50) x;
            boolean z = (i3 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new tho0(us2Var, 0L, 6);
                M.R(x2);
            }
            final tho0 tho0Var = (tho0) x2;
            us2 us2Var2 = us2Var.c.length() == 0 ? str : us2Var;
            uog0 b = vog0.b(8);
            if (androidx.compose.runtime.b.d()) {
                sg50Var = sg50Var2;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                sg50Var = sg50Var2;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(rte0.d(q630Var, b), ylu0Var.r().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            q630 h = txj0.h(txj0.f(q630.a.a, 1.0f), 150);
            boolean J = M.J(tho0Var) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((3670016 & i3) == 1048576) | ((i3 & 7168) == 2048) | M.y(us2Var2);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                final us2 us2Var3 = us2Var2;
                final sg50 sg50Var3 = sg50Var;
                i4 = 0;
                i5 = 6;
                obj = new wzs() { // from class: xsna.avd
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        final ArrayList arrayList;
                        int i7;
                        final ArrayList arrayList2;
                        ztm0 ztm0Var = (ztm0) obj2;
                        o6j o6jVar = (o6j) obj3;
                        int i8 = o6j.i(o6jVar.a);
                        long j = o6jVar.a;
                        long a = s6j.a(0, i8, 0, o6j.h(j));
                        List<zo10> t1 = ztm0Var.t1(h2m.TextArea, new jai(-1240757871, new r85(2, tho0.this, str), true));
                        final ArrayList arrayList3 = new ArrayList(c5g.u(t1, 10));
                        Iterator<T> it = t1.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((zo10) it.next()).N(a));
                        }
                        Iterator it2 = arrayList3.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int i9 = ((tra0) it2.next()).c;
                        while (it2.hasNext()) {
                            int i10 = ((tra0) it2.next()).c;
                            if (i9 < i10) {
                                i9 = i10;
                            }
                        }
                        float I0 = i9 - ztm0Var.I0(kqu0.u);
                        List list2 = list;
                        if (list2.isEmpty()) {
                            arrayList = null;
                        } else {
                            List<zo10> t12 = ztm0Var.t1(h2m.Badges, new jai(-439334661, new vy7(list2, izsVar2, 1, yzsVar4), true));
                            ArrayList arrayList4 = new ArrayList(c5g.u(t12, 10));
                            Iterator<T> it3 = t12.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((zo10) it3.next()).N(a));
                            }
                            arrayList = arrayList4;
                        }
                        if (arrayList != null) {
                            Iterator it4 = arrayList.iterator();
                            if (!it4.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            i7 = ((tra0) it4.next()).c;
                            while (it4.hasNext()) {
                                int i11 = ((tra0) it4.next()).c;
                                if (i7 < i11) {
                                    i7 = i11;
                                }
                            }
                        } else {
                            i7 = 0;
                        }
                        final int h2 = o6j.h(j) - i7;
                        if (I0 > h2) {
                            List<zo10> t13 = ztm0Var.t1(h2m.BadgesSeparator, xci.a);
                            ArrayList arrayList5 = new ArrayList(c5g.u(t13, 10));
                            Iterator<T> it5 = t13.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(((zo10) it5.next()).N(a));
                            }
                            arrayList2 = arrayList5;
                        } else {
                            arrayList2 = null;
                        }
                        String obj4 = us2Var3.toString();
                        int i12 = o6j.i(j);
                        if (!((i12 >= 0) & (h2 >= 0))) {
                            wzw.a("width and height must be >= 0");
                        }
                        long h3 = s6j.h(i12, i12, h2, h2);
                        List<zo10> t14 = ztm0Var.t1(h2m.ClickInterceptor, new jai(1653881637, new be0(sg50Var3, gzsVar, obj4, 1), true));
                        final ArrayList arrayList6 = new ArrayList(c5g.u(t14, 10));
                        Iterator<T> it6 = t14.iterator();
                        while (it6.hasNext()) {
                            arrayList6.add(((zo10) it6.next()).N(h3));
                        }
                        return ztm0Var.Q(o6j.i(j), o6j.h(j), jgp.b, new izs() { // from class: xsna.cvd
                            @Override // xsna.izs
                            public final Object invoke(Object obj5) {
                                tra0.a aVar3 = (tra0.a) obj5;
                                Iterator it7 = arrayList3.iterator();
                                while (it7.hasNext()) {
                                    aVar3.q((tra0) it7.next(), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                Iterator it8 = arrayList6.iterator();
                                while (it8.hasNext()) {
                                    aVar3.q((tra0) it8.next(), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                List list3 = arrayList;
                                int i13 = h2;
                                if (list3 != null) {
                                    Iterator it9 = list3.iterator();
                                    while (it9.hasNext()) {
                                        aVar3.q((tra0) it9.next(), 0, i13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                }
                                List list4 = arrayList2;
                                if (list4 != null) {
                                    Iterator it10 = list4.iterator();
                                    while (it10.hasNext()) {
                                        aVar3.q((tra0) it10.next(), 0, i13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                }
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(obj);
            } else {
                obj = x3;
                i4 = 0;
                i5 = 6;
            }
            xtm0.a(h, (wzs) obj, M, i5, i4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yzsVar3 = yzsVar4;
        } else {
            M.h();
            yzsVar3 = yzsVar2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bvd
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    dvd.a(us2.this, list, str, gzsVar, izsVar, q630Var, yzsVar3, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
