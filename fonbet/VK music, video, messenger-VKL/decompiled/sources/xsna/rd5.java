package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.vkui.LinkBaseVh;
import com.vk.catalog2.common.ui.holders.vkui.LinkCellVh;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import java.io.Serializable;
import xsna.b9s0;
import xsna.u4a;

/* compiled from: AuthorsCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class rd5 extends b9s0 {

    /* compiled from: AuthorsCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rd5(Bundle bundle, b9s0.a aVar) {
        super(r2, r3, r4, aVar, r6, r9 instanceof VideoCatalogId ? (VideoCatalogId) r9 : null);
        String str;
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        UserId userId2 = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        String string3 = bundle.getString("track_code");
        if (string3 == null) {
            SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
            if (searchStatsLoggingInfo == null) {
                str = null;
                Serializable serializable = bundle.getSerializable("video_catalog_id");
            }
            string3 = searchStatsLoggingInfo.f;
        }
        str = string3;
        Serializable serializable2 = bundle.getSerializable("video_catalog_id");
    }

    @Override // xsna.b9s0, com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        if (a.$EnumSwitchMapping$1[catalogDataType.ordinal()] != 1) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] != 1) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        u4a.a aVar = u4aVar.b;
        return new LinkCellVh(aVar.f, LinkCellVh.ImageSize.Small, aVar.j, aVar.m, new LinkBaseVh.a(), 15696);
    }
}
