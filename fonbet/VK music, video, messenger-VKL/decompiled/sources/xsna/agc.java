package xsna;

import android.os.Bundle;
import android.util.LruCache;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.classifieds.CatalogCategoryTabVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.NavigationTabVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.feature.news.holders.FeedVh;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.impl.catalog.common.MarketPlaceholderVh;
import com.vk.ecomm.catalog.impl.catalog.common.ui.holder.infoblock.MarketInfoComposeVh;
import com.vk.ecomm.categories.api.MarketCategoriesComponent;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.mzp0;
import xsna.rzp0;
import xsna.u4a;
import xsna.yfc;

/* compiled from: ClassifiedsCatalogConfig.kt */
/* loaded from: classes18.dex */
public final class agc extends zc6 {
    public final maz D;
    public final String E;
    public final Bundle F;
    public final yfc G;
    public final Object H;
    public final z3n I;
    public final Object J;

    /* compiled from: ClassifiedsCatalogConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.ICONS_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SLIDER_MINIMALISTIC_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_NAVIGATION_TABS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MARKET_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: ClassifiedsCatalogConfig.kt */
    public static final class b extends u96 {
        public boolean c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Bundle bundle) {
            super(bundle);
            this.e = str;
        }

        @Override // xsna.u96, xsna.gda
        public final void c(Bundle bundle) {
            this.b = bundle;
            this.c = true;
        }

        @Override // xsna.gda
        public final io.reactivex.rxjava3.core.q d(String str, String str2, String str3, boolean z, Integer num) {
            agc agcVar = agc.this;
            z3n z3nVar = agcVar.I;
            if (!this.c) {
                xga xgaVar = (xga) z3nVar.b;
                if (str == null) {
                    str = this.e;
                }
                return rsg0.T(yfb.x(wga.d(xgaVar, str, null, str2, Boolean.valueOf(z), null, null, 32634))).U(new yh1(new hv7((afa) z3nVar.d, 4), 24)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            }
            this.c = false;
            Bundle bundle = (Bundle) this.b;
            String str4 = agcVar.E;
            z3nVar.getClass();
            return rsg0.T(yfb.x(z3nVar.a(str4, null, bundle))).U(new iu4(new ou1((e3a) z3nVar.c, 4), 19)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }
    }

    public agc(Bundle bundle, maz mazVar) {
        this.D = mazVar;
        yfc yfcVar = new yfc(bundle);
        this.G = yfcVar;
        cb cbVar = new cb(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.H = msy.a(lazyThreadSafetyMode, cbVar);
        this.I = new z3n();
        this.J = msy.a(lazyThreadSafetyMode, new d4(8));
        String string = bundle.getString("KEY_SEARCH_QUERY");
        String str = null;
        if (string != null && string.length() != 0) {
            this.E = null;
            x8a x8aVar = new x8a(0);
            d02.p(yfcVar, x8aVar);
            Bundle bundle2 = (Bundle) x8aVar.b;
            this.F = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            return;
        }
        Integer valueOf = bundle.containsKey("KEY_CATEGORY_ID") ? Integer.valueOf(bundle.getInt("KEY_CATEGORY_ID")) : null;
        String string2 = bundle.getString("KEY_SECTION_ID");
        if (string2 != null) {
            str = string2;
        } else if (valueOf != null) {
            str = "category";
        }
        this.E = str;
        this.F = d02.o(yfcVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$2[catalogConfiguration$Companion$ContainerType.ordinal()];
        ?? r0 = this.H;
        if (i == 1) {
            return new ogc(true, (MarketAnalyticsParams) r0.getValue(), aVar.I);
        }
        if (i == 2) {
            return new ogc(false, (MarketAnalyticsParams) r0.getValue(), aVar.I);
        }
        if (i == 3) {
            return new s4a();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final gda l(String str) {
        return new b(str, this.F);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zc6, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, final u4a u4aVar) {
        CatalogViewHolder headerShowAllVh;
        String str;
        u4a.a aVar = u4aVar.b;
        CatalogViewHolder catalogViewHolder = null;
        switch (a.$EnumSwitchMapping$1[catalogDataType.ordinal()]) {
            case 1:
                FeedVh a2 = ((qxq) this.J.getValue()).a(catalogViewType, catalogViewStyle, aVar.I);
                return a2 == null ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a2;
            case 2:
                int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                ?? r2 = this.H;
                return i != 1 ? i != 2 ? i != 3 ? i != 4 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new CatalogCategoryTabVh(this.D, ((MarketCategoriesComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketCategoriesComponent.class))).a(), (MarketAnalyticsParams) r2.getValue()) : new HorizontalNonScrollableListVh(this, u4aVar, cn70.b(12), Integer.valueOf(cn70.b(12)), 0, 16) : new NavigationTabVh(u4aVar, (MarketAnalyticsParams) r2.getValue(), true, R.layout.catalog_navigation_tab_vh_borders) : new NavigationTabVh(u4aVar, (MarketAnalyticsParams) r2.getValue(), 8);
            case 3:
                return new MarketInfoComposeVh(aVar.d);
            case 4:
                int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i2 != 7) {
                    if (i2 == 8) {
                        headerShowAllVh = new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, true, R.layout.catalog_search_header_large);
                    }
                    return catalogViewHolder != null ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : catalogViewHolder;
                }
                headerShowAllVh = new HeaderShowAllVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, R.layout.catalog_classifieds_header_show_all, aVar.m);
                catalogViewHolder = headerShowAllVh;
                if (catalogViewHolder != null) {
                }
            case 5:
                final ToolbarVh toolbarVh = new ToolbarVh(aVar.b, aVar.e, null, R.layout.catalog_classified_category_toolbar, false, null, null, null, null, null, null, 4063220);
                if (uIBlock == null || (str = uIBlock.b) == null) {
                    str = "";
                }
                uba ubaVar = new uba(h0(null, str, u4aVar));
                final CatalogPaginatedListViewHolder g0 = com.vk.catalog2.common.ui.mvp.configuration.a.g0(this, uIBlock, u4aVar, ubaVar, 8);
                ShowAllListVh showAllListVh = new ShowAllListVh(u4aVar, toolbarVh, g0) { // from class: com.vk.ecomm.catalog.impl.catalog.common.ClassifiedsCatalogConfig$createShowAllVh$1$1
                    @Override // com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
                    public final void N6(UIBlock uIBlock2) {
                        yfc yfcVar = this.G;
                        yfcVar.getClass();
                        LruCache<UUID, mzp0> lruCache = rzp0.a;
                        mzp0 d = rzp0.d(yfcVar.a);
                        if (d != null) {
                            d.c(false);
                        }
                        super.N6(uIBlock2);
                        yfcVar.getClass();
                        mzp0 d2 = rzp0.d(yfcVar.a);
                        if (d2 != null) {
                            d2.d(null);
                        }
                    }
                };
                ubaVar.h = showAllListVh;
                return showAllListVh;
            case 6:
                int i3 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i3 != 1 && i3 != 4 && i3 != 5) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                y1a y1aVar = new y1a(aVar.e, new whu0(this), K(u4aVar), null);
                HorizontalListVh horizontalListVh = new HorizontalListVh(this, new c.h((c.m) y1aVar), y1aVar, u4aVar);
                horizontalListVh.m = new c();
                return horizontalListVh;
            case 7:
                return a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 6 ? new PlaceholderVh(aVar.w, false, false, null, null, 0, null, 0, 254) : new MarketPlaceholderVh(aVar.w);
            default:
                return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        z3n z3nVar = this.I;
        z3nVar.getClass();
        return rsg0.T(yfb.x(z3nVar.a(this.E, null, this.F))).U(new nz(new ptb((e3a) z3nVar.c, 2), 24)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    /* compiled from: ClassifiedsCatalogConfig.kt */
    public static final class c implements qda {
        @Override // xsna.qda
        public final boolean a(UIBlock uIBlock, boolean z) {
            return z;
        }
    }
}
