package com.yandex.passport.internal.ui.domik.phone_number;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.authbytrack.b;
import com.yandex.passport.internal.ui.base.BaseBackStackActivity;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.UnsubscribeMailingStatus;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment;
import com.yandex.passport.internal.ui.domik.t;
import com.yandex.passport.internal.util.h;
import com.yandex.passport.legacy.lx.n;
import defpackage.ds31;
import defpackage.k5c;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;

/* loaded from: classes2.dex */
public class PhoneNumberFragment extends BasePhoneNumberFragment<a, RegTrack> {
    public static final String FRAGMENT_TAG = "com.yandex.passport.internal.ui.domik.phone_number.PhoneNumberFragment";
    public static final String KEY_RELOGIN_AUTO_CONFIRMED = "relogin_auto_confirmed";
    private h debugUiUtil;
    private boolean isReloginAutoConfirmed = false;
    private boolean isSuperLiteRegistrationEnabled = false;
    private boolean isShowPortalAuthButton = false;

    public static PhoneNumberFragment newInstance(RegTrack regTrack) {
        return (PhoneNumberFragment) BaseDomikFragment.baseNewInstance(regTrack, new b(3));
    }

    private void setupDebugMenu() {
        h hVar = new h(com.yandex.passport.internal.di.a.a().getDebugInfoUtil());
        this.debugUiUtil = hVar;
        hVar.a(this.textViewMessage);
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public a createViewModel(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return getDomikComponent().newPhoneNumberViewModel();
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment
    public void doOnNextButtonClick() {
        String obj = this.editPhone.getText().toString();
        int i = com.yandex.passport.legacy.b.a;
        if (obj == null || obj.trim().isEmpty()) {
            onErrorCode(new EventError("phone.empty"));
            return;
        }
        a aVar = (a) this.viewModel;
        RegTrack withLegalShown = ((RegTrack) this.currentTrack).withLegalShown();
        CheckBox checkBox = this.checkBoxUnsubscribeMailing;
        UnsubscribeMailingStatus.Companion.getClass();
        RegTrack withUnsubscribeMailing = withLegalShown.withUnsubscribeMailing(checkBox.getVisibility() != 0 ? UnsubscribeMailingStatus.NOT_SHOWED : checkBox.isChecked() ? UnsubscribeMailingStatus.SHOWED_CHECKED : UnsubscribeMailingStatus.SHOWED_UNCHECKED);
        aVar.getClass();
        k5c a = ds31.a(aVar);
        sjh sjhVar = uyj.a;
        tje.N(a, mdh.b, null, new PhoneNumberViewModel$startRegistration$1(aVar, withUnsubscribeMailing, obj, null), 2);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.PHONE_ENTRY;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment, com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String str) {
        return true;
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment
    public boolean isSuperLiteRegistrationEnabled() {
        return this.isSuperLiteRegistrationEnabled;
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public boolean onBackPressed() {
        if (((RegTrack) this.currentTrack).getProperties().getVisualProperties().isNoReturnToHost() && ((RegTrack) this.currentTrack).isUpgradePhonish()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment, com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j flagRepository = com.yandex.passport.internal.di.a.a().getFlagRepository();
        Filter filter = ((RegTrack) this.currentTrack).getProperties().getFilter();
        boolean z = false;
        this.isShowPortalAuthButton = ((RegTrack) this.currentTrack).getProperties().getVisualProperties().isPreferPhonishAuth() && (((BaseBackStackActivity) requireActivity()).getFragmentBackStack().a.size() == 1) && !this.isUberTheme;
        boolean z2 = ((Boolean) flagRepository.b(q.k)).booleanValue() && filter.isLiteRegistrationAllowed() && !this.isUberTheme && ((RegTrack) this.currentTrack).isRegistrationOrigin() && !this.isShowPortalAuthButton;
        this.isSuperLiteRegistrationEnabled = z2;
        if (this.keyboardShowedOnFirstEnter && !z2) {
            z = true;
        }
        this.keyboardShowedOnFirstEnter = z;
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        h hVar = this.debugUiUtil;
        n nVar = hVar.b;
        if (nVar != null && !nVar.a) {
            nVar.a();
        }
        hVar.b = null;
        super.onDestroyView();
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(KEY_RELOGIN_AUTO_CONFIRMED, this.isReloginAutoConfirmed);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.yandex.passport.internal.ui.domik.common.BasePhoneNumberFragment, com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.isReloginAutoConfirmed = bundle.getBoolean(KEY_RELOGIN_AUTO_CONFIRMED, false);
        }
        if (((RegTrack) this.currentTrack).isRelogin() && !this.isReloginAutoConfirmed) {
            String phoneNumber = ((RegTrack) this.currentTrack).getPhoneNumber();
            if (phoneNumber != null) {
                phoneNumber = phoneNumber.replace(ModernAccount.ACCOUNT_NAME_PREFIX_TESTING, "");
            }
            this.editPhone.setText(phoneNumber);
            if (!((RegTrack) this.currentTrack).isUpgradePhonish()) {
                doOnNextButtonClick();
            }
            this.isHintRequestSent = true;
            this.isReloginAutoConfirmed = true;
        }
        TextView textView = this.textViewMessage;
        String registrationMessage = ((RegTrack) this.currentTrack).getProperties().getVisualProperties().getRegistrationMessage();
        int i = R.string.passport_reg_phone_text;
        if (TextUtils.isEmpty(registrationMessage)) {
            textView.setText(i);
        } else {
            textView.setText(registrationMessage);
        }
        setupDebugMenu();
        CheckBox checkBox = this.checkBoxUnsubscribeMailing;
        t tVar = UnsubscribeMailingStatus.Companion;
        checkBox.setVisibility(0);
        boolean isOnlySupported = ((RegTrack) this.currentTrack).getProperties().getFilter().isOnlySupported(PassportAccountType.PHONISH);
        if (((RegTrack) this.currentTrack).isLoginRestoring() || isOnlySupported) {
            this.checkBoxUnsubscribeMailing.setVisibility(8);
        }
    }
}
