package com.yandex.go.safety.center.help;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyButtonType;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallScenario;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallStatus;
import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.help.SafetyCenterHelpView;
import com.yandex.go.safety.center.j;
import defpackage.a60;
import defpackage.bgb0;
import defpackage.i7h0;
import defpackage.iik0;
import defpackage.itl0;
import defpackage.krl0;
import defpackage.kyh0;
import defpackage.lrl0;
import defpackage.mo30;
import defpackage.nrl0;
import defpackage.prl0;
import defpackage.q3h0;
import defpackage.qv10;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.vng;
import defpackage.w511;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0011J\u000f\u0010#\u001a\u00020\u000fH\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000fH\u0014¢\u0006\u0004\b%\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00101R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020>8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/yandex/go/safety/center/help/SafetyCenterHelpView;", "Lcom/yandex/go/safety/center/base/BaseSafetyCenterView;", "Lnrl0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/safety/center/help/e;", "presenter", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/content/Context;Lcom/yandex/go/safety/center/help/e;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;Landroid/app/Activity;)V", "", "shortText", "Lzy11;", "setAddress", "(Ljava/lang/String;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "names", "", "visible", "frauder", "checked", "updateSharingUI", "(Ljava/util/List;ZZZ)V", "errorText", "showError", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/safety/center/help/e;", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "Landroid/app/Activity;", "Landroid/widget/LinearLayout;", "root", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "title", "Lru/yandex/taxi/design/ListItemComponent;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "address", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "sharingSwitch", "Lru/yandex/taxi/design/ListItemSwitchComponent;", "addContacts", "Lru/yandex/taxi/design/ButtonComponent;", "callButton", "Lru/yandex/taxi/design/ButtonComponent;", "contactFamily", "divider", "Landroid/view/View;", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterHelpView extends BaseSafetyCenterView implements nrl0 {
    private final Activity activity;
    private final ListItemComponent addContacts;
    private final ListItemComponent address;
    private final ButtonComponent callButton;
    private final ButtonComponent contactFamily;
    private final ListItemComponent description;
    private final View divider;
    private final SafetyCenterExperiment experiment;
    private final e presenter;
    private final LinearLayout root;
    private final ListItemSwitchComponent sharingSwitch;
    private final ListItemComponent title;
    private final ToolbarComponent toolbar;

    public SafetyCenterHelpView(Context context, e eVar, SafetyCenterExperiment safetyCenterExperiment, Activity activity) {
        super(context, eVar);
        this.presenter = eVar;
        this.experiment = safetyCenterExperiment;
        this.activity = activity;
        int i = i7h0.root;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.root = (LinearLayout) ((View) rp31.d(this, i));
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, i7h0.safety_center_toolbar));
        this.toolbar = toolbarComponent;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, i7h0.safety_center_title));
        this.title = listItemComponent;
        ListItemComponent listItemComponent2 = (ListItemComponent) ((View) rp31.d(this, i7h0.safety_center_description));
        this.description = listItemComponent2;
        ListItemComponent listItemComponent3 = (ListItemComponent) ((View) rp31.d(this, i7h0.safety_center_address));
        this.address = listItemComponent3;
        ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) ((View) rp31.d(this, i7h0.safety_center_sharing));
        this.sharingSwitch = listItemSwitchComponent;
        ListItemComponent listItemComponent4 = (ListItemComponent) ((View) rp31.d(this, i7h0.safety_center_add_contacts));
        this.addContacts = listItemComponent4;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, i7h0.safety_center_call));
        this.callButton = buttonComponent;
        ButtonComponent buttonComponent2 = (ButtonComponent) ((View) rp31.d(this, i7h0.safety_center_notify_family));
        this.contactFamily = buttonComponent2;
        this.divider = (View) rp31.d(this, i7h0.safety_center_big_divider);
        listItemComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_TITLE));
        listItemComponent2.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_DESCRIPTION));
        buttonComponent.setText(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_CALL_EMERGENCY_LINK_TITLE));
        listItemComponent3.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_LOCATION_TITLE));
        buttonComponent2.setText(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_NOTIFY_CONTACTS_MANUALLY_LINK_TITLE));
        listItemComponent4.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_ADD_CONTACTS_LINK_TITLE));
        listItemSwitchComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_NOTIFY_CONTACTS_LINK_TITLE));
        final int i2 = 0;
        toolbarComponent.setOnNavigationClickListener(new Runnable(this) { // from class: srl0
            public final /* synthetic */ SafetyCenterHelpView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                SafetyCenterHelpView safetyCenterHelpView = this.b;
                switch (i3) {
                    case 0:
                        SafetyCenterHelpView._init_$lambda$0(safetyCenterHelpView);
                        break;
                    case 1:
                        SafetyCenterHelpView._init_$lambda$1(safetyCenterHelpView);
                        break;
                    case 2:
                        SafetyCenterHelpView._init_$lambda$2(safetyCenterHelpView);
                        break;
                    case 3:
                        SafetyCenterHelpView._init_$lambda$3(safetyCenterHelpView);
                        break;
                    default:
                        SafetyCenterHelpView._init_$lambda$4(safetyCenterHelpView);
                        break;
                }
            }
        });
        final int i3 = 1;
        listItemComponent4.setDebounceClickListener(new Runnable(this) { // from class: srl0
            public final /* synthetic */ SafetyCenterHelpView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                SafetyCenterHelpView safetyCenterHelpView = this.b;
                switch (i32) {
                    case 0:
                        SafetyCenterHelpView._init_$lambda$0(safetyCenterHelpView);
                        break;
                    case 1:
                        SafetyCenterHelpView._init_$lambda$1(safetyCenterHelpView);
                        break;
                    case 2:
                        SafetyCenterHelpView._init_$lambda$2(safetyCenterHelpView);
                        break;
                    case 3:
                        SafetyCenterHelpView._init_$lambda$3(safetyCenterHelpView);
                        break;
                    default:
                        SafetyCenterHelpView._init_$lambda$4(safetyCenterHelpView);
                        break;
                }
            }
        });
        final int i4 = 2;
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: srl0
            public final /* synthetic */ SafetyCenterHelpView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                SafetyCenterHelpView safetyCenterHelpView = this.b;
                switch (i32) {
                    case 0:
                        SafetyCenterHelpView._init_$lambda$0(safetyCenterHelpView);
                        break;
                    case 1:
                        SafetyCenterHelpView._init_$lambda$1(safetyCenterHelpView);
                        break;
                    case 2:
                        SafetyCenterHelpView._init_$lambda$2(safetyCenterHelpView);
                        break;
                    case 3:
                        SafetyCenterHelpView._init_$lambda$3(safetyCenterHelpView);
                        break;
                    default:
                        SafetyCenterHelpView._init_$lambda$4(safetyCenterHelpView);
                        break;
                }
            }
        });
        final int i5 = 3;
        buttonComponent2.setDebounceClickListener(new Runnable(this) { // from class: srl0
            public final /* synthetic */ SafetyCenterHelpView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i5;
                SafetyCenterHelpView safetyCenterHelpView = this.b;
                switch (i32) {
                    case 0:
                        SafetyCenterHelpView._init_$lambda$0(safetyCenterHelpView);
                        break;
                    case 1:
                        SafetyCenterHelpView._init_$lambda$1(safetyCenterHelpView);
                        break;
                    case 2:
                        SafetyCenterHelpView._init_$lambda$2(safetyCenterHelpView);
                        break;
                    case 3:
                        SafetyCenterHelpView._init_$lambda$3(safetyCenterHelpView);
                        break;
                    default:
                        SafetyCenterHelpView._init_$lambda$4(safetyCenterHelpView);
                        break;
                }
            }
        });
        final int i6 = 4;
        listItemSwitchComponent.setDebounceClickListener(new Runnable(this) { // from class: srl0
            public final /* synthetic */ SafetyCenterHelpView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i6;
                SafetyCenterHelpView safetyCenterHelpView = this.b;
                switch (i32) {
                    case 0:
                        SafetyCenterHelpView._init_$lambda$0(safetyCenterHelpView);
                        break;
                    case 1:
                        SafetyCenterHelpView._init_$lambda$1(safetyCenterHelpView);
                        break;
                    case 2:
                        SafetyCenterHelpView._init_$lambda$2(safetyCenterHelpView);
                        break;
                    case 3:
                        SafetyCenterHelpView._init_$lambda$3(safetyCenterHelpView);
                        break;
                    default:
                        SafetyCenterHelpView._init_$lambda$4(safetyCenterHelpView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SafetyCenterHelpView safetyCenterHelpView) {
        safetyCenterHelpView.presenter.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SafetyCenterHelpView safetyCenterHelpView) {
        e eVar = safetyCenterHelpView.presenter;
        krl0 krl0Var = eVar.I;
        iik0 iik0Var = new iik0(20, eVar);
        lrl0 lrl0Var = (lrl0) krl0Var.b;
        lrl0Var.A(lrl0Var.I, (itl0) krl0Var.a, new mo30(23, iik0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SafetyCenterHelpView safetyCenterHelpView) {
        String str;
        e eVar = safetyCenterHelpView.presenter;
        com.yandex.go.safety.center.analytics.a aVar = eVar.J;
        SafetyCenterExperiment safetyCenterExperiment = eVar.A;
        tje.N(eVar.Jg(), null, null, new SafetyCenterHelpPresenter$sendSosInformation$1(eVar, null), 3);
        j jVar = eVar.z;
        SafetyCenterConfig d = jVar.d();
        if (d == null || (str = d.b) == null) {
            str = safetyCenterExperiment.g.a;
        }
        bgb0.j(((a60) eVar.E).a, str);
        int i = prl0.a[safetyCenterExperiment.e.c.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2 || i == 3) {
                z = false;
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                z = eVar.Lg();
            }
        }
        if (z || eVar.Lg()) {
            SafetyCenterExperiment.EmergencyTicket emergencyTicket = safetyCenterExperiment.e;
            int i2 = emergencyTicket.b;
            int i3 = emergencyTicket.a;
            aVar.d(SafetyCenterAnalytics$EmergencyCallStatus.WaitForAnswer, SafetyCenterAnalytics$EmergencyCallScenario.Emergency);
            tje.N(eVar.Jg(), null, null, new SafetyCenterHelpPresenter$checkThatUserMakesCall$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.X(eVar.Mg(i2, false), new SafetyCenterHelpPresenter$checkThatUserMakesCall$$inlined$flatMapLatest$1(null, eVar, i3)), null, eVar), 3);
        }
        aVar.e(jVar.f().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(SafetyCenterHelpView safetyCenterHelpView) {
        e eVar = safetyCenterHelpView.presenter;
        eVar.getClass();
        eVar.Ng(false, false, ShareRequestParam.NotificationType.CONTACT_REQUEST);
        eVar.J.a.a(SafetyCenterAnalytics$EmergencyButtonType.WriteToContacts, Integer.valueOf(eVar.z.f().size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(SafetyCenterHelpView safetyCenterHelpView) {
        e eVar = safetyCenterHelpView.presenter;
        j jVar = eVar.z;
        r0 r0Var = jVar.p;
        r0 r0Var2 = jVar.q;
        qv10.B(!((Boolean) r0Var2.getValue()).booleanValue(), r0Var, null);
        jVar.m.u("need_share_location_key", ((Boolean) r0Var2.getValue()).booleanValue());
        eVar.J.c(((Boolean) r0Var2.getValue()).booleanValue());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.address.setTrailImage(vng.t(q3h0.location_btn, getContext()));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.root;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tjh0.safety_center_help_view;
    }

    @Override // com.yandex.go.safety.center.base.BaseSafetyCenterView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
    }

    @Override // com.yandex.go.safety.center.base.BaseSafetyCenterView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // defpackage.nrl0
    public void setAddress(String shortText) {
        this.address.setTitle(shortText);
    }

    @Override // defpackage.nrl0
    public void showError(String errorText) {
        new AlertDialog(this.activity).setMessage(errorText).setPositiveButton(kyh0.common_ok).show();
    }

    @Override // defpackage.nrl0
    public void updateSharingUI(List<String> names, boolean visible, boolean frauder, boolean checked) {
        boolean z = visible && !frauder;
        this.sharingSwitch.setSubtitle(kotlin.collections.a.X(names, null, null, null, null, 63));
        this.sharingSwitch.setCheckedWithAnimation(checked);
        this.sharingSwitch.setVisibility((!z || names.isEmpty()) ? 8 : 0);
        this.divider.setVisibility(z ? 0 : 8);
        this.addContacts.setVisibility(z ? 0 : 8);
        if (z) {
            this.addContacts.setTitle(this.experiment.a(!names.isEmpty() ? SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_LINK_TITLE : SafetyCenterExperiment.L10nKey.EMERGENCY_SCREEN_ADD_CONTACTS_LINK_TITLE));
        }
        this.contactFamily.setVisibility((visible && frauder) ? 0 : 8);
    }
}
