package com.yandex.passport.internal.ui.domik.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.tasks.zzw;
import com.yandex.passport.R;
import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.data.models.k;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.links.j;
import com.yandex.passport.internal.storage.i;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.common.e;
import com.yandex.passport.internal.ui.g;
import com.yandex.passport.internal.ui.util.OnActionDoneListener;
import com.yandex.passport.internal.widget.ConfirmationCodeInput;
import com.yandex.passport.legacy.lx.m;
import defpackage.ds31;
import defpackage.e491;
import defpackage.k5c;
import defpackage.mdh;
import defpackage.mm2;
import defpackage.sjh;
import defpackage.sst;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;

/* loaded from: classes2.dex */
public abstract class BaseSmsFragment<V extends com.yandex.passport.internal.ui.domik.base.b & e, T extends BaseTrack> extends BaseDomikFragment<V, T> {
    public static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.domik.common.BaseSmsFragment";
    protected static final String KEY_PHONE_CONFIRMATION_RESULT = "phone_confirmation_result";
    protected ConfirmationCodeInput confirmationCodeInput;
    private View layoutScrollable;
    private TextView messageText;
    private com.yandex.passport.internal.ui.util.a resentDelegate;
    private com.yandex.passport.internal.smsretriever.a smsRetrieverHelper;
    private BroadcastReceiver smsRetrieverReceiver = new BroadcastReceiver() { // from class: com.yandex.passport.internal.ui.domik.common.BaseSmsFragment.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.yandex.passport.legacy.a.a("Internal broadcast about SMS received");
            b0 b0Var = ((BaseDomikFragment) BaseSmsFragment.this).statefulReporter;
            b0Var.getClass();
            b0Var.c(DomikStatefulReporter$Screen.SMS_CODE_ENTRY, DomikStatefulReporter$Event.SMS_RETRIEVER_TRIGGERED);
            i iVar = BaseSmsFragment.this.smsRetrieverHelper.b;
            String str = (String) iVar.f.getValue(iVar, i.m[4]);
            if (str != null) {
                BaseSmsFragment.this.confirmationCodeInput.setCode(str);
            } else {
                com.yandex.passport.legacy.a.b("We received SMS meant for us, but there was no code in it");
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$0(String str, boolean z) {
        if (z) {
            validate();
        }
        hideFieldError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$1(View view) {
        validate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zy11 lambda$onViewCreated$2() {
        b0 b0Var = this.statefulReporter;
        b0Var.getClass();
        b0Var.c(DomikStatefulReporter$Screen.SMS_CODE_ENTRY, DomikStatefulReporter$Event.RESEND_SMS);
        resendSms();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onViewCreated$3(Boolean bool) {
        if (com.yandex.passport.legacy.d.g(this.buttonNext) && bool.booleanValue()) {
            this.buttonNext.setVisibility(8);
            View view = this.layoutScrollable;
            com.yandex.passport.internal.ui.sloth.e.n((int) view.getResources().getDimension(R.dimen.passport_domik_bottom_scrollable_padding_without_button), view);
            return;
        }
        this.buttonNext.setVisibility(0);
        View view2 = this.layoutScrollable;
        com.yandex.passport.internal.ui.sloth.e.n((int) view2.getResources().getDimension(R.dimen.passport_domik_bottom_scrollable_padding_full), view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ zy11 lambda$onViewCreated$4() {
        validate();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onViewCreated$5(PhoneConfirmationResult phoneConfirmationResult) {
        if (phoneConfirmationResult instanceof PhoneConfirmationResult.CodePhoneConfirmationResult) {
            PhoneConfirmationResult.CodePhoneConfirmationResult codePhoneConfirmationResult = (PhoneConfirmationResult.CodePhoneConfirmationResult) phoneConfirmationResult;
            requireArguments().putParcelable(KEY_PHONE_CONFIRMATION_RESULT, codePhoneConfirmationResult);
            com.yandex.passport.internal.ui.util.a aVar = this.resentDelegate;
            aVar.f = codePhoneConfirmationResult.getDenyResendUntil();
            aVar.a();
            this.confirmationCodeInput.setCodeLength(codePhoneConfirmationResult.getCodeLength());
        }
    }

    public androidx.localbroadcastmanager.content.a getBroadcastManager() {
        Context context = getContext();
        context.getClass();
        return androidx.localbroadcastmanager.content.a.a(context);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String str) {
        return "confirmations_limit.exceeded".equals(str) || "code.invalid".equals(str) || "rate.limit_exceeded".equals(str) || "code.empty".equals(str);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.yandex.passport.internal.smsretriever.a smsRetrieverHelper = com.yandex.passport.internal.di.a.a().getSmsRetrieverHelper();
        this.smsRetrieverHelper = smsRetrieverHelper;
        zzw e = new e491(smsRetrieverHelper.a, null, e491.k, mm2.V0, sst.c).e();
        e.d(new com.yandex.passport.common.util.b(2));
        e.f(new com.yandex.passport.common.util.b(3));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(getDomikComponent().getDomikDesignProvider().d, viewGroup, false);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        com.yandex.passport.internal.ui.util.a aVar = this.resentDelegate;
        aVar.g.removeCallbacks(aVar.h);
        super.onDestroyView();
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.yandex.passport.internal.ui.util.a aVar = this.resentDelegate;
        if (aVar != null) {
            bundle.putBoolean("resend_button_clicked", aVar.e);
        }
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment
    public void onShowProgress(boolean z) {
        super.onShowProgress(z);
        this.confirmationCodeInput.setEditable(!z);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getBroadcastManager().b(this.smsRetrieverReceiver, new IntentFilter("com.yandex.passport.internal.SMS_CODE_RECEIVED"));
        this.resentDelegate.a();
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getBroadcastManager().d(this.smsRetrieverReceiver);
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.confirmationCodeInput = (ConfirmationCodeInput) view.findViewById(R.id.input_phone_code);
        T t = this.currentTrack;
        String maskedPhoneNumber = t instanceof AuthTrack ? ((AuthTrack) t).getMaskedPhoneNumber() : null;
        if (maskedPhoneNumber == null) {
            maskedPhoneNumber = this.currentTrack.getPhoneNumber();
        }
        Spanned fromHtml = Html.fromHtml(getString(R.string.passport_sms_text, "<br />".concat(com.yandex.passport.legacy.d.h(maskedPhoneNumber))));
        TextView textView = (TextView) view.findViewById(R.id.text_message);
        this.messageText = textView;
        textView.setText(fromHtml);
        this.confirmationCodeInput.setContentDescription(fromHtml);
        int i = 1;
        this.confirmationCodeInput.addOnCodeChangedListener(new com.yandex.passport.internal.ui.domik.call.a(this, i));
        this.buttonNext.setOnClickListener(new com.yandex.passport.internal.autologin.ui.b(5, this));
        boolean z = false;
        this.resentDelegate = new com.yandex.passport.internal.ui.util.a((Button) view.findViewById(R.id.button_resend_sms), new c(this, 0 == true ? 1 : 0));
        k kVar = (k) requireArguments().getParcelable(KEY_PHONE_CONFIRMATION_RESULT);
        kVar.getClass();
        com.yandex.passport.internal.ui.util.a aVar = this.resentDelegate;
        aVar.f = kVar.getDenyResendUntil();
        aVar.a();
        com.yandex.passport.internal.ui.util.a aVar2 = this.resentDelegate;
        if (bundle != null) {
            aVar2.getClass();
            z = bundle.getBoolean("resend_button_clicked", false);
        }
        aVar2.e = z;
        this.confirmationCodeInput.setCodeLength(kVar.getCodeLength());
        postShowSoftKeyboard(this.confirmationCodeInput, this.textMessage);
        this.commonViewModel.I.f(getViewLifecycleOwner(), new com.yandex.passport.internal.ui.autologin.b(i, this));
        this.confirmationCodeInput.setOnEditorActionListener(new OnActionDoneListener(new c(this, i)));
        this.layoutScrollable = view.findViewById(R.id.scroll_view_content);
        ((e) ((com.yandex.passport.internal.ui.domik.base.b) this.viewModel)).C.n(getViewLifecycleOwner(), new j(2, this));
    }

    public void resendSms() {
        e eVar = (e) ((com.yandex.passport.internal.ui.domik.base.b) this.viewModel);
        T t = this.currentTrack;
        eVar.getClass();
        k5c a = ds31.a(eVar);
        sjh sjhVar = uyj.a;
        tje.N(a, mdh.b, null, new BaseSmsViewModel$resendSms$1(eVar, t, null), 2);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public void showFieldError(g gVar, String str) {
        super.showFieldError(gVar, str);
        this.confirmationCodeInput.requestFocus();
    }

    public void validate() {
        this.statefulReporter.f();
        e eVar = (e) ((com.yandex.passport.internal.ui.domik.base.b) this.viewModel);
        T t = this.currentTrack;
        String code = this.confirmationCodeInput.getCode();
        eVar.getClass();
        com.yandex.passport.internal.interaction.b bVar = eVar.D;
        bVar.c.m(Boolean.TRUE);
        bVar.a.a.add(m.d(new com.yandex.passport.internal.interaction.f(bVar, t, code, eVar instanceof com.yandex.passport.internal.ui.domik.smsauth.b)));
    }
}
