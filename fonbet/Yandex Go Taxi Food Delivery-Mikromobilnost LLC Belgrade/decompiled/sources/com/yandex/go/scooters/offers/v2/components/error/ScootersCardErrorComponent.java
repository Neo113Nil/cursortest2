package com.yandex.go.scooters.offers.v2.components.error;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyException;
import com.yandex.payment.common.result.ResultType;
import defpackage.kyh0;
import defpackage.q0h0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/error/ScootersCardErrorComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "success", "()V", ResultType.RESULT_TYPE_LOADING, "", "t", "error", "(Ljava/lang/Throwable;)V", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCardErrorComponent extends ListItemComponent {
    public static final int $stable = 8;

    public ScootersCardErrorComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setLeadImage(tje.y(q0h0.ic_scooters_warning, getContext()));
        setLeadTint(qje.t(xng0.textMain, getContext()));
        setTitle(kyh0.scooters_failed_to_load_data);
        setTitleTypeface(3);
        setSubtitle(kyh0.scooters_try_to_reload);
        setVisibility(8);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setLeadTint(qje.t(xng0.textMain, getContext()));
    }

    public final void error(Throwable t) {
        if (t instanceof ScooterIsBusyException) {
            setTitle(kyh0.scooters_booking_failed_scooter_is_busy_title);
            setSubtitle(kyh0.scooters_booking_failed_scooter_is_busy_subtitle);
        } else {
            setTitle(kyh0.scooters_failed_to_load_data);
            setSubtitle(kyh0.scooters_try_to_reload);
        }
        setVisibility(0);
        setFocusable(true);
        performAccessibilityAction(64, null);
        sendAccessibilityEvent(32768);
    }

    public final void loading() {
        setVisibility(8);
    }

    public final void success() {
        setVisibility(8);
    }

    public ScootersCardErrorComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersCardErrorComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScootersCardErrorComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
