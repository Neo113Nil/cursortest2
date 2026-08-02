package xsna;

import android.os.Trace;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.o6j;
import xsna.q630;
import xsna.us2;
import xsna.v4s;

/* compiled from: BasicText.kt */
/* loaded from: classes11.dex */
public final class bu6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final us2 us2Var, final q630 q630Var, final nmo0 nmo0Var, final izs izsVar, final int i, final boolean z, final int i2, final int i3, final Map map, final o7g o7gVar, androidx.compose.runtime.a aVar, final int i4) {
        o7g o7gVar2;
        androidx.compose.runtime.a aVar2;
        int i5;
        jci0 jci0Var;
        boolean z2;
        boolean z3;
        androidx.compose.runtime.a M = aVar.M(-1343466571);
        int i6 = (i4 & 6) == 0 ? (M.J(us2Var) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i6 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= M.J(nmo0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= M.o(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= M.o(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= M.o(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i6 |= M.y(map) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            o7gVar2 = o7gVar;
            i6 |= M.y(o7gVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            o7gVar2 = o7gVar;
        }
        if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1343466571, i6, 6, "androidx.compose.foundation.text.BasicText (BasicText.kt:200)");
            }
            u1v.a(i3, i2);
            mei0 mei0Var = (mei0) M.r(pei0.a);
            Object obj = a.C0011a.a;
            if (mei0Var != null) {
                M.K(1588268245);
                long j = ((qlo0) M.r(rlo0.a)).b;
                Object[] objArr = {mei0Var};
                i5 = i6;
                fh9 fh9Var = new fh9(new lk1(mei0Var, 1), new a60(6));
                boolean y = M.y(mei0Var);
                Object x = M.x();
                if (y || x == obj) {
                    x = new com.vk.movika.sdk.base.logic.processor.actions.h(mei0Var, 8);
                    M.R(x);
                }
                long longValue = ((Number) crx0.D(objArr, fh9Var, (gzs) x, M, 0)).longValue();
                boolean p = M.p(longValue) | M.J(mei0Var) | M.p(j);
                Object x2 = M.x();
                if (p || x2 == obj) {
                    x2 = new jci0(longValue, mei0Var, j);
                    M.R(x2);
                }
                jci0Var = (jci0) x2;
                M.j();
            } else {
                i5 = i6;
                M.K(1588759409);
                M.j();
                jci0Var = null;
            }
            Pair<List<us2.d<esa0>>, List<us2.d<yzs<String, androidx.compose.runtime.a, Integer, s3q0>>>> pair = bt2.a;
            int length = us2Var.c.length();
            List<us2.d<? extends us2.a>> list = us2Var.b;
            if (list != null) {
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    us2.d<? extends us2.a> dVar = list.get(i7);
                    if ((dVar.a instanceof wpm0) && "androidx.compose.foundation.text.inlineContent".equals(dVar.d)) {
                        z2 = false;
                        if (zs2.c(0, length, dVar.b, dVar.c)) {
                            z3 = true;
                            break;
                        }
                    }
                }
            }
            z2 = false;
            z3 = false;
            boolean g = y000.g(us2Var);
            v4s.a aVar3 = (v4s.a) M.r(uvi.k);
            if (z3 || g) {
                aVar2 = M;
                jci0 jci0Var2 = jci0Var;
                aVar2.K(1590022070);
                boolean z4 = (i5 & 14) == 4 ? true : z2;
                Object x3 = aVar2.x();
                if (z4 || x3 == obj) {
                    x3 = androidx.compose.runtime.k.b(us2Var);
                    aVar2.R(x3);
                }
                wh50 wh50Var = (wh50) x3;
                us2 us2Var2 = (us2) wh50Var.getValue();
                boolean J = aVar2.J(wh50Var);
                Object x4 = aVar2.x();
                if (J || x4 == obj) {
                    x4 = new sf1(wh50Var, 9);
                    aVar2.R(x4);
                }
                int i8 = i5 << 6;
                c(q630Var, us2Var2, izsVar, z3, map, nmo0Var, i, z, i2, i3, aVar3, jci0Var2, o7gVar, (izs) x4, aVar2, ((i5 >> 3) & 910) | ((i5 >> 12) & 57344) | ((i5 << 9) & 458752) | (3670016 & i8) | (29360128 & i8) | (234881024 & i8) | (i8 & 1879048192), ((i5 >> 21) & 896) | 24576);
                aVar2.j();
            } else {
                M.K(1589006262);
                eu6.a(us2Var, nmo0Var, aVar3, null, M, (i5 & 14) | 3072 | ((i5 >> 3) & 112));
                aVar2 = M;
                q630 e = e(q630Var, us2Var, nmo0Var, izsVar, i, z, i2, i3, aVar3, null, null, jci0Var, o7gVar2, null);
                int hashCode = Long.hashCode(n34.n(aVar2));
                q630 c = qri.c(aVar2, e);
                sy90 D = aVar2.D();
                cri.h7.getClass();
                LayoutNode.a aVar4 = cri.a.b;
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar4);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, lgp.a, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                k9q0.t(aVar2, cri.a.h);
                k9q0.w(aVar2, c, cri.a.d);
                k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                aVar2.G();
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zt6
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    bu6.a(us2.this, q630Var, nmo0Var, izsVar, i, z, i2, i3, map, o7gVar, (androidx.compose.runtime.a) obj2, ne7.I(i4 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final q630 q630Var, final nmo0 nmo0Var, izs izsVar, int i, boolean z, final int i2, int i3, o7g o7gVar, androidx.compose.runtime.a aVar, final int i4, final int i5) {
        int i6;
        izs izsVar2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        final o7g o7gVar2;
        final izs izsVar3;
        androidx.compose.runtime.a aVar2;
        final int i13;
        final boolean z3;
        final int i14;
        androidx.compose.runtime.f s;
        int i15;
        int i16;
        jci0 jci0Var;
        int i17;
        boolean z4;
        izs izsVar4;
        androidx.compose.runtime.a aVar3;
        int i18;
        Throwable th;
        q630 e;
        androidx.compose.runtime.a M = aVar.M(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (M.J(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= M.J(nmo0Var) ? 256 : 128;
        }
        int i19 = i5 & 8;
        if (i19 != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            izsVar2 = izsVar;
            i6 |= M.y(izsVar2) ? 2048 : 1024;
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i8 = i;
                i6 |= M.o(i8) ? 16384 : 8192;
                i9 = i5 & 32;
                if (i9 != 0) {
                    i6 |= 196608;
                } else if ((196608 & i4) == 0) {
                    z2 = z;
                    i6 |= M.l(z2) ? 131072 : 65536;
                    if ((1572864 & i4) == 0) {
                        i6 |= M.o(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i10 = i5 & 128;
                    if (i10 == 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        i6 |= M.o(i3) ? 8388608 : 4194304;
                    }
                    i11 = i5 & 256;
                    if (i11 == 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i12 = i11;
                        i6 |= M.y(o7gVar) ? 67108864 : 33554432;
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            i6 |= (1073741824 & i4) == 0 ? M.J(null) : M.y(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        }
                        int i20 = 1;
                        if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
                            izs izsVar5 = i19 != 0 ? null : izsVar2;
                            if (i7 != 0) {
                                i8 = 1;
                            }
                            if (i9 != 0) {
                                z2 = true;
                            }
                            int i21 = i10 != 0 ? 1 : i3;
                            int i22 = i8;
                            o7g o7gVar3 = i12 != 0 ? null : o7gVar;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1040751001, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:102)");
                            }
                            u1v.a(i21, i2);
                            mei0 mei0Var = (mei0) M.r(pei0.a);
                            if (mei0Var != null) {
                                M.K(356423075);
                                long j = ((qlo0) M.r(rlo0.a)).b;
                                i15 = i6;
                                Object[] objArr = {mei0Var};
                                fh9 fh9Var = new fh9(new lk1(mei0Var, i20), new a60(6));
                                boolean y = M.y(mei0Var);
                                Object x = M.x();
                                a.C0011a.C0012a c0012a = a.C0011a.a;
                                if (y || x == c0012a) {
                                    i16 = i21;
                                    x = new ra0(mei0Var, 12);
                                    M.R(x);
                                } else {
                                    i16 = i21;
                                }
                                long longValue = ((Number) crx0.D(objArr, fh9Var, (gzs) x, M, 0)).longValue();
                                boolean p = M.p(longValue) | M.J(mei0Var) | M.p(j);
                                Object x2 = M.x();
                                if (p || x2 == c0012a) {
                                    x2 = new jci0(longValue, mei0Var, j);
                                    M.R(x2);
                                }
                                jci0Var = (jci0) x2;
                                M.j();
                            } else {
                                i15 = i6;
                                i16 = i21;
                                M.K(356914239);
                                M.j();
                                jci0Var = null;
                            }
                            final v4s.a aVar4 = (v4s.a) M.r(uvi.k);
                            int i23 = (i15 & 14) | ((i15 >> 3) & 112);
                            iyk0 iyk0Var = eu6.a;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1589371739, i23, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
                            }
                            Executor executor = (Executor) M.r(eu6.a);
                            if (executor == null || !eu6.b(str.length())) {
                                M.K(1255914055);
                                M.j();
                            } else {
                                M.K(1254298614);
                                final LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
                                final azl azlVar = (azl) M.r(uvi.h);
                                try {
                                    executor.execute(new Runnable() { // from class: xsna.cu6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            uh50 C;
                                            nmo0 nmo0Var2 = nmo0.this;
                                            LayoutDirection layoutDirection2 = layoutDirection;
                                            String str2 = str;
                                            azl azlVar2 = azlVar;
                                            v4s.a aVar5 = aVar4;
                                            Trace.beginSection("BackgroundTextMeasurement");
                                            try {
                                                dak0 j2 = qak0.j();
                                                uh50 uh50Var = j2 instanceof uh50 ? (uh50) j2 : null;
                                                if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                                                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                                }
                                                try {
                                                    dak0 j3 = C.j();
                                                    try {
                                                        nmo0 a = tmo0.a(nmo0Var2, layoutDirection2);
                                                        EmptyList emptyList = EmptyList.b;
                                                        bb2 bb2Var = new bb2(str2, a, emptyList, emptyList, aVar5, azlVar2);
                                                        bb2Var.a();
                                                        bb2Var.c();
                                                        s3q0 s3q0Var = s3q0.a;
                                                        C.w().a();
                                                    } finally {
                                                        dak0.q(j3);
                                                    }
                                                } finally {
                                                }
                                            } finally {
                                                Trace.endSection();
                                            }
                                        }
                                    });
                                } catch (RejectedExecutionException unused) {
                                }
                                M.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (jci0Var == null && izsVar5 == null) {
                                M.K(357875859);
                                M.j();
                                i17 = i22;
                                z4 = z2;
                                i18 = i16;
                                e = q630Var.g(new lmo0(str, nmo0Var, aVar4, i17, z4, i2, i18, o7gVar3));
                                aVar3 = M;
                                izsVar4 = izsVar5;
                                th = null;
                            } else {
                                i17 = i22;
                                z4 = z2;
                                M.K(357232113);
                                izsVar4 = izsVar5;
                                aVar3 = M;
                                jci0 jci0Var2 = jci0Var;
                                o7g o7gVar4 = o7gVar3;
                                i18 = i16;
                                th = null;
                                e = e(q630Var, new us2(str), nmo0Var, izsVar4, i17, z4, i2, i18, (v4s.a) M.r(uvi.k), null, null, jci0Var2, o7gVar4, null);
                                o7gVar3 = o7gVar4;
                                aVar3.j();
                            }
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            androidx.compose.runtime.a aVar5 = aVar3;
                            q630 c = qri.c(aVar5, e);
                            sy90 D = aVar5.D();
                            cri.h7.getClass();
                            LayoutNode.a aVar6 = cri.a.b;
                            if (aVar5.N() == null) {
                                n34.r();
                                throw th;
                            }
                            aVar5.H();
                            if (aVar5.L()) {
                                aVar5.I(aVar6);
                            } else {
                                aVar5.f();
                            }
                            k9q0.w(aVar5, lgp.a, cri.a.f);
                            k9q0.w(aVar5, D, cri.a.e);
                            k9q0.t(aVar5, cri.a.h);
                            k9q0.w(aVar5, c, cri.a.d);
                            k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                            aVar5.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            int i24 = i17;
                            izsVar3 = izsVar4;
                            aVar2 = aVar5;
                            z3 = z4;
                            i13 = i24;
                            o7gVar2 = o7gVar3;
                            i14 = i18;
                        } else {
                            M.h();
                            o7gVar2 = o7gVar;
                            izsVar3 = izsVar2;
                            aVar2 = M;
                            i13 = i8;
                            z3 = z2;
                            i14 = i3;
                        }
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.yt6
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    bu6.b(str, q630Var, nmo0Var, izsVar3, i13, z3, i2, i14, o7gVar2, (androidx.compose.runtime.a) obj, ne7.I(i4 | 1), i5);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i12 = i11;
                    if ((i5 & 512) != 0) {
                    }
                    int i202 = 1;
                    if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                z2 = z;
                if ((1572864 & i4) == 0) {
                }
                i10 = i5 & 128;
                if (i10 == 0) {
                }
                i11 = i5 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i5 & 512) != 0) {
                }
                int i2022 = 1;
                if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            i8 = i;
            i9 = i5 & 32;
            if (i9 != 0) {
            }
            z2 = z;
            if ((1572864 & i4) == 0) {
            }
            i10 = i5 & 128;
            if (i10 == 0) {
            }
            i11 = i5 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i5 & 512) != 0) {
            }
            int i20222 = 1;
            if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        izsVar2 = izsVar;
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i5 & 32;
        if (i9 != 0) {
        }
        z2 = z;
        if ((1572864 & i4) == 0) {
        }
        i10 = i5 & 128;
        if (i10 == 0) {
        }
        i11 = i5 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i5 & 512) != 0) {
        }
        int i202222 = 1;
        if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void c(final q630 q630Var, final us2 us2Var, final izs izsVar, final boolean z, final Map map, final nmo0 nmo0Var, final int i, final boolean z2, final int i2, final int i3, final v4s.a aVar, final jci0 jci0Var, final o7g o7gVar, final izs izsVar2, androidx.compose.runtime.a aVar2, final int i4, final int i5) {
        int i6;
        int i7;
        rjo0 rjo0Var;
        gzs gzsVar;
        int i8;
        int i9;
        gzs gzsVar2;
        Pair<List<us2.d<esa0>>, List<us2.d<yzs<String, androidx.compose.runtime.a, Integer, s3q0>>>> pair;
        Object obj;
        wh50 wh50Var;
        izs izsVar3;
        Object vjo0Var;
        gzs gzsVar3;
        Map map2 = map;
        androidx.compose.runtime.a M = aVar2.M(-2118572703);
        if ((i4 & 6) == 0) {
            i6 = (M.J(q630Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= M.J(us2Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= M.l(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= M.y(map2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= M.J(nmo0Var) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= M.o(i) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= M.l(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= M.o(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= M.o(i3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (M.y(aVar) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= M.y(jci0Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= M.y(o7gVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= M.y(izsVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= (32768 & i5) == 0 ? M.J(null) : M.y(null) ? 16384 : 8192;
        }
        int i10 = i7;
        if (M.t(i6 & 1, ((i6 & 306783379) == 306783378 && (i10 & 9363) == 9362) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2118572703, i6, i10, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:646)");
            }
            boolean g = y000.g(us2Var);
            Object obj2 = a.C0011a.a;
            if (g) {
                M.K(145641571);
                boolean z3 = (i6 & 112) == 32;
                Object x = M.x();
                if (z3 || x == obj2) {
                    x = new rjo0(us2Var);
                    M.R(x);
                }
                M.j();
                rjo0Var = (rjo0) x;
            } else {
                M.K(145707228);
                M.j();
                rjo0Var = null;
            }
            if (y000.g(us2Var)) {
                M.K(145905443);
                boolean J = ((i6 & 112) == 32) | M.J(rjo0Var);
                Object x2 = M.x();
                if (J || x2 == obj2) {
                    x2 = new lb6(1, rjo0Var, us2Var);
                    M.R(x2);
                }
                gzsVar = (gzs) x2;
                M.j();
            } else {
                M.K(146002721);
                boolean z4 = (i6 & 112) == 32;
                Object x3 = M.x();
                if (z4 || x3 == obj2) {
                    x3 = new com.vk.movika.sdk.base.model.b(us2Var, 9);
                    M.R(x3);
                }
                gzsVar = (gzs) x3;
                M.j();
            }
            if (z) {
                if (map2 != null) {
                    Pair<List<us2.d<esa0>>, List<us2.d<yzs<String, androidx.compose.runtime.a, Integer, s3q0>>>> pair2 = bt2.a;
                    if (!map2.isEmpty()) {
                        i8 = i10;
                        i9 = i6;
                        List c = us2Var.c(0, us2Var.c.length(), "androidx.compose.foundation.text.inlineContent");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = c.size();
                        int i11 = 0;
                        while (i11 < size) {
                            int i12 = size;
                            us2.d dVar = (us2.d) c.get(i11);
                            List list = c;
                            Object obj3 = dVar.a;
                            int i13 = i11;
                            int i14 = dVar.c;
                            int i15 = dVar.b;
                            r0x r0xVar = (r0x) map2.get(obj3);
                            if (r0xVar != null) {
                                gzsVar3 = gzsVar;
                                arrayList.add(new us2.d(r0xVar.a, i15, i14));
                                arrayList2.add(new us2.d(r0xVar.b, i15, i14));
                            } else {
                                gzsVar3 = gzsVar;
                            }
                            i11 = i13 + 1;
                            map2 = map;
                            c = list;
                            size = i12;
                            gzsVar = gzsVar3;
                        }
                        gzsVar2 = gzsVar;
                        pair = new Pair<>(arrayList, arrayList2);
                        obj = null;
                    }
                }
                i8 = i10;
                i9 = i6;
                gzsVar2 = gzsVar;
                pair = bt2.a;
                obj = null;
            } else {
                i8 = i10;
                i9 = i6;
                gzsVar2 = gzsVar;
                obj = null;
                pair = new Pair<>(null, null);
            }
            List<us2.d<esa0>> d = pair.d();
            List<us2.d<yzs<String, androidx.compose.runtime.a, Integer, s3q0>>> g2 = pair.g();
            if (z) {
                M.K(146318828);
                Object x4 = M.x();
                if (x4 == obj2) {
                    x4 = androidx.compose.runtime.k.b(obj);
                    M.R(x4);
                }
                M.j();
                wh50Var = (wh50) x4;
            } else {
                M.K(146406588);
                M.j();
                wh50Var = null;
            }
            if (z) {
                M.K(146499837);
                boolean J2 = M.J(wh50Var);
                Object x5 = M.x();
                if (J2 || x5 == obj2) {
                    x5 = new au6(0, wh50Var);
                    M.R(x5);
                }
                M.j();
                izsVar3 = (izs) x5;
            } else {
                M.K(146571260);
                M.j();
                izsVar3 = null;
            }
            int i16 = (i9 >> 3) & 14;
            int i17 = i9;
            eu6.a(us2Var, nmo0Var, aVar, d, M, ((i9 >> 12) & 112) | i16 | ((i8 << 6) & 896));
            us2 us2Var2 = (us2) gzsVar2.invoke();
            boolean y = M.y(rjo0Var) | ((i17 & 896) == 256);
            Object x6 = M.x();
            if (y || x6 == obj2) {
                x6 = new ng3(2, rjo0Var, izsVar);
                M.R(x6);
            }
            q630 e = e(q630Var, us2Var2, nmo0Var, (izs) x6, i, z2, i2, i3, aVar, d, izsVar3, jci0Var, o7gVar, izsVar2);
            if (z) {
                M.K(147927697);
                boolean y2 = M.y(rjo0Var);
                Object x7 = M.x();
                if (y2 || x7 == obj2) {
                    x7 = new ra(rjo0Var, 11);
                    M.R(x7);
                }
                gzs gzsVar4 = (gzs) x7;
                boolean J3 = M.J(wh50Var);
                Object x8 = M.x();
                if (J3 || x8 == obj2) {
                    x8 = new h3(1, wh50Var);
                    M.R(x8);
                }
                vjo0Var = new vjo0(gzsVar4, (gzs) x8);
                M.j();
            } else {
                M.K(147750935);
                boolean y3 = M.y(rjo0Var);
                Object x9 = M.x();
                if (y3 || x9 == obj2) {
                    x9 = new im0(rjo0Var, 9);
                    M.R(x9);
                }
                vjo0Var = new xdz((gzs) x9);
                M.j();
            }
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, e);
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
            k9q0.w(M, vjo0Var, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (rjo0Var == null) {
                M.K(-433557001);
                M.j();
            } else {
                M.K(-291080374);
                rjo0Var.a(0, M);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            if (g2 == null) {
                M.K(-433506223);
            } else {
                M.K(-433506222);
                bt2.a(us2Var, g2, M, i16);
                s3q0 s3q0Var2 = s3q0.a;
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xt6
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ne7.I(i4 | 1);
                    int I2 = ne7.I(i5);
                    bu6.c(q630.this, us2Var, izsVar, z, map, nmo0Var, i, z2, i2, i3, aVar, jci0Var, o7gVar, izsVar2, (androidx.compose.runtime.a) obj4, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final ArrayList d(List list, gzs gzsVar) {
        rko0 rko0Var;
        if (!((Boolean) gzsVar.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zo10 zo10Var = (zo10) list.get(i);
            sff sffVar = ((sko0) zo10Var.c()).a;
            rjo0 rjo0Var = (rjo0) sffVar.b;
            us2.d dVar = (us2.d) sffVar.c;
            ljo0 ljo0Var = (ljo0) ((zak0) rjo0Var.a).getValue();
            if (ljo0Var == null) {
                rko0Var = new rko0(0, 0, new ap80(11));
            } else {
                us2.d c = rjo0.c(dVar, ljo0Var);
                if (c == null) {
                    rko0Var = new rko0(0, 0, new dgc0(11));
                } else {
                    l9x I = d370.I(ljo0Var.k(c.b, c.c).getBounds());
                    rko0Var = new rko0(I.d(), I.b(), new stg0(I, 11));
                }
            }
            int i2 = rko0Var.a;
            int i3 = rko0Var.b;
            arrayList.add(new Pair(zo10Var.N(o6j.a.b(i2, i2, i3, i3)), rko0Var.c));
        }
        return arrayList;
    }

    public static final q630 e(q630 q630Var, us2 us2Var, nmo0 nmo0Var, izs izsVar, int i, boolean z, int i2, int i3, v4s.a aVar, List list, izs izsVar2, jci0 jci0Var, o7g o7gVar, izs izsVar3) {
        if (jci0Var == null) {
            return q630Var.g(q630.a.a).g(new rbo0(us2Var, nmo0Var, aVar, izsVar, i, z, i2, i3, list, izsVar2, o7gVar, izsVar3));
        }
        return q630Var.g(jci0Var.g).g(new rai0(us2Var, nmo0Var, aVar, izsVar, i, z, i2, i3, list, izsVar2, jci0Var, o7gVar));
    }
}
