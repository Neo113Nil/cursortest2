package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.image.badge.BadgeAlignment;
import com.vk.core.compose.component.tile.TileContentType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cnd;
import xsna.cri;
import xsna.dt1;
import xsna.gnd;
import xsna.iev;
import xsna.kpv;
import xsna.phw;
import xsna.q630;
import xsna.qqz;
import xsna.tlo0;
import xsna.umd;
import xsna.vmd;
import xsna.wkj;

/* compiled from: LoadedContent.kt */
/* loaded from: classes16.dex */
public final class qqz {

    /* compiled from: LoadedContent.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<vmd, s3q0> b;
        public final /* synthetic */ gmd c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super vmd, s3q0> izsVar, gmd gmdVar) {
            this.b = izsVar;
            this.c = gmdVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new vmd.e(this.c.a));
            return s3q0.a;
        }
    }

    /* compiled from: LoadedContent.kt */
    @b6l(c = "com.vk.clips.coauthors.selector.ui.LoadedContentKt$ListContent$3$1", f = "LoadedContent.kt", l = {260}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ nek0 $keyboardController;
        final /* synthetic */ xvy $listState;
        int label;

        /* compiled from: LoadedContent.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ nek0 b;

            public a(nek0 nek0Var) {
                this.b = nek0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                nek0 nek0Var;
                if (((Boolean) obj).booleanValue() && (nek0Var = this.b) != null) {
                    nek0Var.hide();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xvy xvyVar, nek0 nek0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$listState = xvyVar;
            this.$keyboardController = nek0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$listState, this.$keyboardController, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new p5y(this.$listState, 3));
                a aVar = new a(this.$keyboardController);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: LoadedContent.kt */
    @b6l(c = "com.vk.clips.coauthors.selector.ui.LoadedContentKt$ListContent$4$1", f = "LoadedContent.kt", l = {271}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isRecommendedState;
        final /* synthetic */ xvy $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, xvy xvyVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$isRecommendedState = z;
            this.$listState = xvyVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$isRecommendedState, this.$listState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$isRecommendedState) {
                    xvy xvyVar = this.$listState;
                    this.label = 1;
                    fh9 fh9Var = xvy.y;
                    if (xvyVar.k(0, 0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements izs<Integer, Object> {
        public final /* synthetic */ zdi b;
        public final /* synthetic */ wow c;

        public d(zdi zdiVar, wow wowVar) {
            this.b = zdiVar;
            this.c = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            int intValue = num.intValue();
            return this.b.invoke(Integer.valueOf(intValue), this.c.b.get(intValue));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public e(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return qjg.a((gmd) this.b.b.get(num.intValue()));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class f implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ nek0 c;
        public final /* synthetic */ izs d;

        public f(wow wowVar, nek0 nek0Var, izs izsVar) {
            this.b = wowVar;
            this.c = nek0Var;
            this.d = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                Object obj = this.b.b.get(intValue);
                int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                gmd gmdVar = (gmd) obj;
                aVar2.K(-1477124633);
                izs izsVar = this.d;
                boolean J = aVar2.J(izsVar) | aVar2.J(gmdVar);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new a(izsVar, gmdVar);
                    aVar2.R(x);
                }
                qqz.a(this.c, gmdVar, intValue, (gzs) x, aVar2, (i2 << 3) & 896);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(final nek0 nek0Var, final gmd gmdVar, final int i, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        int i5;
        lg90 r;
        long j;
        int i6;
        androidx.compose.runtime.a M = aVar.M(568117872);
        if ((i2 & 6) == 0) {
            i3 = (M.J(nek0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(gmdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(568117872, i3, -1, "com.vk.clips.coauthors.selector.ui.ItemCell (LoadedContent.kt:306)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            tlo0.f fVar = gmdVar.f;
            boolean z = gmdVar.d;
            cnd cndVar = gmdVar.e;
            String obj = tlo0.b.a(fVar, context).toString();
            int i7 = i3;
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, gmdVar.c, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(gmdVar.b, null, null, 1, null, null, M, 12610560, 102), Cell$Middle.c.b.b(cndVar.a().a(context).toString(), 1, null, null, null, M, 12583344, 120), null, null, M, 196608, 28);
            if (z) {
                M.K(500458879);
                if (androidx.compose.runtime.b.d()) {
                    i4 = -1;
                    i5 = 0;
                    androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                } else {
                    i4 = -1;
                    i5 = 0;
                }
                r = pg90.a(R.drawable.vk_icon_check_circle_on_24, i5, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                i4 = -1;
                i5 = 0;
                M.K(500459808);
                qzu0.a.getClass();
                r = qzu0.r(M);
            }
            M.j();
            if (z) {
                M.K(500462266);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().a;
            } else {
                M.K(500463420);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i5, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getIcon().n;
            }
            M.j();
            boolean z2 = cndVar instanceof cnd.a;
            com.vk.core.compose.component.cell.content.x a4 = com.vk.core.compose.component.cell.content.p.a(r, j, 0L, null, z2 ? gzsVar : null, null, M, 1572872, 44);
            M.K(500487312);
            boolean J = M.J(obj) | ((i7 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new mqz(obj, i, 0);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            q630 b2 = egi0.b(aVar2, true, (izs) x);
            boolean z3 = (i7 & 112) == 32;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new bzw(gmdVar, 4);
                M.R(x2);
            }
            q630 a5 = rdu.a(b2, (izs) x2);
            if (z2) {
                if (androidx.compose.runtime.b.d()) {
                    i6 = 0;
                    androidx.compose.runtime.b.f(1955307676, 0, -1, "com.vk.clips.coauthors.selector.ui.getItemClickLabel (LoadedContent.kt:378)");
                } else {
                    i6 = 0;
                }
                String a6 = !z ? zq.a(M, -2070358498, R.string.clips_coauthors_accessibility_list_item_select_click_label, M, i6) : zq.a(M, -2070249316, R.string.clips_coauthors_accessibility_list_item_unselect_click_label, M, i6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i8 = (i7 & 7168) == 2048 ? 1 : i6;
                if ((i7 & 14) == 4) {
                    i6 = 1;
                }
                int i9 = i8 | i6;
                Object x3 = M.x();
                if (i9 != 0 || x3 == c0012a) {
                    x3 = new lb6(15, gzsVar, nek0Var);
                    M.R(x3);
                }
                a5 = a5.g(ojc.c(aVar2, false, a6, null, (gzs) x3, 13));
            }
            M.j();
            wiu0.b(ahn.E(a5, "SelectionItem_" + i), false, a2, a3, a4, null, null, M, 0, 98);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.nqz
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    qqz.a(nek0.this, gmdVar, i, gzsVar, (androidx.compose.runtime.a) obj2, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final umd umdVar, final String str, final izs<? super vmd, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        final boolean z;
        final nek0 nek0Var;
        androidx.compose.runtime.a M = aVar.M(1262521521);
        if ((i & 6) == 0) {
            i2 = (M.J(umdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1262521521, i2, -1, "com.vk.clips.coauthors.selector.ui.ListContent (LoadedContent.kt:221)");
            }
            final boolean b2 = umdVar.b();
            boolean z2 = umdVar instanceof umd.c;
            boolean z3 = !z2 && b2;
            int i3 = i2 & 896;
            boolean z4 = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z4 || x == c0012a) {
                x = new yt7(izsVar, 4);
                M.R(x);
            }
            xvy z5 = crx0.z(z3, (gzs) x, 0, M, 0, 60);
            nek0 nek0Var2 = (nek0) M.r(uvi.q);
            int i4 = i2 & 14;
            boolean z6 = i4 == 4;
            Object x2 = M.x();
            if (z6 || x2 == c0012a) {
                x2 = new fju(umdVar, 4);
                M.R(x2);
            }
            q630 b3 = egi0.b(q630.a.a, false, (izs) x2);
            boolean l = ((i2 & 112) == 32) | M.l(z2) | (i4 == 4) | M.J(nek0Var2) | (i3 == 256) | M.l(b2);
            Object x3 = M.x();
            if (l || x3 == c0012a) {
                z = z2;
                nek0Var = nek0Var2;
                izs izsVar2 = new izs() { // from class: xsna.oqz
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        nvy nvyVar = (nvy) obj;
                        if (z) {
                            nvy.g(nvyVar, null, null, new jai(216626821, new p3i(str, 1), true), 3);
                        }
                        List a2 = umdVar.a();
                        wow wowVar = new wow(a2);
                        nvyVar.e(a2.size(), new qqz.d(new zdi(2), wowVar), new qqz.e(wowVar), new jai(2039820996, new qqz.f(wowVar, nek0Var, izsVar), true));
                        if (b2) {
                            nvy.g(nvyVar, null, null, zgi.a, 3);
                        }
                        return s3q0.a;
                    }
                };
                M.R(izsVar2);
                x3 = izsVar2;
            } else {
                z = z2;
                nek0Var = nek0Var2;
            }
            lqy.a(b3, z5, null, null, null, null, false, null, (izs) x3, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
            M = M;
            s3q0 s3q0Var = s3q0.a;
            boolean J = M.J(z5) | M.J(nek0Var);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new b(z5, nek0Var, null);
                M.R(x4);
            }
            bap.g(s3q0Var, (wzs) x4, M, 6);
            Boolean valueOf = Boolean.valueOf(z);
            boolean l2 = M.l(z) | M.J(z5);
            Object x5 = M.x();
            if (l2 || x5 == c0012a) {
                x5 = new c(z, z5, null);
                M.R(x5);
            }
            bap.g(valueOf, (wzs) x5, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gdv(i, 1, umdVar, str, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(gnd.a.C2950a c2950a, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(60293537);
        int i2 = i | (M.J(c2950a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(60293537, i2, -1, "com.vk.clips.coauthors.selector.ui.LoadedContent (LoadedContent.kt:91)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            wh50 d2 = jk50.d(c2950a.g, Boolean.FALSE, M, 48);
            wh50 d3 = jk50.d(c2950a.f, umd.a.a, M, 48);
            wh50 c2 = jk50.c(c2950a.i, M);
            q630 d4 = txj0.d(q630Var, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, d4);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            if (((Boolean) d2.getValue()).booleanValue()) {
                M.K(-1920195332);
                float f2 = 16;
                jqu0.a(s200.H(txj0.f(q630.a.a, 1.0f), f2, 8, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
            } else {
                M.K(-1925340681);
            }
            M.j();
            e((umd) d3.getValue(), ((tlo0) c2.getValue()).a(context).toString(), izsVar, null, M, (i2 << 3) & 896);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tnc(i, 3, c2950a, izsVar, q630Var);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1496406583);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1496406583, i, -1, "com.vk.clips.coauthors.selector.ui.Loader (LoadedContent.kt:364)");
            }
            q630 f2 = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
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
            k9q0.w(M, c2, cri.a.d);
            zfr0.f(SpinnerState.Loading, null, null, 0L, null, null, M, 6, 62);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new noi(i);
        }
    }

    public static final void e(umd umdVar, String str, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(720000647);
        if ((i & 6) == 0) {
            i2 = (M.J(umdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(720000647, i3, -1, "com.vk.clips.coauthors.selector.ui.QueryItemsColumn (LoadedContent.kt:197)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (epx.f(umdVar, umd.a.a)) {
                M.K(1824228737);
                M.j();
            } else if (epx.f(umdVar, umd.b.a)) {
                M.K(1824230725);
                d(0, M);
                M.j();
            } else {
                if (!(umdVar instanceof umd.c) && !(umdVar instanceof umd.d)) {
                    throw alb0.c(1824226793, M);
                }
                M.K(716721624);
                b(umdVar, str, izsVar, M, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kqz(umdVar, str, izsVar, q630Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(gnd.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        w0h0 w0h0Var;
        tlo0 tlo0Var;
        tlo0 tlo0Var2;
        w0h0 w0h0Var2;
        androidx.compose.runtime.a M = aVar2.M(-12980860);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-12980860, i2, -1, "com.vk.clips.coauthors.selector.ui.SaveButtonArea (LoadedContent.kt:391)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            if (aVar instanceof gnd.a.c) {
                M.K(-165322080);
                M.j();
                tlo0.Companion.getClass();
                w0h0Var2 = w0h0.c;
                tlo0Var2 = tlo0.c.a;
            } else {
                if (aVar instanceof gnd.a.C2950a) {
                    M.K(-165133693);
                    gnd.a.C2950a c2950a = (gnd.a.C2950a) aVar;
                    w0h0Var = (w0h0) jk50.c(c2950a.c, M).getValue();
                    tlo0Var = (tlo0) jk50.c(c2950a.d, M).getValue();
                    M.j();
                } else if (aVar instanceof gnd.a.b) {
                    M.K(-164919421);
                    gnd.a.b bVar = (gnd.a.b) aVar;
                    w0h0Var = (w0h0) jk50.c(bVar.c, M).getValue();
                    tlo0Var = (tlo0) jk50.c(bVar.d, M).getValue();
                    M.j();
                } else {
                    if (!(aVar instanceof gnd.a.d)) {
                        throw alb0.c(410307421, M);
                    }
                    M.K(-164703165);
                    gnd.a.d dVar = (gnd.a.d) aVar;
                    w0h0Var = (w0h0) jk50.c(dVar.c, M).getValue();
                    tlo0Var = (tlo0) jk50.c(dVar.d, M).getValue();
                    M.j();
                }
                w0h0 w0h0Var3 = w0h0Var;
                tlo0Var2 = tlo0Var;
                w0h0Var2 = w0h0Var3;
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c2 = qri.c(M, aVar3);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            w0h0 w0h0Var4 = w0h0Var2;
            jqu0.a(txj0.f(aVar3, 1.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            float f2 = 12;
            f9t.e(txj0.h(aVar3, f2), M, 6);
            String obj = tlo0Var2.a(context).toString();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(obj, ahn.E(new gcv(dt1.a.o), "SelectedCount"), ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            f9t.e(txj0.h(aVar3, f2), M, 6);
            String N = d370.N(R.string.clips_coauthors_select_button, 0, M);
            Integer num = w0h0Var4.b;
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = w0h0Var4.a;
            q630 E = ahn.E(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar3, 1.0f)), "SaveButton");
            boolean z2 = (i2 & 112) == 32;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new nq0(izsVar, 4);
                M.R(x);
            }
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, num, null, null, null, z, null, null, null, M, 28080, 0, 0, 4050912);
            M = M;
            if (xga0.c(aVar3, f2, M, 6)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fc0(aVar, izsVar, q630Var2, i, 2);
        }
    }

    public static final void g(Set set, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1936145427);
        int i2 = i | (M.J(set) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1936145427, i2, -1, "com.vk.clips.coauthors.selector.ui.SelectedItemsRow (LoadedContent.kt:127)");
            }
            q630 H = s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u890 m = s200.m(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ll1(14, (Object) set, izsVar);
                M.R(x);
            }
            lqy.b(H, null, m, null, null, null, false, null, (izs) x, M, 384, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w6h(i, 1, (Object) set, izsVar, q630Var);
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar, String str, final String str2, final String str3, final gzs gzsVar, final q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1595795708);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1595795708, i2, -1, "com.vk.clips.coauthors.selector.ui.SelectedRowItem (LoadedContent.kt:157)");
            }
            fwu0.c(null, null, str, null, null, null, null, kai.c(-1334477931, new a0t() { // from class: xsna.lqz
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1334477931, intValue, -1, "com.vk.clips.coauthors.selector.ui.SelectedRowItem.<anonymous> (LoadedContent.kt:161)");
                        }
                        String str4 = str3;
                        String O = d370.O(R.string.clips_coauthors_accessibility_selector_remove_coauthor, new Object[]{str4}, aVar2);
                        TileContentType tileContentType = TileContentType.Avatar;
                        phw a2 = phw.a.a(lg90Var, null, wkj.a.a, null, null, aVar2, 197000 | ((intValue >> 6) & 14), 26);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1225196004, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DismissSubstract24> (VkSdkIcons.kt:666)");
                        }
                        lg90 b2 = or.b(aVar2, -1181894078, R.drawable.vk_icon_dismiss_substract_24, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().l;
                        BadgeAlignment badgeAlignment = BadgeAlignment.TopLeft;
                        boolean J = aVar2.J(O);
                        Object x = aVar2.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (J || x == c0012a) {
                            x = new kf5(O, 3);
                            aVar2.R(x);
                        }
                        yq5 a3 = HorizontalListItem$VisualContent.a.a(a2, kpv.a.a(b2, j, 0L, badgeAlignment, true, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), gzsVar, aVar2, 100884488, 12), null, 0, aVar2, 0, 28);
                        float f2 = 48;
                        long b3 = byc0.b(f2, f2);
                        boolean J2 = aVar2.J(str4);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new lf5(str4, 2);
                            aVar2.R(x2);
                        }
                        asv0.d(tileContentType, a3, b3, iev.c.a(str2, null, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar2, 24576, 13), q630Var, false, false, null, null, null, aVar2, 390, 992);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 << 6) & 896) | 100663296, 251);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qbh(i, str, str2, str3, gzsVar, q630Var);
        }
    }
}
