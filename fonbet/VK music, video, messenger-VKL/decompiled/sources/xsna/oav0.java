package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.dt1;
import xsna.q630;
import xsna.ud90;
import xsna.wd90;

/* compiled from: VkPaginationDots.kt */
/* loaded from: classes17.dex */
public final class oav0 {

    /* compiled from: VkPaginationDots.kt */
    @b6l(c = "com.vk.core.compose.component.pagination.VkPaginationDotsKt$VkPaginationDots$1$1", f = "VkPaginationDots.kt", l = {173, 175, 191, 196}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ ud90.a $animationSpecFactory;
        final /* synthetic */ int $currentDotIndex;
        final /* synthetic */ azl $density;
        final /* synthetic */ ud90.b $dimensions;
        final /* synthetic */ int $dotsCount;
        final /* synthetic */ rg50 $firstDotItemIndex$delegate;
        final /* synthetic */ int $firstWindowMiddle;
        final /* synthetic */ int $halfWindowSize;
        final /* synthetic */ rg50 $lastDotItemIndex$delegate;
        final /* synthetic */ int $lastWindowMiddle;
        final /* synthetic */ xvy $listState;
        final /* synthetic */ int $maxVisibleDots;
        final /* synthetic */ wd90 $mode;
        final /* synthetic */ rg50 $previousActiveIndex$delegate;
        final /* synthetic */ kg50 $unconsumedScrollPx$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3, int i4, int i5, xvy xvyVar, int i6, rg50 rg50Var, rg50 rg50Var2, rg50 rg50Var3, kg50 kg50Var, azl azlVar, ud90.b bVar, wd90 wd90Var, ud90.a aVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$firstWindowMiddle = i;
            this.$lastWindowMiddle = i2;
            this.$currentDotIndex = i3;
            this.$maxVisibleDots = i4;
            this.$dotsCount = i5;
            this.$listState = xvyVar;
            this.$halfWindowSize = i6;
            this.$previousActiveIndex$delegate = rg50Var;
            this.$firstDotItemIndex$delegate = rg50Var2;
            this.$lastDotItemIndex$delegate = rg50Var3;
            this.$unconsumedScrollPx$delegate = kg50Var;
            this.$density = azlVar;
            this.$dimensions = bVar;
            this.$mode = wd90Var;
            this.$animationSpecFactory = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$firstWindowMiddle, this.$lastWindowMiddle, this.$currentDotIndex, this.$maxVisibleDots, this.$dotsCount, this.$listState, this.$halfWindowSize, this.$previousActiveIndex$delegate, this.$firstDotItemIndex$delegate, this.$lastDotItemIndex$delegate, this.$unconsumedScrollPx$delegate, this.$density, this.$dimensions, this.$mode, this.$animationSpecFactory, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00cf, code lost:
        
            if (r0.f(0, r16) == r10) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
        
            if (r0.f(r6, r16) == r10) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
        
            if (xsna.oav0.c(r0, r1, r2, r3, r4, r5, r6, r7, r0, r16) == r10) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x015b, code lost:
        
            if (xsna.oav0.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r16) == r10) goto L96;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            int intValue;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.a.a(obj);
                boolean z = this.$previousActiveIndex$delegate.getIntValue() < this.$firstWindowMiddle;
                int intValue2 = this.$previousActiveIndex$delegate.getIntValue();
                int i3 = this.$lastWindowMiddle;
                boolean z2 = intValue2 >= i3;
                int i4 = this.$currentDotIndex;
                int i5 = this.$firstWindowMiddle;
                boolean z3 = i4 <= i5;
                boolean z4 = i4 >= i3 + (-1);
                boolean z5 = z3 || z4;
                boolean z6 = (z && !z3) || (z2 && !z4);
                rg50 rg50Var = this.$firstDotItemIndex$delegate;
                int i6 = this.$maxVisibleDots;
                rg50Var.C(i4 <= i5 ? 0 : i4 >= i3 ? this.$dotsCount - i6 : i4 - (i6 / 2));
                rg50 rg50Var2 = this.$lastDotItemIndex$delegate;
                int i7 = this.$firstWindowMiddle;
                int i8 = this.$lastWindowMiddle;
                int i9 = this.$maxVisibleDots;
                int i10 = this.$currentDotIndex;
                rg50Var2.C(i10 <= i7 ? i9 - 1 : i10 >= i8 ? this.$dotsCount - 1 : (i9 / 2) + i10);
                int intValue3 = this.$currentDotIndex - this.$previousActiveIndex$delegate.getIntValue();
                if (z5) {
                    this.$previousActiveIndex$delegate.C(this.$currentDotIndex);
                    if (z3 && this.$listState.e()) {
                        xvy xvyVar = this.$listState;
                        this.label = 1;
                    } else {
                        if (z4 && this.$listState.c()) {
                            xvy xvyVar2 = this.$listState;
                            int i11 = this.$dotsCount - this.$maxVisibleDots;
                            int i12 = i11 >= 0 ? i11 : 0;
                            this.label = 2;
                        }
                        this.$unconsumedScrollPx$delegate.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                } else if (Math.abs(intValue3) <= 1 || !z6) {
                    this.$previousActiveIndex$delegate.C(this.$currentDotIndex);
                    xvy xvyVar3 = this.$listState;
                    azl azlVar = this.$density;
                    int i13 = this.$halfWindowSize;
                    ud90.b bVar = this.$dimensions;
                    kg50 kg50Var = this.$unconsumedScrollPx$delegate;
                    wd90 wd90Var = this.$mode;
                    ud90.a aVar = this.$animationSpecFactory;
                    rg50 rg50Var3 = this.$firstDotItemIndex$delegate;
                    this.label = 4;
                } else {
                    if (z) {
                        i = intValue3 - this.$halfWindowSize;
                        intValue = this.$previousActiveIndex$delegate.getIntValue();
                    } else {
                        i = intValue3 + this.$halfWindowSize;
                        intValue = (this.$previousActiveIndex$delegate.getIntValue() - this.$dotsCount) + 1;
                    }
                    int i14 = intValue + i;
                    this.$previousActiveIndex$delegate.C(this.$currentDotIndex);
                    xvy xvyVar4 = this.$listState;
                    azl azlVar2 = this.$density;
                    int i15 = this.$halfWindowSize;
                    ud90.b bVar2 = this.$dimensions;
                    kg50 kg50Var2 = this.$unconsumedScrollPx$delegate;
                    wd90 wd90Var2 = this.$mode;
                    ud90.a aVar2 = this.$animationSpecFactory;
                    rg50 rg50Var4 = this.$firstDotItemIndex$delegate;
                    this.label = 3;
                }
                return coroutineSingletons;
            }
            if (i2 == 1 || i2 == 2) {
                kotlin.a.a(obj);
                this.$unconsumedScrollPx$delegate.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkPaginationDots.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t5o.values().length];
            try {
                iArr[t5o.Edge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t5o.Outside.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t5o.Active.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final t5o t5oVar, final long j, final gzs gzsVar, final ud90.b bVar, final ud90.a aVar, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        final q630 q630Var2;
        float f = bVar.b;
        androidx.compose.runtime.a M = aVar2.M(1694052364);
        int i2 = i | (M.o(t5oVar.ordinal()) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(bVar) ? 2048 : 1024) | (M.J(aVar) ? 16384 : 8192) | 196608;
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1694052364, i2, -1, "com.vk.core.compose.component.pagination.PaginationDotCircle (VkPaginationDots.kt:253)");
            }
            final float floatValue = ((Number) gzsVar.invoke()).floatValue();
            int[] iArr = b.$EnumSwitchMapping$0;
            boolean z = true;
            mtk0 a2 = hg2.a(iArr[t5oVar.ordinal()] == 1 ? (f - bVar.d) / 2 : 0, aVar.a(), null, M, 0, 12);
            mtk0 b2 = hg2.b(iArr[t5oVar.ordinal()] == 2 ? 0.0f : 1.0f, aVar.a(), null, null, M, 0, 28);
            if (t5oVar == t5o.Active && floatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = bVar.c;
            }
            mtk0 a3 = hg2.a(f, aVar.a(), null, M, 0, 12);
            final mtk0 b3 = hg2.b(iArr[t5oVar.ordinal()] == 3 ? 1.0f : 0.0f, aVar.a(), null, null, M, 0, 28);
            M = M;
            float f2 = bVar.a;
            q630.a aVar3 = q630.a.a;
            q630 D = s200.D(txj0.v(txj0.h(aVar3, f2), ((pco) a3.getValue()).b), ((pco) a2.getValue()).b);
            boolean J = M.J(b2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new egt0(b2, 5);
                M.R(x);
            }
            q630 a4 = rdu.a(D, (izs) x);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean J2 = z | M.J(b3) | M.n(floatValue);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.mav0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L));
                        float f3 = 2;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / f3;
                        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat / f3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - (Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / f3);
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / f3;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32);
                        long j2 = j;
                        oioVar.b1(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)), (r20 & 16) != 0 ? 0 : 1, 3, l5g.c(14, j2, 0.3f), floatToRawIntBits, floatToRawIntBits2);
                        mtk0 mtk0Var = b3;
                        if (((Number) mtk0Var.getValue()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            long c = l5g.c(14, j2, ((Number) mtk0Var.getValue()).floatValue());
                            float f4 = floatValue;
                            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f4 = 1.0f;
                            }
                            oioVar.b1(Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)), (r20 & 16) != 0 ? 0 : 1, 3, c, floatToRawIntBits, xus.q(floatToRawIntBits, floatToRawIntBits2, f4));
                        }
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            xa4.i(0, M, (izs) x2, a4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, gzsVar, bVar, aVar, q630Var2, i) { // from class: xsna.nav0
                public final /* synthetic */ long c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ ud90.b e;
                public final /* synthetic */ ud90.a f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    oav0.a(t5o.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x03f9, code lost:
    
        if (r14.p(r2) == false) goto L234;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final wd90 wd90Var, final int i, final int i2, q630 q630Var, long j, ud90.b bVar, ud90.a aVar, int i3, androidx.compose.runtime.a aVar2, final int i4, final int i5) {
        int i6;
        q630 q630Var2;
        long j2;
        ud90.b bVar2;
        int i7;
        int i8;
        androidx.compose.runtime.a aVar3;
        final ud90.b bVar3;
        final int i9;
        final q630 q630Var3;
        final long j3;
        final ud90.a aVar4;
        androidx.compose.runtime.f s;
        int i10;
        ud90.a aVar5;
        int i11;
        ud90.b bVar4;
        int i12;
        int i13;
        int i14;
        boolean z;
        Object x;
        boolean z2;
        Object x2;
        Object x3;
        Object x4;
        int i15;
        int i16;
        boolean z3;
        int i17;
        boolean y;
        Object x5;
        ud90.a aVar6;
        Integer num;
        q630 q630Var4;
        long j4;
        a.C0011a.C0012a c0012a;
        int i18;
        int i19;
        int i20;
        int i21;
        Integer num2;
        int i22;
        boolean z4;
        int i23;
        final rg50 rg50Var;
        final rg50 rg50Var2;
        androidx.compose.runtime.a aVar7;
        xvy xvyVar;
        final ud90.b bVar5;
        int i24;
        long j5;
        boolean z5;
        boolean y2;
        Object obj;
        long j6;
        ud90.b bVar6;
        ud90.a aVar8;
        final wd90 wd90Var2 = wd90Var;
        androidx.compose.runtime.a M = aVar2.M(-1845899070);
        if ((i4 & 6) == 0) {
            i6 = ((i4 & 8) == 0 ? M.J(wd90Var2) : M.y(wd90Var2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= M.o(i) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= M.o(i2) ? 256 : 128;
        }
        int i25 = i5 & 8;
        if (i25 != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i4 & 24576) != 0) {
                j2 = j;
                i6 |= ((i5 & 16) == 0 && M.p(j2)) ? 16384 : 8192;
            } else {
                j2 = j;
            }
            if ((i4 & 196608) != 0) {
                bVar2 = bVar;
                i6 |= ((i5 & 32) == 0 && M.J(bVar2)) ? 131072 : 65536;
            } else {
                bVar2 = bVar;
            }
            if ((i4 & 1572864) == 0) {
                i6 |= 524288;
            }
            i7 = i5 & 128;
            if (i7 == 0) {
                i6 |= 12582912;
                i8 = i3;
            } else {
                i8 = i3;
                if ((i4 & 12582912) == 0) {
                    i6 |= M.o(i8) ? 8388608 : 4194304;
                }
            }
            boolean z6 = true;
            if (M.t(i6 & 1, (i6 & 4793491) == 4793490)) {
                aVar3 = M;
                aVar3.h();
                bVar3 = bVar2;
                i9 = i8;
                q630Var3 = q630Var2;
                j3 = j2;
                aVar4 = aVar;
            } else {
                M.V();
                int i26 = i4 & 1;
                q630.a aVar9 = q630.a.a;
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (i26 == 0 || M.i()) {
                    if (i25 != 0) {
                        q630Var2 = aVar9;
                    }
                    if ((i5 & 16) != 0) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var.getIcon().l;
                        i6 &= -57345;
                    }
                    if ((i5 & 32) != 0) {
                        bVar2 = ud90.a(196608, M);
                        i6 &= -458753;
                    }
                    nkk nkkVar = new nkk(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(722996489, 384, -1, "com.vk.core.compose.component.pagination.PaginationDotsDefaults.tweenSpecFactory (PaginationDotsDefaults.kt:55)");
                    }
                    Object x6 = M.x();
                    if (x6 == c0012a2) {
                        x6 = new vd90(nkkVar);
                        M.R(x6);
                    }
                    vd90 vd90Var = (vd90) x6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    i10 = i6 & (-3670017);
                    if (i7 != 0) {
                        aVar5 = vd90Var;
                        i11 = i10;
                        bVar4 = bVar2;
                        i12 = 7;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1845899070, i11, -1, "com.vk.core.compose.component.pagination.VkPaginationDots (VkPaginationDots.kt:65)");
                        }
                        xvy a2 = zvy.a(0, 3, M);
                        int i27 = i12 / 2;
                        int i28 = i12 - 1;
                        float f = bVar4.b;
                        float f2 = i28;
                        float f3 = (f2 * kqu0.u) + (f2 * f);
                        i13 = i12;
                        if (wd90Var2 instanceof wd90.b) {
                            f = bVar4.c;
                        }
                        float f4 = f + f3;
                        azl azlVar = (azl) M.r(uvi.h);
                        int i29 = i - i27;
                        int i30 = 29360128 & i11;
                        int i31 = i11 & 896;
                        i14 = i11;
                        int i32 = i14 & 112;
                        q630 q630Var5 = q630Var2;
                        z = (i30 != 8388608) | (i31 != 256) | (i32 != 32);
                        x = M.x();
                        if (!z || x == c0012a2) {
                            x = androidx.compose.runtime.i.a(!(i2 > i27) ? 0 : i2 < i29 ? i - i13 : i2 - i27);
                            M.R(x);
                        }
                        rg50 rg50Var3 = (rg50) x;
                        long j7 = j2;
                        z2 = (i30 != 8388608) | (i31 != 256) | (i32 != 32);
                        x2 = M.x();
                        if (!z2 || x2 == c0012a2) {
                            x2 = androidx.compose.runtime.i.a(!(i2 > i27) ? i28 : i2 < i29 ? i - 1 : i27 + i2);
                            M.R(x2);
                        }
                        rg50 rg50Var4 = (rg50) x2;
                        x3 = M.x();
                        if (x3 == c0012a2) {
                            x3 = androidx.compose.runtime.i.a(i2);
                            M.R(x3);
                        }
                        rg50 rg50Var5 = (rg50) x3;
                        x4 = M.x();
                        if (x4 == c0012a2) {
                            x4 = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            M.R(x4);
                        }
                        kg50 kg50Var = (kg50) x4;
                        Integer valueOf = Integer.valueOf(i2);
                        Integer valueOf2 = Integer.valueOf(i13);
                        boolean o = M.o(i27) | M.o(i29) | (i31 != 256) | M.J(rg50Var3) | (i30 != 8388608) | (i32 != 32) | M.J(rg50Var4) | M.J(a2) | M.o(i27) | M.J(azlVar);
                        i15 = (i14 & 458752) ^ 196608;
                        if (i15 > 131072 || !M.J(bVar4)) {
                            i16 = i15;
                            if ((i14 & 196608) != 131072) {
                                z3 = false;
                                boolean z7 = z3 | o;
                                i17 = i14 & 14;
                                y = z7 | (i17 != 4 || ((i14 & 8) != 0 && M.y(wd90Var2))) | M.y(aVar5);
                                x5 = M.x();
                                if (!y || x5 == c0012a2) {
                                    aVar6 = aVar5;
                                    num = valueOf;
                                    q630Var4 = q630Var5;
                                    j4 = j7;
                                    c0012a = c0012a2;
                                    i18 = i17;
                                    i19 = i16;
                                    i20 = i32;
                                    i21 = i14;
                                    num2 = valueOf2;
                                    i22 = i31;
                                    z4 = false;
                                    a aVar10 = new a(i27, i29, i2, i13, i, a2, i27, rg50Var5, rg50Var3, rg50Var4, kg50Var, azlVar, bVar4, wd90Var2, aVar6, null);
                                    i23 = i13;
                                    rg50Var = rg50Var3;
                                    rg50Var2 = rg50Var4;
                                    wd90Var2 = wd90Var2;
                                    aVar7 = M;
                                    xvyVar = a2;
                                    bVar5 = bVar4;
                                    aVar7.R(aVar10);
                                    x5 = aVar10;
                                } else {
                                    i23 = i13;
                                    num = valueOf;
                                    q630Var4 = q630Var5;
                                    j4 = j7;
                                    c0012a = c0012a2;
                                    i18 = i17;
                                    aVar7 = M;
                                    i22 = i31;
                                    rg50Var = rg50Var3;
                                    bVar5 = bVar4;
                                    rg50Var2 = rg50Var4;
                                    i19 = i16;
                                    i20 = i32;
                                    i21 = i14;
                                    num2 = valueOf2;
                                    z4 = false;
                                    xvyVar = a2;
                                    aVar6 = aVar5;
                                }
                                i24 = i21;
                                bap.f(num, num2, (wzs) x5, aVar7, ((i24 >> 6) & 14) | ((i24 >> 18) & 112));
                                q630 q630Var6 = q630Var4;
                                q630 g = txj0.u(aVar9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11).g(q630Var6);
                                a.l lVar = androidx.compose.foundation.layout.a.a;
                                dt1.a.getClass();
                                a.j h = androidx.compose.foundation.layout.a.h(10, dt1.a.o);
                                boolean J = (i20 == 32 ? true : z4) | (i22 == 256 ? true : z4) | aVar7.J(rg50Var) | aVar7.J(rg50Var2);
                                if (((57344 & i24) ^ 24576) > 16384) {
                                    j5 = j4;
                                } else {
                                    j5 = j4;
                                }
                                if ((i24 & 24576) != 16384) {
                                    z5 = z4;
                                    boolean z8 = J | z5 | ((i18 != 4 || ((i24 & 8) != 0 && aVar7.y(wd90Var2))) ? true : z4);
                                    if ((i19 > 131072 || !aVar7.J(bVar5)) && (i24 & 196608) != 131072) {
                                        z6 = z4;
                                    }
                                    y2 = z8 | z6 | aVar7.y(aVar6);
                                    Object x7 = aVar7.x();
                                    if (!y2 || x7 == c0012a) {
                                        final long j8 = j5;
                                        final ud90.a aVar11 = aVar6;
                                        obj = new izs() { // from class: xsna.jav0
                                            @Override // xsna.izs
                                            public final Object invoke(Object obj2) {
                                                b40 b40Var = new b40(27);
                                                final int i33 = i2;
                                                final int i34 = i;
                                                final long j9 = j8;
                                                final wd90 wd90Var3 = wd90Var2;
                                                final ud90.b bVar7 = bVar5;
                                                final ud90.a aVar12 = aVar11;
                                                final rg50 rg50Var6 = rg50Var;
                                                final rg50 rg50Var7 = rg50Var2;
                                                nvy.c((nvy) obj2, i34, b40Var, new jai(-1355374698, new zzs() { // from class: xsna.lav0
                                                    @Override // xsna.zzs
                                                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                                        int intValue = ((Integer) obj4).intValue();
                                                        androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj5;
                                                        int intValue2 = ((Integer) obj6).intValue();
                                                        if ((intValue2 & 48) == 0) {
                                                            intValue2 |= aVar13.o(intValue) ? 32 : 16;
                                                        }
                                                        if (aVar13.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(-1355374698, intValue2, -1, "com.vk.core.compose.component.pagination.VkPaginationDots.<anonymous>.<anonymous>.<anonymous> (VkPaginationDots.kt:213)");
                                                            }
                                                            boolean z9 = intValue == i33;
                                                            rg50 rg50Var8 = rg50Var6;
                                                            int intValue3 = rg50Var8.getIntValue() + 1;
                                                            rg50 rg50Var9 = rg50Var7;
                                                            t5o t5oVar = z9 ? t5o.Active : intValue < rg50Var8.getIntValue() || intValue > rg50Var9.getIntValue() ? t5o.Outside : (intValue >= rg50Var9.getIntValue() || intValue3 > intValue) && intValue != 0 && intValue != i34 - 1 ? t5o.Edge : t5o.Inactive;
                                                            wd90 wd90Var4 = wd90Var3;
                                                            boolean y3 = aVar13.y(wd90Var4);
                                                            Object x8 = aVar13.x();
                                                            if (y3 || x8 == a.C0011a.a) {
                                                                x8 = new h6m0(wd90Var4, 24);
                                                                aVar13.R(x8);
                                                            }
                                                            oav0.a(t5oVar, j9, (gzs) x8, bVar7, aVar12, null, aVar13, 0);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                        } else {
                                                            aVar13.h();
                                                        }
                                                        return s3q0.a;
                                                    }
                                                }, true), 4);
                                                return s3q0.a;
                                            }
                                        };
                                        j6 = j8;
                                        bVar6 = bVar5;
                                        aVar8 = aVar11;
                                        aVar7.R(obj);
                                    } else {
                                        obj = x7;
                                        j6 = j5;
                                        bVar6 = bVar5;
                                        aVar8 = aVar6;
                                    }
                                    lqy.b(g, xvyVar, null, h, null, null, false, null, (izs) obj, aVar7, 12607488, 364);
                                    aVar3 = aVar7;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    bVar3 = bVar6;
                                    aVar4 = aVar8;
                                    i9 = i23;
                                    q630Var3 = q630Var6;
                                    j3 = j6;
                                }
                                z5 = true;
                                boolean z82 = J | z5 | ((i18 != 4 || ((i24 & 8) != 0 && aVar7.y(wd90Var2))) ? true : z4);
                                if (i19 > 131072) {
                                }
                                z6 = z4;
                                y2 = z82 | z6 | aVar7.y(aVar6);
                                Object x72 = aVar7.x();
                                if (y2) {
                                }
                                final long j82 = j5;
                                final ud90.a aVar112 = aVar6;
                                obj = new izs() { // from class: xsna.jav0
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj2) {
                                        b40 b40Var = new b40(27);
                                        final int i33 = i2;
                                        final int i34 = i;
                                        final long j9 = j82;
                                        final wd90 wd90Var3 = wd90Var2;
                                        final ud90.b bVar7 = bVar5;
                                        final ud90.a aVar12 = aVar112;
                                        final rg50 rg50Var6 = rg50Var;
                                        final rg50 rg50Var7 = rg50Var2;
                                        nvy.c((nvy) obj2, i34, b40Var, new jai(-1355374698, new zzs() { // from class: xsna.lav0
                                            @Override // xsna.zzs
                                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                                int intValue = ((Integer) obj4).intValue();
                                                androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj5;
                                                int intValue2 = ((Integer) obj6).intValue();
                                                if ((intValue2 & 48) == 0) {
                                                    intValue2 |= aVar13.o(intValue) ? 32 : 16;
                                                }
                                                if (aVar13.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-1355374698, intValue2, -1, "com.vk.core.compose.component.pagination.VkPaginationDots.<anonymous>.<anonymous>.<anonymous> (VkPaginationDots.kt:213)");
                                                    }
                                                    boolean z9 = intValue == i33;
                                                    rg50 rg50Var8 = rg50Var6;
                                                    int intValue3 = rg50Var8.getIntValue() + 1;
                                                    rg50 rg50Var9 = rg50Var7;
                                                    t5o t5oVar = z9 ? t5o.Active : intValue < rg50Var8.getIntValue() || intValue > rg50Var9.getIntValue() ? t5o.Outside : (intValue >= rg50Var9.getIntValue() || intValue3 > intValue) && intValue != 0 && intValue != i34 - 1 ? t5o.Edge : t5o.Inactive;
                                                    wd90 wd90Var4 = wd90Var3;
                                                    boolean y3 = aVar13.y(wd90Var4);
                                                    Object x8 = aVar13.x();
                                                    if (y3 || x8 == a.C0011a.a) {
                                                        x8 = new h6m0(wd90Var4, 24);
                                                        aVar13.R(x8);
                                                    }
                                                    oav0.a(t5oVar, j9, (gzs) x8, bVar7, aVar12, null, aVar13, 0);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar13.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true), 4);
                                        return s3q0.a;
                                    }
                                };
                                j6 = j82;
                                bVar6 = bVar5;
                                aVar8 = aVar112;
                                aVar7.R(obj);
                                lqy.b(g, xvyVar, null, h, null, null, false, null, (izs) obj, aVar7, 12607488, 364);
                                aVar3 = aVar7;
                                if (androidx.compose.runtime.b.d()) {
                                }
                                bVar3 = bVar6;
                                aVar4 = aVar8;
                                i9 = i23;
                                q630Var3 = q630Var6;
                                j3 = j6;
                            }
                        } else {
                            i16 = i15;
                        }
                        z3 = true;
                        boolean z72 = z3 | o;
                        i17 = i14 & 14;
                        y = z72 | (i17 != 4 || ((i14 & 8) != 0 && M.y(wd90Var2))) | M.y(aVar5);
                        x5 = M.x();
                        if (y) {
                        }
                        aVar6 = aVar5;
                        num = valueOf;
                        q630Var4 = q630Var5;
                        j4 = j7;
                        c0012a = c0012a2;
                        i18 = i17;
                        i19 = i16;
                        i20 = i32;
                        i21 = i14;
                        num2 = valueOf2;
                        i22 = i31;
                        z4 = false;
                        a aVar102 = new a(i27, i29, i2, i13, i, a2, i27, rg50Var5, rg50Var3, rg50Var4, kg50Var, azlVar, bVar4, wd90Var2, aVar6, null);
                        i23 = i13;
                        rg50Var = rg50Var3;
                        rg50Var2 = rg50Var4;
                        wd90Var2 = wd90Var2;
                        aVar7 = M;
                        xvyVar = a2;
                        bVar5 = bVar4;
                        aVar7.R(aVar102);
                        x5 = aVar102;
                        i24 = i21;
                        bap.f(num, num2, (wzs) x5, aVar7, ((i24 >> 6) & 14) | ((i24 >> 18) & 112));
                        q630 q630Var62 = q630Var4;
                        q630 g2 = txj0.u(aVar9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11).g(q630Var62);
                        a.l lVar2 = androidx.compose.foundation.layout.a.a;
                        dt1.a.getClass();
                        a.j h2 = androidx.compose.foundation.layout.a.h(10, dt1.a.o);
                        boolean J2 = (i20 == 32 ? true : z4) | (i22 == 256 ? true : z4) | aVar7.J(rg50Var) | aVar7.J(rg50Var2);
                        if (((57344 & i24) ^ 24576) > 16384) {
                        }
                        if ((i24 & 24576) != 16384) {
                        }
                        z5 = true;
                        boolean z822 = J2 | z5 | ((i18 != 4 || ((i24 & 8) != 0 && aVar7.y(wd90Var2))) ? true : z4);
                        if (i19 > 131072) {
                        }
                        z6 = z4;
                        y2 = z822 | z6 | aVar7.y(aVar6);
                        Object x722 = aVar7.x();
                        if (y2) {
                        }
                        final long j822 = j5;
                        final ud90.a aVar1122 = aVar6;
                        obj = new izs() { // from class: xsna.jav0
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                b40 b40Var = new b40(27);
                                final int i33 = i2;
                                final int i34 = i;
                                final long j9 = j822;
                                final wd90 wd90Var3 = wd90Var2;
                                final ud90.b bVar7 = bVar5;
                                final ud90.a aVar12 = aVar1122;
                                final rg50 rg50Var6 = rg50Var;
                                final rg50 rg50Var7 = rg50Var2;
                                nvy.c((nvy) obj2, i34, b40Var, new jai(-1355374698, new zzs() { // from class: xsna.lav0
                                    @Override // xsna.zzs
                                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                        int intValue = ((Integer) obj4).intValue();
                                        androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj5;
                                        int intValue2 = ((Integer) obj6).intValue();
                                        if ((intValue2 & 48) == 0) {
                                            intValue2 |= aVar13.o(intValue) ? 32 : 16;
                                        }
                                        if (aVar13.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-1355374698, intValue2, -1, "com.vk.core.compose.component.pagination.VkPaginationDots.<anonymous>.<anonymous>.<anonymous> (VkPaginationDots.kt:213)");
                                            }
                                            boolean z9 = intValue == i33;
                                            rg50 rg50Var8 = rg50Var6;
                                            int intValue3 = rg50Var8.getIntValue() + 1;
                                            rg50 rg50Var9 = rg50Var7;
                                            t5o t5oVar = z9 ? t5o.Active : intValue < rg50Var8.getIntValue() || intValue > rg50Var9.getIntValue() ? t5o.Outside : (intValue >= rg50Var9.getIntValue() || intValue3 > intValue) && intValue != 0 && intValue != i34 - 1 ? t5o.Edge : t5o.Inactive;
                                            wd90 wd90Var4 = wd90Var3;
                                            boolean y3 = aVar13.y(wd90Var4);
                                            Object x8 = aVar13.x();
                                            if (y3 || x8 == a.C0011a.a) {
                                                x8 = new h6m0(wd90Var4, 24);
                                                aVar13.R(x8);
                                            }
                                            oav0.a(t5oVar, j9, (gzs) x8, bVar7, aVar12, null, aVar13, 0);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                        } else {
                                            aVar13.h();
                                        }
                                        return s3q0.a;
                                    }
                                }, true), 4);
                                return s3q0.a;
                            }
                        };
                        j6 = j822;
                        bVar6 = bVar5;
                        aVar8 = aVar1122;
                        aVar7.R(obj);
                        lqy.b(g2, xvyVar, null, h2, null, null, false, null, (izs) obj, aVar7, 12607488, 364);
                        aVar3 = aVar7;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        bVar3 = bVar6;
                        aVar4 = aVar8;
                        i9 = i23;
                        q630Var3 = q630Var62;
                        j3 = j6;
                    } else {
                        aVar5 = vd90Var;
                    }
                } else {
                    M.h();
                    if ((i5 & 16) != 0) {
                        i6 &= -57345;
                    }
                    if ((i5 & 32) != 0) {
                        i6 &= -458753;
                    }
                    i10 = i6 & (-3670017);
                    aVar5 = aVar;
                }
                i11 = i10;
                bVar4 = bVar2;
                i12 = i8;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                }
                xvy a22 = zvy.a(0, 3, M);
                int i272 = i12 / 2;
                int i282 = i12 - 1;
                float f5 = bVar4.b;
                float f22 = i282;
                float f32 = (f22 * kqu0.u) + (f22 * f5);
                i13 = i12;
                if (wd90Var2 instanceof wd90.b) {
                }
                float f42 = f5 + f32;
                azl azlVar2 = (azl) M.r(uvi.h);
                int i292 = i - i272;
                int i302 = 29360128 & i11;
                int i312 = i11 & 896;
                i14 = i11;
                int i322 = i14 & 112;
                q630 q630Var52 = q630Var2;
                z = (i302 != 8388608) | (i312 != 256) | (i322 != 32);
                x = M.x();
                if (!z) {
                }
                x = androidx.compose.runtime.i.a(!(i2 > i272) ? 0 : i2 < i292 ? i - i13 : i2 - i272);
                M.R(x);
                rg50 rg50Var32 = (rg50) x;
                long j72 = j2;
                z2 = (i302 != 8388608) | (i312 != 256) | (i322 != 32);
                x2 = M.x();
                if (!z2) {
                }
                x2 = androidx.compose.runtime.i.a(!(i2 > i272) ? i282 : i2 < i292 ? i - 1 : i272 + i2);
                M.R(x2);
                rg50 rg50Var42 = (rg50) x2;
                x3 = M.x();
                if (x3 == c0012a2) {
                }
                rg50 rg50Var52 = (rg50) x3;
                x4 = M.x();
                if (x4 == c0012a2) {
                }
                kg50 kg50Var2 = (kg50) x4;
                Integer valueOf3 = Integer.valueOf(i2);
                Integer valueOf22 = Integer.valueOf(i13);
                boolean o2 = M.o(i272) | M.o(i292) | (i312 != 256) | M.J(rg50Var32) | (i302 != 8388608) | (i322 != 32) | M.J(rg50Var42) | M.J(a22) | M.o(i272) | M.J(azlVar2);
                i15 = (i14 & 458752) ^ 196608;
                if (i15 > 131072) {
                }
                i16 = i15;
                if ((i14 & 196608) != 131072) {
                }
                z3 = true;
                boolean z722 = z3 | o2;
                i17 = i14 & 14;
                y = z722 | (i17 != 4 || ((i14 & 8) != 0 && M.y(wd90Var2))) | M.y(aVar5);
                x5 = M.x();
                if (y) {
                }
                aVar6 = aVar5;
                num = valueOf3;
                q630Var4 = q630Var52;
                j4 = j72;
                c0012a = c0012a2;
                i18 = i17;
                i19 = i16;
                i20 = i322;
                i21 = i14;
                num2 = valueOf22;
                i22 = i312;
                z4 = false;
                a aVar1022 = new a(i272, i292, i2, i13, i, a22, i272, rg50Var52, rg50Var32, rg50Var42, kg50Var2, azlVar2, bVar4, wd90Var2, aVar6, null);
                i23 = i13;
                rg50Var = rg50Var32;
                rg50Var2 = rg50Var42;
                wd90Var2 = wd90Var2;
                aVar7 = M;
                xvyVar = a22;
                bVar5 = bVar4;
                aVar7.R(aVar1022);
                x5 = aVar1022;
                i24 = i21;
                bap.f(num, num2, (wzs) x5, aVar7, ((i24 >> 6) & 14) | ((i24 >> 18) & 112));
                q630 q630Var622 = q630Var4;
                q630 g22 = txj0.u(aVar9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f42, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11).g(q630Var622);
                a.l lVar22 = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                a.j h22 = androidx.compose.foundation.layout.a.h(10, dt1.a.o);
                boolean J22 = (i20 == 32 ? true : z4) | (i22 == 256 ? true : z4) | aVar7.J(rg50Var) | aVar7.J(rg50Var2);
                if (((57344 & i24) ^ 24576) > 16384) {
                }
                if ((i24 & 24576) != 16384) {
                }
                z5 = true;
                boolean z8222 = J22 | z5 | ((i18 != 4 || ((i24 & 8) != 0 && aVar7.y(wd90Var2))) ? true : z4);
                if (i19 > 131072) {
                }
                z6 = z4;
                y2 = z8222 | z6 | aVar7.y(aVar6);
                Object x7222 = aVar7.x();
                if (y2) {
                }
                final long j8222 = j5;
                final ud90.a aVar11222 = aVar6;
                obj = new izs() { // from class: xsna.jav0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        b40 b40Var = new b40(27);
                        final int i33 = i2;
                        final int i34 = i;
                        final long j9 = j8222;
                        final wd90 wd90Var3 = wd90Var2;
                        final ud90.b bVar7 = bVar5;
                        final ud90.a aVar12 = aVar11222;
                        final rg50 rg50Var6 = rg50Var;
                        final rg50 rg50Var7 = rg50Var2;
                        nvy.c((nvy) obj2, i34, b40Var, new jai(-1355374698, new zzs() { // from class: xsna.lav0
                            @Override // xsna.zzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int intValue = ((Integer) obj4).intValue();
                                androidx.compose.runtime.a aVar13 = (androidx.compose.runtime.a) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if ((intValue2 & 48) == 0) {
                                    intValue2 |= aVar13.o(intValue) ? 32 : 16;
                                }
                                if (aVar13.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1355374698, intValue2, -1, "com.vk.core.compose.component.pagination.VkPaginationDots.<anonymous>.<anonymous>.<anonymous> (VkPaginationDots.kt:213)");
                                    }
                                    boolean z9 = intValue == i33;
                                    rg50 rg50Var8 = rg50Var6;
                                    int intValue3 = rg50Var8.getIntValue() + 1;
                                    rg50 rg50Var9 = rg50Var7;
                                    t5o t5oVar = z9 ? t5o.Active : intValue < rg50Var8.getIntValue() || intValue > rg50Var9.getIntValue() ? t5o.Outside : (intValue >= rg50Var9.getIntValue() || intValue3 > intValue) && intValue != 0 && intValue != i34 - 1 ? t5o.Edge : t5o.Inactive;
                                    wd90 wd90Var4 = wd90Var3;
                                    boolean y3 = aVar13.y(wd90Var4);
                                    Object x8 = aVar13.x();
                                    if (y3 || x8 == a.C0011a.a) {
                                        x8 = new h6m0(wd90Var4, 24);
                                        aVar13.R(x8);
                                    }
                                    oav0.a(t5oVar, j9, (gzs) x8, bVar7, aVar12, null, aVar13, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar13.h();
                                }
                                return s3q0.a;
                            }
                        }, true), 4);
                        return s3q0.a;
                    }
                };
                j6 = j8222;
                bVar6 = bVar5;
                aVar8 = aVar11222;
                aVar7.R(obj);
                lqy.b(g22, xvyVar, null, h22, null, null, false, null, (izs) obj, aVar7, 12607488, 364);
                aVar3 = aVar7;
                if (androidx.compose.runtime.b.d()) {
                }
                bVar3 = bVar6;
                aVar4 = aVar8;
                i9 = i23;
                q630Var3 = q630Var622;
                j3 = j6;
            }
            s = aVar3.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.kav0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        oav0.b(wd90.this, i, i2, q630Var3, j3, bVar3, aVar4, i9, (androidx.compose.runtime.a) obj2, ne7.I(i4 | 1), i5);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i4 & 24576) != 0) {
        }
        if ((i4 & 196608) != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i7 = i5 & 128;
        if (i7 == 0) {
        }
        boolean z62 = true;
        if (M.t(i6 & 1, (i6 & 4793491) == 4793490)) {
        }
        s = aVar3.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c8, code lost:
    
        if (r0.k(r1, 0, r5) != r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ca, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r0.b(androidx.compose.foundation.MutatePriority.Default, r10, r5) == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(xvy xvyVar, azl azlVar, int i, ud90.b bVar, kg50 kg50Var, wd90 wd90Var, ud90.a aVar, rg50 rg50Var, int i2, ContinuationImpl continuationImpl) {
        pav0 pav0Var;
        int i3;
        rg50 rg50Var2;
        xvy xvyVar2 = xvyVar;
        if (continuationImpl instanceof pav0) {
            pav0Var = (pav0) continuationImpl;
            int i4 = pav0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pav0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = pav0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = pav0Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    float I0 = azlVar.I0(bVar.b);
                    float I02 = azlVar.I0(kqu0.u) + I0;
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.element = kg50Var.getFloatValue() + (I02 * i2);
                    if (Math.abs(i2) > i) {
                        float I03 = azlVar.I0(wd90Var instanceof wd90.b ? bVar.c : bVar.b);
                        if (i2 < 0) {
                            ref$FloatRef2.element -= I03 - I0;
                        } else {
                            ref$FloatRef2.element = ((I03 - I0) / 8) + ref$FloatRef2.element;
                        }
                    }
                    rav0 rav0Var = new rav0(ref$FloatRef2, aVar, ref$FloatRef, kg50Var, null);
                    pav0Var.L$0 = xvyVar2;
                    rg50Var2 = rg50Var;
                    pav0Var.L$1 = rg50Var2;
                    pav0Var.label = 1;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    rg50 rg50Var3 = (rg50) pav0Var.L$1;
                    xvy xvyVar3 = (xvy) pav0Var.L$0;
                    kotlin.a.a(obj);
                    rg50Var2 = rg50Var3;
                    xvyVar2 = xvyVar3;
                }
                int intValue = rg50Var2.getIntValue();
                pav0Var.L$0 = null;
                pav0Var.L$1 = null;
                pav0Var.label = 2;
                fh9 fh9Var = xvy.y;
            }
        }
        pav0Var = new pav0(continuationImpl);
        Object obj2 = pav0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = pav0Var.label;
        if (i3 != 0) {
        }
        int intValue2 = rg50Var2.getIntValue();
        pav0Var.L$0 = null;
        pav0Var.L$1 = null;
        pav0Var.label = 2;
        fh9 fh9Var2 = xvy.y;
    }
}
