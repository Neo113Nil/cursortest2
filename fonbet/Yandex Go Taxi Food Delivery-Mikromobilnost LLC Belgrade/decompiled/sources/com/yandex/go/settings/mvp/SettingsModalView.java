package com.yandex.go.settings.mvp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.payments_widgets.yandex_bank.PaymentMethodsHideBalanceExperiment;
import com.yandex.go.settings.mvp.SettingsModalView;
import defpackage.a1i;
import defpackage.aog0;
import defpackage.as21;
import defpackage.b6g;
import defpackage.bdc;
import defpackage.c2x0;
import defpackage.cma1;
import defpackage.cne0;
import defpackage.d2x0;
import defpackage.dkh0;
import defpackage.g18;
import defpackage.g3g0;
import defpackage.giy0;
import defpackage.hiy0;
import defpackage.hn4;
import defpackage.i5m;
import defpackage.i5z;
import defpackage.j5z;
import defpackage.jde0;
import defpackage.jpf0;
import defpackage.kj10;
import defpackage.lw90;
import defpackage.m950;
import defpackage.n3w;
import defpackage.n65;
import defpackage.n8z;
import defpackage.ney;
import defpackage.ny61;
import defpackage.o8z;
import defpackage.par0;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.quq0;
import defpackage.rrj;
import defpackage.sy60;
import defpackage.t1w;
import defpackage.t7h0;
import defpackage.tai0;
import defpackage.tje;
import defpackage.uar0;
import defpackage.v3u0;
import defpackage.var0;
import defpackage.vm80;
import defpackage.vnb1;
import defpackage.w130;
import defpackage.w4g0;
import defpackage.war0;
import defpackage.wbr0;
import defpackage.xar0;
import defpackage.xk60;
import defpackage.xng0;
import defpackage.xvf0;
import defpackage.xw91;
import defpackage.y7z;
import defpackage.yar0;
import defpackage.yvf0;
import defpackage.zaa0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;
import ru.yandex.taxi.settings.presentation.system_disabled.PushSystemDisabledView;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ComponentLinearLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001[\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002^_B\u0091\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0014¢\u0006\u0004\b+\u0010*J\u001f\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020(2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020(2\u0006\u00107\u001a\u0002022\u0006\u00108\u001a\u000202H\u0014¢\u0006\u0004\b9\u00106J\u0017\u0010<\u001a\u00020(2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020(H\u0002¢\u0006\u0004\b>\u0010*J\u000f\u0010?\u001a\u00020(H\u0002¢\u0006\u0004\b?\u0010*J\u000f\u0010@\u001a\u00020(H\u0002¢\u0006\u0004\b@\u0010*J\u000f\u0010A\u001a\u00020(H\u0002¢\u0006\u0004\bA\u0010*J\u0017\u0010D\u001a\u00020(2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020(2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\bF\u0010=R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010MR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010NR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010PR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010QR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010RR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010SR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010TR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010GR\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010HR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lcom/yandex/go/settings/mvp/SettingsModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lyar0;", "Landroid/content/Context;", "context", "Landroid/view/View;", "settingsUserProfileView", "Lru/yandex/taxi/animation/NavigationDirection;", "openingNavigationDirection", "Lwbr0;", "presenter", "Las21;", "userPreferences", "Lj5z;", "localeHelper", "Lv3u0;", "stateBarVisibilitySuppressorRepository", "Lru/yandex/taxi/startup/launch/h;", "launchDataStorage", "Lney;", "lifecycleObservable", "Lru/yandex/taxi/utils/b;", "geoSharingConfigStore", "Lxk60;", "notificationsHelper", "Lg3g0;", "pushSettingsComponentFactory", "Ln8z;", "locationDiagnosticPreferences", "Lhiy0;", "testingEntryPointsRepository", "Lc2x0;", "systemBarsCoordinator", "Lpwy0;", "themeSwitcherProvider", "<init>", "(Landroid/content/Context;Landroid/view/View;Lru/yandex/taxi/animation/NavigationDirection;Lwbr0;Las21;Lj5z;Lv3u0;Lru/yandex/taxi/startup/launch/h;Lney;Lru/yandex/taxi/utils/b;Lxk60;Lg3g0;Ln8z;Lhiy0;Lc2x0;Lpwy0;)V", "Lw130;", "insetsType", "()Lw130;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyar0;", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "initLayout", "addExtraItems", "addTestingEntryPointsItems", "handlePushSettingsSystemState", "", "visible", "updatePushSettingsVisible", "(Z)V", "updateStatusBarTheme", "Landroid/view/View;", "Lru/yandex/taxi/animation/NavigationDirection;", "Lwbr0;", "Las21;", "Lj5z;", "Lv3u0;", "Lru/yandex/taxi/startup/launch/h;", "Lney;", "Lru/yandex/taxi/utils/b;", "Lxk60;", "Lg3g0;", "Ln8z;", "Lhiy0;", "Lc2x0;", "Lpwy0;", "pushSystemDisabledView", "closingNavigationDirection", "Lg18;", "supressStateBarVisible", "Lg18;", "xar0", "lifecycleObserver", "Lxar0;", "var0", "bbr0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SettingsModalView extends SlideableBindingModalView<yar0> {
    public static final int $stable = 8;
    private NavigationDirection closingNavigationDirection;
    private final ru.yandex.taxi.utils.b geoSharingConfigStore;
    private final h launchDataStorage;
    private final ney lifecycleObservable;
    private final xar0 lifecycleObserver;
    private final j5z localeHelper;
    private final n8z locationDiagnosticPreferences;
    private final xk60 notificationsHelper;
    private final NavigationDirection openingNavigationDirection;
    private final wbr0 presenter;
    private final g3g0 pushSettingsComponentFactory;
    private View pushSystemDisabledView;
    private final View settingsUserProfileView;
    private final v3u0 stateBarVisibilitySuppressorRepository;
    private g18 supressStateBarVisible;
    private final c2x0 systemBarsCoordinator;
    private final hiy0 testingEntryPointsRepository;
    private final pwy0 themeSwitcherProvider;
    private final as21 userPreferences;

    public SettingsModalView(Context context, View view, NavigationDirection navigationDirection, wbr0 wbr0Var, as21 as21Var, j5z j5zVar, v3u0 v3u0Var, h hVar, ney neyVar, ru.yandex.taxi.utils.b bVar, xk60 xk60Var, g3g0 g3g0Var, n8z n8zVar, hiy0 hiy0Var, c2x0 c2x0Var, pwy0 pwy0Var) {
        super(context);
        this.settingsUserProfileView = view;
        this.openingNavigationDirection = navigationDirection;
        this.presenter = wbr0Var;
        this.userPreferences = as21Var;
        this.localeHelper = j5zVar;
        this.stateBarVisibilitySuppressorRepository = v3u0Var;
        this.launchDataStorage = hVar;
        this.lifecycleObservable = neyVar;
        this.geoSharingConfigStore = bVar;
        this.notificationsHelper = xk60Var;
        this.pushSettingsComponentFactory = g3g0Var;
        this.locationDiagnosticPreferences = n8zVar;
        this.testingEntryPointsRepository = hiy0Var;
        this.systemBarsCoordinator = c2x0Var;
        this.themeSwitcherProvider = pwy0Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        this.closingNavigationDirection = NavigationDirection.BACKWARD;
        this.lifecycleObserver = new xar0(this);
    }

    private final void addExtraItems() {
    }

    private final void addTestingEntryPointsItems() {
        this.testingEntryPointsRepository.getClass();
    }

    private static final void addTestingEntryPointsItems$lambda$0$0$0(SettingsModalView settingsModalView, giy0 giy0Var) {
        settingsModalView.presenter.getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePushSettingsSystemState() {
        if (!this.presenter.Q.a().b) {
            View view = this.pushSystemDisabledView;
            if (view != null) {
                view.setVisibility(8);
            }
            updatePushSettingsVisible(false);
            return;
        }
        if (ru.yandex.taxi.design.utils.c.p(this) == null) {
            return;
        }
        boolean b = this.notificationsHelper.b();
        if (!b && this.pushSystemDisabledView == null) {
            g3g0 g3g0Var = this.pushSettingsComponentFactory;
            war0 war0Var = new war0(this);
            PushSettingsOpenReason pushSettingsOpenReason = PushSettingsOpenReason.MENU;
            b6g b6gVar = ((b6g) g3g0Var.b.getValue()).b;
            pushSettingsOpenReason.getClass();
            i5m.b(new jpf0((xvf0) new jde0(b6gVar.n, 11), (xvf0) n3w.a(pushSettingsOpenReason), 1));
            n3w.a(war0Var);
            vm80 vm80Var = new vm80(b6gVar.k, b6gVar.o, 28);
            Context context = (Context) b6gVar.a.f;
            q5z.h(context);
            this.pushSystemDisabledView = new PushSystemDisabledView(context, (w4g0) vm80Var.get());
            getBinding().t.addView(this.pushSystemDisabledView);
        }
        View view2 = this.pushSystemDisabledView;
        if (view2 != null) {
            view2.setVisibility(b ? 8 : 0);
        }
        updatePushSettingsVisible(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void initLayout() {
        int i;
        yar0 binding = getBinding();
        ViewStub viewStub = binding.z;
        ListItemSwitchComponent listItemSwitchComponent = binding.f;
        ru.yandex.taxi.design.utils.c.w(viewStub, this.settingsUserProfileView);
        ListItemSwitchComponent listItemSwitchComponent2 = binding.w;
        final int i2 = 0;
        listItemSwitchComponent2.setVisibility(((cne0) this.launchDataStorage.b).f("show_sms_menu_settings") ? 0 : 8);
        final int i3 = 1;
        listItemSwitchComponent2.setOnCheckedListener(new uar0(this.presenter, i3));
        listItemSwitchComponent2.setOnClickListener(new a1i(listItemSwitchComponent2, i3));
        ListItemComponent listItemComponent = binding.j;
        this.closingNavigationDirection = NavigationDirection.FORWARD;
        j5z j5zVar = this.localeHelper;
        i5z a = j5zVar.a.a();
        Context context = j5zVar.f;
        a.getClass();
        listItemComponent.setSubtitle(context.getResources().getString(a.c));
        int i4 = 2;
        listItemComponent.setDebounceClickListener(new par0(this.presenter, i4));
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = binding.x;
        floatingTitleToolbarComponent.setOnBackClickListener(new Runnable(this) { // from class: qar0
            public final /* synthetic */ SettingsModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i3;
                SettingsModalView settingsModalView = this.b;
                switch (i5) {
                    case 0:
                        SettingsModalView.initLayout$lambda$0$10(settingsModalView);
                        break;
                    default:
                        settingsModalView.onBackPressed();
                        break;
                }
            }
        });
        floatingTitleToolbarComponent.setTitleAccessibilityHeading(true);
        floatingTitleToolbarComponent.setTrackedView(binding.u);
        ListItemSwitchComponent listItemSwitchComponent3 = binding.e;
        listItemSwitchComponent3.setOnClickListener(new View.OnClickListener(this) { // from class: rar0
            public final /* synthetic */ SettingsModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                SettingsModalView settingsModalView = this.b;
                switch (i5) {
                    case 0:
                        SettingsModalView.initLayout$lambda$0$3$0(settingsModalView, view);
                        break;
                    default:
                        SettingsModalView.initLayout$lambda$0$4$0(settingsModalView, view);
                        break;
                }
            }
        });
        listItemSwitchComponent3.setOnCheckedListener(new uar0(this.presenter, i4));
        listItemSwitchComponent3.setChecked(this.userPreferences.a("FIELD_DONT_CALL", false));
        ListItemSwitchComponent listItemSwitchComponent4 = binding.i;
        listItemSwitchComponent4.setOnClickListener(new View.OnClickListener(this) { // from class: rar0
            public final /* synthetic */ SettingsModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i3;
                SettingsModalView settingsModalView = this.b;
                switch (i5) {
                    case 0:
                        SettingsModalView.initLayout$lambda$0$3$0(settingsModalView, view);
                        break;
                    default:
                        SettingsModalView.initLayout$lambda$0$4$0(settingsModalView, view);
                        break;
                }
            }
        });
        int i5 = 3;
        listItemSwitchComponent4.setOnCheckedListener(new uar0(this.presenter, i5));
        ListItemSwitchComponent listItemSwitchComponent5 = binding.v;
        int i6 = 5;
        listItemSwitchComponent5.setOnClickListener(new a1i(listItemSwitchComponent5, i6));
        int i7 = 4;
        listItemSwitchComponent5.setOnCheckedListener(new uar0(this.presenter, i7));
        listItemSwitchComponent5.setChecked(this.userPreferences.a("FIELD_TRAFFICS_ON", false));
        ListItemSwitchComponent listItemSwitchComponent6 = binding.g;
        listItemSwitchComponent6.setChecked(this.presenter.M.a());
        listItemSwitchComponent6.setOnClickListener(new a1i(listItemSwitchComponent6, i4));
        listItemSwitchComponent6.setOnCheckedListener(new uar0(this.presenter, i6));
        listItemSwitchComponent6.setVisibility(this.presenter.V ? 0 : 8);
        ListItemSwitchComponent listItemSwitchComponent7 = binding.h;
        listItemSwitchComponent7.setChecked(this.presenter.N.a());
        listItemSwitchComponent7.setOnClickListener(new a1i(listItemSwitchComponent7, i5));
        listItemSwitchComponent7.setOnCheckedListener(new uar0(this.presenter, 6));
        zaa0 zaa0Var = (zaa0) this.presenter.O;
        if (((PaymentMethodsHideBalanceExperiment) zaa0Var.c()).b) {
            lw90 lw90Var = zaa0Var.c;
            PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.YB_WALLET;
            lw90Var.getClass();
            if (lw90.c(lw90Var, null, new n65[0], 3).a(paymentMethod$Type).equals(xw91.C) && zaa0Var.d()) {
                i = 0;
                listItemSwitchComponent7.setVisibility(i);
                if (this.geoSharingConfigStore.c().a) {
                    listItemSwitchComponent.setVisibility(8);
                    listItemSwitchComponent.setOnClickListener(null);
                } else {
                    listItemSwitchComponent.setVisibility(0);
                    listItemSwitchComponent.setOnClickListener(new tai0(17, this, listItemSwitchComponent));
                    listItemSwitchComponent.setChecked(this.geoSharingConfigStore.e());
                }
                ListItemSwitchComponent listItemSwitchComponent8 = binding.k;
                if (((y7z) ((o8z) this.locationDiagnosticPreferences).a.b()).b) {
                    listItemSwitchComponent8.setVisibility(8);
                } else {
                    listItemSwitchComponent8.setVisibility(0);
                    listItemSwitchComponent8.setChecked(((o8z) this.locationDiagnosticPreferences).a());
                    listItemSwitchComponent8.setOnClickListener(new a1i(listItemSwitchComponent8, i7));
                    listItemSwitchComponent8.setOnCheckedListener(new hn4(i4, this));
                }
                binding.y.setDebounceClickListener(new par0(this.presenter, i2));
                binding.o.setDebounceClickListener(new Runnable(this) { // from class: qar0
                    public final /* synthetic */ SettingsModalView b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i52 = i2;
                        SettingsModalView settingsModalView = this.b;
                        switch (i52) {
                            case 0:
                                SettingsModalView.initLayout$lambda$0$10(settingsModalView);
                                break;
                            default:
                                settingsModalView.onBackPressed();
                                break;
                        }
                    }
                });
                ListItemComponent listItemComponent2 = binding.n;
                listItemComponent2.setTitleTextColor(new bdc(xng0.textMain));
                listItemComponent2.setDebounceClickListener(new par0(this.presenter, i3));
                addExtraItems();
            }
        }
        i = 8;
        listItemSwitchComponent7.setVisibility(i);
        if (this.geoSharingConfigStore.c().a) {
        }
        ListItemSwitchComponent listItemSwitchComponent82 = binding.k;
        if (((y7z) ((o8z) this.locationDiagnosticPreferences).a.b()).b) {
        }
        binding.y.setDebounceClickListener(new par0(this.presenter, i2));
        binding.o.setDebounceClickListener(new Runnable(this) { // from class: qar0
            public final /* synthetic */ SettingsModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i52 = i2;
                SettingsModalView settingsModalView = this.b;
                switch (i52) {
                    case 0:
                        SettingsModalView.initLayout$lambda$0$10(settingsModalView);
                        break;
                    default:
                        settingsModalView.onBackPressed();
                        break;
                }
            }
        });
        ListItemComponent listItemComponent22 = binding.n;
        listItemComponent22.setTitleTextColor(new bdc(xng0.textMain));
        listItemComponent22.setDebounceClickListener(new par0(this.presenter, i3));
        addExtraItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$1$onLanguageClicked(wbr0 wbr0Var) {
        wbr0Var.x.e();
        kj10 kj10Var = wbr0Var.y;
        kj10Var.getClass();
        kj10Var.a.a("menu.appLang", new HashMap(), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$10(SettingsModalView settingsModalView) {
        settingsModalView.closingNavigationDirection = NavigationDirection.FORWARD;
        settingsModalView.presenter.x.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$11$onLogoutClicked(wbr0 wbr0Var) {
        tje.N(wbr0Var.Jg(), null, null, new SettingsPresenter$onLogoutClicked$1(wbr0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$3$0(SettingsModalView settingsModalView, View view) {
        settingsModalView.getBinding().e.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$4$0(SettingsModalView settingsModalView, View view) {
        settingsModalView.getBinding().i.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$8$0(SettingsModalView settingsModalView, ListItemSwitchComponent listItemSwitchComponent, View view) {
        wbr0 wbr0Var = settingsModalView.presenter;
        boolean isChecked = listItemSwitchComponent.isChecked();
        if (wbr0Var.H.e() != (!isChecked)) {
            if (isChecked) {
                wbr0Var.Kg(false);
            } else {
                com.yandex.go.coroutines.b.g(wbr0Var.Jg(), null, null, new SettingsPresenter$processSharingActiveChanged$1(wbr0Var, null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$9$1(SettingsModalView settingsModalView, boolean z) {
        ((o8z) settingsModalView.locationDiagnosticPreferences).b.u("ru.yandex.taxi.map.overlay.diagnostic.IS_ENABLED", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLayout$lambda$0$openChangeCallType(wbr0 wbr0Var) {
        rrj rrjVar = (rrj) wbr0Var.x.b;
        rrjVar.z((m950) ((yvf0) rrjVar.H).get(), sy60.Q2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(SettingsModalView settingsModalView, t1w t1wVar) {
        yar0 binding = settingsModalView.getBinding();
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = binding.x;
        floatingTitleToolbarComponent.setPadding(floatingTitleToolbarComponent.getPaddingLeft(), t1wVar.b, floatingTitleToolbarComponent.getPaddingRight(), floatingTitleToolbarComponent.getPaddingBottom());
        NestedScrollView nestedScrollView = binding.u;
        nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), t1wVar.b, nestedScrollView.getPaddingRight(), nestedScrollView.getPaddingBottom());
        ComponentLinearLayout componentLinearLayout = binding.t;
        componentLinearLayout.setPadding(componentLinearLayout.getPaddingLeft(), componentLinearLayout.getPaddingTop(), componentLinearLayout.getPaddingRight(), t1wVar.g);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePushSettingsVisible(boolean visible) {
        getBinding().r.setVisibility(visible ? 0 : 8);
        getBinding().q.setVisibility(visible ? 0 : 8);
    }

    private final void updateStatusBarTheme(ThemeType themeType) {
        int t = qje.t(aog0.floatingTitleToolbarCollapsedControlColor, getContext());
        boolean z = (((((float) Color.blue(t)) / 255.0f) * 114.0f) + (((((float) Color.green(t)) / 255.0f) * 587.0f) + ((((float) Color.red(t)) / 255.0f) * 299.0f))) / 1000.0f >= 0.5f;
        if (themeType.f() == z) {
            return;
        }
        ((d2x0) this.systemBarsCoordinator).a(0, qoi0.a(SettingsModalView.class), z);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        animateDismissBackground();
        vnb1.b(getBinding().a, startAction, endAction, false, this.closingNavigationDirection);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        animateShowBackground(0L);
        vnb1.b(this, onAnimateShowStartAction, onAnimateShowEndAction, true, this.openingNavigationDirection);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        updateStatusBarTheme(themeType);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public yar0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dkh0.settings_modal_view, parent, false);
        int i = t7h0.appearance_and_map_divider;
        CardDivider cardDivider = (CardDivider) cma1.O(i, inflate);
        if (cardDivider != null) {
            i = t7h0.appearance_and_map_title;
            ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
            if (listTitleComponent != null) {
                i = t7h0.dark_theme_mode;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
                if (listItemComponent != null) {
                    i = t7h0.dont_call_item;
                    ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, inflate);
                    if (listItemSwitchComponent != null) {
                        i = t7h0.extra_items_layout;
                        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                        if (linearLayout != null) {
                            i = t7h0.geosharing_item;
                            ListItemSwitchComponent listItemSwitchComponent2 = (ListItemSwitchComponent) cma1.O(i, inflate);
                            if (listItemSwitchComponent2 != null) {
                                i = t7h0.haptic_toggle;
                                ListItemSwitchComponent listItemSwitchComponent3 = (ListItemSwitchComponent) cma1.O(i, inflate);
                                if (listItemSwitchComponent3 != null) {
                                    i = t7h0.hide_balance_toggle;
                                    ListItemSwitchComponent listItemSwitchComponent4 = (ListItemSwitchComponent) cma1.O(i, inflate);
                                    if (listItemSwitchComponent4 != null) {
                                        i = t7h0.inapp_only_item;
                                        ListItemSwitchComponent listItemSwitchComponent5 = (ListItemSwitchComponent) cma1.O(i, inflate);
                                        if (listItemSwitchComponent5 != null) {
                                            i = t7h0.lang;
                                            ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                            if (listItemComponent2 != null) {
                                                i = t7h0.location_diagnostic_switch;
                                                ListItemSwitchComponent listItemSwitchComponent6 = (ListItemSwitchComponent) cma1.O(i, inflate);
                                                if (listItemSwitchComponent6 != null) {
                                                    i = t7h0.logout_container;
                                                    AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) cma1.O(i, inflate);
                                                    if (autoDividerComponentList != null) {
                                                        i = t7h0.logout_divider;
                                                        CardDivider cardDivider2 = (CardDivider) cma1.O(i, inflate);
                                                        if (cardDivider2 != null) {
                                                            i = t7h0.logout_item;
                                                            ListItemComponent listItemComponent3 = (ListItemComponent) cma1.O(i, inflate);
                                                            if (listItemComponent3 != null) {
                                                                i = t7h0.more_push_settings;
                                                                ListItemComponent listItemComponent4 = (ListItemComponent) cma1.O(i, inflate);
                                                                if (listItemComponent4 != null) {
                                                                    i = t7h0.promo_pushes_item;
                                                                    ListItemSwitchComponent listItemSwitchComponent7 = (ListItemSwitchComponent) cma1.O(i, inflate);
                                                                    if (listItemSwitchComponent7 != null) {
                                                                        i = t7h0.push_settings_container;
                                                                        AutoDividerComponentList autoDividerComponentList2 = (AutoDividerComponentList) cma1.O(i, inflate);
                                                                        if (autoDividerComponentList2 != null) {
                                                                            i = t7h0.push_settings_divider;
                                                                            CardDivider cardDivider3 = (CardDivider) cma1.O(i, inflate);
                                                                            if (cardDivider3 != null) {
                                                                                i = t7h0.push_settings_section_title;
                                                                                ListTitleComponent listTitleComponent2 = (ListTitleComponent) cma1.O(i, inflate);
                                                                                if (listTitleComponent2 != null) {
                                                                                    i = t7h0.settings_container;
                                                                                    ComponentLinearLayout componentLinearLayout = (ComponentLinearLayout) cma1.O(i, inflate);
                                                                                    if (componentLinearLayout != null) {
                                                                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                                                                        i = t7h0.settings_scroll_view;
                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) cma1.O(i, inflate);
                                                                                        if (nestedScrollView != null) {
                                                                                            i = t7h0.show_traffic_item;
                                                                                            ListItemSwitchComponent listItemSwitchComponent8 = (ListItemSwitchComponent) cma1.O(i, inflate);
                                                                                            if (listItemSwitchComponent8 != null) {
                                                                                                i = t7h0.sms_item;
                                                                                                ListItemSwitchComponent listItemSwitchComponent9 = (ListItemSwitchComponent) cma1.O(i, inflate);
                                                                                                if (listItemSwitchComponent9 != null) {
                                                                                                    i = t7h0.toolbar;
                                                                                                    FloatingTitleToolbarComponent floatingTitleToolbarComponent = (FloatingTitleToolbarComponent) cma1.O(i, inflate);
                                                                                                    if (floatingTitleToolbarComponent != null) {
                                                                                                        i = t7h0.use_inapp_calls_item;
                                                                                                        ListItemComponent listItemComponent5 = (ListItemComponent) cma1.O(i, inflate);
                                                                                                        if (listItemComponent5 != null) {
                                                                                                            i = t7h0.user_profile;
                                                                                                            ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
                                                                                                            if (viewStub != null) {
                                                                                                                return new yar0(frameLayout, cardDivider, listTitleComponent, listItemComponent, listItemSwitchComponent, linearLayout, listItemSwitchComponent2, listItemSwitchComponent3, listItemSwitchComponent4, listItemSwitchComponent5, listItemComponent2, listItemSwitchComponent6, autoDividerComponentList, cardDivider2, listItemComponent3, listItemComponent4, listItemSwitchComponent7, autoDividerComponentList2, cardDivider3, listTitleComponent2, componentLinearLayout, nestedScrollView, listItemSwitchComponent8, listItemSwitchComponent9, floatingTitleToolbarComponent, listItemComponent5, viewStub);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new quq0(3, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.supressStateBarVisible = this.stateBarVisibilitySuppressorRepository.a(this);
        initLayout();
        wbr0 wbr0Var = this.presenter;
        var0 var0Var = new var0(this);
        wbr0Var.Bg(var0Var);
        tje.N(wbr0Var.Jg(), null, null, new SettingsPresenter$attachView$$inlined$safeCollectIn$1(wbr0Var.T.a(), null, var0Var), 3);
        ney neyVar = this.lifecycleObservable;
        xar0 xar0Var = this.lifecycleObserver;
        neyVar.b(xar0Var, xar0Var);
        updateStatusBarTheme(this.themeSwitcherProvider.getThemeType());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.supressStateBarVisible;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.presenter.Cg();
        this.lifecycleObservable.d(this.lifecycleObserver);
        this.pushSystemDisabledView = null;
        ((d2x0) this.systemBarsCoordinator).b(qoi0.a(SettingsModalView.class));
    }
}
