package com.yandex.go.safety.center.instruction;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallScenario;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$EmergencyCallStatus;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$InstructionButtonAction;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$InstructionButtonStyle;
import com.yandex.go.safety.center.api.SafetyCenterConfig;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.a60;
import defpackage.ajl0;
import defpackage.bgb0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.csl0;
import defpackage.d660;
import defpackage.dmu;
import defpackage.evu0;
import defpackage.g18;
import defpackage.g4w;
import defpackage.gsl0;
import defpackage.hxx;
import defpackage.i4w;
import defpackage.i7h0;
import defpackage.ii30;
import defpackage.irl0;
import defpackage.m950;
import defpackage.mrg0;
import defpackage.n48;
import defpackage.nac;
import defpackage.ndl0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pep0;
import defpackage.ppl0;
import defpackage.q3h0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.scc;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.tse0;
import defpackage.vrl0;
import defpackage.vxj0;
import defpackage.w511;
import defpackage.wrl0;
import defpackage.xrl0;
import defpackage.y50;
import defpackage.yiz0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B5\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00105R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcom/yandex/go/safety/center/instruction/SafetyCenterInstructionView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lgsl0;", "Lvrl0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/safety/center/instruction/h;", "presenter", "Lpav;", "imageLoader", "Lyiz0;", "styleDelegate", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/content/Context;Lcom/yandex/go/safety/center/instruction/h;Lpav;Lyiz0;Landroid/app/Activity;)V", "Li4w;", "instruction", "Lzy11;", "renderSteps", "(Li4w;)V", "renderButtons", "renderNewOrderItemIfNeed", "", "withNumbers", "Lru/yandex/taxi/design/utils/DividerType;", "getDivider", "(Z)Lru/yandex/taxi/design/utils/DividerType;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "renderInstruction", "progressNewOrder", "Ld660;", "model", "renderNewOrderDialog", "(Ld660;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lgsl0;", "Lcom/yandex/go/safety/center/instruction/h;", "Lpav;", "Lyiz0;", "Landroid/app/Activity;", "Landroid/widget/LinearLayout;", "itemsContainer", "Landroid/widget/LinearLayout;", "Lcom/yandex/go/design/view/GoLinearLayout;", "content", "Lcom/yandex/go/design/view/GoLinearLayout;", "buttonsContainer", "Lru/yandex/taxi/widget/RobotoTextView;", "title", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/design/ListItemComponent;", "newOrderButton", "Lru/yandex/taxi/design/ListItemComponent;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lg18;", "imageCancellable", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterInstructionView extends SlideableBindingModalView<gsl0> implements vrl0 {
    private final Activity activity;
    private final FloatButtonIconComponent backButton;
    private final LinearLayout buttonsContainer;
    private final GoLinearLayout content;
    private g18 imageCancellable;
    private final pav imageLoader;
    private final LinearLayout itemsContainer;
    private ListItemComponent newOrderButton;
    private final h presenter;
    private final yiz0 styleDelegate;
    private final RobotoTextView title;

    public SafetyCenterInstructionView(Context context, h hVar, pav pavVar, yiz0 yiz0Var, Activity activity) {
        super(context);
        this.presenter = hVar;
        this.imageLoader = pavVar;
        this.styleDelegate = yiz0Var;
        this.activity = activity;
        this.itemsContainer = getBinding().e;
        this.content = getBinding().d;
        this.buttonsContainer = getBinding().b;
        this.title = getBinding().f;
        this.backButton = qdb1.b(this, new wrl0(hVar, 3));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
    }

    private final DividerType getDivider(boolean withNumbers) {
        return withNumbers ? DividerType.ICON_MARGIN : DividerType.MARGIN;
    }

    private final void renderButtons(i4w instruction) {
        this.buttonsContainer.removeAllViews();
        Iterator it = instruction.e.iterator();
        while (it.hasNext()) {
            g4w g4wVar = (g4w) it.next();
            ButtonComponent buttonComponent = (ButtonComponent) ru.yandex.taxi.design.utils.c.q(this.buttonsContainer, tjh0.safety_center_instruction_button, false);
            this.buttonsContainer.addView(buttonComponent);
            String str = g4wVar.a;
            SafetyCenterExperiment.ButtonStyle buttonStyle = g4wVar.b;
            buttonComponent.setText(str);
            buttonComponent.setButtonTitleColor(buttonStyle.getTextColor());
            buttonComponent.setButtonBackground(buttonStyle.getBackground());
            buttonComponent.setTextIcon(g4wVar.d);
            buttonComponent.setTextIconPadding((int) tje.x(getContext(), 4.0f));
            buttonComponent.setDebounceClickListener(new ajl0(3, this, g4wVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButtons$lambda$0(SafetyCenterInstructionView safetyCenterInstructionView, g4w g4wVar) {
        String str;
        SafetyCenterAnalytics$InstructionButtonAction safetyCenterAnalytics$InstructionButtonAction;
        SafetyCenterAnalytics$InstructionButtonStyle safetyCenterAnalytics$InstructionButtonStyle;
        h hVar = safetyCenterInstructionView.presenter;
        int i = g4wVar.c;
        com.yandex.go.safety.center.analytics.a aVar = hVar.L;
        y50 y50Var = hVar.E;
        ndl0 ndl0Var = hVar.K;
        SafetyCenterExperiment.Instruction instruction = hVar.J;
        SafetyCenterExperiment.Button button = (SafetyCenterExperiment.Button) instruction.g.get(i);
        SafetyCenterExperiment.Action action = button.c;
        if (action == null) {
            return;
        }
        int i2 = xrl0.a[action.ordinal()];
        if (i2 == 1) {
            SafetyCenterExperiment safetyCenterExperiment = hVar.A;
            SafetyCenterConfig d = hVar.B.d();
            if (d == null || (str = d.b) == null) {
                str = safetyCenterExperiment.g.a;
            }
            bgb0.j(((a60) y50Var).a, str);
            SafetyCenterExperiment.EmergencyTicket emergencyTicket = safetyCenterExperiment.e;
            int i3 = emergencyTicket.b;
            int i4 = emergencyTicket.a;
            aVar.d(SafetyCenterAnalytics$EmergencyCallStatus.WaitForAnswer, instruction instanceof n48 ? SafetyCenterAnalytics$EmergencyCallScenario.Accident : SafetyCenterAnalytics$EmergencyCallScenario.Instructions);
            tje.N(hVar.Jg(), null, null, new SafetyCenterInstructionPresenter$checkThatUserMakesCall$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.X(hVar.Mg(i3, false), new SafetyCenterInstructionPresenter$checkThatUserMakesCall$$inlined$flatMapLatest$1(null, hVar, i4)), com.yandex.go.coroutines.b.e(), null, hVar), 3);
            if (instruction instanceof n48) {
                hVar.O = !r5.f().isEmpty();
                ppl0 ppl0Var = aVar.a;
                ppl0Var.a.a("SafetyCenter.CarCrash.CallTapped", tse0.o(ppl0Var), 1, new HashMap());
            }
        } else if (i2 == 2) {
            String Lg = hVar.Lg(button.e);
            if (Lg != null && Lg.length() != 0) {
                bgb0.j(((a60) y50Var).a, Lg);
            }
        } else if (i2 == 3) {
            String Lg2 = hVar.Lg(button.d);
            if (Lg2 != null && Lg2.length() != 0) {
                csl0 csl0Var = (csl0) ndl0Var.b;
                csl0Var.r(new vxj0(18, csl0Var, Lg2));
            }
        } else if (i2 != 4) {
            w511.b();
            return;
        } else {
            csl0 csl0Var2 = (csl0) ndl0Var.b;
            ((pep0) csl0Var2.N).f((m950) csl0Var2.M.get(), new dmu(true), hxx.a);
            csl0Var2.r(new qu(9));
        }
        String str2 = instruction.a;
        SafetyCenterExperiment.ButtonStyle buttonStyle = button.b;
        ppl0 ppl0Var2 = aVar.a;
        int i5 = irl0.b[action.ordinal()];
        if (i5 == 1) {
            safetyCenterAnalytics$InstructionButtonAction = SafetyCenterAnalytics$InstructionButtonAction.CallEmergency;
        } else if (i5 == 2) {
            safetyCenterAnalytics$InstructionButtonAction = SafetyCenterAnalytics$InstructionButtonAction.CallDriver;
        } else if (i5 == 3) {
            safetyCenterAnalytics$InstructionButtonAction = SafetyCenterAnalytics$InstructionButtonAction.ContactSupport;
        } else {
            if (i5 != 4) {
                w511.b();
                return;
            }
            safetyCenterAnalytics$InstructionButtonAction = SafetyCenterAnalytics$InstructionButtonAction.CallAnyNumber;
        }
        int i6 = irl0.c[buttonStyle.ordinal()];
        if (i6 == 1) {
            safetyCenterAnalytics$InstructionButtonStyle = SafetyCenterAnalytics$InstructionButtonStyle.Red;
        } else if (i6 == 2) {
            safetyCenterAnalytics$InstructionButtonStyle = SafetyCenterAnalytics$InstructionButtonStyle.Yellow;
        } else {
            if (i6 != 3) {
                w511.b();
                return;
            }
            safetyCenterAnalytics$InstructionButtonStyle = SafetyCenterAnalytics$InstructionButtonStyle.Gray;
        }
        ppl0Var2.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("instruction_id", str2);
        hashMap.put("action", safetyCenterAnalytics$InstructionButtonAction.getEventValue());
        hashMap.put("style", safetyCenterAnalytics$InstructionButtonStyle.getEventValue());
        ppl0Var2.a.a("SafetyCenter.Instruction.ButtonTapped", hashMap, 2, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderNewOrderDialog$onMakeNewOrderClick(h hVar) {
        ((vrl0) hVar.Dg()).progressNewOrder();
        tje.N(hVar.Jg(), null, null, new SafetyCenterInstructionPresenter$onMakeNewOrderClick$1(hVar, null), 3);
    }

    private final void renderNewOrderItemIfNeed(i4w instruction) {
        String str = instruction.f;
        if (str == null || evu0.J(str) || this.itemsContainer.getChildCount() == 0) {
            return;
        }
        View q = ru.yandex.taxi.design.utils.c.q(this.itemsContainer, tjh0.safety_center_instruction_cancel_item, false);
        ListItemComponent listItemComponent = (ListItemComponent) q;
        this.newOrderButton = listItemComponent;
        listItemComponent.setDividers(DividerPosition.TOP, getDivider(instruction.c));
        listItemComponent.setTitle(instruction.f);
        listItemComponent.setDebounceClickListener(new wrl0(this.presenter, 4));
        this.itemsContainer.addView(q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderNewOrderItemIfNeed$onNewOrderClick(h hVar) {
        vrl0 vrl0Var = (vrl0) hVar.Dg();
        SafetyCenterExperiment safetyCenterExperiment = hVar.A;
        vrl0Var.renderNewOrderDialog(new d660(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_TITLE), safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_DESCRIPTION), safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_YES), safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.CRASH_DETECTION_REQUEST_NEW_RIDE_CONFIRM_NO)));
    }

    private final void renderSteps(i4w instruction) {
        boolean z = instruction.c;
        DividerType divider = getDivider(z);
        ArrayList arrayList = instruction.d;
        this.itemsContainer.removeAllViews();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str = (String) obj;
            ListItemComponent listItemComponent = (ListItemComponent) ru.yandex.taxi.design.utils.c.q(this.itemsContainer, tjh0.safety_center_instruction_step_item, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            int G = evu0.G(str, '\n', 0, 6);
            if (G > 0) {
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, G, 0);
            }
            listItemComponent.setTitle(spannableStringBuilder);
            if (z) {
                listItemComponent.setLeadView(new NumberInCircleView(getContext(), i2));
                listItemComponent.setLeadContainerClickListener(null);
                listItemComponent.setLeadVerticalGravity(1);
            }
            if (i != scc.f(arrayList)) {
                listItemComponent.setDividers(DividerPosition.BOTTOM, divider);
            }
            listItemComponent.setVerticalPadding(tje.r(mrg0.go_design_m_space, getContext()));
            this.itemsContainer.addView(listItemComponent);
            i = i2;
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ListItemComponent listItemComponent = (ListItemComponent) this.itemsContainer.findViewById(i7h0.safety_center_cancel_order);
        if (listItemComponent != null) {
            listItemComponent.setLeadImage(q3h0.ic_taxicar);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public gsl0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(tjh0.safety_center_instruction_view, parent, false);
        int i = i7h0.buttons_container;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = i7h0.image;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                GoLinearLayout goLinearLayout = (GoLinearLayout) inflate;
                i = i7h0.safety_center_items;
                LinearLayout linearLayout2 = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout2 != null) {
                    i = i7h0.safety_center_scroll_view;
                    if (((NestedScrollViewAdvanced) cma1.O(i, inflate)) != null) {
                        i = i7h0.scroll_indicator_shadow;
                        if (((ShadowScrollIndicator) cma1.O(i, inflate)) != null) {
                            i = i7h0.title;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView != null) {
                                return new gsl0(goLinearLayout, linearLayout, imageView, goLinearLayout, linearLayout2, robotoTextView);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        this.title.setTypeface(this.styleDelegate.a(getContext()));
        RobotoTextView robotoTextView = this.title;
        this.styleDelegate.getClass();
        robotoTextView.setTextSize(24.0f);
        RobotoTextView robotoTextView2 = this.title;
        this.styleDelegate.getClass();
        robotoTextView2.setLineHeight((int) tje.b0(getContext(), 27.0f));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        g18 g18Var = this.imageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // defpackage.vrl0
    public void progressNewOrder() {
        ListItemComponent listItemComponent = this.newOrderButton;
        if (listItemComponent != null) {
            listItemComponent.startProgressAnimation();
            listItemComponent.setEnabled(false);
        }
    }

    @Override // defpackage.vrl0
    public void renderInstruction(i4w instruction) {
        post(new ce0(this, 15));
        this.title.setText(instruction.a);
        String str = instruction.b;
        if (str != null) {
            g18 g18Var = this.imageCancellable;
            if (g18Var != null) {
                g18Var.cancel();
            }
            this.imageCancellable = ((nac) this.imageLoader.a(getBinding().c)).c(str);
        }
        renderSteps(instruction);
        renderButtons(instruction);
        renderNewOrderItemIfNeed(instruction);
        OneShotPreDrawListener.add(this, new ii30(21, this));
    }

    @Override // defpackage.vrl0
    public void renderNewOrderDialog(d660 model) {
        new AlertDialog(this.activity).setTitle(model.a).setMessage(model.b).setPositiveButton(model.c, new wrl0(this.presenter, 2)).setNegativeButton(model.d).show();
    }
}
