package xsna;

import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.dt1;
import xsna.kgo0;
import xsna.wlp0;

/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class fgo0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e = 2;
    public static final float f = 24;
    public static final float g;
    public static final float h;

    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[p2x.values().length];
            try {
                iArr2[p2x.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[p2x.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[p2x.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    public static final class b implements jqr, g0t {
        public final /* synthetic */ PropertyReference0Impl b;

        public b(PropertyReference0Impl propertyReference0Impl) {
            this.b = propertyReference0Impl;
        }

        public final float a() {
            return ((Number) this.b.get()).floatValue();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof jqr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        float f2 = 16;
        a = f2;
        float f3 = 4;
        b = f3;
        c = f3;
        d = f3;
        g = f2;
        h = f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:402:0x0494, code lost:
    
        if (r40 != false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x03bb, code lost:
    
        if (r40 != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0378, code lost:
    
        if (r40 != false) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x051e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0605 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final TextFieldType textFieldType, final CharSequence charSequence, final wzs wzsVar, final kgo0.b bVar, final yzs yzsVar, final wzs wzsVar2, final wzs wzsVar3, final boolean z, final boolean z2, final boolean z3, final wax waxVar, final s890 s890Var, final mfo0 mfo0Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a aVar2;
        wlp0 wlp0Var;
        z46 z46Var;
        float f2;
        Float f3;
        long j;
        int i5;
        float f4;
        phr a2;
        int i6;
        float f5;
        int i7;
        float f6;
        phr phrVar;
        int i8;
        float f7;
        int i9;
        boolean J;
        Object x;
        a.C0011a.C0012a c0012a;
        p2x p2xVar;
        nmo0 nmo0Var;
        long j2;
        l5g l5gVar;
        nmo0 nmo0Var2;
        boolean J2;
        Object x2;
        Object x3;
        int i10;
        nmo0 nmo0Var3;
        int i11;
        nmo0 nmo0Var4;
        wlp0.d dVar;
        jai jaiVar2;
        mfo0 mfo0Var2;
        long j3;
        Object x4;
        s890 s890Var2;
        int i12;
        a.C0011a.C0012a c0012a2;
        jai jaiVar3;
        mfo0 mfo0Var3;
        int i13;
        jai jaiVar4;
        int i14;
        jai jaiVar5;
        Object x5;
        jai jaiVar6;
        int i15;
        androidx.compose.runtime.a M = aVar.M(546805032);
        if ((i & 6) == 0) {
            i3 = (M.o(textFieldType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(wzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(bVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(yzsVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= M.y(wzsVar2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= M.y(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.y(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.y(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.y(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i16 = i3;
        if ((i2 & 6) == 0) {
            i4 = (M.y(wzsVar3) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.l(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.J(waxVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= M.J(s890Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= M.J(mfo0Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= M.y(jaiVar) ? 8388608 : 4194304;
        }
        int i17 = i4;
        if (M.t(i16 & 1, ((306783379 & i16) == 306783378 && (4793491 & i17) == 4793490) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(546805032, i16, i17, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:98)");
            }
            boolean booleanValue = ((Boolean) sa30.j(waxVar, M, (i17 >> 12) & 14).getValue()).booleanValue();
            p2x p2xVar2 = booleanValue ? p2x.Focused : charSequence.length() == 0 ? p2x.UnfocusedEmpty : p2x.UnfocusedNotEmpty;
            long j4 = !z2 ? mfo0Var.z : z3 ? mfo0Var.A : booleanValue ? mfo0Var.x : mfo0Var.y;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-942794935, 6, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
            }
            xup0 xup0Var = (xup0) M.r(evp0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nmo0 nmo0Var5 = xup0Var.j;
            nmo0 nmo0Var6 = xup0Var.l;
            long b2 = nmo0Var5.b();
            int i18 = l5g.l;
            long j5 = l5g.k;
            boolean z4 = (l5g.d(b2, j5) && !l5g.d(nmo0Var6.b(), j5)) || (!l5g.d(nmo0Var5.b(), j5) && l5g.d(nmo0Var6.b(), j5));
            long b3 = nmo0Var6.b();
            if (z4 && b3 == 16) {
                b3 = j4;
            }
            long b4 = nmo0Var5.b();
            if (z4 && b4 == 16) {
                b4 = j4;
            }
            boolean z5 = yzsVar != null;
            boolean z6 = z4;
            wlp0 e2 = ump0.e(p2xVar2, "TextFieldInputState", M, 48, 0);
            z46 z46Var2 = e2.a;
            phr a3 = lb30.a(MotionSchemeKeyTokens.FastSpatial, M);
            jtp0 jtp0Var = rte0.e;
            p2x p2xVar3 = (p2x) z46Var2.B();
            M.K(-1436405362);
            if (androidx.compose.runtime.b.d()) {
                wlp0Var = e2;
                z46Var = z46Var2;
                androidx.compose.runtime.b.f(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
            } else {
                wlp0Var = e2;
                z46Var = z46Var2;
            }
            int[] iArr = a.$EnumSwitchMapping$1;
            int i19 = iArr[p2xVar3.ordinal()];
            float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z5) {
                    f2 = 0.0f;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    Float valueOf = Float.valueOf(f2);
                    p2x p2xVar4 = (p2x) wlp0Var.f();
                    M.K(-1436405362);
                    if (androidx.compose.runtime.b.d()) {
                        f3 = valueOf;
                        j = b3;
                    } else {
                        f3 = valueOf;
                        j = b3;
                        androidx.compose.runtime.b.f(-1436405362, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)");
                    }
                    i5 = iArr[p2xVar4.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z5) {
                            f4 = 0.0f;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            Float valueOf2 = Float.valueOf(f4);
                            wlp0Var.e();
                            M.K(-709912974);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-709912974, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:390)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            wlp0 wlp0Var2 = wlp0Var;
                            wlp0.d c2 = ump0.c(wlp0Var2, f3, valueOf2, a3, jtp0Var, M, 196608);
                            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.FastEffects;
                            a2 = lb30.a(motionSchemeKeyTokens, M);
                            phr a4 = lb30.a(MotionSchemeKeyTokens.SlowEffects, M);
                            p2x p2xVar5 = (p2x) z46Var.B();
                            M.K(-1093194547);
                            boolean z7 = z5;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                            }
                            i6 = iArr[p2xVar5.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                f5 = 0.0f;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                M.j();
                                Float valueOf3 = Float.valueOf(f5);
                                p2x p2xVar6 = (p2x) wlp0Var2.f();
                                M.K(-1093194547);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1093194547, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)");
                                }
                                i7 = iArr[p2xVar6.ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        if (i7 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                    f6 = 0.0f;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    M.j();
                                    Float valueOf4 = Float.valueOf(f6);
                                    wlp0.b e3 = wlp0Var2.e();
                                    M.K(-984009111);
                                    if (androidx.compose.runtime.b.d()) {
                                        phrVar = a4;
                                        androidx.compose.runtime.b.f(-984009111, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:404)");
                                    } else {
                                        phrVar = a4;
                                    }
                                    p2x p2xVar7 = p2x.Focused;
                                    p2x p2xVar8 = p2x.UnfocusedEmpty;
                                    phr phrVar2 = (!e3.a(p2xVar7, p2xVar8) && (e3.a(p2xVar8, p2xVar7) || e3.a(p2x.UnfocusedNotEmpty, p2xVar8))) ? phrVar : a2;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    M.j();
                                    wlp0.d c3 = ump0.c(wlp0Var2, valueOf3, valueOf4, phrVar2, jtp0Var, M, 196608);
                                    p2x p2xVar9 = (p2x) z46Var.B();
                                    M.K(-1258455321);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                    }
                                    i8 = iArr[p2xVar9.ordinal()];
                                    if (i8 != 1) {
                                        if (i8 != 2) {
                                            if (i8 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else if (z7) {
                                            f7 = 0.0f;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            Float valueOf5 = Float.valueOf(f7);
                                            p2x p2xVar10 = (p2x) wlp0Var2.f();
                                            M.K(-1258455321);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-1258455321, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)");
                                            }
                                            i9 = iArr[p2xVar10.ordinal()];
                                            if (i9 != 1) {
                                                if (i9 != 2) {
                                                    if (i9 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                }
                                            }
                                            f8 = 1.0f;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            Float valueOf6 = Float.valueOf(f8);
                                            wlp0Var2.e();
                                            M.K(2126293195);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(2126293195, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:426)");
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            wlp0.d c4 = ump0.c(wlp0Var2, valueOf5, valueOf6, a2, jtp0Var, M, 196608);
                                            phr a5 = lb30.a(motionSchemeKeyTokens, M);
                                            p2x p2xVar11 = (p2x) wlp0Var2.f();
                                            M.K(-12973394);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                            }
                                            long j6 = iArr[p2xVar11.ordinal()] == 1 ? j : b4;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            d8g g2 = l5g.g(j6);
                                            J = M.J(g2);
                                            x = M.x();
                                            c0012a = a.C0011a.a;
                                            if (!J || x == c0012a) {
                                                x = (itp0) b9g.a.invoke(g2);
                                                M.R(x);
                                            }
                                            itp0 itp0Var = (itp0) x;
                                            p2xVar = (p2x) z46Var.B();
                                            M.K(-12973394);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                            }
                                            if (iArr[p2xVar.ordinal()] == 1) {
                                                nmo0Var = nmo0Var5;
                                                j2 = j;
                                            } else {
                                                nmo0Var = nmo0Var5;
                                                j2 = b4;
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            l5g c5 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
                                            p2x p2xVar12 = (p2x) wlp0Var2.f();
                                            M.K(-12973394);
                                            if (androidx.compose.runtime.b.d()) {
                                                l5gVar = c5;
                                                nmo0Var2 = nmo0Var;
                                                androidx.compose.runtime.b.f(-12973394, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)");
                                            } else {
                                                l5gVar = c5;
                                                nmo0Var2 = nmo0Var;
                                            }
                                            long j7 = iArr[p2xVar12.ordinal()] == 1 ? j : b4;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            l5g l5gVar2 = l5gVar;
                                            l5g l5gVar3 = new l5g(j7);
                                            wlp0Var2.e();
                                            M.K(1954111929);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1954111929, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            wlp0.d c6 = ump0.c(wlp0Var2, l5gVar2, l5gVar3, a5, itp0Var, M, 196608);
                                            M.K(-464752477);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            d8g g3 = l5g.g(j4);
                                            J2 = M.J(g3);
                                            x2 = M.x();
                                            if (!J2 || x2 == c0012a) {
                                                x2 = (itp0) b9g.a.invoke(g3);
                                                M.R(x2);
                                            }
                                            itp0 itp0Var2 = (itp0) x2;
                                            M.K(-464752477);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            l5g c7 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j4, M);
                                            M.K(-464752477);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-464752477, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)");
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            l5g l5gVar4 = new l5g(j4);
                                            wlp0Var2.e();
                                            M.K(1190923886);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1190923886, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:450)");
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            M.j();
                                            wlp0.d c8 = ump0.c(wlp0Var2, c7, l5gVar4, a5, itp0Var2, M, 196608);
                                            x3 = M.x();
                                            if (x3 == c0012a) {
                                                x3 = new ego0(c2);
                                                M.R(x3);
                                            }
                                            ego0 ego0Var = (ego0) x3;
                                            if (yzsVar == null) {
                                                M.K(-1891724857);
                                                M.j();
                                                dVar = c2;
                                                i10 = i16;
                                                jaiVar2 = null;
                                                nmo0Var3 = nmo0Var6;
                                                nmo0Var4 = nmo0Var2;
                                                i11 = 2;
                                            } else {
                                                M.K(-1891724856);
                                                i10 = i16;
                                                nmo0Var3 = nmo0Var6;
                                                nmo0 nmo0Var7 = nmo0Var2;
                                                i11 = 2;
                                                nmo0Var4 = nmo0Var7;
                                                dVar = c2;
                                                jai c9 = kai.c(-1076580032, new bgo0(nmo0Var7, nmo0Var3, c2, c8, z6, c6, yzsVar, ego0Var), M);
                                                M.j();
                                                jaiVar2 = c9;
                                            }
                                            if (z2) {
                                                mfo0Var2 = mfo0Var;
                                                j3 = z3 ? mfo0Var2.E : booleanValue ? mfo0Var2.B : mfo0Var2.C;
                                            } else {
                                                mfo0Var2 = mfo0Var;
                                                j3 = mfo0Var2.D;
                                            }
                                            x4 = M.x();
                                            if (x4 == c0012a) {
                                                x4 = bbk0.c(new x2j0(c3, 4), k0x.c);
                                                M.R(x4);
                                            }
                                            mtk0 mtk0Var = (mtk0) x4;
                                            if (wzsVar2 == null && charSequence.length() == 0 && ((Boolean) mtk0Var.getValue()).booleanValue()) {
                                                M.K(-1890614312);
                                                s890Var2 = s890Var;
                                                c0012a2 = c0012a;
                                                jaiVar3 = jaiVar2;
                                                mfo0Var3 = mfo0Var2;
                                                jaiVar4 = jaiVar;
                                                i14 = i11;
                                                long j8 = j3;
                                                i12 = i10;
                                                i13 = i17;
                                                jai c10 = kai.c(1405547205, new cgo0(c3, j8, nmo0Var4, wzsVar2), M);
                                                M.j();
                                                jaiVar5 = c10;
                                            } else {
                                                s890Var2 = s890Var;
                                                i12 = i10;
                                                c0012a2 = c0012a;
                                                jaiVar3 = jaiVar2;
                                                mfo0Var3 = mfo0Var2;
                                                i13 = i17;
                                                jaiVar4 = jaiVar;
                                                i14 = i11;
                                                M.K(-1890217110);
                                                M.j();
                                                jaiVar5 = null;
                                            }
                                            x5 = M.x();
                                            if (x5 == c0012a2) {
                                                x5 = bbk0.c(new h6m0(c4, 3), k0x.c);
                                                M.R(x5);
                                            }
                                            M.K(-1889500886);
                                            M.j();
                                            M.K(-1888924534);
                                            M.j();
                                            M.K(-1888749663);
                                            M.j();
                                            M.K(-1888469888);
                                            M.j();
                                            long j9 = !z2 ? mfo0Var3.H : z3 ? mfo0Var3.I : booleanValue ? mfo0Var3.F : mfo0Var3.G;
                                            if (wzsVar3 == null) {
                                                M.K(-1888176380);
                                                M.j();
                                                jaiVar6 = null;
                                            } else {
                                                M.K(-1888176379);
                                                jai c11 = kai.c(837168720, new dgo0(j9, nmo0Var3, wzsVar3), M);
                                                M.j();
                                                jaiVar6 = c11;
                                            }
                                            i15 = a.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                            if (i15 == 1) {
                                                M.K(-1887830698);
                                                jgo0.a(wzsVar, jaiVar3, jaiVar5, null, null, null, null, z, bVar, new b(new oaa(0, dVar, mtk0.class, "value", "getValue()Ljava/lang/Object;", 1)), kai.c(-1729858187, new zfo0(jaiVar), M), jaiVar6, s890Var, M, ((i12 >> 3) & 112) | 6 | ((i13 << 21) & 234881024) | ((i12 << 18) & 1879048192), ((i13 >> 6) & 7168) | 48);
                                                aVar2 = M;
                                                aVar2.j();
                                                s3q0 s3q0Var = s3q0.a;
                                            } else {
                                                if (i15 != i14) {
                                                    throw alb0.c(493292232, M);
                                                }
                                                M.K(-1886778186);
                                                Object x6 = M.x();
                                                if (x6 == c0012a2) {
                                                    x6 = androidx.compose.runtime.k.b(new mxj0(0L));
                                                    M.R(x6);
                                                }
                                                wh50 wh50Var = (wh50) x6;
                                                jai c12 = kai.c(528115858, new yfo0(wh50Var, bVar, s890Var2, jaiVar4), M);
                                                wlp0.d dVar2 = dVar;
                                                b bVar2 = new b(new wfo0(dVar, mtk0.class, "value", "getValue()Ljava/lang/Object;", 0));
                                                jai jaiVar7 = jaiVar5;
                                                boolean J3 = ((i12 & 7168) == 2048) | M.J(dVar2);
                                                Object x7 = M.x();
                                                if (J3 || x7 == c0012a2) {
                                                    x7 = new l2e(bVar, dVar2, wh50Var, 7);
                                                    M.R(x7);
                                                }
                                                aVar2 = M;
                                                h190.b(wzsVar, jaiVar7, jaiVar3, null, null, null, null, z, bVar, bVar2, (izs) x7, c12, jaiVar6, s890Var2, aVar2, ((i12 >> 3) & 112) | 6 | ((i13 << 21) & 234881024) | ((i12 << 18) & 1879048192), (57344 & (i13 >> 3)) | 384);
                                                aVar2.j();
                                                s3q0 s3q0Var2 = s3q0.a;
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        }
                                    }
                                    f7 = 1.0f;
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    Float valueOf52 = Float.valueOf(f7);
                                    p2x p2xVar102 = (p2x) wlp0Var2.f();
                                    M.K(-1258455321);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    i9 = iArr[p2xVar102.ordinal()];
                                    if (i9 != 1) {
                                    }
                                    f8 = 1.0f;
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    Float valueOf62 = Float.valueOf(f8);
                                    wlp0Var2.e();
                                    M.K(2126293195);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    wlp0.d c42 = ump0.c(wlp0Var2, valueOf52, valueOf62, a2, jtp0Var, M, 196608);
                                    phr a52 = lb30.a(motionSchemeKeyTokens, M);
                                    p2x p2xVar112 = (p2x) wlp0Var2.f();
                                    M.K(-12973394);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (iArr[p2xVar112.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    d8g g22 = l5g.g(j6);
                                    J = M.J(g22);
                                    x = M.x();
                                    c0012a = a.C0011a.a;
                                    if (!J) {
                                    }
                                    x = (itp0) b9g.a.invoke(g22);
                                    M.R(x);
                                    itp0 itp0Var3 = (itp0) x;
                                    p2xVar = (p2x) z46Var.B();
                                    M.K(-12973394);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (iArr[p2xVar.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    l5g c52 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
                                    p2x p2xVar122 = (p2x) wlp0Var2.f();
                                    M.K(-12973394);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (iArr[p2xVar122.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    l5g l5gVar22 = l5gVar;
                                    l5g l5gVar32 = new l5g(j7);
                                    wlp0Var2.e();
                                    M.K(1954111929);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    wlp0.d c62 = ump0.c(wlp0Var2, l5gVar22, l5gVar32, a52, itp0Var3, M, 196608);
                                    M.K(-464752477);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    d8g g32 = l5g.g(j4);
                                    J2 = M.J(g32);
                                    x2 = M.x();
                                    if (!J2) {
                                    }
                                    x2 = (itp0) b9g.a.invoke(g32);
                                    M.R(x2);
                                    itp0 itp0Var22 = (itp0) x2;
                                    M.K(-464752477);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    l5g c72 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j4, M);
                                    M.K(-464752477);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    l5g l5gVar42 = new l5g(j4);
                                    wlp0Var2.e();
                                    M.K(1190923886);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    wlp0.d c82 = ump0.c(wlp0Var2, c72, l5gVar42, a52, itp0Var22, M, 196608);
                                    x3 = M.x();
                                    if (x3 == c0012a) {
                                    }
                                    ego0 ego0Var2 = (ego0) x3;
                                    if (yzsVar == null) {
                                    }
                                    if (z2) {
                                    }
                                    x4 = M.x();
                                    if (x4 == c0012a) {
                                    }
                                    mtk0 mtk0Var2 = (mtk0) x4;
                                    if (wzsVar2 == null) {
                                    }
                                    s890Var2 = s890Var;
                                    i12 = i10;
                                    c0012a2 = c0012a;
                                    jaiVar3 = jaiVar2;
                                    mfo0Var3 = mfo0Var2;
                                    i13 = i17;
                                    jaiVar4 = jaiVar;
                                    i14 = i11;
                                    M.K(-1890217110);
                                    M.j();
                                    jaiVar5 = null;
                                    x5 = M.x();
                                    if (x5 == c0012a2) {
                                    }
                                    M.K(-1889500886);
                                    M.j();
                                    M.K(-1888924534);
                                    M.j();
                                    M.K(-1888749663);
                                    M.j();
                                    M.K(-1888469888);
                                    M.j();
                                    if (!z2) {
                                    }
                                    if (wzsVar3 == null) {
                                    }
                                    i15 = a.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                    if (i15 == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                }
                                f6 = 1.0f;
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                Float valueOf42 = Float.valueOf(f6);
                                wlp0.b e32 = wlp0Var2.e();
                                M.K(-984009111);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                p2x p2xVar72 = p2x.Focused;
                                p2x p2xVar82 = p2x.UnfocusedEmpty;
                                if (e32.a(p2xVar72, p2xVar82)) {
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    wlp0.d c32 = ump0.c(wlp0Var2, valueOf3, valueOf42, phrVar2, jtp0Var, M, 196608);
                                    p2x p2xVar92 = (p2x) z46Var.B();
                                    M.K(-1258455321);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    i8 = iArr[p2xVar92.ordinal()];
                                    if (i8 != 1) {
                                    }
                                    f7 = 1.0f;
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    Float valueOf522 = Float.valueOf(f7);
                                    p2x p2xVar1022 = (p2x) wlp0Var2.f();
                                    M.K(-1258455321);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    i9 = iArr[p2xVar1022.ordinal()];
                                    if (i9 != 1) {
                                    }
                                    f8 = 1.0f;
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    Float valueOf622 = Float.valueOf(f8);
                                    wlp0Var2.e();
                                    M.K(2126293195);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    wlp0.d c422 = ump0.c(wlp0Var2, valueOf522, valueOf622, a2, jtp0Var, M, 196608);
                                    phr a522 = lb30.a(motionSchemeKeyTokens, M);
                                    p2x p2xVar1122 = (p2x) wlp0Var2.f();
                                    M.K(-12973394);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (iArr[p2xVar1122.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    d8g g222 = l5g.g(j6);
                                    J = M.J(g222);
                                    x = M.x();
                                    c0012a = a.C0011a.a;
                                    if (!J) {
                                    }
                                    x = (itp0) b9g.a.invoke(g222);
                                    M.R(x);
                                    itp0 itp0Var32 = (itp0) x;
                                    p2xVar = (p2x) z46Var.B();
                                    M.K(-12973394);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (iArr[p2xVar.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    l5g c522 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
                                    p2x p2xVar1222 = (p2x) wlp0Var2.f();
                                    M.K(-12973394);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (iArr[p2xVar1222.ordinal()] == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    l5g l5gVar222 = l5gVar;
                                    l5g l5gVar322 = new l5g(j7);
                                    wlp0Var2.e();
                                    M.K(1954111929);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    wlp0.d c622 = ump0.c(wlp0Var2, l5gVar222, l5gVar322, a522, itp0Var32, M, 196608);
                                    M.K(-464752477);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    d8g g322 = l5g.g(j4);
                                    J2 = M.J(g322);
                                    x2 = M.x();
                                    if (!J2) {
                                    }
                                    x2 = (itp0) b9g.a.invoke(g322);
                                    M.R(x2);
                                    itp0 itp0Var222 = (itp0) x2;
                                    M.K(-464752477);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    l5g c722 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j4, M);
                                    M.K(-464752477);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    l5g l5gVar422 = new l5g(j4);
                                    wlp0Var2.e();
                                    M.K(1190923886);
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                    M.j();
                                    wlp0.d c822 = ump0.c(wlp0Var2, c722, l5gVar422, a522, itp0Var222, M, 196608);
                                    x3 = M.x();
                                    if (x3 == c0012a) {
                                    }
                                    ego0 ego0Var22 = (ego0) x3;
                                    if (yzsVar == null) {
                                    }
                                    if (z2) {
                                    }
                                    x4 = M.x();
                                    if (x4 == c0012a) {
                                    }
                                    mtk0 mtk0Var22 = (mtk0) x4;
                                    if (wzsVar2 == null) {
                                    }
                                    s890Var2 = s890Var;
                                    i12 = i10;
                                    c0012a2 = c0012a;
                                    jaiVar3 = jaiVar2;
                                    mfo0Var3 = mfo0Var2;
                                    i13 = i17;
                                    jaiVar4 = jaiVar;
                                    i14 = i11;
                                    M.K(-1890217110);
                                    M.j();
                                    jaiVar5 = null;
                                    x5 = M.x();
                                    if (x5 == c0012a2) {
                                    }
                                    M.K(-1889500886);
                                    M.j();
                                    M.K(-1888924534);
                                    M.j();
                                    M.K(-1888749663);
                                    M.j();
                                    M.K(-1888469888);
                                    M.j();
                                    if (!z2) {
                                    }
                                    if (wzsVar3 == null) {
                                    }
                                    i15 = a.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                    if (i15 == 1) {
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                    }
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                wlp0.d c322 = ump0.c(wlp0Var2, valueOf3, valueOf42, phrVar2, jtp0Var, M, 196608);
                                p2x p2xVar922 = (p2x) z46Var.B();
                                M.K(-1258455321);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                i8 = iArr[p2xVar922.ordinal()];
                                if (i8 != 1) {
                                }
                                f7 = 1.0f;
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                Float valueOf5222 = Float.valueOf(f7);
                                p2x p2xVar10222 = (p2x) wlp0Var2.f();
                                M.K(-1258455321);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                i9 = iArr[p2xVar10222.ordinal()];
                                if (i9 != 1) {
                                }
                                f8 = 1.0f;
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                Float valueOf6222 = Float.valueOf(f8);
                                wlp0Var2.e();
                                M.K(2126293195);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                wlp0.d c4222 = ump0.c(wlp0Var2, valueOf5222, valueOf6222, a2, jtp0Var, M, 196608);
                                phr a5222 = lb30.a(motionSchemeKeyTokens, M);
                                p2x p2xVar11222 = (p2x) wlp0Var2.f();
                                M.K(-12973394);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (iArr[p2xVar11222.ordinal()] == 1) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                d8g g2222 = l5g.g(j6);
                                J = M.J(g2222);
                                x = M.x();
                                c0012a = a.C0011a.a;
                                if (!J) {
                                }
                                x = (itp0) b9g.a.invoke(g2222);
                                M.R(x);
                                itp0 itp0Var322 = (itp0) x;
                                p2xVar = (p2x) z46Var.B();
                                M.K(-12973394);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (iArr[p2xVar.ordinal()] == 1) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                l5g c5222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
                                p2x p2xVar12222 = (p2x) wlp0Var2.f();
                                M.K(-12973394);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (iArr[p2xVar12222.ordinal()] == 1) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                l5g l5gVar2222 = l5gVar;
                                l5g l5gVar3222 = new l5g(j7);
                                wlp0Var2.e();
                                M.K(1954111929);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                wlp0.d c6222 = ump0.c(wlp0Var2, l5gVar2222, l5gVar3222, a5222, itp0Var322, M, 196608);
                                M.K(-464752477);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                d8g g3222 = l5g.g(j4);
                                J2 = M.J(g3222);
                                x2 = M.x();
                                if (!J2) {
                                }
                                x2 = (itp0) b9g.a.invoke(g3222);
                                M.R(x2);
                                itp0 itp0Var2222 = (itp0) x2;
                                M.K(-464752477);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                l5g c7222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j4, M);
                                M.K(-464752477);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                l5g l5gVar4222 = new l5g(j4);
                                wlp0Var2.e();
                                M.K(1190923886);
                                if (androidx.compose.runtime.b.d()) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                                M.j();
                                wlp0.d c8222 = ump0.c(wlp0Var2, c7222, l5gVar4222, a5222, itp0Var2222, M, 196608);
                                x3 = M.x();
                                if (x3 == c0012a) {
                                }
                                ego0 ego0Var222 = (ego0) x3;
                                if (yzsVar == null) {
                                }
                                if (z2) {
                                }
                                x4 = M.x();
                                if (x4 == c0012a) {
                                }
                                mtk0 mtk0Var222 = (mtk0) x4;
                                if (wzsVar2 == null) {
                                }
                                s890Var2 = s890Var;
                                i12 = i10;
                                c0012a2 = c0012a;
                                jaiVar3 = jaiVar2;
                                mfo0Var3 = mfo0Var2;
                                i13 = i17;
                                jaiVar4 = jaiVar;
                                i14 = i11;
                                M.K(-1890217110);
                                M.j();
                                jaiVar5 = null;
                                x5 = M.x();
                                if (x5 == c0012a2) {
                                }
                                M.K(-1889500886);
                                M.j();
                                M.K(-1888924534);
                                M.j();
                                M.K(-1888749663);
                                M.j();
                                M.K(-1888469888);
                                M.j();
                                if (!z2) {
                                }
                                if (wzsVar3 == null) {
                                }
                                i15 = a.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                if (i15 == 1) {
                                }
                                if (androidx.compose.runtime.b.d()) {
                                }
                            }
                            f5 = 1.0f;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            Float valueOf32 = Float.valueOf(f5);
                            p2x p2xVar62 = (p2x) wlp0Var2.f();
                            M.K(-1093194547);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            i7 = iArr[p2xVar62.ordinal()];
                            if (i7 != 1) {
                            }
                            f6 = 1.0f;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            Float valueOf422 = Float.valueOf(f6);
                            wlp0.b e322 = wlp0Var2.e();
                            M.K(-984009111);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            p2x p2xVar722 = p2x.Focused;
                            p2x p2xVar822 = p2x.UnfocusedEmpty;
                            if (e322.a(p2xVar722, p2xVar822)) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            wlp0.d c3222 = ump0.c(wlp0Var2, valueOf32, valueOf422, phrVar2, jtp0Var, M, 196608);
                            p2x p2xVar9222 = (p2x) z46Var.B();
                            M.K(-1258455321);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            i8 = iArr[p2xVar9222.ordinal()];
                            if (i8 != 1) {
                            }
                            f7 = 1.0f;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            Float valueOf52222 = Float.valueOf(f7);
                            p2x p2xVar102222 = (p2x) wlp0Var2.f();
                            M.K(-1258455321);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            i9 = iArr[p2xVar102222.ordinal()];
                            if (i9 != 1) {
                            }
                            f8 = 1.0f;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            Float valueOf62222 = Float.valueOf(f8);
                            wlp0Var2.e();
                            M.K(2126293195);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            wlp0.d c42222 = ump0.c(wlp0Var2, valueOf52222, valueOf62222, a2, jtp0Var, M, 196608);
                            phr a52222 = lb30.a(motionSchemeKeyTokens, M);
                            p2x p2xVar112222 = (p2x) wlp0Var2.f();
                            M.K(-12973394);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (iArr[p2xVar112222.ordinal()] == 1) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            d8g g22222 = l5g.g(j6);
                            J = M.J(g22222);
                            x = M.x();
                            c0012a = a.C0011a.a;
                            if (!J) {
                            }
                            x = (itp0) b9g.a.invoke(g22222);
                            M.R(x);
                            itp0 itp0Var3222 = (itp0) x;
                            p2xVar = (p2x) z46Var.B();
                            M.K(-12973394);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (iArr[p2xVar.ordinal()] == 1) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            l5g c52222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
                            p2x p2xVar122222 = (p2x) wlp0Var2.f();
                            M.K(-12973394);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (iArr[p2xVar122222.ordinal()] == 1) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            l5g l5gVar22222 = l5gVar;
                            l5g l5gVar32222 = new l5g(j7);
                            wlp0Var2.e();
                            M.K(1954111929);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            wlp0.d c62222 = ump0.c(wlp0Var2, l5gVar22222, l5gVar32222, a52222, itp0Var3222, M, 196608);
                            M.K(-464752477);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            d8g g32222 = l5g.g(j4);
                            J2 = M.J(g32222);
                            x2 = M.x();
                            if (!J2) {
                            }
                            x2 = (itp0) b9g.a.invoke(g32222);
                            M.R(x2);
                            itp0 itp0Var22222 = (itp0) x2;
                            M.K(-464752477);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            l5g c72222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j4, M);
                            M.K(-464752477);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            l5g l5gVar42222 = new l5g(j4);
                            wlp0Var2.e();
                            M.K(1190923886);
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            M.j();
                            wlp0.d c82222 = ump0.c(wlp0Var2, c72222, l5gVar42222, a52222, itp0Var22222, M, 196608);
                            x3 = M.x();
                            if (x3 == c0012a) {
                            }
                            ego0 ego0Var2222 = (ego0) x3;
                            if (yzsVar == null) {
                            }
                            if (z2) {
                            }
                            x4 = M.x();
                            if (x4 == c0012a) {
                            }
                            mtk0 mtk0Var2222 = (mtk0) x4;
                            if (wzsVar2 == null) {
                            }
                            s890Var2 = s890Var;
                            i12 = i10;
                            c0012a2 = c0012a;
                            jaiVar3 = jaiVar2;
                            mfo0Var3 = mfo0Var2;
                            i13 = i17;
                            jaiVar4 = jaiVar;
                            i14 = i11;
                            M.K(-1890217110);
                            M.j();
                            jaiVar5 = null;
                            x5 = M.x();
                            if (x5 == c0012a2) {
                            }
                            M.K(-1889500886);
                            M.j();
                            M.K(-1888924534);
                            M.j();
                            M.K(-1888749663);
                            M.j();
                            M.K(-1888469888);
                            M.j();
                            if (!z2) {
                            }
                            if (wzsVar3 == null) {
                            }
                            i15 = a.$EnumSwitchMapping$0[textFieldType.ordinal()];
                            if (i15 == 1) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                        }
                    }
                    f4 = 1.0f;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    Float valueOf22 = Float.valueOf(f4);
                    wlp0Var.e();
                    M.K(-709912974);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    wlp0 wlp0Var22 = wlp0Var;
                    wlp0.d c22 = ump0.c(wlp0Var22, f3, valueOf22, a3, jtp0Var, M, 196608);
                    MotionSchemeKeyTokens motionSchemeKeyTokens2 = MotionSchemeKeyTokens.FastEffects;
                    a2 = lb30.a(motionSchemeKeyTokens2, M);
                    phr a42 = lb30.a(MotionSchemeKeyTokens.SlowEffects, M);
                    p2x p2xVar52 = (p2x) z46Var.B();
                    M.K(-1093194547);
                    boolean z72 = z5;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    i6 = iArr[p2xVar52.ordinal()];
                    if (i6 != 1) {
                    }
                    f5 = 1.0f;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    Float valueOf322 = Float.valueOf(f5);
                    p2x p2xVar622 = (p2x) wlp0Var22.f();
                    M.K(-1093194547);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    i7 = iArr[p2xVar622.ordinal()];
                    if (i7 != 1) {
                    }
                    f6 = 1.0f;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    Float valueOf4222 = Float.valueOf(f6);
                    wlp0.b e3222 = wlp0Var22.e();
                    M.K(-984009111);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    p2x p2xVar7222 = p2x.Focused;
                    p2x p2xVar8222 = p2x.UnfocusedEmpty;
                    if (e3222.a(p2xVar7222, p2xVar8222)) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    wlp0.d c32222 = ump0.c(wlp0Var22, valueOf322, valueOf4222, phrVar2, jtp0Var, M, 196608);
                    p2x p2xVar92222 = (p2x) z46Var.B();
                    M.K(-1258455321);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    i8 = iArr[p2xVar92222.ordinal()];
                    if (i8 != 1) {
                    }
                    f7 = 1.0f;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    Float valueOf522222 = Float.valueOf(f7);
                    p2x p2xVar1022222 = (p2x) wlp0Var22.f();
                    M.K(-1258455321);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    i9 = iArr[p2xVar1022222.ordinal()];
                    if (i9 != 1) {
                    }
                    f8 = 1.0f;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    Float valueOf622222 = Float.valueOf(f8);
                    wlp0Var22.e();
                    M.K(2126293195);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    wlp0.d c422222 = ump0.c(wlp0Var22, valueOf522222, valueOf622222, a2, jtp0Var, M, 196608);
                    phr a522222 = lb30.a(motionSchemeKeyTokens2, M);
                    p2x p2xVar1122222 = (p2x) wlp0Var22.f();
                    M.K(-12973394);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (iArr[p2xVar1122222.ordinal()] == 1) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    d8g g222222 = l5g.g(j6);
                    J = M.J(g222222);
                    x = M.x();
                    c0012a = a.C0011a.a;
                    if (!J) {
                    }
                    x = (itp0) b9g.a.invoke(g222222);
                    M.R(x);
                    itp0 itp0Var32222 = (itp0) x;
                    p2xVar = (p2x) z46Var.B();
                    M.K(-12973394);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (iArr[p2xVar.ordinal()] == 1) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    l5g c522222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
                    p2x p2xVar1222222 = (p2x) wlp0Var22.f();
                    M.K(-12973394);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (iArr[p2xVar1222222.ordinal()] == 1) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    l5g l5gVar222222 = l5gVar;
                    l5g l5gVar322222 = new l5g(j7);
                    wlp0Var22.e();
                    M.K(1954111929);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    wlp0.d c622222 = ump0.c(wlp0Var22, l5gVar222222, l5gVar322222, a522222, itp0Var32222, M, 196608);
                    M.K(-464752477);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    d8g g322222 = l5g.g(j4);
                    J2 = M.J(g322222);
                    x2 = M.x();
                    if (!J2) {
                    }
                    x2 = (itp0) b9g.a.invoke(g322222);
                    M.R(x2);
                    itp0 itp0Var222222 = (itp0) x2;
                    M.K(-464752477);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    l5g c722222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j4, M);
                    M.K(-464752477);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    l5g l5gVar422222 = new l5g(j4);
                    wlp0Var22.e();
                    M.K(1190923886);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    wlp0.d c822222 = ump0.c(wlp0Var22, c722222, l5gVar422222, a522222, itp0Var222222, M, 196608);
                    x3 = M.x();
                    if (x3 == c0012a) {
                    }
                    ego0 ego0Var22222 = (ego0) x3;
                    if (yzsVar == null) {
                    }
                    if (z2) {
                    }
                    x4 = M.x();
                    if (x4 == c0012a) {
                    }
                    mtk0 mtk0Var22222 = (mtk0) x4;
                    if (wzsVar2 == null) {
                    }
                    s890Var2 = s890Var;
                    i12 = i10;
                    c0012a2 = c0012a;
                    jaiVar3 = jaiVar2;
                    mfo0Var3 = mfo0Var2;
                    i13 = i17;
                    jaiVar4 = jaiVar;
                    i14 = i11;
                    M.K(-1890217110);
                    M.j();
                    jaiVar5 = null;
                    x5 = M.x();
                    if (x5 == c0012a2) {
                    }
                    M.K(-1889500886);
                    M.j();
                    M.K(-1888924534);
                    M.j();
                    M.K(-1888749663);
                    M.j();
                    M.K(-1888469888);
                    M.j();
                    if (!z2) {
                    }
                    if (wzsVar3 == null) {
                    }
                    i15 = a.$EnumSwitchMapping$0[textFieldType.ordinal()];
                    if (i15 == 1) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                }
            }
            f2 = 1.0f;
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            Float valueOf7 = Float.valueOf(f2);
            p2x p2xVar42 = (p2x) wlp0Var.f();
            M.K(-1436405362);
            if (androidx.compose.runtime.b.d()) {
            }
            i5 = iArr[p2xVar42.ordinal()];
            if (i5 != 1) {
            }
            f4 = 1.0f;
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            Float valueOf222 = Float.valueOf(f4);
            wlp0Var.e();
            M.K(-709912974);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            wlp0 wlp0Var222 = wlp0Var;
            wlp0.d c222 = ump0.c(wlp0Var222, f3, valueOf222, a3, jtp0Var, M, 196608);
            MotionSchemeKeyTokens motionSchemeKeyTokens22 = MotionSchemeKeyTokens.FastEffects;
            a2 = lb30.a(motionSchemeKeyTokens22, M);
            phr a422 = lb30.a(MotionSchemeKeyTokens.SlowEffects, M);
            p2x p2xVar522 = (p2x) z46Var.B();
            M.K(-1093194547);
            boolean z722 = z5;
            if (androidx.compose.runtime.b.d()) {
            }
            i6 = iArr[p2xVar522.ordinal()];
            if (i6 != 1) {
            }
            f5 = 1.0f;
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            Float valueOf3222 = Float.valueOf(f5);
            p2x p2xVar6222 = (p2x) wlp0Var222.f();
            M.K(-1093194547);
            if (androidx.compose.runtime.b.d()) {
            }
            i7 = iArr[p2xVar6222.ordinal()];
            if (i7 != 1) {
            }
            f6 = 1.0f;
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            Float valueOf42222 = Float.valueOf(f6);
            wlp0.b e32222 = wlp0Var222.e();
            M.K(-984009111);
            if (androidx.compose.runtime.b.d()) {
            }
            p2x p2xVar72222 = p2x.Focused;
            p2x p2xVar82222 = p2x.UnfocusedEmpty;
            if (e32222.a(p2xVar72222, p2xVar82222)) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            wlp0.d c322222 = ump0.c(wlp0Var222, valueOf3222, valueOf42222, phrVar2, jtp0Var, M, 196608);
            p2x p2xVar922222 = (p2x) z46Var.B();
            M.K(-1258455321);
            if (androidx.compose.runtime.b.d()) {
            }
            i8 = iArr[p2xVar922222.ordinal()];
            if (i8 != 1) {
            }
            f7 = 1.0f;
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            Float valueOf5222222 = Float.valueOf(f7);
            p2x p2xVar10222222 = (p2x) wlp0Var222.f();
            M.K(-1258455321);
            if (androidx.compose.runtime.b.d()) {
            }
            i9 = iArr[p2xVar10222222.ordinal()];
            if (i9 != 1) {
            }
            f8 = 1.0f;
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            Float valueOf6222222 = Float.valueOf(f8);
            wlp0Var222.e();
            M.K(2126293195);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            wlp0.d c4222222 = ump0.c(wlp0Var222, valueOf5222222, valueOf6222222, a2, jtp0Var, M, 196608);
            phr a5222222 = lb30.a(motionSchemeKeyTokens22, M);
            p2x p2xVar11222222 = (p2x) wlp0Var222.f();
            M.K(-12973394);
            if (androidx.compose.runtime.b.d()) {
            }
            if (iArr[p2xVar11222222.ordinal()] == 1) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            d8g g2222222 = l5g.g(j6);
            J = M.J(g2222222);
            x = M.x();
            c0012a = a.C0011a.a;
            if (!J) {
            }
            x = (itp0) b9g.a.invoke(g2222222);
            M.R(x);
            itp0 itp0Var322222 = (itp0) x;
            p2xVar = (p2x) z46Var.B();
            M.K(-12973394);
            if (androidx.compose.runtime.b.d()) {
            }
            if (iArr[p2xVar.ordinal()] == 1) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            l5g c5222222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j2, M);
            p2x p2xVar12222222 = (p2x) wlp0Var222.f();
            M.K(-12973394);
            if (androidx.compose.runtime.b.d()) {
            }
            if (iArr[p2xVar12222222.ordinal()] == 1) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            l5g l5gVar2222222 = l5gVar;
            l5g l5gVar3222222 = new l5g(j7);
            wlp0Var222.e();
            M.K(1954111929);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            wlp0.d c6222222 = ump0.c(wlp0Var222, l5gVar2222222, l5gVar3222222, a5222222, itp0Var322222, M, 196608);
            M.K(-464752477);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            d8g g3222222 = l5g.g(j4);
            J2 = M.J(g3222222);
            x2 = M.x();
            if (!J2) {
            }
            x2 = (itp0) b9g.a.invoke(g3222222);
            M.R(x2);
            itp0 itp0Var2222222 = (itp0) x2;
            M.K(-464752477);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            l5g c7222222 = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j4, M);
            M.K(-464752477);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            l5g l5gVar4222222 = new l5g(j4);
            wlp0Var222.e();
            M.K(1190923886);
            if (androidx.compose.runtime.b.d()) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            M.j();
            wlp0.d c8222222 = ump0.c(wlp0Var222, c7222222, l5gVar4222222, a5222222, itp0Var2222222, M, 196608);
            x3 = M.x();
            if (x3 == c0012a) {
            }
            ego0 ego0Var222222 = (ego0) x3;
            if (yzsVar == null) {
            }
            if (z2) {
            }
            x4 = M.x();
            if (x4 == c0012a) {
            }
            mtk0 mtk0Var222222 = (mtk0) x4;
            if (wzsVar2 == null) {
            }
            s890Var2 = s890Var;
            i12 = i10;
            c0012a2 = c0012a;
            jaiVar3 = jaiVar2;
            mfo0Var3 = mfo0Var2;
            i13 = i17;
            jaiVar4 = jaiVar;
            i14 = i11;
            M.K(-1890217110);
            M.j();
            jaiVar5 = null;
            x5 = M.x();
            if (x5 == c0012a2) {
            }
            M.K(-1889500886);
            M.j();
            M.K(-1888924534);
            M.j();
            M.K(-1888749663);
            M.j();
            M.K(-1888469888);
            M.j();
            if (!z2) {
            }
            if (wzsVar3 == null) {
            }
            i15 = a.$EnumSwitchMapping$0[textFieldType.ordinal()];
            if (i15 == 1) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ufo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    fgo0.a(TextFieldType.this, charSequence, wzsVar, bVar, yzsVar, wzsVar2, wzsVar3, z, z2, z3, waxVar, s890Var, mfo0Var, jaiVar, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(long j, nmo0 nmo0Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, int i) {
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar2;
        nmo0 nmo0Var2;
        long j2;
        androidx.compose.runtime.a M = aVar.M(396611577);
        int i2 = (M.p(j) ? 4 : 2) | i | (M.J(nmo0Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.y(wzsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(396611577, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:325)");
            }
            po40.d(j, nmo0Var, wzsVar, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            j2 = j;
            nmo0Var2 = nmo0Var;
            wzsVar2 = wzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            wzsVar2 = wzsVar;
            nmo0Var2 = nmo0Var;
            j2 = j;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u5g(j2, nmo0Var2, wzsVar2, i);
        }
    }

    public static final dt1.b c(kgo0.b bVar) {
        if (bVar != null) {
            return bVar.b;
        }
        throw new IllegalArgumentException("Unknown position: " + bVar);
    }

    public static final dt1.b d(kgo0 kgo0Var) {
        if (kgo0Var instanceof kgo0.a) {
            return ((kgo0.a) kgo0Var).a;
        }
        if (kgo0Var instanceof kgo0.b) {
            return ((kgo0.b) kgo0Var).a;
        }
        throw new IllegalArgumentException("Unknown position: " + kgo0Var);
    }

    public static final float e(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1251545215, 0, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:527)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-942794935, 6, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:129)");
        }
        xup0 xup0Var = (xup0) aVar.r(evp0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = xup0Var.l.b.c;
        long j2 = wtp0.l;
        if (!fno0.e(j)) {
            j = j2;
        }
        float O0 = ((azl) aVar.r(uvi.h)).O0(j) / 2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return O0;
    }

    public static final float f(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1986450462, 0, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:520)");
        }
        float f2 = ((pco) aVar.r(zax.c)).b;
        if (Float.isNaN(f2)) {
            f2 = 0;
        }
        float f3 = (f2 - i3k0.d) / 2;
        float f4 = 0;
        if (f3 < f4) {
            f3 = f4;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f3;
    }
}
