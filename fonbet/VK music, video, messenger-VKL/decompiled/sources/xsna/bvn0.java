package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a5x;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.y2j0;

/* compiled from: TabbarSettingsContentIcon.kt */
/* loaded from: classes6.dex */
public final class bvn0 {

    /* compiled from: TabbarSettingsContentIcon.kt */
    @b6l(c = "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentIconKt$TabbarSettingsContentIcon$1$1", f = "TabbarSettingsContentIcon.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yvj $coroutineScope;
        final /* synthetic */ int $plainIndex;
        final /* synthetic */ if2<Float, sq2> $tabbarChangeScale;
        final /* synthetic */ if2<pco, sq2> $transitionYDiff;
        int label;

        /* compiled from: TabbarSettingsContentIcon.kt */
        @b6l(c = "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentIconKt$TabbarSettingsContentIcon$1$1$1", f = "TabbarSettingsContentIcon.kt", l = {50, 51}, m = "invokeSuspend")
        /* renamed from: xsna.bvn0$a$a, reason: collision with other inner class name */
        public static final class C2625a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ int $plainIndex;
            final /* synthetic */ if2<pco, sq2> $transitionYDiff;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2625a(int i, if2<pco, sq2> if2Var, spj<? super C2625a> spjVar) {
                super(2, spjVar);
                this.$plainIndex = i;
                this.$transitionYDiff = if2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2625a(this.$plainIndex, this.$transitionYDiff, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2625a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (xsna.bvn0.c(r7, r6) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
            
                if (xsna.qsl.b(r4, r6) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    long d = bvn0.d(this.$plainIndex);
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                }
                if2<pco, sq2> if2Var = this.$transitionYDiff;
                this.label = 2;
            }
        }

        /* compiled from: TabbarSettingsContentIcon.kt */
        @b6l(c = "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentIconKt$TabbarSettingsContentIcon$1$1$2", f = "TabbarSettingsContentIcon.kt", l = {54, 55, 62}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ int $plainIndex;
            final /* synthetic */ if2<Float, sq2> $tabbarChangeScale;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, if2<Float, sq2> if2Var, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$plainIndex = i;
                this.$tabbarChangeScale = if2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$plainIndex, this.$tabbarChangeScale, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
            
                if (xsna.if2.c(r0, r1, r2, null, r15, 12) == r6) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
            
                return r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
            
                if (xsna.if2.c(r0, r1, r2, null, r15, 12) == r6) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
            
                if (xsna.qsl.b(r2, r15) == r6) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    long d = bvn0.d(this.$plainIndex);
                    this.label = 1;
                } else if (i == 1) {
                    kotlin.a.a(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                    if2<Float, sq2> if2Var = this.$tabbarChangeScale;
                    Float f = new Float(1.0f);
                    dtp0 d2 = jq2.d(125, 0, new nkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f), 2);
                    this.label = 3;
                }
                if2<Float, sq2> if2Var2 = this.$tabbarChangeScale;
                Float f2 = new Float(0.9f);
                dtp0 d3 = jq2.d(125, 0, new nkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f), 2);
                this.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yvj yvjVar, int i, if2<pco, sq2> if2Var, if2<Float, sq2> if2Var2, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$coroutineScope = yvjVar;
            this.$plainIndex = i;
            this.$transitionYDiff = if2Var;
            this.$tabbarChangeScale = if2Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$coroutineScope, this.$plainIndex, this.$transitionYDiff, this.$tabbarChangeScale, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            myc0.h(this.$coroutineScope, null, null, new C2625a(this.$plainIndex, this.$transitionYDiff, null), 3);
            myc0.h(this.$coroutineScope, null, null, new b(this.$plainIndex, this.$tabbarChangeScale, null), 3);
            return s3q0.a;
        }
    }

    public static final void a(final xvn0 xvn0Var, final int i, final boolean z, final boolean z2, final int i2, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        androidx.compose.runtime.a aVar2;
        long j;
        androidx.compose.runtime.a M = aVar.M(1833613109);
        if ((i3 & 6) == 0) {
            i4 = (M.J(xvn0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.l(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.l(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= M.o(i2) ? 16384 : 8192;
        }
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1833613109, i4, -1, "com.vk.tabbar.settings.impl.compose.IconFromResOrLoad (TabbarSettingsContentIcon.kt:134)");
            }
            aVar2 = M;
            mtk0 b = hg2.b(z ? 1.5f : 1.0f, new dtp0(166, z2 ? d(i) : 0, new nkk(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)), null, null, aVar2, 0, 28);
            int i5 = (i4 >> 6) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(929172767, i5, -1, "com.vk.tabbar.settings.impl.compose.getIconColor (TabbarSettingsContentIcon.kt:173)");
            }
            if (z) {
                aVar2.K(-418164405);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().c;
                aVar2.j();
            } else {
                aVar2.K(-418162838);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().j;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str = xvn0Var.a;
            nvn0.o.getClass();
            boolean f = epx.f(str, nvn0.r);
            aqv aqvVar = xvn0Var.c;
            Integer num = aqvVar.a;
            if (f) {
                aVar2.K(1774616422);
                String str2 = aqvVar.b;
                if (str2 == null) {
                    str2 = "";
                }
                wun0.a(Math.max(0, i2 - 1), 0, aVar2, str2, null, z || xvn0Var.e);
                aVar2 = aVar2;
                aVar2.j();
            } else if (num != null) {
                aVar2.K(1774894058);
                q630 q = txj0.q(q630.a.a, 28);
                boolean J = aVar2.J(b);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new ape0(b, 15);
                    aVar2.R(x);
                }
                pzu0.b(pg90.a(num.intValue(), 0, aVar2), null, rdu.a(q, (izs) x), j, aVar2, 56, 0);
                aVar2 = aVar2;
                aVar2.j();
            } else {
                aVar2.K(1165646873);
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
            s.d = new wzs() { // from class: xsna.avn0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bvn0.a(xvn0.this, i, z, z2, i2, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final xvn0 xvn0Var, final boolean z, final y2j0.a aVar, final int i, androidx.compose.runtime.a aVar2, final int i2) {
        int i3;
        int i4;
        y2j0.a aVar3;
        float f;
        final if2 if2Var;
        Object obj;
        int i5;
        Throwable th;
        androidx.compose.runtime.a M = aVar2.M(-2037504110);
        if ((i2 & 6) == 0) {
            i3 = (M.J(xvn0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2037504110, i3, -1, "com.vk.tabbar.settings.impl.compose.TabbarSettingsContentIcon (TabbarSettingsContentIcon.kt:39)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new if2(new pco(0), rte0.g, null, 12);
                M.R(x2);
            }
            if2 if2Var2 = (if2) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                f = 1.0f;
                x3 = new if2(Float.valueOf(1.0f), rte0.e, null, 12);
                M.R(x3);
            } else {
                f = 1.0f;
            }
            final if2 if2Var3 = (if2) x3;
            Integer valueOf = Integer.valueOf(aVar.e);
            boolean y = ((i3 & 7168) == 2048) | M.y(yvjVar) | M.y(if2Var2) | M.y(if2Var3);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new a(yvjVar, i4, if2Var2, if2Var3, null);
                if2Var = if2Var2;
                M.R(x4);
            } else {
                if2Var = if2Var2;
            }
            bap.g(valueOf, (wzs) x4, M, 0);
            final mtk0 b = hg2.b(z ? 1.15f : f, new dtp0(166, aVar.f ? d(i) : 0, new nkk(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f)), null, null, M, 0, 28);
            q630.a aVar4 = q630.a.a;
            q630 B = txj0.B(aVar4, null, 3);
            q630 q = txj0.q(rte0.d(aVar4, vog0.a), 72);
            yzs yzsVar = new yzs() { // from class: xsna.gvn0
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    q630 q630Var = (q630) obj2;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    aVar5.K(448256879);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(448256879, intValue, -1, "com.vk.tabbar.settings.impl.compose.backgroundForMainItem.<anonymous> (TabbarSettingsContentTable.kt:236)");
                    }
                    if (z) {
                        aVar5.K(1278132306);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var = hr80.m(q630Var, ylu0Var.getBackground().b, vog0.a);
                        aVar5.j();
                    } else if (xvn0Var.d) {
                        aVar5.K(1278138163);
                        aVar5.j();
                    } else {
                        aVar5.K(1278135290);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var = hr80.m(q630Var, ylu0Var2.getBackground().z, vog0.a);
                        aVar5.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar5.j();
                    return q630Var;
                }
            };
            a5x.a aVar5 = a5x.a;
            q630 a2 = qri.a(qri.a(q, aVar5, yzsVar), aVar5, new yzs() { // from class: xsna.hvn0
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    q630 q630Var = (q630) obj2;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    aVar6.K(1582410349);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1582410349, intValue, -1, "com.vk.tabbar.settings.impl.compose.borderForMainItem.<anonymous> (TabbarSettingsContentTable.kt:244)");
                    }
                    xvn0 xvn0Var2 = xvn0.this;
                    boolean z2 = xvn0Var2.d;
                    boolean z3 = z;
                    if (z2 && !z3) {
                        aVar6.K(277924404);
                        float f2 = 1;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var = q630Var.g(bu00.e(q630.a.a, new jtk(vog0.a, f2, 8, 6, 4, new rek0(ylu0Var.p().a))));
                        aVar6.j();
                    } else if (!xvn0Var2.e || z3) {
                        aVar6.K(277933169);
                        aVar6.j();
                    } else {
                        aVar6.K(277929986);
                        float f3 = 2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var = r18.a(f3, ylu0Var2.getBackground().b, q630Var, vog0.a);
                        aVar6.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                    return q630Var;
                }
            });
            boolean y2 = ((i3 & 896) == 256) | ((i3 & 112) == 32) | M.y(if2Var3) | M.y(if2Var) | M.J(b);
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                i5 = i3;
                th = null;
                obj = new izs() { // from class: xsna.yun0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        tdu tduVar = (tdu) obj2;
                        boolean z2 = y2j0.a.this.f;
                        boolean z3 = z;
                        if2 if2Var4 = if2Var;
                        if (!z2 || z3) {
                            mtk0 mtk0Var = b;
                            if (z2 && z3) {
                                tduVar.n(((pco) if2Var4.d()).b);
                                tduVar.A(((Number) mtk0Var.getValue()).floatValue());
                                tduVar.B(((Number) mtk0Var.getValue()).floatValue());
                            } else {
                                tduVar.A(((Number) mtk0Var.getValue()).floatValue());
                                tduVar.B(((Number) mtk0Var.getValue()).floatValue());
                                tduVar.Y0(lkp0.b);
                            }
                        } else {
                            if2 if2Var5 = if2Var3;
                            tduVar.A(((Number) if2Var5.d()).floatValue());
                            tduVar.B(((Number) if2Var5.d()).floatValue());
                            tduVar.Y0(f370.i(0.5f, 1.0f));
                            tduVar.n(((pco) if2Var4.d()).b);
                        }
                        return s3q0.a;
                    }
                };
                aVar3 = aVar;
                M.R(obj);
            } else {
                aVar3 = aVar;
                i5 = i3;
                obj = x5;
                th = null;
            }
            q630 a3 = rdu.a(aVar4, (izs) obj);
            String str = xvn0Var.a;
            nvn0.o.getClass();
            if (!epx.f(str, nvn0.r)) {
                B = a2;
            }
            q630 g = a3.g(B);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            a(xvn0Var, i, z, aVar3.f, aVar3.g.size(), M, (i5 & 14) | ((i5 >> 6) & 112) | ((i5 << 3) & 896));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = aVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final y2j0.a aVar7 = aVar3;
            s.d = new wzs() { // from class: xsna.zun0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    bvn0.b(xvn0.this, z, aVar7, i, (androidx.compose.runtime.a) obj2, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if (xsna.if2.c(r1, r2, r3, null, r5, 12) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (xsna.if2.c(r1, r2, r3, null, r5, 12) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(if2 if2Var, ContinuationImpl continuationImpl) {
        cvn0 cvn0Var;
        int i;
        if2 if2Var2;
        if (continuationImpl instanceof cvn0) {
            cvn0Var = (cvn0) continuationImpl;
            int i2 = cvn0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cvn0Var.label = i2 - Integer.MIN_VALUE;
                cvn0 cvn0Var2 = cvn0Var;
                Object obj = cvn0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cvn0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    pco pcoVar = new pco(10);
                    dtp0 d = jq2.d(125, 0, new nkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f), 2);
                    cvn0Var2.L$0 = if2Var;
                    cvn0Var2.label = 1;
                    if2Var2 = if2Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    if2 if2Var3 = (if2) cvn0Var2.L$0;
                    kotlin.a.a(obj);
                    if2Var2 = if2Var3;
                }
                pco pcoVar2 = new pco(0);
                dtp0 d2 = jq2.d(125, 0, new nkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f), 2);
                cvn0Var2.L$0 = null;
                cvn0Var2.label = 2;
            }
        }
        cvn0Var = new cvn0(continuationImpl);
        cvn0 cvn0Var22 = cvn0Var;
        Object obj2 = cvn0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cvn0Var22.label;
        if (i != 0) {
        }
        pco pcoVar22 = new pco(0);
        dtp0 d22 = jq2.d(125, 0, new nkk(0.33f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.67f, 1.0f), 2);
        cvn0Var22.L$0 = null;
        cvn0Var22.label = 2;
    }

    public static final int d(int i) {
        switch (i) {
        }
        return 0;
    }
}
