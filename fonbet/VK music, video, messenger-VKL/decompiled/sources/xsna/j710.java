package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.Restriction;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.j710;
import xsna.q610;
import xsna.q630;
import xsna.u710;
import xsna.wkj;
import xsna.wra0;
import xsna.zra0;

/* compiled from: MarketLinkedContentScreen.kt */
/* loaded from: classes18.dex */
public final class j710 {

    /* compiled from: MarketLinkedContentScreen.kt */
    public static final class a implements izs<MediaContentItem, s3q0> {
        public final /* synthetic */ izs<q610, s3q0> b;
        public final /* synthetic */ Context c;

        public a(Context context, izs izsVar) {
            this.b = izsVar;
            this.c = context;
        }

        @Override // xsna.izs
        public final s3q0 invoke(MediaContentItem mediaContentItem) {
            this.b.invoke(new q610.d(this.c, mediaContentItem));
            return s3q0.a;
        }
    }

    /* compiled from: MarketLinkedContentScreen.kt */
    @b6l(c = "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentScreenKt$GridView$1$1$1$2$1", f = "MarketLinkedContentScreen.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ MediaContentItem $item;
        final /* synthetic */ izs<q610, s3q0> $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super q610, s3q0> izsVar, MediaContentItem mediaContentItem, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$onAction = izsVar;
            this.$item = mediaContentItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$onAction, this.$item, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onAction.invoke(new q610.e(this.$item));
            return s3q0.a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public c(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    public static final class d implements zzs<cry, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ Context d;

        public d(List list, izs izsVar, Context context) {
            this.b = list;
            this.c = izsVar;
            this.d = context;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(cry cryVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            cry cryVar2 = cryVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(cryVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1117249557, i, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                }
                MediaContentItem mediaContentItem = (MediaContentItem) this.b.get(intValue);
                aVar2.K(-256465847);
                q630 E = ahn.E(q630.a.a, "mediaContentItemBlock");
                izs izsVar = this.c;
                boolean J = aVar2.J(izsVar);
                Context context = this.d;
                boolean y = J | aVar2.y(context);
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (y || x == c0012a) {
                    x = new a(context, izsVar);
                    aVar2.R(x);
                }
                j710.g(mediaContentItem, E, (izs) x, aVar2, 48);
                MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
                boolean J2 = aVar2.J(izsVar) | aVar2.J(mediaContentItem);
                Object x2 = aVar2.x();
                if (J2 || x2 == c0012a) {
                    x2 = new b(izsVar, mediaContentItem, null);
                    aVar2.R(x2);
                }
                bap.g(marketProductLinkedContentItemDto, (wzs) x2, aVar2, 0);
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

    /* compiled from: MarketLinkedContentScreen.kt */
    @b6l(c = "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentScreenKt$LinkedContentScreen$2$1", f = "MarketLinkedContentScreen.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements yzs<z37<q610>, t610, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<t610, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(izs<? super t610, s3q0> izsVar, spj<? super e> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<q610> z37Var, t610 t610Var, spj<? super s3q0> spjVar) {
            e eVar = new e(this.$onEvent, spjVar);
            eVar.L$0 = t610Var;
            return eVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t610 t610Var = (t610) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(t610Var);
            return s3q0.a;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, gzs gzsVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a aVar2;
        final gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(1922410390);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1922410390, i2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.ErrorView (MarketLinkedContentScreen.kt:305)");
            }
            gzsVar2 = gzsVar;
            ldv0.d(txj0.f(q630Var, 1.0f), ad0.s(pg90.a(R.drawable.vk_icon_globe_cross_outline_56, 0, M), 0L, null, null, null, null, null, M, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), zra0.a.a(d370.N(z ? R.string.product_media_content_network_error_title : R.string.product_media_content_loading_error_title, 0, M), null, d370.N(z ? R.string.product_media_content_network_error_description : R.string.product_media_content_loading_error_description, 0, M), null, M, 196608, 26), wra0.b.a(wra0.a.C3954a.a(d370.N(R.string.retry, 0, M), gzsVar2, null, ButtonStyle.Tertiary, null, false, null, null, null, null, null, null, false, false, null, null, M, ((i2 >> 3) & 112) | 3072, 12582912, 131060), null, null, M, 14), null, null, false, M, 0, 112);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, gzsVar2, q630Var, z) { // from class: xsna.d710
                public final /* synthetic */ boolean b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ gzs d;

                {
                    this.b = z;
                    this.c = q630Var;
                    this.d = gzsVar2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j710.a(ne7.I(1), (androidx.compose.runtime.a) obj, this.d, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final List list, final dsy dsyVar, final boolean z, final boolean z2, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1805828103);
        int i2 = (M.y(izsVar) ? 16384 : 8192) | i | (M.J(list) ? 4 : 2) | (M.J(dsyVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1805828103, i2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.GridView (MarketLinkedContentScreen.kt:260)");
            }
            final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            q630 d2 = txj0.d(ahn.E(q630.a.a, "mediaContentGrid"), 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            efu.b bVar = new efu.b(3);
            float f = 2;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            a.j g2 = androidx.compose.foundation.layout.a.g(f);
            boolean y = ((i2 & 896) == 256) | ((i2 & 14) == 4) | ((57344 & i2) == 16384) | M.y(context) | ((i2 & 7168) == 2048);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                izs izsVar2 = new izs() { // from class: xsna.e710
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        rry rryVar = (rry) obj;
                        if (!z) {
                            List list2 = list;
                            rryVar.a(list2.size(), null, new j710.c(list2), new jai(-1117249557, new j710.d(list2, izsVar, context), true));
                            if (z2) {
                                rry.j(rryVar, new gvs(5), hhi.b, 5);
                            }
                        }
                        return s3q0.a;
                    }
                };
                M.R(izsVar2);
                x = izsVar2;
            }
            uqy.b(bVar, m, dsyVar, null, g, g2, null, false, null, (izs) x, M, ((i2 << 3) & 896) | 1769472, 0, 920);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(list, dsyVar, z, z2, izsVar, i) { // from class: xsna.f710
                public final /* synthetic */ List b;
                public final /* synthetic */ dsy c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    j710.b(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(u710 u710Var, final u710.a.C3787a c3787a, final izs<? super q610, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        Object obj;
        int i3;
        final dsy dsyVar;
        mtk0 mtk0Var;
        androidx.compose.runtime.a M = aVar.M(-235204313);
        int i4 = i | (M.J(u710Var) ? 4 : 2) | (M.J(c3787a) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-235204313, i4, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.LinkedContentMainContent (MarketLinkedContentScreen.kt:134)");
            }
            int i5 = c3787a.e;
            List<MediaContentItem> list = c3787a.d;
            int size = list != null ? list.size() : 0;
            int i6 = i4 & 896;
            int i7 = i4 & 14;
            boolean z = ((i4 & 112) == 32) | (i6 == 256) | (i7 == 4);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (z || x == obj2) {
                x = new dyc(izsVar, u710Var, c3787a, 3);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2028277363, 0, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.lazyRememberState (MarketLinkedContentScreen.kt:474)");
            }
            wh50 c2 = androidx.compose.runtime.k.c(gzsVar, M, 0);
            M.K(740613842);
            dsy a2 = gsy.a(0, 3, M);
            M.K(740615479);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(367716593, 0, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.collectIsEndAsState (MarketLinkedContentScreen.kt:491)");
            }
            boolean J = M.J(a2) | M.o(size);
            Object x2 = M.x();
            if (J || x2 == obj2) {
                x2 = bbk0.b(new k44(a2, size, 2));
                M.R(x2);
            }
            mtk0 mtk0Var2 = (mtk0) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean J2 = M.J(mtk0Var2) | M.J(a2) | M.o(i5) | M.J(c2);
            Object x3 = M.x();
            if (J2 || x3 == obj2) {
                i2 = i6;
                obj = obj2;
                i3 = i7;
                dsyVar = a2;
                mtk0Var = mtk0Var2;
                Object k710Var = new k710(mtk0Var, dsyVar, i5, c2, null);
                M.R(k710Var);
                x3 = k710Var;
            } else {
                i2 = i6;
                obj = obj2;
                i3 = i7;
                dsyVar = a2;
                mtk0Var = mtk0Var2;
            }
            bap.g(mtk0Var, (wzs) x3, M, 0);
            M.j();
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z2 = c3787a.c;
            boolean z3 = (i2 == 256) | (i3 == 4);
            Object x4 = M.x();
            if (z3 || x4 == obj) {
                x4 = new com.vk.movika.sdk.base.logic.interactor.c(14, izsVar, u710Var);
                M.R(x4);
            }
            dge0.a(z2, (gzs) x4, txj0.d(q630.a.a, 1.0f), null, null, kai.c(1615164153, new yzs() { // from class: xsna.c710
                @Override // xsna.yzs
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1615164153, intValue, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.LinkedContentMainContent.<anonymous> (MarketLinkedContentScreen.kt:164)");
                        }
                        u710.a.C3787a c3787a2 = u710.a.C3787a.this;
                        List list2 = c3787a2.d;
                        if (list2 == null) {
                            list2 = EmptyList.b;
                        }
                        j710.b(list2, dsyVar, c3787a2.c, c3787a2.b, izsVar, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 196992, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ex(i, 5, u710Var, c3787a, izsVar);
        }
    }

    public static final void d(m710 m710Var, izs<? super t610, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(193516378);
        int i2 = (M.J(m710Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(193516378, i2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.LinkedContentScreen (MarketLinkedContentScreen.kt:101)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new n1d(m710Var, 28);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new e(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, hhi.a, M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps7(m710Var, izsVar, i, 2);
        }
    }

    public static final void e(u710 u710Var, izs<? super q610, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(543272677);
        int i2 = (M.J(u710Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(543272677, i2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.LinkedContentScreen (MarketLinkedContentScreen.kt:179)");
            }
            q630 b2 = ahh0.b(n34.t(q630.a.a, dz5.I(0, 1, M, false), null), p490.x(M), Orientation.Vertical);
            float f = 8;
            float f2 = 0;
            uog0 c2 = vog0.c(f, f, f2, f2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(b2, ylu0Var.getBackground().g, c2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(m, kai.c(498255020, new yb1(5, (Object) u710Var, (izs) izsVar), M), null, null, null, 0, ylu0Var2.d().a, 0L, kai.c(1439862849, new i3(u710Var, izsVar, 1), M), M, 805306416, 380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ta8(u710Var, izsVar, i, 3);
        }
    }

    public static final void f(final int i, int i2, androidx.compose.runtime.a aVar, String str, q630 q630Var, boolean z) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2137313207);
        int i3 = (M.J(str) ? 4 : 2) | i2 | (M.o(i) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2137313207, i3, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MediaContentImage (MarketLinkedContentScreen.kt:340)");
            }
            q630.a aVar2 = q630.a.a;
            if (str == null) {
                M.K(192615150);
            } else {
                M.K(192615151);
                q630 d2 = txj0.d(aVar2, 1.0f);
                e.a aVar3 = androidx.compose.ui.graphics.e.a;
                fwu0.c(hr80.m(rte0.d(d2, aVar3), l5g.b, aVar3), null, str, null, null, null, z ? new qow(new jwx(2, 8)) : null, kai.c(-1833609062, new a0t() { // from class: xsna.g710
                    @Override // xsna.a0t
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        lg90 lg90Var = (lg90) obj3;
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 384) == 0) {
                            intValue |= (intValue & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar4.t(intValue & 1, (intValue & 1153) != 1152)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1833609062, intValue, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MediaContentImage.<anonymous>.<anonymous> (MarketLinkedContentScreen.kt:351)");
                            }
                            vjw.a(lg90Var, d370.N(i, 0, aVar4), txj0.d(q630.a.a, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 24968 | ((intValue >> 6) & 14), 104);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar4.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 100663296, 186);
            }
            M.j();
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
            s.d = new h710(i, i2, str, q630Var2, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031e  */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(MediaContentItem mediaContentItem, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        pcg0 pcg0Var;
        pcg0 pcg0Var2;
        Image image;
        ?? r16;
        int i2;
        boolean z;
        Object x;
        float f;
        q630.a aVar2;
        int i3;
        int i4;
        ColorFilter porterDuffColorFilter;
        String str;
        Image image2;
        Image image3;
        androidx.compose.runtime.a M = aVar.M(-1560692387);
        int i5 = i | (M.J(mediaContentItem) ? 4 : 2) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1560692387, i5, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MediaContentItemBlock (MarketLinkedContentScreen.kt:366)");
            }
            MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
            MarketProductLinkedContentItemDto.ContentTypeDto d2 = marketProductLinkedContentItemDto.d();
            MarketProductLinkedContentItemDto.ContentTypeDto contentTypeDto = MarketProductLinkedContentItemDto.ContentTypeDto.VIDEO;
            if (d2 == contentTypeDto) {
                VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
                if (g != null) {
                    VideoFileOld d3 = ums0.d(ums0.a, g, null, null, null, 30);
                    ImageSize imageSize = (ImageSize) ixj0.b(d3.I0.b);
                    if (imageSize == null || (image3 = imageSize.d) == null || (str = image3.d) == null) {
                        ImageSize imageSize2 = (ImageSize) ixj0.b(d3.J0.b);
                        str = (imageSize2 == null || (image2 = imageSize2.d) == null) ? null : image2.d;
                    }
                    r16 = 0;
                    pcg0Var2 = new pcg0(str, d3.O0, ixj0.n(d3.I0.b), d3 instanceof ClipVideoFile ? R.string.accessibility_media_content_clip : R.string.accessibility_media_content_video);
                    if (marketProductLinkedContentItemDto.d() == MarketProductLinkedContentItemDto.ContentTypeDto.PHOTO || marketProductLinkedContentItemDto.f() == null) {
                        if (marketProductLinkedContentItemDto.d() == contentTypeDto) {
                            VideoVideoFullDto g2 = marketProductLinkedContentItemDto.g();
                            if ((g2 != null ? g2.R2() : r16) == VideoVideoTypeDto.SHORT_VIDEO) {
                                i2 = R.drawable.vk_icon_logo_clips_outline_shadow_20;
                            }
                        }
                        i2 = marketProductLinkedContentItemDto.d() != contentTypeDto ? R.drawable.vk_icon_logo_vk_video_outline_shadow_28 : 0;
                    } else {
                        i2 = R.drawable.vk_icon_picture_on_square_outline_shadow_28;
                    }
                    float f2 = 2;
                    q630 d4 = rte0.d(txj0.d(q630Var, 1.0f), vog0.b(f2));
                    float f3 = (float) 0.5d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 d5 = sua.d(1.0f, r18.a(f3, ylu0Var.getImage().a, d4, vog0.b(f2)), false);
                    z = ((i5 & 896) != 256) | ((i5 & 14) != 4);
                    x = M.x();
                    if (!z || x == a.C0011a.a) {
                        x = new com.vk.movika.sdk.base.ui.r0(16, izsVar, mediaContentItem);
                        M.R(x);
                    }
                    q630 c2 = ojc.c(d5, false, null, null, (gzs) x, 15);
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.b;
                    cp10 d6 = ja8.d(ty6Var, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c3 = qri.c(M, c2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (M.N() != null) {
                        n34.r();
                        throw r16;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar3);
                    } else {
                        M.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(M, d6, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(M, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(M, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(M, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(M, c3, dVar);
                    Restriction restriction = pcg0Var2 != null ? pcg0Var2.b : r16;
                    q630.a aVar4 = q630.a.a;
                    Restriction restriction2 = restriction;
                    ra8 ra8Var = ra8.a;
                    if (restriction2 == null || mediaContentItem.c) {
                        f = f2;
                        aVar2 = aVar4;
                        i3 = -1112115233;
                        i4 = 0;
                        if ((pcg0Var2 != null ? pcg0Var2.a : r16) != null) {
                            M.K(-1095957475);
                            f(pcg0Var2.d, 48, M, pcg0Var2.a, null, false);
                        } else {
                            M.K(-1112115233);
                        }
                        M.j();
                    } else {
                        M.K(-1096679155);
                        q630 d7 = txj0.d(aVar4, 1.0f);
                        cp10 d8 = ja8.d(ty6Var, false);
                        int hashCode2 = Long.hashCode(n34.n(M));
                        f = f2;
                        sy90 D2 = M.D();
                        q630 c4 = qri.c(M, d7);
                        if (M.N() == null) {
                            n34.r();
                            throw r16;
                        }
                        M.H();
                        if (M.L()) {
                            M.I(aVar3);
                        } else {
                            M.f();
                        }
                        k9q0.w(M, d8, cVar);
                        k9q0.w(M, D2, eVar);
                        ur.d(hashCode2, M, bVar, M, c2678a);
                        k9q0.w(M, c4, dVar);
                        i3 = -1112115233;
                        f(pcg0Var2.d, 48, M, pcg0Var2.c, null, true);
                        q630 b2 = ra8Var.b(aVar4, dt1.a.f);
                        lg90 a2 = pg90.a(R.drawable.vk_icon_hide_outline_28, 0, M);
                        String N = d370.N(R.string.photo, 0, M);
                        long j = l5g.d;
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        }
                        oe7 oe7Var = new oe7(j, 5, porterDuffColorFilter);
                        aVar2 = aVar4;
                        i4 = 0;
                        vjw.a(a2, N, b2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, M, 1572872, 56);
                        M.G();
                        M.j();
                    }
                    if (i2 > 0) {
                        M.K(-1095787192);
                        vjw.a(pg90.a(i2, i4, M), null, ra8Var.b(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), dt1.a.d), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 56, 120);
                    } else {
                        M.K(i3);
                    }
                    M.j();
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    pcg0Var = null;
                    pcg0Var2 = pcg0Var;
                    r16 = pcg0Var;
                    if (marketProductLinkedContentItemDto.d() == MarketProductLinkedContentItemDto.ContentTypeDto.PHOTO) {
                    }
                    if (marketProductLinkedContentItemDto.d() == contentTypeDto) {
                    }
                    if (marketProductLinkedContentItemDto.d() != contentTypeDto) {
                    }
                    float f22 = 2;
                    q630 d42 = rte0.d(txj0.d(q630Var, 1.0f), vog0.b(f22));
                    float f32 = (float) 0.5d;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630 d52 = sua.d(1.0f, r18.a(f32, ylu0Var2.getImage().a, d42, vog0.b(f22)), false);
                    z = ((i5 & 896) != 256) | ((i5 & 14) != 4);
                    x = M.x();
                    if (!z) {
                    }
                    x = new com.vk.movika.sdk.base.ui.r0(16, izsVar, mediaContentItem);
                    M.R(x);
                    q630 c22 = ojc.c(d52, false, null, null, (gzs) x, 15);
                    dt1.a.getClass();
                    ty6 ty6Var2 = dt1.a.b;
                    cp10 d62 = ja8.d(ty6Var2, false);
                    int hashCode3 = Long.hashCode(n34.n(M));
                    sy90 D3 = M.D();
                    q630 c32 = qri.c(M, c22);
                    cri.h7.getClass();
                    LayoutNode.a aVar32 = cri.a.b;
                    if (M.N() != null) {
                    }
                }
            } else {
                pcg0Var = null;
                r16 = 0;
                PhotosPhotoDto e2 = marketProductLinkedContentItemDto.e();
                Photo a3 = e2 != null ? xfa0.a(e2) : null;
                if (a3 != null) {
                    com.vk.dto.common.Image image4 = a3.y;
                    ImageSize imageSize3 = (ImageSize) ixj0.b(image4.b);
                    pcg0Var2 = new pcg0((imageSize3 == null || (image = imageSize3.d) == null) ? null : image.d, a3.L, ixj0.n(image4.b), marketProductLinkedContentItemDto.f() == null ? R.string.accessibility_media_content_photo : R.string.accessibility_media_content_post);
                    if (marketProductLinkedContentItemDto.d() == MarketProductLinkedContentItemDto.ContentTypeDto.PHOTO) {
                    }
                    if (marketProductLinkedContentItemDto.d() == contentTypeDto) {
                    }
                    if (marketProductLinkedContentItemDto.d() != contentTypeDto) {
                    }
                    float f222 = 2;
                    q630 d422 = rte0.d(txj0.d(q630Var, 1.0f), vog0.b(f222));
                    float f322 = (float) 0.5d;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    ylu0 ylu0Var22 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630 d522 = sua.d(1.0f, r18.a(f322, ylu0Var22.getImage().a, d422, vog0.b(f222)), false);
                    z = ((i5 & 896) != 256) | ((i5 & 14) != 4);
                    x = M.x();
                    if (!z) {
                    }
                    x = new com.vk.movika.sdk.base.ui.r0(16, izsVar, mediaContentItem);
                    M.R(x);
                    q630 c222 = ojc.c(d522, false, null, null, (gzs) x, 15);
                    dt1.a.getClass();
                    ty6 ty6Var22 = dt1.a.b;
                    cp10 d622 = ja8.d(ty6Var22, false);
                    int hashCode32 = Long.hashCode(n34.n(M));
                    sy90 D32 = M.D();
                    q630 c322 = qri.c(M, c222);
                    cri.h7.getClass();
                    LayoutNode.a aVar322 = cri.a.b;
                    if (M.N() != null) {
                    }
                }
                pcg0Var2 = pcg0Var;
                r16 = pcg0Var;
                if (marketProductLinkedContentItemDto.d() == MarketProductLinkedContentItemDto.ContentTypeDto.PHOTO) {
                }
                if (marketProductLinkedContentItemDto.d() == contentTypeDto) {
                }
                if (marketProductLinkedContentItemDto.d() != contentTypeDto) {
                }
                float f2222 = 2;
                q630 d4222 = rte0.d(txj0.d(q630Var, 1.0f), vog0.b(f2222));
                float f3222 = (float) 0.5d;
                if (androidx.compose.runtime.b.d()) {
                }
                ylu0 ylu0Var222 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                }
                q630 d5222 = sua.d(1.0f, r18.a(f3222, ylu0Var222.getImage().a, d4222, vog0.b(f2222)), false);
                z = ((i5 & 896) != 256) | ((i5 & 14) != 4);
                x = M.x();
                if (!z) {
                }
                x = new com.vk.movika.sdk.base.ui.r0(16, izsVar, mediaContentItem);
                M.R(x);
                q630 c2222 = ojc.c(d5222, false, null, null, (gzs) x, 15);
                dt1.a.getClass();
                ty6 ty6Var222 = dt1.a.b;
                cp10 d6222 = ja8.d(ty6Var222, false);
                int hashCode322 = Long.hashCode(n34.n(M));
                sy90 D322 = M.D();
                q630 c3222 = qri.c(M, c2222);
                cri.h7.getClass();
                LayoutNode.a aVar3222 = cri.a.b;
                if (M.N() != null) {
                }
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k71(i, 8, mediaContentItem, q630Var, izsVar);
        }
    }

    public static final void h(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(1250967983);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.l(z) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1250967983, i2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.Toolbar (MarketLinkedContentScreen.kt:446)");
            }
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(z ? R.string.product_service_media_content_title : R.string.product_media_content_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.back, 0, M);
            boolean z2 = (i2 & 14) == 4;
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new h74(izsVar, 4);
                M.R(x);
            }
            muv0.h(a2, q630Var, null, null, e.a.a((gzs) x, N, null, null, null, M, 196608, 28), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, izsVar, q630Var, z) { // from class: xsna.b710
                public final /* synthetic */ izs b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;

                {
                    this.b = izsVar;
                    this.c = z;
                    this.d = q630Var;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j710.h(ne7.I(385), (androidx.compose.runtime.a) obj, this.b, this.d, this.c);
                    return s3q0.a;
                }
            };
        }
    }
}
