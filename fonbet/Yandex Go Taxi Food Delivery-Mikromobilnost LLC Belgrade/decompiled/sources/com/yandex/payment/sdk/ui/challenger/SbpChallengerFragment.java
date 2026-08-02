package com.yandex.payment.sdk.ui.challenger;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import com.yandex.payment.sdk.ui.ViewBindingFragmentImpl;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import com.yandex.payment.sdk.utils.CenteredImageSpan;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import defpackage.cma1;
import defpackage.cof;
import defpackage.dy40;
import defpackage.e99;
import defpackage.egm0;
import defpackage.es31;
import defpackage.evu0;
import defpackage.exg0;
import defpackage.i3y;
import defpackage.iob1;
import defpackage.j0v;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.kpg0;
import defpackage.mfm0;
import defpackage.n891;
import defpackage.nfm0;
import defpackage.nu5;
import defpackage.ny61;
import defpackage.ofm0;
import defpackage.ong0;
import defpackage.pfm0;
import defpackage.qfm0;
import defpackage.qoi0;
import defpackage.qv90;
import defpackage.rfm0;
import defpackage.rlh0;
import defpackage.rwo;
import defpackage.ryh0;
import defpackage.sfm0;
import defpackage.sls;
import defpackage.sv90;
import defpackage.tfm0;
import defpackage.tls;
import defpackage.tpa0;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wuj0;
import defpackage.xp4;
import defpackage.y22;
import defpackage.y8f;
import defpackage.yv90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0004J+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/yandex/payment/sdk/ui/challenger/SbpChallengerFragment;", "Lcom/yandex/payment/sdk/ui/ViewBindingFragmentImpl;", "Ltpa0;", "<init>", "()V", "binding", "Lzy11;", "initBinding", "(Ltpa0;)V", "Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo;", "challengeInfo", "initSmsChallenger", "(Lcom/yandex/payment/sdk/core/data/SbpChallengeInfo;)V", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$SbpToken;", "sbpToken", "initRandomAmountChallenger", "(Lcom/yandex/payment/sdk/core/data/PaymentMethod$SbpToken;)V", "Lxp4;", "bankInfo", "setBankDescriptionSpan", "(Lxp4;)V", "addObservers", "Le99;", ConfigConstants.CONFIG, "Lkotlin/Function1;", "", "callback", "setConfig", "(Le99;Ltls;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Intent;", "intent", "", "tryOpenBankApp", "(Landroid/content/Intent;)Z", "Legm0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Legm0;", "activityViewModel", "Companion", "ofm0", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SbpChallengerFragment extends ViewBindingFragmentImpl<tpa0> {
    public static final ofm0 Companion = new ofm0();

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel = new es31(qoi0.a(egm0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerFragment$special$$inlined$activityViewModels$default$1
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerFragment$special$$inlined$activityViewModels$default$3
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new sls(this) { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerFragment$special$$inlined$activityViewModels$default$2
        final /* synthetic */ sls $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.$this_activityViewModels = this;
        }

        @Override // defpackage.sls
        public final Object invoke() {
            y8f y8fVar;
            sls slsVar = this.$extrasProducer;
            return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : y8fVar;
        }
    });

    private final void addObservers() {
        getActivityViewModel().B.f(getViewLifecycleOwner(), new cof(9, new nfm0(this, 0)));
        getActivityViewModel().A.f(getViewLifecycleOwner(), new cof(9, new nfm0(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addObservers$lambda$0(SbpChallengerFragment sbpChallengerFragment, SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus) {
        if (!sbpChallengeResultInfo$SbpChallengeStatus.a()) {
            sbpChallengerFragment.getBinding().d.showIncorrectAppearance();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addObservers$lambda$1(SbpChallengerFragment sbpChallengerFragment, Pair pair) {
        sbpChallengerFragment.setConfig((e99) pair.c(), (tls) pair.f());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final egm0 getActivityViewModel() {
        return (egm0) this.activityViewModel.getValue();
    }

    private final void initBinding(tpa0 binding) {
        binding.b.setOnClickListener(new mfm0(this, 1));
        getActivityViewModel().z.f(getViewLifecycleOwner(), new cof(9, new nfm0(this, 2)));
        addObservers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBinding$lambda$0(SbpChallengerFragment sbpChallengerFragment, View view) {
        sbpChallengerFragment.getActivityViewModel().L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initBinding$lambda$1(SbpChallengerFragment sbpChallengerFragment, Pair pair) {
        int i = pfm0.a[((SbpChallengeInfo) pair.f()).getMethod().ordinal()];
        if (i == 1) {
            sbpChallengerFragment.initSmsChallenger((SbpChallengeInfo) pair.f());
        } else if (i == 2) {
            sbpChallengerFragment.initRandomAmountChallenger((PaymentMethod.SbpToken) pair.c());
        }
        return zy11.a;
    }

    private final void initRandomAmountChallenger(PaymentMethod.SbpToken sbpToken) {
        String memberName;
        getBinding().f.setText(ryh0.paymentsdk_challenger_amount_title);
        egm0 activityViewModel = getActivityViewModel();
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.RANDOM_AMT_CHALLENGE;
        sv90Var.getClass();
        ((y22) activityViewModel.x).a(sv90.w0(psdkScreen));
        if (!n891.l() ? (memberName = sbpToken.getMemberName()) == null : (memberName = sbpToken.getMemberNameRus()) == null) {
            memberName = "";
        }
        String memberId = sbpToken.getMemberId();
        setBankDescriptionSpan(new xp4(memberName, (memberId != null ? memberId : "").concat("://")));
    }

    private final void initSmsChallenger(SbpChallengeInfo challengeInfo) {
        int color = requireContext().getColor(iob1.d(requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true) ? kpg0.paymentsdk_textSecondaryLight : kpg0.paymentsdk_textSecondaryDark);
        egm0 activityViewModel = getActivityViewModel();
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.SMS_CHALLENGE;
        sv90Var.getClass();
        ((y22) activityViewModel.x).a(sv90.w0(psdkScreen));
        int color2 = requireContext().getColor(kpg0.paymentsdk_highlightColor);
        getBinding().c.setOnClickListener(new mfm0(this, 0));
        getActivityViewModel().D.f(getViewLifecycleOwner(), new cof(9, new j0v(this, color2, color, 3)));
        String string = requireContext().getString(ryh0.paymentsdk_challenger_sms_subtitle, challengeInfo.getMaskedPhone());
        getBinding().f.setText(ryh0.paymentsdk_challenger_sms_title);
        getBinding().e.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSmsChallenger$lambda$1(SbpChallengerFragment sbpChallengerFragment, View view) {
        PaymentMethod.SbpToken sbpToken;
        egm0 activityViewModel = sbpChallengerFragment.getActivityViewModel();
        dy40 dy40Var = activityViewModel.D;
        if (jl40.l(dy40Var.d(), qfm0.a)) {
            rwo rwoVar = activityViewModel.x;
            sv90 sv90Var = qv90.a;
            String Z = activityViewModel.Z();
            sv90Var.getClass();
            ((y22) rwoVar).a(sv90.l0(Z));
            dy40Var.m(sfm0.a);
            nu5 nu5Var = ((yv90) activityViewModel.w).j;
            Pair pair = (Pair) activityViewModel.z.d();
            String id = (pair == null || (sbpToken = (PaymentMethod.SbpToken) pair.c()) == null) ? null : sbpToken.getId();
            if (id == null) {
                id = "";
            }
            nu5Var.d(id, activityViewModel.Z(), activityViewModel.F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initSmsChallenger$lambda$2(SbpChallengerFragment sbpChallengerFragment, int i, int i2, tfm0 tfm0Var) {
        if (tfm0Var instanceof qfm0) {
            sbpChallengerFragment.getBinding().c.setText(ryh0.paymentsdk_challenger_sms_description);
            sbpChallengerFragment.getBinding().c.setTextColor(i);
        } else if (tfm0Var instanceof sfm0) {
            sbpChallengerFragment.getBinding().c.setText(ryh0.paymentsdk_challenger_sms_description);
            sbpChallengerFragment.getBinding().c.setTextColor(i2);
        } else {
            if (!(tfm0Var instanceof rfm0)) {
                w511.b();
                return null;
            }
            sbpChallengerFragment.getBinding().c.setTextColor(i2);
            sbpChallengerFragment.getBinding().c.setText(ryh0.paymentsdk_challenger_sms_description_error);
        }
        return zy11.a;
    }

    private final void setBankDescriptionSpan(final xp4 bankInfo) {
        CenteredImageSpan centeredImageSpan;
        String string = requireContext().getString(ryh0.paymentsdk_challenger_amount_description);
        SpannableString spannableString = new SpannableString(unr0.o(string, " ", bankInfo.a, " -"));
        Resources resources = getResources();
        int i = exg0.paymentsdk_ic_link;
        Resources.Theme theme = requireContext().getTheme();
        ThreadLocal threadLocal = wuj0.a;
        Drawable drawable = resources.getDrawable(i, theme);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            centeredImageSpan = new CenteredImageSpan(drawable);
        } else {
            centeredImageSpan = null;
        }
        spannableString.setSpan(centeredImageSpan, evu0.C(spannableString), spannableString.length(), 17);
        spannableString.setSpan(new ClickableSpan() { // from class: com.yandex.payment.sdk.ui.challenger.SbpChallengerFragment$setBankDescriptionSpan$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View textView) {
                egm0 activityViewModel;
                boolean tryOpenBankApp = SbpChallengerFragment.this.tryOpenBankApp(new Intent("android.intent.action.VIEW", Uri.parse(bankInfo.b)));
                activityViewModel = SbpChallengerFragment.this.getActivityViewModel();
                sv90 sv90Var = qv90.a;
                String str = bankInfo.b;
                sv90Var.getClass();
                ((y22) activityViewModel.x).a(sv90.i0(str, tryOpenBankApp));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        }, string.length(), spannableString.length(), 33);
        TextView textView = getBinding().c;
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(new LinkMovementMethod());
    }

    private final void setConfig(e99 config, tls callback) {
        getBinding().d.setConfig(config, callback);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(rlh0.paymentsdk_fragment_sbp_challenger, container, false);
        int i = j9h0.closeButton;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = j9h0.descriptionTextView;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = j9h0.headerLayout;
                if (((FrameLayout) cma1.O(i, inflate)) != null) {
                    i = j9h0.inputView;
                    ChallengerInputView challengerInputView = (ChallengerInputView) cma1.O(i, inflate);
                    if (challengerInputView != null) {
                        i = j9h0.subtitleTextView;
                        TextView textView2 = (TextView) cma1.O(i, inflate);
                        if (textView2 != null) {
                            i = j9h0.titleTextView;
                            TextView textView3 = (TextView) cma1.O(i, inflate);
                            if (textView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                tpa0 tpa0Var = new tpa0(constraintLayout, imageView, textView, challengerInputView, textView2, textView3);
                                setCurrentBinding(tpa0Var);
                                initBinding(tpa0Var);
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final boolean tryOpenBankApp(Intent intent) {
        try {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return true;
            }
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
