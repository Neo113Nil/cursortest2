package com.yandex.go.ultima_mode.profile.mvp;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import androidx.core.view.b;
import com.adjust.sdk.Constants;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeView;
import com.yandex.go.ultima_mode.ui.header.UltimaModeHeaderView;
import com.yandex.go.ultima_mode.ui.progress_bar.UltimaModeProgressBarView;
import defpackage.ahf0;
import defpackage.cma1;
import defpackage.ehf0;
import defpackage.exu0;
import defpackage.gdc;
import defpackage.ilh0;
import defpackage.mqg0;
import defpackage.nqs0;
import defpackage.nrt;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.qg;
import defpackage.qje;
import defpackage.r0d0;
import defpackage.rqs0;
import defpackage.sls;
import defpackage.sss0;
import defpackage.swg0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tss0;
import defpackage.tu11;
import defpackage.ugf0;
import defpackage.vgf0;
import defpackage.wss0;
import defpackage.x4e;
import defpackage.xgf0;
import defpackage.xss0;
import defpackage.y5e;
import defpackage.y8h0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00019B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\f*\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\f*\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010\u000eJ\u000f\u0010$\u001a\u00020\fH\u0014¢\u0006\u0004\b$\u0010\u000eJ\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106¨\u0006:"}, d2 = {"Lcom/yandex/go/ultima_mode/profile/mvp/ProfileUltimaModeView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lexu0;", "styleDelegate", "Lcom/yandex/go/ultima_mode/profile/mvp/a;", "presenter", "Lugf0;", "dependencies", "<init>", "(Landroid/content/Context;Lexu0;Lcom/yandex/go/ultima_mode/profile/mvp/a;Lugf0;)V", "Lzy11;", "renderEmptyState", "()V", "Lxgf0;", "uiState", "renderContentState", "(Lxgf0;)V", "Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;", "createSlot", "()Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;", "Lxss0;", "slotItemUiState", "Lkotlin/Function0;", "analyticsCallback", "render", "(Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;Lxss0;Lsls;)V", "Ltss0;", "trail", "updateTrailIfSwitch", "(Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;Ltss0;)V", "", "getUltimaStyle", "()I", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lexu0;", "Lcom/yandex/go/ultima_mode/profile/mvp/a;", "Lugf0;", "Lvgf0;", "binding", "Lvgf0;", "Landroid/view/ContextThemeWrapper;", "slotThemeWrapper", "Landroid/view/ContextThemeWrapper;", "Lqg;", "toggleAccessibilityDelegate", "Lqg;", "plusView", "Lcom/yandex/go/slot/ui/view/SlotItemViewComponent;", "conciergeView", "ultimaToggleView", "ehf0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProfileUltimaModeView extends GoLinearLayout {
    private final vgf0 binding;
    private SlotItemViewComponent conciergeView;
    private final ugf0 dependencies;
    private SlotItemViewComponent plusView;
    private final a presenter;
    private final ContextThemeWrapper slotThemeWrapper;
    private final exu0 styleDelegate;
    private final qg toggleAccessibilityDelegate;
    private SlotItemViewComponent ultimaToggleView;

    public ProfileUltimaModeView(Context context, exu0 exu0Var, a aVar, ugf0 ugf0Var) {
        super(context, null, 0, 0, 8, null);
        this.styleDelegate = exu0Var;
        this.presenter = aVar;
        this.dependencies = ugf0Var;
        LayoutInflater.from(context).inflate(ilh0.profile_ultima_mode_layout, this);
        int i = y8h0.header;
        UltimaModeHeaderView ultimaModeHeaderView = (UltimaModeHeaderView) cma1.O(i, this);
        if (ultimaModeHeaderView != null) {
            i = y8h0.progress_bar;
            UltimaModeProgressBarView ultimaModeProgressBarView = (UltimaModeProgressBarView) cma1.O(i, this);
            if (ultimaModeProgressBarView != null) {
                i = y8h0.ultima_card;
                GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
                if (goLinearLayout != null) {
                    i = y8h0.ultima_card_slot_list;
                    AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) cma1.O(i, this);
                    if (autoDividerComponentList != null) {
                        this.binding = new vgf0(this, ultimaModeHeaderView, ultimaModeProgressBarView, goLinearLayout, autoDividerComponentList);
                        this.slotThemeWrapper = new ContextThemeWrapper(context, getUltimaStyle());
                        this.toggleAccessibilityDelegate = new qg();
                        SlotItemViewComponent createSlot = createSlot();
                        this.plusView = createSlot;
                        autoDividerComponentList.addView(createSlot);
                        SlotItemViewComponent createSlot2 = createSlot();
                        this.conciergeView = createSlot2;
                        autoDividerComponentList.addView(createSlot2);
                        SlotItemViewComponent createSlot3 = createSlot();
                        this.ultimaToggleView = createSlot3;
                        autoDividerComponentList.addView(createSlot3);
                        setVisibility(8);
                        goLinearLayout.setBackgroundResource(swg0.bg_rounded_20_ultima);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final SlotItemViewComponent createSlot() {
        SlotItemViewComponent slotItemViewComponent = new SlotItemViewComponent(this.slotThemeWrapper, null, 0, this.dependencies.a, 6, null);
        slotItemViewComponent.setVisibility(8);
        slotItemViewComponent.setColor(new gdc(mqg0.transparent));
        return slotItemViewComponent;
    }

    private final int getUltimaStyle() {
        return ((nrt) this.styleDelegate).b(qje.X(getContext()), "ultima").b;
    }

    private final void render(final SlotItemViewComponent slotItemViewComponent, xss0 xss0Var, final sls slsVar) {
        if (xss0Var != null) {
            tss0 tss0Var = xss0Var.c;
            if (!xss0Var.equals(xss0.f)) {
                slotItemViewComponent.setVisibility(0);
                slotItemViewComponent.renderLead(xss0Var.a);
                slotItemViewComponent.renderBody(xss0Var.b);
                slotItemViewComponent.renderTrail(tss0Var, new ahf0(this, slsVar, 0));
                slotItemViewComponent.setAction(xss0Var.d, new rqs0() { // from class: bhf0
                    @Override // defpackage.rqs0
                    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
                        ProfileUltimaModeView.render$lambda$1(ProfileUltimaModeView.this, slotItemViewComponent, slsVar, nqs0Var, wss0Var);
                    }
                });
                slotItemViewComponent.setSize(xss0Var.e);
                updateTrailIfSwitch(slotItemViewComponent, tss0Var);
                return;
            }
        }
        slotItemViewComponent.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$0(ProfileUltimaModeView profileUltimaModeView, sls slsVar, nqs0 nqs0Var, wss0 wss0Var) {
        profileUltimaModeView.presenter.Kg(nqs0Var);
        slsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$1(ProfileUltimaModeView profileUltimaModeView, SlotItemViewComponent slotItemViewComponent, sls slsVar, nqs0 nqs0Var, wss0 wss0Var) {
        profileUltimaModeView.presenter.Kg(nqs0Var);
        slotItemViewComponent.toggleSwitchTrail();
        SwitchComponent switchComponent = (SwitchComponent) slotItemViewComponent.getTrailViewAs(SwitchComponent.class);
        if (switchComponent != null) {
            profileUltimaModeView.toggleAccessibilityDelegate.a = switchComponent.getIsChecked();
        }
        slsVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderContentState(final xgf0 uiState) {
        final int i = 0;
        setVisibility(0);
        vgf0 vgf0Var = this.binding;
        final int i2 = 1;
        vgf0Var.b.render(uiState.a, new tls(this) { // from class: chf0
            public final /* synthetic */ ProfileUltimaModeView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 renderContentState$lambda$0$0;
                zy11 renderContentState$lambda$0$1;
                int i3 = i;
                ProfileUltimaModeView profileUltimaModeView = this.b;
                nqs0 nqs0Var = (nqs0) obj;
                switch (i3) {
                    case 0:
                        renderContentState$lambda$0$0 = ProfileUltimaModeView.renderContentState$lambda$0$0(profileUltimaModeView, nqs0Var);
                        return renderContentState$lambda$0$0;
                    default:
                        renderContentState$lambda$0$1 = ProfileUltimaModeView.renderContentState$lambda$0$1(profileUltimaModeView, nqs0Var);
                        return renderContentState$lambda$0$1;
                }
            }
        }, new tls(this) { // from class: chf0
            public final /* synthetic */ ProfileUltimaModeView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 renderContentState$lambda$0$0;
                zy11 renderContentState$lambda$0$1;
                int i3 = i2;
                ProfileUltimaModeView profileUltimaModeView = this.b;
                nqs0 nqs0Var = (nqs0) obj;
                switch (i3) {
                    case 0:
                        renderContentState$lambda$0$0 = ProfileUltimaModeView.renderContentState$lambda$0$0(profileUltimaModeView, nqs0Var);
                        return renderContentState$lambda$0$0;
                    default:
                        renderContentState$lambda$0$1 = ProfileUltimaModeView.renderContentState$lambda$0$1(profileUltimaModeView, nqs0Var);
                        return renderContentState$lambda$0$1;
                }
            }
        });
        vgf0Var.c.render(uiState.b);
        render(this.plusView, uiState.c, new sls(this) { // from class: dhf0
            public final /* synthetic */ ProfileUltimaModeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 renderContentState$lambda$1;
                zy11 renderContentState$lambda$2;
                int i3 = i;
                xgf0 xgf0Var = uiState;
                ProfileUltimaModeView profileUltimaModeView = this.b;
                switch (i3) {
                    case 0:
                        renderContentState$lambda$1 = ProfileUltimaModeView.renderContentState$lambda$1(profileUltimaModeView, xgf0Var);
                        return renderContentState$lambda$1;
                    default:
                        renderContentState$lambda$2 = ProfileUltimaModeView.renderContentState$lambda$2(profileUltimaModeView, xgf0Var);
                        return renderContentState$lambda$2;
                }
            }
        });
        render(this.conciergeView, uiState.d, new sls(this) { // from class: dhf0
            public final /* synthetic */ ProfileUltimaModeView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 renderContentState$lambda$1;
                zy11 renderContentState$lambda$2;
                int i3 = i2;
                xgf0 xgf0Var = uiState;
                ProfileUltimaModeView profileUltimaModeView = this.b;
                switch (i3) {
                    case 0:
                        renderContentState$lambda$1 = ProfileUltimaModeView.renderContentState$lambda$1(profileUltimaModeView, xgf0Var);
                        return renderContentState$lambda$1;
                    default:
                        renderContentState$lambda$2 = ProfileUltimaModeView.renderContentState$lambda$2(profileUltimaModeView, xgf0Var);
                        return renderContentState$lambda$2;
                }
            }
        });
        render(this.ultimaToggleView, uiState.e, new r0d0(26, this));
        b.p(this.ultimaToggleView, this.toggleAccessibilityDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContentState$lambda$0$0(ProfileUltimaModeView profileUltimaModeView, nqs0 nqs0Var) {
        o7r0 o7r0Var = profileUltimaModeView.presenter.C;
        String str = nqs0Var instanceof tu11 ? ((tu11) nqs0Var).b : null;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(Constants.DEEPLINK, str);
        }
        o7r0Var.a.a("UltimaMode.ProfileCard.Subtitle.Tapped", hashMap, 1, new HashMap());
        profileUltimaModeView.presenter.Kg(nqs0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContentState$lambda$0$1(ProfileUltimaModeView profileUltimaModeView, nqs0 nqs0Var) {
        o7r0 o7r0Var = profileUltimaModeView.presenter.C;
        String str = nqs0Var instanceof tu11 ? ((tu11) nqs0Var).b : null;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(Constants.DEEPLINK, str);
        }
        o7r0Var.a.a("UltimaMode.ProfileCard.TitleTrail.Tapped", hashMap, 1, new HashMap());
        profileUltimaModeView.presenter.Kg(nqs0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContentState$lambda$1(ProfileUltimaModeView profileUltimaModeView, xgf0 xgf0Var) {
        a aVar = profileUltimaModeView.presenter;
        xss0 xss0Var = xgf0Var.c;
        nqs0 nqs0Var = xss0Var != null ? xss0Var.d : null;
        o7r0 o7r0Var = aVar.C;
        String str = nqs0Var instanceof tu11 ? ((tu11) nqs0Var).b : null;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(Constants.DEEPLINK, str);
        }
        o7r0Var.a.a("UltimaMode.ProfileCard.PlusSlot.Tapped", hashMap, 1, new HashMap());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContentState$lambda$2(ProfileUltimaModeView profileUltimaModeView, xgf0 xgf0Var) {
        a aVar = profileUltimaModeView.presenter;
        xss0 xss0Var = xgf0Var.d;
        nqs0 nqs0Var = xss0Var != null ? xss0Var.d : null;
        o7r0 o7r0Var = aVar.C;
        String str = nqs0Var instanceof tu11 ? ((tu11) nqs0Var).b : null;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(Constants.DEEPLINK, str);
        }
        o7r0Var.a.a("UltimaMode.ProfileCard.ConciergeSlot.Tapped", hashMap, 1, new HashMap());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContentState$lambda$3(ProfileUltimaModeView profileUltimaModeView) {
        a aVar = profileUltimaModeView.presenter;
        SwitchComponent switchComponent = (SwitchComponent) profileUltimaModeView.ultimaToggleView.getTrailViewAs(SwitchComponent.class);
        boolean isChecked = switchComponent != null ? switchComponent.getIsChecked() : false;
        o7r0 o7r0Var = aVar.C;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        o7r0Var.a.a("UltimaMode.ProfileCard.ModeSwitcher.Changed", hashMap, 1, x4e.r(isChecked, hashMap, "value"));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderEmptyState() {
        setVisibility(8);
    }

    private final void updateTrailIfSwitch(SlotItemViewComponent slotItemViewComponent, tss0 tss0Var) {
        sss0 sss0Var = tss0Var instanceof sss0 ? (sss0) tss0Var : null;
        if (sss0Var == null) {
            return;
        }
        boolean z = sss0Var.a;
        slotItemViewComponent.setSwitchTrailChecked(z);
        this.toggleAccessibilityDelegate.a = z;
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        y5e.Q(this.slotThemeWrapper, getUltimaStyle());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        ehf0 ehf0Var = new ehf0(this);
        aVar.Bg(ehf0Var);
        tje.N(aVar.Jg(), null, null, new ProfileUltimaModeViewPresenter$attachView$1(aVar, ehf0Var, null), 3);
        o7r0 o7r0Var = this.presenter.C;
        o7r0Var.getClass();
        o7r0Var.a.a("UltimaMode.ProfileCard.Shown", new HashMap(), 1, new HashMap());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
