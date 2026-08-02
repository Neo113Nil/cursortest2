package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.oy20;
import xsna.phw;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.xcc;
import xsna.z5h;

/* compiled from: CommunityInviteLinkBottomSheet.kt */
/* loaded from: classes5.dex */
public final class z5h extends jmu0 {
    public static final /* synthetic */ int j1 = 0;
    public final wh50<c6h> h1 = androidx.compose.runtime.k.b(null);
    public final wh50<String> i1 = androidx.compose.runtime.k.b("");

    /* compiled from: CommunityInviteLinkBottomSheet.kt */
    public static final class a extends kmu0 {
        public final c6h h;
        public final String i;
        public final ic j;

        public a(Context context, c6h c6hVar, String str, ic icVar) {
            super(context, tzp0.a(null, 3));
            this.h = c6hVar;
            this.i = str;
            this.j = icVar;
            F0(true);
            P0();
            O0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            z5h z5hVar = new z5h();
            ((zak0) z5hVar.h1).setValue(this.h);
            ((zak0) z5hVar.i1).setValue(this.i);
            Z(new y5h(this, 0));
            return z5hVar;
        }
    }

    /* compiled from: CommunityInviteLinkBottomSheet.kt */
    public static final class b implements wq5<wh50<d6h>> {
        public static final b b = new b();

        @Override // xsna.wq5
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(wh50<d6h> wh50Var, final yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            Object obj;
            androidx.compose.runtime.a M = aVar.M(-1836146819);
            if ((i & 6) == 0) {
                i2 = (M.J(wh50Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(yzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                obj = this;
                i2 |= M.J(obj) ? 256 : 128;
            } else {
                obj = this;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1836146819, i2, -1, "com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkBottomSheet.UserStack.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (CommunityInviteLinkBottomSheet.kt:136)");
                }
                fwu0.c(null, null, wh50Var.getValue().a, null, null, null, null, kai.c(54936396, new a0t() { // from class: xsna.a6h
                    @Override // xsna.a0t
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        lg90 lg90Var = (lg90) obj4;
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 384) == 0) {
                            intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(54936396, intValue, -1, "com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkBottomSheet.UserStack.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content.<anonymous> (CommunityInviteLinkBottomSheet.kt:138)");
                            }
                            if (as.a(((intValue >> 6) & 14) | 8, yzs.this, lg90Var, aVar2)) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 100663296, 251);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new zq2(i, 3, obj, wh50Var, yzsVar);
            }
        }
    }

    /* compiled from: CommunityInviteLinkBottomSheet.kt */
    public static final class c implements ixj {
        public final /* synthetic */ int b;

        public c(int i) {
            this.b = i;
        }

        @Override // xsna.ixj
        public final void e(yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(283654630);
            if ((i & 6) == 0) {
                i2 = (M.y(yzsVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(283654630, i2, -1, "com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkBottomSheet.UserStack.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (CommunityInviteLinkBottomSheet.kt:143)");
                }
                yzsVar.invoke(Integer.valueOf(this.b), M, Integer.valueOf((i2 << 3) & 112));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new me4(this, yzsVar, i, 2);
            }
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> te1Var;
        androidx.compose.runtime.a M = aVar.M(-634370651);
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-634370651, i2, -1, "com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkBottomSheet.ThemedContent (CommunityInviteLinkBottomSheet.kt:56)");
            }
            c6h c6hVar = (c6h) ((zak0) this.h1).getValue();
            if (c6hVar == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    te1Var = new w5h(this, i, 0);
                    s.d = te1Var;
                }
                return;
            }
            boolean z = c6hVar.d;
            String str = c6hVar.c;
            if (str.length() > 0) {
                str = str.concat("\n\n");
            }
            StringBuilder e = fw3.e(str);
            e.append(z ? zq.a(M, 255171065, R.string.blacklisted_group, M, 0) : c6hVar.e ? zq.a(M, 255174226, R.string.group_invite_private, M, 0) : zq.a(M, 255176465, R.string.group_invite_closed, M, 0));
            String sb = e.toString();
            lg90 l = fwu0.l(c6hVar.f, null, null, null, M, 0, 62);
            M = M;
            phw a2 = phw.a.a(l, null, null, null, null, M, 196616, 30);
            float f = 72;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ve0(18);
                M.R(x);
            }
            ry20 a3 = qy20.a.C3580a.a(a2, f, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 12);
            xy20 a4 = py20.a.a(384, 0, M, c6hVar.g, sb);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().r, vog0.b(kqu0.f));
            if (z) {
                M.K(-678750431);
                e5v0.b(m, a3, a4, null, null, M, 0, 56);
                M.j();
            } else {
                M.K(-678559192);
                Object N = d370.N(c6hVar.h ? R.string.group_inv_go_to_group : R.string.group_inv_accept, 0, M);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    M.R(N);
                } else {
                    N = x2;
                }
                String str2 = (String) N;
                boolean y = M.y(c6hVar) | ((i2 & 14) == 4 || M.y(this));
                Object x3 = M.x();
                if (y || x3 == c0012a) {
                    x3 = new com.vk.movika.sdk.base.ui.l(6, c6hVar, this);
                    M.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new md(19);
                    M.R(x4);
                }
                sy20 a5 = oy20.a.C3478a.a(str2, gzsVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 6, 4092);
                M = M;
                e5v0.b(m, a3, a4, kai.c(336029065, new s77(this, 2), M), oy20.b.a(a5, null, false, M, 6), M, 3072, 16);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            te1Var = new te1(this, i, 2);
            s.d = te1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void eo(int i, androidx.compose.runtime.a aVar) {
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.f fVar;
        List<d6h> list;
        String F;
        String O;
        androidx.compose.runtime.a M = aVar.M(-422770042);
        int c2 = M.c();
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-422770042, i2, -1, "com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkBottomSheet.UserStack (CommunityInviteLinkBottomSheet.kt:123)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c3 = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            M.K(-688430137);
            zak0 zak0Var = (zak0) this.h1;
            c6h c6hVar = (c6h) zak0Var.getValue();
            if (c6hVar == null) {
                M.C(c2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new yd4(this, i, 2);
                    fVar.d = wzsVar;
                }
                return;
            }
            final int i3 = c6hVar.b;
            c6h c6hVar2 = (c6h) zak0Var.getValue();
            final List<d6h> list2 = c6hVar2 != null ? c6hVar2.j : null;
            if (i3 <= 0 || (list = list2) == null || list.isEmpty()) {
                M.K(-693604782);
            } else {
                M.K(-688252353);
                if (list2.size() > 3) {
                    list2 = list2.subList(0, 3);
                }
                final int size = i3 - list2.size();
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    List<d6h> list3 = list2;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(androidx.compose.runtime.k.b((d6h) it.next()));
                    }
                    M.R(arrayList);
                    x = arrayList;
                }
                final List list4 = (List) x;
                UserStackSize userStackSize = UserStackSize.Large;
                xcc.a.e eVar = xcc.a.e.a;
                boolean y = M.y(list4) | M.o(i3) | M.y(list2) | M.o(size);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new izs() { // from class: xsna.x5h
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            rzq0 rzq0Var = (rzq0) obj;
                            int i4 = z5h.j1;
                            rzq0Var.b(list4, z5h.b.b);
                            if (i3 > list2.size()) {
                                rzq0Var.a(new z5h.c(size));
                            }
                            return s3q0.a;
                        }
                    };
                    M.R(x2);
                }
                hyv0.c(null, userStackSize, eVar, (izs) x2, M, 48, 1);
                q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                List<d6h> list5 = list2;
                ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                Iterator<T> it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((d6h) it2.next()).b);
                }
                int i4 = ((i2 << 6) & 896) | 512;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1669482949, i4, -1, "com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkBottomSheet.formatJoined (CommunityInviteLinkBottomSheet.kt:187)");
                }
                if (arrayList2.isEmpty()) {
                    M.K(154899907);
                    M.j();
                    O = "";
                } else {
                    if (arrayList2.size() == 1) {
                        M.K(1944660558);
                        F = d370.O(R.string.group_joined_one, new Object[]{arrayList2.get(0)}, M);
                        M.j();
                    } else if (arrayList2.size() == 2) {
                        M.K(1944663224);
                        O = d370.O(R.string.group_joined_two, new Object[]{arrayList2.get(0), arrayList2.get(1)}, M);
                        M.j();
                    } else if (arrayList2.size() == 3 && size == 0) {
                        M.K(1944667058);
                        O = d370.O(R.string.group_joined_three, new Object[]{arrayList2.get(0), arrayList2.get(1), arrayList2.get(2)}, M);
                        M.j();
                    } else {
                        M.K(155312891);
                        F = d370.F(R.plurals.group_joined_three_more, size, new Object[]{arrayList2.get(0), arrayList2.get(1), arrayList2.get(2), String.valueOf(size)}, M, 0);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().r;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(F, H, j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.i0, M, 48, 0, 8120);
                    M = M;
                }
                F = O;
                if (androidx.compose.runtime.b.d()) {
                }
                if (androidx.compose.runtime.b.d()) {
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                }
                long j2 = ylu0Var2.getText().r;
                if (androidx.compose.runtime.b.d()) {
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                }
                yqv0.c(F, H, j2, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var2.i0, M, 48, 0, 8120);
                M = M;
            }
            M.j();
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        fVar = M.s();
        if (fVar != null) {
            wzsVar = new p00(this, i, 4);
            fVar.d = wzsVar;
        }
    }
}
