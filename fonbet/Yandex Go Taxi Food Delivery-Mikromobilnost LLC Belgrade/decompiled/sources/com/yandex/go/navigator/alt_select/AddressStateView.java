package com.yandex.go.navigator.alt_select;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.b6l0;
import defpackage.bdc;
import defpackage.dwh0;
import defpackage.dzg0;
import defpackage.h60;
import defpackage.i3y;
import defpackage.j01;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.n5;
import defpackage.ne50;
import defpackage.oe50;
import defpackage.pe50;
import defpackage.qe50;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tje;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.z5h0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0018\u0010\u0016J!\u0010\u001d\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/yandex/go/navigator/alt_select/AddressStateView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lpe50;", "route", "", "arrivalTime", "", "generateTitle", "(Lpe50;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Lzy11;", "onClick", "setSourceAddressOnClickListener", "(Lsls;)V", "setAddStopOnClickListener", "setStopsOnClickListener", "Lqe50;", "routeState", "Lb6l0;", "currentRouteMetricData", "updateUiState", "(Lqe50;Lb6l0;)V", "Lru/yandex/taxi/design/ListItemComponent;", "sourceAddress", "Lru/yandex/taxi/design/ListItemComponent;", "destinationAddress", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "addStopsView$delegate", "Li3y;", "getAddStopsView", "()Lru/yandex/taxi/widget/buttons/IconCircleButton;", "addStopsView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressStateView extends GoLinearLayout {
    public static final int $stable = 8;

    /* renamed from: addStopsView$delegate, reason: from kotlin metadata */
    private final i3y addStopsView;
    private final ListItemComponent destinationAddress;
    private final ListItemComponent sourceAddress;

    public AddressStateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        listItemComponent.setBackgroundResource(dzg0.bg_transparent_ripple);
        listItemComponent.setTitleAlignment(0);
        listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, listItemComponent.getContext()));
        listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON_HALF_MARGIN);
        addView(listItemComponent);
        this.sourceAddress = listItemComponent;
        ListItemComponent listItemComponent2 = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent2.setId(z5h0.destination_address);
        listItemComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        listItemComponent2.setBackgroundResource(dzg0.bg_transparent_ripple);
        listItemComponent2.setTitleAlignment(0);
        listItemComponent2.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, listItemComponent2.getContext()));
        listItemComponent2.setTrailVerticalGravity(0);
        addView(listItemComponent2);
        this.destinationAddress = listItemComponent2;
        this.addStopsView = kotlin.a.b(LazyThreadSafetyMode.NONE, new n5(context, 1));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconCircleButton addStopsView_delegate$lambda$0(Context context) {
        IconCircleButton iconCircleButton = new IconCircleButton(context, null, 0, 0, 14, null);
        iconCircleButton.setIcon(dzg0.ic_plus);
        iconCircleButton.setIconTintAttr(xng0.textMain);
        int r = tje.r(mrg0.list_item_component_size_M, iconCircleButton.getContext());
        iconCircleButton.setLayoutParams(new LinearLayout.LayoutParams(r, r));
        return iconCircleButton;
    }

    private final CharSequence generateTitle(pe50 route, String arrivalTime) {
        List list;
        String str = "";
        if (route == null || (list = route.b) == null) {
            return "";
        }
        int size = list.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String D1 = size == 1 ? ((ne50) kotlin.collections.a.P(list)).c.D1() : size > 2 ? tje.T(getContext(), dwh0.summary_route_stops, size, Integer.valueOf(size)) : kotlin.collections.a.X(list, "→", null, null, new j01(10), 30);
        if (arrivalTime != null) {
            if (!xw31.n(getContext()) || size > 2) {
                arrivalTime = " · ".concat(arrivalTime);
            }
            str = arrivalTime;
        }
        if (!xw31.n(getContext()) || size > 2) {
            spannableStringBuilder.append((CharSequence) D1);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(s8o.m(new bdc(xng0.textMinor), getContext()));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            return spannableStringBuilder;
        }
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(s8o.m(new bdc(xng0.textMinor), getContext()));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) D1);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateTitle$lambda$0(ne50 ne50Var) {
        return ne50Var.c.D1();
    }

    private final IconCircleButton getAddStopsView() {
        return (IconCircleButton) this.addStopsView.getValue();
    }

    public final void setAddStopOnClickListener(sls onClick) {
        getAddStopsView().setDebounceClickListener(new h60(6, onClick));
    }

    public final void setSourceAddressOnClickListener(sls onClick) {
        this.sourceAddress.setDebounceClickListener(new h60(4, onClick));
    }

    public final void setStopsOnClickListener(sls onClick) {
        this.destinationAddress.setDebounceClickListener(new h60(5, onClick));
    }

    public final void updateUiState(qe50 routeState, b6l0 currentRouteMetricData) {
        kdc kdcVar;
        pe50 pe50Var;
        oe50 oe50Var;
        Address address;
        this.sourceAddress.setLeadImage(routeState != null ? routeState.b : null);
        this.sourceAddress.setTitle((routeState == null || (pe50Var = routeState.a) == null || (oe50Var = pe50Var.a) == null || (address = oe50Var.c) == null) ? null : address.D1());
        this.destinationAddress.setLeadImage(routeState != null ? routeState.c : null);
        this.destinationAddress.setTitle(generateTitle(routeState != null ? routeState.a : null, currentRouteMetricData != null ? currentRouteMetricData.d : null));
        this.destinationAddress.setTitleEllipsizeMode(2);
        this.destinationAddress.setTrailView(getAddStopsView());
        this.destinationAddress.setTrailVerticalGravity(0);
        if (routeState == null || (kdcVar = routeState.d) == null) {
            this.destinationAddress.setTitleColorAttr(xng0.textMain);
        } else {
            this.destinationAddress.setTitleTextColor(kdcVar);
        }
    }

    public AddressStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public AddressStateView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public AddressStateView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ AddressStateView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
