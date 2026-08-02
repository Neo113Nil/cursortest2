package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicOfflineVerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.catalog2.feature.music.holders.MusicDownloadsInProgressVh;
import com.vk.catalog2.feature.music.holders.MusicItemsShimmers;
import com.vk.catalog2.feature.music.holders.MusicOfflineDownloadsPlaceholder;
import com.vk.catalog2.feature.music.holders.MusicPlaylistCellVh;
import com.vk.catalog2.feature.music.holders.MusicTextShimmer;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.catalog2.feature.music.holders.OfflineHeaderRemoveAllVh;
import com.vk.catalog2.feature.music.holders.playlist.MusicPlaylistVkTileVh;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.catalog2.feature.music.ui.holder.MusicFullscreenPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineStatusPlaceholder;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineSyncPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineWrapperVh;
import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicShowAllListVh;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import xsna.eda;
import xsna.k840;
import xsna.u4a;
import xsna.x2a;

/* compiled from: MusicOfflineCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class xp40 extends com.vk.catalog2.common.ui.mvp.configuration.a implements MusicOfflineCatalogRootVh.a {
    public final boolean D;
    public final String E;
    public final bpn0 F;
    public final bpn0 G;
    public final bpn0 H;
    public final bpn0 I;
    public final Object J;
    public final x2a.c<hda> K;
    public final bpn0 L;
    public final bpn0 M;
    public final Object N;
    public final Object O;

    /* compiled from: MusicOfflineCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MAIN_TRACKS_SECTION_PLACEHOLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_PODCASTS_SECTION_PLACEHOLDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_AUDIO_BOOKS_SECTION_PLACEHOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_SMALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_STATUS_PLACEHOLDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.MUSIC_PLACEHOLDER_OFFLINE_SYNC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.TRIPLE_STACKED_SLIDER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_MUSIC_DOWNLOADS_LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.CATEGORIES_GRID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_MUSIC_OFFLINE_TRACKS_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_MUSIC_OFFLINE_PLAYLISTS_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogViewType.HEADER_COMPACT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogViewType.LARGE_SLIDER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_COMPACT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xp40(Bundle bundle) {
        super(r0, r1);
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("owner_id", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("owner_id");
            parcelable = (UserId) (parcelable3 instanceof UserId ? parcelable3 : null);
        }
        UserId userId = (UserId) parcelable;
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        boolean z = bundle.getBoolean("key_include_offline_mode");
        String string2 = bundle.getString("key_url");
        this.D = z;
        this.E = string2;
        this.F = new bpn0(new o6(20));
        this.G = new bpn0(new uw3(27));
        this.H = new bpn0(new l9(21));
        this.I = new bpn0(new k7y(this, 14));
        ubw ubwVar = new ubw(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.J = msy.a(lazyThreadSafetyMode, ubwVar);
        this.K = new x2a.c<>();
        this.L = new bpn0(new wp40(this, 0));
        this.M = new bpn0(new t2l(this, 25));
        this.N = msy.a(lazyThreadSafetyMode, new cty(this, 11));
        this.O = msy.a(lazyThreadSafetyMode, new c6(19));
    }

    public final t9a A0() {
        return (t9a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean B0() {
        return ((Boolean) this.J.getValue()).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r1.equals("synthetic_offline_music_album_all") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        return A0().g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r1.equals("synthetic_offline_playlists") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        return A0().l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r1.equals("synthetic_offline_albums") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r1.equals("synthetic_offline_music_playlist_all") != false) goto L34;
     */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        if (B0()) {
            zrp<OfflineCatalogCategories> l = OfflineCatalogCategories.l();
            if (l == null || !l.isEmpty()) {
                Iterator<E> it = l.iterator();
                while (it.hasNext()) {
                    if (epx.f(((OfflineCatalogCategories) it.next()).n(), str)) {
                        return ((t9a) this.M.getValue()).j(str);
                    }
                }
            }
            return A0().j(str);
        }
        switch (str.hashCode()) {
            case -1903268188:
                break;
            case -879501830:
                break;
            case 240347915:
                break;
            case 1238991073:
                break;
            default:
                return A0().k();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        if (!B0()) {
            return super.S(u4aVar, str);
        }
        if (epx.f(str, "key_offline_search")) {
            return new g3a(this, u4aVar, K(u4aVar), null, null, null, null, null, new b(), null, 30712);
        }
        return new g3a(this, u4aVar, K(u4aVar), this.K, new u550("offline_cache_key", Collections.singletonList(CatalogViewType.SEPARATOR), j5g.s0(CatalogViewType.i(), CatalogViewType.SYNTHETIC_MUSIC_DOWNLOADS_LIST), false), null, null, null, null, null, 32736);
    }

    @Override // com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh.a
    public final boolean a(String str) {
        return B0() ? ((t9a) this.M.getValue()).c(str) : A0().c(str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        c.h hVar = new c.h((c.m) tbaVar);
        hVar.n = u4aVar.b.h;
        return new MusicOfflineVerticalListVh(this, hVar, tbaVar, u4aVar, this.D ? MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_MY_MUSIC : MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY, !B0());
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final eda.a g() {
        return new y34(this, 28);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        boolean z;
        w950 w950Var = (w950) this.N.getValue();
        if (w950Var != null) {
            w950.p(w950Var, null, MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY, null, 5);
        }
        if (!B0()) {
            return super.h0(uIBlock, str, u4aVar);
        }
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        a.c cVar = new a.c(str);
        jda K = K(u4aVar);
        vd7 a0 = a0(u4aVar);
        boolean z2 = true;
        if (uIBlockList == null || uIBlockList.y.isEmpty()) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (uIBlockList != null) {
            z = false;
        }
        return new qd40(cVar, (fz8) K, u4aVar, a0, z2, uIBlockList, str, z, b0(u4aVar), this.K, new u550(str, Collections.singletonList(CatalogViewType.SEPARATOR), j5g.s0(CatalogViewType.i(), CatalogViewType.SYNTHETIC_MUSIC_DOWNLOADS_LIST), false), 117504);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        xp40 xp40Var;
        MusicPlaceholderVh musicPlaceholderVh;
        CatalogViewHolder catalogViewHolder;
        String str;
        CatalogSearchQueryViewHolder vkSearchQueryVh;
        String str2;
        CatalogViewHolder catalogViewHolder2;
        CatalogViewHolder catalogViewHolder3;
        xp40 xp40Var2 = this;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_download_outline_28);
        u4a.a aVar = u4aVar.b;
        switch (a.$EnumSwitchMapping$1[catalogDataType.ordinal()]) {
            case 1:
                xp40Var = xp40Var2;
                switch (a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                    case 1:
                        xp40Var2 = xp40Var;
                        if (!xp40Var2.B0()) {
                            catalogViewHolder = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                            break;
                        } else {
                            musicPlaceholderVh = new MusicPlaceholderVh(aVar.w, aVar.f, null, null, null, 44);
                            catalogViewHolder = musicPlaceholderVh;
                            break;
                        }
                    case 2:
                    case 3:
                        xp40Var2 = xp40Var;
                        if (!xp40Var2.B0()) {
                            catalogViewHolder = new MusicFullscreenPlaceholderVh(aVar.w, null, new PlaceholderVh.b(30), 14);
                            break;
                        } else {
                            musicPlaceholderVh = new MusicPlaceholderVh(aVar.w, aVar.f, valueOf, null, null, 56);
                            catalogViewHolder = musicPlaceholderVh;
                            break;
                        }
                    case 4:
                    case 5:
                        xp40Var2 = this;
                        musicPlaceholderVh = new MusicPlaceholderVh(aVar.w, aVar.f, valueOf, null, null, 56);
                        catalogViewHolder = musicPlaceholderVh;
                        break;
                    case 6:
                        if (xp40Var.B0()) {
                            catalogViewHolder2 = new MusicPlaceholderVh(aVar.w, aVar.f, Integer.valueOf(R.drawable.vk_icon_music_outline_24), new or(24), null, 48);
                            catalogViewHolder3 = catalogViewHolder2;
                            xp40Var2 = xp40Var;
                            catalogViewHolder = catalogViewHolder3;
                            break;
                        } else {
                            catalogViewHolder3 = new MusicOfflineDownloadsPlaceholder();
                            xp40Var2 = xp40Var;
                            catalogViewHolder = catalogViewHolder3;
                        }
                    case 7:
                        catalogViewHolder3 = new MusicOfflineDownloadsPlaceholder();
                        xp40Var2 = xp40Var;
                        catalogViewHolder = catalogViewHolder3;
                        break;
                    case 8:
                        catalogViewHolder3 = new MusicOfflineStatusPlaceholder(Preference.j());
                        xp40Var2 = xp40Var;
                        catalogViewHolder = catalogViewHolder3;
                        break;
                    case 9:
                        catalogViewHolder3 = new MusicOfflineSyncPlaceholderVh();
                        xp40Var2 = xp40Var;
                        catalogViewHolder = catalogViewHolder3;
                        break;
                    default:
                        catalogViewHolder3 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                        xp40Var2 = xp40Var;
                        catalogViewHolder = catalogViewHolder3;
                        break;
                }
            case 2:
                xp40Var = xp40Var2;
                if (xp40Var.B0()) {
                    String str3 = "";
                    if (uIBlock == null || (str = uIBlock.b) == null) {
                        str = "";
                    }
                    tba<hda> h0 = xp40Var.h0(null, str, u4aVar);
                    nda ndaVar = aVar.b;
                    q3a q3aVar = aVar.e;
                    kea keaVar = (kea) h0;
                    i7p0 i7p0Var = new i7p0(null, null, null, new f6(5, xp40Var, keaVar), 7);
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                    VkTopBarVh vkTopBarVh = new VkTopBarVh(ndaVar, q3aVar, i7p0Var, new w7p0(false, null, com.vk.core.compose.component.semantics.b.a(mode, new h2w(8), 2), com.vk.core.compose.component.semantics.b.a(mode, new oi40(1), 2), null, null, null, null, null, 32551), null, null, null, null, 4080);
                    t9a A0 = xp40Var.A0();
                    if (uIBlock != null && (str2 = uIBlock.b) != null) {
                        str3 = str2;
                    }
                    A0.f(str3);
                    if (((Boolean) xp40Var.O.getValue()).booleanValue()) {
                        String str4 = uIBlock != null ? uIBlock.b : null;
                        OfflineCatalogCategories.Companion.getClass();
                        OfflineCatalogCategories a2 = OfflineCatalogCategories.c.a(str4);
                        vkSearchQueryVh = new VkSearchViewVh(a2 != null ? a2.m() : OfflineCatalogCategories.All.m(), new txh0(null, null, null, null, null, null, 127), new grp0(true, true), new dml(new hz7(3, xp40Var, keaVar), null, null, null, null, 0L, 62));
                    } else {
                        String str5 = uIBlock != null ? uIBlock.b : null;
                        OfflineCatalogCategories.Companion.getClass();
                        OfflineCatalogCategories a3 = OfflineCatalogCategories.c.a(str5);
                        vkSearchQueryVh = new VkSearchQueryVh(new SearchQueryVh(a3 != null ? a3.m() : OfflineCatalogCategories.All.m(), null, new af0(29), null, new dml(new l6(5, xp40Var, keaVar), null, null, null, null, 0L, 62), 96), null, null, null, new c24(0), 766);
                    }
                    uba ubaVar = new uba(h0);
                    MusicShowAllListVh musicShowAllListVh = new MusicShowAllListVh(uIBlock != null ? uIBlock.c : null, u4aVar, vkTopBarVh, com.vk.catalog2.common.ui.mvp.configuration.a.g0(xp40Var, uIBlock, u4aVar, ubaVar, 8), (w950) xp40Var.N.getValue(), vkSearchQueryVh, xp40Var.B0(), 32);
                    ubaVar.h = musicShowAllListVh;
                    catalogViewHolder3 = musicShowAllListVh;
                } else {
                    catalogViewHolder3 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                xp40Var2 = xp40Var;
                catalogViewHolder = catalogViewHolder3;
                break;
            case 3:
                xp40Var = xp40Var2;
                if (!xp40Var.B0()) {
                    catalogViewHolder3 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                } else if (a.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 17) {
                    u2b0 u2b0Var = aVar.i;
                    t5a<MusicTrack> t5aVar = u4aVar.c.d;
                    b5a b5aVar = aVar.f;
                    SearchStatInfoProvider searchStatInfoProvider = aVar.m;
                    q3a q3aVar2 = aVar.e;
                    Object obj = aVar.b;
                    catalogViewHolder2 = new MusicTrackCellVh(u2b0Var, 0, t5aVar, b5aVar, searchStatInfoProvider, q3aVar2, obj instanceof sq40 ? (sq40) obj : null, false, 30434);
                    catalogViewHolder3 = catalogViewHolder2;
                } else {
                    catalogViewHolder3 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                xp40Var2 = xp40Var;
                catalogViewHolder = catalogViewHolder3;
                break;
            case 4:
                xp40Var = xp40Var2;
                if (xp40Var.B0()) {
                    int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                    if (i == 17) {
                        b5a b5aVar2 = aVar.f;
                        SearchStatInfoProvider searchStatInfoProvider2 = aVar.m;
                        Object obj2 = aVar.b;
                        catalogViewHolder3 = new MusicPlaylistCellVh(b5aVar2, searchStatInfoProvider2, obj2 instanceof sq40 ? (sq40) obj2 : null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    } else if (i != 18) {
                        catalogViewHolder3 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    } else {
                        u2b0 u2b0Var2 = aVar.i;
                        b5a b5aVar3 = aVar.f;
                        SearchStatInfoProvider searchStatInfoProvider3 = aVar.m;
                        Object obj3 = aVar.b;
                        catalogViewHolder3 = new MusicPlaylistVkTileVh(u2b0Var2, b5aVar3, searchStatInfoProvider3, obj3 instanceof sq40 ? (sq40) obj3 : null, xp40Var.B0(), 60);
                    }
                } else {
                    catalogViewHolder3 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                xp40Var2 = xp40Var;
                catalogViewHolder = catalogViewHolder3;
                break;
            case 5:
                int i2 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i2 == 10) {
                    catalogViewHolder = new GridListVh(xp40Var2, 3, u4aVar, xp40Var2.B0() ? R.layout.catalog_slider_item_view_without_horizontal_padding : R.layout.catalog_slider_item_view, null, (GridListVh.a) xp40Var2.C.getValue(), 104);
                    break;
                } else if (i2 == 11) {
                    lq40 d = k840.a.d();
                    r5v0 r5v0Var = k840.a.h;
                    catalogViewHolder = new MusicDownloadsInProgressVh(aVar.e, r5v0Var != null ? r5v0Var : null, d);
                    break;
                } else {
                    catalogViewHolder = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                }
            case 6:
                int i3 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i3 != 3 && i3 != 6) {
                    if (i3 == 10) {
                        catalogViewHolder = new MusicItemsShimmers(new MusicItemsShimmers.a.C0520a(), MusicItemsShimmers.ContentType.TRACKS, false);
                        break;
                    } else {
                        switch (i3) {
                            case 12:
                                int i4 = ((Boolean) xp40Var2.F.getValue()).booleanValue() ? 4 : 3;
                                if (((Boolean) xp40Var2.G.getValue()).booleanValue()) {
                                    i4++;
                                }
                                bpn0 bpn0Var = xp40Var2.I;
                                if (((Boolean) bpn0Var.getValue()).booleanValue()) {
                                    i4 += 2;
                                }
                                catalogViewHolder = new MusicItemsShimmers(new MusicItemsShimmers.a.C0520a((int) Math.ceil(i4 / 2), i4, ((Boolean) bpn0Var.getValue()).booleanValue() ? Collections.singleton(0) : EmptySet.b), MusicItemsShimmers.ContentType.CATEGORY, false);
                                break;
                            case 13:
                                catalogViewHolder = new MusicItemsShimmers(new MusicItemsShimmers.a.b(), MusicItemsShimmers.ContentType.TRACKS, false);
                                break;
                            case 14:
                                catalogViewHolder = new MusicItemsShimmers(new MusicItemsShimmers.a.b(), MusicItemsShimmers.ContentType.PLAYLISTS, false);
                                break;
                            case 15:
                                catalogViewHolder = new MusicTextShimmer(R.style.VkUiTypography_Title2);
                                break;
                            case 16:
                                catalogViewHolder = new MusicTextShimmer(R.style.VkUiTypography_Footnote);
                                break;
                            default:
                                catalogViewHolder = new EmptyVh(false);
                                break;
                        }
                    }
                } else {
                    catalogViewHolder = new MusicItemsShimmers(new MusicItemsShimmers.a.C0520a(), MusicItemsShimmers.ContentType.TRACKS, true);
                    break;
                }
                break;
            case 7:
                int i5 = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                if (i5 == 16) {
                    catalogViewHolder = new ComposeHeaderIconShowAllBadgeVh(xp40Var2, aVar.b, xp40Var2.b0(u4aVar), aVar.f, aVar.w, aVar.m, null, 448);
                    break;
                } else if (i5 == 19) {
                    lq40 d2 = k840.a.d();
                    q3a q3aVar3 = aVar.e;
                    r5v0 r5v0Var2 = k840.a.h;
                    catalogViewHolder = new OfflineHeaderRemoveAllVh(q3aVar3, r5v0Var2 != null ? r5v0Var2 : null, d2);
                    break;
                } else if (i5 == 20) {
                    catalogViewHolder = new SeparatorVh(R.layout.catalog_separator_offline_compact_transparent, null, R.attr.vk_ui_transparent, 2);
                    break;
                } else {
                    catalogViewHolder = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
                }
            default:
                catalogViewHolder = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                break;
        }
        return (((g950) xp40Var2.H.getValue()).c() || !(catalogDataType == CatalogDataType.DATA_TYPE_MUSIC_TRACKS || catalogDataType == CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS)) ? catalogViewHolder : new MusicOfflineWrapperVh(catalogViewHolder);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        k840.a.d().g();
        return A0().m();
    }

    public final t9a z0() {
        r9a r9aVar = new r9a(new bpn0(new z34(23)), new ida[0]);
        boolean B0 = B0();
        bpn0 bpn0Var = this.H;
        return B0 ? new laa(k840.a.d(), (df5) k840.a.q.getValue(), (g950) bpn0Var.getValue(), this.E, k840.a.d(), r9aVar) : new z9a(k840.a.d(), (g950) bpn0Var.getValue(), this.D, this.E, r9aVar);
    }

    /* compiled from: MusicOfflineCatalogConfiguration.kt */
    public static final class b implements gda {
        public b() {
        }

        @Override // xsna.gda
        public final io.reactivex.rxjava3.core.q b() {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }

        @Override // xsna.gda
        public final io.reactivex.rxjava3.core.q d(String str, String str2, String str3, boolean z, Integer num) {
            return ((t9a) xp40.this.M.getValue()).e();
        }

        @Override // xsna.gda
        public final void c(Bundle bundle) {
        }
    }
}
