package com.yandex.go.taxi.order.chat.call_feedback.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.BadFeedback;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackExperiment;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackNotification;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackTexts;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.GeneralFeedback;
import com.yandex.go.taxi.order.chat.call_feedback.experiments.GoodFeedback;
import com.yandex.go.taxi.order.chat.call_feedback.ui.CallFeedbackQuestionModalView;
import defpackage.c06;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.jh7;
import defpackage.js4;
import defpackage.kh7;
import defpackage.kyh0;
import defpackage.m2v;
import defpackage.mh7;
import defpackage.mrg0;
import defpackage.n8h0;
import defpackage.ny61;
import defpackage.o61;
import defpackage.oh7;
import defpackage.pj;
import defpackage.qje;
import defpackage.sh60;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse0;
import defpackage.xkh0;
import defpackage.xng0;
import java.util.HashMap;
import java.util.function.Consumer;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SegmentedComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006$"}, d2 = {"Lcom/yandex/go/taxi/order/chat/call_feedback/ui/CallFeedbackQuestionModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Loh7;", "Landroid/content/Context;", "context", "Lkh7;", "callFeedbackQuestionPresenter", "Lkotlin/Function1;", "Lsh60;", "Lzy11;", "onFeedbackDone", "Lkotlin/Function0;", "onDismiss", "<init>", "(Landroid/content/Context;Lkh7;Ltls;Lsls;)V", "Landroid/widget/TextView;", "textView", "setTitleTextSize", "(Landroid/widget/TextView;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Loh7;", "dismiss", "()V", "onAttachedToWindow", "onDetachedFromWindow", "", "settlingLayoutChanges", "()Z", "Lkh7;", "Ltls;", "Lsls;", "com/yandex/go/taxi/order/chat/call_feedback/ui/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallFeedbackQuestionModalView extends SlideableBindingModalView<oh7> {
    private final kh7 callFeedbackQuestionPresenter;
    private final sls onDismiss;
    private final tls onFeedbackDone;

    public CallFeedbackQuestionModalView(Context context, kh7 kh7Var, tls tlsVar, sls slsVar) {
        super(context);
        this.callFeedbackQuestionPresenter = kh7Var;
        this.onFeedbackDone = tlsVar;
        this.onDismiss = slsVar;
    }

    public static final /* synthetic */ oh7 access$getBinding(CallFeedbackQuestionModalView callFeedbackQuestionModalView) {
        return callFeedbackQuestionModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onAttachedToWindow$sendTapped(kh7 kh7Var) {
        String str;
        sh60 sh60Var;
        CallFeedbackNotification callFeedbackNotification;
        CallFeedbackNotification callFeedbackNotification2;
        String str2;
        CallFeedbackNotification callFeedbackNotification3;
        CallFeedbackNotification callFeedbackNotification4;
        m2v m2vVar = kh7Var.w;
        c06 c06Var = (c06) m2vVar.c;
        mh7 mh7Var = (mh7) m2vVar.w;
        String str3 = (String) mh7Var.a.getValue();
        int i = mh7Var.c;
        String str4 = mh7Var.b;
        pj pjVar = (pj) c06Var.a;
        Integer valueOf = Integer.valueOf(i);
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            hashMap.put("dialed_phone_number", str3);
        }
        hashMap.put("rating", valueOf);
        pjVar.a.a("CallQualityCard.Tapped", hashMap, 1, new HashMap());
        if (str4.length() > 0) {
            o61 o61Var = (o61) c06Var.b;
            o61Var.getClass();
            HashMap hashMap2 = new HashMap();
            if (str3 != null) {
                hashMap2.put("dialed_phone_number", str3);
            }
            o61Var.a.a("CallQualityCardReasons.Tapped", hashMap2, 1, tse0.r("reason_text", hashMap2, str4));
        }
        jh7 jh7Var = (jh7) kh7Var.Dg();
        int i2 = mh7Var.c;
        String str5 = null;
        if (i2 == 0) {
            CallFeedbackExperiment p = m2vVar.p();
            if (p != null) {
                CallFeedbackTexts callFeedbackTexts = p.d;
                BadFeedback a = callFeedbackTexts != null ? callFeedbackTexts.getA() : null;
                if (a != null && (callFeedbackNotification4 = a.c) != null) {
                    str2 = callFeedbackNotification4.a;
                    String q = m2vVar.q(p, str2, kyh0.call_feedback_notification_bad_title);
                    if (p != null) {
                        CallFeedbackTexts callFeedbackTexts2 = p.d;
                        BadFeedback a2 = callFeedbackTexts2 != null ? callFeedbackTexts2.getA() : null;
                        if (a2 != null && (callFeedbackNotification3 = a2.c) != null) {
                            str5 = callFeedbackNotification3.b;
                        }
                    }
                    sh60Var = new sh60(q, m2vVar.q(p, str5, kyh0.call_feedback_notification_bad_subtitle));
                }
            }
            str2 = null;
            String q2 = m2vVar.q(p, str2, kyh0.call_feedback_notification_bad_title);
            if (p != null) {
            }
            sh60Var = new sh60(q2, m2vVar.q(p, str5, kyh0.call_feedback_notification_bad_subtitle));
        } else {
            CallFeedbackExperiment p2 = m2vVar.p();
            if (p2 != null) {
                CallFeedbackTexts callFeedbackTexts3 = p2.d;
                GoodFeedback b = callFeedbackTexts3 != null ? callFeedbackTexts3.getB() : null;
                if (b != null && (callFeedbackNotification2 = b.b) != null) {
                    str = callFeedbackNotification2.a;
                    String q3 = m2vVar.q(p2, str, kyh0.call_feedback_notification_good_title);
                    if (p2 != null) {
                        CallFeedbackTexts callFeedbackTexts4 = p2.d;
                        GoodFeedback b2 = callFeedbackTexts4 != null ? callFeedbackTexts4.getB() : null;
                        if (b2 != null && (callFeedbackNotification = b2.b) != null) {
                            str5 = callFeedbackNotification.b;
                        }
                    }
                    sh60Var = new sh60(q3, m2vVar.q(p2, str5, kyh0.call_feedback_notification_good_subtitle));
                }
            }
            str = null;
            String q32 = m2vVar.q(p2, str, kyh0.call_feedback_notification_good_title);
            if (p2 != null) {
            }
            sh60Var = new sh60(q32, m2vVar.q(p2, str5, kyh0.call_feedback_notification_good_subtitle));
        }
        jh7Var.V5(sh60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleTextSize(TextView textView) {
        textView.setTextSize(0, tje.r(mrg0.component_text_size_title, getContext()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public oh7 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(xkh0.call_feedback_view, parent, false);
        int i = n8h0.bad_btn;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = n8h0.bad_feedback_group;
            Group group = (Group) cma1.O(i, inflate);
            if (group != null) {
                i = n8h0.feedback_subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = n8h0.feedback_title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        i = n8h0.general_group;
                        Group group2 = (Group) cma1.O(i, inflate);
                        if (group2 != null) {
                            i = n8h0.good_btn;
                            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                            if (buttonComponent2 != null) {
                                i = n8h0.good_feedback_group;
                                Group group3 = (Group) cma1.O(i, inflate);
                                if (group3 != null) {
                                    i = n8h0.rv;
                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                    if (recyclerView != null) {
                                        i = n8h0.segmented_view;
                                        SegmentedComponent segmentedComponent = (SegmentedComponent) cma1.O(i, inflate);
                                        if (segmentedComponent != null) {
                                            i = n8h0.send_btn;
                                            ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i, inflate);
                                            if (buttonComponent3 != null) {
                                                i = n8h0.skip_btn;
                                                ButtonComponent buttonComponent4 = (ButtonComponent) cma1.O(i, inflate);
                                                if (buttonComponent4 != null) {
                                                    return new oh7((ConstraintLayout) inflate, buttonComponent, group, robotoTextView, robotoTextView2, group2, buttonComponent2, group3, recyclerView, segmentedComponent, buttonComponent3, buttonComponent4);
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

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        this.onDismiss.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        String str;
        String str2;
        String str3;
        CallFeedbackTexts callFeedbackTexts;
        CallFeedbackTexts callFeedbackTexts2;
        super.onAttachedToWindow();
        post(new ce0(this, 15));
        getBinding().j.setBackgroundRectColor(qje.t(xng0.controlMinor, getContext()));
        kh7 kh7Var = this.callFeedbackQuestionPresenter;
        b bVar = new b(this);
        kh7Var.Bg(bVar);
        m2v m2vVar = kh7Var.w;
        CallFeedbackExperiment p = m2vVar.p();
        String str4 = null;
        if (p != null) {
            CallFeedbackTexts callFeedbackTexts3 = p.d;
            GeneralFeedback c = callFeedbackTexts3 != null ? callFeedbackTexts3.getC() : null;
            if (c != null) {
                str = c.a;
                String q = m2vVar.q(p, str, kyh0.call_feedback_question_title);
                if (p != null) {
                    CallFeedbackTexts callFeedbackTexts4 = p.d;
                    GeneralFeedback c2 = callFeedbackTexts4 != null ? callFeedbackTexts4.getC() : null;
                    if (c2 != null) {
                        str2 = c2.b;
                        String q2 = m2vVar.q(p, str2, kyh0.call_feedback_question_subtitle);
                        String r = m2v.r(p, (p != null || (callFeedbackTexts2 = p.d) == null) ? null : callFeedbackTexts2.getE(), "👍");
                        if (p != null && (callFeedbackTexts = p.d) != null) {
                            str4 = callFeedbackTexts.getD();
                        }
                        String r2 = m2v.r(p, str4, "👎");
                        oh7 access$getBinding = access$getBinding(this);
                        access$getBinding.e.setText(q);
                        access$getBinding.d.setText(q2);
                        access$getBinding.g.setText(r);
                        access$getBinding.b.setText(r2);
                        final int i = 0;
                        Consumer consumer = new Consumer(this) { // from class: ih7
                            public final /* synthetic */ CallFeedbackQuestionModalView b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                kh7 kh7Var2;
                                kh7 kh7Var3;
                                int i2 = i;
                                CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                                switch (i2) {
                                    case 0:
                                        RobotoTextView robotoTextView = (RobotoTextView) obj;
                                        robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                        robotoTextView.setAlpha(1.0f);
                                        break;
                                    case 1:
                                        RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                                        robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                                        robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                        robotoTextView2.setAlpha(0.4f);
                                        break;
                                    default:
                                        int intValue = ((Integer) obj).intValue();
                                        if (intValue == 0) {
                                            kh7Var2 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                            kh7Var2.Ig();
                                            break;
                                        } else if (intValue == 1) {
                                            kh7Var3 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                            kh7Var3.Hg();
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        final int i2 = 1;
                        Consumer consumer2 = new Consumer(this) { // from class: ih7
                            public final /* synthetic */ CallFeedbackQuestionModalView b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                kh7 kh7Var2;
                                kh7 kh7Var3;
                                int i22 = i2;
                                CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                                switch (i22) {
                                    case 0:
                                        RobotoTextView robotoTextView = (RobotoTextView) obj;
                                        robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                        robotoTextView.setAlpha(1.0f);
                                        break;
                                    case 1:
                                        RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                                        robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                                        robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                        robotoTextView2.setAlpha(0.4f);
                                        break;
                                    default:
                                        int intValue = ((Integer) obj).intValue();
                                        if (intValue == 0) {
                                            kh7Var2 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                            kh7Var2.Ig();
                                            break;
                                        } else if (intValue == 1) {
                                            kh7Var3 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                            kh7Var3.Hg();
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        access$getBinding(this).j.addCustomViewTab(bVar.h(r), consumer, consumer2);
                        access$getBinding(this).j.addCustomViewTab(bVar.h(r2), consumer, consumer2);
                        access$getBinding(this).j.setTabsPadding(0);
                        final int i3 = 2;
                        access$getBinding(this).j.setUserSelectionChangeListener(new Consumer(this) { // from class: ih7
                            public final /* synthetic */ CallFeedbackQuestionModalView b;

                            {
                                this.b = this;
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                kh7 kh7Var2;
                                kh7 kh7Var3;
                                int i22 = i3;
                                CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                                switch (i22) {
                                    case 0:
                                        RobotoTextView robotoTextView = (RobotoTextView) obj;
                                        robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                        robotoTextView.setAlpha(1.0f);
                                        break;
                                    case 1:
                                        RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                                        robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                                        robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                        robotoTextView2.setAlpha(0.4f);
                                        break;
                                    default:
                                        int intValue = ((Integer) obj).intValue();
                                        if (intValue == 0) {
                                            kh7Var2 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                            kh7Var2.Ig();
                                            break;
                                        } else if (intValue == 1) {
                                            kh7Var3 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                            kh7Var3.Hg();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        access$getBinding.h.setVisibility(8);
                        access$getBinding.c.setVisibility(8);
                        access$getBinding.f.setVisibility(0);
                        c06 c06Var = (c06) m2vVar.c;
                        str3 = (String) ((mh7) m2vVar.w).a.getValue();
                        pj pjVar = (pj) c06Var.a;
                        pjVar.getClass();
                        HashMap hashMap = new HashMap();
                        if (str3 != null) {
                            hashMap.put("dialed_phone_number", str3);
                        }
                        pjVar.a.a("CallQualityCard.Shown", hashMap, 1, new HashMap());
                        ButtonComponent buttonComponent = getBinding().g;
                        final kh7 kh7Var2 = this.callFeedbackQuestionPresenter;
                        buttonComponent.setDebounceClickListener(new Runnable() { // from class: hh7
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = i;
                                kh7 kh7Var3 = kh7Var2;
                                switch (i4) {
                                    case 0:
                                        kh7Var3.Ig();
                                        break;
                                    case 1:
                                        kh7Var3.Hg();
                                        break;
                                    default:
                                        CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var3);
                                        break;
                                }
                            }
                        });
                        ButtonComponent buttonComponent2 = getBinding().b;
                        final kh7 kh7Var3 = this.callFeedbackQuestionPresenter;
                        buttonComponent2.setDebounceClickListener(new Runnable() { // from class: hh7
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = i2;
                                kh7 kh7Var32 = kh7Var3;
                                switch (i4) {
                                    case 0:
                                        kh7Var32.Ig();
                                        break;
                                    case 1:
                                        kh7Var32.Hg();
                                        break;
                                    default:
                                        CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var32);
                                        break;
                                }
                            }
                        });
                        getBinding().l.setDebounceClickListener(new js4(23, this));
                        ButtonComponent buttonComponent3 = getBinding().k;
                        final kh7 kh7Var4 = this.callFeedbackQuestionPresenter;
                        buttonComponent3.setDebounceClickListener(new Runnable() { // from class: hh7
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = i3;
                                kh7 kh7Var32 = kh7Var4;
                                switch (i4) {
                                    case 0:
                                        kh7Var32.Ig();
                                        break;
                                    case 1:
                                        kh7Var32.Hg();
                                        break;
                                    default:
                                        CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var32);
                                        break;
                                }
                            }
                        });
                        setTitleTextSize(getBinding().g);
                        setTitleTextSize(getBinding().b);
                    }
                }
                str2 = null;
                String q22 = m2vVar.q(p, str2, kyh0.call_feedback_question_subtitle);
                String r3 = m2v.r(p, (p != null || (callFeedbackTexts2 = p.d) == null) ? null : callFeedbackTexts2.getE(), "👍");
                if (p != null) {
                    str4 = callFeedbackTexts.getD();
                }
                String r22 = m2v.r(p, str4, "👎");
                oh7 access$getBinding2 = access$getBinding(this);
                access$getBinding2.e.setText(q);
                access$getBinding2.d.setText(q22);
                access$getBinding2.g.setText(r3);
                access$getBinding2.b.setText(r22);
                final int i4 = 0;
                Consumer consumer3 = new Consumer(this) { // from class: ih7
                    public final /* synthetic */ CallFeedbackQuestionModalView b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        kh7 kh7Var22;
                        kh7 kh7Var32;
                        int i22 = i4;
                        CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                        switch (i22) {
                            case 0:
                                RobotoTextView robotoTextView = (RobotoTextView) obj;
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                robotoTextView.setAlpha(1.0f);
                                break;
                            case 1:
                                RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                                robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                                robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                robotoTextView2.setAlpha(0.4f);
                                break;
                            default:
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == 0) {
                                    kh7Var22 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                    kh7Var22.Ig();
                                    break;
                                } else if (intValue == 1) {
                                    kh7Var32 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                    kh7Var32.Hg();
                                    break;
                                }
                                break;
                        }
                    }
                };
                final int i22 = 1;
                Consumer consumer22 = new Consumer(this) { // from class: ih7
                    public final /* synthetic */ CallFeedbackQuestionModalView b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        kh7 kh7Var22;
                        kh7 kh7Var32;
                        int i222 = i22;
                        CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                        switch (i222) {
                            case 0:
                                RobotoTextView robotoTextView = (RobotoTextView) obj;
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                robotoTextView.setAlpha(1.0f);
                                break;
                            case 1:
                                RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                                robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                                robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                robotoTextView2.setAlpha(0.4f);
                                break;
                            default:
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == 0) {
                                    kh7Var22 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                    kh7Var22.Ig();
                                    break;
                                } else if (intValue == 1) {
                                    kh7Var32 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                    kh7Var32.Hg();
                                    break;
                                }
                                break;
                        }
                    }
                };
                access$getBinding(this).j.addCustomViewTab(bVar.h(r3), consumer3, consumer22);
                access$getBinding(this).j.addCustomViewTab(bVar.h(r22), consumer3, consumer22);
                access$getBinding(this).j.setTabsPadding(0);
                final int i32 = 2;
                access$getBinding(this).j.setUserSelectionChangeListener(new Consumer(this) { // from class: ih7
                    public final /* synthetic */ CallFeedbackQuestionModalView b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        kh7 kh7Var22;
                        kh7 kh7Var32;
                        int i222 = i32;
                        CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                        switch (i222) {
                            case 0:
                                RobotoTextView robotoTextView = (RobotoTextView) obj;
                                robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                robotoTextView.setAlpha(1.0f);
                                break;
                            case 1:
                                RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                                robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                                robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                                robotoTextView2.setAlpha(0.4f);
                                break;
                            default:
                                int intValue = ((Integer) obj).intValue();
                                if (intValue == 0) {
                                    kh7Var22 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                    kh7Var22.Ig();
                                    break;
                                } else if (intValue == 1) {
                                    kh7Var32 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                                    kh7Var32.Hg();
                                    break;
                                }
                                break;
                        }
                    }
                });
                access$getBinding2.h.setVisibility(8);
                access$getBinding2.c.setVisibility(8);
                access$getBinding2.f.setVisibility(0);
                c06 c06Var2 = (c06) m2vVar.c;
                str3 = (String) ((mh7) m2vVar.w).a.getValue();
                pj pjVar2 = (pj) c06Var2.a;
                pjVar2.getClass();
                HashMap hashMap2 = new HashMap();
                if (str3 != null) {
                }
                pjVar2.a.a("CallQualityCard.Shown", hashMap2, 1, new HashMap());
                ButtonComponent buttonComponent4 = getBinding().g;
                final kh7 kh7Var22 = this.callFeedbackQuestionPresenter;
                buttonComponent4.setDebounceClickListener(new Runnable() { // from class: hh7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i4;
                        kh7 kh7Var32 = kh7Var22;
                        switch (i42) {
                            case 0:
                                kh7Var32.Ig();
                                break;
                            case 1:
                                kh7Var32.Hg();
                                break;
                            default:
                                CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var32);
                                break;
                        }
                    }
                });
                ButtonComponent buttonComponent22 = getBinding().b;
                final kh7 kh7Var32 = this.callFeedbackQuestionPresenter;
                buttonComponent22.setDebounceClickListener(new Runnable() { // from class: hh7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i22;
                        kh7 kh7Var322 = kh7Var32;
                        switch (i42) {
                            case 0:
                                kh7Var322.Ig();
                                break;
                            case 1:
                                kh7Var322.Hg();
                                break;
                            default:
                                CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var322);
                                break;
                        }
                    }
                });
                getBinding().l.setDebounceClickListener(new js4(23, this));
                ButtonComponent buttonComponent32 = getBinding().k;
                final kh7 kh7Var42 = this.callFeedbackQuestionPresenter;
                buttonComponent32.setDebounceClickListener(new Runnable() { // from class: hh7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i32;
                        kh7 kh7Var322 = kh7Var42;
                        switch (i42) {
                            case 0:
                                kh7Var322.Ig();
                                break;
                            case 1:
                                kh7Var322.Hg();
                                break;
                            default:
                                CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var322);
                                break;
                        }
                    }
                });
                setTitleTextSize(getBinding().g);
                setTitleTextSize(getBinding().b);
            }
        }
        str = null;
        String q3 = m2vVar.q(p, str, kyh0.call_feedback_question_title);
        if (p != null) {
        }
        str2 = null;
        String q222 = m2vVar.q(p, str2, kyh0.call_feedback_question_subtitle);
        String r32 = m2v.r(p, (p != null || (callFeedbackTexts2 = p.d) == null) ? null : callFeedbackTexts2.getE(), "👍");
        if (p != null) {
        }
        String r222 = m2v.r(p, str4, "👎");
        oh7 access$getBinding22 = access$getBinding(this);
        access$getBinding22.e.setText(q3);
        access$getBinding22.d.setText(q222);
        access$getBinding22.g.setText(r32);
        access$getBinding22.b.setText(r222);
        final int i42 = 0;
        Consumer consumer32 = new Consumer(this) { // from class: ih7
            public final /* synthetic */ CallFeedbackQuestionModalView b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                kh7 kh7Var222;
                kh7 kh7Var322;
                int i222 = i42;
                CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                switch (i222) {
                    case 0:
                        RobotoTextView robotoTextView = (RobotoTextView) obj;
                        robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                        robotoTextView.setAlpha(1.0f);
                        break;
                    case 1:
                        RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                        robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                        robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                        robotoTextView2.setAlpha(0.4f);
                        break;
                    default:
                        int intValue = ((Integer) obj).intValue();
                        if (intValue == 0) {
                            kh7Var222 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                            kh7Var222.Ig();
                            break;
                        } else if (intValue == 1) {
                            kh7Var322 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                            kh7Var322.Hg();
                            break;
                        }
                        break;
                }
            }
        };
        final int i222 = 1;
        Consumer consumer222 = new Consumer(this) { // from class: ih7
            public final /* synthetic */ CallFeedbackQuestionModalView b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                kh7 kh7Var222;
                kh7 kh7Var322;
                int i2222 = i222;
                CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                switch (i2222) {
                    case 0:
                        RobotoTextView robotoTextView = (RobotoTextView) obj;
                        robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                        robotoTextView.setAlpha(1.0f);
                        break;
                    case 1:
                        RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                        robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                        robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                        robotoTextView2.setAlpha(0.4f);
                        break;
                    default:
                        int intValue = ((Integer) obj).intValue();
                        if (intValue == 0) {
                            kh7Var222 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                            kh7Var222.Ig();
                            break;
                        } else if (intValue == 1) {
                            kh7Var322 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                            kh7Var322.Hg();
                            break;
                        }
                        break;
                }
            }
        };
        access$getBinding(this).j.addCustomViewTab(bVar.h(r32), consumer32, consumer222);
        access$getBinding(this).j.addCustomViewTab(bVar.h(r222), consumer32, consumer222);
        access$getBinding(this).j.setTabsPadding(0);
        final int i322 = 2;
        access$getBinding(this).j.setUserSelectionChangeListener(new Consumer(this) { // from class: ih7
            public final /* synthetic */ CallFeedbackQuestionModalView b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                kh7 kh7Var222;
                kh7 kh7Var322;
                int i2222 = i322;
                CallFeedbackQuestionModalView callFeedbackQuestionModalView = this.b;
                switch (i2222) {
                    case 0:
                        RobotoTextView robotoTextView = (RobotoTextView) obj;
                        robotoTextView.setBackground((Drawable) new vbb(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                        robotoTextView.setAlpha(1.0f);
                        break;
                    case 1:
                        RobotoTextView robotoTextView2 = (RobotoTextView) obj;
                        robotoTextView2.setBackgroundColor(qje.t(xng0.bgMain, callFeedbackQuestionModalView.getContext()));
                        robotoTextView2.setBackground((Drawable) new vbb(qje.t(xng0.bgTransparent, callFeedbackQuestionModalView.getContext()), tje.x(callFeedbackQuestionModalView.getContext(), 14.0f)).b);
                        robotoTextView2.setAlpha(0.4f);
                        break;
                    default:
                        int intValue = ((Integer) obj).intValue();
                        if (intValue == 0) {
                            kh7Var222 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                            kh7Var222.Ig();
                            break;
                        } else if (intValue == 1) {
                            kh7Var322 = callFeedbackQuestionModalView.callFeedbackQuestionPresenter;
                            kh7Var322.Hg();
                            break;
                        }
                        break;
                }
            }
        });
        access$getBinding22.h.setVisibility(8);
        access$getBinding22.c.setVisibility(8);
        access$getBinding22.f.setVisibility(0);
        c06 c06Var22 = (c06) m2vVar.c;
        str3 = (String) ((mh7) m2vVar.w).a.getValue();
        pj pjVar22 = (pj) c06Var22.a;
        pjVar22.getClass();
        HashMap hashMap22 = new HashMap();
        if (str3 != null) {
        }
        pjVar22.a.a("CallQualityCard.Shown", hashMap22, 1, new HashMap());
        ButtonComponent buttonComponent42 = getBinding().g;
        final kh7 kh7Var222 = this.callFeedbackQuestionPresenter;
        buttonComponent42.setDebounceClickListener(new Runnable() { // from class: hh7
            @Override // java.lang.Runnable
            public final void run() {
                int i422 = i42;
                kh7 kh7Var322 = kh7Var222;
                switch (i422) {
                    case 0:
                        kh7Var322.Ig();
                        break;
                    case 1:
                        kh7Var322.Hg();
                        break;
                    default:
                        CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var322);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent222 = getBinding().b;
        final kh7 kh7Var322 = this.callFeedbackQuestionPresenter;
        buttonComponent222.setDebounceClickListener(new Runnable() { // from class: hh7
            @Override // java.lang.Runnable
            public final void run() {
                int i422 = i222;
                kh7 kh7Var3222 = kh7Var322;
                switch (i422) {
                    case 0:
                        kh7Var3222.Ig();
                        break;
                    case 1:
                        kh7Var3222.Hg();
                        break;
                    default:
                        CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var3222);
                        break;
                }
            }
        });
        getBinding().l.setDebounceClickListener(new js4(23, this));
        ButtonComponent buttonComponent322 = getBinding().k;
        final kh7 kh7Var422 = this.callFeedbackQuestionPresenter;
        buttonComponent322.setDebounceClickListener(new Runnable() { // from class: hh7
            @Override // java.lang.Runnable
            public final void run() {
                int i422 = i322;
                kh7 kh7Var3222 = kh7Var422;
                switch (i422) {
                    case 0:
                        kh7Var3222.Ig();
                        break;
                    case 1:
                        kh7Var3222.Hg();
                        break;
                    default:
                        CallFeedbackQuestionModalView.onAttachedToWindow$sendTapped(kh7Var3222);
                        break;
                }
            }
        });
        setTitleTextSize(getBinding().g);
        setTitleTextSize(getBinding().b);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.callFeedbackQuestionPresenter.Cg();
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }
}
