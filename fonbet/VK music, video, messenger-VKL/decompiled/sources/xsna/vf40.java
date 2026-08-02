package xsna;

import android.os.Bundle;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.MusicArtistPageVideoSliderItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.feature.music.holders.ComposeMusicCuratorVh;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVhOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.toggle.Features;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u4a;

/* compiled from: MusicCuratorCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class vf40 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final String E;
    public final String F;
    public final xga G;
    public final e3a H;
    public final bpn0 I;
    public final Object J;

    /* compiled from: MusicCuratorCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.DOUBLE_STACKED_SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_ARTIST_VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CURATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: MusicCuratorCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf40(Bundle bundle) {
        super(UserId.d, null);
        String str;
        String string = bundle.getString("curator_id", "");
        SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
        String a2 = (searchStatsLoggingInfo == null || (str = searchStatsLoggingInfo.f) == null) ? null : cqm0.a(str);
        String string2 = bundle.getString("key_url");
        this.D = string;
        this.E = a2;
        this.F = string2;
        this.G = new xga();
        this.H = new e3a();
        this.I = new bpn0(new cfl(this, 23));
        this.J = msy.a(LazyThreadSafetyMode.NONE, new ufk(this, 16));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("curator_id", this.D);
        r.putString("key_url", this.E);
        return r;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        if (i != 1) {
            return i != 2 ? i != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? new ComposeMusicCuratorVh(aVar.f, (o0r0) this.J.getValue()) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 3 ? aVar.c ? new CuratorInfoVhOld(aVar.i, aVar.v, aVar.r) : new EmptyVh(false) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        return (i2 == 1 || i2 == 2) ? new VideoItemNoAutoPlayVh(new MusicArtistPageVideoSliderItemVh(u4aVar, (hdt0) this.I.getValue()), aVar.f, aVar.m, false, null, false, 248) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        Features.Type type = Features.Type.FEATURE_AUDIO_AUTOGEN_CATALOG;
        type.getClass();
        boolean a2 = com.vk.toggle.b.A.a(type);
        String str2 = this.F;
        String str3 = this.E;
        String str4 = this.D;
        if (!a2) {
            return rsg0.y0(new y5a(new wba(), str4, str3, str2), null, null, 3);
        }
        this.G.getClass();
        tfx tfxVar = new tfx("catalog.getAudioCurator", new up(5), new vp(7));
        if (str4 != null) {
            tfx.o(tfxVar, "curator_id", str4, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "url", str3, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "from_trackcode", str2, 0, 0, 12);
        }
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new mau(new b(1, this.H, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 6));
    }
}
