package com.yandex.go.user_profile.settings.profile.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.yandex.go.user_profile.settings.profile.presentation.SettingsProfileView;
import defpackage.a9h0;
import defpackage.bcr0;
import defpackage.ccr0;
import defpackage.cma1;
import defpackage.dcr0;
import defpackage.dzg0;
import defpackage.hcr0;
import defpackage.klh0;
import defpackage.mfr0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.vcr0;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/user_profile/settings/profile/presentation/SettingsProfileView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lhcr0;", "presenter", "<init>", "(Landroid/content/Context;Lhcr0;)V", "Lzy11;", "setListeners", "()V", "updateRipples", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "disableProfile", "Lhcr0;", "Lmfr0;", "binding", "Lmfr0;", "", "clickable", "Z", "vcr0", "wcr0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsProfileView extends LinearLayout implements nwy0 {
    public static final int $stable = 8;
    private final mfr0 binding;
    private boolean clickable;
    private final hcr0 presenter;

    public SettingsProfileView(Context context, hcr0 hcr0Var) {
        super(context);
        this.presenter = hcr0Var;
        LayoutInflater.from(context).inflate(klh0.setttings_user_profile_layout, this);
        int i = a9h0.email_item;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
        if (listItemComponent != null) {
            i = a9h0.name_item;
            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, this);
            if (listItemComponent2 != null) {
                i = a9h0.phone_item;
                ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, this);
                if (listItemComponent3 != null) {
                    this.binding = new mfr0(this, listItemComponent, listItemComponent2, listItemComponent3);
                    this.clickable = true;
                    setOrientation(1);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void setListeners() {
        boolean z = this.clickable;
        mfr0 mfr0Var = this.binding;
        if (!z) {
            mfr0Var.c.setDebounceClickListener(null);
            this.binding.d.setDebounceClickListener(null);
            this.binding.b.setDebounceClickListener(null);
        } else {
            final int i = 0;
            mfr0Var.c.setDebounceClickListener(new Runnable(this) { // from class: ucr0
                public final /* synthetic */ SettingsProfileView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    SettingsProfileView settingsProfileView = this.b;
                    switch (i2) {
                        case 0:
                            SettingsProfileView.setListeners$lambda$0(settingsProfileView);
                            break;
                        case 1:
                            SettingsProfileView.setListeners$lambda$1(settingsProfileView);
                            break;
                        default:
                            SettingsProfileView.setListeners$lambda$2(settingsProfileView);
                            break;
                    }
                }
            });
            final int i2 = 1;
            this.binding.d.setDebounceClickListener(new Runnable(this) { // from class: ucr0
                public final /* synthetic */ SettingsProfileView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    SettingsProfileView settingsProfileView = this.b;
                    switch (i22) {
                        case 0:
                            SettingsProfileView.setListeners$lambda$0(settingsProfileView);
                            break;
                        case 1:
                            SettingsProfileView.setListeners$lambda$1(settingsProfileView);
                            break;
                        default:
                            SettingsProfileView.setListeners$lambda$2(settingsProfileView);
                            break;
                    }
                }
            });
            final int i3 = 2;
            this.binding.b.setDebounceClickListener(new Runnable(this) { // from class: ucr0
                public final /* synthetic */ SettingsProfileView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i3;
                    SettingsProfileView settingsProfileView = this.b;
                    switch (i22) {
                        case 0:
                            SettingsProfileView.setListeners$lambda$0(settingsProfileView);
                            break;
                        case 1:
                            SettingsProfileView.setListeners$lambda$1(settingsProfileView);
                            break;
                        default:
                            SettingsProfileView.setListeners$lambda$2(settingsProfileView);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$0(SettingsProfileView settingsProfileView) {
        settingsProfileView.presenter.Kg(dcr0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$1(SettingsProfileView settingsProfileView) {
        settingsProfileView.presenter.Kg(ccr0.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListeners$lambda$2(SettingsProfileView settingsProfileView) {
        settingsProfileView.presenter.Kg(bcr0.a);
    }

    private final void updateRipples() {
        boolean z = this.clickable;
        mfr0 mfr0Var = this.binding;
        if (z) {
            mfr0Var.c.setBackground(vng.t(dzg0.bg_main_ripple, getContext()));
            this.binding.d.setBackground(vng.t(dzg0.bg_main_ripple, getContext()));
            this.binding.b.setBackground(vng.t(dzg0.bg_main_ripple, getContext()));
        } else {
            mfr0Var.c.setBackgroundAttr(xng0.bgMain);
            this.binding.d.setBackgroundAttr(xng0.bgMain);
            this.binding.b.setBackgroundAttr(xng0.bgMain);
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateRipples();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void disableProfile() {
        this.clickable = false;
        setListeners();
        updateRipples();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        hcr0 hcr0Var = this.presenter;
        vcr0 vcr0Var = new vcr0(this);
        hcr0Var.Bg(vcr0Var);
        tje.N(hcr0Var.Jg(), null, null, new SettingsProfilePresenter$attachView$1(hcr0Var, vcr0Var, null), 3);
        setListeners();
        updateRipples();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
