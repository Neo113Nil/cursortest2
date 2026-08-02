package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.donut.DonutUserStackClipPosition;
import com.vk.community.design.compose.donut.DonutUserStackSize;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.generated.VkColorToken;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.i4o;
import xsna.kpv;
import xsna.ozq0;
import xsna.q630;
import xsna.r4o;
import xsna.xcc;

/* compiled from: DonutUserStack.kt */
/* loaded from: classes17.dex */
public final class r4o {

    /* compiled from: DonutUserStack.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutUserStackClipPosition.values().length];
            try {
                iArr[DonutUserStackClipPosition.End.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutUserStackClipPosition.Start.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final float f, final float f2, final r5j0 r5j0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-432919057);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.n(f2) ? 32 : 16) | (M.J(r5j0Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-432919057, i2, -1, "com.vk.community.design.compose.donut.DonutBorder (DonutUserStack.kt:229)");
            }
            ja8.a(r18.a(f2, VkColorToken.AccentOrange.a(6, M), txj0.q(q630.a.a, f), r5j0Var), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, f2, r5j0Var, i) { // from class: xsna.p4o
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ r5j0 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    r4o.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void b(q630 q630Var, DonutUserStackSize donutUserStackSize, DonutUserStackClipPosition donutUserStackClipPosition, iy5 iy5Var, final izs<? super s4o, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        int i4;
        int i5;
        final DonutUserStackSize donutUserStackSize2;
        final iy5 iy5Var2;
        final q630 q630Var3;
        final DonutUserStackClipPosition donutUserStackClipPosition2;
        q630 q630Var4;
        DonutUserStackSize donutUserStackSize3;
        int i6;
        iy5 a2;
        int i7;
        DonutUserStackClipPosition donutUserStackClipPosition3;
        uh50 C;
        double d;
        float f;
        float f2;
        frv0 frv0Var;
        int i8;
        float f3;
        long b;
        androidx.compose.runtime.a M = aVar.M(2125599144);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i | (M.J(q630Var2) ? 4 : 2);
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (M.o(donutUserStackSize == null ? -1 : donutUserStackSize.ordinal()) ? 32 : 16);
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i5 = i4 | 384;
        } else {
            i5 = i4 | (M.o(donutUserStackClipPosition == null ? -1 : donutUserStackClipPosition.ordinal()) ? 256 : 128);
        }
        int i12 = i5 | 1024 | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i12 & 1, (i12 & 9363) != 9362)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var4 = i9 != 0 ? q630.a.a : q630Var2;
                donutUserStackSize3 = i10 != 0 ? DonutUserStackSize.Medium : donutUserStackSize;
                DonutUserStackClipPosition donutUserStackClipPosition4 = i11 != 0 ? DonutUserStackClipPosition.Start : donutUserStackClipPosition;
                qzu0.a.getClass();
                i6 = -1;
                a2 = kpv.a.a(qzu0.I(M), l5g.k, i4o.d, BadgeAlignment.BottomRight, false, null, null, M, 100688312, 232);
                i7 = i12 & (-7169);
                donutUserStackClipPosition3 = donutUserStackClipPosition4;
            } else {
                M.h();
                a2 = iy5Var;
                i7 = i12 & (-7169);
                q630Var4 = q630Var2;
                i6 = -1;
                donutUserStackSize3 = donutUserStackSize;
                donutUserStackClipPosition3 = donutUserStackClipPosition;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2125599144, i7, i6, "com.vk.community.design.compose.donut.DonutUserStack (DonutUserStack.kt:68)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new t4o();
                M.R(x);
            }
            t4o t4oVar = (t4o) x;
            t4oVar.a.clear();
            izsVar.invoke(t4oVar);
            ArrayList arrayList = t4oVar.a;
            SnapshotStateList<ozq0> snapshotStateList = t4oVar.b;
            dak0 j = qak0.j();
            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
            if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dak0 j2 = C.j();
                try {
                    snapshotStateList.clear();
                    snapshotStateList.addAll(arrayList);
                    arrayList.clear();
                    s3q0 s3q0Var = s3q0.a;
                    C.w().a();
                    C.c();
                    q630 E = ahn.E(q630Var4, "donut_user_stack");
                    int i13 = i7 & 896;
                    boolean J = ((i7 & 112) == 32) | (i13 == 256) | M.J(a2);
                    Object x2 = M.x();
                    int i14 = 3;
                    if (J || x2 == c0012a) {
                        x2 = new q66(donutUserStackSize3, donutUserStackClipPosition3, a2, i14);
                        M.R(x2);
                    }
                    q630 b2 = egi0.b(E, false, (izs) x2);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, b2);
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
                    k9q0.w(M, d2, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    float f4 = i4o.a;
                    int i15 = ((i7 >> 3) & 14) | 48;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(104617579, i15, i6, "com.vk.community.design.compose.donut.DonutUserStackDefaults.border (DonutUserStackDefaults.kt:41)");
                    }
                    int[] iArr = i4o.a.$EnumSwitchMapping$0;
                    int i16 = iArr[donutUserStackSize3.ordinal()];
                    if (i16 == 1) {
                        d = 1.8d;
                    } else {
                        if (i16 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d = 2.2d;
                    }
                    float f5 = (float) d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-287301038, i15, i6, "com.vk.community.design.compose.donut.DonutUserStackDefaults.offset (DonutUserStackDefaults.kt:34)");
                    }
                    int i17 = iArr[donutUserStackSize3.ordinal()];
                    if (i17 == 1) {
                        f = 2;
                    } else {
                        if (i17 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = 3;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1585647680, i15, i6, "com.vk.community.design.compose.donut.DonutUserStackDefaults.size (DonutUserStackDefaults.kt:27)");
                    }
                    int i18 = iArr[donutUserStackSize3.ordinal()];
                    if (i18 == 1) {
                        f2 = i4o.a;
                    } else {
                        if (i18 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f2 = i4o.b;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-867029548, i15, i6, "com.vk.community.design.compose.donut.DonutUserStackDefaults.counterTextStyle (DonutUserStackDefaults.kt:65)");
                    }
                    int i19 = iArr[donutUserStackSize3.ordinal()];
                    if (i19 == 1) {
                        M.K(8265152);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var.H0;
                        M.j();
                    } else {
                        if (i19 != 2) {
                            throw alb0.c(8262940, M);
                        }
                        M.K(8267456);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0Var = wuv0Var2.n0;
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 q630Var5 = q630Var4;
                    long floatToRawIntBits = (Float.floatToRawIntBits(-2) << 32) | (Float.floatToRawIntBits(0) & 4294967295L);
                    int i20 = iArr[donutUserStackSize3.ordinal()];
                    int i21 = 1;
                    if (i20 == 1) {
                        i8 = i13;
                        f3 = 1;
                    } else {
                        if (i20 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i8 = i13;
                        f3 = (float) 1.5d;
                        i21 = 1;
                    }
                    float f6 = f3;
                    int i22 = iArr[donutUserStackSize3.ordinal()];
                    if (i22 == i21) {
                        float f7 = i4o.a;
                        b = byc0.b(f7, 3 + f7);
                    } else {
                        if (i22 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float f8 = i4o.b;
                        b = byc0.b(f8, 3 + f8);
                    }
                    iy5 iy5Var3 = a2;
                    c(t4oVar, frv0Var, donutUserStackClipPosition3, f5, f, f2, floatToRawIntBits, f6, iy5Var3, b, M, i8);
                    M = M;
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    donutUserStackSize2 = donutUserStackSize3;
                    iy5Var2 = iy5Var3;
                    donutUserStackClipPosition2 = donutUserStackClipPosition3;
                    q630Var3 = q630Var5;
                } finally {
                    dak0.q(j2);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C.c();
                    throw th2;
                }
            }
        } else {
            M.h();
            donutUserStackSize2 = donutUserStackSize;
            iy5Var2 = iy5Var;
            q630Var3 = q630Var2;
            donutUserStackClipPosition2 = donutUserStackClipPosition;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(donutUserStackSize2, donutUserStackClipPosition2, iy5Var2, izsVar, i, i2) { // from class: xsna.q4o
                public final /* synthetic */ DonutUserStackSize c;
                public final /* synthetic */ DonutUserStackClipPosition d;
                public final /* synthetic */ iy5 e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ int g;

                {
                    this.g = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    r4o.b(q630.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I, this.g);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final t4o t4oVar, frv0 frv0Var, final DonutUserStackClipPosition donutUserStackClipPosition, final float f, final float f2, final float f3, final long j, final float f4, final iy5 iy5Var, final long j2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final float f5;
        final frv0 frv0Var2;
        Integer num;
        final frv0 frv0Var3;
        final t4o t4oVar2 = t4oVar;
        frv0 frv0Var4 = frv0Var;
        androidx.compose.runtime.a M = aVar.M(1401296721);
        if ((i & 6) == 0) {
            i2 = (M.J(t4oVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(frv0Var4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(donutUserStackClipPosition == null ? -1 : donutUserStackClipPosition.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f5 = f;
            i2 |= M.n(f5) ? 2048 : 1024;
        } else {
            f5 = f;
        }
        if ((i & 24576) == 0) {
            i2 |= M.n(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.n(f3) ? 131072 : 65536;
        }
        final long j3 = j;
        if ((1572864 & i) == 0) {
            i2 |= M.p(j3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        final float f6 = f4;
        if ((12582912 & i) == 0) {
            i2 |= M.n(f6) ? 8388608 : 4194304;
        }
        final iy5 iy5Var2 = iy5Var;
        if ((100663296 & i) == 0) {
            i2 |= M.J(iy5Var2) ? 67108864 : 33554432;
        }
        Integer num2 = 6;
        if ((805306368 & i) == 0) {
            i2 |= M.p(j2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 306783379) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1401296721, i2, -1, "com.vk.community.design.compose.donut.InternalContent (DonutUserStack.kt:114)");
            }
            ListIterator<ozq0> listIterator = t4oVar2.b.listIterator();
            while (true) {
                final int i4 = i3;
                duk0 duk0Var = (duk0) listIterator;
                if (duk0Var.hasNext()) {
                    Object next = duk0Var.next();
                    i3 = i4 + 1;
                    if (i4 < 0) {
                        e43.t();
                        throw null;
                    }
                    ozq0 ozq0Var = (ozq0) next;
                    if (ozq0Var instanceof ozq0.a) {
                        M.K(-1754222315);
                        num = num2;
                        ((ozq0.a) ozq0Var).a.invoke(kai.c(2061951830, new zzs() { // from class: xsna.j4o
                            @Override // xsna.zzs
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int i5;
                                xcc.a aVar2;
                                lg90 lg90Var;
                                float f7;
                                q630.a aVar3;
                                float f8;
                                lg90 lg90Var2 = (lg90) obj;
                                final boolean booleanValue = ((Boolean) obj2).booleanValue();
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if ((intValue & 6) == 0) {
                                    i5 = ((intValue & 8) == 0 ? aVar4.J(lg90Var2) : aVar4.y(lg90Var2) ? 4 : 2) | intValue;
                                } else {
                                    i5 = intValue;
                                }
                                if ((intValue & 48) == 0) {
                                    i5 |= aVar4.l(booleanValue) ? 32 : 16;
                                }
                                int i6 = i5;
                                if (aVar4.t(i6 & 1, (i6 & 147) != 146)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(2061951830, i6, -1, "com.vk.community.design.compose.donut.InternalContent.<anonymous>.<anonymous> (DonutUserStack.kt:119)");
                                    }
                                    float f9 = byv0.a;
                                    int i7 = r4o.a.$EnumSwitchMapping$0[DonutUserStackClipPosition.this.ordinal()];
                                    if (i7 == 1) {
                                        aVar2 = xcc.a.e.a;
                                    } else {
                                        if (i7 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar2 = xcc.a.g.a;
                                    }
                                    xcc.a aVar5 = aVar2;
                                    t4o t4oVar3 = t4oVar2;
                                    int h = e43.h(t4oVar3.b);
                                    final int i8 = i4;
                                    float f10 = f5;
                                    float f11 = f2;
                                    float f12 = f3;
                                    r5j0 e = byv0.e(i8, h, f10, f11, f12, aVar5, aVar4, 0);
                                    r5j0 e2 = byv0.e(0, e43.h(t4oVar3.b), f10, f11, f12, xcc.a.g.a, aVar4, 6);
                                    q630 d = rte0.d(r4o.e(f12, f11, i8), e);
                                    boolean o = aVar4.o(i8) | ((i6 & 112) == 32);
                                    Object x = aVar4.x();
                                    a.C0011a.C0012a c0012a = a.C0011a.a;
                                    if (o || x == c0012a) {
                                        x = new izs() { // from class: xsna.m4o
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj5) {
                                                c4o c4oVar = new c4o(i8, booleanValue);
                                                sgi0<c4o> sgi0Var = v4o.c;
                                                qcy<Object> qcyVar = v4o.a[1];
                                                sgi0Var.getClass();
                                                ((tgi0) obj5).a(sgi0Var, c4oVar);
                                                return s3q0.a;
                                            }
                                        };
                                        aVar4.R(x);
                                    }
                                    q630 b = egi0.b(d, false, (izs) x);
                                    dt1.a.getClass();
                                    cp10 d2 = ja8.d(dt1.a.f, false);
                                    int hashCode = Long.hashCode(n34.n(aVar4));
                                    sy90 D = aVar4.D();
                                    q630 c = qri.c(aVar4, b);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar6 = cri.a.b;
                                    if (aVar4.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar4.H();
                                    if (aVar4.L()) {
                                        aVar4.I(aVar6);
                                    } else {
                                        aVar4.f();
                                    }
                                    cri.a.c cVar = cri.a.f;
                                    k9q0.w(aVar4, d2, cVar);
                                    cri.a.e eVar = cri.a.e;
                                    k9q0.w(aVar4, D, eVar);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    cri.a.b bVar = cri.a.g;
                                    k9q0.w(aVar4, valueOf, bVar);
                                    cri.a.C2678a c2678a = cri.a.h;
                                    k9q0.t(aVar4, c2678a);
                                    cri.a.d dVar = cri.a.d;
                                    k9q0.w(aVar4, c, dVar);
                                    float f13 = f6;
                                    float f14 = booleanValue ? f12 - (2 * f13) : f12;
                                    q630.a aVar7 = q630.a.a;
                                    q630 d3 = rte0.d(txj0.q(aVar7, f14), e2);
                                    if (androidx.compose.runtime.b.d()) {
                                        lg90Var = lg90Var2;
                                        f7 = f12;
                                        aVar3 = aVar7;
                                        f8 = f13;
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    } else {
                                        lg90Var = lg90Var2;
                                        f7 = f12;
                                        aVar3 = aVar7;
                                        f8 = f13;
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j4 = ylu0Var.getImage().a;
                                    if (!booleanValue) {
                                        d3 = r18.a(0.5f, j4, d3, e2);
                                    }
                                    int i9 = (i6 & 14) | 56;
                                    q630.a aVar8 = aVar3;
                                    float f15 = f7;
                                    float f16 = f8;
                                    vjw.a(lg90Var, null, d3, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, i9, 120);
                                    if (booleanValue) {
                                        aVar4.K(937724569);
                                        r4o.a(f15, f16, e2, aVar4, 0);
                                    } else {
                                        aVar4.K(931107526);
                                    }
                                    aVar4.j();
                                    aVar4.G();
                                    if (booleanValue) {
                                        aVar4.K(986786316);
                                        q630 e3 = r4o.e(f15, f11, i8);
                                        long j5 = j2;
                                        q630 n = txj0.n(e3, uco.c(j5), uco.b(j5));
                                        cp10 d4 = ja8.d(dt1.a.j, false);
                                        int hashCode2 = Long.hashCode(n34.n(aVar4));
                                        sy90 D2 = aVar4.D();
                                        q630 c2 = qri.c(aVar4, n);
                                        if (aVar4.N() == null) {
                                            n34.r();
                                            throw null;
                                        }
                                        aVar4.H();
                                        if (aVar4.L()) {
                                            aVar4.I(aVar6);
                                        } else {
                                            aVar4.f();
                                        }
                                        k9q0.w(aVar4, d4, cVar);
                                        k9q0.w(aVar4, D2, eVar);
                                        ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                                        k9q0.w(aVar4, c2, dVar);
                                        long j6 = i4o.d;
                                        iy5 iy5Var3 = iy5Var2;
                                        q630 r = txj0.r(iy5Var3.d(j6), aVar8);
                                        final long j7 = j3;
                                        boolean p = aVar4.p(j7);
                                        Object x2 = aVar4.x();
                                        if (p || x2 == c0012a) {
                                            x2 = new izs() { // from class: xsna.n4o
                                                @Override // xsna.izs
                                                public final Object invoke(Object obj5) {
                                                    tdu tduVar = (tdu) obj5;
                                                    long j8 = j7;
                                                    tduVar.o(tduVar.I0(rco.a(j8)));
                                                    tduVar.n(tduVar.I0(rco.b(j8)));
                                                    return s3q0.a;
                                                }
                                            };
                                            aVar4.R(x2);
                                        }
                                        iy5Var3.c(rdu.a(r, (izs) x2), aVar4, 0);
                                        aVar4.G();
                                    } else {
                                        aVar4.K(979983180);
                                    }
                                    aVar4.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, M), M, num);
                        M.j();
                        frv0Var3 = frv0Var;
                    } else {
                        num = num2;
                        if (!(ozq0Var instanceof ozq0.b)) {
                            throw alb0.c(1744525593, M);
                        }
                        M.K(-1751326698);
                        frv0Var3 = frv0Var;
                        ((ozq0.b) ozq0Var).a.invoke(kai.c(-25600299, new yzs() { // from class: xsna.k4o
                            @Override // xsna.yzs
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int intValue = ((Integer) obj).intValue();
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar2.o(intValue) ? 4 : 2;
                                }
                                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-25600299, intValue2, -1, "com.vk.community.design.compose.donut.InternalContent.<anonymous>.<anonymous> (DonutUserStack.kt:187)");
                                    }
                                    r4o.d(f3, f2, i4, intValue, frv0Var3, aVar2, (intValue2 << 9) & 7168);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar2.h();
                                }
                                return s3q0.a;
                            }
                        }, M), M, num);
                        M.j();
                    }
                    f5 = f;
                    j3 = j;
                    f6 = f4;
                    iy5Var2 = iy5Var;
                    frv0Var4 = frv0Var3;
                    num2 = num;
                    t4oVar2 = t4oVar;
                } else {
                    frv0Var2 = frv0Var4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
        } else {
            frv0Var2 = frv0Var4;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.l4o
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r4o.c(t4o.this, frv0Var2, donutUserStackClipPosition, f, f2, f3, j, f4, iy5Var, j2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final float f, final float f2, final int i, final int i2, final frv0 frv0Var, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1451801168);
        if ((i3 & 6) == 0) {
            i4 = (M.n(f) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.n(f2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.o(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= M.J(frv0Var) ? 16384 : 8192;
        }
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1451801168, i4, -1, "com.vk.community.design.compose.donut.UserStackCounter (DonutUserStack.kt:201)");
            }
            q630 d = rte0.d(txj0.x(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(e(f, f2, i), f)), i4o.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.g().a, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 F = s200.F(kqu0.q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
            String str = "+" + swe0.g(i2, 1, 99);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, F, ylu0Var2.getText().d, null, null, 0, 3, null, 3, false, 0, 1, null, frv0Var, aVar2, 100663296, ((i4 >> 3) & 7168) | 48, 5816);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.o4o
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    r4o.d(f, f2, i, i2, frv0Var, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final q630 e(float f, float f2, int i) {
        return s200.H(q630.a.a, (f - f2) * i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
    }
}
