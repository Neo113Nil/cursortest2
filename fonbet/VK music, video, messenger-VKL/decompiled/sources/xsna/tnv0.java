package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkSubscribersCell.kt */
/* loaded from: classes5.dex */
public final class tnv0 {

    /* compiled from: VkSubscribersCell.kt */
    public static final class a implements wq5<String> {
        public static final a b = new a();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(String str, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            String str2;
            androidx.compose.runtime.a M = aVar.M(-1435148899);
            if ((i & 6) == 0) {
                i2 = (M.J(str) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1435148899, i2, -1, "com.vk.profile.design.compose.header.info.subscribers.composable.VkSubscribersCell.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (VkSubscribersCell.kt:86)");
                }
                str2 = str;
                if (as.a((i2 & 112) | 8, yzsVar, fwu0.l(null, str2, null, null, M, (i2 << 3) & 112, 61), M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                str2 = str;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new fku(this, str2, yzsVar, i);
            }
        }
    }

    public static final void a(final us2 us2Var, final long j, final frv0 frv0Var, final int i, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1014243449);
        int i3 = (M.J(us2Var) ? 4 : 2) | i2 | (M.p(j) ? 32 : 16) | (M.J(frv0Var) ? 256 : 128);
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1014243449, i3, -1, "com.vk.profile.design.compose.header.info.subscribers.composable.SubscribersMiddleLineVkText (VkSubscribersCell.kt:106)");
            }
            int i4 = (i3 & 14) | 805306368 | ((i3 >> 9) & 112);
            int i5 = i3 << 3;
            aVar2 = M;
            yqv0.d(us2Var, q630Var, j, 0, null, i, false, 1, null, null, frv0Var, aVar2, i4 | (i5 & 896) | 100663296, (i5 & 7168) | 6, 6392);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.snv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tnv0.a(us2.this, j, frv0Var, i, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final us2 us2Var, final long j, final q630 q630Var, frv0 frv0Var, androidx.compose.runtime.a aVar, final int i) {
        final frv0 frv0Var2;
        frv0 frv0Var3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(407165926);
        int i3 = i | (M.J(us2Var) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 1024;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var3 = wuv0Var.Y;
                i2 = i3 & (-7169);
            } else {
                M.h();
                i2 = i3 & (-7169);
                frv0Var3 = frv0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(407165926, i2, -1, "com.vk.profile.design.compose.header.info.subscribers.composable.SubscribersSlotFadingMiddleText (VkSubscribersCell.kt:124)");
            }
            final wjo0 a2 = xjo0.a(0, 1, M);
            boolean J = M.J(frv0Var3) | ((i2 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = frv0Var3.a.d(new nmo0(j, 0L, null, null, 0L, null, null, 0, 0L, null, null, 0, 16777214));
                M.R(x);
            }
            final nmo0 nmo0Var = (nmo0) x;
            final frv0 frv0Var4 = frv0Var3;
            ua8.a(q630Var, null, false, kai.c(1924335952, new yzs() { // from class: xsna.qnv0
                /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z;
                    us2 us2Var2;
                    int i4;
                    boolean z2;
                    int i5;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1924335952, intValue, -1, "com.vk.profile.design.compose.header.info.subscribers.composable.SubscribersSlotFadingMiddleText.<anonymous> (VkSubscribersCell.kt:131)");
                        }
                        boolean e = o6j.e(va8Var.f());
                        q630.a aVar3 = q630.a.a;
                        us2 us2Var3 = us2.this;
                        long j2 = j;
                        frv0 frv0Var5 = frv0Var4;
                        if (!e) {
                            aVar2.K(-1331068367);
                            tnv0.a(us2Var3, j2, frv0Var5, 3, aVar3, aVar2, 27648);
                            aVar2.j();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            return s3q0.a;
                        }
                        aVar2.K(-1335760558);
                        aVar2.j();
                        int i6 = o6j.i(va8Var.f());
                        boolean J2 = aVar2.J(us2Var3);
                        nmo0 nmo0Var2 = nmo0Var;
                        boolean J3 = J2 | aVar2.J(nmo0Var2) | aVar2.o(i6);
                        Object x2 = aVar2.x();
                        if (J3 || x2 == a.C0011a.a) {
                            if (i6 <= 0) {
                                us2Var2 = us2Var3;
                                i4 = i6;
                                z = false;
                                x2 = null;
                            } else {
                                long b = s6j.b(0, i6, 0, 0, 13);
                                z = false;
                                us2Var2 = us2Var3;
                                i4 = i6;
                                x2 = wjo0.b(a2, us2Var2, nmo0Var2, 1, false, 1, b, null, null, null, 1952);
                            }
                            aVar2.R(x2);
                        } else {
                            us2Var2 = us2Var3;
                            i4 = i6;
                            z = false;
                        }
                        ljo0 ljo0Var = (ljo0) x2;
                        if (ljo0Var != null && (i5 = ljo0Var.b.f) != 0) {
                            int i7 = i5 - 1;
                            float i8 = ljo0Var.i(i7) - ljo0Var.h(i7);
                            if (ljo0Var.e() || i8 >= i4) {
                                z2 = true;
                                tnv0.a(us2Var2, j2, frv0Var5, 1, ajq.a(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, va8Var.j(), 1, aVar3), z2), aVar2, 3072);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            }
                        }
                        z2 = z;
                        tnv0.a(us2Var2, j2, frv0Var5, 1, ajq.a(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, va8Var.j(), 1, aVar3), z2), aVar2, 3072);
                        if (androidx.compose.runtime.b.d()) {
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 6) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var2 = frv0Var4;
        } else {
            M.h();
            frv0Var2 = frv0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, q630Var, frv0Var2, i) { // from class: xsna.rnv0
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ frv0 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    tnv0.b(us2.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0206, code lost:
    
        if (r10 == r13) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final exm0 exm0Var, final izs<? super AuthorHeaderEvent, s3q0> izsVar, final q630 q630Var, izs<? super zhf0, s3q0> izsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        izs<? super zhf0, s3q0> izsVar3;
        final izs<? super zhf0, s3q0> izsVar4;
        androidx.compose.runtime.f s;
        izs<? super zhf0, s3q0> izsVar5;
        izs<? super zhf0, s3q0> izsVar6;
        String str;
        a.C0011a.C0012a c0012a;
        a.C0011a.C0012a c0012a2;
        androidx.compose.runtime.a M = aVar.M(1476723598);
        if ((i & 6) == 0) {
            i3 = (M.J(exm0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            izsVar3 = izsVar2;
            i3 |= M.y(izsVar3) ? 2048 : 1024;
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
                izsVar4 = izsVar3;
            } else {
                a.C0011a.C0012a c0012a3 = a.C0011a.a;
                if (i4 != 0) {
                    Object x = M.x();
                    if (x == c0012a3) {
                        x = new yml0(13);
                        M.R(x);
                    }
                    izsVar5 = (izs) x;
                } else {
                    izsVar5 = izsVar3;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1476723598, i3, -1, "com.vk.profile.design.compose.header.info.subscribers.composable.VkSubscribersCell (VkSubscribersCell.kt:48)");
                }
                q630 E = ahn.E(q630Var, "author_header_subscribers");
                boolean z = (i3 & 7168) == 2048;
                Object x2 = M.x();
                if (z || x2 == c0012a3) {
                    x2 = new opd(izsVar5, 7);
                    M.R(x2);
                }
                q630 o = egi.o(E, (izs) x2);
                boolean z2 = (i3 & 112) == 32;
                int i5 = i3 & 14;
                boolean z3 = z2 | (i5 == 4);
                Object x3 = M.x();
                if (z3 || x3 == c0012a3) {
                    x3 = new onv0(0, exm0Var, izsVar);
                    M.R(x3);
                }
                q630 E2 = s200.E(txj0.f(ojc.c(o, false, null, null, (gzs) x3, 15), 1.0f), kqu0.b, kqu0.r);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E2);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                izs<? super zhf0, s3q0> izsVar7 = izsVar5;
                lg90 lg90Var = exm0Var.b;
                q630.a aVar3 = q630.a.a;
                if (lg90Var == null) {
                    M.K(-2052627841);
                    M.j();
                    str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    izsVar6 = izsVar7;
                    c0012a = c0012a3;
                } else {
                    M.K(-2052627840);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    izsVar6 = izsVar7;
                    str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                    c0012a = c0012a3;
                    pzu0.b(lg90Var, null, null, ylu0Var.getIcon().j, M, 56, 4);
                    mq.d(aVar3, kqu0.v, M, 0);
                }
                us2 us2Var = exm0Var.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var2.getText().m;
                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    szw.a("invalid weight; must be greater than zero");
                }
                q630 E3 = ahn.E(rte0.e(txj0.x(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f, false))), "author_header_subscribers_status");
                boolean z4 = i5 == 4;
                Object x4 = M.x();
                if (z4) {
                    c0012a2 = c0012a;
                } else {
                    c0012a2 = c0012a;
                }
                x4 = new hfv0(exm0Var, 1);
                M.R(x4);
                b(us2Var, j, egi0.b(E3, true, (izs) x4), null, M, 0);
                if (exm0Var.d) {
                    M.K(-2051966889);
                    f9t.e(txj0.v(aVar3, kqu0.t), M, 0);
                    boolean z5 = i5 == 4;
                    Object x5 = M.x();
                    if (z5 || x5 == c0012a2) {
                        x5 = new xau0(exm0Var, 1);
                        M.R(x5);
                    }
                    hyv0.c(null, null, null, (izs) x5, M, 0, 7);
                    M = M;
                } else {
                    M.K(-2055379400);
                }
                M.j();
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                izsVar4 = izsVar6;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.pnv0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        tnv0.c(exm0.this, izsVar, q630Var, izsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        izsVar3 = izsVar2;
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
