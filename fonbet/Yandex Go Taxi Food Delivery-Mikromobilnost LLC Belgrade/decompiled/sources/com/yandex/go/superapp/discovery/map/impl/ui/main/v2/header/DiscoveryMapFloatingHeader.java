package com.yandex.go.superapp.discovery.map.impl.ui.main.v2.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.address.models.Address;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.header.DiscoveryMapFloatingHeader;
import defpackage.bk10;
import defpackage.f8w0;
import defpackage.hxx;
import defpackage.i8h0;
import defpackage.m950;
import defpackage.otj;
import defpackage.pep0;
import defpackage.ptj;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.qtj;
import defpackage.rp31;
import defpackage.skh0;
import defpackage.sls;
import defpackage.sug0;
import defpackage.tje;
import defpackage.u9w0;
import defpackage.xng0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewBottomRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B+\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/v2/header/DiscoveryMapFloatingHeader;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Lotj;", "Landroid/content/Context;", "context", "Lptj;", "presenter", "Lf8w0;", "headerLogoDelegate", "Lpwy0;", "themeSwitcherProvider", "<init>", "(Landroid/content/Context;Lptj;Lf8w0;Lpwy0;)V", "Lzy11;", "updateLogoDrawable", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lqtj;", "uiState", "render", "(Lqtj;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lptj;", "Lf8w0;", "Lpwy0;", "Lru/yandex/taxi/settings/MainMenuButton;", "mainMenuButton", "Lru/yandex/taxi/settings/MainMenuButton;", "Lcom/yandex/go/design/view/GoImageView;", "logoView", "Lcom/yandex/go/design/view/GoImageView;", "ntj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DiscoveryMapFloatingHeader extends GoConstraintLayout implements otj {
    private final f8w0 headerLogoDelegate;
    private final GoImageView logoView;
    private final MainMenuButton mainMenuButton;
    private final ptj presenter;
    private final pwy0 themeSwitcherProvider;

    public DiscoveryMapFloatingHeader(Context context, ptj ptjVar, f8w0 f8w0Var, pwy0 pwy0Var) {
        super(context, null, 0, 0, 14, null);
        this.presenter = ptjVar;
        this.headerLogoDelegate = f8w0Var;
        this.themeSwitcherProvider = pwy0Var;
        final int i = 1;
        LayoutInflater.from(context).inflate(skh0.discovery_map_floating_header, (ViewGroup) this, true);
        setMinimumHeight(getResources().getDimensionPixelSize(sug0.super_app_main_screen_header_height));
        setBackgroundColor(qje.t(xng0.bgMain, context));
        final int i2 = 0;
        setClipChildren(false);
        setClipToPadding(false);
        setClipToOutline(false);
        setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(tje.u(24, getContext())));
        setClipToOutline(true);
        int i3 = i8h0.menu_button;
        WeakHashMap weakHashMap = b.a;
        MainMenuButton mainMenuButton = (MainMenuButton) ((View) rp31.d(this, i3));
        this.mainMenuButton = mainMenuButton;
        GoImageView goImageView = (GoImageView) ((View) rp31.d(this, i8h0.logo_view));
        this.logoView = goImageView;
        c.z(new sls(this) { // from class: mtj
            public final /* synthetic */ DiscoveryMapFloatingHeader b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i2;
                DiscoveryMapFloatingHeader discoveryMapFloatingHeader = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = DiscoveryMapFloatingHeader._init_$lambda$0(discoveryMapFloatingHeader);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = DiscoveryMapFloatingHeader._init_$lambda$1(discoveryMapFloatingHeader);
                        return _init_$lambda$1;
                }
            }
        }, mainMenuButton);
        c.z(new sls(this) { // from class: mtj
            public final /* synthetic */ DiscoveryMapFloatingHeader b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i4 = i;
                DiscoveryMapFloatingHeader discoveryMapFloatingHeader = this.b;
                switch (i4) {
                    case 0:
                        _init_$lambda$0 = DiscoveryMapFloatingHeader._init_$lambda$0(discoveryMapFloatingHeader);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = DiscoveryMapFloatingHeader._init_$lambda$1(discoveryMapFloatingHeader);
                        return _init_$lambda$1;
                }
            }
        }, goImageView);
        updateLogoDrawable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(DiscoveryMapFloatingHeader discoveryMapFloatingHeader) {
        discoveryMapFloatingHeader.presenter.z.g();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(DiscoveryMapFloatingHeader discoveryMapFloatingHeader) {
        ptj ptjVar = discoveryMapFloatingHeader.presenter;
        if (((SuperAppDiscoveryMapV2Experiment) ptjVar.D.a().c()).d) {
            Address h = ptjVar.C.c().h();
            ((pep0) ptjVar.B).f((m950) ptjVar.A.get(), new u9w0(h), hxx.a);
        }
        return zy11.a;
    }

    private final void updateLogoDrawable() {
        this.logoView.setImageResource(this.headerLogoDelegate.a(this.themeSwitcherProvider.getThemeType() == ThemeType.LIGHT));
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
        updateLogoDrawable();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ptj ptjVar = this.presenter;
        ptjVar.Bg(this);
        tje.N(ptjVar.Jg(), null, null, new DiscoveryMapFloatingHeaderPresenter$attachView$1(ptjVar, this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.eyi0
    public void render(qtj uiState) {
        MainMenuButton mainMenuButton = this.mainMenuButton;
        bk10 bk10Var = uiState.a;
        Drawable f = bk10Var.f();
        if (f == null) {
            mainMenuButton.setMenuIcon(bk10Var.getIcon());
        } else {
            mainMenuButton.setMenuIcon(f);
        }
        bk10Var.getBackground().getClass();
        bk10Var.getBackground().getClass();
        mainMenuButton.setIconBackground(-1, 0);
        mainMenuButton.setIconForeground(bk10Var.a());
    }
}
