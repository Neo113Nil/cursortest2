package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.core.utils.newtork.d;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.voip.ui.share.link.pager.view.a;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dd9;
import xsna.fha;
import xsna.hnj0;
import xsna.m7a0;
import xsna.n3t0;
import xsna.oem0;
import xsna.pqc;
import xsna.qdd;
import xsna.r7q0;
import xsna.t8a;
import xsna.x1s;

/* compiled from: RxExt.kt */
/* loaded from: classes.dex */
public final class hg1 {

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class a implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class a0 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (r480) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.models.events.OnDialogUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class a1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof h7o0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    public static final class a2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof h2i0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class a3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof m7a0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class a4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (hy00) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.ecomm.market.api.bus.MarketEventFaveChanged");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class b implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof nda0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class b0 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof r480).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class b1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof jyp0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class b2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (epo0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.ui.components.theme_chooser.ThemeChooserComponent.ThemeChooserError.SaveFailed");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class b3 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public b3(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class b4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof hy00).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class c implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof zaa0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class c0 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (sa80) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.OnReloadCatalogSectionEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class c1 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public c1(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class c2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof epo0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class c3 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public c3(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class c4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (ib50) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.music.events.MusicTrackDownloadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes15.dex */
    public static final class d implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (r7q0.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.articleeditor.api.UpdateArticleBusEvent.ArticleEditorMiniAppClosed");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class d0 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof sa80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class d1 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public d1(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class d2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (lu00) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.market.MarketCatalogAction");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class d3 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (m7a0.f) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.photos.root.rxbus.PhotoEvent.TabSelectMode");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class d4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof ib50).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes15.dex */
    public static final class e implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof r7q0.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class e0 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public e0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class e1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof ob80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class e2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof lu00).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class e3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof m7a0.f).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class e4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof h7o0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class f implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (mg10) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.dto.masks.MaskCatalogEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class f0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public f0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class f1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (oru0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.search.params.api.VkEventSetSearchQuery");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class f2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof xb80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class f3 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (fyr0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.libvideo.event.VideoActionUpdate");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class f4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof h7o0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class g implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof mg10).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class g0 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (pqc.a.c) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.mvp.clip.cache.ClipDiscoverCatalogCache.CacheResult.Remote");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class g1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof oru0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class g2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (NewsEntry) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.feed.core.models.news.NewsEntry");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class g3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof fyr0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class g4 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public g4(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class h implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (t8a.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.holders.util.CatalogLivesDelegate.AvatarLivesClickEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class h0 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof pqc.a.c).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class h1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (wb80) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.models.events.channels.OnSpoilerRevealEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class h2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof NewsEntry).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class h3 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (NewsEntry) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.feed.core.models.news.NewsEntry");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class h4 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public h4(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class i implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof t8a.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class i0 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (enc) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.libvideo.event.ClipClientUploadDone");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class i1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof wb80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class i2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof i9x0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class i3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof NewsEntry).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class i4 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public i4(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class j implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (cfp0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.analytics.TrackClickActionToAnalytics");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class j0 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof enc).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class j1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (r480) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.models.events.OnDialogUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class j2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof xb80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    public static final /* synthetic */ class j3 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final j3 b = new j3(1, hg1.class, "logThrowable", "logThrowable(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class j4 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public j4(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class k implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof cfp0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class k0 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (qdd.c.C3559c) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.mvp.clip.cache.ClipTrendsCatalogCache.CacheResult.Remote");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class k1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof r480).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class k2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (t580) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnDraftUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    public static final /* synthetic */ class k3 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final k3 b = new k3(1, hg1.class, "logThrowable", "logThrowable(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class k4 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public k4(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class l implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (fha.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.holders.util.CatalogStoriesDelegate.StoriesClickEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class l0 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof qdd.c.C3559c).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class l1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (x1s.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.folders.impl.model.FoldersRecommendedListLoader.State.Data");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class l2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof t580).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    public static final /* synthetic */ class l3 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final l3 b = new l3(1, hg1.class, "logThrowable", "logThrowable(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class l4 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public l4(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class m implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof fha.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class m0 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public m0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes18.dex */
    public static final class m1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof x1s.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class m2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (sa80) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.OnReloadCatalogSectionEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class m3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof y280).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes11.dex */
    public static final class m4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (n3t0.c) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.libvideo.api.pip2.VideoPipModeEvent.OnPipModeChangedModeEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class n implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (b180) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnAttachUploadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class n0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public n0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class n1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (NewsEntry) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.feed.core.models.news.NewsEntry");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class n2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof sa80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class n3 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (SearchSpellcheckVh.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.feature.search.holders.SearchSpellcheckVh.CatalogSearchSpellcheckEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes11.dex */
    public static final class n4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof n3t0.c).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class o implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof b180).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class o0 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public o0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class o1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof NewsEntry).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class o2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (ib50) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.music.events.MusicTrackDownloadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class o3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof SearchSpellcheckVh.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class o4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (ewr0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.libvideo.event.VideoActionAlbumAdd");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class p implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (o8b) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.ChannelPinnedMsgsUpdate");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class p0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public p0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class p1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (sa80) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.OnReloadCatalogSectionEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class p2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof ib50).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    public static final class p3 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (p680) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.models.events.OnImEngineInvalidateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class p4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof ewr0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class q implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof o8b).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class q0 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public q0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class q1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof sa80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class q2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (wa80) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnResetCountersTooltipConfigUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class q3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof p680).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes15.dex */
    public static final class q4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (d.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.core.utils.newtork.NetworkStatus.Available");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class r implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (b180) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnAttachUploadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class r0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public r0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class r1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (h3x0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.events.VoipVMStateChangedEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class r2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof wa80).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class r3 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (hnj0.a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.profile.user.api.silentmode.SilentModeBusEvent.SilentModeMiniAppClosed");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes15.dex */
    public static final class r4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof d.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class s implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof b180).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class s0 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public s0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class s1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof h3x0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class s2 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public s2(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class s3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof hnj0.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class s4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (hrw0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.events.VoipJoinLinkCopiedEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class t implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof j0b).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class t0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public t0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class t1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (b180) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnAttachUploadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class t2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (ib50) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.music.events.MusicTrackDownloadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class t3 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public t3(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class t4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof hrw0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class u implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (s080) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnAccountInfoUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class u0 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof r3u).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class u1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof b180).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class u2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof ib50).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class u3 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public u3(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class u4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (dd9.a.C2722a) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.api.events.queue.CallsQueueEvent.Event.CallHistoryUpdated");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class v implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof s080).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class v0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public v0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class v1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (u180) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnBgSyncStateUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class v2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (ib50) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.music.events.MusicTrackDownloadEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class v3 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (cx7) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.ecomm.market.api.bus.BookingServiceSelected");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class v4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof dd9.a.C2722a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    public static final class w implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (s080) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnAccountInfoUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class w0 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public w0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class w1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof u180).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes3.dex */
    public static final class w2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof ib50).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes16.dex */
    public static final class w3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof cx7).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class w4 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (a.d) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerAction.OnCopyClicked");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class x implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof s080).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes5.dex */
    public static final class x0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public x0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class x1 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public x1(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes15.dex */
    public static final class x2 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof i9x0).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class x3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof oem0.b.a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class x4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof a.d).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class y implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public y(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class y0 implements io.reactivex.rxjava3.functions.l {
        public final /* synthetic */ izs b;

        public y0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class y1 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (s080) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.im.engine.events.OnAccountInfoUpdateEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class y2 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public y2(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class y3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof oem0.a.C3452a).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes11.dex */
    public static final class y4 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public y4(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class z implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public z(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    public static final class z0 implements io.reactivex.rxjava3.functions.m {
        public final /* synthetic */ izs b;

        public z0(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes2.dex */
    public static final class z1 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof s080).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes4.dex */
    public static final class z2 implements io.reactivex.rxjava3.functions.l {
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            if (obj != null) {
                return (m7a0) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.photos.root.rxbus.PhotoEvent");
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes6.dex */
    public static final class z3 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof oem0.a.c).booleanValue();
        }
    }

    /* compiled from: RxExt.kt */
    /* loaded from: classes7.dex */
    public static final class z4 implements io.reactivex.rxjava3.functions.m {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return Boolean.valueOf(obj instanceof c790).booleanValue();
        }
    }

    public static final void a(io.reactivex.rxjava3.disposables.c cVar, f5z f5zVar) {
        if (f5zVar.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            f5zVar.getLifecycle().addObserver(new xtg0(cVar));
        } else {
            cVar.dispose();
        }
    }

    public static final void b(View view, io.reactivex.rxjava3.disposables.c cVar) {
        view.addOnAttachStateChangeListener(new ytg0(view, cVar));
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.i0 c(io.reactivex.rxjava3.core.q qVar, Class... clsArr) {
        int i5 = 9;
        ie40 ie40Var = new ie40(new arb0(clsArr, i5), i5);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, ie40Var);
    }

    public static final boolean d(io.reactivex.rxjava3.disposables.c cVar) {
        return (cVar == null || cVar.h()) ? false : true;
    }

    public static final void e(io.reactivex.rxjava3.disposables.b bVar, io.reactivex.rxjava3.disposables.c cVar) {
        if (cVar == null || bVar == null) {
            return;
        }
        bVar.b(cVar);
    }

    public static final void f(io.reactivex.rxjava3.disposables.c cVar) {
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public static final io.reactivex.rxjava3.disposables.c g(io.reactivex.rxjava3.core.a aVar, gzs<s3q0> gzsVar) {
        return aVar.subscribe(new ktg0(gzsVar, 0), new xu00(l3.b, 1));
    }

    public static final <T> io.reactivex.rxjava3.disposables.c h(io.reactivex.rxjava3.core.q<T> qVar, izs<? super T, s3q0> izsVar) {
        return qVar.subscribe(new b43(izsVar, 2), new jx50(j3.b, 1));
    }

    public static final <T> io.reactivex.rxjava3.disposables.c i(io.reactivex.rxjava3.core.x<T> xVar, izs<? super T, s3q0> izsVar) {
        return xVar.subscribe(new opy(izsVar, 2), new ltg0(k3.b, 0));
    }

    public static final <T> io.reactivex.rxjava3.core.x<T> k(io.reactivex.rxjava3.core.x<T> xVar, Context context) {
        return n(xVar, context, false, null, 62);
    }

    public static io.reactivex.rxjava3.core.a l(io.reactivex.rxjava3.core.a aVar, Context context, int i5) {
        Activity h5;
        boolean z5 = (i5 & 8) != 0;
        if (context == null || (h5 = e3m.h(context)) == null) {
            return aVar;
        }
        b2e0 b2e0Var = new b2e0(h5, new Handler(Looper.getMainLooper()), R.string.rx_loading, z5, false, null);
        d750 d750Var = new d750(new otg0(b2e0Var, 300L), 12);
        aVar.getClass();
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.completable.w(aVar, d750Var, lVar, kVar, kVar, kVar, kVar).g(new xv(b2e0Var, 7)).i(new oo20(new gj80(b2e0Var, 11), 20)).h(new yyo(b2e0Var, 2)).j(new zsb(b2e0Var, 6));
    }

    public static io.reactivex.rxjava3.core.q m(io.reactivex.rxjava3.core.q qVar, Context context, long j5, boolean z5, int i5) {
        Activity h5;
        if ((i5 & 2) != 0) {
            j5 = 300;
        }
        boolean z6 = (i5 & 8) != 0 ? true : z5;
        boolean z7 = (i5 & 16) == 0;
        if (context == null || (h5 = e3m.h(context)) == null) {
            return qVar;
        }
        b2e0 b2e0Var = new b2e0(h5, new Handler(Looper.getMainLooper()), R.string.rx_loading, z6, z7, null);
        f2u f2uVar = new f2u(new mtg0(b2e0Var, j5), 15);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(qVar, f2uVar, io.reactivex.rxjava3.internal.functions.a.c).C(new kz(b2e0Var, 4)).F(new s520(new p010(b2e0Var, 24), 16)), io.reactivex.rxjava3.internal.functions.a.d, new h53(b2e0Var, 4));
    }

    public static io.reactivex.rxjava3.core.x n(io.reactivex.rxjava3.core.x xVar, Context context, boolean z5, gzs gzsVar, int i5) {
        Activity h5;
        long j5 = (i5 & 2) != 0 ? 300L : 500L;
        boolean z6 = (i5 & 8) != 0 ? true : z5;
        boolean z7 = (i5 & 16) == 0;
        if ((i5 & 32) != 0) {
            gzsVar = null;
        }
        gzs gzsVar2 = gzsVar;
        if (context == null || (h5 = e3m.h(context)) == null) {
            return xVar;
        }
        b2e0 b2e0Var = new b2e0(h5, new Handler(Looper.getMainLooper()), R.string.rx_loading, z6, z7, gzsVar2);
        kjs kjsVar = new kjs(new ttg0(b2e0Var, j5), 17);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.n(xVar, kjsVar), new ljs(new f0z(b2e0Var, 26), 23)).h(new j3z(new r820(b2e0Var, 20), 17)), new ul0(b2e0Var, 4));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.c2 o(io.reactivex.rxjava3.core.q qVar, int i5, izs izsVar) {
        nm3 nm3Var = new nm3(new k330(i5, izsVar, new z7w(19)), 28);
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.c2(qVar, nm3Var);
    }
}
