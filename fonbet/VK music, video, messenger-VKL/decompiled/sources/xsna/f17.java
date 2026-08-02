package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tra0;

/* compiled from: BigPlayerScaffold.kt */
/* loaded from: classes3.dex */
public final class f17 {
    public static final float a = 56;
    public static final float b = 125;

    /* compiled from: BigPlayerScaffold.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BigPlayerBottomSheetValue.values().length];
            try {
                iArr[BigPlayerBottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BigPlayerBottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, final zzs zzsVar, final jai jaiVar, final jai jaiVar2, final jai jaiVar3, final jai jaiVar4, final jai jaiVar5, h17 h17Var, boolean z, final r5j0 r5j0Var, float f, final mtk0 mtk0Var, final float f2, izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.a aVar2;
        boolean z2;
        final float f3;
        final izs izsVar2;
        int i6;
        izs izsVar3;
        final float f4;
        int i7;
        int i8;
        boolean z3;
        Object x;
        boolean z4;
        a.C0011a.C0012a c0012a;
        int i9;
        int i10;
        boolean z5;
        Object x2;
        final h17 h17Var2 = h17Var;
        androidx.compose.runtime.a M = aVar.M(-1178003314);
        if ((i & 6) == 0) {
            i4 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.y(zzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= M.y(jaiVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= M.y(jaiVar3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= M.y(jaiVar4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= M.y(jaiVar5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= M.J(h17Var2) ? 8388608 : 4194304;
        }
        int i11 = i3 & 256;
        if (i11 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= M.l(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= M.J(r5j0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i12 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            i12 |= M.J(mtk0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i12 |= M.n(f2) ? 256 : 128;
        }
        int i13 = i12;
        int i14 = i3 & 8192;
        if (i14 != 0) {
            i5 = i13 | 3072;
        } else if ((i2 & 3072) == 0) {
            i5 = i13 | (M.y(izsVar) ? 2048 : 1024);
        } else {
            i5 = i13;
        }
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            M.V();
            int i15 = i & 1;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (i15 == 0 || M.i()) {
                z2 = i11 != 0 ? true : z;
                float f5 = m07.a;
                int i16 = i5 & (-15);
                if (i14 != 0) {
                    Object x3 = M.x();
                    if (x3 == c0012a2) {
                        i7 = i16;
                        x3 = new ob(5);
                        M.R(x3);
                    } else {
                        i7 = i16;
                    }
                    izs izsVar4 = (izs) x3;
                    i6 = i7;
                    izsVar3 = izsVar4;
                } else {
                    i6 = i16;
                    izsVar3 = izsVar;
                }
                f4 = f5;
            } else {
                M.h();
                z2 = z;
                f4 = f;
                izsVar3 = izsVar;
                i6 = i5 & (-15);
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1178003314, i4, i6, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffold (BigPlayerScaffold.kt:341)");
            }
            final float I0 = ((azl) M.r(uvi.h)).I0(f2);
            Integer valueOf = Integer.valueOf(((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation);
            int i17 = i6;
            int i18 = (i4 & 29360128) ^ 12582912;
            if (i18 <= 8388608 || !M.J(h17Var2)) {
                i8 = i4;
                if ((i8 & 12582912) != 8388608) {
                    z3 = false;
                    x = M.x();
                    z4 = z3;
                    jai jaiVar6 = null;
                    if (!z4 || x == c0012a2) {
                        x = new a17(h17Var2, null);
                        M.R(x);
                    }
                    izs izsVar5 = izsVar3;
                    bap.g(valueOf, (wzs) x, M, 0);
                    if (zzsVar == null) {
                        M.K(1810223999);
                        final boolean z6 = z2;
                        c0012a = c0012a2;
                        i9 = i8;
                        i10 = 8388608;
                        yzs yzsVar = new yzs() { // from class: xsna.s07
                            @Override // xsna.yzs
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                final int intValue = ((Integer) obj).intValue();
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= aVar3.o(intValue) ? 4 : 2;
                                }
                                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1477726872, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffold.<anonymous> (BigPlayerScaffold.kt:354)");
                                    }
                                    q630 q630Var2 = q630.a.a;
                                    boolean z7 = z6;
                                    h17 h17Var3 = h17Var2;
                                    a.C0011a.C0012a c0012a3 = a.C0011a.a;
                                    if (z7) {
                                        aVar3.K(453629902);
                                        boolean J = aVar3.J(h17Var3.a.c);
                                        Object x4 = aVar3.x();
                                        if (J || x4 == c0012a3) {
                                            e17 e17Var = new e17(h17Var3.a.c, Orientation.Vertical);
                                            aVar3.R(e17Var);
                                            x4 = e17Var;
                                        }
                                        q630Var2 = n34.t(q630Var2, (d160) x4, null);
                                        aVar3.j();
                                    } else {
                                        aVar3.K(1538669328);
                                        aVar3.j();
                                    }
                                    g07 g07Var = h17Var3.a;
                                    q630 l = txj0.l(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var2, 1.0f));
                                    final float f6 = I0;
                                    float f7 = intValue - f6;
                                    boolean n = aVar3.n(f6) | ((intValue2 & 14) == 4);
                                    Object x5 = aVar3.x();
                                    if (n || x5 == c0012a3) {
                                        x5 = new izs() { // from class: xsna.w07
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj4) {
                                                final float f8 = (int) (((q9x) obj4).a & 4294967295L);
                                                final float f9 = f6;
                                                final int i19 = intValue;
                                                return lz1.a(new izs() { // from class: xsna.n07
                                                    @Override // xsna.izs
                                                    public final Object invoke(Object obj5) {
                                                        wgo wgoVar = (wgo) obj5;
                                                        BigPlayerBottomSheetValue bigPlayerBottomSheetValue = BigPlayerBottomSheetValue.Collapsed;
                                                        float f10 = i19;
                                                        float f11 = f9;
                                                        wgoVar.a(bigPlayerBottomSheetValue, f10 - f11);
                                                        float f12 = f8;
                                                        if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f12 != f11) {
                                                            wgoVar.a(BigPlayerBottomSheetValue.Expanded, f10 - f12);
                                                        }
                                                        return s3q0.a;
                                                    }
                                                });
                                            }
                                        };
                                        aVar3.R(x5);
                                    }
                                    f17.c(g07Var, z7, (izs) x5, r5j0Var, f4, mtk0Var, f7, l, zzsVar, aVar3, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        };
                        h17Var2 = h17Var2;
                        z2 = z6;
                        jaiVar6 = kai.c(-1477726872, yzsVar, M);
                        M.j();
                    } else {
                        c0012a = c0012a2;
                        i9 = i8;
                        i10 = 8388608;
                        M.K(283899128);
                        M.j();
                    }
                    jai c = kai.c(-2071656865, new ed4(1, jaiVar5, h17Var2), M);
                    z5 = (i18 <= i10 && M.J(h17Var2)) || (i9 & 12582912) == i10;
                    x2 = M.x();
                    if (!z5 || x2 == c0012a) {
                        x2 = new defpackage.h(h17Var2, 9);
                        M.R(x2);
                    }
                    aVar2 = M;
                    b(q630Var, izsVar5, jaiVar, jaiVar2, jaiVar3, jaiVar4, jaiVar6, c, f2, (gzs) x2, aVar2, (i9 & 14) | 12582912 | ((i17 >> 6) & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | ((i17 << 18) & 234881024));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    izsVar2 = izsVar5;
                    f3 = f4;
                }
            } else {
                i8 = i4;
            }
            z3 = true;
            x = M.x();
            z4 = z3;
            jai jaiVar62 = null;
            if (!z4) {
            }
            x = new a17(h17Var2, null);
            M.R(x);
            izs izsVar52 = izsVar3;
            bap.g(valueOf, (wzs) x, M, 0);
            if (zzsVar == null) {
            }
            jai c2 = kai.c(-2071656865, new ed4(1, jaiVar5, h17Var2), M);
            if (i18 <= i10) {
            }
            x2 = M.x();
            if (!z5) {
            }
            x2 = new defpackage.h(h17Var2, 9);
            M.R(x2);
            aVar2 = M;
            b(q630Var, izsVar52, jaiVar, jaiVar2, jaiVar3, jaiVar4, jaiVar62, c2, f2, (gzs) x2, aVar2, (i9 & 14) | 12582912 | ((i17 >> 6) & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | ((i17 << 18) & 234881024));
            if (androidx.compose.runtime.b.d()) {
            }
            izsVar2 = izsVar52;
            f3 = f4;
        } else {
            aVar2 = M;
            aVar2.h();
            z2 = z;
            f3 = f;
            izsVar2 = izsVar;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final boolean z7 = z2;
            s.d = new wzs() { // from class: xsna.t07
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    f17.a(q630.this, zzsVar, jaiVar, jaiVar2, jaiVar3, jaiVar4, jaiVar5, h17Var2, z7, r5j0Var, f3, mtk0Var, f2, izsVar2, (androidx.compose.runtime.a) obj, I, I2, i3);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final q630 q630Var, final izs izsVar, final jai jaiVar, final jai jaiVar2, final jai jaiVar3, final jai jaiVar4, final yzs yzsVar, final jai jaiVar5, final float f, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        izs izsVar2;
        jai jaiVar6;
        jai jaiVar7;
        jai jaiVar8;
        jai jaiVar9;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1143798422);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 32 : 16;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 384) == 0) {
            jaiVar6 = jaiVar;
            i2 |= M.y(jaiVar6) ? 256 : 128;
        } else {
            jaiVar6 = jaiVar;
        }
        if ((i & 3072) == 0) {
            jaiVar7 = jaiVar2;
            i2 |= M.y(jaiVar7) ? 2048 : 1024;
        } else {
            jaiVar7 = jaiVar2;
        }
        if ((i & 24576) == 0) {
            jaiVar8 = jaiVar3;
            i2 |= M.y(jaiVar8) ? 16384 : 8192;
        } else {
            jaiVar8 = jaiVar3;
        }
        if ((196608 & i) == 0) {
            jaiVar9 = jaiVar4;
            i2 |= M.y(jaiVar9) ? 131072 : 65536;
        } else {
            jaiVar9 = jaiVar4;
        }
        if ((i & 1572864) == 0) {
            i2 |= M.y(yzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.y(jaiVar5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= M.n(f) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= M.y(gzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i2 & 1, (i2 & 306783379) != 306783378)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1143798422, i2, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldLayout (BigPlayerScaffold.kt:523)");
            }
            boolean z = ((((234881024 & i2) ^ 100663296) > 67108864 && M.n(f)) || (i2 & 100663296) == 67108864) | ((i2 & 896) == 256) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32) | ((29360128 & i2) == 8388608) | ((1879048192 & i2) == 536870912);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                final jai jaiVar10 = jaiVar6;
                final izs izsVar3 = izsVar2;
                final jai jaiVar11 = jaiVar7;
                final jai jaiVar12 = jaiVar8;
                i3 = i2;
                final jai jaiVar13 = jaiVar9;
                i4 = 0;
                wzs wzsVar = new wzs() { // from class: xsna.u07
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r13v30, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r14v39, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r21v0 */
                    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
                    /* JADX WARN: Type inference failed for: r21v3 */
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        Object obj3;
                        int i5;
                        int i6;
                        boolean z2;
                        EmptyList emptyList;
                        EmptyList emptyList2;
                        ?? r21;
                        ArrayList arrayList;
                        int i7;
                        EmptyList emptyList3;
                        ArrayList arrayList2;
                        Object obj4;
                        ArrayList arrayList3;
                        int i8;
                        ArrayList arrayList4;
                        Object obj5;
                        ztm0 ztm0Var = (ztm0) obj;
                        o6j o6jVar = (o6j) obj2;
                        final int i9 = o6j.i(o6jVar.a);
                        final int h = o6j.h(o6jVar.a);
                        long b2 = o6j.b(0, o6jVar.a, 0, 0, 0, 10);
                        final float f2 = f;
                        int r0 = ztm0Var.r0(f2);
                        int r02 = ztm0Var.r0(bw40.f);
                        List<zo10> t1 = ztm0Var.t1(g17.TopBar, new jai(1653220969, new cd4(jaiVar10, 2), true));
                        final ArrayList arrayList5 = new ArrayList(t1.size());
                        int size = t1.size();
                        for (int i10 = 0; i10 < size; i10 = rf3.a(t1.get(i10), b2, arrayList5, i10, 1)) {
                        }
                        if (arrayList5.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList5.get(0);
                            int i11 = ((tra0) obj3).c;
                            int h2 = e43.h(arrayList5);
                            if (1 <= h2) {
                                int i12 = i11;
                                int i13 = 1;
                                while (true) {
                                    Object obj6 = arrayList5.get(i13);
                                    int i14 = ((tra0) obj6).c;
                                    if (i12 < i14) {
                                        i12 = i14;
                                        obj3 = obj6;
                                    }
                                    if (i13 == h2) {
                                        break;
                                    }
                                    i13++;
                                }
                            }
                        }
                        tra0 tra0Var = (tra0) obj3;
                        int i15 = tra0Var != null ? tra0Var.c : 0;
                        List<zo10> t12 = ztm0Var.t1(g17.ActionsPanel, new jai(1126195762, new hd4(jaiVar12, 1), true));
                        ArrayList arrayList6 = new ArrayList(t12.size());
                        int size2 = t12.size();
                        for (int i16 = 0; i16 < size2; i16 = rf3.a(t12.get(i16), b2, arrayList6, i16, 1)) {
                        }
                        ArrayList arrayList7 = arrayList6;
                        int size3 = arrayList7.size();
                        int i17 = 0;
                        for (int i18 = 0; i18 < size3; i18++) {
                            i17 += ((tra0) arrayList7.get(i18)).c;
                        }
                        List<zo10> t13 = ztm0Var.t1(g17.ControlPanel, new jai(-1414446638, new bo3(jaiVar13, 2), true));
                        final ArrayList arrayList8 = new ArrayList(t13.size());
                        int size4 = t13.size();
                        for (int i19 = 0; i19 < size4; i19 = rf3.a(t13.get(i19), b2, arrayList8, i19, 1)) {
                        }
                        int size5 = arrayList8.size();
                        int i20 = 0;
                        for (int i21 = 0; i21 < size5; i21++) {
                            i20 += ((tra0) arrayList8.get(i21)).c;
                        }
                        final int i22 = i17 + i15 + i20;
                        int i23 = h - i22;
                        if (i23 < 0) {
                            i23 = 0;
                        }
                        yzs yzsVar2 = yzsVar;
                        boolean z3 = i23 >= r0 && yzsVar2 != null;
                        if (z3) {
                            i5 = r0;
                            i6 = r02;
                            z2 = true;
                            List<zo10> t14 = ztm0Var.t1(g17.Sheet, new jai(2046481043, new x07(yzsVar2, h, 0), true));
                            ?? arrayList9 = new ArrayList(t14.size());
                            int size6 = t14.size();
                            for (int i24 = 0; i24 < size6; i24 = rf3.a(t14.get(i24), b2, arrayList9, i24, 1)) {
                            }
                            emptyList = arrayList9;
                        } else {
                            i5 = r0;
                            i6 = r02;
                            z2 = true;
                            emptyList = EmptyList.b;
                        }
                        int i25 = i23 - i5;
                        int r03 = i9 - ztm0Var.r0(64);
                        float f3 = 32;
                        if (i25 - i6 < ztm0Var.I0(f3)) {
                            r03 = i6;
                        } else {
                            int r04 = i25 - ztm0Var.r0(f3);
                            if (r04 <= r03) {
                                r03 = r04;
                            }
                        }
                        boolean z4 = i25 >= r03 ? z2 : false;
                        if (z4) {
                            emptyList2 = emptyList;
                            int i26 = 1;
                            List<zo10> t15 = ztm0Var.t1(g17.Image, new jai(208426639, new jd4(jaiVar11, 1), true));
                            ?? arrayList10 = new ArrayList(t15.size());
                            int size7 = t15.size();
                            int i27 = 0;
                            while (i27 < size7) {
                                int i28 = r03;
                                int i29 = i26;
                                i27 = rf3.a(t15.get(i27), o6j.b(0, b2, 0, 0, i28, 7), arrayList10, i27, i29);
                                arrayList7 = arrayList7;
                                i26 = i29;
                                size7 = size7;
                                r03 = i28;
                            }
                            r21 = i26;
                            arrayList = arrayList7;
                            i7 = r03;
                            emptyList3 = arrayList10;
                        } else {
                            emptyList2 = emptyList;
                            r21 = z2;
                            arrayList = arrayList7;
                            i7 = r03;
                            emptyList3 = EmptyList.b;
                        }
                        final EmptyList emptyList4 = emptyList3;
                        izsVar3.invoke(Boolean.valueOf(z4));
                        if (!z3) {
                            i5 = 0;
                        }
                        int i30 = i22 + i5 + (z4 ? i7 : 0);
                        int size8 = (arrayList8.size() + arrayList.size()) - 1;
                        if (size8 < 0) {
                            size8 = 0;
                        }
                        int i31 = size8 + 4;
                        int i32 = h - i30;
                        if (i32 < 0) {
                            i32 = 0;
                        }
                        final int i33 = i32 / i31;
                        List<zo10> t16 = ztm0Var.t1(g17.Snackbar, jaiVar5);
                        ArrayList arrayList11 = new ArrayList(t16.size());
                        int size9 = t16.size();
                        for (int i34 = 0; i34 < size9; i34 = rf3.a(t16.get(i34), b2, arrayList11, i34, r21)) {
                        }
                        int i35 = r21;
                        if (arrayList11.isEmpty()) {
                            arrayList2 = arrayList11;
                            obj4 = null;
                            arrayList3 = arrayList;
                        } else {
                            arrayList2 = arrayList11;
                            obj4 = arrayList2.get(0);
                            int i36 = ((tra0) obj4).b;
                            arrayList3 = arrayList;
                            int h3 = e43.h(arrayList2);
                            if (i35 <= h3) {
                                Object obj7 = obj4;
                                int i37 = i36;
                                int i38 = i35;
                                while (true) {
                                    Object obj8 = arrayList2.get(i38);
                                    int i39 = ((tra0) obj8).b;
                                    if (i37 < i39) {
                                        i37 = i39;
                                        obj7 = obj8;
                                    }
                                    if (i38 == h3) {
                                        break;
                                    }
                                    i38++;
                                }
                                obj4 = obj7;
                            }
                        }
                        tra0 tra0Var2 = (tra0) obj4;
                        int i40 = tra0Var2 != null ? tra0Var2.b : 0;
                        if (arrayList2.isEmpty()) {
                            arrayList4 = arrayList2;
                            i8 = i15;
                            obj5 = null;
                        } else {
                            Object obj9 = arrayList2.get(0);
                            int i41 = ((tra0) obj9).c;
                            int h4 = e43.h(arrayList2);
                            i8 = i15;
                            if (1 <= h4) {
                                int i42 = 1;
                                obj5 = obj9;
                                while (true) {
                                    Object obj10 = arrayList2.get(i42);
                                    arrayList4 = arrayList2;
                                    int i43 = ((tra0) obj10).c;
                                    if (i41 < i43) {
                                        i41 = i43;
                                        obj5 = obj10;
                                    }
                                    if (i42 == h4) {
                                        break;
                                    }
                                    i42++;
                                    arrayList2 = arrayList4;
                                }
                            } else {
                                arrayList4 = arrayList2;
                                obj5 = obj9;
                            }
                        }
                        tra0 tra0Var3 = (tra0) obj5;
                        int i44 = tra0Var3 != null ? tra0Var3.c : 0;
                        final gzs gzsVar2 = gzsVar;
                        final int i45 = i8;
                        final ArrayList arrayList12 = arrayList3;
                        final int i46 = i7;
                        final boolean z5 = z3;
                        final EmptyList emptyList5 = emptyList2;
                        final ArrayList arrayList13 = arrayList4;
                        final int i47 = i44;
                        final int i48 = i40;
                        final boolean z6 = z4;
                        return ztm0Var.Q(i9, h, jgp.b, new izs() { // from class: xsna.y07
                            @Override // xsna.izs
                            public final Object invoke(Object obj11) {
                                tra0.a aVar2 = (tra0.a) obj11;
                                int i49 = (i9 - i48) / 2;
                                int i50 = h;
                                int r05 = (i50 - i47) - (aVar2.r0(f2) / 2);
                                ArrayList arrayList14 = arrayList5;
                                int size10 = arrayList14.size();
                                for (int i51 = 0; i51 < size10; i51++) {
                                    tra0.a.x(aVar2, (tra0) arrayList14.get(i51), 0, 0);
                                }
                                boolean z7 = z6;
                                int i52 = i45;
                                int i53 = i33;
                                if (z7) {
                                    List list = emptyList4;
                                    int size11 = list.size();
                                    for (int i54 = 0; i54 < size11; i54++) {
                                        tra0.a.x(aVar2, (tra0) list.get(i54), 0, i52 + i53);
                                    }
                                }
                                int i55 = (i53 * 2) + i52 + (z7 ? i46 : 0);
                                if (i22 < i50) {
                                    ArrayList arrayList15 = arrayList12;
                                    int size12 = arrayList15.size();
                                    for (int i56 = 0; i56 < size12; i56++) {
                                        tra0 tra0Var4 = (tra0) arrayList15.get(i56);
                                        tra0.a.x(aVar2, tra0Var4, 0, i55);
                                        i55 += tra0Var4.c + i53;
                                    }
                                }
                                ArrayList arrayList16 = arrayList8;
                                int size13 = arrayList16.size();
                                for (int i57 = 0; i57 < size13; i57++) {
                                    tra0 tra0Var5 = (tra0) arrayList16.get(i57);
                                    tra0.a.x(aVar2, tra0Var5, 0, i55);
                                    i55 += tra0Var5.c + i53;
                                }
                                if (z5) {
                                    int b3 = an10.b(((Number) gzsVar2.invoke()).floatValue());
                                    List list2 = emptyList5;
                                    int size14 = list2.size();
                                    for (int i58 = 0; i58 < size14; i58++) {
                                        tra0.a.x(aVar2, (tra0) list2.get(i58), 0, b3);
                                    }
                                }
                                ArrayList arrayList17 = arrayList13;
                                int size15 = arrayList17.size();
                                for (int i59 = 0; i59 < size15; i59++) {
                                    tra0.a.x(aVar2, (tra0) arrayList17.get(i59), i49, r05);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(wzsVar);
                x = wzsVar;
            } else {
                i3 = i2;
                i4 = 0;
            }
            xtm0.a(q630Var, (wzs) x, M, i3 & 14, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.v07
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f17.b(q630.this, izsVar, jaiVar, jaiVar2, jaiVar3, jaiVar4, yzsVar, jaiVar5, f, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final g07 g07Var, final boolean z, final izs izsVar, final r5j0 r5j0Var, final float f, final mtk0 mtk0Var, final float f2, final q630 q630Var, final zzs zzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-506298007);
        int i2 = i | (M.J(g07Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(r5j0Var) ? 2048 : 1024) | (M.n(f) ? 16384 : 8192) | (M.J(mtk0Var) ? 131072 : 65536) | (M.n(f2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(q630Var) ? 8388608 : 4194304) | (M.y(zzsVar) ? 67108864 : 33554432);
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-506298007, i2, -1, "com.vk.music.stickyplayer.presentation.components.BottomSheet (BigPlayerScaffold.kt:412)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            q630 e = lz1.e(q630Var, g07Var.c, Orientation.Vertical, z, 56);
            int i3 = i2 & 14;
            boolean z2 = (i3 == 4) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new sh3(3, izsVar, g07Var);
                M.R(x2);
            }
            q630 z3 = sv1.z(e, (izs) x2);
            boolean y = (i3 == 4) | M.y(yvjVar);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new defpackage.s(2, g07Var, yvjVar);
                M.R(x3);
            }
            aVar2 = M;
            d(mtk0Var, egi0.b(z3, false, (izs) x3), r5j0Var, 0L, f, kai.c(213133243, new wzs() { // from class: xsna.z07
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(213133243, intValue, -1, "com.vk.music.stickyplayer.presentation.components.BottomSheet.<anonymous> (BigPlayerScaffold.kt:453)");
                        }
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, q630.a.a);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a2, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c, cri.a.d);
                        zzs.this.invoke(r9g.a, Float.valueOf(f2), aVar3, 6);
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i2 >> 15) & 14) | 1572864 | ((i2 >> 3) & 896) | (458752 & (i2 << 3)));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(z, izsVar, r5j0Var, f, mtk0Var, f2, q630Var, zzsVar, i) { // from class: xsna.o07
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ r5j0 e;
                public final /* synthetic */ float f;
                public final /* synthetic */ mtk0 g;
                public final /* synthetic */ float h;
                public final /* synthetic */ q630 i;
                public final /* synthetic */ zzs j;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    f17.c(g07.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final mtk0 mtk0Var, final q630 q630Var, final r5j0 r5j0Var, long j, final float f, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final long j2;
        long j3;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1746995934);
        if ((i & 6) == 0) {
            i2 = (M.J(mtk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(r5j0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= M.n(f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j3 = ylu0Var.getText().d;
                i3 = i4 & (-7169);
            } else {
                M.h();
                i3 = i4 & (-7169);
                j3 = j;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1746995934, i3, -1, "com.vk.music.stickyplayer.presentation.components.ColorStateSurface (BigPlayerScaffold.kt:466)");
            }
            pqo pqoVar = hbp.b;
            rvi.b(new c9e0[]{vcl0.b(j3, yfj.a), pqoVar.b(new pco(((pco) M.r(pqoVar)).b + f))}, kai.c(860716958, new wzs() { // from class: xsna.p07
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(860716958, intValue, -1, "com.vk.music.stickyplayer.presentation.components.ColorStateSurface.<anonymous> (BigPlayerScaffold.kt:472)");
                        }
                        q630 q630Var2 = q630.this;
                        float f2 = f;
                        r5j0 r5j0Var2 = r5j0Var;
                        q630 d = rte0.d(a5j0.b(q630Var2, f2, r5j0Var2, false, 0L, 0L, 24), r5j0Var2);
                        mtk0 mtk0Var2 = mtk0Var;
                        boolean J = aVar2.J(mtk0Var2);
                        Object x = aVar2.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (J || x == c0012a) {
                            x = new lb(mtk0Var2, 12);
                            aVar2.R(x);
                        }
                        q630 c = bu00.c(d, (izs) x);
                        Object x2 = aVar2.x();
                        if (x2 == c0012a) {
                            x2 = new x4(5);
                            aVar2.R(x2);
                        }
                        q630 b2 = egi0.b(c, false, (izs) x2);
                        s3q0 s3q0Var = s3q0.a;
                        Object x3 = aVar2.x();
                        if (x3 == c0012a) {
                            x3 = d17.a;
                            aVar2.R(x3);
                        }
                        q630 b3 = skn0.b(b2, s3q0Var, (PointerInputEventHandler) x3);
                        dt1.a.getClass();
                        cp10 d2 = ja8.d(dt1.a.b, true);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c2 = qri.c(aVar2, b3);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, d2, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c2, cri.a.d);
                        if (er.f(0, aVar2, jaiVar)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j3;
        } else {
            M.h();
            j2 = j;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.q07
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f17.d(mtk0.this, q630Var, r5j0Var, j2, f, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final float e(h17 h17Var) {
        g07 g07Var = h17Var.a;
        float b2 = g07Var.b();
        f12<BigPlayerBottomSheetValue> f12Var = g07Var.c;
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue = (BigPlayerBottomSheetValue) f12Var.i.getValue();
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue2 = (BigPlayerBottomSheetValue) ((zak0) f12Var.g).getValue();
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue3 = BigPlayerBottomSheetValue.Collapsed;
        if (bigPlayerBottomSheetValue2 == bigPlayerBottomSheetValue3 && bigPlayerBottomSheetValue == bigPlayerBottomSheetValue3) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        BigPlayerBottomSheetValue bigPlayerBottomSheetValue4 = BigPlayerBottomSheetValue.Expanded;
        if (bigPlayerBottomSheetValue2 == bigPlayerBottomSheetValue4 && bigPlayerBottomSheetValue == bigPlayerBottomSheetValue4) {
            return 1.0f;
        }
        return (bigPlayerBottomSheetValue2 == bigPlayerBottomSheetValue3 && bigPlayerBottomSheetValue == bigPlayerBottomSheetValue4) ? b2 : 1.0f - b2;
    }

    public static final g07 f(final BigPlayerBottomSheetValue bigPlayerBottomSheetValue, androidx.compose.runtime.a aVar) {
        final xmk0<Float> xmk0Var = m07.b;
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = new k60(6);
            aVar.R(x);
        }
        final izs izsVar = (izs) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1279846651, 6, -1, "com.vk.music.stickyplayer.presentation.components.rememberBigPlayerBottomSheetState (BigPlayerScaffold.kt:254)");
        }
        final azl azlVar = (azl) aVar.r(uvi.h);
        Object[] objArr = {xmk0Var};
        fh9 fh9Var = new fh9(new f07((byte) 0, 0), new nv2(azlVar, izsVar));
        boolean J = aVar.J(azlVar) | aVar.y(xmk0Var) | aVar.J(izsVar);
        Object x2 = aVar.x();
        if (J || x2 == obj) {
            x2 = new gzs() { // from class: xsna.r07
                @Override // xsna.gzs
                public final Object invoke() {
                    return new g07(BigPlayerBottomSheetValue.this, azlVar, xmk0Var, izsVar);
                }
            };
            aVar.R(x2);
        }
        g07 g07Var = (g07) crx0.D(objArr, fh9Var, (gzs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return g07Var;
    }

    public static final h17 g(g07 g07Var, androidx.compose.runtime.a aVar, int i) {
        if ((i & 1) != 0) {
            g07Var = f(BigPlayerBottomSheetValue.Collapsed, aVar);
        }
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = new e8k0();
            aVar.R(x);
        }
        e8k0 e8k0Var = (e8k0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1783489677, 0, -1, "com.vk.music.stickyplayer.presentation.components.rememberBigPlayerScaffoldState (BigPlayerScaffold.kt:316)");
        }
        boolean J = aVar.J(g07Var) | aVar.J(e8k0Var);
        Object x2 = aVar.x();
        if (J || x2 == obj) {
            x2 = new h17(g07Var, e8k0Var);
            aVar.R(x2);
        }
        h17 h17Var = (h17) x2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return h17Var;
    }
}
