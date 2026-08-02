package xsna;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.imageloader.fresco.CallerContext;
import com.vk.imageloader.fresco.Quality;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bp10;
import xsna.chs;
import xsna.cri;
import xsna.dmw;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkFrescoImage.kt */
/* loaded from: classes17.dex */
public final class fwu0 {

    /* compiled from: VkFrescoImage.kt */
    @b6l(c = "com.vk.core.compose.image.fresco.VkFrescoImageKt$rememberRequestPainterInternal$2$1", f = "VkFrescoImage.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ lpa0 $controllerBuilder;
        final /* synthetic */ ImageRequest $currentFallbackRequest;
        final /* synthetic */ flo<njt> $draweeHolder;
        final /* synthetic */ ImageRequest[] $imageRequestArray;
        final /* synthetic */ wh50<Boolean> $isFallbackRequestUsed$delegate;
        final /* synthetic */ c $listener;
        final /* synthetic */ ImageRequest $localRequest;
        final /* synthetic */ gzs<ImageRequest> $lowQualityRequest;
        final /* synthetic */ boolean $playAnimations;
        final /* synthetic */ ImageRequest $remoteRequest;
        final /* synthetic */ tjo $xmlDrawableFactory;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ImageRequest imageRequest, Context context, flo<njt> floVar, lpa0 lpa0Var, ImageRequest[] imageRequestArr, c cVar, tjo tjoVar, boolean z, ImageRequest imageRequest2, ImageRequest imageRequest3, gzs<? extends ImageRequest> gzsVar, wh50<Boolean> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$currentFallbackRequest = imageRequest;
            this.$context = context;
            this.$draweeHolder = floVar;
            this.$controllerBuilder = lpa0Var;
            this.$imageRequestArray = imageRequestArr;
            this.$listener = cVar;
            this.$xmlDrawableFactory = tjoVar;
            this.$playAnimations = z;
            this.$localRequest = imageRequest2;
            this.$remoteRequest = imageRequest3;
            this.$lowQualityRequest = gzsVar;
            this.$isFallbackRequestUsed$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$currentFallbackRequest, this.$context, this.$draweeHolder, this.$controllerBuilder, this.$imageRequestArray, this.$listener, this.$xmlDrawableFactory, this.$playAnimations, this.$localRequest, this.$remoteRequest, this.$lowQualityRequest, this.$isFallbackRequestUsed$delegate, spjVar);
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
            if (this.$isFallbackRequestUsed$delegate.getValue().booleanValue() || this.$currentFallbackRequest == null) {
                this.$isFallbackRequestUsed$delegate.setValue(Boolean.FALSE);
                fwu0.d(this.$context, this.$draweeHolder, this.$controllerBuilder, this.$imageRequestArray, this.$listener, this.$xmlDrawableFactory, this.$localRequest, this.$remoteRequest, this.$playAnimations, this.$lowQualityRequest);
            } else {
                this.$isFallbackRequestUsed$delegate.setValue(Boolean.TRUE);
                fwu0.e(this.$context, this.$draweeHolder, this.$controllerBuilder, this.$imageRequestArray, this.$listener, this.$xmlDrawableFactory, this.$currentFallbackRequest, this.$playAnimations, 640);
            }
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class b implements kgn {
        public final /* synthetic */ io.reactivex.rxjava3.disposables.c a;

        public b(io.reactivex.rxjava3.disposables.c cVar) {
            this.a = cVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            io.reactivex.rxjava3.disposables.c cVar = this.a;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    /* compiled from: VkFrescoImage.kt */
    public static final class d implements ma80, g0t {
        public final /* synthetic */ izs b;

        public d(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.ma80
        public final /* synthetic */ void a(Quality quality) {
            this.b.invoke(quality);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ma80) && (obj instanceof g0t)) {
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

    public static final void a(final q630 q630Var, List list, final List list2, gzs gzsVar, float f, boolean z, izs izsVar, izs izsVar2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final float f2;
        izs izsVar3;
        int i3;
        final gzs gzsVar2;
        final izs izsVar4;
        final List list3;
        final izs izsVar5;
        androidx.compose.runtime.a aVar2;
        final boolean z2;
        final izs izsVar6;
        int i4;
        final izs izsVar7;
        final gzs gzsVar3;
        final float f3;
        final boolean z3;
        int i5;
        List list4 = list;
        androidx.compose.runtime.a M = aVar.M(781792001);
        int i6 = (M.J(q630Var) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            i6 |= M.J(list4 != null ? new wow(list4) : null) ? 32 : 16;
        }
        int i8 = i6 | (M.J(list2 != null ? new wow(list2) : null) ? 256 : 128) | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f2 = f;
                if (M.n(f2)) {
                    i5 = 16384;
                    i8 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 8192;
            i8 |= i5;
        } else {
            f2 = f;
        }
        int i9 = 14352384 | i8;
        int i10 = i2 & 256;
        if (i10 != 0) {
            i3 = i8 | 115015680;
            izsVar3 = izsVar;
        } else {
            izsVar3 = izsVar;
            i3 = i9 | (M.y(izsVar3) ? 67108864 : 33554432);
        }
        int i11 = i3 | 805306368;
        if (M.t(i11 & 1, (306783379 & i11) != 306783378)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (i7 != 0) {
                    list4 = EmptyList.b;
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new c24(0);
                    M.R(x);
                }
                gzs gzsVar4 = (gzs) x;
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    f2 = -1.0f;
                }
                if (i10 != 0) {
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new n0m0(16);
                        M.R(x2);
                    }
                    izsVar3 = (izs) x2;
                }
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new p6e0(23);
                    M.R(x3);
                }
                izsVar6 = (izs) x3;
                i4 = i11;
                izsVar7 = izsVar3;
                gzsVar3 = gzsVar4;
                f3 = f2;
                z3 = true;
            } else {
                M.h();
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                }
                izsVar6 = izsVar2;
                f3 = f2;
                i4 = i11;
                z3 = z;
                izsVar7 = izsVar3;
                gzsVar3 = gzsVar;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(781792001, i4, 6, "com.vk.core.compose.image.fresco.VkFrescoImage (VkFrescoImage.kt:101)");
            }
            final List list5 = list4;
            gzs gzsVar5 = gzsVar3;
            float f4 = f3;
            boolean z4 = z3;
            izs izsVar8 = izsVar7;
            izs izsVar9 = izsVar6;
            ua8.a(q630Var, null, true, kai.c(229798763, new yzs() { // from class: xsna.uvu0
                /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0175  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int makeMeasureSpec;
                    int i12;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    int i13 = 0;
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(229798763, intValue, -1, "com.vk.core.compose.image.fresco.VkFrescoImage.<anonymous> (VkFrescoImage.kt:105)");
                        }
                        int i14 = intValue & 14;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-350052510, i14, -1, "com.vk.core.compose.image.fresco.rememberBestPainterWithState (VkFrescoImage.kt:219)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1366552972, i14, -1, "com.vk.core.compose.image.fresco.measure (VkFrescoImage.kt:893)");
                        }
                        float j = va8Var.j();
                        Object x4 = aVar3.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (x4 == c0012a2) {
                            x4 = new cy20(25);
                            aVar3.R(x4);
                        }
                        float n = yiz.n(j, (gzs) x4);
                        float g = va8Var.g();
                        Object x5 = aVar3.x();
                        if (x5 == c0012a2) {
                            x5 = new e1m0(15);
                            aVar3.R(x5);
                        }
                        float n2 = yiz.n(g, (gzs) x5);
                        float h = va8Var.h();
                        Object x6 = aVar3.x();
                        if (x6 == c0012a2) {
                            x6 = new w0o0(12);
                            aVar3.R(x6);
                        }
                        float n3 = yiz.n(h, (gzs) x6);
                        float i15 = va8Var.i();
                        Object x7 = aVar3.x();
                        if (x7 == c0012a2) {
                            x7 = new fd90(24);
                            aVar3.R(x7);
                        }
                        float n4 = yiz.n(i15, (gzs) x7);
                        if (o6j.e(va8Var.f())) {
                            if (o6j.g(va8Var.f())) {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(o6j.i(va8Var.f()), 1073741824);
                            } else if (o6j.i(va8Var.f()) != 0) {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(o6j.i(va8Var.f()), Integer.MIN_VALUE);
                            }
                            i12 = makeMeasureSpec;
                            if (o6j.d(va8Var.f())) {
                                if (o6j.f(va8Var.f())) {
                                    i13 = View.MeasureSpec.makeMeasureSpec(o6j.h(va8Var.f()), 1073741824);
                                } else if (o6j.h(va8Var.f()) != 0) {
                                    i13 = View.MeasureSpec.makeMeasureSpec(o6j.h(va8Var.f()), Integer.MIN_VALUE);
                                }
                            }
                            List list6 = list5;
                            List list7 = list2;
                            gzs gzsVar6 = gzsVar3;
                            bp10.b f5 = fwu0.f(list6, list7, gzsVar6, f3, n, n2, n4, n3, i12, i13, aVar3, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            Pair g2 = fwu0.g(f5, list6, list7, gzsVar6, z3, null, null, izsVar7, izsVar6, aVar3, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            jaiVar.invoke(va8Var, (chs) g2.d(), (lg90) g2.g(), aVar3, Integer.valueOf(i14 | 512));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        }
                        i12 = 0;
                        if (o6j.d(va8Var.f())) {
                        }
                        List list62 = list5;
                        List list72 = list2;
                        gzs gzsVar62 = gzsVar3;
                        bp10.b f52 = fwu0.f(list62, list72, gzsVar62, f3, n, n2, n4, n3, i12, i13, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        Pair g22 = fwu0.g(f52, list62, list72, gzsVar62, z3, null, null, izsVar7, izsVar6, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                        }
                        jaiVar.invoke(va8Var, (chs) g22.d(), (lg90) g22.g(), aVar3, Integer.valueOf(i14 | 512));
                        if (androidx.compose.runtime.b.d()) {
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i4 & 14) | 3456, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            gzsVar2 = gzsVar5;
            list3 = list5;
            aVar2 = M;
            f2 = f4;
            z2 = z4;
            izsVar5 = izsVar8;
            izsVar4 = izsVar9;
        } else {
            M.h();
            gzsVar2 = gzsVar;
            izsVar4 = izsVar2;
            list3 = list4;
            izsVar5 = izsVar3;
            aVar2 = M;
            z2 = z;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vvu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fwu0.a(q630.this, list3, list2, gzsVar2, f2, z2, izsVar5, izsVar4, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02cf, code lost:
    
        if (r12.J(r8) == false) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Object obj, q630 q630Var, gzs gzsVar, izs izsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        androidx.compose.runtime.a aVar2;
        final gzs gzsVar2;
        final izs izsVar2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        int i5;
        q630 q630Var4;
        boolean z;
        boolean z2;
        Object x;
        flo floVar;
        gzs gzsVar3;
        int i6;
        izs izsVar3;
        Pair pair;
        Object obj2 = obj;
        androidx.compose.runtime.a M = aVar.M(1651557914);
        if ((i & 6) == 0) {
            i3 = (M.J(obj2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i3 | 3456;
            if ((i & 24576) == 0) {
                i4 |= M.y(jaiVar) ? 16384 : 8192;
            }
            if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
                aVar2 = M;
                aVar2.h();
                gzsVar2 = gzsVar;
                izsVar2 = izsVar;
                q630Var3 = q630Var2;
            } else {
                q630 q630Var5 = i7 != 0 ? q630.a.a : q630Var2;
                Object x2 = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x2 == c0012a) {
                    x2 = awu0.b;
                    M.R(x2);
                }
                gzs gzsVar4 = (gzs) x2;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new fxi0(11);
                    M.R(x3);
                }
                izs izsVar4 = (izs) x3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1651557914, i4, -1, "com.vk.core.compose.image.fresco.VkFrescoImage (VkFrescoImage.kt:654)");
                }
                int i8 = i4 & 14;
                int i9 = i4 >> 3;
                int i10 = i8 | (i9 & 112) | (i9 & 896);
                M.K(94421565);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(94421565, i10, -1, "com.vk.core.compose.image.fresco.rememberDataSourcePainterWithState (VkFrescoImage.kt:683)");
                }
                boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
                chs.d dVar = chs.d.a;
                if (booleanValue) {
                    M.K(-290398590);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(dVar, new y6g(ylu0Var.getImage().b));
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    gzsVar3 = gzsVar4;
                    izsVar3 = izsVar4;
                    q630Var4 = q630Var5;
                    i6 = i9;
                } else {
                    M.K(-317784827);
                    M.j();
                    Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                    Object x4 = M.x();
                    if (x4 == c0012a) {
                        x4 = rhs.e();
                        M.R(x4);
                    }
                    lpa0 lpa0Var = (lpa0) x4;
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        x5 = new wgs();
                        M.R(x5);
                    }
                    tjo tjoVar = (tjo) x5;
                    Object x6 = M.x();
                    Object obj3 = x6;
                    if (x6 == c0012a) {
                        ImageRequest[] imageRequestArr = {null, null};
                        M.R(imageRequestArr);
                        obj3 = imageRequestArr;
                    }
                    ImageRequest[] imageRequestArr2 = (ImageRequest[]) obj3;
                    Object x7 = M.x();
                    if (x7 == c0012a) {
                        i5 = i10;
                        ojt ojtVar = new ojt(context.getResources());
                        izsVar4.invoke(ojtVar);
                        x7 = ojtVar.a();
                        M.R(x7);
                    } else {
                        i5 = i10;
                    }
                    njt njtVar = (njt) x7;
                    boolean J = M.J(njtVar);
                    Object x8 = M.x();
                    if (J || x8 == c0012a) {
                        x8 = new flo(njtVar);
                        M.R(x8);
                    }
                    flo floVar2 = (flo) x8;
                    zuk zukVar = (zuk) obj2;
                    boolean J2 = M.J(zukVar);
                    Object x9 = M.x();
                    if (J2 || x9 == c0012a) {
                        x9 = androidx.compose.runtime.k.b(dVar);
                        M.R(x9);
                    }
                    wh50 wh50Var = (wh50) x9;
                    dmw dmwVar = mcr0.j;
                    dmw.b bVar = dmwVar != null ? dmwVar.b : null;
                    boolean J3 = M.J(bVar);
                    Object x10 = M.x();
                    if (J3 || x10 == c0012a) {
                        x10 = Integer.valueOf(bVar != null ? 2 : 1);
                        M.R(x10);
                    }
                    int intValue = ((Number) x10).intValue();
                    boolean J4 = M.J(bVar);
                    dmw.b bVar2 = bVar;
                    Object x11 = M.x();
                    if (J4 || x11 == c0012a) {
                        x11 = Long.valueOf(bVar2 != null ? 20000L : 10000L);
                        M.R(x11);
                    }
                    final long longValue = ((Number) x11).longValue();
                    boolean J5 = M.J(zukVar);
                    Object x12 = M.x();
                    if (J5 || x12 == c0012a) {
                        x12 = qq.h(0, M);
                    }
                    final wh50 wh50Var2 = (wh50) x12;
                    boolean J6 = M.J(zukVar);
                    Object x13 = M.x();
                    if (J6 || x13 == c0012a) {
                        x13 = androidx.compose.runtime.k.b(Boolean.TRUE);
                        M.R(x13);
                    }
                    wh50 wh50Var3 = (wh50) x13;
                    Object x14 = M.x();
                    if (x14 == c0012a) {
                        x14 = androidx.compose.runtime.k.b(Boolean.FALSE);
                        M.R(x14);
                    }
                    final wh50 wh50Var4 = (wh50) x14;
                    q630Var4 = q630Var5;
                    boolean z3 = ((i5 & 112) ^ 48) > 32 && M.J(gzsVar4);
                    Object x15 = M.x();
                    if (z3 || x15 == c0012a) {
                        x15 = (ImageRequest) gzsVar4.invoke();
                        M.R(x15);
                    }
                    ImageRequest imageRequest = (ImageRequest) x15;
                    Object x16 = M.x();
                    if (x16 == c0012a) {
                        x16 = new ewu0(wh50Var, wh50Var2, intValue);
                        M.R(x16);
                    }
                    ewu0 ewu0Var = (ewu0) x16;
                    Integer valueOf = Integer.valueOf(i(wh50Var2));
                    boolean J7 = M.J(wh50Var2) | M.p(longValue);
                    Object x17 = M.x();
                    if (J7 || x17 == c0012a) {
                        x17 = new izs() { // from class: xsna.yvu0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // xsna.izs
                            public final Object invoke(Object obj4) {
                                io.reactivex.rxjava3.disposables.c subscribe;
                                wh50 wh50Var5 = wh50.this;
                                if (((Number) wh50Var5.getValue()).intValue() == 0) {
                                    subscribe = null;
                                } else {
                                    com.vk.core.utils.newtork.b.a.getClass();
                                    subscribe = com.vk.core.utils.newtork.b.f().x0().t0(1L).L(new hi70(new g5h(longValue, wh50Var5), 14), false).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new o330(new cue0(1, wh50Var4), 27));
                                }
                                return new luf0(subscribe, 1);
                            }
                        };
                        M.R(x17);
                    }
                    bap.c(valueOf, (izs) x17, M, 0);
                    Boolean bool = (Boolean) wh50Var4.getValue();
                    bool.getClass();
                    boolean J8 = M.J(wh50Var3) | M.y(imageRequest) | M.y(context) | M.y(floVar2) | M.y(lpa0Var) | M.y(imageRequestArr2) | M.y(tjoVar);
                    if (((i5 & 14) ^ 6) > 4) {
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                    }
                    if ((i5 & 6) != 4) {
                        z = false;
                        z2 = J8 | z;
                        x = M.x();
                        if (!z2 || x == c0012a) {
                            floVar = floVar2;
                            gzsVar3 = gzsVar4;
                            i6 = i9;
                            izsVar3 = izsVar4;
                            dwu0 dwu0Var = new dwu0(imageRequest, context, floVar, lpa0Var, imageRequestArr2, ewu0Var, tjoVar, obj2, wh50Var3, null);
                            M.R(dwu0Var);
                            x = dwu0Var;
                        } else {
                            i6 = i9;
                            izsVar3 = izsVar4;
                            floVar = floVar2;
                            gzsVar3 = gzsVar4;
                        }
                        bap.f(obj2, bool, (wzs) x, M, 0);
                        Pair pair2 = new Pair((chs) wh50Var.getValue(), w65.p(floVar.d(), M, 0));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        pair = pair2;
                    }
                    z = true;
                    z2 = J8 | z;
                    x = M.x();
                    if (z2) {
                    }
                    floVar = floVar2;
                    gzsVar3 = gzsVar4;
                    i6 = i9;
                    izsVar3 = izsVar4;
                    dwu0 dwu0Var2 = new dwu0(imageRequest, context, floVar, lpa0Var, imageRequestArr2, ewu0Var, tjoVar, obj2, wh50Var3, null);
                    M.R(dwu0Var2);
                    x = dwu0Var2;
                    bap.f(obj2, bool, (wzs) x, M, 0);
                    Pair pair22 = new Pair((chs) wh50Var.getValue(), w65.p(floVar.d(), M, 0));
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    pair = pair22;
                }
                chs chsVar = (chs) pair.d();
                lg90 lg90Var = (lg90) pair.g();
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 q630Var6 = q630Var4;
                q630 c2 = qri.c(M, q630Var6);
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
                k9q0.w(M, c2, cri.a.d);
                aVar2 = M;
                jaiVar.invoke(ra8.a, chsVar, lg90Var, aVar2, Integer.valueOf((i6 & 7168) | 518));
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var6;
                gzsVar2 = gzsVar3;
                izsVar2 = izsVar3;
            }
            s = aVar2.s();
            if (s == null) {
                final Object obj4 = obj2;
                s.d = new wzs() { // from class: xsna.xvu0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj5, Object obj6) {
                        ((Integer) obj6).getClass();
                        fwu0.b(obj4, q630Var3, gzsVar2, izsVar2, jaiVar, (androidx.compose.runtime.a) obj5, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i3 | 3456;
        if ((i & 24576) == 0) {
        }
        if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(q630 q630Var, String str, String str2, gzs gzsVar, gzs gzsVar2, izs izsVar, qow qowVar, final a0t a0tVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        String str4;
        int i5;
        gzs gzsVar3;
        int i6;
        int i7;
        qow qowVar2;
        int i8;
        final q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final String str5;
        final String str6;
        final izs izsVar2;
        final gzs gzsVar4;
        final gzs gzsVar5;
        androidx.compose.runtime.f s;
        int i9;
        izs izsVar3;
        androidx.compose.runtime.a M = aVar.M(-397232090);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str;
            i3 |= M.J(str3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str4 = str2;
                i3 |= M.J(str4) ? 256 : 128;
                int i12 = i3 | 3072;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i12 = i3 | 27648;
                } else if ((i & 24576) == 0) {
                    gzsVar3 = gzsVar2;
                    i12 |= M.y(gzsVar3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i12 |= 196608;
                    } else if ((196608 & i) == 0) {
                        i12 |= M.y(izsVar) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i12 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            qowVar2 = qowVar;
                            i12 |= M.J(qowVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            i8 = i12 | 12582912;
                            if ((i & 100663296) == 0) {
                                i8 |= M.y(a0tVar) ? 67108864 : 33554432;
                            }
                            if (M.t(i8 & 1, (i8 & 38347923) == 38347922)) {
                                M.h();
                                q630Var2 = q630Var;
                                aVar2 = M;
                                str5 = str3;
                                str6 = str4;
                                izsVar2 = izsVar;
                                gzsVar4 = gzsVar3;
                                gzsVar5 = gzsVar;
                            } else {
                                q630 q630Var3 = i10 != 0 ? q630.a.a : q630Var;
                                if (i11 != 0) {
                                    str3 = null;
                                }
                                String str7 = i4 != 0 ? null : str4;
                                Object x = M.x();
                                a.C0011a.C0012a c0012a = a.C0011a.a;
                                if (x == c0012a) {
                                    x = bwu0.b;
                                    M.R(x);
                                }
                                gzs gzsVar6 = (gzs) x;
                                if (i5 != 0) {
                                    Object x2 = M.x();
                                    if (x2 == c0012a) {
                                        x2 = qfy.d;
                                        M.R(x2);
                                    }
                                    gzsVar3 = (gzs) x2;
                                }
                                gzs gzsVar7 = gzsVar3;
                                if (i6 != 0) {
                                    Object x3 = M.x();
                                    if (x3 == c0012a) {
                                        x3 = new pmp0(6);
                                        M.R(x3);
                                    }
                                    izsVar3 = (izs) x3;
                                    i9 = i7;
                                } else {
                                    i9 = i7;
                                    izsVar3 = izsVar;
                                }
                                if (i9 != 0) {
                                    qowVar2 = null;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-397232090, i8, -1, "com.vk.core.compose.image.fresco.VkFrescoImage (VkFrescoImage.kt:348)");
                                }
                                int i13 = (i8 >> 3) & 4194302;
                                int i14 = i8;
                                String str8 = str3;
                                Pair m = m(str8, str7, gzsVar6, gzsVar7, izsVar3, qowVar2, M, i13, 0);
                                chs chsVar = (chs) m.d();
                                lg90 lg90Var = (lg90) m.g();
                                dt1.a.getClass();
                                cp10 d2 = ja8.d(dt1.a.b, false);
                                int hashCode = Long.hashCode(n34.n(M));
                                sy90 D = M.D();
                                q630 c2 = qri.c(M, q630Var3);
                                cri.h7.getClass();
                                q630 q630Var4 = q630Var3;
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
                                k9q0.w(M, c2, cri.a.d);
                                a0tVar.invoke(ra8.a, chsVar, lg90Var, M, Integer.valueOf(((i14 >> 15) & 7168) | 518));
                                M.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                str5 = str8;
                                str6 = str7;
                                gzsVar5 = gzsVar6;
                                izsVar2 = izsVar3;
                                q630Var2 = q630Var4;
                                aVar2 = M;
                                gzsVar4 = gzsVar7;
                            }
                            final qow qowVar3 = qowVar2;
                            s = aVar2.s();
                            if (s == null) {
                                s.d = new wzs() { // from class: xsna.svu0
                                    @Override // xsna.wzs
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        fwu0.c(q630.this, str5, str6, gzsVar5, gzsVar4, izsVar2, qowVar3, a0tVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                        return s3q0.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        qowVar2 = qowVar;
                        i8 = i12 | 12582912;
                        if ((i & 100663296) == 0) {
                        }
                        if (M.t(i8 & 1, (i8 & 38347923) == 38347922)) {
                        }
                        final qow qowVar32 = qowVar2;
                        s = aVar2.s();
                        if (s == null) {
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    qowVar2 = qowVar;
                    i8 = i12 | 12582912;
                    if ((i & 100663296) == 0) {
                    }
                    if (M.t(i8 & 1, (i8 & 38347923) == 38347922)) {
                    }
                    final qow qowVar322 = qowVar2;
                    s = aVar2.s();
                    if (s == null) {
                    }
                }
                gzsVar3 = gzsVar2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                qowVar2 = qowVar;
                i8 = i12 | 12582912;
                if ((i & 100663296) == 0) {
                }
                if (M.t(i8 & 1, (i8 & 38347923) == 38347922)) {
                }
                final qow qowVar3222 = qowVar2;
                s = aVar2.s();
                if (s == null) {
                }
            }
            str4 = str2;
            int i122 = i3 | 3072;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            gzsVar3 = gzsVar2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            qowVar2 = qowVar;
            i8 = i122 | 12582912;
            if ((i & 100663296) == 0) {
            }
            if (M.t(i8 & 1, (i8 & 38347923) == 38347922)) {
            }
            final qow qowVar32222 = qowVar2;
            s = aVar2.s();
            if (s == null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        int i1222 = i3 | 3072;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        gzsVar3 = gzsVar2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        qowVar2 = qowVar;
        i8 = i1222 | 12582912;
        if ((i & 100663296) == 0) {
        }
        if (M.t(i8 & 1, (i8 & 38347923) == 38347922)) {
        }
        final qow qowVar322222 = qowVar2;
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static final void d(Context context, flo<njt> floVar, lpa0 lpa0Var, ImageRequest[] imageRequestArr, kqj<mjw> kqjVar, tjo tjoVar, ImageRequest imageRequest, ImageRequest imageRequest2, boolean z, gzs<? extends ImageRequest> gzsVar) {
        dlo dloVar = floVar.e;
        if (imageRequest == 0 && imageRequest2 == 0) {
            gzsVar = null;
        }
        lpa0Var.d();
        lpa0Var.l = dloVar;
        ?? invoke = gzsVar != null ? gzsVar.invoke() : 0;
        if (imageRequest != 0 && imageRequest2 != 0) {
            imageRequestArr[0] = imageRequest2;
            imageRequestArr[1] = imageRequest;
            lpa0Var.k(imageRequestArr);
        } else if (imageRequest != 0) {
            lpa0Var.c = imageRequest;
        } else if (imageRequest2 != 0) {
            if (epx.f(imageRequest2.b, invoke != 0 ? invoke.b : null)) {
                lpa0Var.c = imageRequest2;
            } else {
                lpa0Var.c = imageRequest2;
                lpa0Var.d = invoke;
            }
        }
        lpa0Var.j = z;
        lpa0Var.h = kqjVar;
        lpa0Var.b = CallerContext.Frontend;
        yiz.b(lpa0Var, context, tjoVar);
        floVar.h(lpa0Var.b());
    }

    public static /* synthetic */ void e(Context context, flo floVar, lpa0 lpa0Var, ImageRequest[] imageRequestArr, kqj kqjVar, tjo tjoVar, ImageRequest imageRequest, boolean z, int i) {
        d(context, floVar, lpa0Var, imageRequestArr, kqjVar, tjoVar, imageRequest, null, (i & 256) != 0 ? false : z, rfy.d);
    }

    public static final bp10.b f(List list, List list2, gzs gzsVar, float f, float f2, float f3, float f4, float f5, int i, int i2, androidx.compose.runtime.a aVar, int i3) {
        Object b2;
        Object b3;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1344858346, i3, -1, "com.vk.core.compose.image.fresco.measureInternal (VkFrescoImage.kt:928)");
        }
        int i4 = i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(383306415, i4, -1, "com.vk.core.compose.image.fresco.rememberBestImage (VkFrescoImage.kt:957)");
        }
        sr10 sr10Var = dy2.a;
        boolean l = aVar.l(sr10Var != null ? sr10Var.c() : true) | ((((i3 & 14) ^ 6) > 4 && aVar.J(list)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && aVar.J(list2)) || (i3 & 48) == 32) | aVar.l(((Boolean) gzsVar.invoke()).booleanValue());
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (l || x == obj) {
            wow wowVar = new wow(list);
            wow wowVar2 = new wow(list2);
            sr10 sr10Var2 = dy2.a;
            if ((sr10Var2 != null ? sr10Var2.c() : true) || ((Boolean) gzsVar.invoke()).booleanValue()) {
                b2 = ixj0.b(wowVar);
                if (b2 == null) {
                    b3 = ixj0.b(wowVar2);
                    x = b3;
                }
                x = b2;
            } else {
                b2 = x3r0.a(wowVar);
                if (b2 == null) {
                    b3 = x3r0.a(wowVar2);
                    x = b3;
                }
                x = b2;
            }
            aVar.R(x);
        }
        fxj0 fxj0Var = (fxj0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        boolean J = aVar.J(fxj0Var) | ((((57344 & i3) ^ 24576) > 16384 && aVar.n(f2)) || (i3 & 24576) == 16384) | ((((458752 & i3) ^ 196608) > 131072 && aVar.n(f3)) || (i3 & 196608) == 131072) | ((((3670016 & i3) ^ 1572864) > 1048576 && aVar.n(f4)) || (i3 & 1572864) == 1048576) | ((((29360128 & i3) ^ 12582912) > 8388608 && aVar.n(f5)) || (i3 & 12582912) == 8388608) | ((((i3 & 7168) ^ 3072) > 2048 && aVar.n(f)) || (i3 & 3072) == 2048);
        Object x2 = aVar.x();
        Object obj2 = x2;
        if (J || x2 == obj) {
            bp10.a aVar2 = new bp10.a();
            int width = fxj0Var != null ? fxj0Var.getWidth() : 0;
            Integer valueOf = Integer.valueOf(width);
            if (!(width > 0)) {
                valueOf = null;
            }
            aVar2.a = valueOf != null ? valueOf.intValue() : 200;
            int height = fxj0Var != null ? fxj0Var.getHeight() : 0;
            Integer valueOf2 = height > 0 ? Integer.valueOf(height) : null;
            aVar2.b = valueOf2 != null ? valueOf2.intValue() : 200;
            aVar2.c = i;
            aVar2.d = i2;
            aVar2.e = azlVar.r0(f5);
            aVar2.f = azlVar.r0(f4);
            aVar2.g = azlVar.r0(f2);
            aVar2.h = azlVar.r0(f3);
            aVar2.l = f;
            aVar.R(aVar2);
            obj2 = aVar2;
        }
        bp10.a aVar3 = (bp10.a) obj2;
        Object x3 = aVar.x();
        if (x3 == obj) {
            x3 = new bp10.b();
            aVar.R(x3);
        }
        bp10.b bVar = (bp10.b) x3;
        bp10.d(aVar3, bVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair g(final bp10.b bVar, final List list, final List list2, final gzs gzsVar, final boolean z, final qow qowVar, qow qowVar2, izs izsVar, izs izsVar2, androidx.compose.runtime.a aVar, int i) {
        jwx jwxVar;
        ImageRequest imageRequest;
        ImageRequestBuilder c2;
        ImageRequest imageRequest2;
        ImageRequest imageRequest3;
        ImageRequestBuilder c3;
        ImageRequest imageRequest4;
        ktc0 ktc0Var;
        T t;
        int i2;
        boolean z2;
        boolean z3;
        boolean y;
        Object x;
        boolean y2;
        Object x2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(16747432, i, -1, "com.vk.core.compose.image.fresco.rememberBestPainterInternal (VkFrescoImage.kt:252)");
        }
        Object x3 = aVar.x();
        Object obj = a.C0011a.a;
        if (x3 == obj) {
            x3 = new jwx(2, 1);
            aVar.R(x3);
        }
        jwx jwxVar2 = (jwx) x3;
        wh50 c4 = androidx.compose.runtime.k.c(izsVar2, aVar, (i >> 24) & 14);
        Object x4 = aVar.x();
        if (x4 == obj) {
            x4 = new d((izs) c4.getValue());
            aVar.R(x4);
        }
        ma80 ma80Var = (ma80) x4;
        int i3 = bVar.b;
        int i4 = bVar.a;
        wow wowVar = list != null ? new wow(list) : null;
        int i5 = i >> 3;
        int i6 = i & 458752;
        int i7 = (i << 6) & 3670016;
        int i8 = i6 | i7;
        if (androidx.compose.runtime.b.d()) {
            jwxVar = jwxVar2;
            androidx.compose.runtime.b.f(-1359571670, i8, -1, "com.vk.core.compose.image.fresco.rememberLocalImage (VkFrescoImage.kt:977)");
        } else {
            jwxVar = jwxVar2;
        }
        boolean J = aVar.J(wowVar) | aVar.o(i4) | aVar.o(i3);
        Object x5 = aVar.x();
        if (J || x5 == obj) {
            fxj0 b2 = x3r0.b(wowVar, i4, i3, gzsVar, z);
            if (b2 == null || (c2 = x3r0.c(b2, i4, i3, z)) == null) {
                imageRequest = null;
            } else {
                c2.k = qowVar != null ? (ktc0) qowVar.a : null;
                c2.l = new hhs(Quality.SUITABLE, new y3l0(ma80Var, 26));
                imageRequest = c2.a();
            }
            x5 = new llw(b2, imageRequest);
            aVar.R(x5);
        }
        llw llwVar = (llw) x5;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        fxj0 fxj0Var = llwVar.a;
        ImageRequest imageRequest5 = llwVar.b;
        wow wowVar2 = list2 != null ? new wow(list2) : null;
        int i9 = i6 | i7;
        if (androidx.compose.runtime.b.d()) {
            imageRequest2 = imageRequest5;
            androidx.compose.runtime.b.f(-529025957, i9, -1, "com.vk.core.compose.image.fresco.rememberRemoteImage (VkFrescoImage.kt:999)");
        } else {
            imageRequest2 = imageRequest5;
        }
        boolean J2 = aVar.J(wowVar2) | aVar.o(i4) | aVar.o(i3);
        Object x6 = aVar.x();
        if (J2 || x6 == obj) {
            fxj0 b3 = x3r0.b(wowVar2, i4, i3, gzsVar, z);
            if (b3 == null || (c3 = x3r0.c(b3, i4, i3, z)) == null) {
                imageRequest3 = null;
            } else {
                c3.k = qowVar != null ? (ktc0) qowVar.a : null;
                c3.j = Priority.MEDIUM;
                c3.l = new hhs(Quality.SUITABLE, new y3l0(ma80Var, 26));
                imageRequest3 = c3.a();
            }
            x6 = new llw(b3, imageRequest3);
            aVar.R(x6);
        }
        llw llwVar2 = (llw) x6;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        fxj0 fxj0Var2 = llwVar2.a;
        ImageRequest imageRequest6 = llwVar2.b;
        wow wowVar3 = list2 != null ? new wow(list2) : null;
        int i10 = (i5 & 458752) | ((i << 3) & 3670016) | ((i << 9) & 29360128);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-167767817, i10, -1, "com.vk.core.compose.image.fresco.rememberLowQualityImage (VkFrescoImage.kt:1023)");
        }
        boolean J3 = aVar.J(wowVar3) | aVar.o(i4) | aVar.o(i3);
        Object x7 = aVar.x();
        if (J3 || x7 == obj) {
            Pair m = kq01.m(wowVar3);
            fxj0 fxj0Var3 = m != null ? (fxj0) m.i() : null;
            Quality quality = m != null ? (Quality) m.j() : null;
            if (quality != null) {
                ma80Var.a(quality);
            }
            ImageRequestBuilder c5 = x3r0.c(fxj0Var3, i4, i3, z);
            if (c5 != null) {
                if (qowVar2 == null || (t = qowVar2.a) == 0) {
                    ktc0Var = qowVar != null ? (ktc0) qowVar.a : null;
                    if (ktc0Var == null) {
                        ktc0Var = jwxVar;
                    }
                } else {
                    ktc0Var = (ktc0) t;
                }
                c5.k = ktc0Var;
                c5.j = Priority.HIGH;
                if (quality == null) {
                    quality = Quality.LOWEST;
                }
                c5.l = new hhs(quality, new y3l0(ma80Var, 26));
                imageRequest4 = c5.a();
            } else {
                imageRequest4 = null;
            }
            x7 = new llw(fxj0Var3, imageRequest4);
            aVar.R(x7);
        }
        llw llwVar3 = (llw) x7;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        fxj0 fxj0Var4 = llwVar3.a;
        Object obj2 = llwVar3.b;
        boolean y3 = aVar.y(fxj0Var) | aVar.y(fxj0Var2) | aVar.y(fxj0Var4);
        Object x8 = aVar.x();
        if (y3 || x8 == obj) {
            x8 = new cwu0(fxj0Var, fxj0Var2, fxj0Var4, null);
            aVar.R(x8);
        }
        final jwx jwxVar3 = jwxVar;
        bap.e(fxj0Var, fxj0Var2, fxj0Var4, (wzs) x8, aVar, 0);
        ImageRequest imageRequest7 = imageRequest2;
        boolean J4 = aVar.J(imageRequest7) | aVar.J(imageRequest6);
        Object x9 = aVar.x();
        if (J4 || x9 == obj) {
            x9 = androidx.compose.runtime.k.b(chs.d.a);
            aVar.R(x9);
        }
        wh50 wh50Var = (wh50) x9;
        T value = wh50Var.getValue();
        boolean J5 = aVar.J(list) | aVar.J(list2) | aVar.y(bVar) | aVar.J(gzsVar);
        if (((i & 57344) ^ 24576) <= 16384 || !aVar.l(z)) {
            i2 = i;
            z2 = J5;
            if ((i2 & 24576) != 16384) {
                z3 = false;
                y = z2 | z3 | (((i6 ^ 196608) <= 131072 && aVar.J(qowVar)) || (i2 & 196608) == 131072) | aVar.y(jwxVar3);
                x = aVar.x();
                if (!y || x == obj) {
                    Object obj3 = new gzs() { // from class: xsna.wvu0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            List list3 = list;
                            wow wowVar4 = list3 != null ? new wow(list3) : null;
                            List list4 = list2;
                            wow wowVar5 = list4 != null ? new wow(list4) : null;
                            qow qowVar3 = qowVar;
                            ktc0 ktc0Var2 = qowVar3 != null ? (ktc0) qowVar3.a : null;
                            bp10.b bVar2 = bVar;
                            int i11 = bVar2.a;
                            int i12 = bVar2.b;
                            if (wowVar4.b.isEmpty()) {
                                wowVar4 = null;
                            }
                            int i13 = bVar2.a;
                            int i14 = bVar2.b;
                            gzs gzsVar2 = gzsVar;
                            boolean z4 = z;
                            fxj0 b4 = x3r0.b(wowVar4, i13, i14, gzsVar2, z4);
                            if (b4 == null && ((b4 = x3r0.a(wowVar5)) == null || (!mcr0.p(b4.getUrl()) && brm0.B(b4.getUrl(), "http", false)))) {
                                b4 = null;
                            }
                            if (b4 != null) {
                                if (!brm0.B(b4.getUrl(), "http", false) && ktc0Var2 == null) {
                                    ktc0Var2 = jwxVar3;
                                }
                                ImageRequestBuilder c6 = x3r0.c(b4, i11, i12, z4);
                                if (c6 != null) {
                                    c6.k = ktc0Var2;
                                    return c6.a();
                                }
                            }
                            return null;
                        }
                    };
                    aVar.R(obj3);
                    x = obj3;
                }
                gzs gzsVar2 = (gzs) x;
                y2 = aVar.y(obj2);
                x2 = aVar.x();
                if (!y2 || x2 == obj) {
                    x2 = new dck0(obj2, 21);
                    aVar.R(x2);
                }
                Pair pair = new Pair(value, j(izsVar, imageRequest7, imageRequest6, gzsVar2, (gzs) x2, wh50Var, false, aVar, (i2 >> 21) & 14, 64));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return pair;
            }
        } else {
            i2 = i;
            z2 = J5;
        }
        z3 = true;
        y = z2 | z3 | (((i6 ^ 196608) <= 131072 && aVar.J(qowVar)) || (i2 & 196608) == 131072) | aVar.y(jwxVar3);
        x = aVar.x();
        if (!y) {
        }
        Object obj32 = new gzs() { // from class: xsna.wvu0
            @Override // xsna.gzs
            public final Object invoke() {
                List list3 = list;
                wow wowVar4 = list3 != null ? new wow(list3) : null;
                List list4 = list2;
                wow wowVar5 = list4 != null ? new wow(list4) : null;
                qow qowVar3 = qowVar;
                ktc0 ktc0Var2 = qowVar3 != null ? (ktc0) qowVar3.a : null;
                bp10.b bVar2 = bVar;
                int i11 = bVar2.a;
                int i12 = bVar2.b;
                if (wowVar4.b.isEmpty()) {
                    wowVar4 = null;
                }
                int i13 = bVar2.a;
                int i14 = bVar2.b;
                gzs gzsVar22 = gzsVar;
                boolean z4 = z;
                fxj0 b4 = x3r0.b(wowVar4, i13, i14, gzsVar22, z4);
                if (b4 == null && ((b4 = x3r0.a(wowVar5)) == null || (!mcr0.p(b4.getUrl()) && brm0.B(b4.getUrl(), "http", false)))) {
                    b4 = null;
                }
                if (b4 != null) {
                    if (!brm0.B(b4.getUrl(), "http", false) && ktc0Var2 == null) {
                        ktc0Var2 = jwxVar3;
                    }
                    ImageRequestBuilder c6 = x3r0.c(b4, i11, i12, z4);
                    if (c6 != null) {
                        c6.k = ktc0Var2;
                        return c6.a();
                    }
                }
                return null;
            }
        };
        aVar.R(obj32);
        x = obj32;
        gzs gzsVar22 = (gzs) x;
        y2 = aVar.y(obj2);
        x2 = aVar.x();
        if (!y2) {
        }
        x2 = new dck0(obj2, 21);
        aVar.R(x2);
        Pair pair2 = new Pair(value, j(izsVar, imageRequest7, imageRequest6, gzsVar22, (gzs) x2, wh50Var, false, aVar, (i2 >> 21) & 14, 64));
        if (androidx.compose.runtime.b.d()) {
        }
        return pair2;
    }

    public static final Pair h(long j, List list, List list2, gzs gzsVar, qow qowVar, izs izsVar, izs izsVar2, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar2;
        izs izsVar3;
        if ((i & 2) != 0) {
            list = EmptyList.b;
        }
        List list3 = list;
        int i2 = i & 8;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (i2 != 0) {
            Object x = aVar.x();
            if (x == c0012a) {
                x = new c24(0);
                aVar.R(x);
            }
            gzsVar2 = (gzs) x;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 512) != 0) {
            Object x2 = aVar.x();
            if (x2 == c0012a) {
                x2 = new puq0(7);
                aVar.R(x2);
            }
            izsVar3 = (izs) x2;
        } else {
            izsVar3 = izsVar2;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(125671666, 100663296, -1, "com.vk.core.compose.image.fresco.rememberBestPainterWithState (VkFrescoImage.kt:184)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1673250500, 0, -1, "com.vk.core.compose.image.fresco.measure (VkFrescoImage.kt:864)");
        }
        float c2 = uco.c(j);
        Object x3 = aVar.x();
        if (x3 == c0012a) {
            x3 = new tqf0(14);
            aVar.R(x3);
        }
        float n = yiz.n(c2, (gzs) x3);
        float b2 = uco.b(j);
        Object x4 = aVar.x();
        if (x4 == c0012a) {
            x4 = new f7q0(9);
            aVar.R(x4);
        }
        float n2 = yiz.n(b2, (gzs) x4);
        float f = 0;
        gzs gzsVar3 = gzsVar2;
        bp10.b f2 = f(list3, list2, gzsVar3, -1.0f, n, n2, n, n, pco.b(n, f) ? 0 : 1073741824, pco.b(n2, f) ? 0 : 1073741824, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        Pair g = g(f2, list3, list2, gzsVar3, true, qowVar, null, izsVar, izsVar3, aVar, 12582912);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return g;
    }

    public static final int i(wh50<Integer> wh50Var) {
        return wh50Var.getValue().intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0189, code lost:
    
        if (r29.J(r25) != false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lg90 j(izs<? super ojt, s3q0> izsVar, ImageRequest imageRequest, ImageRequest imageRequest2, gzs<? extends ImageRequest> gzsVar, gzs<? extends ImageRequest> gzsVar2, wh50<chs> wh50Var, boolean z, androidx.compose.runtime.a aVar, int i, int i2) {
        boolean z2;
        Object x;
        Object x2;
        boolean J;
        Object x3;
        ImageRequest[] imageRequestArr;
        boolean z3;
        boolean z4;
        Object x4;
        Boolean bool;
        int i3;
        flo floVar;
        aVar.K(-980684215);
        boolean z5 = (i2 & 64) != 0 ? false : z;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-980684215, i, -1, "com.vk.core.compose.image.fresco.rememberRequestPainterInternal (VkFrescoImage.kt:509)");
        }
        if (((Boolean) aVar.r(c5x.a)).booleanValue()) {
            aVar.K(-1195489681);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y6g y6gVar = new y6g(ylu0Var.getImage().b);
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return y6gVar;
        }
        aVar.K(-1216251559);
        aVar.j();
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        Object x5 = aVar.x();
        Object obj = a.C0011a.a;
        if (x5 == obj) {
            x5 = rhs.e();
            aVar.R(x5);
        }
        lpa0 lpa0Var = (lpa0) x5;
        Object x6 = aVar.x();
        if (x6 == obj) {
            x6 = new wgs();
            aVar.R(x6);
        }
        tjo tjoVar = (tjo) x6;
        Object x7 = aVar.x();
        Object obj2 = x7;
        if (x7 == obj) {
            ImageRequest[] imageRequestArr2 = {null, null};
            aVar.R(imageRequestArr2);
            obj2 = imageRequestArr2;
        }
        ImageRequest[] imageRequestArr3 = (ImageRequest[]) obj2;
        Object x8 = aVar.x();
        if (x8 == obj) {
            ojt ojtVar = new ojt(context.getResources());
            izsVar.invoke(ojtVar);
            x8 = ojtVar.a();
            aVar.R(x8);
        }
        njt njtVar = (njt) x8;
        boolean J2 = aVar.J(njtVar);
        Object x9 = aVar.x();
        if (J2 || x9 == obj) {
            x9 = new flo(njtVar);
            aVar.R(x9);
        }
        flo floVar2 = (flo) x9;
        dmw dmwVar = mcr0.j;
        Object obj3 = dmwVar != null ? dmwVar.b : null;
        boolean J3 = aVar.J(obj3);
        Object x10 = aVar.x();
        if (J3 || x10 == obj) {
            x10 = Integer.valueOf(obj3 != null ? 2 : 1);
            aVar.R(x10);
        }
        int intValue = ((Number) x10).intValue();
        boolean J4 = aVar.J(obj3);
        Object x11 = aVar.x();
        if (J4 || x11 == obj) {
            x11 = Long.valueOf(obj3 != null ? 20000L : 10000L);
            aVar.R(x11);
        }
        long longValue = ((Number) x11).longValue();
        boolean J5 = aVar.J(imageRequest2) | aVar.J(imageRequest);
        Object x12 = aVar.x();
        if (J5 || x12 == obj) {
            x12 = qq.h(0, aVar);
        }
        wh50 wh50Var2 = (wh50) x12;
        boolean J6 = aVar.J(imageRequest2) | aVar.J(imageRequest);
        Object x13 = aVar.x();
        if (J6 || x13 == obj) {
            x13 = androidx.compose.runtime.k.b(Boolean.TRUE);
            aVar.R(x13);
        }
        wh50 wh50Var3 = (wh50) x13;
        Object x14 = aVar.x();
        if (x14 == obj) {
            x14 = androidx.compose.runtime.k.b(Boolean.FALSE);
            aVar.R(x14);
        }
        wh50 wh50Var4 = (wh50) x14;
        if (((i & 7168) ^ 3072) <= 2048) {
        }
        if ((i & 3072) != 2048) {
            z2 = false;
            x = aVar.x();
            if (!z2 || x == obj) {
                x = (ImageRequest) gzsVar.invoke();
                aVar.R(x);
            }
            ImageRequest imageRequest3 = (ImageRequest) x;
            x2 = aVar.x();
            if (x2 == obj) {
                x2 = new c(wh50Var, wh50Var2, intValue);
                aVar.R(x2);
            }
            c cVar = (c) x2;
            Integer valueOf = Integer.valueOf(k(wh50Var2));
            J = aVar.J(wh50Var2) | aVar.p(longValue);
            x3 = aVar.x();
            if (!J || x3 == obj) {
                x3 = new qdl0(longValue, wh50Var2, wh50Var4, 1);
                aVar.R(x3);
            }
            bap.c(valueOf, (izs) x3, aVar, 0);
            Boolean bool2 = (Boolean) wh50Var4.getValue();
            bool2.getClass();
            boolean J7 = aVar.J(wh50Var3) | aVar.y(imageRequest3) | aVar.y(context) | aVar.y(floVar2) | aVar.y(lpa0Var) | aVar.y(imageRequestArr3) | aVar.y(tjoVar) | ((((i & 3670016) ^ 1572864) <= 1048576 && aVar.l(z5)) || (i & 1572864) == 1048576) | aVar.y(imageRequest) | aVar.y(imageRequest2);
            if (((i & 57344) ^ 24576) > 16384 && aVar.J(gzsVar2)) {
                imageRequestArr = imageRequestArr3;
                z3 = true;
                z4 = z3 | J7;
                x4 = aVar.x();
                if (!z4 || x4 == obj) {
                    bool = bool2;
                    i3 = 0;
                    Object aVar2 = new a(imageRequest3, context, floVar2, lpa0Var, imageRequestArr, cVar, tjoVar, z5, imageRequest, imageRequest2, gzsVar2, wh50Var3, null);
                    floVar = floVar2;
                    aVar.R(aVar2);
                    x4 = aVar2;
                } else {
                    floVar = floVar2;
                    bool = bool2;
                    i3 = 0;
                }
                bap.e(imageRequest, imageRequest2, bool, (wzs) x4, aVar, (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                lg90 p = w65.p(floVar.d(), aVar, i3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return p;
            }
            imageRequestArr = imageRequestArr3;
            if ((i & 24576) != 16384) {
                z3 = false;
                z4 = z3 | J7;
                x4 = aVar.x();
                if (z4) {
                }
                bool = bool2;
                i3 = 0;
                Object aVar22 = new a(imageRequest3, context, floVar2, lpa0Var, imageRequestArr, cVar, tjoVar, z5, imageRequest, imageRequest2, gzsVar2, wh50Var3, null);
                floVar = floVar2;
                aVar.R(aVar22);
                x4 = aVar22;
                bap.e(imageRequest, imageRequest2, bool, (wzs) x4, aVar, (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                lg90 p2 = w65.p(floVar.d(), aVar, i3);
                if (androidx.compose.runtime.b.d()) {
                }
                aVar.j();
                return p2;
            }
            z3 = true;
            z4 = z3 | J7;
            x4 = aVar.x();
            if (z4) {
            }
            bool = bool2;
            i3 = 0;
            Object aVar222 = new a(imageRequest3, context, floVar2, lpa0Var, imageRequestArr, cVar, tjoVar, z5, imageRequest, imageRequest2, gzsVar2, wh50Var3, null);
            floVar = floVar2;
            aVar.R(aVar222);
            x4 = aVar222;
            bap.e(imageRequest, imageRequest2, bool, (wzs) x4, aVar, (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            lg90 p22 = w65.p(floVar.d(), aVar, i3);
            if (androidx.compose.runtime.b.d()) {
            }
            aVar.j();
            return p22;
        }
        z2 = true;
        x = aVar.x();
        if (!z2) {
        }
        x = (ImageRequest) gzsVar.invoke();
        aVar.R(x);
        ImageRequest imageRequest32 = (ImageRequest) x;
        x2 = aVar.x();
        if (x2 == obj) {
        }
        c cVar2 = (c) x2;
        Integer valueOf2 = Integer.valueOf(k(wh50Var2));
        J = aVar.J(wh50Var2) | aVar.p(longValue);
        x3 = aVar.x();
        if (!J) {
        }
        x3 = new qdl0(longValue, wh50Var2, wh50Var4, 1);
        aVar.R(x3);
        bap.c(valueOf2, (izs) x3, aVar, 0);
        Boolean bool22 = (Boolean) wh50Var4.getValue();
        bool22.getClass();
        boolean J72 = aVar.J(wh50Var3) | aVar.y(imageRequest32) | aVar.y(context) | aVar.y(floVar2) | aVar.y(lpa0Var) | aVar.y(imageRequestArr3) | aVar.y(tjoVar) | ((((i & 3670016) ^ 1572864) <= 1048576 && aVar.l(z5)) || (i & 1572864) == 1048576) | aVar.y(imageRequest) | aVar.y(imageRequest2);
        if (((i & 57344) ^ 24576) > 16384) {
            imageRequestArr = imageRequestArr3;
            z3 = true;
            z4 = z3 | J72;
            x4 = aVar.x();
            if (z4) {
            }
            bool = bool22;
            i3 = 0;
            Object aVar2222 = new a(imageRequest32, context, floVar2, lpa0Var, imageRequestArr, cVar2, tjoVar, z5, imageRequest, imageRequest2, gzsVar2, wh50Var3, null);
            floVar = floVar2;
            aVar.R(aVar2222);
            x4 = aVar2222;
            bap.e(imageRequest, imageRequest2, bool, (wzs) x4, aVar, (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            lg90 p222 = w65.p(floVar.d(), aVar, i3);
            if (androidx.compose.runtime.b.d()) {
            }
            aVar.j();
            return p222;
        }
        imageRequestArr = imageRequestArr3;
        if ((i & 24576) != 16384) {
        }
        z3 = true;
        z4 = z3 | J72;
        x4 = aVar.x();
        if (z4) {
        }
        bool = bool22;
        i3 = 0;
        Object aVar22222 = new a(imageRequest32, context, floVar2, lpa0Var, imageRequestArr, cVar2, tjoVar, z5, imageRequest, imageRequest2, gzsVar2, wh50Var3, null);
        floVar = floVar2;
        aVar.R(aVar22222);
        x4 = aVar22222;
        bap.e(imageRequest, imageRequest2, bool, (wzs) x4, aVar, (i >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        lg90 p2222 = w65.p(floVar.d(), aVar, i3);
        if (androidx.compose.runtime.b.d()) {
        }
        aVar.j();
        return p2222;
    }

    public static final int k(wh50<Integer> wh50Var) {
        return wh50Var.getValue().intValue();
    }

    public static final lg90 l(String str, String str2, izs izsVar, qow qowVar, androidx.compose.runtime.a aVar, int i, int i2) {
        izs izsVar2;
        aVar.K(1860378813);
        String str3 = (i2 & 1) != 0 ? null : str;
        String str4 = (i2 & 2) != 0 ? null : str2;
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = gwu0.b;
            aVar.R(x);
        }
        gzs gzsVar = (gzs) x;
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = vq60.f;
            aVar.R(x2);
        }
        gzs gzsVar2 = (gzs) x2;
        if ((i2 & 16) != 0) {
            Object x3 = aVar.x();
            if (x3 == c0012a) {
                x3 = new lcq0(6);
                aVar.R(x3);
            }
            izsVar2 = (izs) x3;
        } else {
            izsVar2 = izsVar;
        }
        qow qowVar2 = (i2 & 32) == 0 ? qowVar : null;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1860378813, i, -1, "com.vk.core.compose.image.fresco.rememberUrlPainter (VkFrescoImage.kt:372)");
        }
        if (!((Boolean) aVar.r(c5x.a)).booleanValue()) {
            aVar.K(271943781);
            aVar.j();
            lg90 lg90Var = (lg90) m(str3, str4, gzsVar, gzsVar2, izsVar2, qowVar2, aVar, i & 524286, 64).j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return lg90Var;
        }
        aVar.K(287598843);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        y6g y6gVar = new y6g(ylu0Var.getImage().b);
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return y6gVar;
    }

    public static final Pair m(String str, String str2, gzs gzsVar, gzs gzsVar2, izs izsVar, qow qowVar, androidx.compose.runtime.a aVar, int i, int i2) {
        gzs gzsVar3;
        Object obj;
        izs izsVar2;
        Object obj2;
        aVar.K(-551196423);
        String str3 = (i2 & 1) != 0 ? null : str;
        String str4 = (i2 & 2) != 0 ? null : str2;
        int i3 = i2 & 4;
        Object obj3 = a.C0011a.a;
        if (i3 != 0) {
            Object x = aVar.x();
            if (x == obj3) {
                x = wq60.f;
                aVar.R(x);
            }
            gzsVar3 = (gzs) x;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((i2 & 8) != 0) {
            Object x2 = aVar.x();
            if (x2 == obj3) {
                x2 = hwu0.b;
                aVar.R(x2);
            }
            obj = (gzs) x2;
        } else {
            obj = gzsVar2;
        }
        if ((i2 & 16) != 0) {
            Object x3 = aVar.x();
            if (x3 == obj3) {
                x3 = new hxm0(12);
                aVar.R(x3);
            }
            izsVar2 = (izs) x3;
        } else {
            izsVar2 = izsVar;
        }
        qow qowVar2 = (i2 & 32) != 0 ? null : qowVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-551196423, i, -1, "com.vk.core.compose.image.fresco.rememberUrlPainterWithState (VkFrescoImage.kt:396)");
        }
        boolean booleanValue = ((Boolean) aVar.r(c5x.a)).booleanValue();
        chs.d dVar = chs.d.a;
        if (booleanValue) {
            aVar.K(-1032226426);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Pair pair = new Pair(dVar, new y6g(ylu0Var.getImage().b));
            aVar.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return pair;
        }
        aVar.K(-1048667927);
        aVar.j();
        int i4 = (458752 & i) ^ 196608;
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.J(str3)) || (i & 6) == 4) | ((i4 > 131072 && aVar.J(qowVar2)) || (i & 196608) == 131072);
        Object x4 = aVar.x();
        if (z || x4 == obj3) {
            if (str3 != null) {
                ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str3));
                h.k = qowVar2 != null ? (ktc0) qowVar2.a : null;
                x4 = h.a();
            } else {
                x4 = null;
            }
            aVar.R(x4);
        }
        ImageRequest imageRequest = (ImageRequest) x4;
        boolean z2 = ((((i & 112) ^ 48) > 32 && aVar.J(str4)) || (i & 48) == 32) | ((i4 > 131072 && aVar.J(qowVar2)) || (i & 196608) == 131072);
        Object x5 = aVar.x();
        if (z2 || x5 == obj3) {
            if (str4 != null) {
                ImageRequestBuilder h2 = ImageRequestBuilder.h(Uri.parse(str4));
                h2.k = qowVar2 != null ? (ktc0) qowVar2.a : null;
                obj2 = h2.a();
            } else {
                obj2 = null;
            }
            aVar.R(obj2);
            x5 = obj2;
        }
        ImageRequest imageRequest2 = (ImageRequest) x5;
        boolean z3 = ((((i & 896) ^ 384) > 256 && aVar.J(gzsVar3)) || (i & 384) == 256) | ((i4 > 131072 && aVar.J(qowVar2)) || (i & 196608) == 131072);
        Object x6 = aVar.x();
        if (z3 || x6 == obj3) {
            x6 = new tvu0(0, qowVar2, gzsVar3);
            aVar.R(x6);
        }
        gzs gzsVar4 = (gzs) x6;
        boolean z4 = ((((i & 7168) ^ 3072) > 2048 && aVar.J(obj)) || (i & 3072) == 2048) | ((i4 > 131072 && aVar.J(qowVar2)) || (i & 196608) == 131072);
        Object x7 = aVar.x();
        if (z4 || x7 == obj3) {
            x7 = new o7k0(5, obj, qowVar2);
            aVar.R(x7);
        }
        gzs gzsVar5 = (gzs) x7;
        boolean J = aVar.J(imageRequest) | aVar.J(imageRequest2);
        Object x8 = aVar.x();
        if (J || x8 == obj3) {
            x8 = androidx.compose.runtime.k.b(dVar);
            aVar.R(x8);
        }
        wh50 wh50Var = (wh50) x8;
        Pair pair2 = new Pair(wh50Var.getValue(), j(izsVar2, imageRequest, imageRequest2, gzsVar5, gzsVar4, wh50Var, false, aVar, ((i >> 12) & 14) | (i & 3670016), 0));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return pair2;
    }

    /* compiled from: VkFrescoImage.kt */
    public static final class c implements kqj<mjw> {
        public final /* synthetic */ wh50<chs> b;
        public final /* synthetic */ wh50<Integer> c;
        public final /* synthetic */ int d;

        public c(wh50<chs> wh50Var, wh50<Integer> wh50Var2, int i) {
            this.b = wh50Var;
            this.c = wh50Var2;
            this.d = i;
        }

        @Override // xsna.kqj
        public final /* bridge */ /* synthetic */ void a(Object obj, String str) {
        }

        @Override // xsna.kqj
        public final void b(String str, Throwable th) {
            uh50 C;
            wh50<chs> wh50Var = this.b;
            wh50<Integer> wh50Var2 = this.c;
            dak0 j = qak0.j();
            uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
            if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                dak0 j2 = C.j();
                try {
                    if (fwu0.k(wh50Var2) < this.d) {
                        wh50Var2.setValue(Integer.valueOf(wh50Var2.getValue().intValue() + 1));
                    } else {
                        wh50Var.setValue(new chs.b(str, th));
                        wh50Var2.setValue(0);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    C.w().a();
                } finally {
                    dak0.q(j2);
                }
            } finally {
            }
        }

        @Override // xsna.kqj
        public final void d(String str) {
            wh50<chs> wh50Var = this.b;
            if (wh50Var != null) {
                wh50Var.setValue(new chs.a(str));
            }
        }

        @Override // xsna.kqj
        public final void e(String str, mjw mjwVar, Animatable animatable) {
            mjw mjwVar2 = mjwVar;
            int width = mjwVar2 != null ? mjwVar2.getWidth() : 0;
            int height = mjwVar2 != null ? mjwVar2.getHeight() : 0;
            this.c.setValue(0);
            this.b.setValue(new chs.e(str, width, height));
        }

        @Override // xsna.kqj
        public final void f(Object obj, String str) {
            wh50<chs> wh50Var = this.b;
            if (wh50Var != null) {
                wh50Var.setValue(new chs.c(str));
            }
        }

        @Override // xsna.kqj
        public final void c(String str, Throwable th) {
        }
    }
}
