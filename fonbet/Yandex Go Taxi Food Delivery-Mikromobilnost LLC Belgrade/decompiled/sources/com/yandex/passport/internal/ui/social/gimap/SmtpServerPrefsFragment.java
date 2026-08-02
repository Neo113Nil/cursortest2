package com.yandex.passport.internal.ui.social.gimap;

import android.os.Bundle;
import android.view.View;
import com.yandex.passport.R;

/* loaded from: classes2.dex */
public class SmtpServerPrefsFragment extends GimapServerPrefsBaseFragment {
    public static final int DEFAULT_SMTP_PORT = 465;
    public static final String TAG = "SmtpServerPrefsFragment";

    private String getEmail() {
        return com.yandex.passport.common.util.a.e(this.inputEmail.getEditText().getText().toString().trim());
    }

    public static SmtpServerPrefsFragment newInstance() {
        SmtpServerPrefsFragment smtpServerPrefsFragment = new SmtpServerPrefsFragment();
        smtpServerPrefsFragment.setArguments(new Bundle());
        return smtpServerPrefsFragment;
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment
    public GimapServerSettings extractSettingsFromTrack(GimapTrack gimapTrack) {
        return gimapTrack.getSmtpSettings();
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment, com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void fillFromTrack(GimapTrack gimapTrack) {
        super.fillFromTrack(gimapTrack);
        this.inputEmail.getEditText().setText(gimapTrack.getEmail());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment
    public boolean formIsValid() {
        return super.formIsValid() && emailIsValid(getEmail());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment
    public void initTexts(View view) {
        setText(view, R.id.gimap_server_prefs_step_text, R.string.passport_gimap_server_prefs_smtp_step_text);
        setText(view, R.id.gimap_server_prefs_title, R.string.passport_gimap_server_prefs_smtp_title);
        setHint(view, R.id.gimap_edit_host, R.string.passport_gimap_server_prefs_smtp_host_hint);
        setEditTextDefault(view, R.id.gimap_input_port, String.valueOf(DEFAULT_SMTP_PORT));
        setHint(view, R.id.gimap_edit_login, R.string.passport_gimap_server_prefs_smtp_login_hint);
        setHint(view, R.id.gimap_edit_password, R.string.passport_gimap_server_prefs_smtp_pass_hint);
        view.findViewById(R.id.gimap_email_title).setVisibility(0);
        this.inputEmail.setVisibility(0);
        this.signInButton.setText(R.string.passport_login);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public GimapTrack modifyTrack(GimapTrack gimapTrack) {
        return gimapTrack.withSmtpSettings(getEmail(), collectSettings());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment
    public void onNextButtonClicked(View view) {
        ((l) this.viewModel).C.a(updateCurrentTrack());
    }
}
