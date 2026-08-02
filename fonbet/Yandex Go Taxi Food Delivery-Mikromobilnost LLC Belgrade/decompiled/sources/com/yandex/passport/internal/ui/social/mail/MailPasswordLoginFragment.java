package com.yandex.passport.internal.ui.social.mail;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.i;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.BaseNextFragment;
import com.yandex.passport.internal.ui.k;
import com.yandex.passport.internal.ui.login.DomainAutoCompleteLoginFieldWatcher;
import com.yandex.passport.internal.ui.m;
import com.yandex.passport.internal.ui.social.gimap.j;
import com.yandex.passport.internal.ui.util.ShowHidePasswordClickListener;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.internal.widget.InputFieldView;
import com.yandex.passport.internal.y;
import defpackage.ds31;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.kbs;
import defpackage.mdh;
import defpackage.pey;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ?2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003@;AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\nJ\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u0004\u0018\u00010;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/yandex/passport/internal/ui/social/mail/MailPasswordLoginFragment;", "Lcom/yandex/passport/internal/ui/base/BaseNextFragment;", "Lcom/yandex/passport/internal/ui/social/mail/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "Lzy11;", "setCommentsInNotice", "(Landroid/view/View;)V", "Lcom/yandex/passport/internal/widget/InputFieldView;", "loginInput", "initRamblerAutoComplete", "(Lcom/yandex/passport/internal/widget/InputFieldView;)V", "validateLogin", "applyRamblerAutoComplete", "authorize", "showNoInternetDialog", "showNotice", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "createViewModel", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;)Lcom/yandex/passport/internal/ui/social/mail/d;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "show", "onShowProgress", "(Z)V", "onClick", "Lcom/yandex/passport/internal/ui/EventError;", ErrorResponseData.JSON_ERROR_CODE, "onErrorCode", "(Lcom/yandex/passport/internal/ui/EventError;)V", "inputLogin", "Lcom/yandex/passport/internal/widget/InputFieldView;", "inputPassword", "Landroid/widget/Button;", "signInButton", "Landroid/widget/Button;", "Landroid/app/Dialog;", "progressDialog", "Landroid/app/Dialog;", "Landroid/widget/LinearLayout;", "ramblerNoticeForm", "Landroid/widget/LinearLayout;", "Lcom/yandex/passport/internal/ui/login/DomainAutoCompleteLoginFieldWatcher;", "ramblerLoginFieldWatcher", "Lcom/yandex/passport/internal/ui/login/DomainAutoCompleteLoginFieldWatcher;", "Lcom/yandex/passport/internal/ui/social/mail/c;", "getListener", "()Lcom/yandex/passport/internal/ui/social/mail/c;", "listener", "Companion", "HideErrorTextWatcher", "com/yandex/passport/internal/ui/social/mail/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MailPasswordLoginFragment extends BaseNextFragment<d> implements View.OnClickListener {
    public static final int $stable = 8;
    public static final String KEY_SUGGESTED_LOGIN = "suggested-login";
    private InputFieldView inputLogin;
    private InputFieldView inputPassword;
    private Dialog progressDialog;
    private DomainAutoCompleteLoginFieldWatcher ramblerLoginFieldWatcher;
    private LinearLayout ramblerNoticeForm;
    private Button signInButton;
    public static final b Companion = new b();
    private static final String[] RAMBLER_DOMAINS = {"rambler.ru", "lenta.ru", "autorambler.ru", "myrambler.ru", "ro.ru", "rambler.ua"};

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/passport/internal/ui/social/mail/MailPasswordLoginFragment$HideErrorTextWatcher;", "Landroid/text/TextWatcher;", "Lcom/yandex/passport/internal/widget/InputFieldView;", "inputFieldView", "<init>", "(Lcom/yandex/passport/internal/ui/social/mail/MailPasswordLoginFragment;Lcom/yandex/passport/internal/widget/InputFieldView;)V", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Lcom/yandex/passport/internal/widget/InputFieldView;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class HideErrorTextWatcher implements TextWatcher {
        private final InputFieldView inputFieldView;

        public HideErrorTextWatcher(InputFieldView inputFieldView) {
            this.inputFieldView = inputFieldView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            this.inputFieldView.onIndeterminate();
            InputFieldView inputFieldView = MailPasswordLoginFragment.this.inputLogin;
            if (inputFieldView == null) {
                inputFieldView = null;
            }
            String obj = inputFieldView.getEditText().getText().toString();
            int length = obj.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = jl40.q(obj.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj2 = obj.subSequence(i, length + 1).toString();
            InputFieldView inputFieldView2 = MailPasswordLoginFragment.this.inputPassword;
            if (inputFieldView2 == null) {
                inputFieldView2 = null;
            }
            boolean z3 = obj2.length() == 0 || inputFieldView2.getEditText().getText().toString().length() == 0;
            Button button = MailPasswordLoginFragment.this.signInButton;
            (button != null ? button : null).setEnabled(!z3);
        }
    }

    private final void applyRamblerAutoComplete() {
        DomainAutoCompleteLoginFieldWatcher domainAutoCompleteLoginFieldWatcher = this.ramblerLoginFieldWatcher;
        if (domainAutoCompleteLoginFieldWatcher != null) {
            InputFieldView inputFieldView = this.inputLogin;
            if (inputFieldView == null) {
                inputFieldView = null;
            }
            domainAutoCompleteLoginFieldWatcher.applyAutoComplete(inputFieldView.getEditText().getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void authorize() {
        validateLogin();
        InputFieldView inputFieldView = this.inputLogin;
        if (inputFieldView == null) {
            inputFieldView = null;
        }
        String obj = inputFieldView.getEditText().getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = jl40.q(obj.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj2 = obj.subSequence(i, length + 1).toString();
        InputFieldView inputFieldView2 = this.inputPassword;
        if (inputFieldView2 == null) {
            inputFieldView2 = null;
        }
        String obj3 = inputFieldView2.getEditText().getText().toString();
        d dVar = (d) this.viewModel;
        dVar.getClass();
        y yVar = SocialConfiguration.Companion;
        PassportSocialConfiguration passportSocialConfiguration = PassportSocialConfiguration.MAILISH_RAMBLER;
        yVar.getClass();
        SocialConfiguration a = y.a(passportSocialConfiguration);
        dVar.C.k(a, false, "native_mail_password");
        dVar.c.m(Boolean.TRUE);
        k5c a2 = ds31.a(dVar);
        sjh sjhVar = uyj.a;
        tje.N(a2, mdh.b, null, new MailPasswordLoginViewModel$authorize$1(dVar, obj2, obj3, a, null), 2);
    }

    private final c getListener() {
        if (getActivity() instanceof c) {
            return (c) getActivity();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(requireActivity());
        kbs.q(sb, " must implement ", c.class.getSimpleName());
        return null;
    }

    private final void initRamblerAutoComplete(InputFieldView loginInput) {
        EditText editText = loginInput.getEditText();
        this.ramblerLoginFieldWatcher = new DomainAutoCompleteLoginFieldWatcher(RAMBLER_DOMAINS, editText.getHintTextColors().getDefaultColor());
        Editable text = editText.getText();
        text.setSpan(this.ramblerLoginFieldWatcher, 0, text.length(), 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(MailPasswordLoginFragment mailPasswordLoginFragment, View view, boolean z) {
        if (z) {
            return;
        }
        mailPasswordLoginFragment.validateLogin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(MailPasswordLoginFragment mailPasswordLoginFragment, ModernAccount modernAccount) {
        mailPasswordLoginFragment.getListener().onLoginFinished(modernAccount);
    }

    private final void setCommentsInNotice(View v) {
        ((TextView) v.findViewById(R.id.passport_login_rambler_notice_step1)).setText(getString(R.string.passport_login_rambler_notice_detail_comment, 1));
        ((TextView) v.findViewById(R.id.passport_login_rambler_notice_step2)).setText(getString(R.string.passport_login_rambler_notice_detail_comment, 2));
        ((TextView) v.findViewById(R.id.passport_login_rambler_notice_step3)).setText(getString(R.string.passport_login_rambler_notice_detail_comment, 3));
    }

    private final void showNoInternetDialog() {
        Context requireContext = requireContext();
        m mVar = new m(requireContext);
        mVar.f(R.string.passport_error_network);
        mVar.d(R.string.passport_am_error_try_again);
        mVar.e(R.string.passport_reg_try_again, new com.yandex.passport.internal.ui.d(4, this));
        mVar.i = requireContext.getText(R.string.passport_reg_cancel);
        mVar.j = null;
        AppCompatDialog a = mVar.a();
        a.show();
        registerDialog(a);
    }

    private final void showNotice() {
        TypedValue typedValue = new TypedValue();
        requireActivity().getTheme().resolveAttribute(R.attr.passportNextNoticeRamblerBackgroundColor, typedValue, true);
        int color = getResources().getColor(typedValue.resourceId);
        LinearLayout linearLayout = this.ramblerNoticeForm;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.setBackgroundColor(color);
        LinearLayout linearLayout2 = this.ramblerNoticeForm;
        (linearLayout2 != null ? linearLayout2 : null).findViewById(R.id.login_button_with_notice_text).setVisibility(0);
    }

    private final void validateLogin() {
        applyRamblerAutoComplete();
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public d createViewModel(PassportProcessGlobalComponent component) {
        i iVar = LoginProperties.Companion;
        Bundle arguments = getArguments();
        iVar.getClass();
        return new d(p.u(i.a(arguments).getFilter().getPrimaryEnvironment()), component.getLoginController(), component.getSocialReporter());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_sign_in) {
            authorize();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View inflate = inflater.inflate(R.layout.passport_fragment_rambler_login, container, false);
        this.inputLogin = (InputFieldView) inflate.findViewById(R.id.input_login);
        this.inputPassword = (InputFieldView) inflate.findViewById(R.id.input_password);
        Button button = (Button) inflate.findViewById(R.id.button_sign_in);
        this.signInButton = button;
        if (button == null) {
            button = null;
        }
        button.setOnClickListener(this);
        Button button2 = this.signInButton;
        if (button2 == null) {
            button2 = null;
        }
        button2.setEnabled(false);
        this.progressDialog = k.a(requireContext());
        InputFieldView inputFieldView = this.inputLogin;
        if (inputFieldView == null) {
            inputFieldView = null;
        }
        EditText editText = inputFieldView.getEditText();
        InputFieldView inputFieldView2 = this.inputPassword;
        if (inputFieldView2 == null) {
            inputFieldView2 = null;
        }
        editText.addTextChangedListener(new HideErrorTextWatcher(inputFieldView2));
        InputFieldView inputFieldView3 = this.inputPassword;
        if (inputFieldView3 == null) {
            inputFieldView3 = null;
        }
        EditText editText2 = inputFieldView3.getEditText();
        InputFieldView inputFieldView4 = this.inputPassword;
        if (inputFieldView4 == null) {
            inputFieldView4 = null;
        }
        editText2.addTextChangedListener(new HideErrorTextWatcher(inputFieldView4));
        InputFieldView inputFieldView5 = this.inputLogin;
        if (inputFieldView5 == null) {
            inputFieldView5 = null;
        }
        initRamblerAutoComplete(inputFieldView5);
        View findViewById = inflate.findViewById(R.id.button_password_masking);
        InputFieldView inputFieldView6 = this.inputPassword;
        if (inputFieldView6 == null) {
            inputFieldView6 = null;
        }
        findViewById.setOnClickListener(new ShowHidePasswordClickListener(inputFieldView6.getEditText()));
        InputFieldView inputFieldView7 = this.inputLogin;
        if (inputFieldView7 == null) {
            inputFieldView7 = null;
        }
        inputFieldView7.getEditText().setOnFocusChangeListener(new j(1, this));
        boolean containsKey = getArguments().containsKey(KEY_SUGGESTED_LOGIN);
        InputFieldView inputFieldView8 = this.inputLogin;
        if (containsKey) {
            if (inputFieldView8 == null) {
                inputFieldView8 = null;
            }
            inputFieldView8.getEditText().setText(getArguments().getString(KEY_SUGGESTED_LOGIN));
            InputFieldView inputFieldView9 = this.inputPassword;
            (inputFieldView9 != null ? inputFieldView9 : null).requestFocus();
        } else {
            (inputFieldView8 != null ? inputFieldView8 : null).requestFocus();
        }
        this.ramblerNoticeForm = (LinearLayout) inflate.findViewById(R.id.login_button_with_notice_form);
        setCommentsInNotice(inflate);
        return inflate;
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public void onErrorCode(EventError errorCode) {
        if (errorCode.getException() instanceof IOException) {
            showNoInternetDialog();
        } else {
            showNotice();
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public void onShowProgress(boolean show) {
        Dialog dialog = this.progressDialog;
        if (show) {
            if (dialog == null) {
                dialog = null;
            }
            dialog.show();
        } else {
            if (dialog == null) {
                dialog = null;
            }
            dialog.dismiss();
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        com.yandex.passport.internal.ui.util.i iVar = ((d) this.viewModel).D;
        pey viewLifecycleOwner = getViewLifecycleOwner();
        int i = 3;
        com.yandex.passport.internal.links.j jVar = new com.yandex.passport.internal.links.j(i, this);
        iVar.getClass();
        iVar.f(viewLifecycleOwner, new com.yandex.passport.internal.ui.autologin.b(i, jVar));
    }
}
