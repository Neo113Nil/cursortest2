package com.yandex.go.taxi.order.info;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.yandex.go.taxi.order.models.api.response.ContractItem;
import com.yandex.go.taxi.order.models.api.response.FreightageContract;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.ief;
import defpackage.kub1;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.w511;
import defpackage.xdf;
import defpackage.yx70;
import defpackage.zkh0;
import defpackage.zx70;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/taxi/order/info/OrderInfoFreightageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/go/taxi/order/models/api/response/ContractItem;", "contractItem", "Lief;", "currencyRulesDto", "Lxdf;", "currencyFormatter", "Lzy11;", "addItemView", "(Lcom/yandex/go/taxi/order/models/api/response/ContractItem;Lief;Lxdf;)V", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;", "extraItem", "addExtraItemView", "(Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;)V", "Lcom/yandex/go/taxi/order/models/api/response/FreightageContract;", "freightageContract", "init", "(Lcom/yandex/go/taxi/order/models/api/response/FreightageContract;Lief;Lxdf;)V", "Lyx70;", "viewBinding", "Lyx70;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderInfoFreightageView extends FrameLayout {
    public static final int $stable = 8;
    private final yx70 viewBinding;

    public OrderInfoFreightageView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(zkh0.order_info_freghtage_view, this);
        int i = p8h0.itemsContainer;
        AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) cma1.O(i, this);
        if (autoDividerComponentList != null) {
            this.viewBinding = new yx70(this, autoDividerComponentList);
        } else {
            ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
            throw null;
        }
    }

    private final void addExtraItemView(OrderStatusInfo.ExtraItem extraItem) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(extraItem.a);
        this.viewBinding.b.addView(listItemComponent);
    }

    private final void addItemView(ContractItem contractItem, ief currencyRulesDto, xdf currencyFormatter) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        String str = contractItem.b;
        String str2 = contractItem.c;
        listItemComponent.setTitle(str);
        this.viewBinding.b.addView(listItemComponent);
        int i = zx70.a[contractItem.a.ordinal()];
        if (i == 1) {
            listItemComponent.setTrailImage(dzg0.component_list_item_check_checked_single);
            listItemComponent.setSubtitle(str2);
            listItemComponent.setTrailContentDescription(getContext().getString(kyh0.content_description_selected));
            return;
        }
        if (i == 2) {
            listItemComponent.setSubtitle(kub1.d(currencyFormatter, currencyRulesDto, str2));
        } else if (i == 3 || i == 4) {
            listItemComponent.setSubtitle(str2);
        } else {
            w511.b();
        }
    }

    public final void init(FreightageContract freightageContract, ief currencyRulesDto, xdf currencyFormatter) {
        List list;
        List list2;
        this.viewBinding.b.removeAllViews();
        if (freightageContract != null && (list2 = freightageContract.b) != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                addItemView((ContractItem) it.next(), currencyRulesDto, currencyFormatter);
            }
        }
        if (freightageContract == null || (list = freightageContract.c) == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            addExtraItemView((OrderStatusInfo.ExtraItem) it2.next());
        }
    }
}
