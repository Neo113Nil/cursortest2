package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.account.dto.AccountToggleDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.friend.FriendsBirthdayCellVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsBirthdaysPackableVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsProfileTileVh;
import com.vk.catalog2.common.ui.holders.friend.FriendsSubscribersVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.HeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.HeaderShowAllVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.eda;
import xsna.u4a;

/* compiled from: FriendsCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class bms extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final xga D;
    public final e3a E;
    public final afa F;
    public final Object G;
    public final Object H;

    /* compiled from: FriendsCatalogConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CatalogConfiguration$Companion$ContainerType.values().length];
            try {
                iArr[CatalogConfiguration$Companion$ContainerType.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogDataType.DATA_TYPE_CATALOG_USERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CatalogViewType.values().length];
            try {
                iArr3[CatalogViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CatalogViewType.HEADER_COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CatalogViewType.HEADER_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CatalogViewType.HORIZONTAL_LIST_FRIEND_SUGGESTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CatalogViewType.LIST_MYFOLLOWERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CatalogViewType.FRIENDS_BIRTHDAYS_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: FriendsCatalogConfiguration.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<CatalogCatalogResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto) {
            ((e3a) this.receiver).getClass();
            return e3a.b(catalogCatalogResponseObjectDto);
        }
    }

    /* compiled from: FriendsCatalogConfiguration.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<CatalogSectionResponseObjectDto, hda> {
        @Override // xsna.izs
        public final hda invoke(CatalogSectionResponseObjectDto catalogSectionResponseObjectDto) {
            return ((afa) this.receiver).a(catalogSectionResponseObjectDto);
        }
    }

    public bms(Bundle bundle) {
        super(UserId.d, bundle.getString("ref"));
        this.D = new xga();
        this.E = new e3a();
        this.F = new afa();
        sfg sfgVar = new sfg(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, sfgVar);
        this.H = msy.a(lazyThreadSafetyMode, new a44(18));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> D(String str, String str2, boolean z) {
        return rsg0.T(yfb.x(wga.d(this.D, str, str2 == null ? 20 : null, str2, Boolean.valueOf(z), Collections.singletonList((AccountToggleDto) this.H.getValue()), null, 31608))).U(new com.vk.movika.sdk.base.hooks.k(new c(1, this.F, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 25)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final RecyclerView.n F(CatalogConfiguration$Companion$ContainerType catalogConfiguration$Companion$ContainerType, u4a u4aVar) {
        return a.$EnumSwitchMapping$0[catalogConfiguration$Companion$ContainerType.ordinal()] == 1 ? new cms() : super.F(catalogConfiguration$Companion$ContainerType, u4aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final jda K(u4a u4aVar) {
        return ((AccountToggleDto) this.H.getValue()).d() ? new fz8(new jrs(0), u4aVar.c.d) : super.K(u4aVar);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final g3a S(u4a u4aVar, String str) {
        return new g3a(this, u4aVar, K(u4aVar), null, null, new vga("friends_catalog_data"), null, null, null, null, 32728);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a
    public final eda.a g() {
        return new q40(this, 15);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        int i = a.$EnumSwitchMapping$1[catalogDataType.ordinal()];
        if (i == 1) {
            int i2 = a.$EnumSwitchMapping$2[catalogViewType.ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new HeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, true, R.layout.catalog_search_header_large) : new HeaderShowAllVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, R.layout.catalog_friends_simple_header_suggestion, aVar.m) : ((AccountToggleDto) this.H.getValue()).d() ? new FriendsComposeHeaderIconShowAllBadgeVh(this, aVar.b, b0(u4aVar), aVar.f, aVar.w, aVar.m, (lrs) this.G.getValue(), 64) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        if (i == 2) {
            return a.$EnumSwitchMapping$2[catalogViewType.ordinal()] == 4 ? new PlaceholderVh(aVar.w, false, false, null, null, R.layout.global_search_catalog_placeholder_view, null, 0, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE) : super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        if (i != 3) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        int i3 = a.$EnumSwitchMapping$2[catalogViewType.ordinal()];
        if (i3 == 5) {
            return new FriendsProfileTileVh(aVar.f, aVar.m, aVar.l);
        }
        if (i3 != 6) {
            if (i3 != 7) {
                return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
            }
            CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
            catalogFeatures.getClass();
            return com.vk.toggle.b.A.a(catalogFeatures) ? new FriendsBirthdayCellVh(aVar.l) : new FriendsBirthdaysPackableVh(aVar.l);
        }
        CatalogFeatures catalogFeatures2 = CatalogFeatures.COM_FRIENDS;
        catalogFeatures2.getClass();
        if (!com.vk.toggle.b.A.a(catalogFeatures2)) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        dos dosVar = new dos(new vls[0]);
        dos dosVar2 = aVar.n;
        if (dosVar2 != null) {
            dosVar.b(dosVar2);
        }
        cks cksVar = aVar.l;
        if (cksVar != null) {
            dosVar.b(new dks(cksVar));
        }
        return new FriendsSubscribersVh(new FriendsSubscribersVh.a(aVar.m, aVar.d, aVar.f, aVar.l, dosVar));
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        this.D.getClass();
        tfx tfxVar = new tfx("catalog.getFriends", new nq(6), new oq(7));
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 255, 4);
        }
        return rsg0.T(yfb.x(tfxVar)).U(new r41(new b(1, this.E, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 25)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }
}
