package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.HeaderVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.lists.c;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.u4a;

/* compiled from: EmptyCartCatalogConfiguration.kt */
/* loaded from: classes18.dex */
public final class afp extends zc6 {
    public final xga D = new xga();
    public final e3a E = new e3a();
    public final MarketAnalyticsParams F = new MarketAnalyticsParams(null, null, CommonMarketStat$TypeRefSource.EMPTY_CART, null, null, null, null, false, null, false, false, null, false, 8187, null);

    /* compiled from: EmptyCartCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: EmptyCartCatalogConfiguration.kt */
    public static final class b implements qda {
        @Override // xsna.qda
        public final boolean a(UIBlock uIBlock, boolean z) {
            return true;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$2[catalogConfiguration$Companion$ContainerType.ordinal()];
        MarketAnalyticsParams marketAnalyticsParams = this.F;
        if (i == 1) {
            return new ogc(true, marketAnalyticsParams, aVar.I);
        }
        if (i == 2) {
            return new ogc(false, marketAnalyticsParams, aVar.I);
        }
        if (i == 3) {
            return new s4a();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.zc6, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        boolean z = true;
        if (i == 1) {
            return a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 ? new HeaderShowAllVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, R.layout.catalog_classifieds_header_show_all, aVar.m) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        if (i == 2) {
            if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] != 2) {
                return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            }
            y1a y1aVar = new y1a(aVar.e, new whu0(this), K(u4aVar), null);
            HorizontalListVh horizontalListVh = new HorizontalListVh(this, new c.h((c.m) y1aVar), y1aVar, u4aVar);
            horizontalListVh.m = new b();
            return horizontalListVh;
        }
        CatalogViewHolder w = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        if (catalogViewType != CatalogViewType.HEADER && catalogViewType != CatalogViewType.HEADER_COMPACT) {
            z = false;
        }
        if (catalogDataType == CatalogDataType.DATA_TYPE_NONE && z && (w instanceof HeaderVh)) {
            HeaderVh headerVh = (HeaderVh) w;
            headerVh.p = 6.0f;
            View view = headerVh.f;
            f4m.y(iah0.a(headerVh.p) + (view != null ? view : null).getPaddingTop(), view != null ? view : null);
        }
        return w;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        this.D.getClass();
        tfx tfxVar = new tfx("catalog.getEmptyCart", new yq(5), new io.reactivex.rxjava3.internal.operators.mixed.j(6));
        tfxVar.j("need_blocks", true);
        return ktr.c(rsg0.T(yfb.x(tfxVar)).U(new yh1(new k7f(this, 15), 15)));
    }
}
