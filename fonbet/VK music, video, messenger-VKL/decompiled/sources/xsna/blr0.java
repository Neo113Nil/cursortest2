package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* compiled from: VectorCompose.kt */
/* loaded from: classes11.dex */
public final class blr0 {

    /* compiled from: VectorCompose.kt */
    public static final class a extends Lambda implements gzs<nju> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final nju invoke() {
            return new nju();
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class a0 extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ yk8 $fill;
        final /* synthetic */ float $fillAlpha;
        final /* synthetic */ String $name;
        final /* synthetic */ List<qq90> $pathData;
        final /* synthetic */ int $pathFillType;
        final /* synthetic */ yk8 $stroke;
        final /* synthetic */ float $strokeAlpha;
        final /* synthetic */ int $strokeLineCap;
        final /* synthetic */ int $strokeLineJoin;
        final /* synthetic */ float $strokeLineMiter;
        final /* synthetic */ float $strokeLineWidth;
        final /* synthetic */ float $trimPathEnd;
        final /* synthetic */ float $trimPathOffset;
        final /* synthetic */ float $trimPathStart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a0(List<? extends qq90> list, int i, String str, yk8 yk8Var, float f, yk8 yk8Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, int i5, int i6) {
            super(2);
            this.$pathData = list;
            this.$pathFillType = i;
            this.$name = str;
            this.$fill = yk8Var;
            this.$fillAlpha = f;
            this.$stroke = yk8Var2;
            this.$strokeAlpha = f2;
            this.$strokeLineWidth = f3;
            this.$strokeLineCap = i2;
            this.$strokeLineJoin = i3;
            this.$strokeLineMiter = f4;
            this.$trimPathStart = f5;
            this.$trimPathEnd = f6;
            this.$trimPathOffset = f7;
            this.$$changed = i4;
            this.$$changed1 = i5;
            this.$$default = i6;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            blr0.b(this.$pathData, this.$pathFillType, this.$name, this.$fill, this.$fillAlpha, this.$stroke, this.$strokeAlpha, this.$strokeLineWidth, this.$strokeLineCap, this.$strokeLineJoin, this.$strokeLineMiter, this.$trimPathStart, this.$trimPathEnd, this.$trimPathOffset, aVar, ne7.I(this.$$changed | 1), ne7.I(this.$$changed1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class b extends Lambda implements wzs<nju, String, s3q0> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, String str) {
            nju njuVar2 = njuVar;
            njuVar2.k = str;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class c extends Lambda implements wzs<nju, Float, s3q0> {
        public static final c i = new c(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, Float f) {
            nju njuVar2 = njuVar;
            njuVar2.l = f.floatValue();
            njuVar2.s = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class d extends Lambda implements wzs<nju, Float, s3q0> {
        public static final d i = new d(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, Float f) {
            nju njuVar2 = njuVar;
            njuVar2.m = f.floatValue();
            njuVar2.s = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class e extends Lambda implements wzs<nju, Float, s3q0> {
        public static final e i = new e(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, Float f) {
            nju njuVar2 = njuVar;
            njuVar2.n = f.floatValue();
            njuVar2.s = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class f extends Lambda implements wzs<nju, Float, s3q0> {
        public static final f i = new f(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, Float f) {
            nju njuVar2 = njuVar;
            njuVar2.o = f.floatValue();
            njuVar2.s = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class g extends Lambda implements wzs<nju, Float, s3q0> {
        public static final g i = new g(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, Float f) {
            nju njuVar2 = njuVar;
            njuVar2.p = f.floatValue();
            njuVar2.s = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class h extends Lambda implements wzs<nju, Float, s3q0> {
        public static final h i = new h(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, Float f) {
            nju njuVar2 = njuVar;
            njuVar2.q = f.floatValue();
            njuVar2.s = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class i extends Lambda implements wzs<nju, Float, s3q0> {
        public static final i i = new i(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, Float f) {
            nju njuVar2 = njuVar;
            njuVar2.r = f.floatValue();
            njuVar2.s = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class j extends Lambda implements wzs<nju, List<? extends qq90>, s3q0> {
        public static final j i = new j(2);

        @Override // xsna.wzs
        public final s3q0 invoke(nju njuVar, List<? extends qq90> list) {
            nju njuVar2 = njuVar;
            njuVar2.f = list;
            njuVar2.g = true;
            njuVar2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class k extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ List<qq90> $clipPathData;
        final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ String $name;
        final /* synthetic */ float $pivotX;
        final /* synthetic */ float $pivotY;
        final /* synthetic */ float $rotation;
        final /* synthetic */ float $scaleX;
        final /* synthetic */ float $scaleY;
        final /* synthetic */ float $translationX;
        final /* synthetic */ float $translationY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends qq90> list, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, int i, int i2) {
            super(2);
            this.$name = str;
            this.$rotation = f;
            this.$pivotX = f2;
            this.$pivotY = f3;
            this.$scaleX = f4;
            this.$scaleY = f5;
            this.$translationX = f6;
            this.$translationY = f7;
            this.$clipPathData = list;
            this.$content = wzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            blr0.a(this.$name, this.$rotation, this.$pivotX, this.$pivotY, this.$scaleX, this.$scaleY, this.$translationX, this.$translationY, this.$clipPathData, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class l extends Lambda implements gzs<fq90> {
        public static final l i = new l(0);

        @Override // xsna.gzs
        public final fq90 invoke() {
            return new fq90();
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class m extends Lambda implements wzs<fq90, hrm0, s3q0> {
        public static final m i = new m(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, hrm0 hrm0Var) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.h = hrm0Var.a;
            fq90Var2.o = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class n extends Lambda implements wzs<fq90, Float, s3q0> {
        public static final n i = new n(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, Float f) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.j = f.floatValue();
            fq90Var2.o = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class o extends Lambda implements wzs<fq90, Float, s3q0> {
        public static final o i = new o(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, Float f) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.k = f.floatValue();
            fq90Var2.p = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class p extends Lambda implements wzs<fq90, Float, s3q0> {
        public static final p i = new p(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, Float f) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.l = f.floatValue();
            fq90Var2.p = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class q extends Lambda implements wzs<fq90, Float, s3q0> {
        public static final q i = new q(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, Float f) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.m = f.floatValue();
            fq90Var2.p = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class r extends Lambda implements wzs<fq90, String, s3q0> {
        public static final r i = new r(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, String str) {
            fq90Var.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class s extends Lambda implements wzs<fq90, List<? extends qq90>, s3q0> {
        public static final s i = new s(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, List<? extends qq90> list) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.d = list;
            fq90Var2.n = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class t extends Lambda implements wzs<fq90, kq90, s3q0> {
        public static final t i = new t(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, kq90 kq90Var) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.s.l(kq90Var.a);
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class u extends Lambda implements wzs<fq90, yk8, s3q0> {
        public static final u i = new u(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, yk8 yk8Var) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.b = yk8Var;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class v extends Lambda implements wzs<fq90, Float, s3q0> {
        public static final v i = new v(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, Float f) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.c = f.floatValue();
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class w extends Lambda implements wzs<fq90, yk8, s3q0> {
        public static final w i = new w(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, yk8 yk8Var) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.g = yk8Var;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class x extends Lambda implements wzs<fq90, Float, s3q0> {
        public static final x i = new x(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, Float f) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.e = f.floatValue();
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class y extends Lambda implements wzs<fq90, Float, s3q0> {
        public static final y i = new y(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, Float f) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.f = f.floatValue();
            fq90Var2.o = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* compiled from: VectorCompose.kt */
    public static final class z extends Lambda implements wzs<fq90, krm0, s3q0> {
        public static final z i = new z(2);

        @Override // xsna.wzs
        public final s3q0 invoke(fq90 fq90Var, krm0 krm0Var) {
            fq90 fq90Var2 = fq90Var;
            fq90Var2.i = krm0Var.a;
            fq90Var2.o = true;
            fq90Var2.c();
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends qq90> list, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        String str2;
        int i4;
        float f9;
        int i5;
        float f10;
        int i6;
        float f11;
        int i7;
        float f12;
        int i8;
        int i9;
        int i10;
        int i11;
        float f13;
        float f14;
        List<? extends qq90> list2;
        float f15;
        float f16;
        androidx.compose.runtime.f s2;
        float f17;
        float f18;
        float f19;
        Object x2;
        int i12;
        androidx.compose.runtime.a M = aVar.M(-1851426205);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i2 | 6;
            str2 = str;
        } else if ((i2 & 6) == 0) {
            str2 = str;
            i4 = (M.J(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            f9 = f2;
            i4 |= M.n(f9) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                f10 = f3;
                i4 |= M.n(f10) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    f11 = f4;
                    i4 |= M.n(f11) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        f12 = f5;
                        i4 |= M.n(f12) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i4 |= M.n(f6) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i4 |= M.n(f7) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i11 = i10;
                            i4 |= M.n(f8) ? 8388608 : 4194304;
                            if ((i2 & 100663296) == 0) {
                                if ((i3 & 256) == 0 && M.y(list)) {
                                    i12 = 67108864;
                                    i4 |= i12;
                                }
                                i12 = 33554432;
                                i4 |= i12;
                            }
                            if ((i2 & 805306368) == 0) {
                                i4 |= M.y(wzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                            }
                            if (M.t(i4 & 1, (i4 & 306783379) == 306783378)) {
                                M.h();
                                f13 = f7;
                                f14 = f8;
                                list2 = list;
                                f15 = f9;
                                f16 = f6;
                            } else {
                                M.V();
                                if ((i2 & 1) == 0 || M.i()) {
                                    if (i13 != 0) {
                                        str2 = "";
                                    }
                                    f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    if (i14 != 0) {
                                        f9 = 0.0f;
                                    }
                                    if (i5 != 0) {
                                        f10 = 0.0f;
                                    }
                                    if (i6 != 0) {
                                        f11 = 0.0f;
                                    }
                                    if (i7 != 0) {
                                        f12 = 1.0f;
                                    }
                                    f18 = i8 == 0 ? f6 : 1.0f;
                                    f13 = i9 != 0 ? 0.0f : f7;
                                    if (i11 == 0) {
                                        f17 = f8;
                                    }
                                    if ((i3 & 256) != 0) {
                                        list2 = jlr0.a;
                                        i4 &= -234881025;
                                        M.S();
                                        if (androidx.compose.runtime.b.d()) {
                                            f19 = f17;
                                        } else {
                                            f19 = f17;
                                            androidx.compose.runtime.b.f(-1851426205, i4, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
                                        }
                                        x2 = M.x();
                                        if (x2 == a.C0011a.a) {
                                            x2 = a.i;
                                            M.R(x2);
                                        }
                                        gzs gzsVar = (gzs) x2;
                                        if (M.N() instanceof xkr0) {
                                            n34.r();
                                            throw null;
                                        }
                                        M.P();
                                        if (M.L()) {
                                            M.I(gzsVar);
                                        } else {
                                            M.f();
                                        }
                                        k9q0.w(M, str2, b.i);
                                        k9q0.w(M, Float.valueOf(f9), c.i);
                                        k9q0.w(M, Float.valueOf(f10), d.i);
                                        k9q0.w(M, Float.valueOf(f11), e.i);
                                        k9q0.w(M, Float.valueOf(f12), f.i);
                                        k9q0.w(M, Float.valueOf(f18), g.i);
                                        k9q0.w(M, Float.valueOf(f13), h.i);
                                        k9q0.w(M, Float.valueOf(f19), i.i);
                                        k9q0.w(M, list2, j.i);
                                        wzsVar.invoke(M, Integer.valueOf((i4 >> 27) & 14));
                                        M.G();
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        f14 = f19;
                                        f15 = f9;
                                        f16 = f18;
                                    }
                                } else {
                                    M.h();
                                    if ((i3 & 256) != 0) {
                                        i4 &= -234881025;
                                    }
                                    f18 = f6;
                                    f13 = f7;
                                    f17 = f8;
                                }
                                list2 = list;
                                M.S();
                                if (androidx.compose.runtime.b.d()) {
                                }
                                x2 = M.x();
                                if (x2 == a.C0011a.a) {
                                }
                                gzs gzsVar2 = (gzs) x2;
                                if (M.N() instanceof xkr0) {
                                }
                            }
                            float f20 = f11;
                            float f21 = f12;
                            s2 = M.s();
                            if (s2 == null) {
                                s2.d = new k(str2, f15, f10, f20, f21, f16, f13, f14, list2, wzsVar, i2, i3);
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if ((i2 & 100663296) == 0) {
                        }
                        if ((i2 & 805306368) == 0) {
                        }
                        if (M.t(i4 & 1, (i4 & 306783379) == 306783378)) {
                        }
                        float f202 = f11;
                        float f212 = f12;
                        s2 = M.s();
                        if (s2 == null) {
                        }
                    }
                    f12 = f5;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i2 & 805306368) == 0) {
                    }
                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378)) {
                    }
                    float f2022 = f11;
                    float f2122 = f12;
                    s2 = M.s();
                    if (s2 == null) {
                    }
                }
                f11 = f4;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                f12 = f5;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i2 & 100663296) == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378)) {
                }
                float f20222 = f11;
                float f21222 = f12;
                s2 = M.s();
                if (s2 == null) {
                }
            }
            f10 = f3;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            f11 = f4;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            f12 = f5;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378)) {
            }
            float f202222 = f11;
            float f212222 = f12;
            s2 = M.s();
            if (s2 == null) {
            }
        }
        f9 = f2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        f10 = f3;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        f11 = f4;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        f12 = f5;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378)) {
        }
        float f2022222 = f11;
        float f2122222 = f12;
        s2 = M.s();
        if (s2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(List<? extends qq90> list, int i2, String str, yk8 yk8Var, float f2, yk8 yk8Var2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, androidx.compose.runtime.a aVar, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        yk8 yk8Var3;
        int i12;
        float f9;
        int i13;
        yk8 yk8Var4;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        String str2;
        float f11;
        float f12;
        float f13;
        androidx.compose.runtime.a aVar2;
        yk8 yk8Var5;
        float f14;
        yk8 yk8Var6;
        int i28;
        float f15;
        int i29;
        int i30;
        float f16;
        float f17;
        androidx.compose.runtime.f s2;
        int i31;
        int i32;
        float f18;
        androidx.compose.runtime.a M = aVar.M(-1478270750);
        if ((i5 & 6) == 0) {
            i8 = (M.y(list) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i33 = i7 & 2;
        if (i33 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            i9 = i2;
            i8 |= M.o(i9) ? 32 : 16;
            i10 = i7 & 4;
            if (i10 == 0) {
                i8 |= 384;
            } else if ((i5 & 384) == 0) {
                i8 |= M.J(str) ? 256 : 128;
                i11 = i7 & 8;
                if (i11 != 0) {
                    i8 |= 3072;
                } else if ((i5 & 3072) == 0) {
                    yk8Var3 = yk8Var;
                    i8 |= M.J(yk8Var3) ? 2048 : 1024;
                    i12 = i7 & 16;
                    if (i12 == 0) {
                        i8 |= 24576;
                    } else if ((i5 & 24576) == 0) {
                        f9 = f2;
                        i8 |= M.n(f9) ? 16384 : 8192;
                        i13 = i7 & 32;
                        if (i13 != 0) {
                            i8 |= 196608;
                            yk8Var4 = yk8Var2;
                        } else {
                            yk8Var4 = yk8Var2;
                            if ((i5 & 196608) == 0) {
                                i8 |= M.J(yk8Var4) ? 131072 : 65536;
                            }
                        }
                        i14 = i7 & 64;
                        if (i14 != 0) {
                            i8 |= 1572864;
                            f10 = f3;
                        } else {
                            f10 = f3;
                            if ((i5 & 1572864) == 0) {
                                i8 |= M.n(f10) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            }
                        }
                        i15 = i7 & 128;
                        if (i15 != 0) {
                            i8 |= 12582912;
                        } else if ((i5 & 12582912) == 0) {
                            i8 |= M.n(f4) ? 8388608 : 4194304;
                        }
                        i16 = i7 & 256;
                        if (i16 != 0) {
                            i8 |= 100663296;
                        } else if ((i5 & 100663296) == 0) {
                            i17 = i16;
                            i8 |= M.o(i3) ? 67108864 : 33554432;
                            i18 = i7 & 512;
                            if (i18 == 0) {
                                i8 |= 805306368;
                            } else if ((i5 & 805306368) == 0) {
                                i19 = i18;
                                i8 |= M.o(i4) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                                i20 = i7 & 1024;
                                if (i20 != 0) {
                                    i22 = i6 | 6;
                                    i21 = i20;
                                } else if ((i6 & 6) == 0) {
                                    i21 = i20;
                                    i22 = i6 | (M.n(f5) ? 4 : 2);
                                } else {
                                    i21 = i20;
                                    i22 = i6;
                                }
                                i23 = i7 & 2048;
                                if (i23 != 0) {
                                    i22 |= 48;
                                    i24 = i23;
                                } else if ((i6 & 48) == 0) {
                                    i24 = i23;
                                    i22 |= M.n(f6) ? 32 : 16;
                                } else {
                                    i24 = i23;
                                }
                                int i34 = i22;
                                i25 = i7 & 4096;
                                if (i25 != 0) {
                                    i26 = i34 | 384;
                                } else {
                                    int i35 = i34;
                                    if ((i6 & 384) == 0) {
                                        i35 |= M.n(f7) ? 256 : 128;
                                    }
                                    i26 = i35;
                                }
                                i27 = i7 & 8192;
                                if (i27 != 0) {
                                    i26 |= 3072;
                                } else if ((i6 & 3072) == 0) {
                                    i26 |= M.n(f8) ? 2048 : 1024;
                                    if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
                                        M.h();
                                        str2 = str;
                                        f11 = f4;
                                        f12 = f6;
                                        f13 = f8;
                                        aVar2 = M;
                                        yk8Var5 = yk8Var3;
                                        f14 = f9;
                                        yk8Var6 = yk8Var4;
                                        i28 = i9;
                                        f15 = f10;
                                        i29 = i3;
                                        i30 = i4;
                                        f16 = f5;
                                        f17 = f7;
                                    } else {
                                        if (i33 != 0) {
                                            EmptyList emptyList = jlr0.a;
                                            i9 = 0;
                                        }
                                        String str3 = i10 != 0 ? "" : str;
                                        if (i11 != 0) {
                                            yk8Var3 = null;
                                        }
                                        if (i12 != 0) {
                                            f9 = 1.0f;
                                        }
                                        if (i13 != 0) {
                                            yk8Var4 = null;
                                        }
                                        if (i14 != 0) {
                                            f10 = 1.0f;
                                        }
                                        float f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        float f20 = i15 != 0 ? 0.0f : f4;
                                        if (i17 != 0) {
                                            EmptyList emptyList2 = jlr0.a;
                                            i31 = 0;
                                        } else {
                                            i31 = i3;
                                        }
                                        if (i19 != 0) {
                                            EmptyList emptyList3 = jlr0.a;
                                            i32 = 0;
                                        } else {
                                            i32 = i4;
                                        }
                                        float f21 = i21 != 0 ? 4.0f : f5;
                                        float f22 = i24 != 0 ? 0.0f : f6;
                                        float f23 = i25 != 0 ? 1.0f : f7;
                                        if (i27 == 0) {
                                            f19 = f8;
                                        }
                                        if (androidx.compose.runtime.b.d()) {
                                            f18 = f9;
                                            androidx.compose.runtime.b.f(-1478270750, i8, i26, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
                                        } else {
                                            f18 = f9;
                                        }
                                        Object x2 = M.x();
                                        if (x2 == a.C0011a.a) {
                                            x2 = l.i;
                                            M.R(x2);
                                        }
                                        gzs gzsVar = (gzs) x2;
                                        if (!(M.N() instanceof xkr0)) {
                                            n34.r();
                                            throw null;
                                        }
                                        M.P();
                                        if (M.L()) {
                                            M.I(gzsVar);
                                        } else {
                                            M.f();
                                        }
                                        k9q0.w(M, str3, r.i);
                                        k9q0.w(M, list, s.i);
                                        k9q0.w(M, new kq90(i9), t.i);
                                        k9q0.w(M, yk8Var3, u.i);
                                        k9q0.w(M, Float.valueOf(f18), v.i);
                                        k9q0.w(M, yk8Var4, w.i);
                                        k9q0.w(M, Float.valueOf(f10), x.i);
                                        k9q0.w(M, Float.valueOf(f20), y.i);
                                        k9q0.w(M, new krm0(i32), z.i);
                                        k9q0.w(M, new hrm0(i31), m.i);
                                        k9q0.w(M, Float.valueOf(f21), n.i);
                                        k9q0.w(M, Float.valueOf(f22), o.i);
                                        k9q0.w(M, Float.valueOf(f23), p.i);
                                        k9q0.w(M, Float.valueOf(f19), q.i);
                                        M.G();
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        f14 = f18;
                                        str2 = str3;
                                        i29 = i31;
                                        aVar2 = M;
                                        yk8Var5 = yk8Var3;
                                        yk8Var6 = yk8Var4;
                                        i28 = i9;
                                        f15 = f10;
                                        f16 = f21;
                                        f17 = f23;
                                        i30 = i32;
                                        f11 = f20;
                                        f13 = f19;
                                        f12 = f22;
                                    }
                                    s2 = aVar2.s();
                                    if (s2 == null) {
                                        s2.d = new a0(list, i28, str2, yk8Var5, f14, yk8Var6, f15, f11, i29, i30, f16, f12, f17, f13, i5, i6, i7);
                                        return;
                                    }
                                    return;
                                }
                                if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
                                }
                                s2 = aVar2.s();
                                if (s2 == null) {
                                }
                            }
                            i19 = i18;
                            i20 = i7 & 1024;
                            if (i20 != 0) {
                            }
                            i23 = i7 & 2048;
                            if (i23 != 0) {
                            }
                            int i342 = i22;
                            i25 = i7 & 4096;
                            if (i25 != 0) {
                            }
                            i27 = i7 & 8192;
                            if (i27 != 0) {
                            }
                            if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
                            }
                            s2 = aVar2.s();
                            if (s2 == null) {
                            }
                        }
                        i17 = i16;
                        i18 = i7 & 512;
                        if (i18 == 0) {
                        }
                        i19 = i18;
                        i20 = i7 & 1024;
                        if (i20 != 0) {
                        }
                        i23 = i7 & 2048;
                        if (i23 != 0) {
                        }
                        int i3422 = i22;
                        i25 = i7 & 4096;
                        if (i25 != 0) {
                        }
                        i27 = i7 & 8192;
                        if (i27 != 0) {
                        }
                        if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
                        }
                        s2 = aVar2.s();
                        if (s2 == null) {
                        }
                    }
                    f9 = f2;
                    i13 = i7 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i7 & 64;
                    if (i14 != 0) {
                    }
                    i15 = i7 & 128;
                    if (i15 != 0) {
                    }
                    i16 = i7 & 256;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    i18 = i7 & 512;
                    if (i18 == 0) {
                    }
                    i19 = i18;
                    i20 = i7 & 1024;
                    if (i20 != 0) {
                    }
                    i23 = i7 & 2048;
                    if (i23 != 0) {
                    }
                    int i34222 = i22;
                    i25 = i7 & 4096;
                    if (i25 != 0) {
                    }
                    i27 = i7 & 8192;
                    if (i27 != 0) {
                    }
                    if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
                    }
                    s2 = aVar2.s();
                    if (s2 == null) {
                    }
                }
                yk8Var3 = yk8Var;
                i12 = i7 & 16;
                if (i12 == 0) {
                }
                f9 = f2;
                i13 = i7 & 32;
                if (i13 != 0) {
                }
                i14 = i7 & 64;
                if (i14 != 0) {
                }
                i15 = i7 & 128;
                if (i15 != 0) {
                }
                i16 = i7 & 256;
                if (i16 != 0) {
                }
                i17 = i16;
                i18 = i7 & 512;
                if (i18 == 0) {
                }
                i19 = i18;
                i20 = i7 & 1024;
                if (i20 != 0) {
                }
                i23 = i7 & 2048;
                if (i23 != 0) {
                }
                int i342222 = i22;
                i25 = i7 & 4096;
                if (i25 != 0) {
                }
                i27 = i7 & 8192;
                if (i27 != 0) {
                }
                if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
                }
                s2 = aVar2.s();
                if (s2 == null) {
                }
            }
            i11 = i7 & 8;
            if (i11 != 0) {
            }
            yk8Var3 = yk8Var;
            i12 = i7 & 16;
            if (i12 == 0) {
            }
            f9 = f2;
            i13 = i7 & 32;
            if (i13 != 0) {
            }
            i14 = i7 & 64;
            if (i14 != 0) {
            }
            i15 = i7 & 128;
            if (i15 != 0) {
            }
            i16 = i7 & 256;
            if (i16 != 0) {
            }
            i17 = i16;
            i18 = i7 & 512;
            if (i18 == 0) {
            }
            i19 = i18;
            i20 = i7 & 1024;
            if (i20 != 0) {
            }
            i23 = i7 & 2048;
            if (i23 != 0) {
            }
            int i3422222 = i22;
            i25 = i7 & 4096;
            if (i25 != 0) {
            }
            i27 = i7 & 8192;
            if (i27 != 0) {
            }
            if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
            }
            s2 = aVar2.s();
            if (s2 == null) {
            }
        }
        i9 = i2;
        i10 = i7 & 4;
        if (i10 == 0) {
        }
        i11 = i7 & 8;
        if (i11 != 0) {
        }
        yk8Var3 = yk8Var;
        i12 = i7 & 16;
        if (i12 == 0) {
        }
        f9 = f2;
        i13 = i7 & 32;
        if (i13 != 0) {
        }
        i14 = i7 & 64;
        if (i14 != 0) {
        }
        i15 = i7 & 128;
        if (i15 != 0) {
        }
        i16 = i7 & 256;
        if (i16 != 0) {
        }
        i17 = i16;
        i18 = i7 & 512;
        if (i18 == 0) {
        }
        i19 = i18;
        i20 = i7 & 1024;
        if (i20 != 0) {
        }
        i23 = i7 & 2048;
        if (i23 != 0) {
        }
        int i34222222 = i22;
        i25 = i7 & 4096;
        if (i25 != 0) {
        }
        i27 = i7 & 8192;
        if (i27 != 0) {
        }
        if (M.t(i8 & 1, (i8 & 306783379) == 306783378 || (i26 & 1171) != 1170)) {
        }
        s2 = aVar2.s();
        if (s2 == null) {
        }
    }
}
