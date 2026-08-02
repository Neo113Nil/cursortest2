package xsna;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;
import xsna.ty6;

/* compiled from: PagerIndicator.kt */
/* loaded from: classes16.dex */
public final class hb90 {
    public static final float a = 16;
    public static final float b = 8;
    public static final float c = 10;

    public static final void a(final ib90 ib90Var, final ol0 ol0Var, q630 q630Var, float f, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final float f2;
        Pair pair;
        int i2;
        int i3;
        long j;
        float f3;
        int i4;
        int i5;
        float f4;
        q630.a aVar2;
        boolean z;
        long j2;
        float f5;
        long c2;
        int i6;
        long c3;
        boolean z2 = ib90Var.d;
        androidx.compose.runtime.a M = aVar.M(586618308);
        int i7 = i | (M.J(ib90Var) ? 4 : 2) | (M.J(ol0Var) ? 32 : 16) | 3456 | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i7 & 1, (i7 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(586618308, i7, -1, "com.vk.clips.design.compose.pager.PagerIndicator (PagerIndicator.kt:50)");
            }
            int k = ib90Var.a.k();
            xvy a2 = zvy.a(0, 3, M);
            float f6 = b * 3;
            float f7 = c;
            float f8 = (2 * f7) + f6;
            if (z2) {
                M.K(-275363885);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar = new l5g(ylu0Var.getIcon().c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pair = new Pair(l5gVar, new l5g(l5g.c(14, ylu0Var2.getIcon().c, 0.3f)));
                M.j();
            } else {
                M.K(-275251727);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var2 = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar2 = new l5g(ylu0Var3.getIcon().l);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pair = new Pair(l5gVar2, new l5g(l5g.c(14, ylu0Var4.getIcon().l, 0.3f)));
                M.j();
            }
            long j3 = ((l5g) pair.d()).a;
            long j4 = ((l5g) pair.g()).a;
            Integer valueOf = Integer.valueOf(k);
            int i8 = i7 & 14;
            boolean o = (i8 == 4) | M.o(k) | M.J(a2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = new fb90(k, ib90Var, a2, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            q630.a aVar3 = q630.a.a;
            q630 f9 = txj0.f(txj0.z(aVar3, null, 3), 1.0f);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c4 = qri.c(M, f9);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a3, cVar2);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf2 = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf2, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c4, dVar);
            if (ib90Var.c) {
                M.K(-1317454609);
                boolean z3 = k == 0;
                if (z2) {
                    M.K(-1317404699);
                    if (z3) {
                        M.K(-1289420910);
                        z = z3;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        i2 = k;
                        c2 = l5g.c(14, ylu0Var5.getIcon().c, 0.4f);
                    } else {
                        i2 = k;
                        z = z3;
                        M.K(-1289419085);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c2 = l5g.c(14, ylu0Var6.getIcon().c, 0.12f);
                    }
                    M.j();
                    M.j();
                } else {
                    i2 = k;
                    z = z3;
                    M.K(-1317243034);
                    if (z) {
                        M.K(-1289415758);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var7.getIcon().f;
                        f5 = 0.3f;
                    } else {
                        M.K(-1289413901);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var8 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var8.getIcon().l;
                        f5 = 0.12f;
                    }
                    c2 = l5g.c(14, j2, f5);
                    M.j();
                    M.j();
                }
                i3 = i8;
                f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                q630 c5 = ojc.c(txj0.q(hr80.m(rte0.d(s200.F(f7 / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), vog0.a), c2, androidx.compose.ui.graphics.e.a), a), false, null, null, gzsVar, 15);
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c6 = qri.c(M, c5);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar4);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cVar2);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar2, M, c2678a);
                k9q0.w(M, c6, dVar);
                tlo0.f fVar = ol0Var.b;
                M.K(-1711968483);
                CharSequence a4 = tlo0.b.a(fVar, (Context) M.r(AndroidCompositionLocals_androidKt.b));
                M.j();
                String obj = a4 != null ? a4.toString() : null;
                lg90 lg90Var = ol0Var.a;
                if (z2) {
                    M.K(-1531276694);
                    if (z) {
                        M.K(-1711962165);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var9 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c3 = ylu0Var9.getIcon().c;
                    } else {
                        M.K(-1711960527);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var10 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c3 = l5g.c(14, ylu0Var10.getIcon().c, 0.6f);
                    }
                    M.j();
                    M.j();
                    i6 = 0;
                } else {
                    M.K(-1531118997);
                    if (z) {
                        M.K(-1711957079);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var11 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c3 = ylu0Var11.getIcon().f;
                        M.j();
                        i6 = 0;
                    } else {
                        M.K(-1711955471);
                        if (androidx.compose.runtime.b.d()) {
                            i6 = 0;
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            i6 = 0;
                        }
                        ylu0 ylu0Var12 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c3 = l5g.c(14, ylu0Var12.getIcon().l, 0.6f);
                        M.j();
                    }
                    M.j();
                }
                long j5 = c3;
                i5 = i6;
                j = j3;
                f3 = f8;
                i4 = 1;
                pzu0.b(lg90Var, obj, ra8.a.b(txj0.q(aVar3, 16), dt1.a.f), j5, M, 8, 0);
                M.G();
            } else {
                i2 = k;
                i3 = i8;
                j = j3;
                f3 = f8;
                i4 = 1;
                i5 = 0;
                f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                M.K(-1320388542);
            }
            M.j();
            f9t.e(txj0.x(f7 / 2, f4, 2, aVar3), M, i5);
            q630 g = txj0.x(f4, f3, i4, aVar3).g(new gor0(bVar));
            a.j g2 = androidx.compose.foundation.layout.a.g(f7);
            int i9 = i2;
            int i10 = (M.o(i9) ? 1 : 0) | (i3 == 4 ? i4 : i5) | (M.p(j) ? 1 : 0) | (M.p(j4) ? 1 : 0);
            Object x2 = M.x();
            if (i10 != 0 || x2 == c0012a) {
                aVar2 = aVar3;
                acm acmVar = new acm(ib90Var, i9, j, j4, 1);
                M.R(acmVar);
                x2 = acmVar;
            } else {
                aVar2 = aVar3;
            }
            lqy.b(g, a2, null, g2, null, null, false, null, (izs) x2, M, 12582912, 364);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = f7;
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
            f2 = f;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(ol0Var, q630Var2, f2, gzsVar, i) { // from class: xsna.db90
                public final /* synthetic */ ol0 c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ gzs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    hb90.a(ib90.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(4:(1:(1:10)(2:25|26))(1:27)|11|12|13)(4:28|(9:30|(4:33|(3:35|36|37)(1:39)|38|31)|40|41|(1:43)(1:62)|44|(1:46)(1:61)|47|(4:49|(2:51|52)|53|54)(3:(1:57)|53|54))|16|17)|14|15|16|17))|63|6|(0)(0)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ce, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        if (r10.f(r8 - (r11 - 1), r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(int i, boolean z, xvy xvyVar, int i2, ContinuationImpl continuationImpl) {
        gb90 gb90Var;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        if (continuationImpl instanceof gb90) {
            gb90Var = (gb90) continuationImpl;
            int i7 = gb90Var.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                gb90Var.label = i7 - Integer.MIN_VALUE;
                Object obj = gb90Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = gb90Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    i4 = i - (z ? 1 : 0);
                    if (i4 >= 0) {
                        List<xuy> f = xvyVar.j().f();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : f) {
                            if (((xuy) obj3).getOffset() >= 0) {
                                arrayList.add(obj3);
                            }
                        }
                        xuy xuyVar = (xuy) j5g.a0(arrayList);
                        int index = xuyVar != null ? xuyVar.getIndex() : 0;
                        xuy xuyVar2 = (xuy) j5g.k0(arrayList);
                        int index2 = xuyVar2 != null ? xuyVar2.getIndex() : 0;
                        try {
                            if (i4 < index) {
                                gb90Var.Z$0 = z;
                                gb90Var.I$0 = i2;
                                gb90Var.I$1 = i4;
                                gb90Var.I$2 = index2;
                                gb90Var.label = 1;
                                if (xvyVar.f(i4, gb90Var) == obj2) {
                                    return obj2;
                                }
                                i5 = i4;
                                i4 = index2;
                            } else {
                                if (i4 > index2) {
                                    gb90Var.Z$0 = z;
                                    gb90Var.I$0 = i2;
                                    gb90Var.I$1 = i4;
                                    gb90Var.I$2 = index2;
                                    gb90Var.label = 2;
                                }
                                i5 = i4;
                                i4 = index2;
                            }
                        } catch (IllegalArgumentException e) {
                            e = e;
                            i5 = i4;
                            i4 = index2;
                            StringBuilder sb = new StringBuilder("hasAddPage ");
                            sb.append(z);
                            sb.append("; targetPage ");
                            sb.append(i5);
                            sb.append("; lastVisibleItemIndex ");
                            new Integer(Log.e("PagerIndicator", "Failed to animate scroll", new IllegalArgumentException(e.getMessage() + ". " + bd3.b(" indicationCount ", i4, i2, sb))));
                            return s3q0.a;
                        }
                    }
                    return s3q0.a;
                }
                if (i3 == 1) {
                    i4 = gb90Var.I$2;
                    i6 = gb90Var.I$1;
                    i2 = gb90Var.I$0;
                    z2 = gb90Var.Z$0;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = gb90Var.I$2;
                    i6 = gb90Var.I$1;
                    i2 = gb90Var.I$0;
                    z2 = gb90Var.Z$0;
                }
                try {
                    kotlin.a.a(obj);
                    boolean z3 = z2;
                    i5 = i6;
                    z = z3;
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    boolean z4 = z2;
                    i5 = i6;
                    z = z4;
                    StringBuilder sb2 = new StringBuilder("hasAddPage ");
                    sb2.append(z);
                    sb2.append("; targetPage ");
                    sb2.append(i5);
                    sb2.append("; lastVisibleItemIndex ");
                    new Integer(Log.e("PagerIndicator", "Failed to animate scroll", new IllegalArgumentException(e.getMessage() + ". " + bd3.b(" indicationCount ", i4, i2, sb2))));
                    return s3q0.a;
                }
                s3q0 s3q0Var = s3q0.a;
                return s3q0.a;
            }
        }
        gb90Var = new gb90(continuationImpl);
        Object obj4 = gb90Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = gb90Var.label;
        if (i3 != 0) {
        }
        s3q0 s3q0Var2 = s3q0.a;
        return s3q0.a;
    }
}
