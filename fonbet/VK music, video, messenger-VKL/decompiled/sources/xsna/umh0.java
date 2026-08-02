package xsna;

import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.dto.common.Good;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Collections;
import java.util.List;
import xsna.hzp0;
import xsna.vha;

/* compiled from: SearchAllCatalogUIViewTracker.kt */
/* loaded from: classes5.dex */
public final class umh0 extends oxq implements w8i {
    public final lt00 i;

    /* compiled from: SearchAllCatalogUIViewTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentType.values().length];
            try {
                iArr[ContentType.MINIAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentType.SEARCH_ADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public umh0(s1v s1vVar, dha dhaVar, AudienceResearchComponent audienceResearchComponent) {
        super(s1vVar, dhaVar, audienceResearchComponent);
        this.i = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).l7();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3 A[RETURN] */
    @Override // xsna.oxq, xsna.vha, xsna.d680
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<hzp0> j(Object obj) {
        SchemeStat$EventItem.Type type;
        boolean z = obj instanceof vha.b;
        List<hzp0> list = null;
        List<hzp0> singletonList = null;
        vha.b bVar = z ? (vha.b) obj : null;
        if (bVar != null) {
            UIBlock uIBlock = bVar.a;
            UIBlockMarketItem uIBlockMarketItem = uIBlock instanceof UIBlockMarketItem ? (UIBlockMarketItem) uIBlock : null;
            if (uIBlockMarketItem != null) {
                Good good = uIBlockMarketItem.y;
                lt00.h(this.i, Long.valueOf(good.b), Long.valueOf(good.c.b), Integer.valueOf(bVar.b), CommonMarketStat$TypeRefSource.SEARCH_GLOBAL, good.d0, null, null, null, 224);
            }
        }
        vha.b bVar2 = z ? (vha.b) obj : null;
        UIBlock uIBlock2 = bVar2 != null ? bVar2.a : null;
        boolean z2 = uIBlock2 instanceof UIBlockLink;
        dha dhaVar = this.c;
        if (z2) {
            UIBlockLink uIBlockLink = (UIBlockLink) uIBlock2;
            int i = ((vha.b) obj).b;
            Meta meta = uIBlockLink.y.g;
            ContentType contentType = meta != null ? meta.c : null;
            int i2 = contentType == null ? -1 : a.$EnumSwitchMapping$0[contentType.ordinal()];
            if (i2 == 1 || i2 == 2) {
                singletonList = Collections.singletonList(hzp0.m.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.LINK, null, null, null, uIBlockLink.r(), null, 46, null), i, dhaVar != null ? dhaVar.a() : null));
            }
            return singletonList == null ? super.j(obj) : singletonList;
        }
        if (!(uIBlock2 instanceof UIBlockApp)) {
            return super.j(obj);
        }
        UIBlockApp uIBlockApp = (UIBlockApp) uIBlock2;
        int i3 = ((vha.b) obj).b;
        if (!uIBlockApp.y.zb().booleanValue()) {
            if ("mini_app".equals(uIBlockApp.y.C)) {
                type = SchemeStat$EventItem.Type.MINI_APP;
            }
            return list != null ? super.j(obj) : list;
        }
        type = SchemeStat$EventItem.Type.GAME;
        list = Collections.singletonList(hzp0.m.a(new SchemeStat$EventItem(type, null, null, null, uIBlockApp.r(), null, 46, null), i3, dhaVar != null ? dhaVar.a() : null));
        if (list != null) {
        }
    }
}
