package com.yandex.go.taxi.order.info;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.taxi.order.models.api.objects.Organization;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.bgb0;
import defpackage.evu0;
import defpackage.kyh0;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.sd30;
import defpackage.tls;
import defpackage.zkh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerType;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010 \u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/yandex/go/taxi/order/info/OrderInfoOrganizationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lzy11;", "removeAddedExtraItemViews", "()V", "", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;", "extraItems", "addExtraItemViews", "(Ljava/util/List;)V", "item", "Lru/yandex/taxi/design/ListItemComponent;", "createListItemComponent", "(Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;)Lru/yandex/taxi/design/ListItemComponent;", "component", "", "text", "setTitleOrGone", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/String;)V", "Lcom/yandex/go/taxi/order/models/api/objects/Organization;", "organization", "Lkotlin/Function1;", "onPhoneCall", "", "hideBottomDivider", "init", "(Lcom/yandex/go/taxi/order/models/api/objects/Organization;Ltls;Z)V", "Lru/yandex/taxi/design/AutoDividerComponentList;", "componentsList", "Lru/yandex/taxi/design/AutoDividerComponentList;", "organizationName", "Lru/yandex/taxi/design/ListItemComponent;", "longName", "tin", "address", "ogrn", "hours", "phone", "", "Landroid/view/View;", "addedExtraItemViews", "Ljava/util/List;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderInfoOrganizationView extends FrameLayout {
    public static final int $stable = 8;
    private final List<View> addedExtraItemViews;
    private final ListItemComponent address;
    private final AutoDividerComponentList componentsList;
    private final ListItemComponent hours;
    private final ListItemComponent longName;
    private final ListItemComponent ogrn;
    private final ListItemComponent organizationName;
    private final ListItemComponent phone;
    private final ListItemComponent tin;

    public OrderInfoOrganizationView(Context context) {
        super(context);
        View.inflate(getContext(), zkh0.about_organization_view, this);
        int i = p8h0.components_list;
        WeakHashMap weakHashMap = b.a;
        this.componentsList = (AutoDividerComponentList) ((View) rp31.d(this, i));
        this.organizationName = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_name));
        this.longName = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_long_name));
        this.tin = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_tin));
        this.address = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_address));
        this.ogrn = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_ogrn));
        this.hours = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_working_hours));
        this.phone = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_phone));
        this.addedExtraItemViews = new ArrayList();
    }

    private final void addExtraItemViews(List<OrderStatusInfo.ExtraItem> extraItems) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : extraItems) {
            if (!evu0.J(((OrderStatusInfo.ExtraItem) obj).a)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ListItemComponent createListItemComponent = createListItemComponent((OrderStatusInfo.ExtraItem) it.next());
            this.addedExtraItemViews.add(createListItemComponent);
            this.componentsList.addView(createListItemComponent);
        }
    }

    private final ListItemComponent createListItemComponent(OrderStatusInfo.ExtraItem item) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(item.a);
        return listItemComponent;
    }

    public static /* synthetic */ void init$default(OrderInfoOrganizationView orderInfoOrganizationView, Organization organization, tls tlsVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        orderInfoOrganizationView.init(organization, tlsVar, z);
    }

    private final void removeAddedExtraItemViews() {
        Iterator<View> it = this.addedExtraItemViews.iterator();
        while (it.hasNext()) {
            this.componentsList.removeView(it.next());
        }
        this.addedExtraItemViews.clear();
    }

    private final void setTitleOrGone(ListItemComponent component, String text) {
        component.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        component.setTitle(text);
    }

    public final void init(Organization organization, tls onPhoneCall, boolean hideBottomDivider) {
        if (hideBottomDivider) {
            this.componentsList.setBottomDivider(DividerType.NONE);
        }
        if (organization == null) {
            return;
        }
        setTitleOrGone(this.organizationName, organization.b);
        setTitleOrGone(this.longName, organization.d);
        setTitleOrGone(this.address, organization.e);
        setTitleOrGone(this.tin, organization.h);
        setTitleOrGone(this.ogrn, organization.f);
        setTitleOrGone(this.hours, organization.g);
        String a = bgb0.a(getContext(), organization.c);
        setTitleOrGone(this.phone, a);
        int length = a.length();
        ListItemComponent listItemComponent = this.phone;
        if (length == 0) {
            listItemComponent.setTrailContainerClickListener(null);
        } else {
            listItemComponent.setTrailContainerClickListener(new sd30(16, onPhoneCall, a));
            this.phone.setTrailContentDescription(getContext().getString(kyh0.taxiotw_call));
        }
        removeAddedExtraItemViews();
        addExtraItemViews(organization.i);
    }

    public OrderInfoOrganizationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), zkh0.about_organization_view, this);
        int i = p8h0.components_list;
        WeakHashMap weakHashMap = b.a;
        this.componentsList = (AutoDividerComponentList) ((View) rp31.d(this, i));
        this.organizationName = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_name));
        this.longName = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_long_name));
        this.tin = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_tin));
        this.address = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_address));
        this.ogrn = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_ogrn));
        this.hours = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_working_hours));
        this.phone = (ListItemComponent) ((View) rp31.d(this, p8h0.organization_phone));
        this.addedExtraItemViews = new ArrayList();
    }
}
