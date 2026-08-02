package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardSeatsSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import defpackage.cma1;
import defpackage.fjw;
import defpackage.j8h0;
import defpackage.k4h0;
import defpackage.niw;
import defpackage.ny61;
import defpackage.piw;
import defpackage.qje;
import defpackage.tje;
import defpackage.tkh0;
import defpackage.tug0;
import defpackage.vng;
import defpackage.xng0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardSeatsSelectorContainerView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;)V", "Landroid/view/View;", "view", "Lzy11;", "disableImage", "(Landroid/view/View;)V", "enableImage", "Lfjw;", Constants.KEY_DATA, "render", "(Lfjw;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lniw;", "binding", "Lniw;", "Companion", "piw", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSeatsSelectorContainerView extends GoFrameLayout {
    private static final piw Companion = new piw();
    private static final float DEFAULT_STATE_ALPHA = 1.0f;
    private static final float DISABLED_STATE_ALPHA = 0.25f;
    private final niw binding;
    private final g dashboardPresenter;

    public IntercityDashboardSeatsSelectorContainerView(Context context, g gVar) {
        super(context, null, 0, 0, 14, null);
        this.dashboardPresenter = gVar;
        LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_seats_selector_container, this);
        int i = j8h0.seats_banner_title;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
        if (robotoTextView != null) {
            i = j8h0.seats_counter;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
            if (listItemComponent != null) {
                this.binding = new niw(this, robotoTextView, listItemComponent);
                setBackground(vng.t(k4h0.bg_minor_rounded_24dp, getContext()));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart(tje.r(tug0.section_margin_size, getContext()));
                layoutParams.setMarginEnd(tje.r(tug0.section_margin_size, getContext()));
                layoutParams.topMargin = tje.r(tug0.section_margin, getContext());
                setLayoutParams(layoutParams);
                setPadding(getPaddingLeft(), tje.r(tug0.section_vertical_padding, getContext()), getPaddingRight(), tje.r(tug0.section_vertical_padding, getContext()));
                listItemComponent.setRoundedBackground(qje.t(xng0.bgMain, getContext()));
                final int i2 = 0;
                listItemComponent.getLeadImageView().setDebounceClickListener(new Runnable(this) { // from class: oiw
                    public final /* synthetic */ IntercityDashboardSeatsSelectorContainerView b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        IntercityDashboardSeatsSelectorContainerView intercityDashboardSeatsSelectorContainerView = this.b;
                        switch (i3) {
                            case 0:
                                IntercityDashboardSeatsSelectorContainerView._init_$lambda$1(intercityDashboardSeatsSelectorContainerView);
                                break;
                            default:
                                IntercityDashboardSeatsSelectorContainerView._init_$lambda$2(intercityDashboardSeatsSelectorContainerView);
                                break;
                        }
                    }
                });
                ClickableImageView trailImageView = listItemComponent.getTrailImageView();
                final int i3 = 1;
                trailImageView.setDebounceClickListener(new Runnable(this) { // from class: oiw
                    public final /* synthetic */ IntercityDashboardSeatsSelectorContainerView b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        IntercityDashboardSeatsSelectorContainerView intercityDashboardSeatsSelectorContainerView = this.b;
                        switch (i32) {
                            case 0:
                                IntercityDashboardSeatsSelectorContainerView._init_$lambda$1(intercityDashboardSeatsSelectorContainerView);
                                break;
                            default:
                                IntercityDashboardSeatsSelectorContainerView._init_$lambda$2(intercityDashboardSeatsSelectorContainerView);
                                break;
                        }
                    }
                });
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(IntercityDashboardSeatsSelectorContainerView intercityDashboardSeatsSelectorContainerView) {
        intercityDashboardSeatsSelectorContainerView.dashboardPresenter.Kg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(IntercityDashboardSeatsSelectorContainerView intercityDashboardSeatsSelectorContainerView) {
        intercityDashboardSeatsSelectorContainerView.dashboardPresenter.Lg();
    }

    private final void disableImage(View view) {
        view.setAlpha(0.25f);
        view.setEnabled(false);
    }

    private final void enableImage(View view) {
        view.setAlpha(1.0f);
        view.setEnabled(true);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBackground(vng.t(k4h0.bg_minor_rounded_24dp, getContext()));
        this.binding.c.setRoundedBackground(qje.t(xng0.bgMain, getContext()));
    }

    public final void render(fjw data) {
        this.binding.b.setText(data.a);
        this.binding.c.setTitle(String.valueOf(data.b));
        boolean z = data.d;
        niw niwVar = this.binding;
        if (z) {
            enableImage(niwVar.c.getLeadImageView());
        } else {
            disableImage(niwVar.c.getLeadImageView());
        }
        boolean z2 = data.c;
        niw niwVar2 = this.binding;
        if (z2) {
            enableImage(niwVar2.c.getTrailImageView());
        } else {
            disableImage(niwVar2.c.getTrailImageView());
        }
    }
}
