package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.vkui.LinkCellVh;
import com.vk.catalog2.common.ui.holders.vkui.LinkHorizontalListItemVh;
import com.vk.dto.common.id.UserId;
import xsna.u4a;

/* compiled from: AudioBookGenreCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class bh4 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;
    public final xga E;
    public final e3a F;

    /* compiled from: AudioBookGenreCatalogConfiguration.kt */
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
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogDataType.values().length];
            try {
                iArr2[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bh4(Bundle bundle) {
        super(r0, r1);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("genre_id");
        this.D = string2;
        this.E = new xga();
        this.F = new e3a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.a, com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final CatalogViewHolder w(CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogViewStyle catalogViewStyle, UIBlock uIBlock, u4a u4aVar) {
        u4a.a aVar = u4aVar.b;
        if (a.$EnumSwitchMapping$1[catalogDataType.ordinal()] != 1) {
            return super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar);
        }
        int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        return i != 1 ? i != 2 ? super.w(catalogDataType, catalogViewType, catalogViewStyle, uIBlock, u4aVar) : new LinkCellVh(aVar.f, LinkCellVh.ImageSize.Large, aVar.j, aVar.m, null, 16368) : new LinkHorizontalListItemVh(aVar.f, LinkHorizontalListItemVh.Size.Medium, aVar.j, aVar.m, true, 0, false, false, 8160);
    }

    @Override // com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration
    public final io.reactivex.rxjava3.core.q<hda> x(UserId userId, String str) {
        this.E.getClass();
        tfx tfxVar = new tfx("catalog.getAudioBooks", new iq(3), new jq(7));
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        String str2 = this.D;
        if (str2 != null) {
            tfx.o(tfxVar, "genre_id", str2, 0, 0, 12);
        }
        return rsg0.T(yfb.x(tfxVar)).U(new v34(new po1(this, 3), 1));
    }
}
