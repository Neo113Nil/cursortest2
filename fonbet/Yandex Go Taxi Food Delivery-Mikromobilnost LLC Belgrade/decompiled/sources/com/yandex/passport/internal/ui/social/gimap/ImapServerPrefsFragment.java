package com.yandex.passport.internal.ui.social.gimap;

import android.os.Bundle;
import android.view.View;
import com.yandex.passport.R;

/* loaded from: classes2.dex */
public class ImapServerPrefsFragment extends GimapServerPrefsBaseFragment {
    public static final int DEFAULT_IMAP_PORT = 993;
    public static final String TAG = "ImapServerPrefsFragment";

    public static ImapServerPrefsFragment newInstance() {
        ImapServerPrefsFragment imapServerPrefsFragment = new ImapServerPrefsFragment();
        imapServerPrefsFragment.setArguments(new Bundle());
        return imapServerPrefsFragment;
    }

    private void showSmtpSettings() {
        this.errorTitle.setVisibility(8);
        this.errorText.setVisibility(8);
        ((MailGIMAPActivity) requireActivity()).showSmtpSettings();
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment
    public GimapServerSettings extractSettingsFromTrack(GimapTrack gimapTrack) {
        return gimapTrack.getImapSettings();
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment
    public void initTexts(View view) {
        setText(view, R.id.gimap_server_prefs_step_text, R.string.passport_gimap_server_prefs_imap_step_text);
        setText(view, R.id.gimap_server_prefs_title, R.string.passport_gimap_server_prefs_imap_title);
        setHint(view, R.id.gimap_edit_host, R.string.passport_gimap_server_prefs_imap_host_hint);
        setEditTextDefault(view, R.id.gimap_input_port, String.valueOf(DEFAULT_IMAP_PORT));
        setHint(view, R.id.gimap_edit_login, R.string.passport_gimap_server_prefs_imap_login_hint);
        setHint(view, R.id.gimap_edit_password, R.string.passport_gimap_server_prefs_imap_pass_hint);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public GimapTrack modifyTrack(GimapTrack gimapTrack) {
        return gimapTrack.withImapSettings(collectSettings());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment
    public void onNextButtonClicked(View view) {
        ((l) this.viewModel).C.a(updateCurrentTrack().minusSmtpSettings());
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment, com.yandex.passport.internal.ui.social.gimap.GimapBaseFragment
    public void processGimapError(GimapError gimapError) {
        if (gimapError == GimapError.SMTP_INCOMPLETE_PARAMS) {
            showSmtpSettings();
        } else {
            super.processGimapError(gimapError);
        }
    }
}
