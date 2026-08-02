package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.ui.holders.HeaderClearBlocksVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.search.SearchSuggestionVh;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.u4a;

/* compiled from: ClipSearchCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public class vbd extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final HeaderClearBlocksVh.a D;
    public final k140 E;
    public final Object F;
    public final Object G;

    /* compiled from: ClipSearchCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_CLIP_SEARCH_SUGGESTION_HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_SEARCH_SUGGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_OWNERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_SEARCH_AUTHORS.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipSearchCatalogConfiguration.kt */
    public static final class b extends w060 {
        @Override // xsna.w060
        public final List<UIBlock> z0(bi20 bi20Var, UIBlockBadge uIBlockBadge, List<? extends UIBlockAction> list) {
            List<UIBlock> z0 = super.z0(bi20Var, uIBlockBadge, list);
            ArrayList arrayList = new ArrayList(c5g.u(z0, 10));
            Iterator it = ((ArrayList) z0).iterator();
            while (it.hasNext()) {
                UIBlock uIBlock = (UIBlock) it.next();
                if (uIBlock instanceof UIBlockHeader) {
                    UIBlockActionClearRecent uIBlockActionClearRecent = ((UIBlockHeader) uIBlock).H;
                }
                arrayList.add(uIBlock);
            }
            return arrayList;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vbd(Bundle bundle) {
        super(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        dhr0.a.getClass();
        this.D = new HeaderClearBlocksVh.a(true, Integer.valueOf(dhr0.u().c));
        this.E = new k140(null);
        com.vk.movika.sdk.base.ui.o0 o0Var = new com.vk.movika.sdk.base.ui.o0(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, o0Var);
        this.G = msy.a(lazyThreadSafetyMode, new lk(6));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return this.E.d(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        r6a r6aVar = new r6a(new wba(), str, str2, z, null, null, null, null, 496);
        ahn.D(r6aVar);
        return rsg0.y0(r6aVar, null, null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return new b(0);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        CatalogViewHolder videoItemNoAutoPlayVh;
        CatalogViewHolder headerShowAllVh;
        u4a.b bVar = u4aVar.c;
        u4a.a aVar = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        b5a b5aVar = aVar.f;
        boolean f = epx.f(catalogConfiguration.q(), UserId.d);
        CatalogViewHolder catalogViewHolder = null;
        switch (a.$EnumSwitchMapping$1[catalogDataType.ordinal()]) {
            case 1:
                if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1) {
                    videoItemNoAutoPlayVh = new VideoItemNoAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.n, aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, bVar.a, false, 224);
                    catalogViewHolder = videoItemNoAutoPlayVh;
                    break;
                }
                break;
            case 2:
                if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1) {
                    catalogViewHolder = new SearchSuggestionVh(R.layout.catalog_clips_list_search_hint, bVar.a, b5aVar);
                    break;
                }
                break;
            case 3:
                int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i == 2) {
                    catalogViewHolder = new HeaderClearBlocksVh(aVar.e, b5aVar, R.layout.catalog_clip_search_header_clear_compact, this.D);
                    break;
                } else {
                    if (i == 3) {
                        headerShowAllVh = new HeaderShowAllVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, R.layout.catalog_clip_search_header_compact, aVar.m);
                    } else if (i == 4) {
                        headerShowAllVh = new HeaderShowAllVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, R.layout.catalog_header_show_all, aVar.m);
                    } else if (i == 5) {
                        headerShowAllVh = new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, true, R.layout.catalog_search_header_large);
                    }
                    catalogViewHolder = headerShowAllVh;
                    break;
                }
            case 4:
                int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i2 == 6) {
                    catalogViewHolder = new PlaceholderVh(aVar.w, false, false, null, null, 0, null, 0, 254);
                    break;
                } else if (i2 == 7) {
                    videoItemNoAutoPlayVh = new PlaceholderVh(aVar.w, false, false, null, null, R.layout.global_search_catalog_placeholder_view, null, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
                    catalogViewHolder = videoItemNoAutoPlayVh;
                    break;
                } else {
                    headerShowAllVh = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    catalogViewHolder = headerShowAllVh;
                    break;
                }
            case 5:
            case 6:
                if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1) {
                    videoItemNoAutoPlayVh = new SearchAuthorVh(R.layout.catalog_search_owner_item, aVar.f, aVar.e, aVar.m, aVar.o, aVar.s, new SearchAuthorVh.b(aVar.b, fxc0.B().Y()), aVar.K, new SearchAuthorVh.c(((Boolean) this.F.getValue()).booleanValue(), ((Boolean) this.G.getValue()).booleanValue()), null, 1536);
                    catalogViewHolder = videoItemNoAutoPlayVh;
                    break;
                }
                break;
        }
        return catalogViewHolder == null ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : catalogViewHolder;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }
}
