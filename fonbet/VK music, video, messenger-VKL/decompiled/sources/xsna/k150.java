package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.playlist.display.presentation.MusicPlaylistPaginationState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cri;
import xsna.dt1;
import xsna.lab0;
import xsna.q630;

/* compiled from: MusicPlaylistListContent.kt */
/* loaded from: classes3.dex */
public final class k150 extends tab0 {
    public static final /* synthetic */ int n = 0;
    public final mtk0<mab0<lab0>> e;
    public final mtk0<UIBlockList> f;
    public final mtk0<List<UIBlockPlaceholder>> g;
    public final mtk0<MusicPlaylistPaginationState> h;
    public final mtk0<Boolean> i;
    public final wh50 j;
    public final mtk0<Long> k;
    public final mtk0<Boolean> l;
    public final b250 m;

    /* compiled from: MusicPlaylistListContent.kt */
    @b6l(c = "com.vk.music.playlist.display.presentation.MusicPlaylistListContent$Component$1$1$1", f = "MusicPlaylistListContent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<Boolean> $shouldLoadMore$delegate;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ k150 this$0;

        /* compiled from: MusicPlaylistListContent.kt */
        @b6l(c = "com.vk.music.playlist.display.presentation.MusicPlaylistListContent$Component$1$1$1$1", f = "MusicPlaylistListContent.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.k150$a$a, reason: collision with other inner class name */
        public static final class C3157a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ k150 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3157a(k150 k150Var, spj<? super C3157a> spjVar) {
                super(2, spjVar);
                this.this$0 = k150Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3157a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3157a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.this$0.m.a.invoke(a.f.C1346a.b);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mtk0<Boolean> mtk0Var, k150 k150Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$shouldLoadMore$delegate = mtk0Var;
            this.this$0 = k150Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$shouldLoadMore$delegate, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            mtk0<Boolean> mtk0Var = this.$shouldLoadMore$delegate;
            int i = k150.n;
            if (mtk0Var.getValue().booleanValue()) {
                myc0.h(yvjVar, null, null, new C3157a(this.this$0, null), 3);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MusicPlaylistListContent.kt */
    public static final class b extends d8b0 {
        public b() {
        }

        @Override // xsna.epi
        public final void b(dpi dpiVar) {
            Object obj;
            ActionOpenUrl actionOpenUrl;
            ActionOpenUrl actionOpenUrl2;
            String str;
            b250 b250Var = k150.this.m;
            UIBlock uIBlock = dpiVar.a;
            if (uIBlock instanceof UIBlockMusicPlaylist) {
                b250Var.a.invoke(new a.d.C1344a(((UIBlockMusicPlaylist) uIBlock).z, uIBlock.b));
                return;
            }
            b250Var.getClass();
            if (uIBlock instanceof UIBlockPlaceholder) {
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
                UIBlockAction uIBlockAction = uIBlockPlaceholder.F;
                String str2 = null;
                UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockAction instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlockAction : null;
                if (uIBlockActionOpenUrl == null || (actionOpenUrl2 = uIBlockActionOpenUrl.A) == null || (str = actionOpenUrl2.c) == null) {
                    ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder.G;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (obj2 instanceof UIBlockActionOpenUrl) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((UIBlockActionOpenUrl) obj).d != CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    UIBlockActionOpenUrl uIBlockActionOpenUrl2 = (UIBlockActionOpenUrl) obj;
                    if (uIBlockActionOpenUrl2 != null && (actionOpenUrl = uIBlockActionOpenUrl2.A) != null) {
                        str2 = actionOpenUrl.c;
                    }
                } else {
                    str2 = str;
                }
                if (str2 != null) {
                    b250Var.a.invoke(new a.e.c(str2));
                }
            }
        }
    }

    /* compiled from: MusicPlaylistListContent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((b250) this.receiver).a.invoke(a.e.b.b);
            return s3q0.a;
        }
    }

    /* compiled from: MusicPlaylistListContent.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((b250) this.receiver).a.invoke(a.f.d.b);
            return s3q0.a;
        }
    }

    public k150(wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, wh50 wh50Var4, wh50 wh50Var5, wh50 wh50Var6, wh50 wh50Var7, wh50 wh50Var8, wh50 wh50Var9, wh50 wh50Var10, b250 b250Var) {
        super(wh50Var, wh50Var2, new td5(1, b250Var, b250.class, "onOpenUrl", "onOpenUrl(Ljava/lang/String;)V", 0, 14));
        this.e = wh50Var3;
        this.f = wh50Var4;
        this.g = wh50Var5;
        this.h = wh50Var6;
        this.i = wh50Var7;
        this.j = wh50Var8;
        this.k = wh50Var9;
        this.l = wh50Var10;
        this.m = b250Var;
    }

    @Override // xsna.tab0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1317881345);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1317881345, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.Component (MusicPlaylistListContent.kt:72)");
            }
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            Object a2 = zvy.a(0, 3, M);
            boolean l = M.l(this.i.getValue().booleanValue()) | M.J(a2);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (l || x == obj) {
                x = bbk0.b(new com.vk.movika.sdk.base.ui.p(13, a2, this));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            Boolean bool = (Boolean) mtk0Var.getValue();
            bool.getClass();
            boolean J = M.J(mtk0Var) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new a(mtk0Var, this, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            us2 b2 = b((i2 >> 3) & 14, M);
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = new b();
                M.R(x3);
            }
            fpi.a((b) x3, kai.c(-386249618, new opq(a2, this, b2, 3), M), M, 54);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkd(this, q630Var, i, 4);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1060176896);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1060176896, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.ErrorState (MusicPlaylistListContent.kt:311)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, 1, txj0.f(q630.a.a, 1.0f));
            b250 b250Var = this.m;
            boolean J = M.J(b250Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                c cVar = new c(0, b250Var, b250.class, "onOpenDownloads", "onOpenDownloads()V", 0);
                M.R(cVar);
                x = cVar;
            }
            fcy fcyVar = (fcy) x;
            boolean J2 = M.J(b250Var);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                d dVar = new d(0, b250Var, b250.class, "onRetry", "onRetry()V", 0);
                M.R(dVar);
                x2 = dVar;
            }
            xj40.a((gzs) fcyVar, (gzs) ((fcy) x2), F, false, null, M, 384, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m00(this, i, 4);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(936112705);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(936112705, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.ListFooterComponent (MusicPlaylistListContent.kt:278)");
            }
            teb0.a((kbb0) this.j.getValue(), this.k.getValue().longValue(), ahn.E(q630.a.a, "playlistStats"), M, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w5h(this, i, 5);
        }
    }

    public final void e(lab0.a aVar, boolean z, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(376053925);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(376053925, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.ListItemComponent (MusicPlaylistListContent.kt:232)");
            }
            vtu vtuVar = (vtu) M.r(uvi.l);
            q630 E = ahn.E(q630.a.a, "musicTrack");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(E, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 256) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new dp0(12, this, aVar);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean z3 = (i3 == 256) | (i4 == 4);
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new com.vk.movika.sdk.base.ui.k(18, this, aVar);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            boolean y = (i3 == 256) | M.y(vtuVar) | (i4 == 4);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new s9j(vtuVar, this, aVar, 3);
                M.R(x3);
            }
            xa50.a(aVar, z, m, gzsVar, gzsVar2, (gzs) x3, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lmd(this, aVar, z, i);
        }
    }

    public final void f(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1929975904);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1929975904, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.ListTitleComponent (MusicPlaylistListContent.kt:209)");
            }
            nab0.a(d370.N(!z ? R.string.music_playlist_tracks : R.string.music_playlist_songs, 0, M), ahn.E(q630.a.a, "tracksCount"), !z ? this.b.getValue() : null, M, 48, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.d150
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    k150.this.f(this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void g(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-406599553);
        int i2 = i | (M.J(str) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-406599553, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.PartTitleComponent (MusicPlaylistListContent.kt:254)");
            }
            long j = wlb0.h(M).getBackground().g;
            e.a aVar3 = androidx.compose.ui.graphics.e.a;
            q630.a aVar4 = q630.a.a;
            q630 h = txj0.h(txj0.f(hr80.m(aVar4, j, aVar3), 1.0f), 40);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, h);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            float f = 16;
            f9t.e(txj0.v(aVar4, f), M, 6);
            aVar2 = M;
            yqv0.c(str, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 5).g(new esx0(ht1.a)), wlb0.h(M).getText().p, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(M).o0, aVar2, i2 & 14, 0, 8120);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new zl3(i, 4, this, str, q630Var2);
        }
    }

    public final void h(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-2046266020);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2046266020, i2, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistListContent.TracksListShimmer (MusicPlaylistListContent.kt:287)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 20;
            q630 d2 = rte0.d(txj0.f(aVar2, 1.0f), vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = u150.m(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(d2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a)));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
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
            M.K(2026715739);
            for (int i3 = 0; i3 < 5; i3++) {
                u150.l(i2 & 14, M, null, z);
            }
            M.j();
            float f2 = 8;
            f9t.e(txj0.h(aVar2, f2), M, 6);
            float f3 = 12;
            float f4 = 188;
            u150.k(f3, null, new pco(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            if (z) {
                M.K(-1596123594);
                f9t.e(txj0.h(aVar2, f2), M, 6);
                u150.k(f3, null, new pco(f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 390, 10);
            } else {
                M.K(-1607597872);
            }
            M.j();
            f9t.e(txj0.h(aVar2, 34), M, 6);
            M.G();
            if (a690.d(aVar2, f2, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, i) { // from class: xsna.e150
                public final /* synthetic */ boolean c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    k150.this.h(this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
