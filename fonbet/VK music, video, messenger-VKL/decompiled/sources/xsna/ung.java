package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.ComposeHeaderClearBlocksVh;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalLoopVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalNonScrollableListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalScrollableListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesPlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesVkUiPlaceholderVh;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitySeparatorVh;
import com.vk.catalog2.common.ui.mvp.holder.group.FilterButtonVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupHorizontalListItemVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupSmallHorizontalListItemVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u4a;

/* compiled from: CommunitiesCatalogConfiguration.kt */
/* loaded from: classes5.dex */
public final class ung extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final String E;
    public final a F;
    public fz8 G;
    public final sng H;
    public final xga I;
    public final bpn0 J;
    public final Object K;

    /* compiled from: CommunitiesCatalogConfiguration.kt */
    public static final class a {
        public final pff a;

        public a(pff pffVar) {
            this.a = pffVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Deps(viewStyleResolverProvider=" + this.a + ')';
        }
    }

    /* compiled from: CommunitiesCatalogConfiguration.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER_CARD_INFINITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SEPARATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.HEADER_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_HEADER_CLEAR_RECENTS_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.GRID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_ILLEGAL_QUERY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.PLACEHOLDER_IMAGE_WARNING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.BUTTONS_HORIZONTAL_WITH_SCROLL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.FILTER_BUTTON.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CatalogDataType.DATA_SYNTHETIC_SHOW_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[CatalogConfiguration$Companion$ContainerType.GRID.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: CommunitiesCatalogConfiguration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* compiled from: CommunitiesCatalogConfiguration.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* compiled from: CommunitiesCatalogConfiguration.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<CatalogSectionResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
            return ((afa) this.receiver).a(catalogSectionResponseObjectDto);
        }
    }

    /* compiled from: CommunitiesCatalogConfiguration.kt */
    public static final class f implements PaginatedGridListVh.c {
        public final /* synthetic */ int a;

        public f(int i) {
            this.a = i;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.c
        public final int a(int i, boolean z) {
            return this.a;
        }
    }

    /* compiled from: CommunitiesCatalogConfiguration.kt */
    public static final class g implements PaginatedGridListVh.d {
        public final /* synthetic */ boolean a;

        public g(boolean z) {
            this.a = z;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh.d
        public final int a(UIBlock uIBlock, int i, boolean z) {
            CatalogViewType catalogViewType = uIBlock.d;
            CatalogDataType catalogDataType = uIBlock.e;
            CatalogDataType catalogDataType2 = CatalogDataType.DATA_TYPE_GROUPS_ITEMS;
            boolean z2 = false;
            boolean z3 = (catalogDataType == catalogDataType2 || catalogDataType == CatalogDataType.DATA_TYPE_GROUPS_COLLECTION) && catalogViewType == CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD;
            if (catalogDataType == catalogDataType2 && catalogViewType == CatalogViewType.GRID) {
                z2 = true;
            }
            if (z3) {
                return this.a ? i / 3 : i / 2;
            }
            if (z2) {
                return 1;
            }
            return i;
        }
    }

    static {
        o1e0.a.a.subscribe(new sv(new sm(14), 21));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v2, types: [xsna.sng] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ung(Bundle bundle, a aVar) {
        super(r0, r1);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("key_url");
        String string3 = bundle.getString("collection_id");
        this.D = string2;
        this.E = string3;
        this.F = aVar;
        this.H = new dha() { // from class: xsna.sng
            @Override // xsna.dha
            public final MobileOfficialAppsCoreNavStat$EventScreen a() {
                return ung.this.E != null ? MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_COLLECTION_LIST : MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_LIST;
            }
        };
        this.I = new xga();
        this.J = new bpn0(new dne(this, 4));
        this.K = msy.a(LazyThreadSafetyMode.NONE, new pr1(10));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final vha A(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return new p4i(catalogConfiguration$Companion$ContainerType == CatalogConfiguration$Companion$ContainerType.VERTICAL, this.H);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        afa afaVar = new afa();
        return rsg0.y0(yfb.x(wga.d(this.I, str, null, str2, Boolean.valueOf(z), null, null, 32634)), null, null, 3).U(new sj4(new e(1, afaVar, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 6));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        int i = b.$EnumSwitchMapping$2[catalogConfiguration$Companion$ContainerType.ordinal()];
        if (i == 1) {
            return new itg();
        }
        if (i == 2) {
            return new pca();
        }
        if (i == 3) {
            return new htg();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        fz8 fz8Var = this.G;
        if (fz8Var != null) {
            return fz8Var;
        }
        fz8 fz8Var2 = new fz8(new tng(0), u4aVar.c.d);
        this.G = fz8Var2;
        return fz8Var2;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final CatalogPaginatedListViewHolder f0(UIBlock uIBlock, u4a u4aVar, tba<hda> tbaVar, boolean z) {
        ArrayList<UIBlock> arrayList;
        CatalogViewType catalogViewType;
        CatalogViewType catalogViewType2 = uIBlock != null ? uIBlock.d : null;
        boolean z2 = false;
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            if (uIBlockList.e == CatalogDataType.DATA_SYNTHETIC_SECTION && ((arrayList = uIBlockList.y) == null || !arrayList.isEmpty())) {
                for (UIBlock uIBlock2 : arrayList) {
                    if (uIBlock2.e == CatalogDataType.DATA_TYPE_GROUPS_ITEMS && ((catalogViewType = uIBlock2.d) == CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD || catalogViewType == CatalogViewType.DOUBLE_STACKED_LIST || catalogViewType == CatalogViewType.GRID)) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        if (catalogViewType2 != CatalogViewType.DOUBLE_STACKED_LIST && catalogViewType2 != CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD && !z2) {
            return super.f0(uIBlock, u4aVar, tbaVar, true);
        }
        c.h hVar = new c.h((c.m) tbaVar);
        u4a.a aVar = u4aVar.b;
        hVar.n = aVar.h;
        boolean z3 = aVar.c;
        return new PaginatedGridListVh(this, hVar, tbaVar, u4aVar, new f(z3 ? 8 : 4), new g(z3), null, true, R.layout.catalog_list_vertical_communities_vkui, null, null, 3648);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final tba<hda> h0(UIBlock uIBlock, String str, u4a u4aVar) {
        boolean z;
        boolean z2;
        a.c cVar = new a.c(str);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null || uIBlockList.y.size() == 0) {
            z = true;
            z2 = true;
        } else {
            z = true;
            z2 = false;
        }
        boolean z3 = false;
        jda K = K(u4aVar);
        boolean z4 = z;
        vd7 a0 = a0(u4aVar);
        if (uIBlockList == null) {
            z3 = z4;
        }
        return new kea(cVar, K, u4aVar, a0, z2, uIBlockList, str, z3, null, b0(u4aVar), null, null, null, false, null, 129792);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final qca s() {
        return (qca) this.J.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        String str;
        u4a.a aVar = u4aVar.b;
        int i = b.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        boolean z = true;
        if (i == 1) {
            return b.$EnumSwitchMapping$0[catalogViewType.ordinal()] == 1 ? new HorizontalLoopVh(this, u4aVar, 44) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        if (i == 2) {
            int i2 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
            return i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new ComposeHeaderClearBlocksVh(aVar.e, aVar.f) : new ComposeHeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, null, 448) : new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, false) : new CommunitySeparatorVh();
        }
        if (i != 3) {
            if (i == 4) {
                int i3 = b.$EnumSwitchMapping$0[catalogViewType.ordinal()];
                sng sngVar = this.H;
                return i3 != 6 ? i3 != 7 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new GroupHorizontalListItemVh(GroupHorizontalListItemVh.Size.MatchParent, aVar.d, sngVar, aVar.f, aVar.e, aVar.m) : new GroupSmallHorizontalListItemVh(aVar.d, sngVar, aVar.f, aVar.e, aVar.m);
            }
            if (i != 5) {
                return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            }
            switch (b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                case 8:
                    return new CommunitiesVkUiPlaceholderVh();
                case 9:
                case 10:
                    return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
                case 11:
                    return new HorizontalNonScrollableListVh(this, u4aVar, 0, null, 0, 28);
                case 12:
                    return new HorizontalScrollableListVh(this, u4aVar, 0, Integer.valueOf(iah0.a(6)), 20);
                case 13:
                    return new FilterButtonVh(b0(u4aVar));
                default:
                    return new CommunitiesPlaceholderVh(aVar.w, false, false, null, null, 0, null, 0, 254);
            }
        }
        VkTopBarVh vkTopBarVh = new VkTopBarVh(aVar.b, aVar.e, null, null, null, b0(u4aVar), null, null, 3708);
        if (uIBlock == null || (str = uIBlock.b) == null) {
            str = "";
        }
        uba ubaVar = new uba(h0(null, str, u4aVar));
        CatalogPaginatedListViewHolder g0 = com.vk.catalog2.common.ui.mvp.configuration.a.g0(this, uIBlock, u4aVar, ubaVar, 8);
        if (catalogViewType != CatalogViewType.DOUBLE_STACKED_LIST && catalogViewType != CatalogViewType.STACKED_LIST && catalogViewType != CatalogViewType.TRIPLE_STACKED_SLIDER && catalogViewType != CatalogViewType.LIST && catalogViewType != CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD) {
            z = false;
        }
        ShowAllListVh showAllListVh = new ShowAllListVh(u4aVar, vkTopBarVh, g0, z, false, false, null, 472);
        ubaVar.h = showAllListVh;
        return showAllListVh;
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        e3a e3aVar = new e3a();
        xga xgaVar = this.I;
        String str2 = this.E;
        if (str2 != null) {
            xgaVar.getClass();
            tfx tfxVar = new tfx("catalog.getGroupsCollection", new sq(6), new tq(6));
            tfx.o(tfxVar, "collection_id", str2, 0, 0, 12);
            if (userId != null) {
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            }
            tfxVar.j("need_blocks", true);
            return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new v34(new c(1, e3aVar, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 6));
        }
        xgaVar.getClass();
        tfx tfxVar2 = new tfx("catalog.getGroups", new wq(9), new xq(8));
        if (str != null) {
            tfx.o(tfxVar2, "ref", str, 0, 0, 12);
        }
        tfxVar2.j("need_blocks", true);
        if (userId != null) {
            tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 12);
        }
        String str3 = this.D;
        if (str3 != null) {
            tfx.o(tfxVar2, "url", str3, 0, 0, 12);
        }
        return rsg0.y0(yfb.x(tfxVar2), null, null, 3).U(new e40(new d(1, e3aVar, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 7));
    }
}
