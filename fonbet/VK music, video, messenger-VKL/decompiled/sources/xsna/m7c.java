package xsna;

import android.content.Intent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;

/* compiled from: CheckoutPaymentHandler.kt */
/* loaded from: classes18.dex */
public interface m7c {
    void a(OrderPaymentParameters orderPaymentParameters, CommonMarketStat$TypeMarketOrdersItem.Source source, FragmentImpl fragmentImpl);

    void b(int i, Intent intent, yh yhVar, ic icVar, com.vk.movika.sdk.android.defaultplayer.view.timeline.a aVar);

    boolean c(int i);
}
