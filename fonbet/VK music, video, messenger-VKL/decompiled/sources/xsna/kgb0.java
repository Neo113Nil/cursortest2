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
import com.vk.toggle.Features;
import xsna.u4a;

/* compiled from: PodcastCatalogConfiguration.kt */
/* loaded from: classes16.dex */
public final class kgb0 extends com.vk.catalog2.common.ui.mvp.configuration.a {
    public final String D;

    /* compiled from: PodcastCatalogConfiguration.kt */
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
    public kgb0(Bundle bundle) {
        super(r0, r1);
        UserId userId = (UserId) bundle.getParcelable("owner_id");
        userId = userId == null ? UserId.d : userId;
        String string = bundle.getString("ref");
        String string2 = bundle.getString("category_id");
        this.D = string2;
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
        int i;
        Features.Type type = Features.Type.FEATURE_AUDIO_PODCAST_AUTOGEN_CATALOG;
        type.getClass();
        boolean a2 = com.vk.toggle.b.A.a(type);
        String str2 = this.D;
        if (!a2) {
            return rsg0.y0(new l6a(new wba(), userId, str, str2), null, null, 3);
        }
        m6a m6aVar = new m6a();
        m6aVar.b = new e3a();
        bpn0 bpn0Var = cqm0.a;
        try {
            i = Integer.parseInt(str2);
        } catch (Throwable unused) {
            i = 0;
        }
        int i2 = i;
        tfx tfxVar = new tfx("catalog.getPodcasts", new mq(9), new l4(9));
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        tfxVar.j("need_blocks", true);
        tfx.l(tfxVar, "category_id", i2, 0, 0, 12);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new pa(new ay0(m6aVar, 15), 5));
    }
}
