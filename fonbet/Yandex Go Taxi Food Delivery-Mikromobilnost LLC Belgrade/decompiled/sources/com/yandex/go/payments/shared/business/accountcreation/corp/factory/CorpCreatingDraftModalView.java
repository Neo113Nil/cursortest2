package com.yandex.go.payments.shared.business.accountcreation.corp.factory;

import android.content.Context;
import android.text.Html;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import coil3.c;
import coil3.request.CachePolicy;
import com.yandex.go.image.domain.requests.g;
import com.yandex.go.payments.shared.business.accountcreation.corp.d;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.aev;
import defpackage.aue;
import defpackage.awb;
import defpackage.bc;
import defpackage.c230;
import defpackage.c4f;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.d4f;
import defpackage.d6z;
import defpackage.dve;
import defpackage.e230;
import defpackage.e6h0;
import defpackage.ej6;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.g8e;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.kt41;
import defpackage.l7a;
import defpackage.l8x;
import defpackage.luh0;
import defpackage.m7x0;
import defpackage.mk7;
import defpackage.ndh0;
import defpackage.nr41;
import defpackage.ny61;
import defpackage.o61;
import defpackage.or41;
import defpackage.pav;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmr0;
import defpackage.uue;
import defpackage.vac;
import defpackage.vbb;
import defpackage.vqb;
import defpackage.vue;
import defpackage.xby;
import defpackage.xw31;
import defpackage.yue;
import defpackage.zte;
import defpackage.zue;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHintComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0018J\u000f\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010\u0018J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010\u0018J\u000f\u0010.\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u0018J'\u00102\u001a\u00020\u00162\u0006\u0010*\u001a\u00020)2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0016H\u0002¢\u0006\u0004\b4\u0010\u0018J\u000f\u00105\u001a\u00020\u0016H\u0002¢\u0006\u0004\b5\u0010\u0018J#\u00108\u001a\u00020\u00162\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/06H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0016H\u0002¢\u0006\u0004\b:\u0010\u0018J?\u0010B\u001a\u00020\u00162\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020/2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010FR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00160S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/factory/CorpCreatingDraftModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldve;", "Landroid/content/Context;", "context", "Lk7x0;", "tagUrlFormatter", "Lpav;", "imageLoader", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/d;", "createCorpAccountRequestInteractor", "Lej6;", "branchedAnalytics", "Lzte;", "corpAccountErrorInterceptor", "Ld4f;", "pageInfo", "<init>", "(Landroid/content/Context;Lk7x0;Lpav;Lcom/yandex/go/payments/shared/business/accountcreation/corp/d;Lej6;Lzte;Ld4f;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDismissManually", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldve;", "preloadCorpSuccessTitleIcon", "setupView", "setupCityLayoutInput", "saveCurrentFieldsInPageInfo", "setupEmailItemInput", "setupContactItemInput", "setupCompanyNameItemInput", "setupPhoneItemInput", "Lru/yandex/taxi/design/ListItemInputComponent;", "listItemInputComponent", "setupCloseListenerForInput", "(Lru/yandex/taxi/design/ListItemInputComponent;)V", "setupOpenBusinessAccountButton", "setupHintDescription", "", "title", "hint", "setupHintWithTitleInInputComponent", "(Lru/yandex/taxi/design/ListItemInputComponent;Ljava/lang/String;Ljava/lang/String;)V", "setupPoliticButton", "setPoliticTitle", "", "fieldMap", "setAlertText", "(Ljava/util/Map;)V", "setupCreateDraftButton", "email", "companyName", "city", "contact", "phone", "Lcom/yandex/go/sharedpayments/api/analytics/SharedPaymentsOpenReason;", "openReason", "createCorpDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/go/sharedpayments/api/analytics/SharedPaymentsOpenReason;)V", "Lk7x0;", "Lpav;", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/d;", "Lej6;", "Lzte;", "Ld4f;", "Lhbp0;", "main", "Lhbp0;", "Ll8x;", "onboardingJob", "Ll8x;", "Laue;", "dataInteractor", "Laue;", "Lkotlin/Function1;", "", "policyCheckedChangeListener", "Ltls;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CorpCreatingDraftModalView extends SlideableBindingModalView<dve> {
    public static final int $stable = 8;
    private final ej6 branchedAnalytics;
    private final zte corpAccountErrorInterceptor;
    private final d createCorpAccountRequestInteractor;
    private aue dataInteractor;
    private final pav imageLoader;
    private final hbp0 main;
    private l8x onboardingJob;
    private final d4f pageInfo;
    private final tls policyCheckedChangeListener;
    private final k7x0 tagUrlFormatter;

    public CorpCreatingDraftModalView(Context context, k7x0 k7x0Var, pav pavVar, d dVar, ej6 ej6Var, zte zteVar, d4f d4fVar) {
        super(context);
        this.tagUrlFormatter = k7x0Var;
        this.imageLoader = pavVar;
        this.createCorpAccountRequestInteractor = dVar;
        this.branchedAnalytics = ej6Var;
        this.corpAccountErrorInterceptor = zteVar;
        this.pageInfo = d4fVar;
        this.main = new hbp0(new czo0(14), "", null);
        this.onboardingJob = a.a();
        this.dataInteractor = d4fVar.i;
        this.policyCheckedChangeListener = new vqb(27, this);
    }

    private final void createCorpDraft(String email, String companyName, String city, String contact, String phone, SharedPaymentsOpenReason openReason) {
        tje.N(this.main.c(), null, null, new CorpCreatingDraftModalView$createCorpDraft$1(this, openReason, email, companyName, city, contact, phone, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 policyCheckedChangeListener$lambda$0(CorpCreatingDraftModalView corpCreatingDraftModalView, boolean z) {
        ej6 ej6Var = corpCreatingDraftModalView.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = corpCreatingDraftModalView.pageInfo.h;
        o61 o61Var = ej6Var.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        Boolean valueOf = Boolean.valueOf(z);
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CreateCorpScreen.AgreementChecked", hashMap, 1, g8e.v(hashMap, "checked", valueOf));
        corpCreatingDraftModalView.getBinding().h.setEnabled(z);
        return zy11.a;
    }

    private final void preloadCorpSuccessTitleIcon() {
        String a = ((m7x0) this.tagUrlFormatter).a(this.dataInteractor.a.e.b);
        g gVar = (g) this.imageLoader.e();
        gVar.c(a);
        aev aevVar = gVar.f;
        if (gVar.g) {
            vac.c(aevVar, gVar.e, gVar.d);
        } else {
            aevVar.h = vac.a;
            aevVar.i = CachePolicy.DISABLED;
        }
        ((c) gVar.b).a(aevVar.a());
    }

    private final void saveCurrentFieldsInPageInfo() {
        this.pageInfo.b = String.valueOf(getBinding().f.getText());
        this.pageInfo.f = String.valueOf(getBinding().k.getText());
        this.pageInfo.d = String.valueOf(getBinding().g.getText());
        this.pageInfo.e = String.valueOf(getBinding().m.getText());
        this.pageInfo.g = getBinding().n.getIsChecked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAlertText(Map<String, String> fieldMap) {
        for (Map.Entry<String, String> entry : fieldMap.entrySet()) {
            String key = entry.getKey();
            if (jl40.l(key, InputFieldType.EMAIL.getErrorFieldName())) {
                getBinding().k.setAlertText(entry.getValue());
            } else if (jl40.l(key, InputFieldType.PHONE.getErrorFieldName())) {
                getBinding().m.setAlertText(entry.getValue());
            } else if (jl40.l(key, InputFieldType.USER_NAME.getErrorFieldName())) {
                getBinding().g.setAlertText(entry.getValue());
            } else if (jl40.l(key, InputFieldType.COMPANY_NAME.getErrorFieldName())) {
                getBinding().f.setAlertText(entry.getValue());
            } else if (jl40.l(key, InputFieldType.CITY.getErrorFieldName())) {
                getBinding().d.setAlertText(entry.getValue());
            } else {
                xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_CREATE_CORP_ACCOUNT_SCREEN", null, new IllegalArgumentException(), "wrong field name when set alert text", 2);
            }
        }
    }

    private final void setPoliticTitle() {
        try {
            CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
            getBinding().n.setTitle(Html.fromHtml(d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.f.b), 0));
        } catch (Throwable th) {
            xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_CREATE_CORP_ACCOUNT_SCREEN", null, th, "format politic title", 2);
        }
    }

    private final void setupCityLayoutInput() {
        ru.yandex.taxi.design.utils.c.z(new vue(this, 0), getBinding().e);
        ListItemInputComponent listItemInputComponent = getBinding().d;
        listItemInputComponent.setEllipsizeHint(false);
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        String Y = d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.g.a);
        listItemInputComponent.getInput().setHideKeyboardOnDetach(false);
        listItemInputComponent.setHint(Y);
        getBinding().e.setContentDescription(Y);
        xw31.y(tje.u(12, getContext()), listItemInputComponent.getInput());
        setupCloseListenerForInput(listItemInputComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupCityLayoutInput$lambda$0(CorpCreatingDraftModalView corpCreatingDraftModalView) {
        ej6 ej6Var = corpCreatingDraftModalView.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = corpCreatingDraftModalView.pageInfo.h;
        o61 o61Var = ej6Var.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CreateCorpScreen.CitySuggestTapped", hashMap, 1, new HashMap());
        corpCreatingDraftModalView.saveCurrentFieldsInPageInfo();
        d4f d4fVar = corpCreatingDraftModalView.pageInfo;
        bc bcVar = d4fVar.a;
        CorpAccountFlowExperiment corpAccountFlowExperiment = corpCreatingDraftModalView.dataInteractor.a;
        CorpAccountFlowExperiment.CitySuggestionScreen citySuggestionScreen = corpAccountFlowExperiment.g;
        String str = citySuggestionScreen.b;
        String Y = d6z.Y(corpAccountFlowExperiment, citySuggestionScreen.c);
        CorpAccountFlowExperiment corpAccountFlowExperiment2 = corpCreatingDraftModalView.dataInteractor.a;
        String Y2 = d6z.Y(corpAccountFlowExperiment2, corpAccountFlowExperiment2.g.a);
        CorpAccountFlowExperiment corpAccountFlowExperiment3 = corpCreatingDraftModalView.dataInteractor.a;
        String Y3 = d6z.Y(corpAccountFlowExperiment3, corpAccountFlowExperiment3.g.d);
        awb awbVar = ((zue) bcVar.a).c;
        SharedPaymentsOpenReason sharedPaymentsOpenReason2 = SharedPaymentsOpenReason.CREATE_CORP;
        y yVar = (y) bcVar.b;
        vbb vbbVar = new vbb(d4fVar, yVar);
        awbVar.getClass();
        yVar.c.a().c(new c4f(sharedPaymentsOpenReason2, vbbVar, str, Y, Y2, Y3));
        return zy11.a;
    }

    private final void setupCloseListenerForInput(ListItemInputComponent listItemInputComponent) {
        listItemInputComponent.setOnKeyboardCloseListener(new l7a(26, listItemInputComponent, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCloseListenerForInput$lambda$0(ListItemInputComponent listItemInputComponent, CorpCreatingDraftModalView corpCreatingDraftModalView) {
        listItemInputComponent.clearFocus();
        listItemInputComponent.post(new ce0(listItemInputComponent, 15));
        corpCreatingDraftModalView.requestFocus();
    }

    private final void setupCompanyNameItemInput() {
        ListItemInputComponent listItemInputComponent = ((dve) getBinding()).f;
        listItemInputComponent.setEllipsizeHint(false);
        listItemInputComponent.setImeOptions(5);
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        String Y = d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.k.a);
        listItemInputComponent.getInput().setHideKeyboardOnDetach(false);
        listItemInputComponent.setHint(Y);
        setupHintWithTitleInInputComponent(listItemInputComponent, Y, Y);
        listItemInputComponent.setContentDescription(Y);
        xw31.y(tje.u(12, getContext()), listItemInputComponent.getInput());
        setupCloseListenerForInput(listItemInputComponent);
        hbp0.e(this.main, null, null, new CorpCreatingDraftModalView$setupCompanyNameItemInput$1(listItemInputComponent, this, null), 3);
        ((dve) getBinding()).f.getInput().setOnEditorActionListener(new ff2(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupCompanyNameItemInput$lambda$0(CorpCreatingDraftModalView corpCreatingDraftModalView, TextView textView, int i, KeyEvent keyEvent) {
        corpCreatingDraftModalView.getBinding().g.requestFocus();
        return true;
    }

    private final void setupContactItemInput() {
        ListItemInputComponent listItemInputComponent = ((dve) getBinding()).g;
        listItemInputComponent.setEllipsizeHint(false);
        listItemInputComponent.setImeOptions(5);
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        String Y = d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.j.a);
        listItemInputComponent.getInput().setHideKeyboardOnDetach(false);
        listItemInputComponent.setHint(Y);
        setupHintWithTitleInInputComponent(listItemInputComponent, Y, Y);
        listItemInputComponent.setContentDescription(Y);
        xw31.y(tje.u(12, getContext()), listItemInputComponent.getInput());
        setupCloseListenerForInput(listItemInputComponent);
        hbp0.e(this.main, null, null, new CorpCreatingDraftModalView$setupContactItemInput$1(listItemInputComponent, this, null), 3);
    }

    private final void setupCreateDraftButton() {
        getBinding().h.setEnabled(getBinding().n.getIsChecked());
        ButtonComponent buttonComponent = getBinding().h;
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        buttonComponent.setText(d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.d.a));
        getBinding().h.setDebounceClickListener(new uue(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCreateDraftButton$lambda$0(CorpCreatingDraftModalView corpCreatingDraftModalView) {
        boolean z;
        ButtonComponent buttonComponent = corpCreatingDraftModalView.getBinding().h;
        buttonComponent.post(new ce0(buttonComponent, 15));
        ej6 ej6Var = corpCreatingDraftModalView.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = corpCreatingDraftModalView.pageInfo.h;
        o61 o61Var = ej6Var.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CreateCorpScreen.SubmitTapped", hashMap, 1, new HashMap());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String valueOf = String.valueOf(corpCreatingDraftModalView.getBinding().f.getText());
        if (evu0.J(valueOf)) {
            ListItemInputComponent listItemInputComponent = corpCreatingDraftModalView.getBinding().f;
            CorpAccountFlowExperiment corpAccountFlowExperiment = corpCreatingDraftModalView.dataInteractor.a;
            listItemInputComponent.setAlertText(d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.k.b));
            linkedHashSet.add(InputFieldType.COMPANY_NAME.getAnalyticsName());
            z = true;
        } else {
            z = false;
        }
        String valueOf2 = String.valueOf(corpCreatingDraftModalView.getBinding().d.getText());
        if (evu0.J(valueOf2)) {
            ListItemInputComponent listItemInputComponent2 = corpCreatingDraftModalView.getBinding().d;
            CorpAccountFlowExperiment corpAccountFlowExperiment2 = corpCreatingDraftModalView.dataInteractor.a;
            listItemInputComponent2.setAlertText(d6z.Y(corpAccountFlowExperiment2, corpAccountFlowExperiment2.d.g.c));
            linkedHashSet.add(InputFieldType.CITY.getAnalyticsName());
            z = true;
        }
        String valueOf3 = String.valueOf(corpCreatingDraftModalView.getBinding().g.getText());
        if (evu0.J(valueOf3)) {
            ListItemInputComponent listItemInputComponent3 = corpCreatingDraftModalView.getBinding().g;
            CorpAccountFlowExperiment corpAccountFlowExperiment3 = corpCreatingDraftModalView.dataInteractor.a;
            listItemInputComponent3.setAlertText(d6z.Y(corpAccountFlowExperiment3, corpAccountFlowExperiment3.d.j.b));
            linkedHashSet.add(InputFieldType.USER_NAME.getAnalyticsName());
            z = true;
        }
        String valueOf4 = String.valueOf(corpCreatingDraftModalView.getBinding().m.getText());
        if (evu0.J(valueOf4)) {
            ListItemInputComponent listItemInputComponent4 = corpCreatingDraftModalView.getBinding().m;
            CorpAccountFlowExperiment corpAccountFlowExperiment4 = corpCreatingDraftModalView.dataInteractor.a;
            listItemInputComponent4.setAlertText(d6z.Y(corpAccountFlowExperiment4, corpAccountFlowExperiment4.d.i.b));
            linkedHashSet.add(InputFieldType.PHONE.getAnalyticsName());
            z = true;
        }
        String valueOf5 = String.valueOf(corpCreatingDraftModalView.getBinding().k.getText());
        if (evu0.J(valueOf5)) {
            ListItemInputComponent listItemInputComponent5 = corpCreatingDraftModalView.getBinding().k;
            CorpAccountFlowExperiment corpAccountFlowExperiment5 = corpCreatingDraftModalView.dataInteractor.a;
            listItemInputComponent5.setAlertText(d6z.Y(corpAccountFlowExperiment5, corpAccountFlowExperiment5.d.h.b));
            linkedHashSet.add(InputFieldType.EMAIL.getAnalyticsName());
            z = true;
        }
        ej6 ej6Var2 = corpCreatingDraftModalView.branchedAnalytics;
        d4f d4fVar = corpCreatingDraftModalView.pageInfo;
        if (!z) {
            SharedPaymentsOpenReason sharedPaymentsOpenReason2 = d4fVar.h;
            o61 o61Var2 = ej6Var2.a;
            String analyticsName2 = sharedPaymentsOpenReason2.getAnalyticsName();
            o61Var2.getClass();
            HashMap hashMap2 = new HashMap();
            if (analyticsName2 != null) {
                hashMap2.put("open_reason", analyticsName2);
            }
            o61Var2.a.a("CreateCorpScreen.SendRequestCorpTrial", hashMap2, 1, new HashMap());
            corpCreatingDraftModalView.createCorpDraft(valueOf5, valueOf, valueOf2, valueOf3, valueOf4, corpCreatingDraftModalView.pageInfo.h);
            return;
        }
        SharedPaymentsOpenReason sharedPaymentsOpenReason3 = d4fVar.h;
        o61 o61Var3 = ej6Var2.a;
        String analyticsName3 = sharedPaymentsOpenReason3.getAnalyticsName();
        List J0 = kotlin.collections.a.J0(linkedHashSet);
        o61Var3.getClass();
        HashMap hashMap3 = new HashMap();
        if (analyticsName3 != null) {
            hashMap3.put("open_reason", analyticsName3);
        }
        hashMap3.put("fields", J0);
        o61Var3.a.a("CreateCorpScreen.FormValidationError", hashMap3, 1, new HashMap());
    }

    private final void setupEmailItemInput() {
        ListItemInputComponent listItemInputComponent = ((dve) getBinding()).k;
        listItemInputComponent.setEllipsizeHint(false);
        listItemInputComponent.setImeOptions(6);
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        String Y = d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.h.a);
        listItemInputComponent.getInput().setHideKeyboardOnDetach(false);
        listItemInputComponent.setHint(Y);
        setupHintWithTitleInInputComponent(listItemInputComponent, Y, Y);
        listItemInputComponent.setContentDescription(Y);
        xw31.y(tje.u(12, getContext()), listItemInputComponent.getInput());
        setupCloseListenerForInput(listItemInputComponent);
        hbp0.e(this.main, null, null, new CorpCreatingDraftModalView$setupEmailItemInput$1(listItemInputComponent, this, null), 3);
    }

    private final void setupHintDescription() {
        ListHintComponent listHintComponent = getBinding().l;
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        listHintComponent.setText(d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.e));
        View findViewById = getBinding().l.findViewById(ndh0.text);
        if (findViewById instanceof RobotoTextView) {
            int x = (int) tje.x(findViewById.getContext(), 8.0f);
            int x2 = (int) tje.x(findViewById.getContext(), 6.5f);
            ((RobotoTextView) findViewById).setPadding(x, x2, x, x2);
        }
        ListTitleComponent listTitleComponent = getBinding().c;
        CorpAccountFlowExperiment corpAccountFlowExperiment2 = this.dataInteractor.a;
        listTitleComponent.setTitle(d6z.Y(corpAccountFlowExperiment2, corpAccountFlowExperiment2.d.b));
        ListItemComponent listItemComponent = getBinding().b;
        CorpAccountFlowExperiment corpAccountFlowExperiment3 = this.dataInteractor.a;
        listItemComponent.setTitle(d6z.Y(corpAccountFlowExperiment3, corpAccountFlowExperiment3.d.c));
    }

    private final void setupHintWithTitleInInputComponent(ListItemInputComponent listItemInputComponent, String title, String hint) {
        hbp0.e(this.main, null, null, new CorpCreatingDraftModalView$setupHintWithTitleInInputComponent$1(listItemInputComponent, hint, title, null), 3);
    }

    private final void setupOpenBusinessAccountButton() {
        if (!this.dataInteractor.a.d.a.a) {
            getBinding().j.setVisibility(8);
            return;
        }
        getBinding().j.setVisibility(0);
        ListItemComponent listItemComponent = getBinding().j;
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        listItemComponent.setTitle(d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.a.b));
        ListItemComponent listItemComponent2 = getBinding().j;
        CorpAccountFlowExperiment corpAccountFlowExperiment2 = this.dataInteractor.a;
        listItemComponent2.setSubtitle(d6z.Y(corpAccountFlowExperiment2, corpAccountFlowExperiment2.d.a.c));
        getBinding().j.setDebounceClickListener(new uue(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOpenBusinessAccountButton$lambda$0(CorpCreatingDraftModalView corpCreatingDraftModalView) {
        ej6 ej6Var = corpCreatingDraftModalView.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = corpCreatingDraftModalView.pageInfo.h;
        o61 o61Var = ej6Var.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CreateCorpScreen.BusinessAccountTapped", hashMap, 1, new HashMap());
        bc bcVar = corpCreatingDraftModalView.pageInfo.a;
        ((com.yandex.go.payments.shared.business.accountcreation.d) ((zue) bcVar.a).f.get()).d((tmr0) bcVar.x, SharedPaymentsOpenReason.CREATE_CORP, (Runnable) bcVar.w);
    }

    private final void setupPhoneItemInput() {
        ListItemInputComponent listItemInputComponent = ((dve) getBinding()).m;
        listItemInputComponent.setEllipsizeHint(false);
        listItemInputComponent.setImeOptions(5);
        CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
        String Y = d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.i.a);
        listItemInputComponent.getInput().setHideKeyboardOnDetach(false);
        listItemInputComponent.setHint(Y);
        setupHintWithTitleInInputComponent(listItemInputComponent, Y, Y);
        listItemInputComponent.setContentDescription(Y);
        xw31.y(tje.u(12, getContext()), listItemInputComponent.getInput());
        setupCloseListenerForInput(listItemInputComponent);
        hbp0.e(this.main, null, null, new CorpCreatingDraftModalView$setupPhoneItemInput$1(listItemInputComponent, this, null), 3);
    }

    private final void setupPoliticButton() {
        int i = 1;
        getBinding().n.setCheckedChangeListener(new mk7(i, this.policyCheckedChangeListener));
        getBinding().n.setCenterClickListener(new uue(this, i));
        setPoliticTitle();
        getBinding().n.setChecked(this.dataInteractor.a.d.f.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupPoliticButton$lambda$0(CorpCreatingDraftModalView corpCreatingDraftModalView) {
        ej6 ej6Var = corpCreatingDraftModalView.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = corpCreatingDraftModalView.pageInfo.h;
        o61 o61Var = ej6Var.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CreateCorpScreen.AgreementInfoTapped", hashMap, 1, new HashMap());
        corpCreatingDraftModalView.saveCurrentFieldsInPageInfo();
        bc bcVar = corpCreatingDraftModalView.pageInfo.a;
        String str = corpCreatingDraftModalView.dataInteractor.a.d.f.a;
        or41 or41Var = ((zue) bcVar.a).g;
        y yVar = (y) bcVar.b;
        int i = 0;
        yue yueVar = new yue(yVar, i);
        or41Var.getClass();
        yVar.c.a().c(new kt41(new nr41(i, yueVar), str));
    }

    private final void setupView() {
        setupPoliticButton();
        setupHintDescription();
        setupOpenBusinessAccountButton();
        setupCreateDraftButton();
        setupCityLayoutInput();
        setupPhoneItemInput();
        setupCompanyNameItemInput();
        setupContactItemInput();
        setupPhoneItemInput();
        setupEmailItemInput();
        getBinding().i.setShimmering(false);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dve bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(luh0.corp_creating_draft_screen, parent, false);
        int i = e6h0.branch_screen_subtitle;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = e6h0.branch_screen_title;
            ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
            if (listTitleComponent != null) {
                i = e6h0.business_account_layout;
                if (((CardView) cma1.O(i, inflate)) != null) {
                    i = e6h0.city_item_input;
                    ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
                    if (listItemInputComponent != null && (O = cma1.O((i = e6h0.click_catcher), inflate)) != null) {
                        i = e6h0.company_name_item_input;
                        ListItemInputComponent listItemInputComponent2 = (ListItemInputComponent) cma1.O(i, inflate);
                        if (listItemInputComponent2 != null) {
                            i = e6h0.contact_item_input;
                            ListItemInputComponent listItemInputComponent3 = (ListItemInputComponent) cma1.O(i, inflate);
                            if (listItemInputComponent3 != null) {
                                i = e6h0.create_account_button;
                                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                if (buttonComponent != null) {
                                    i = e6h0.create_account_frame_layout;
                                    ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) cma1.O(i, inflate);
                                    if (shimmeringFrameLayout != null) {
                                        i = e6h0.create_account_open_business_account;
                                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, inflate);
                                        if (listItemComponent2 != null) {
                                            i = e6h0.email_item_input;
                                            ListItemInputComponent listItemInputComponent4 = (ListItemInputComponent) cma1.O(i, inflate);
                                            if (listItemInputComponent4 != null) {
                                                i = e6h0.header_linear_layout;
                                                if (((LinearLayoutCompat) cma1.O(i, inflate)) != null) {
                                                    i = e6h0.hint_description;
                                                    ListHintComponent listHintComponent = (ListHintComponent) cma1.O(i, inflate);
                                                    if (listHintComponent != null) {
                                                        i = e6h0.hint_description_layout;
                                                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                                            i = e6h0.open_city_layout;
                                                            if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                                                i = e6h0.phone_item_input;
                                                                ListItemInputComponent listItemInputComponent5 = (ListItemInputComponent) cma1.O(i, inflate);
                                                                if (listItemInputComponent5 != null) {
                                                                    i = e6h0.politic_item_check;
                                                                    ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) cma1.O(i, inflate);
                                                                    if (listItemCheckComponent != null) {
                                                                        i = e6h0.politic_item_layout;
                                                                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                                                                            i = e6h0.shuttle_ticket_chevron;
                                                                            if (((AppCompatImageView) cma1.O(i, inflate)) != null) {
                                                                                return new dve((FrameLayout) inflate, listItemComponent, listTitleComponent, listItemInputComponent, O, listItemInputComponent2, listItemInputComponent3, buttonComponent, shimmeringFrameLayout, listItemComponent2, listItemInputComponent4, listHintComponent, listItemInputComponent5, listItemCheckComponent);
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
    public e230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ej6 ej6Var = this.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = this.pageInfo.h;
        o61 o61Var = ej6Var.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CreateCorpScreen.Shown", hashMap, 1, new HashMap());
        preloadCorpSuccessTitleIcon();
        setupView();
        if (!evu0.J(this.pageInfo.b)) {
            getBinding().f.setTextWithoutNotifying(this.pageInfo.b);
            ListItemInputComponent listItemInputComponent = getBinding().f;
            CorpAccountFlowExperiment corpAccountFlowExperiment = this.dataInteractor.a;
            listItemInputComponent.setTitle(d6z.Y(corpAccountFlowExperiment, corpAccountFlowExperiment.d.k.a));
        }
        if (!evu0.J(this.pageInfo.c.a)) {
            getBinding().d.setTextWithoutNotifying(this.pageInfo.c.a);
            ListItemInputComponent listItemInputComponent2 = getBinding().d;
            CorpAccountFlowExperiment corpAccountFlowExperiment2 = this.dataInteractor.a;
            listItemInputComponent2.setTitle(d6z.Y(corpAccountFlowExperiment2, corpAccountFlowExperiment2.d.g.a));
        }
        if (!evu0.J(this.pageInfo.f)) {
            getBinding().k.setTextWithoutNotifying(this.pageInfo.f);
            ListItemInputComponent listItemInputComponent3 = getBinding().k;
            CorpAccountFlowExperiment corpAccountFlowExperiment3 = this.dataInteractor.a;
            listItemInputComponent3.setTitle(d6z.Y(corpAccountFlowExperiment3, corpAccountFlowExperiment3.d.h.a));
        }
        if (!evu0.J(this.pageInfo.d)) {
            getBinding().g.setTextWithoutNotifying(this.pageInfo.d);
            ListItemInputComponent listItemInputComponent4 = getBinding().g;
            CorpAccountFlowExperiment corpAccountFlowExperiment4 = this.dataInteractor.a;
            listItemInputComponent4.setTitle(d6z.Y(corpAccountFlowExperiment4, corpAccountFlowExperiment4.d.j.a));
        }
        if (!evu0.J(this.pageInfo.e)) {
            getBinding().m.setTextWithoutNotifying(this.pageInfo.e);
            ListItemInputComponent listItemInputComponent5 = getBinding().m;
            CorpAccountFlowExperiment corpAccountFlowExperiment5 = this.dataInteractor.a;
            listItemInputComponent5.setTitle(d6z.Y(corpAccountFlowExperiment5, corpAccountFlowExperiment5.d.i.a));
        }
        getBinding().n.setChecked(this.pageInfo.g);
        getBinding().h.setEnabled(getBinding().n.getIsChecked());
        this.main.a();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ej6 ej6Var = this.branchedAnalytics;
        SharedPaymentsOpenReason sharedPaymentsOpenReason = this.pageInfo.h;
        o61 o61Var = ej6Var.a;
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        o61Var.a.a("CreateCorpScreen.Closed", hashMap, 1, new HashMap());
        this.main.b();
        this.onboardingJob.a(null);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        bc bcVar = this.pageInfo.a;
        ((Runnable) bcVar.w).run();
        ((y) bcVar.b).c();
    }
}
