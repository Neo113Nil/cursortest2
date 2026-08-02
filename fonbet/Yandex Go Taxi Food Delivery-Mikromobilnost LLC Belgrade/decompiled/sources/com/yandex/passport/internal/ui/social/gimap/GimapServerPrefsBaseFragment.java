package com.yandex.passport.internal.ui.social.gimap;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.util.ShowHidePasswordClickListener;
import com.yandex.passport.internal.ui.util.SimpleTextWatcher;
import com.yandex.passport.internal.widget.InputFieldView;
import defpackage.qke;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class GimapServerPrefsBaseFragment extends GimapBaseFragment<l> {
    public static final String SHOW_ERROR = "show_error";
    public static final String SIGN_IN_BUTTON_IS_ENABLED = "gimap_sign_in_button_enabled";
    private final TextWatcher buttonCheckWatcher = new SimpleTextWatcher(new com.yandex.passport.internal.ui.a(14, this));
    private final CompoundButton.OnCheckedChangeListener buttonCheckWatcherToggle = new CompoundButton.OnCheckedChangeListener() { // from class: com.yandex.passport.internal.ui.social.gimap.h
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            GimapServerPrefsBaseFragment.this.lambda$new$1(compoundButton, z);
        }
    };
    private Switch checkBoxSsl;
    protected TextView errorText;
    protected TextView errorTitle;
    protected InputFieldView inputEmail;
    private EditText inputHost;
    private InputFieldView inputLogin;
    private InputFieldView inputPassword;
    private EditText inputPort;
    protected Button signInButton;

    private String getLogin() {
        return this.inputLogin.getEditText().getText().toString().trim();
    }

    private String getPassword() {
        return this.inputPassword.getEditText().getText().toString();
    }

    private String getServerHost() {
        return this.inputHost.getText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Editable editable) {
        this.signInButton.setEnabled(formIsValid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(CompoundButton compoundButton, boolean z) {
        this.signInButton.setEnabled(formIsValid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$2(View view) {
        this.inputPort.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateView$4(View view) {
        this.checkBoxSsl.toggle();
    }

    private void tintBackground(ViewGroup viewGroup, int i) {
        Drawable background = viewGroup.getBackground();
        background.setTintList(qke.m(i, requireContext()));
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        viewGroup.setBackground(background);
    }

    public void applySettings(GimapServerSettings gimapServerSettings) {
        this.inputHost.setText(gimapServerSettings.getHost());
        if (gimapServerSettings.getPort() != null) {
            this.inputPort.setText(String.valueOf(gimapServerSettings.getPort()));
        }
        this.inputLogin.getEditText().setText(gimapServerSettings.getLogin());
        this.inputPassword.getEditText().setText(gimapServerSettings.getPassword());
        if (gimapServerSettings.getSsl() != null) {
            this.checkBoxSsl.setChecked(gimapServerSettings.getSsl().booleanValue());
        }
    }

    public GimapServerSettings collectSettings() {
        return new GimapServerSettings(com.yandex.passport.common.util.a.e(getServerHost()), com.yandex.passport.common.util.a.e(this.inputPort.getText().toString()), Boolean.valueOf(this.checkBoxSsl.isChecked()), com.yandex.passport.common.util.a.e(getLogin()), com.yandex.passport.common.util.a.e(getPassword()));
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public l createViewModel(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        return new l(getGimapViewModel(), passportProcessGlobalComponent.getEventReporter(), passportProcessGlobalComponent.getLoginController());
    }

    public abstract GimapServerSettings extractSettingsFromTrack(GimapTrack gimapTrack);

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void fillFromTrack(GimapTrack gimapTrack) {
        applySettings(extractSettingsFromTrack(gimapTrack));
    }

    public boolean formIsValid() {
        return collectSettings().isFull();
    }

    public abstract void initTexts(View view);

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_gimap_server_prefs, viewGroup, false);
        this.inputHost = (EditText) inflate.findViewById(R.id.gimap_edit_host);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.gimap_input_port_container);
        this.inputPort = (EditText) viewGroup2.findViewById(R.id.gimap_input_port);
        tintBackground(viewGroup2, R.color.passport_tint_edittext_container);
        viewGroup2.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.i
            public final /* synthetic */ GimapServerPrefsBaseFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                GimapServerPrefsBaseFragment gimapServerPrefsBaseFragment = this.b;
                switch (i2) {
                    case 0:
                        gimapServerPrefsBaseFragment.lambda$onCreateView$2(view);
                        break;
                    case 1:
                        gimapServerPrefsBaseFragment.lambda$onCreateView$4(view);
                        break;
                    default:
                        gimapServerPrefsBaseFragment.onNextButtonClicked(view);
                        break;
                }
            }
        });
        this.inputPort.setOnFocusChangeListener(new j(i, viewGroup2));
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.gimap_checkbox_ssl_container);
        Switch r5 = (Switch) inflate.findViewById(R.id.gimap_checkbox_ssl);
        this.checkBoxSsl = r5;
        r5.setOnCheckedChangeListener(this.buttonCheckWatcherToggle);
        final int i2 = 1;
        viewGroup3.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.i
            public final /* synthetic */ GimapServerPrefsBaseFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                GimapServerPrefsBaseFragment gimapServerPrefsBaseFragment = this.b;
                switch (i22) {
                    case 0:
                        gimapServerPrefsBaseFragment.lambda$onCreateView$2(view);
                        break;
                    case 1:
                        gimapServerPrefsBaseFragment.lambda$onCreateView$4(view);
                        break;
                    default:
                        gimapServerPrefsBaseFragment.onNextButtonClicked(view);
                        break;
                }
            }
        });
        this.inputLogin = (InputFieldView) inflate.findViewById(R.id.gimap_input_login);
        this.inputPassword = (InputFieldView) inflate.findViewById(R.id.gimap_input_password);
        this.inputEmail = (InputFieldView) inflate.findViewById(R.id.input_email);
        this.inputLogin.getEditText().addTextChangedListener(this.buttonCheckWatcher);
        this.inputPassword.getEditText().addTextChangedListener(this.buttonCheckWatcher);
        this.inputEmail.getEditText().addTextChangedListener(this.buttonCheckWatcher);
        this.inputPort.addTextChangedListener(this.buttonCheckWatcher);
        this.inputHost.addTextChangedListener(this.buttonCheckWatcher);
        inflate.findViewById(R.id.gimap_button_password_masking).setOnClickListener(new ShowHidePasswordClickListener(this.inputPassword.getEditText()));
        Button button = (Button) inflate.findViewById(R.id.button_sign_in);
        this.signInButton = button;
        final int i3 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.social.gimap.i
            public final /* synthetic */ GimapServerPrefsBaseFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                GimapServerPrefsBaseFragment gimapServerPrefsBaseFragment = this.b;
                switch (i22) {
                    case 0:
                        gimapServerPrefsBaseFragment.lambda$onCreateView$2(view);
                        break;
                    case 1:
                        gimapServerPrefsBaseFragment.lambda$onCreateView$4(view);
                        break;
                    default:
                        gimapServerPrefsBaseFragment.onNextButtonClicked(view);
                        break;
                }
            }
        });
        this.errorTitle = (TextView) inflate.findViewById(R.id.error_title);
        this.errorText = (TextView) inflate.findViewById(R.id.error_text);
        initTexts(inflate);
        return inflate;
    }

    public abstract void onNextButtonClicked(View view);

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.signInButton != null) {
            Bundle arguments = getArguments();
            arguments.getClass();
            arguments.putBoolean("gimap_sign_in_button_enabled", this.signInButton.isEnabled());
            arguments.putInt(SHOW_ERROR, this.errorTitle.getVisibility());
        }
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void processGimapError(GimapError gimapError) {
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
        this.errorTitle.setText(gimapError.titleRes);
        switch (k.a[gimapError.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.errorText.setText(R.string.passport_gimap_ask_admin);
                break;
            case 4:
            case 5:
            case 6:
                this.errorText.setText(R.string.passport_gimap_try_later);
                break;
            case 7:
                this.errorText.setText(R.string.passport_gimap_server_prefs_bad_email_err_text);
                break;
            default:
                this.errorText.setText(R.string.passport_gimap_server_prefs_err_common_text);
                break;
        }
        this.errorTitle.setVisibility(0);
        this.errorText.setVisibility(0);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void restoreFromArgs(Bundle bundle) {
        if (bundle.containsKey("gimap_sign_in_button_enabled")) {
            this.signInButton.setEnabled(bundle.getBoolean("gimap_sign_in_button_enabled", false));
        }
        int i = bundle.getInt(SHOW_ERROR, 8);
        this.errorTitle.setVisibility(i);
        this.errorText.setVisibility(i);
    }

    public void setEditTextDefault(View view, int i, String str) {
        EditText editText = (EditText) view.findViewById(i);
        editText.setText(str);
        editText.setHint(str);
    }

    public void setHint(View view, int i, int i2) {
        ((EditText) view.findViewById(i)).setHint(i2);
    }

    public void setText(View view, int i, int i2) {
        ((TextView) view.findViewById(i)).setText(i2);
    }
}
