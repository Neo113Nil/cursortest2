package com.yandex.payment.divkit.results;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.results.DKResultFragment;
import defpackage.azj0;
import defpackage.cnk;
import defpackage.ds31;
import defpackage.dzf;
import defpackage.eja1;
import defpackage.i3y;
import defpackage.i891;
import defpackage.j9f;
import defpackage.jl40;
import defpackage.npa0;
import defpackage.nx;
import defpackage.ny61;
import defpackage.omk;
import defpackage.ong0;
import defpackage.oxe;
import defpackage.q5z;
import defpackage.rwo;
import defpackage.sls;
import defpackage.stf;
import defpackage.tc5;
import defpackage.tje;
import defpackage.u131;
import defpackage.ujk;
import defpackage.ulh0;
import defpackage.utf;
import defpackage.vtf;
import defpackage.vyj0;
import defpackage.xxk;
import defpackage.yr31;
import defpackage.zmk;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import ru.CryptoPro.JCP.tools.Platform;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001[B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010\u001fJ?\u0010%\u001a\u00020\b2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010NR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010NR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010/\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006\\"}, d2 = {"Lcom/yandex/payment/divkit/results/DKResultFragment;", "Landroidx/fragment/app/Fragment;", "Lazj0;", "Lvyj0;", "<init>", "()V", "Lstf;", "callbacks", "Lzy11;", "setCallback", "(Lstf;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/yandex/payment/common/result/ResultType;", Constants.KEY_DATA, "setupData", "(Lcom/yandex/payment/common/result/ResultType;)V", "Lkotlin/Function0;", "getMainAction", "()Lsls;", "getExtraAction", "getBackAction", "mainButtonAction", "extraButtonAction", "backButtonAction", "setButtonsActions", "(Lsls;Lsls;Lsls;)V", "Lcnk;", "divData", "observeDivData", "(Lcnk;)V", "observeDivActions", "Lstf;", "Ltc5;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Ltc5;", "activityViewModel", "Lcom/yandex/div/core/view2/Div2View;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "Lnpa0;", "_binding", "Lnpa0;", "Lnx;", "actionFlowReceiver", "Lnx;", "getActionFlowReceiver", "()Lnx;", "setActionFlowReceiver", "(Lnx;)V", "Lrwo;", "eventReporter", "Lrwo;", "getEventReporter", "()Lrwo;", "setEventReporter", "(Lrwo;)V", "Lujk;", "divConfiguration", "Lujk;", "getDivConfiguration", "()Lujk;", "setDivConfiguration", "(Lujk;)V", "Lsls;", "Ljava/lang/Runnable;", "finishRunnable", "Ljava/lang/Runnable;", "Lcom/yandex/div/core/Div2Context;", "divContext$delegate", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "getBinding", "()Lnpa0;", "binding", "Companion", Platform.CP_UTF8_PATTERN, "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKResultFragment extends Fragment implements azj0, vyj0 {
    private static final String ARG_RESULT_TYPE = "ARG_RESULT_TYPE";
    public static final utf Companion = new utf();
    private static final String EXTRA_BUTTON_CLICK = "secondary_action";
    private static final String MAIN_BUTTON_CLICK = "primary_action";
    private npa0 _binding;
    public nx actionFlowReceiver;

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel;
    private sls backButtonAction;
    private stf callbacks;
    private Div2View div2View;
    public ujk divConfiguration;

    /* renamed from: divContext$delegate, reason: from kotlin metadata */
    private final i3y divContext;
    public rwo eventReporter;
    private sls extraButtonAction;
    private final Runnable finishRunnable = new oxe(6, this);
    private sls mainButtonAction;

    public DKResultFragment() {
        final int i = 0;
        this.activityViewModel = a.a(new sls(this) { // from class: ttf
            public final /* synthetic */ DKResultFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                Div2Context divContext_delegate$lambda$0;
                int i2 = i;
                DKResultFragment dKResultFragment = this.b;
                switch (i2) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKResultFragment.activityViewModel_delegate$lambda$0(dKResultFragment);
                        return activityViewModel_delegate$lambda$0;
                    default:
                        divContext_delegate$lambda$0 = DKResultFragment.divContext_delegate$lambda$0(dKResultFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
        final int i2 = 1;
        this.divContext = a.a(new sls(this) { // from class: ttf
            public final /* synthetic */ DKResultFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tc5 activityViewModel_delegate$lambda$0;
                Div2Context divContext_delegate$lambda$0;
                int i22 = i2;
                DKResultFragment dKResultFragment = this.b;
                switch (i22) {
                    case 0:
                        activityViewModel_delegate$lambda$0 = DKResultFragment.activityViewModel_delegate$lambda$0(dKResultFragment);
                        return activityViewModel_delegate$lambda$0;
                    default:
                        divContext_delegate$lambda$0 = DKResultFragment.divContext_delegate$lambda$0(dKResultFragment);
                        return divContext_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tc5 activityViewModel_delegate$lambda$0(DKResultFragment dKResultFragment) {
        stf stfVar = dKResultFragment.callbacks;
        if (stfVar == null) {
            stfVar = null;
        }
        return stfVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Div2Context divContext_delegate$lambda$0(DKResultFragment dKResultFragment) {
        return new Div2Context(dKResultFragment.requireActivity(), dKResultFragment.getDivConfiguration(), 0, dKResultFragment.getViewLifecycleOwner(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishRunnable$lambda$0(DKResultFragment dKResultFragment) {
        stf stfVar = dKResultFragment.callbacks;
        if (stfVar == null) {
            stfVar = null;
        }
        stfVar.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tc5 getActivityViewModel() {
        return (tc5) this.activityViewModel.getValue();
    }

    private final npa0 getBinding() {
        npa0 npa0Var = this._binding;
        if (npa0Var != null) {
            return npa0Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    private final Div2Context getDivContext() {
        return (Div2Context) this.divContext.getValue();
    }

    private final void observeDivActions() {
        tje.N(eja1.s(this), null, null, new DKResultFragment$observeDivActions$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeDivData(cnk divData) {
        Div2View div2View = this.div2View;
        if (div2View == null || !jl40.l(div2View.getParent(), getBinding().b)) {
            Div2View div2View2 = new Div2View(getDivContext(), null, 0, 6, null);
            div2View2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            div2View2.setId(View.generateViewId());
            this.div2View = div2View2;
        }
        if (getBinding().b.getChildCount() == 0) {
            getBinding().b.addView(this.div2View);
        }
        Div2View div2View3 = this.div2View;
        if (div2View3 != null) {
            omk omkVar = divData.a;
            div2View3.setData(omkVar, new zmk(omkVar.b));
        }
        Div2View div2View4 = this.div2View;
        if (div2View4 != null) {
            div2View4.post(new j9f(16, divData, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeDivData$lambda$1(cnk cnkVar, DKResultFragment dKResultFragment) {
        for (Pair pair : cnkVar.b) {
            String str = (String) pair.getFirst();
            String str2 = (String) pair.getSecond();
            Div2View div2View = dKResultFragment.div2View;
            if (div2View != null) {
                div2View.setVariable(str, str2);
            }
        }
    }

    public final nx getActionFlowReceiver() {
        nx nxVar = this.actionFlowReceiver;
        if (nxVar != null) {
            return nxVar;
        }
        return null;
    }

    @Override // defpackage.vyj0
    /* renamed from: getBackAction, reason: from getter */
    public sls getBackButtonAction() {
        return this.backButtonAction;
    }

    public final ujk getDivConfiguration() {
        ujk ujkVar = this.divConfiguration;
        if (ujkVar != null) {
            return ujkVar;
        }
        return null;
    }

    public final rwo getEventReporter() {
        rwo rwoVar = this.eventReporter;
        if (rwoVar != null) {
            return rwoVar;
        }
        return null;
    }

    @Override // defpackage.vyj0
    /* renamed from: getExtraAction, reason: from getter */
    public sls getExtraButtonAction() {
        return this.extraButtonAction;
    }

    @Override // defpackage.vyj0
    /* renamed from: getMainAction, reason: from getter */
    public sls getMainButtonAction() {
        return this.mainButtonAction;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        stf stfVar = this.callbacks;
        if (stfVar == null) {
            stfVar = null;
        }
        xxk xxkVar = (xxk) stfVar.b(this, xxk.class);
        requireActivity();
        requireActivity().getApplicationContext();
        requireActivity().getApplication();
        dzf dzfVar = (dzf) xxkVar;
        nx a = dzfVar.a();
        q5z.h(a);
        this.actionFlowReceiver = a;
        this.eventReporter = dzfVar.g;
        ujk b = dzfVar.b();
        q5z.h(b);
        this.divConfiguration = b;
        View inflate = inflater.inflate(ulh0.paymentsdk_dk_result_fragment, container, false);
        if (inflate == null) {
            ny61.t("rootView");
            return null;
        }
        LinearLayout linearLayout = (LinearLayout) inflate;
        this._binding = new npa0(linearLayout, linearLayout);
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        boolean h = i891.h(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
        getDivContext().getDivVariableController().i(new u131("isLightTheme", h));
        observeDivActions();
        tje.N(eja1.s(this), null, null, new DKResultFragment$onViewCreated$1(this, null), 3);
        ResultType resultType = (ResultType) requireArguments().getParcelable(ARG_RESULT_TYPE);
        Long valueOf = resultType != null ? Long.valueOf(resultType.getDelayToAutoHide()) : null;
        long longValue = valueOf != null ? valueOf.longValue() : 0L;
        if (longValue > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(this.finishRunnable, longValue);
        }
        stf stfVar = this.callbacks;
        if (stfVar == null) {
            stfVar = null;
        }
        yr31 l = stfVar.l();
        vtf vtfVar = l instanceof vtf ? (vtf) l : null;
        if (vtfVar != null) {
            if (resultType == null) {
                ny61.r("Required value was null.");
                return;
            } else {
                Context requireContext = requireContext();
                vtfVar.w = resultType;
                tje.N(ds31.a(vtfVar), null, null, new DKResultViewModel$loadAndShowDivJson$1(vtfVar, resultType, requireContext, h, null), 3);
            }
        }
        if ((resultType instanceof ResultType.Loading) || resultType == null) {
            return;
        }
        setupData(resultType);
    }

    public final void setActionFlowReceiver(nx nxVar) {
        this.actionFlowReceiver = nxVar;
    }

    @Override // defpackage.vyj0
    public void setButtonsActions(sls mainButtonAction, sls extraButtonAction, sls backButtonAction) {
        this.mainButtonAction = mainButtonAction;
        this.extraButtonAction = extraButtonAction;
        this.backButtonAction = backButtonAction;
    }

    @Override // defpackage.azj0
    public void setCallback(stf callbacks) {
        this.callbacks = callbacks;
    }

    public final void setDivConfiguration(ujk ujkVar) {
        this.divConfiguration = ujkVar;
    }

    public final void setEventReporter(rwo rwoVar) {
        this.eventReporter = rwoVar;
    }

    @Override // defpackage.azj0
    public void setupData(ResultType data) {
        String text;
        String text2;
        String text3;
        TextRes title = data.getTitle();
        String str = null;
        if (title instanceof TextRes.IntRes) {
            Context context = getContext();
            if (context != null) {
                text = context.getString(((TextRes.IntRes) title).getResId());
            }
            text = null;
        } else {
            if (title instanceof TextRes.StringText) {
                text = ((TextRes.StringText) title).getText();
            }
            text = null;
        }
        if (text == null) {
            text = "";
        }
        TextRes subtitle = data.getSubtitle();
        if (subtitle instanceof TextRes.IntRes) {
            Context context2 = getContext();
            if (context2 != null) {
                text2 = context2.getString(((TextRes.IntRes) subtitle).getResId());
            }
            text2 = null;
        } else {
            if (subtitle instanceof TextRes.StringText) {
                text2 = ((TextRes.StringText) subtitle).getText();
            }
            text2 = null;
        }
        if (text2 == null) {
            text2 = "";
        }
        TextRes mainButtonText = data.getMainButtonText();
        if (mainButtonText instanceof TextRes.IntRes) {
            Context context3 = getContext();
            if (context3 != null) {
                text3 = context3.getString(((TextRes.IntRes) mainButtonText).getResId());
            }
            text3 = null;
        } else {
            if (mainButtonText instanceof TextRes.StringText) {
                text3 = ((TextRes.StringText) mainButtonText).getText();
            }
            text3 = null;
        }
        if (text3 == null) {
            text3 = "";
        }
        TextRes extraButtonText = data.getExtraButtonText();
        if (extraButtonText instanceof TextRes.IntRes) {
            Context context4 = getContext();
            if (context4 != null) {
                str = context4.getString(((TextRes.IntRes) extraButtonText).getResId());
            }
        } else if (extraButtonText instanceof TextRes.StringText) {
            str = ((TextRes.StringText) extraButtonText).getText();
        }
        String str2 = str != null ? str : "";
        Div2View div2View = this.div2View;
        if (div2View != null) {
            div2View.setVariable("result_screen_screen_type", data.getType());
            div2View.setVariable("result_screen_has_back_button", String.valueOf(data.getIsBackButtonExist()));
            div2View.setVariable("result_screen_has_close_button", String.valueOf(data.getIsCloseButtonExist()));
            div2View.setVariable("result_screen_title_text", text);
            div2View.setVariable("result_screen_subtitle_text", text2);
            div2View.setVariable("result_screen_main_button_text", text3);
            div2View.setVariable("result_screen_complementary_button_text", str2);
            ResultScreenIdentifier identifier = data.getIdentifier();
            if (identifier != null) {
                div2View.setVariable("result_screen_identifier", identifier.getDescription());
            }
        }
    }
}
