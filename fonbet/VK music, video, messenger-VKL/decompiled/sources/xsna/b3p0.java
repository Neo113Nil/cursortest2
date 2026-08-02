package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.ecomm.market.good.c;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: ToolbarClickListenerImpl.kt */
/* loaded from: classes18.dex */
public final class b3p0 {
    public cxo a;
    public CommonMarketStat$TypeRefSource b;
    public j8u c;
    public maz d;
    public gbh e;

    /* compiled from: ToolbarClickListenerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductCardTopBarControlAction.values().length];
            try {
                iArr[ProductCardTopBarControlAction.Edit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductCardTopBarControlAction.Promote.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductCardTopBarControlAction.Statistics.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductCardTopBarControlAction.CopyLink.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductCardTopBarControlAction.Remove.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final c.a a(Context context) {
        j8u j8uVar = this.c;
        Long valueOf = Long.valueOf(j8uVar.a);
        UserId userId = j8uVar.b;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.b;
        GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = this.a.g;
        return new c.a(context, valueOf, userId, commonMarketStat$TypeRefSource, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null, goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null);
    }
}
