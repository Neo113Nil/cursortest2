package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.feature.news.holders.FeedVh;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import xsna.u4a;

/* compiled from: SearchFeedCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class osh0 extends com.vk.catalog2.common.ui.mvp.configuration.a implements z3a {
    public final Object D;
    public final k140 E;
    public final Object F;
    public final Object G;

    /* compiled from: SearchFeedCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_WALL_ITEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public osh0(Bundle bundle) {
        super(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        x750 x750Var = new x750(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D = msy.a(lazyThreadSafetyMode, x750Var);
        this.E = new k140(new mga0(this, 11));
        this.F = msy.a(lazyThreadSafetyMode, new zqf0(2));
        this.G = msy.a(lazyThreadSafetyMode, new iz3(28));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.E.d(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        dha dhaVar = u4aVar.b.I;
        u4a.b bVar = u4aVar.c;
        return new fz8(new wfb0(Collections.singleton(new psh0(dhaVar, bVar.f))), bVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.z3a
    public final kxq b(lca lcaVar) {
        ((lxq) this.F.getValue()).getClass();
        return new kxq(lcaVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        ?? r4 = this.G;
        if (i != 1) {
            if (i != 2 && i != 3) {
                return i != 4 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new PlaceholderVh(aVar.w, false, false, null, null, R.layout.global_search_catalog_placeholder_view, null, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            }
            FeedVh a2 = ((qxq) r4.getValue()).a(catalogViewType, catalogViewStyle, aVar.I);
            return a2 == null ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a2;
        }
        int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, true, R.layout.catalog_search_header_large);
        }
        ((qxq) r4.getValue()).getClass();
        return new SeparatorVh(R.layout.catalog_separator_island_transparent, null, R.attr.vk_ui_transparent, 2);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
