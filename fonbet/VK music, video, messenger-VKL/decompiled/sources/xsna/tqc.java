package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsHeaderShowAllRightBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.lists.c;
import com.vk.toggle.features.MusicFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u4a;
import xsna.vha;
import xsna.x2a;

/* compiled from: ClipDiscoverCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class tqc extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final bpn0 D;
    public final bpn0 E;
    public final bpn0 F;
    public final bpn0 G;
    public final xga H;
    public final e2a I;
    public final boolean J;

    /* compiled from: ClipDiscoverCatalogConfiguration.kt */
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

    /* compiled from: ClipDiscoverCatalogConfiguration.kt */
    public static final class b extends z160 {
        @Override // xsna.vha
        public final c2q0 o(RecyclerView recyclerView) {
            return new vha.a(this, recyclerView, null, new q5u0(0.8f, 0.8f), 4);
        }
    }

    /* compiled from: ClipDiscoverCatalogConfiguration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CatalogBlockItemsDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogBlockItemsDto catalogBlockItemsDto) {
            return ((e2a) this.receiver).a(catalogBlockItemsDto);
        }
    }

    /* compiled from: ClipDiscoverCatalogConfiguration.kt */
    public static final class d extends w060 {
        public d() {
            super(0);
        }

        @Override // xsna.w060, xsna.jda
        public final List<UIBlock> b(Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2) {
            ((oqc) tqc.this.E.getValue()).b(obj);
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
    public tqc(Bundle bundle) {
        super(r0 == null ? UserId.d : r0, bundle.getString("ref"));
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        this.D = new bpn0(new gc(5));
        this.E = new bpn0(new pr0(6));
        this.F = new bpn0(new ic(this, 20));
        this.G = new bpn0(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 23));
        this.H = new xga();
        this.I = new e2a();
        this.J = true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return catalogConfiguration$Companion$ContainerType == CatalogConfiguration$Companion$ContainerType.VERTICAL ? new b(new onh0(), u4aVar.b.I, 4) : new s4a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        r6a r6aVar = new r6a(new wba(), str, str2, z, null, null, null, null, 496);
        ahn.D(r6aVar);
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(r6aVar, null, null, 3);
        return z ? new io.reactivex.rxjava3.internal.operators.mixed.o(y0, new rj4(new h5(this, 25), 3)) : y0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return new d();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final boolean L() {
        return this.J;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        return new g3a(this, u4aVar, new d(), new x2a.d(), (pqc) this.D.getValue(), null, null, null, null, null, 32736);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final db80 V() {
        return new uah0(0.75f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 13);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new VerticalListVh(this, hVar, tbaVar, u4aVar, null, true, 0, null, 912);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final io.reactivex.rxjava3.core.q<hda> j(String str, String str2, String str3) {
        if (MusicFeatures.AUTOGEN_GET_BLOCK_ITEMS.h()) {
            dz2 x = yfb.x(wga.f(this.H, str == null ? "" : str, str2, null, null, null, null, str3, IronSourceError.ERROR_CODE_INIT_FAILED));
            ahn.D(x);
            return rsg0.y0(x, null, null, 3).U(new do3(new c(1, this.I, e2a.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogBlockItemsDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 7));
        }
        a6a a6aVar = new a6a(new wba(), str == null ? "" : str, str2, null, str3, null, 88);
        ahn.D(a6aVar);
        return rsg0.y0(a6aVar, null, null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        boolean f = epx.f(aVar.s.q(), UserId.d);
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new ClipsHeaderShowAllRightBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 2 ? new LinkHorizontalListItemVh(aVar.f, LinkHorizontalListItemVh.Size.Medium, aVar.j, aVar.m, true, 2, true, false, 7840) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 ? new VideoItemAutoPlayVh(new VideoItemListLargeVh(aVar.j, VideoItemListSettings.l, aVar.f, aVar.m, null, null, null, 2032), aVar.f, aVar.m, f, false, SubtitlesConfigurationMode.ALWAYS_DISABLED, (t1n) this.G.getValue(), false, 384) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        return io.reactivex.rxjava3.core.q.H(new IllegalStateException("Clips discover catalog must be loaded via ClipDiscoverCatalogCache"));
    }
}
