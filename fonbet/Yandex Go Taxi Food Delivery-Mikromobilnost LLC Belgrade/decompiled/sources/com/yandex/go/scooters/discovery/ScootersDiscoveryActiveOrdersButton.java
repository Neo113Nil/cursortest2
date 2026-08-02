package com.yandex.go.scooters.discovery;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/go/scooters/discovery/ScootersDiscoveryActiveOrdersButton;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyDiscoveryStyle", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScootersDiscoveryActiveOrdersButton extends ListItemComponent {
    public static final int $stable = 8;

    public /* synthetic */ ScootersDiscoveryActiveOrdersButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void applyDiscoveryStyle() {
        setRoundedBackgroundWithCustomRipple(qje.t(xng0.bgFloating, getContext()), qje.t(xng0.iconMinor, getContext()), tje.x(getContext(), 100.0f));
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyDiscoveryStyle();
    }

    public ScootersDiscoveryActiveOrdersButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersDiscoveryActiveOrdersButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        applyDiscoveryStyle();
    }

    public ScootersDiscoveryActiveOrdersButton(Context context) {
        this(context, null, 0, 6, null);
    }
}
