package xsna;

import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.block.CatalogBlockItemsData;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.video.ShortVideoType;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsTrendsHeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ClipTrendsVerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.lists.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.u4a;
import xsna.x2a;

/* compiled from: ClipTrendsCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class sdd extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;

    /* compiled from: ClipTrendsCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipTrendsCatalogConfiguration.kt */
    public static final class b extends w060 {
        public b() {
            super(0);
        }

        @Override // xsna.w060
        public final UIBlock Q0(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData) {
            List<CatalogBlock> list = catalogSection.i;
            g5g.D(list, true, new wh6(8));
            String str = catalogSection.b;
            CatalogLayout catalogLayout = new CatalogLayout(CatalogViewType.SEPARATOR_COMPACT, UserId.d, "", null, null, false, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, null);
            CatalogDataType catalogDataType = CatalogDataType.DATA_TYPE_NONE;
            list.add(0, new CatalogBlock("local_separator_block_id", catalogDataType, null, str, null, null, null, catalogLayout, new ArrayList(), null, new ArrayList(), new CatalogBlockItemsData(catalogDataType, new ArrayList(), null, null, null, null, null, null, null, null, null, null, 4092, null), null, null, null, null, null, null, null, null, null, 2088964, null));
            return (UIBlockList) super.Q0(CatalogSection.zb(catalogSection, null, null, null, list, 16255), catalogExtendedData);
        }

        @Override // xsna.w060, xsna.jda
        public final List<UIBlock> b(Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2) {
            ((oqc) sdd.this.E.getValue()).b(obj);
            return super.b(obj, catalogExtendedData, z, z2);
        }

        @Override // xsna.w060
        public final bi20 d(CatalogBlock catalogBlock) {
            return bi20.a(super.d(catalogBlock), null, null, null, null, null, epx.f(catalogBlock.i.h.getString(CatalogCustomAttributes$Keys.STYLE.h()), CatalogCustomAttributes$Values.HIGHLIGHT_TREND.h()) ? "flash_12" : null, 31457279);
        }

        @Override // xsna.w060
        public final List<UIBlock> z0(bi20 bi20Var, UIBlockBadge uIBlockBadge, List<? extends UIBlockAction> list) {
            Iterator it;
            List<UIBlock> z0 = super.z0(bi20Var, uIBlockBadge, list);
            ArrayList arrayList = new ArrayList(c5g.u(z0, 10));
            Iterator it2 = ((ArrayList) z0).iterator();
            while (it2.hasNext()) {
                UIBlock uIBlock = (UIBlock) it2.next();
                if (uIBlock instanceof UIBlockHeader) {
                    UIBlockHeader uIBlockHeader = (UIBlockHeader) uIBlock;
                    if (uIBlockHeader.J != null) {
                        com.vk.catalog2.common.dto.api.ui.a aVar = new com.vk.catalog2.common.dto.api.ui.a(uIBlock.b, uIBlock.c, uIBlock.d, uIBlock.e, uIBlock.f, uIBlock.g, uIBlock.h, uIBlock.Db(), uIBlock.j, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680);
                        String str = uIBlockHeader.y;
                        String str2 = uIBlockHeader.z;
                        TopTitle topTitle = uIBlockHeader.B;
                        UIBlockBadge uIBlockBadge2 = uIBlockHeader.C;
                        UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
                        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader.G;
                        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockHeader.J;
                        it = it2;
                        uIBlock = new UIBlockHeader(aVar, str, str2, topTitle, new mwp0(uIBlockBadge2, uIBlockHeader.D, uIBlockActionOpenSection, uIBlockHeader.F, uIBlockActionOpenSearchTab, uIBlockHeader.H, uIBlockHeader.I, uIBlockActionOpenUrl, uIBlockHeader.K, uIBlockActionOpenUrl), null, uIBlockHeader.M, 32, null);
                        arrayList.add(uIBlock);
                        it2 = it;
                    }
                }
                it = it2;
                arrayList.add(uIBlock);
                it2 = it;
            }
            return arrayList;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sdd(Bundle bundle) {
        super(r0, r1);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        bundle.getString("hash_tag");
        this.D = new bpn0(new la0(6));
        this.E = new bpn0(new zq3(6));
        this.F = new bpn0(new na(this, 22));
        this.G = new bpn0(new ra0(this, 23));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        io.reactivex.rxjava3.core.q<hda> D = super.D(str, str2, z);
        return z ? new io.reactivex.rxjava3.internal.operators.mixed.o(D, new tp1(new yx0(this, 26), 5)) : D;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return new b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        return new g3a(this, u4aVar, new b(), new x2a.d(), (qdd) this.D.getValue(), null, null, null, null, null, 32736);
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
        return i != 1 ? i != 2 ? i != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new ClipsTrendsHeaderShowAllVh(this, aVar.b, b0(u4aVar), aVar.w, aVar.f, aVar.m, (oqc) this.E.getValue()) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 2 ? new LinkHorizontalListItemVh(aVar.f, LinkHorizontalListItemVh.Size.Medium, aVar.j, aVar.m, true, 2, true, false, 7840) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 ? new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.l, aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, false, SubtitlesConfigurationMode.ALWAYS_DISABLED, (t1n) this.G.getValue(), false, 384) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return rsg0.y0(new b6a(new wba(), o25.a().c(), ShortVideoType.TRENDS, 2), null, null, 3);
    }
}
