package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.dt1;
import xsna.q630;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes11.dex */
public final class sx20 {
    public static final float a = 48;
    public static final float b = 24;
    public static final long c = f370.i(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* compiled from: ModalBottomSheet.kt */
    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ gzs<s3q0> a;

        public a(gzs<s3q0> gzsVar) {
            this.a = gzsVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object e = z2o0.e(dmb0Var, null, null, new rx20(0, this.a), spjVar, 7);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gzs gzsVar, final q630 q630Var, final gdj0 gdj0Var, float f, boolean z, r5j0 r5j0Var, final long j, long j2, float f2, long j3, final jai jaiVar, wzs wzsVar, yx20 yx20Var, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gdj0 gdj0Var2;
        androidx.compose.runtime.a aVar2;
        final float f3;
        final boolean z2;
        final r5j0 r5j0Var2;
        final long j4;
        final float f4;
        final long j5;
        final wzs wzsVar2;
        final yx20 yx20Var2;
        long a2;
        int i3;
        long j6;
        wzs wzsVar3;
        r5j0 r5j0Var3;
        float f5;
        boolean z3;
        boolean z4;
        yx20 yx20Var3;
        float f6;
        int i4;
        Object bx5Var;
        float f7;
        Object obj;
        int i5;
        gzs gzsVar2;
        boolean z5;
        boolean z6;
        Object x;
        izs izsVar;
        Object x2;
        izs izsVar2;
        boolean z7;
        boolean y;
        Object x3;
        int i6;
        androidx.compose.runtime.a M = aVar.M(1904798512);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(gdj0Var) ? 256 : 128;
        }
        int i7 = i2 | 27648;
        if ((196608 & i) == 0) {
            i7 = 93184 | i2;
        }
        if ((1572864 & i) == 0) {
            i7 |= M.p(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i7 |= 4194304;
        }
        int i8 = 100663296 | i7;
        if ((805306368 & i) == 0) {
            i8 = 369098752 | i7;
        }
        boolean z8 = true;
        if (M.t(i8 & 1, (306783379 & i8) != 306783378)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                float f8 = a88.a;
                float f9 = a88.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1683783414, 6, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:379)");
                }
                r5j0 a3 = p6j0.a(tcj0.a, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = u7g.a((((-458753) & i8) >> 18) & 14, j, M);
                float f10 = 0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2040719176, 6, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:390)");
                }
                long c2 = l5g.c(14, u7g.c(jeh0.a, M), 0.32f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                i3 = i8 & (-1908867073);
                yx20 yx20Var4 = new yx20(0);
                j6 = c2;
                wzsVar3 = bx20.b;
                r5j0Var3 = a3;
                f5 = f10;
                z3 = true;
                z4 = false;
                yx20Var3 = yx20Var4;
                f6 = f8;
            } else {
                M.h();
                i3 = i8 & (-1908867073);
                f6 = f;
                z3 = z;
                a2 = j2;
                f5 = f2;
                j6 = j3;
                wzsVar3 = wzsVar;
                yx20Var3 = yx20Var;
                z4 = false;
                r5j0Var3 = r5j0Var;
            }
            int i9 = i3;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1904798512, i9, 3462, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
            }
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
            Object a4 = lb30.a(motionSchemeKeyTokens, M);
            Object a5 = lb30.a(motionSchemeKeyTokens, M);
            Object a6 = lb30.a(MotionSchemeKeyTokens.FastEffects, M);
            int i10 = (i9 & 896) ^ 384;
            boolean y2 = (((i10 <= 256 || !M.J(gdj0Var)) && (i9 & 384) != 256) ? z4 : true) | M.y(a5) | M.y(a6) | M.y(a4);
            Object x4 = M.x();
            Object obj2 = a.C0011a.a;
            if (y2 || x4 == obj2) {
                i4 = i9;
                f7 = f6;
                obj = obj2;
                i5 = i10;
                bx5Var = new bx5(gdj0Var, a5, a6, a4, 2);
                M.R(bx5Var);
            } else {
                i4 = i9;
                f7 = f6;
                bx5Var = x4;
                i5 = i10;
                obj = obj2;
            }
            boolean z9 = z4;
            bap.i((gzs) bx5Var, M, z9 ? 1 : 0);
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x5);
            }
            final yvj yvjVar = (yvj) x5;
            int i11 = i4 & 14;
            boolean y3 = (((i5 <= 256 || !M.J(gdj0Var)) && (i4 & 384) != 256) ? z9 ? 1 : 0 : true) | M.y(yvjVar) | (i11 == 4 ? true : z9 ? 1 : 0);
            Object x6 = M.x();
            int i12 = 5;
            if (y3 || x6 == obj) {
                x6 = new j5q(gdj0Var, yvjVar, gzsVar, i12);
                M.R(x6);
            }
            gzs gzsVar3 = (gzs) x6;
            boolean y4 = M.y(yvjVar);
            if (i5 <= 256 || !M.J(gdj0Var)) {
                gzsVar2 = gzsVar3;
                if ((i4 & 384) != 256) {
                    z5 = false;
                    z6 = z5 | y4 | (i11 != 4);
                    x = M.x();
                    if (!z6 || x == obj) {
                        x = new t3b(yvjVar, gdj0Var, gzsVar, 5);
                        M.R(x);
                    }
                    izsVar = (izs) x;
                    x2 = M.x();
                    if (x2 == obj) {
                        x2 = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        M.R(x2);
                    }
                    final if2 if2Var = (if2) x2;
                    if (i5 > 256 || !M.J(gdj0Var)) {
                        izsVar2 = izsVar;
                        if ((i4 & 384) != 256) {
                            z7 = false;
                            y = (i11 == 4) | z7 | M.y(yvjVar) | M.y(if2Var);
                            x3 = M.x();
                            if (!y || x3 == obj) {
                                x3 = new gzs() { // from class: xsna.zw20
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        gdj0 gdj0Var3 = gdj0.this;
                                        SheetValue sheetValue = (SheetValue) ((zak0) gdj0Var3.d.g).getValue();
                                        SheetValue sheetValue2 = SheetValue.Expanded;
                                        yvj yvjVar2 = yvjVar;
                                        if (sheetValue == sheetValue2 && gdj0Var3.d.e().f(SheetValue.PartiallyExpanded)) {
                                            myc0.h(yvjVar2, null, null, new cx20(if2Var, null), 3);
                                            myc0.h(yvjVar2, null, null, new dx20(gdj0Var3, null), 3);
                                        } else {
                                            myc0.h(yvjVar2, null, null, new ex20(gdj0Var3, null), 3).E(new yfo(1, gzsVar));
                                        }
                                        return s3q0.a;
                                    }
                                };
                                M.R(x3);
                            }
                            long j7 = a2;
                            float f11 = f5;
                            Object obj3 = obj;
                            aVar2 = M;
                            long j8 = j6;
                            int i13 = i4;
                            yx20 yx20Var5 = yx20Var3;
                            int i14 = i5;
                            float f12 = f7;
                            fx20 fx20Var = new fx20(j8, gzsVar2, gdj0Var, yx20Var5, if2Var, yvjVar, izsVar2, q630Var, f12, z3, r5j0Var3, j, j7, f11, jaiVar, wzsVar3, jaiVar2);
                            gdj0Var2 = gdj0Var;
                            my20.a((gzs) x3, j7, yx20Var5, if2Var, kai.c(1010026864, fx20Var, aVar2), aVar2, 29056);
                            if (gdj0Var2.d.e().f(SheetValue.Expanded)) {
                                aVar2.K(748459762);
                                if (i14 <= 256 || !aVar2.J(gdj0Var2)) {
                                    i6 = i13;
                                    if ((i6 & 384) != 256) {
                                        z8 = false;
                                    }
                                } else {
                                    i6 = i13;
                                }
                                Object x7 = aVar2.x();
                                if (z8 || x7 == obj3) {
                                    x7 = new gx20(gdj0Var2, null);
                                    aVar2.R(x7);
                                }
                                bap.g(gdj0Var2, (wzs) x7, aVar2, (i6 >> 6) & 14);
                                aVar2.j();
                            } else {
                                aVar2.K(748521266);
                                aVar2.j();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j4 = j7;
                            f3 = f12;
                            z2 = z3;
                            j5 = j8;
                            f4 = f11;
                            wzsVar2 = wzsVar3;
                            yx20Var2 = yx20Var5;
                            r5j0Var2 = r5j0Var3;
                        }
                    } else {
                        izsVar2 = izsVar;
                    }
                    z7 = true;
                    y = (i11 == 4) | z7 | M.y(yvjVar) | M.y(if2Var);
                    x3 = M.x();
                    if (!y) {
                    }
                    x3 = new gzs() { // from class: xsna.zw20
                        @Override // xsna.gzs
                        public final Object invoke() {
                            gdj0 gdj0Var3 = gdj0.this;
                            SheetValue sheetValue = (SheetValue) ((zak0) gdj0Var3.d.g).getValue();
                            SheetValue sheetValue2 = SheetValue.Expanded;
                            yvj yvjVar2 = yvjVar;
                            if (sheetValue == sheetValue2 && gdj0Var3.d.e().f(SheetValue.PartiallyExpanded)) {
                                myc0.h(yvjVar2, null, null, new cx20(if2Var, null), 3);
                                myc0.h(yvjVar2, null, null, new dx20(gdj0Var3, null), 3);
                            } else {
                                myc0.h(yvjVar2, null, null, new ex20(gdj0Var3, null), 3).E(new yfo(1, gzsVar));
                            }
                            return s3q0.a;
                        }
                    };
                    M.R(x3);
                    long j72 = a2;
                    float f112 = f5;
                    Object obj32 = obj;
                    aVar2 = M;
                    long j82 = j6;
                    int i132 = i4;
                    yx20 yx20Var52 = yx20Var3;
                    int i142 = i5;
                    float f122 = f7;
                    fx20 fx20Var2 = new fx20(j82, gzsVar2, gdj0Var, yx20Var52, if2Var, yvjVar, izsVar2, q630Var, f122, z3, r5j0Var3, j, j72, f112, jaiVar, wzsVar3, jaiVar2);
                    gdj0Var2 = gdj0Var;
                    my20.a((gzs) x3, j72, yx20Var52, if2Var, kai.c(1010026864, fx20Var2, aVar2), aVar2, 29056);
                    if (gdj0Var2.d.e().f(SheetValue.Expanded)) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    j4 = j72;
                    f3 = f122;
                    z2 = z3;
                    j5 = j82;
                    f4 = f112;
                    wzsVar2 = wzsVar3;
                    yx20Var2 = yx20Var52;
                    r5j0Var2 = r5j0Var3;
                }
            } else {
                gzsVar2 = gzsVar3;
            }
            z5 = true;
            z6 = z5 | y4 | (i11 != 4);
            x = M.x();
            if (!z6) {
            }
            x = new t3b(yvjVar, gdj0Var, gzsVar, 5);
            M.R(x);
            izsVar = (izs) x;
            x2 = M.x();
            if (x2 == obj) {
            }
            final if2 if2Var2 = (if2) x2;
            if (i5 > 256) {
            }
            izsVar2 = izsVar;
            if ((i4 & 384) != 256) {
            }
            z7 = true;
            y = (i11 == 4) | z7 | M.y(yvjVar) | M.y(if2Var2);
            x3 = M.x();
            if (!y) {
            }
            x3 = new gzs() { // from class: xsna.zw20
                @Override // xsna.gzs
                public final Object invoke() {
                    gdj0 gdj0Var3 = gdj0.this;
                    SheetValue sheetValue = (SheetValue) ((zak0) gdj0Var3.d.g).getValue();
                    SheetValue sheetValue2 = SheetValue.Expanded;
                    yvj yvjVar2 = yvjVar;
                    if (sheetValue == sheetValue2 && gdj0Var3.d.e().f(SheetValue.PartiallyExpanded)) {
                        myc0.h(yvjVar2, null, null, new cx20(if2Var2, null), 3);
                        myc0.h(yvjVar2, null, null, new dx20(gdj0Var3, null), 3);
                    } else {
                        myc0.h(yvjVar2, null, null, new ex20(gdj0Var3, null), 3).E(new yfo(1, gzsVar));
                    }
                    return s3q0.a;
                }
            };
            M.R(x3);
            long j722 = a2;
            float f1122 = f5;
            Object obj322 = obj;
            aVar2 = M;
            long j822 = j6;
            int i1322 = i4;
            yx20 yx20Var522 = yx20Var3;
            int i1422 = i5;
            float f1222 = f7;
            fx20 fx20Var22 = new fx20(j822, gzsVar2, gdj0Var, yx20Var522, if2Var2, yvjVar, izsVar2, q630Var, f1222, z3, r5j0Var3, j, j722, f1122, jaiVar, wzsVar3, jaiVar2);
            gdj0Var2 = gdj0Var;
            my20.a((gzs) x3, j722, yx20Var522, if2Var2, kai.c(1010026864, fx20Var22, aVar2), aVar2, 29056);
            if (gdj0Var2.d.e().f(SheetValue.Expanded)) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            j4 = j722;
            f3 = f1222;
            z2 = z3;
            j5 = j822;
            f4 = f1122;
            wzsVar2 = wzsVar3;
            yx20Var2 = yx20Var522;
            r5j0Var2 = r5j0Var3;
        } else {
            gdj0Var2 = gdj0Var;
            aVar2 = M;
            aVar2.h();
            f3 = f;
            z2 = z;
            r5j0Var2 = r5j0Var;
            j4 = j2;
            f4 = f2;
            j5 = j3;
            wzsVar2 = wzsVar;
            yx20Var2 = yx20Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final gdj0 gdj0Var3 = gdj0Var2;
            s.d = new wzs() { // from class: xsna.ax20
                @Override // xsna.wzs
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ne7.I(i | 1);
                    sx20.a(gzs.this, q630Var, gdj0Var3, f3, z2, r5j0Var2, j, j4, f4, j5, jaiVar, wzsVar2, yx20Var2, jaiVar2, (androidx.compose.runtime.a) obj4, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final if2 if2Var, final yvj yvjVar, final gzs gzsVar, final izs izsVar, final q630 q630Var, final gdj0 gdj0Var, final float f, final boolean z, final r5j0 r5j0Var, final long j, final long j2, final float f2, final jai jaiVar, final wzs wzsVar, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-37400432);
        int i2 = i | (M.y(if2Var) ? 32 : 16) | (M.y(yvjVar) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536) | (M.J(gdj0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.n(f) ? 8388608 : 4194304) | (M.l(z) ? 67108864 : 33554432) | (M.J(r5j0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = (M.p(j) ? 4 : 2) | (M.p(j2) ? 32 : 16) | (M.n(f2) ? 256 : 128) | (M.y(jaiVar) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.y(jaiVar2) ? 131072 : 65536);
        if (M.t(i2 & 1, ((i2 & 306783379) == 306783378 && (74899 & i3) == 74898) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-37400432, i2, i3, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
            }
            String b2 = e7b0.b(R.string.m3c_bottom_sheet_pane_title, M);
            dt1.a.getClass();
            q630 f3 = txj0.f(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, ra8.a.b(q630Var, dt1.a.c)), 1.0f);
            q630 q630Var2 = q630.a.a;
            Object obj = a.C0011a.a;
            if (z) {
                M.K(-1582035383);
                boolean z2 = (((i2 & 3670016) ^ 1572864) > 1048576 && M.J(gdj0Var)) || (i2 & 1572864) == 1048576;
                Object x = M.x();
                if (z2 || x == obj) {
                    Orientation orientation = Orientation.Vertical;
                    dtp0 dtp0Var = bdj0.a;
                    x = new ycj0(gdj0Var, izsVar, orientation);
                    M.R(x);
                }
                q630Var2 = n34.t(q630Var2, (d160) x, null);
                M.j();
            } else {
                M.K(-1582020872);
                M.j();
            }
            q630 g = f3.g(q630Var2);
            d12<SheetValue> d12Var = gdj0Var.d;
            Orientation orientation2 = Orientation.Vertical;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && M.J(gdj0Var)) || (i2 & 1572864) == 1048576;
            Object x2 = M.x();
            if (z3 || x2 == obj) {
                x2 = new u61(gdj0Var, 7);
                M.R(x2);
            }
            q630 i5 = fto0.i(g, d12Var, orientation2, (wzs) x2);
            z02 z02Var = gdj0Var.d.f;
            boolean z4 = z && gdj0Var.d();
            boolean z5 = ((zak0) gdj0Var.d.l).getValue() != null;
            boolean z6 = (i2 & 57344) == 16384;
            Object x3 = M.x();
            if (z6 || x3 == obj) {
                x3 = new jx20(izsVar, null);
                M.R(x3);
            }
            q630 a2 = fho.a(i5, z02Var, orientation2, z4, null, z5, (yzs) x3, false, 168);
            boolean J = M.J(b2);
            Object x4 = M.x();
            if (J || x4 == obj) {
                x4 = new ux9(b2, 4);
                M.R(x4);
            }
            q630 b3 = egi0.b(a2, false, (izs) x4);
            int floatValue = (int) ((vak0) gdj0Var.d.j).getFloatValue();
            if (floatValue < 0) {
                floatValue = 0;
            }
            q630 f4 = tci.f(b3, new anr(0, floatValue, 0, 0));
            boolean z7 = ((i4 > 1048576 && M.J(gdj0Var)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || M.y(if2Var));
            Object x5 = M.x();
            if (z7 || x5 == obj) {
                x5 = new k22(10, gdj0Var, if2Var);
                M.R(x5);
            }
            int i6 = ((i2 >> 24) & 112) | 12582912;
            int i7 = i3 << 6;
            aVar2 = M;
            xjn0.a(rdu.a(rdu.a(f4, (izs) x5), new n40(gdj0Var, 11)), r5j0Var, j, j2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(728743275, new qx20(wzsVar, if2Var, gdj0Var, jaiVar, jaiVar2, gzsVar, yvjVar, z), M), aVar2, i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344), 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(yvjVar, gzsVar, izsVar, q630Var, gdj0Var, f, z, r5j0Var, j, j2, f2, jaiVar, wzsVar, jaiVar2, i) { // from class: xsna.yw20
                public final /* synthetic */ yvj c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ gdj0 g;
                public final /* synthetic */ float h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ r5j0 j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ float m;
                public final /* synthetic */ jai n;
                public final /* synthetic */ wzs o;
                public final /* synthetic */ jai p;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(71);
                    sx20.b(if2.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final long j, final gzs<s3q0> gzsVar, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(-391613911);
        int i2 = i | (M.p(j) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-391613911, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:514)");
            }
            if (j != 16) {
                M.K(-1438582326);
                mtk0 b2 = hg2.b(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lb30.a(MotionSchemeKeyTokens.DefaultEffects, M), null, null, M, 0, 28);
                String b3 = e7b0.b(R.string.close_sheet, M);
                q630.a aVar2 = q630.a.a;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z2) {
                    M.K(-1438283579);
                    int i3 = i2 & 112;
                    boolean z3 = i3 == 32;
                    Object x = M.x();
                    if (z3 || x == c0012a) {
                        x = new a(gzsVar);
                        M.R(x);
                    }
                    q630 b4 = skn0.b(aVar2, gzsVar, (PointerInputEventHandler) x);
                    boolean J = (i3 == 32) | M.J(b3);
                    Object x2 = M.x();
                    if (J || x2 == c0012a) {
                        x2 = new na7(18, b3, gzsVar);
                        M.R(x2);
                    }
                    q630Var = egi0.b(b4, true, (izs) x2);
                    M.j();
                } else {
                    M.K(-1437857391);
                    M.j();
                    q630Var = aVar2;
                }
                q630 g = txj0.d(aVar2, 1.0f).g(q630Var);
                boolean J2 = M.J(b2) | ((i2 & 14) == 4);
                Object x3 = M.x();
                if (J2 || x3 == c0012a) {
                    x3 = new qfx(j, b2, 1);
                    M.R(x3);
                }
                xa4.i(0, M, (izs) x3, g);
                M.j();
            } else {
                M.K(-1437676103);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, gzsVar, z, z2, i) { // from class: xsna.xw20
                public final /* synthetic */ long b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    sx20.c(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final float d(tdu tduVar, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (tduVar.d() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return 1.0f - (q6x.z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(tduVar.I0(a), intBitsToFloat), f) / intBitsToFloat);
    }

    public static final float e(tdu tduVar, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (tduVar.d() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return 1.0f - (q6x.z(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(tduVar.I0(b), intBitsToFloat), f) / intBitsToFloat);
    }

    public static final gdj0 f(int i, int i2, androidx.compose.runtime.a aVar) {
        boolean z = true;
        final boolean z2 = (i2 & 1) == 0;
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            x = new l8k(20);
            aVar.R(x);
        }
        final izs izsVar = (izs) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:502)");
        }
        final SheetValue sheetValue = SheetValue.Hidden;
        int i3 = (i & 14) | 384;
        dtp0 dtp0Var = bdj0.a;
        final float f = a88.b;
        float f2 = a88.c;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-20307384, i3, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:514)");
        }
        final azl azlVar = (azl) aVar.r(uvi.h);
        boolean J = aVar.J(azlVar) | aVar.n(f);
        Object x2 = aVar.x();
        if (J || x2 == obj) {
            x2 = new gzs() { // from class: xsna.wcj0
                @Override // xsna.gzs
                public final Object invoke() {
                    return Float.valueOf(azlVar.I0(f));
                }
            };
            aVar.R(x2);
        }
        final gzs gzsVar = (gzs) x2;
        boolean J2 = aVar.J(azlVar) | aVar.n(f2);
        Object x3 = aVar.x();
        if (J2 || x3 == obj) {
            x3 = new br6(f2, azlVar);
            aVar.R(x3);
        }
        final gzs gzsVar2 = (gzs) x3;
        Object[] objArr = {Boolean.valueOf(z2), izsVar, Boolean.FALSE};
        fh9 fh9Var = new fh9(new bkh(10), new izs() { // from class: xsna.ddj0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                return new gdj0(z2, gzsVar, gzsVar2, (SheetValue) obj2, izsVar);
            }
        });
        if ((((i3 & 14) ^ 6) <= 4 || !aVar.l(z2)) && (i3 & 6) != 4) {
            z = false;
        }
        boolean J3 = aVar.J(gzsVar) | z | aVar.J(gzsVar2) | aVar.J(izsVar) | aVar.l(false);
        Object x4 = aVar.x();
        if (J3 || x4 == obj) {
            Object obj2 = new gzs() { // from class: xsna.xcj0
                @Override // xsna.gzs
                public final Object invoke() {
                    return new gdj0(z2, gzsVar, gzsVar2, sheetValue, izsVar);
                }
            };
            aVar.R(obj2);
            x4 = obj2;
        }
        gdj0 gdj0Var = (gdj0) crx0.D(objArr, fh9Var, (gzs) x4, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gdj0Var;
    }
}
