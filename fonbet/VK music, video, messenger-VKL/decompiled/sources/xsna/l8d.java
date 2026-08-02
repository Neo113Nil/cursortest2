package xsna;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicTemplatesCatalogHeaderShowAll;
import com.vk.catalog2.common.ui.mvp.holder.container.ClipTrendsVerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.view.NestedScrollableRecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.u4a;

/* compiled from: ClipMusicTemplatesCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class l8d extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final k8d D;
    public final m8d E;

    /* compiled from: ClipMusicTemplatesCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR_COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipMusicTemplatesCatalogConfiguration.kt */
    public static final class b extends w060 {
        @Override // xsna.w060
        public final UIBlock Q0(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData) {
            List<CatalogBlock> list = catalogSection.i;
            g5g.D(list, true, new qt(12));
            String str = catalogSection.b;
            CatalogLayout catalogLayout = new CatalogLayout(CatalogViewType.SEPARATOR_COMPACT, UserId.d, "", null, null, false, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, null);
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_NONE;
            list.add(0, new CatalogBlock("local_separator_block_id", catalogDataType, null, str, null, null, null, catalogLayout, new ArrayList(), null, new ArrayList(), new CatalogBlockItemsData(catalogDataType, new ArrayList(), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2088964, null));
            return (UIBlockList) super.Q0(CatalogSection.zb(catalogSection, null, null, null, list, 16255), catalogExtendedData);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l8d(Bundle bundle) {
        super(r0, r1);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("hash_tag");
        this.D = new k8d((byte) 0, 0);
        this.E = new m8d(this, string2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        return (com.vk.core.view.NestedScrollableRecyclerView) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NestedScrollableRecyclerView z0(View view) {
        View rootView = view.getRootView();
        while (true) {
            boolean z = view instanceof NestedScrollableRecyclerView;
            if (z || view == null || view.equals(rootView)) {
                break;
            }
            view = (View) view.getParent();
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return new b(0);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final db80 V() {
        return new uah0(0.75f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 13);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new ClipTrendsVerticalListVh(this, hVar, tbaVar, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        boolean f = epx.f(aVar.s.q(), UserId.d);
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        if (i == 1) {
            int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
            return i2 != 1 ? i2 != 2 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new SeparatorVh(R.layout.catalog_separator_pressed_up, null, 0, 6) : new ClipsMusicTemplatesCatalogHeaderShowAll(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, R.layout.catalog_header_show_all, aVar.m);
        }
        if (i != 2) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        int i3 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        return i3 != 3 ? i3 != 4 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.p, aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, true, SubtitlesConfigurationMode.ALWAYS_DISABLED, this.E, false, 384) : new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.o, aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, true, SubtitlesConfigurationMode.ALWAYS_DISABLED, this.E, false, 384);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return rsg0.y0(new c6a(new wba()), null, null, 3);
    }
}
