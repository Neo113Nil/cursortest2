package com.yandex.go.safety.center.contacts;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.model.PresentationContact$Mode;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import com.yandex.payment.common.result.ResultType;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.arl0;
import defpackage.bgb0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.f1h0;
import defpackage.hxj0;
import defpackage.i7h0;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.ppl0;
import defpackage.pzt0;
import defpackage.rg3;
import defpackage.rp31;
import defpackage.swe0;
import defpackage.tjh0;
import defpackage.tse0;
import defpackage.uql0;
import defpackage.w511;
import defpackage.xm2;
import defpackage.xw31;
import defpackage.zql0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.progress.CircularProgressBar;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010K\u001a\u00020H8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsView;", "Lcom/yandex/go/safety/center/base/BaseSafetyCenterView;", "Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/safety/center/contacts/a;", "presenter", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/content/Context;Lcom/yandex/go/safety/center/contacts/a;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;Landroid/app/Activity;)V", "Lzy11;", "resetShareButton", "()V", "", "Lswe0;", ContactsFragment.WEBVIEW_NAME, "setContacts", "(Ljava/util/List;)V", "Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView$UiMode;", "mode", "setMode", "(Lcom/yandex/go/safety/center/contacts/SafetyCenterContactsMvpView$UiMode;)V", "", ResultType.RESULT_TYPE_LOADING, "showLoading", "(Z)V", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$L10nKey;", "l10nKey", "setShareDescription", "(Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment$L10nKey;)V", "", "errorText", "showError", "(Ljava/lang/String;)V", "Lcom/yandex/go/safety/center/share/notification/ShareStatus;", ACSPConstants.STATUS, "setShareStatus", "(Lcom/yandex/go/safety/center/share/notification/ShareStatus;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lcom/yandex/go/safety/center/contacts/a;", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "Landroid/app/Activity;", "Landroid/widget/FrameLayout;", "root", "Landroid/widget/FrameLayout;", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "progressView", "Lru/yandex/taxi/widget/progress/CircularProgressBar;", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "Lru/yandex/taxi/design/AutoDividerComponentList;", "contactsContainer", "Lru/yandex/taxi/design/AutoDividerComponentList;", "Lru/yandex/taxi/design/ListItemComponent;", "addContactButton", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/ListTextComponent;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/design/ListTextComponent;", "shareDescription", "Lru/yandex/taxi/design/ButtonComponent;", "shareButton", "Lru/yandex/taxi/design/ButtonComponent;", "addBottomContactButton", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterContactsView extends BaseSafetyCenterView implements SafetyCenterContactsMvpView {
    private final Activity activity;
    private final ButtonComponent addBottomContactButton;
    private final ListItemComponent addContactButton;
    private final AutoDividerComponentList contactsContainer;
    private final View content;
    private final ListTextComponent description;
    private final SafetyCenterExperiment experiment;
    private final a presenter;
    private final CircularProgressBar progressView;
    private final FrameLayout root;
    private final ButtonComponent shareButton;
    private final ListTextComponent shareDescription;
    private final FloatingTitleToolbarComponent toolbar;

    public SafetyCenterContactsView(Context context, a aVar, SafetyCenterExperiment safetyCenterExperiment, Activity activity) {
        super(context, aVar);
        this.presenter = aVar;
        this.experiment = safetyCenterExperiment;
        this.activity = activity;
        int i = i7h0.root;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.root = (FrameLayout) ((View) rp31.d(this, i));
        this.progressView = (CircularProgressBar) ((View) rp31.d(this, i7h0.safety_center_progress_view));
        this.content = (View) rp31.d(this, i7h0.safety_center_content);
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = (FloatingTitleToolbarComponent) ((View) rp31.d(this, i7h0.safety_center_toolbar));
        this.toolbar = floatingTitleToolbarComponent;
        this.contactsContainer = (AutoDividerComponentList) ((View) rp31.d(this, i7h0.safety_center_contacts));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, i7h0.safety_center_add_contact));
        this.addContactButton = listItemComponent;
        ListTextComponent listTextComponent = (ListTextComponent) ((View) rp31.d(this, i7h0.safety_center_description));
        this.description = listTextComponent;
        this.shareDescription = (ListTextComponent) ((View) rp31.d(this, i7h0.safety_center_share_description));
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, i7h0.safety_center_share));
        this.shareButton = buttonComponent;
        ButtonComponent buttonComponent2 = (ButtonComponent) ((View) rp31.d(this, i7h0.safety_center_bottom_add_contact));
        this.addBottomContactButton = buttonComponent2;
        floatingTitleToolbarComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_SCREEN_TITLE));
        listTextComponent.setText(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_SCREEN_DESCRIPTION));
        listItemComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_ADD_MORE_LINK_TITLE));
        buttonComponent2.setText(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_ADD_LINK_TITLE));
        resetShareButton();
        floatingTitleToolbarComponent.setOnBackClickListener(new hxj0(16, this));
        floatingTitleToolbarComponent.setTrailContainerClickListener(new uql0(aVar, 2));
        listItemComponent.setDebounceClickListener(new uql0(aVar, 3));
        buttonComponent2.setDebounceClickListener(new uql0(aVar, 4));
        buttonComponent.setDebounceClickListener(new uql0(aVar, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SafetyCenterContactsView safetyCenterContactsView) {
        safetyCenterContactsView.presenter.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onActionClick(a aVar) {
        aVar.H = !aVar.H;
        aVar.Mg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onAddButtonClick(a aVar) {
        aVar.D.v();
        ppl0 ppl0Var = aVar.F.a;
        ppl0Var.a.a("SafetyCenter.TrustedContacts.AddContactTapped", tse0.o(ppl0Var), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onAddMoreButtonClick(a aVar) {
        aVar.D.v();
        ppl0 ppl0Var = aVar.F.a;
        ppl0Var.a.a("SafetyCenter.TrustedContacts.AddMoreTapped", tse0.o(ppl0Var), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onShareClick(a aVar) {
        if (aVar.I) {
            pzt0 pzt0Var = aVar.K;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            ShareRequestParam Kg = aVar.Kg();
            aVar.Lg(aVar.z.o(Kg));
            aVar.E.a(Kg);
            aVar.F.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setContacts$lambda$0(SafetyCenterContactsView safetyCenterContactsView, int i) {
        a aVar = safetyCenterContactsView.presenter;
        if (aVar.H) {
            j jVar = aVar.z;
            swe0 swe0Var = (swe0) jVar.f().get(i);
            ArrayList arrayList = new ArrayList(jVar.f());
            int indexOf = arrayList.indexOf(swe0Var);
            if (indexOf == -1) {
                return;
            }
            arrayList.remove(indexOf);
            arrayList.add(indexOf, new swe0(swe0Var.a, swe0Var.b, PresentationContact$Mode.REMOVING));
            jVar.p(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMode$lambda$0(int i, View view) {
        ((ListItemComponent) view).setTrailVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setShareStatus$lambda$0(boolean z, SafetyCenterContactsView safetyCenterContactsView) {
        if (z) {
            return;
        }
        a aVar = safetyCenterContactsView.presenter;
        aVar.H = !aVar.H;
        aVar.Mg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.root;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tjh0.safety_center_contacts_view;
    }

    @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView
    public void resetShareButton() {
        this.shareButton.setText(this.experiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_LINK_TITLE));
        this.shareButton.setButtonTitleColor(getContext().getColor(mqg0.accent_background_text_color));
        this.shareButton.setButtonBackground(getContext().getColor(mqg0.component_accent_color));
        this.shareButton.setClickable(true);
    }

    @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView
    public void setContacts(List<swe0> contacts) {
        AutoDividerComponentList autoDividerComponentList;
        while (this.contactsContainer.getChildCount() > contacts.size()) {
            AutoDividerComponentList autoDividerComponentList2 = this.contactsContainer;
            autoDividerComponentList2.removeViewAt(autoDividerComponentList2.getChildCount() - 1);
        }
        while (true) {
            int childCount = this.contactsContainer.getChildCount();
            int size = contacts.size();
            autoDividerComponentList = this.contactsContainer;
            if (childCount >= size) {
                break;
            }
            c.q(autoDividerComponentList, tjh0.safety_center_phones_contact_item, true);
            int childCount2 = this.contactsContainer.getChildCount() - 1;
            ListItemComponent listItemComponent = (ListItemComponent) this.contactsContainer.getChildAt(childCount2);
            listItemComponent.setTrailContainerClickListener(new xm2(this, childCount2, 16));
            listItemComponent.setClickableTrailImage(dzg0.ic_delete_item);
            listItemComponent.setTrailContentDescription(getContext().getString(kyh0.favorites_remove_address));
        }
        int childCount3 = autoDividerComponentList.getChildCount();
        for (int i = 0; i < childCount3; i++) {
            ListItemComponent listItemComponent2 = (ListItemComponent) this.contactsContainer.getChildAt(i);
            swe0 swe0Var = contacts.get(i);
            String str = swe0Var.b;
            String str2 = swe0Var.a;
            String e = bgb0.e(str);
            if (str2.length() == 0) {
                listItemComponent2.setTitle(e);
            } else {
                listItemComponent2.setTitle(str2);
                listItemComponent2.setSubtitle(e);
            }
            boolean z = swe0Var.c == PresentationContact$Mode.NORMAL;
            listItemComponent2.getTrailImageView().setVisibility(z ? 0 : 8);
            if (z) {
                listItemComponent2.stopProgressAnimation();
            } else if (!listItemComponent2.isInProgressAnimation()) {
                listItemComponent2.startProgressAnimation();
            }
        }
    }

    @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView
    public void setMode(SafetyCenterContactsMvpView.UiMode mode) {
        mode.getClass();
        boolean z = mode instanceof SafetyCenterContactsMvpView.UiMode.EDIT;
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = this.toolbar;
        if (z) {
            floatingTitleToolbarComponent.disableBackButton();
        } else {
            floatingTitleToolbarComponent.enableBackButton();
        }
        boolean b = mode.b();
        FloatingTitleToolbarComponent floatingTitleToolbarComponent2 = this.toolbar;
        if (b) {
            floatingTitleToolbarComponent2.setClickableTrailImage(f1h0.ic_trash_can_darkest);
            this.toolbar.setTrailContentDescription(getContext().getString(kyh0.trusted_contacts_delete_title));
        } else {
            floatingTitleToolbarComponent2.clearTrailView();
        }
        FloatingTitleToolbarComponent floatingTitleToolbarComponent3 = this.toolbar;
        if (z) {
            floatingTitleToolbarComponent3.setTrailCompanionText(getContext().getText(kyh0.common_done));
            this.toolbar.setTrailContentDescription(getContext().getString(kyh0.common_done));
        } else {
            floatingTitleToolbarComponent3.setTrailCompanionText(null);
        }
        int i = 0;
        this.toolbar.setTrailVisibility(z || mode.b());
        this.addContactButton.setVisibility(mode instanceof SafetyCenterContactsMvpView.UiMode.NOT_FILLED ? 0 : 8);
        this.addBottomContactButton.setVisibility(mode instanceof SafetyCenterContactsMvpView.UiMode.EMPTY ? 0 : 8);
        this.contactsContainer.setVisibility(mode.a() ? 0 : 8);
        this.description.setVisibility(mode.c() ? 0 : 8);
        this.shareDescription.setVisibility(8);
        this.shareButton.setVisibility(mode.f() ? 0 : 8);
        xw31.q(this.contactsContainer, new zql0(z ? 0 : 8, i));
    }

    @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView
    public void setShareDescription(SafetyCenterExperiment.L10nKey l10nKey) {
        this.shareDescription.setText(this.experiment.a(l10nKey));
    }

    @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView
    public void setShareStatus(ShareStatus status) {
        boolean z = status == ShareStatus.PREPARING || status == ShareStatus.IN_PROGRESS;
        ButtonComponent buttonComponent = this.shareButton;
        if (z) {
            buttonComponent.startProgress();
        } else {
            buttonComponent.finishProgress();
        }
        boolean z2 = !z;
        this.addBottomContactButton.setClickable(z2);
        this.addContactButton.setClickable(z2);
        this.toolbar.setTrailContainerClickListener(new rg3(z, this, 10));
        int i = arl0.a[status.ordinal()];
        if (i == 1 || i == 2) {
            this.shareButton.setText(this.experiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_LINK_SENDING_TITLE));
            return;
        }
        if (i == 3) {
            this.shareButton.setText(this.experiment.a(SafetyCenterExperiment.L10nKey.TRUSTED_CONTACTS_NOTIFY_SENDING_SUCCESS));
            this.shareButton.setButtonTitleColor(getContext().getColor(mqg0.component_black_opacity_45));
            this.shareButton.setButtonBackground(getContext().getColor(mqg0.component_gray_150));
            this.shareButton.setClickable(false);
            return;
        }
        if (i == 4) {
            resetShareButton();
        } else {
            if (i == 5) {
                return;
            }
            w511.b();
        }
    }

    @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView
    public void showError(String errorText) {
        new AlertDialog(this.activity).setMessage(errorText).setPositiveButton(kyh0.common_ok).show();
    }

    @Override // com.yandex.go.safety.center.contacts.SafetyCenterContactsMvpView
    public void showLoading(boolean loading) {
        CircularProgressBar circularProgressBar = this.progressView;
        if (loading) {
            cma1.J(circularProgressBar);
            cma1.M(this.content);
            cma1.N(this.addBottomContactButton);
            cma1.N(this.shareButton);
            return;
        }
        cma1.L(circularProgressBar);
        cma1.J(this.content);
        cma1.K(this.addBottomContactButton);
        cma1.K(this.shareButton);
    }
}
