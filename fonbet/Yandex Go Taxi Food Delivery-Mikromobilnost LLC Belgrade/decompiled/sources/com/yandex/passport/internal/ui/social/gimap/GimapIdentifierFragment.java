package com.yandex.passport.internal.ui.social.gimap;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.util.ShowHidePasswordClickListener;
import com.yandex.passport.internal.widget.InputFieldView;
import defpackage.kbs;

/* loaded from: classes2.dex */
public class GimapIdentifierFragment extends GimapBaseFragment<g> {
    public static final String CURRENT_STATE = "current_state";
    public static final String SIGN_IN_BUTTON_IS_ENABLED = "gimap_sign_in_button_enabled";
    public static final String TAG = "GimapIdentifierFragment";
    private State currentState = State.CHECK_PROVIDER;
    private TextView errorText;
    private TextView errorTitle;
    private InputFieldView inputLogin;
    private InputFieldView inputPassword;
    private View noticeForm;
    private Button signInButton;

    public class HideErrorTextWatcher implements TextWatcher {
        private final InputFieldView inputFieldView;

        public HideErrorTextWatcher(InputFieldView inputFieldView) {
            this.inputFieldView = inputFieldView;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.inputFieldView.onIndeterminate();
            GimapIdentifierFragment.this.validateSignInButton();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State CHECK_PROVIDER;
        public static final State ERROR;
        public static final State LOGIN;

        static {
            State state = new State("CHECK_PROVIDER", 0);
            CHECK_PROVIDER = state;
            State state2 = new State("LOGIN", 1);
            LOGIN = state2;
            State state3 = new State("ERROR", 2);
            ERROR = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    private void changeToErrorIcons(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.passport_auth_yandex_logo);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.passport_icon_gimap_logo_err);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.gimap_left_icon);
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.passport_icon_gimap_sw600_land_err_left);
        }
        ImageView imageView3 = (ImageView) view.findViewById(R.id.gimap_right_icon);
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.passport_icon_gimap_sw600_land_err_right);
        }
    }

    private String getEmail() {
        return com.yandex.passport.common.util.a.e(this.inputLogin.getEditText().getText().toString().trim());
    }

    private String getPassword() {
        return com.yandex.passport.common.util.a.e(this.inputPassword.getEditText().getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$0(View view) {
        showExtSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$1(State state) {
        updateState(state, getView());
    }

    public static GimapIdentifierFragment newInstance(String str) {
        GimapIdentifierFragment gimapIdentifierFragment = new GimapIdentifierFragment();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putSerializable(CURRENT_STATE, State.LOGIN);
        }
        gimapIdentifierFragment.setArguments(bundle);
        return gimapIdentifierFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSignInButtonClicked(View view) {
        String email = getEmail();
        int ordinal = this.currentState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                ((g) this.viewModel).C.a(updateCurrentTrack());
                return;
            }
            return;
        }
        g gVar = (g) this.viewModel;
        email.getClass();
        gVar.c.m(Boolean.TRUE);
        gVar.w.a.add(com.yandex.passport.legacy.lx.m.d(new com.yandex.passport.internal.interaction.a(8, gVar, email)));
    }

    private void setErrorTextFromGimapError(GimapError gimapError) {
        this.errorTitle.setText(gimapError.titleRes);
        switch (f.a[gimapError.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                this.errorText.setText(R.string.passport_gimap_err_common_text);
                break;
            case 5:
            case 6:
            case 7:
                this.errorText.setText(R.string.passport_gimap_ask_admin);
                break;
            case 8:
            case 9:
                this.errorText.setText(R.string.passport_gimap_err_with_pass);
                break;
            case 10:
            case 11:
            case 12:
                this.errorText.setText(R.string.passport_gimap_try_later);
                break;
            default:
                kbs.f(gimapError, "unexpected gimapError ");
                break;
        }
    }

    private void setState(State state, View view) {
        this.currentState = state;
        int ordinal = state.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                showNoticeForm(view);
            }
            validateSignInButton();
        }
        this.inputPassword.setVisibility(0);
        this.signInButton.setText(R.string.passport_login);
        validateSignInButton();
    }

    private void showExtSettings() {
        ((MailGIMAPActivity) requireActivity()).showImapSettings();
    }

    private void showNoticeForm(View view) {
        this.noticeForm.setVisibility(0);
        changeToErrorIcons(view);
        this.noticeForm.requestFocus();
    }

    private void updateState(State state, View view) {
        if (this.currentState != state) {
            setState(state, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateSignInButton() {
        String email = getEmail();
        String password = getPassword();
        int ordinal = this.currentState.ordinal();
        if (ordinal == 0) {
            this.signInButton.setEnabled(emailIsValid(email));
            return;
        }
        if (ordinal == 1 || ordinal == 2) {
            this.signInButton.setEnabled(emailIsValid(email) && !TextUtils.isEmpty(password));
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public g createViewModel(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return new g(getGimapViewModel(), passportProcessGlobalComponent.getEventReporter(), passportProcessGlobalComponent.getLoginController());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void fillFromTrack(GimapTrack gimapTrack) {
        this.inputLogin.getEditText().setText(gimapTrack.getEmail());
        this.inputPassword.getEditText().setText(gimapTrack.getPassword());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public GimapTrack modifyTrack(GimapTrack gimapTrack) {
        return gimapTrack.withEmailAndPassword(getEmail(), getPassword());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_gimap_identification, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.button_sign_in);
        this.signInButton = button;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.e
            public final /* synthetic */ GimapIdentifierFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                GimapIdentifierFragment gimapIdentifierFragment = this.b;
                switch (i2) {
                    case 0:
                        gimapIdentifierFragment.onSignInButtonClicked(view);
                        break;
                    default:
                        gimapIdentifierFragment.lambda$onCreateView$0(view);
                        break;
                }
            }
        });
        this.inputLogin = (InputFieldView) inflate.findViewById(R.id.input_login);
        this.inputPassword = (InputFieldView) inflate.findViewById(R.id.input_password);
        this.inputLogin.getEditText().addTextChangedListener(new HideErrorTextWatcher(this.inputLogin));
        this.inputPassword.getEditText().addTextChangedListener(new HideErrorTextWatcher(this.inputPassword));
        inflate.findViewById(R.id.button_password_masking).setOnClickListener(new ShowHidePasswordClickListener(this.inputPassword.getEditText()));
        View findViewById = inflate.findViewById(R.id.login_button_with_notice_form);
        this.noticeForm = findViewById;
        this.errorTitle = (TextView) findViewById.findViewById(R.id.error_title);
        this.errorText = (TextView) this.noticeForm.findViewById(R.id.error_text);
        final int i2 = 1;
        ((Button) this.noticeForm.findViewById(R.id.button_gimap_ext)).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.e
            public final /* synthetic */ GimapIdentifierFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                GimapIdentifierFragment gimapIdentifierFragment = this.b;
                switch (i22) {
                    case 0:
                        gimapIdentifierFragment.onSignInButtonClicked(view);
                        break;
                    default:
                        gimapIdentifierFragment.lambda$onCreateView$0(view);
                        break;
                }
            }
        });
        ((g) this.viewModel).D.f(this, new com.yandex.passport.internal.ui.autologin.b(2, this));
        return inflate;
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.signInButton != null) {
            Bundle arguments = getArguments();
            arguments.getClass();
            arguments.putBoolean("gimap_sign_in_button_enabled", this.signInButton.isEnabled());
            arguments.putSerializable(CURRENT_STATE, this.currentState);
        }
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void processGimapError(GimapError gimapError) {
        setErrorTextFromGimapError(gimapError);
        GimapError gimapError2 = GimapError.FAILED_RESOLVE_SERVERS;
        switch (gimapError.ordinal()) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
                break;
            case 12:
            default:
                this.signInButton.setEnabled(false);
                break;
        }
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void restoreFromArgs(Bundle bundle) {
        State state = (State) bundle.getSerializable(CURRENT_STATE);
        if (state == null) {
            state = State.CHECK_PROVIDER;
        }
        setState(state, getView());
        if (bundle.containsKey("gimap_sign_in_button_enabled")) {
            this.signInButton.setEnabled(bundle.getBoolean("gimap_sign_in_button_enabled", false));
        }
    }
}
