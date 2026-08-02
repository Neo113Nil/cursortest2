package xsna;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: DebugDevSettingsFragment.java */
/* loaded from: classes17.dex */
public final class v4l implements TextWatcher {
    public final /* synthetic */ TextView b;

    public v4l(TextView textView) {
        this.b = textView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(obj);
        TextView textView = this.b;
        if (isEmpty) {
            textView.setText(R.string.debug_api_version_button_reset);
        } else {
            textView.setText(R.string.ok);
        }
        textView.setEnabled(obj.matches("^\\d+\\.\\d+$") || TextUtils.isEmpty(obj));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
