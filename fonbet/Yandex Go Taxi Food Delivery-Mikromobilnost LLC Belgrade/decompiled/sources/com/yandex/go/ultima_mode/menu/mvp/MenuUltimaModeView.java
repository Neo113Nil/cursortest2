package com.yandex.go.ultima_mode.menu.mvp;

import android.content.Context;
import android.view.LayoutInflater;
import com.adjust.sdk.Constants;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeView;
import com.yandex.go.ultima_mode.ui.header.UltimaModeHeaderView;
import com.yandex.go.ultima_mode.ui.progress_bar.UltimaModeProgressBarView;
import defpackage.cma1;
import defpackage.ilh0;
import defpackage.nn10;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.pn10;
import defpackage.swg0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn10;
import defpackage.tu11;
import defpackage.vn10;
import defpackage.vu11;
import defpackage.y8h0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/ultima_mode/menu/mvp/MenuUltimaModeView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lvn10;", "presenter", "<init>", "(Landroid/content/Context;Lvn10;)V", "Lpn10;", "uiState", "Lzy11;", "renderContent", "(Lpn10;)V", "renderEmpty", "()V", "", "textAccessibility", "setCardAccessibility", "(Ljava/lang/String;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lvn10;", "Lnn10;", "binding", "Lnn10;", "tn10", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MenuUltimaModeView extends GoLinearLayout {
    private final nn10 binding;
    private final vn10 presenter;

    public MenuUltimaModeView(Context context, vn10 vn10Var) {
        super(context, null, 0, 0, 8, null);
        this.presenter = vn10Var;
        LayoutInflater.from(context).inflate(ilh0.menu_ultima_mode_layout, this);
        int i = y8h0.header;
        UltimaModeHeaderView ultimaModeHeaderView = (UltimaModeHeaderView) cma1.O(i, this);
        if (ultimaModeHeaderView != null) {
            i = y8h0.progress_bar;
            UltimaModeProgressBarView ultimaModeProgressBarView = (UltimaModeProgressBarView) cma1.O(i, this);
            if (ultimaModeProgressBarView != null) {
                i = y8h0.ultima_card;
                GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
                if (goLinearLayout != null) {
                    this.binding = new nn10(this, ultimaModeHeaderView, ultimaModeProgressBarView, goLinearLayout);
                    setVisibility(8);
                    goLinearLayout.setBackgroundResource(swg0.bg_rounded_20_ultima);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderContent(pn10 uiState) {
        final int i = 0;
        setVisibility(0);
        nn10 nn10Var = this.binding;
        setCardAccessibility(uiState.a);
        final int i2 = 1;
        nn10Var.b.render(uiState.b, new tls(this) { // from class: sn10
            public final /* synthetic */ MenuUltimaModeView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 renderContent$lambda$0$0;
                zy11 renderContent$lambda$0$1;
                int i3 = i;
                MenuUltimaModeView menuUltimaModeView = this.b;
                nqs0 nqs0Var = (nqs0) obj;
                switch (i3) {
                    case 0:
                        renderContent$lambda$0$0 = MenuUltimaModeView.renderContent$lambda$0$0(menuUltimaModeView, nqs0Var);
                        return renderContent$lambda$0$0;
                    default:
                        renderContent$lambda$0$1 = MenuUltimaModeView.renderContent$lambda$0$1(menuUltimaModeView, nqs0Var);
                        return renderContent$lambda$0$1;
                }
            }
        }, new tls(this) { // from class: sn10
            public final /* synthetic */ MenuUltimaModeView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 renderContent$lambda$0$0;
                zy11 renderContent$lambda$0$1;
                int i3 = i2;
                MenuUltimaModeView menuUltimaModeView = this.b;
                nqs0 nqs0Var = (nqs0) obj;
                switch (i3) {
                    case 0:
                        renderContent$lambda$0$0 = MenuUltimaModeView.renderContent$lambda$0$0(menuUltimaModeView, nqs0Var);
                        return renderContent$lambda$0$0;
                    default:
                        renderContent$lambda$0$1 = MenuUltimaModeView.renderContent$lambda$0$1(menuUltimaModeView, nqs0Var);
                        return renderContent$lambda$0$1;
                }
            }
        });
        nn10Var.c.render(uiState.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContent$lambda$0$0(MenuUltimaModeView menuUltimaModeView, nqs0 nqs0Var) {
        vn10 vn10Var = menuUltimaModeView.presenter;
        vn10Var.getClass();
        boolean z = nqs0Var instanceof vu11;
        vu11 vu11Var = z ? (vu11) nqs0Var : null;
        if (vu11Var != null) {
            o7r0 o7r0Var = vn10Var.B;
            String str = vu11Var instanceof tu11 ? ((tu11) vu11Var).b : null;
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put(Constants.DEEPLINK, str);
            }
            o7r0Var.a.a("UltimaMode.MenuCard.Subtitle.Tapped", hashMap, 1, new HashMap());
        }
        vn10 vn10Var2 = menuUltimaModeView.presenter;
        vn10Var2.getClass();
        vu11 vu11Var2 = z ? (vu11) nqs0Var : null;
        if (vu11Var2 != null) {
            tje.N(vn10Var2.Jg(), null, null, new MenuUltimaModeViewPresenter$handleAction$1(vn10Var2, vu11Var2, null), 3);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContent$lambda$0$1(MenuUltimaModeView menuUltimaModeView, nqs0 nqs0Var) {
        vn10 vn10Var = menuUltimaModeView.presenter;
        vn10Var.getClass();
        boolean z = nqs0Var instanceof vu11;
        vu11 vu11Var = z ? (vu11) nqs0Var : null;
        if (vu11Var != null) {
            o7r0 o7r0Var = vn10Var.B;
            String str = vu11Var instanceof tu11 ? ((tu11) vu11Var).b : null;
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put(Constants.DEEPLINK, str);
            }
            o7r0Var.a.a("UltimaMode.MenuCard.TitleTrail.Tapped", hashMap, 1, new HashMap());
        }
        vn10 vn10Var2 = menuUltimaModeView.presenter;
        vn10Var2.getClass();
        vu11 vu11Var2 = z ? (vu11) nqs0Var : null;
        if (vu11Var2 != null) {
            tje.N(vn10Var2.Jg(), null, null, new MenuUltimaModeViewPresenter$handleAction$1(vn10Var2, vu11Var2, null), 3);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderEmpty() {
        setVisibility(8);
    }

    private final void setCardAccessibility(String textAccessibility) {
        this.binding.d.setContentDescription(textAccessibility);
        this.binding.d.setImportantForAccessibility(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vn10 vn10Var = this.presenter;
        tn10 tn10Var = new tn10(this);
        vn10Var.Bg(tn10Var);
        tje.N(vn10Var.Jg(), null, null, new MenuUltimaModeViewPresenter$attachView$1(vn10Var, tn10Var, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
