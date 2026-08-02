package xsna;

import android.os.Bundle;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.FiltersViewStyle;
import com.vk.catalog2.common.dto.api.style.SavePlaylistViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;
import com.vk.catalog2.common.ui.holders.EmptyVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.feature.music.holders.MusicPlaylistCellVh;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.ui.holder.MusicActionShuffleVh;
import com.vk.catalog2.feature.music.ui.holder.MusicActionSortingVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineSyncPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineWrapperVh;
import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicVerticalListVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.internal.api.GsonHolder;
import com.vk.lists.c;
import com.vk.toggle.b;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.eda;
import xsna.k840;
import xsna.u4a;

/* compiled from: MusicMyAudiosCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class uo40 extends com.vk.catalog2.common.ui.mvp.configuration.a implements zda, eba {
    public final String D;
    public final String E;
    public final MusicCollectionType F;
    public final xga G;
    public final e3a H;
    public final afa I;
    public final ada J;
    public final bpn0 K;
    public final bpn0 L;
    public final bpn0 M;
    public final Object N;
    public final Object O;
    public final bpn0 P;
    public final bpn0 Q;
    public MusicMyAudiosCatalogRootVh R;

    /* compiled from: MusicMyAudiosCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MusicCollectionType.values().length];
            try {
                iArr[MusicCollectionType.AUDIOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicCollectionType.PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicCollectionType.ALBUMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_SELECT_SORTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_BIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CatalogViewType.MUSIC_PLACEHOLDER_OFFLINE_SYNC.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CatalogViewType.SUBSECTION_TABS.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogDataType.values().length];
            try {
                iArr3[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_MUSIC_PLAYLISTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: MusicMyAudiosCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            MusicCollectionType musicCollectionType;
            ((uo40) this.receiver).H.getClass();
            hda b = e3a.b(catalogCatalogResponseObjectDto);
            String str = b.c;
            CatalogExtendedData catalogExtendedData = b.b;
            Object obj = b.a;
            if (!(obj instanceof CatalogCatalog)) {
                return new hda(b, catalogExtendedData, str);
            }
            ArrayList arrayList = new ArrayList();
            CatalogCatalog catalogCatalog = (CatalogCatalog) obj;
            Iterator<CatalogSection> it = catalogCatalog.b.iterator();
            while (true) {
                Object obj2 = null;
                if (!it.hasNext()) {
                    return new hda(CatalogCatalog.zb(catalogCatalog, arrayList, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), catalogExtendedData, str);
                }
                CatalogSection next = it.next();
                String str2 = next.f;
                if (str2 == null) {
                    str2 = "";
                }
                MusicCollectionType.Companion.getClass();
                if (drm0.D(str2, "kids_section", false)) {
                    Iterator<E> it2 = MusicCollectionType.j().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        MusicCollectionType musicCollectionType2 = (MusicCollectionType) next2;
                        String str3 = (String) j5g.a0(drm0.c0(str2, new String[]{"?"}, 0, 6));
                        if (str3 != null) {
                            if (brm0.v(str3, musicCollectionType2.m() + "_offline", false)) {
                                obj2 = next2;
                                break;
                            }
                        }
                    }
                    musicCollectionType = (MusicCollectionType) obj2;
                } else {
                    Iterator<E> it3 = MusicCollectionType.j().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (brm0.v(str2, ((MusicCollectionType) next3).m() + "_offline", false)) {
                            obj2 = next3;
                            break;
                        }
                    }
                    musicCollectionType = (MusicCollectionType) obj2;
                }
                if (musicCollectionType != null) {
                    arrayList.add(CatalogSection.zb(next, musicCollectionType.l(), null, null, null, 16382));
                } else {
                    arrayList.add(next);
                }
            }
        }
    }

    /* compiled from: MusicMyAudiosCatalogConfiguration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CatalogSectionResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
            return ((afa) this.receiver).a(catalogSectionResponseObjectDto);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uo40(Bundle bundle) {
        super(UserId.d, r0);
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        MusicCollectionType.a aVar = MusicCollectionType.Companion;
        String string3 = bundle.getString("type");
        aVar.getClass();
        MusicCollectionType a2 = MusicCollectionType.a.a(string3);
        this.D = string;
        this.E = string2;
        this.F = a2;
        this.G = new xga();
        this.H = new e3a();
        this.I = new afa();
        this.J = new ada();
        this.K = new bpn0(new com.vk.movika.sdk.base.ui.v(26));
        this.L = new bpn0(new cfl(this, 24));
        this.M = new bpn0(new ufk(this, 18));
        hp30 hp30Var = new hp30(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, hp30Var);
        this.O = msy.a(lazyThreadSafetyMode, new jw30(this, 2));
        this.P = new bpn0(new so40(this, 0));
        this.Q = new bpn0(new k7z(this, 7));
    }

    public final String A0() {
        return (String) this.P.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        if (str.equals(MusicCollectionType.AUDIOS.l())) {
            k840.a.d().g();
            laa z0 = z0();
            z0.getClass();
            U = z0.v(z0.h).w().a0(asu0.a.c()).U(new vj0(new j5(z0, 10), 6));
        } else if (str.equals(MusicCollectionType.PLAYLISTS.l())) {
            k840.a.d().g();
            laa z02 = z0();
            z02.getClass();
            U = z02.t(z02.h).w().a0(asu0.a.c()).U(new d9(new com.vk.movika.sdk.base.observable.q(z02, 13), 5));
        } else if (str.equals(MusicCollectionType.ALBUMS.l())) {
            k840.a.d().g();
            laa z03 = z0();
            z03.getClass();
            U = z03.n(z03.h).w().a0(asu0.a.c()).U(new rt0(new yx0(z03, 16), 8));
        } else {
            U = rsg0.y0(yfb.x(wga.d(this.G, str, null, str2, Boolean.valueOf(z), null, A0(), 30586)), null, null, 3).U(new tuz(new c(1, this.I, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 4));
        }
        return z0().a.b(U);
    }

    @Override // xsna.eba
    public final boolean a(String str) {
        return z0().c(str);
    }

    @Override // xsna.eba
    public final jba c() {
        return (jba) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        return (!k840.a.i.b() || ((Boolean) this.K.getValue()).booleanValue()) ? new MusicVerticalListVh(u4aVar.b.w, (p2k0) this.O.getValue(), this, new c.h((c.m) tbaVar), tbaVar, u4aVar) : super.f0(uIBlock, u4aVar, tbaVar, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final eda.a g() {
        return new sgw(1, this, new mh40(this, 1));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final String getRef() {
        return this.D;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        String str2;
        a.c cVar = new a.c(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null && (str2 = uIBlockList.b) != null) {
            w950.p((w950) this.N.getValue(), str2, null, null, 6);
        }
        return new kea(cVar, K(u4aVar), u4aVar, a0(u4aVar), uIBlockList == null || uIBlockList.y.size() == 0, uIBlockList, str, uIBlockList == null || str.equals(this.F.l()), null, b0(u4aVar), this, null, null, false, null, 125696);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final io.reactivex.rxjava3.core.q<hda> j(String str, String str2, String str3) {
        return z0().a.b(super.j(str, str2, str3));
    }

    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
        MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = this.R;
        if (musicMyAudiosCatalogRootVh != null) {
            musicMyAudiosCatalogRootVh.k(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final Bundle r() {
        Bundle r = super.r();
        r.putString("key_url", this.E);
        r.putString("type", this.F.m());
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        CatalogViewHolder musicPlaceholderVh;
        CatalogViewHolder musicPlaceholderVh2;
        boolean z;
        CatalogMviVh catalogMviVh;
        u4a.a aVar = u4aVar.b;
        if (uIBlock instanceof UIBlockButtons) {
            UIBlockButtons uIBlockButtons = (UIBlockButtons) uIBlock;
            if (uIBlockButtons.d == CatalogViewType.BUTTONS_HORIZONTAL && uIBlockButtons.y.size() != 1) {
                if (a.$EnumSwitchMapping$2[catalogDataType.ordinal()] != 4) {
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
                int i = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                return i != 2 ? i != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new MusicActionShuffleVh(aVar.i) : new MusicActionSortingVh(b0(u4aVar), aVar.f);
            }
        }
        int i2 = a.$EnumSwitchMapping$2[catalogDataType.ordinal()];
        if (i2 == 1) {
            switch (a.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
                case 4:
                case 5:
                case 6:
                    musicPlaceholderVh = new MusicPlaceholderVh(aVar.w, aVar.f, null, null, aVar.b, 92);
                    musicPlaceholderVh2 = musicPlaceholderVh;
                    break;
                case 7:
                case 8:
                    musicPlaceholderVh2 = new MusicPlaceholderVh(aVar.w, aVar.f, Integer.valueOf(R.drawable.vk_icon_music_outline_24), new sr(19), null, 112);
                    break;
                case 9:
                    musicPlaceholderVh2 = new MusicOfflineSyncPlaceholderVh();
                    break;
                default:
                    musicPlaceholderVh2 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    break;
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        musicPlaceholderVh2 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                    } else {
                        int i3 = a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                        bpn0 bpn0Var = this.L;
                        bpn0 bpn0Var2 = this.K;
                        if (i3 == 10) {
                            FiltersViewStyle filtersViewStyle = catalogViewStyle instanceof FiltersViewStyle ? (FiltersViewStyle) catalogViewStyle : null;
                            z = (filtersViewStyle != null ? filtersViewStyle.b : null) == FiltersViewStyle.Style.TABS;
                            if (((Boolean) bpn0Var2.getValue()).booleanValue() && z) {
                                catalogMviVh = new CatalogMviVh(aVar.f, aVar.e, aVar.m, CatalogBlockVariant.MusicHorizontalTabsFilters, (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue());
                                musicPlaceholderVh2 = catalogMviVh;
                            } else {
                                musicPlaceholderVh2 = new EmptyVh(false);
                            }
                        } else if (i3 != 11) {
                            musicPlaceholderVh2 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                        } else {
                            SavePlaylistViewStyle savePlaylistViewStyle = catalogViewStyle instanceof SavePlaylistViewStyle ? (SavePlaylistViewStyle) catalogViewStyle : null;
                            z = (savePlaylistViewStyle != null ? savePlaylistViewStyle.b : null) == SavePlaylistViewStyle.Style.MyMusic;
                            if (((Boolean) bpn0Var2.getValue()).booleanValue() && z) {
                                catalogMviVh = new CatalogMviVh(aVar.f, aVar.e, aVar.m, CatalogBlockVariant.MusicSavePlaylistByFilterButton, (com.vk.catalog.mvi.legacy.api.a) bpn0Var.getValue());
                                musicPlaceholderVh2 = catalogMviVh;
                            } else {
                                musicPlaceholderVh2 = new EmptyVh(false);
                            }
                        }
                    }
                } else if (a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 1) {
                    b5a b5aVar = aVar.f;
                    SearchStatInfoProvider searchStatInfoProvider = aVar.m;
                    nda ndaVar = aVar.b;
                    musicPlaceholderVh = new MusicPlaylistCellVh(b5aVar, searchStatInfoProvider, ndaVar instanceof sq40 ? (sq40) ndaVar : null, 116);
                    musicPlaceholderVh2 = musicPlaceholderVh;
                } else {
                    musicPlaceholderVh2 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                }
            } else if (a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 1) {
                u2b0 u2b0Var = aVar.i;
                t5a<MusicTrack> t5aVar = u4aVar.c.d;
                b5a b5aVar2 = aVar.f;
                SearchStatInfoProvider searchStatInfoProvider2 = aVar.m;
                q3a q3aVar = aVar.e;
                nda ndaVar2 = aVar.b;
                musicPlaceholderVh2 = new MusicTrackCellVh(u2b0Var, R.layout.catalog_music_cell_audio_item, t5aVar, b5aVar2, searchStatInfoProvider2, q3aVar, ndaVar2 instanceof sq40 ? (sq40) ndaVar2 : null, false, 26336);
            } else {
                musicPlaceholderVh2 = super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            }
        }
        return (k840.a.i.c() || catalogDataType != CatalogDataType.DATA_TYPE_MUSIC_TRACKS) ? musicPlaceholderVh2 : new MusicOfflineWrapperVh(musicPlaceholderVh2);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        tfx tfxVar;
        int[] iArr = a.$EnumSwitchMapping$0;
        MusicCollectionType musicCollectionType = this.F;
        int i = iArr[musicCollectionType.ordinal()];
        ArrayList arrayList = null;
        xga xgaVar = this.G;
        if (i == 1) {
            CatalogFeatures.Companion.getClass();
            List a2 = CatalogFeatures.a.a();
            if (a2 != null) {
                List list = a2;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it.next()));
                }
            }
            String A0 = A0();
            xgaVar.getClass();
            tfxVar = new tfx("catalog.getAudioMyAudios", new io.reactivex.rxjava3.processors.b(8), new io.reactivex.rxjava3.subjects.b(9));
            tfxVar.j("need_blocks", true);
            if (arrayList != null) {
                tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(arrayList), 0, 0, 12);
            }
            if (A0 != null) {
                tfx.o(tfxVar, "ref", A0, 0, 0, 12);
            }
        } else if (i == 2) {
            CatalogFeatures.Companion.getClass();
            List a3 = CatalogFeatures.a.a();
            if (a3 != null) {
                List list2 = a3;
                arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it2.next()));
                }
            }
            String A02 = A0();
            xgaVar.getClass();
            tfxVar = new tfx("catalog.getAudioMyPlaylists", new to(8), new t11(7));
            tfxVar.j("need_blocks", true);
            if (arrayList != null) {
                tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(arrayList), 0, 0, 12);
            }
            if (A02 != null) {
                tfx.o(tfxVar, "ref", A02, 0, 0, 12);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            CatalogFeatures.Companion.getClass();
            List a4 = CatalogFeatures.a.a();
            if (a4 != null) {
                List list3 = a4;
                arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(com.vk.catalog2.common.ui.mvp.configuration.a.y0((b.d) it3.next()));
                }
            }
            String A03 = A0();
            xgaVar.getClass();
            tfxVar = new tfx("catalog.getAudioMyAlbums", new ur(6), new vr(7));
            tfxVar.j("need_blocks", true);
            if (arrayList != null) {
                tfx.o(tfxVar, "applied_toggles", GsonHolder.a().toJson(arrayList), 0, 0, 12);
            }
            if (A03 != null) {
                tfx.o(tfxVar, "ref", A03, 0, 0, 12);
            }
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.T(yfb.x(tfxVar)).U(new com.vk.movika.sdk.base.hooks.f(new b(1, this, uo40.class, "mapCatalog", "mapCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 25));
        return musicCollectionType == MusicCollectionType.AUDIOS ? new io.reactivex.rxjava3.internal.operators.observable.a0(z0().a.b(U), new to40()) : z0().a.b(U);
    }

    public final laa z0() {
        return (laa) this.M.getValue();
    }

    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
    }
}
