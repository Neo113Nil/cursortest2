package com.yandex.go.scooters.onboarding.agreement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.scooters.analytics.ScootersRentContractAnalytics$ButtonName;
import com.yandex.go.scooters.data.model.AgreementPoint;
import com.yandex.go.scooters.data.model.ScootersOnboardingAgreement;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import com.yandex.go.scooters.onboarding.agreement.ScootersAgreementModalView;
import defpackage.a0;
import defpackage.a230;
import defpackage.axm0;
import defpackage.ca1;
import defpackage.cma1;
import defpackage.cxm0;
import defpackage.d6z;
import defpackage.exm0;
import defpackage.fxm0;
import defpackage.g0c;
import defpackage.he7;
import defpackage.hxm0;
import defpackage.i3y;
import defpackage.ixm0;
import defpackage.j01;
import defpackage.jxm0;
import defpackage.kxm0;
import defpackage.lj1;
import defpackage.mj1;
import defpackage.nj1;
import defpackage.ny61;
import defpackage.qfh0;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.qw8;
import defpackage.srh0;
import defpackage.tcc;
import defpackage.xro0;
import defpackage.zwm0;
import defpackage.zxs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;BM\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\"\u0010\u0015J\u000f\u0010#\u001a\u00020\u0013H\u0014¢\u0006\u0004\b#\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R!\u00103\u001a\b\u0012\u0004\u0012\u00020.0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R!\u00107\u001a\b\u0012\u0004\u0012\u0002040-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/yandex/go/scooters/onboarding/agreement/ScootersAgreementModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lkxm0;", "Landroid/content/Context;", "context", "Lxro0;", "rentContractAnalytics", "Lhxm0;", "scootersAgreementPresenter", "", "onboardingType", "", "buttonTextOverride", "Lcom/yandex/go/scooters/data/model/ScootersOnboardingExperiment;", "exp", "Lfxm0;", "scootersAgreementNavigator", "<init>", "(Landroid/content/Context;Lxro0;Lhxm0;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/yandex/go/scooters/data/model/ScootersOnboardingExperiment;Lfxm0;)V", "Lzy11;", "initRv", "()V", "initTerms", "initAcceptList", "La230;", "insetsType", "()La230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lkxm0;", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "Lxro0;", "Lhxm0;", "Ljava/lang/String;", "Ljava/lang/CharSequence;", "Lcom/yandex/go/scooters/data/model/ScootersOnboardingExperiment;", "Lfxm0;", "Lzwm0;", "itemsBuilder", "Lzwm0;", "", "Laxm0;", "termsList$delegate", "Li3y;", "getTermsList", "()Ljava/util/List;", "termsList", "Ljxm0;", "switchesList$delegate", "getSwitchesList", "switchesList", "", "acceptedAllListening", "Z", "cxm0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAgreementModalView extends SlideableBindingModalView<kxm0> {
    public static final int $stable = 8;
    private boolean acceptedAllListening;
    private final CharSequence buttonTextOverride;
    private final ScootersOnboardingExperiment exp;
    private final zwm0 itemsBuilder;
    private final String onboardingType;
    private final xro0 rentContractAnalytics;
    private final fxm0 scootersAgreementNavigator;
    private final hxm0 scootersAgreementPresenter;

    /* renamed from: switchesList$delegate, reason: from kotlin metadata */
    private final i3y switchesList;

    /* renamed from: termsList$delegate, reason: from kotlin metadata */
    private final i3y termsList;

    public ScootersAgreementModalView(Context context, xro0 xro0Var, hxm0 hxm0Var, String str, CharSequence charSequence, ScootersOnboardingExperiment scootersOnboardingExperiment, fxm0 fxm0Var) {
        super(context);
        this.rentContractAnalytics = xro0Var;
        this.scootersAgreementPresenter = hxm0Var;
        this.onboardingType = str;
        this.buttonTextOverride = charSequence;
        this.exp = scootersOnboardingExperiment;
        this.scootersAgreementNavigator = fxm0Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setAnalyticsContext(createAnalyticsContext("ScootersRentContract", new LinkedHashSet()));
        zwm0 zwm0Var = new zwm0(scootersOnboardingExperiment);
        this.itemsBuilder = zwm0Var;
        ScootersAgreementModalView$termsList$2 scootersAgreementModalView$termsList$2 = new ScootersAgreementModalView$termsList$2(0, zwm0Var, zwm0.class, "buildAgreementTermsList", "buildAgreementTermsList()Ljava/util/List;", 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.termsList = kotlin.a.b(lazyThreadSafetyMode, scootersAgreementModalView$termsList$2);
        this.switchesList = kotlin.a.b(lazyThreadSafetyMode, new ScootersAgreementModalView$switchesList$2(0, zwm0Var, zwm0.class, "buildAgreementSwitchesList", "buildAgreementSwitchesList()Ljava/util/List;", 0));
        this.acceptedAllListening = true;
    }

    public static final /* synthetic */ kxm0 access$getBinding(ScootersAgreementModalView scootersAgreementModalView) {
        return scootersAgreementModalView.getBinding();
    }

    private final List<jxm0> getSwitchesList() {
        return (List) this.switchesList.getValue();
    }

    private final List<axm0> getTermsList() {
        return (List) this.termsList.getValue();
    }

    private final void initAcceptList() {
        Context context = getContext();
        ScootersAgreementModalView$initAcceptList$adapter$1 scootersAgreementModalView$initAcceptList$adapter$1 = new ScootersAgreementModalView$initAcceptList$adapter$1(2, this.scootersAgreementPresenter, hxm0.class, "changeAccepted", "changeAccepted(Lcom/yandex/go/scooters/onboarding/agreement/model/ScootersAgreementSwitchItemModel;Z)V", 0);
        int i = nj1.Z;
        g0c a = qoi0.a(jxm0.class);
        int i2 = 0;
        lj1 lj1Var = new lj1(context, i2);
        mj1 mj1Var = new mj1(scootersAgreementModalView$initAcceptList$adapter$1, i2);
        qw8 qw8Var = new qw8(Collections.singletonList(new zxs(a.a(), 0, lj1Var, EmptyList.a, new he7(1, mj1Var), null)), 3);
        getBinding().c.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().c.setAdapter(qw8Var);
        qw8Var.submitList(getSwitchesList(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$Adapter, bys, qw8] */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    private final void initRv() {
        List list;
        Context context = getContext();
        int i = ca1.g0;
        g0c a = qoi0.a(String.class);
        lj1 lj1Var = new lj1(context, 2);
        j01 j01Var = new j01(14);
        Class a2 = a.a();
        he7 he7Var = new he7(1, j01Var);
        ?? r7 = EmptyList.a;
        ?? qw8Var = new qw8(Collections.singletonList(new zxs(a2, 0, lj1Var, r7, he7Var, null)), 5);
        getBinding().e.setItemAnimator(null);
        getBinding().e.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().e.setAdapter(qw8Var);
        ScootersOnboardingAgreement scootersOnboardingAgreement = this.exp.d;
        if (scootersOnboardingAgreement != null && (list = scootersOnboardingAgreement.b) != null) {
            List<AgreementPoint> list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (AgreementPoint agreementPoint : list2) {
                ScootersOnboardingExperiment scootersOnboardingExperiment = this.exp;
                String str = agreementPoint.a;
                if (str == null) {
                    str = "";
                }
                arrayList.add(d6z.Y(scootersOnboardingExperiment, str));
            }
            r7 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str2 = (String) next;
                if (str2 != null && str2.length() != 0) {
                    r7.add(next);
                }
            }
        }
        qw8Var.submitList(r7, null);
    }

    private final void initTerms() {
        Context context = getContext();
        ScootersAgreementModalView$initTerms$adapter$1 scootersAgreementModalView$initTerms$adapter$1 = new ScootersAgreementModalView$initTerms$adapter$1(1, this.scootersAgreementNavigator, fxm0.class, "showWebView", "showWebView(Ljava/lang/String;)V", 0);
        int i = nj1.Z;
        g0c a = qoi0.a(axm0.class);
        int i2 = 1;
        lj1 lj1Var = new lj1(context, i2);
        int i3 = 4;
        a0 a0Var = new a0(i3, scootersAgreementModalView$initTerms$adapter$1);
        qw8 qw8Var = new qw8(Collections.singletonList(new zxs(a.a(), 0, lj1Var, EmptyList.a, new he7(i2, a0Var), null)), i3);
        getBinding().f.setLayoutManager(new LinearLayoutManager(getContext()));
        getBinding().f.setAdapter(qw8Var);
        qw8Var.submitList(getTermsList(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersAgreementModalView scootersAgreementModalView) {
        ((ixm0) scootersAgreementModalView.scootersAgreementNavigator).a.r(new qu(9));
        scootersAgreementModalView.rentContractAnalytics.a(ScootersRentContractAnalytics$ButtonName.Close, scootersAgreementModalView.onboardingType, null);
        xro0 xro0Var = scootersAgreementModalView.rentContractAnalytics;
        xro0Var.getClass();
        xro0Var.a.a("ScootersRentContract.Closed", new HashMap(), 1, new HashMap());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public kxm0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(srh0.scooters_agreement_view, parent, false);
        int i = qfh0.accept_all;
        ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) cma1.O(i, inflate);
        if (listItemSwitchComponent != null) {
            i = qfh0.accept_rules;
            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
            if (recyclerView != null) {
                i = qfh0.agree_btn;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = qfh0.rv;
                    RecyclerView recyclerView2 = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView2 != null) {
                        i = qfh0.terms;
                        RecyclerView recyclerView3 = (RecyclerView) cma1.O(i, inflate);
                        if (recyclerView3 != null) {
                            i = qfh0.title;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                i = qfh0.toolbar;
                                ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                                if (toolbarComponent != null) {
                                    return new kxm0((GoConstraintLayout) inflate, listItemSwitchComponent, recyclerView, buttonComponent, recyclerView2, recyclerView3, robotoTextView, toolbarComponent);
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
    public a230 insetsType() {
        return new a230(3, new ScootersAgreementModalView$insetsType$1(getBinding(), kxm0.class, "toolbar", "getToolbar()Lru/yandex/taxi/design/ToolbarComponent;", 0), new ScootersAgreementModalView$insetsType$2(0, getBinding(), kxm0.class, "getRoot", "getRoot()Lcom/yandex/go/design/view/GoConstraintLayout;", 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        RobotoTextView robotoTextView = getBinding().g;
        ScootersOnboardingExperiment scootersOnboardingExperiment = this.exp;
        ScootersOnboardingAgreement scootersOnboardingAgreement = scootersOnboardingExperiment.d;
        String str = scootersOnboardingAgreement != null ? scootersOnboardingAgreement.a : null;
        robotoTextView.setText(str != null ? d6z.Y(scootersOnboardingExperiment, str) : "");
        this.scootersAgreementPresenter.Bg(new cxm0(this));
        ButtonComponent buttonComponent = access$getBinding(this).d;
        CharSequence charSequence = this.buttonTextOverride;
        if (charSequence == null) {
            ScootersOnboardingExperiment scootersOnboardingExperiment2 = this.exp;
            ScootersOnboardingAgreement scootersOnboardingAgreement2 = this.exp.d;
            String str2 = scootersOnboardingAgreement2 != null ? scootersOnboardingAgreement2.d : null;
            charSequence = str2 != null ? d6z.Y(scootersOnboardingExperiment2, str2) : "";
        }
        buttonComponent.setText(charSequence);
        final int i2 = 1;
        access$getBinding(this).d.setDebounceClickListener(new Runnable(this) { // from class: bxm0
            public final /* synthetic */ ScootersAgreementModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                xro0 xro0Var;
                String str3;
                hxm0 hxm0Var;
                String str4;
                fxm0 fxm0Var;
                xro0 xro0Var2;
                int i3 = i2;
                ScootersAgreementModalView scootersAgreementModalView = this.b;
                switch (i3) {
                    case 0:
                        ScootersAgreementModalView.onAttachedToWindow$lambda$0(scootersAgreementModalView);
                        break;
                    default:
                        xro0Var = scootersAgreementModalView.rentContractAnalytics;
                        ScootersRentContractAnalytics$ButtonName scootersRentContractAnalytics$ButtonName = ScootersRentContractAnalytics$ButtonName.BackToBooking;
                        str3 = scootersAgreementModalView.onboardingType;
                        xro0Var.a(scootersRentContractAnalytics$ButtonName, str3, null);
                        hxm0Var = scootersAgreementModalView.scootersAgreementPresenter;
                        str4 = scootersAgreementModalView.onboardingType;
                        qwo0 qwo0Var = hxm0Var.x.a;
                        sme0 sme0Var = qwo0Var.c;
                        kgx[] kgxVarArr = qwo0.B;
                        qwo0Var.c.setValue(qwo0Var, kgxVarArr[1], v4r0.i((Set) sme0Var.getValue(qwo0Var, kgxVarArr[1]), str4));
                        fxm0Var = scootersAgreementModalView.scootersAgreementNavigator;
                        ((ixm0) fxm0Var).a.r(new umm0(19));
                        xro0Var2 = scootersAgreementModalView.rentContractAnalytics;
                        xro0Var2.getClass();
                        xro0Var2.a.a("ScootersRentContract.Closed", new HashMap(), 1, new HashMap());
                        break;
                }
            }
        });
        hxm0 hxm0Var = this.scootersAgreementPresenter;
        List<jxm0> switchesList = getSwitchesList();
        hxm0Var.getClass();
        hxm0Var.y = new ArrayList(switchesList);
        if (switchesList.isEmpty()) {
            ((exm0) hxm0Var.Dg()).Gd();
            ((exm0) hxm0Var.Dg()).n2(true);
        } else {
            ((exm0) hxm0Var.Dg()).xa();
        }
        getBinding().h.setOnCloseClickListener(new Runnable(this) { // from class: bxm0
            public final /* synthetic */ ScootersAgreementModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                xro0 xro0Var;
                String str3;
                hxm0 hxm0Var2;
                String str4;
                fxm0 fxm0Var;
                xro0 xro0Var2;
                int i3 = i;
                ScootersAgreementModalView scootersAgreementModalView = this.b;
                switch (i3) {
                    case 0:
                        ScootersAgreementModalView.onAttachedToWindow$lambda$0(scootersAgreementModalView);
                        break;
                    default:
                        xro0Var = scootersAgreementModalView.rentContractAnalytics;
                        ScootersRentContractAnalytics$ButtonName scootersRentContractAnalytics$ButtonName = ScootersRentContractAnalytics$ButtonName.BackToBooking;
                        str3 = scootersAgreementModalView.onboardingType;
                        xro0Var.a(scootersRentContractAnalytics$ButtonName, str3, null);
                        hxm0Var2 = scootersAgreementModalView.scootersAgreementPresenter;
                        str4 = scootersAgreementModalView.onboardingType;
                        qwo0 qwo0Var = hxm0Var2.x.a;
                        sme0 sme0Var = qwo0Var.c;
                        kgx[] kgxVarArr = qwo0.B;
                        qwo0Var.c.setValue(qwo0Var, kgxVarArr[1], v4r0.i((Set) sme0Var.getValue(qwo0Var, kgxVarArr[1]), str4));
                        fxm0Var = scootersAgreementModalView.scootersAgreementNavigator;
                        ((ixm0) fxm0Var).a.r(new umm0(19));
                        xro0Var2 = scootersAgreementModalView.rentContractAnalytics;
                        xro0Var2.getClass();
                        xro0Var2.a.a("ScootersRentContract.Closed", new HashMap(), 1, new HashMap());
                        break;
                }
            }
        });
        initRv();
        initTerms();
        initAcceptList();
        getBinding().d.setTextTypeface(3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        ((ixm0) this.scootersAgreementNavigator).a.r(new qu(9));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersAgreementPresenter.Cg();
    }
}
