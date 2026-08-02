package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.auth.ui.VkAuthExtendedEditText;
import com.vk.auth.ui.VkAuthTextView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: EnterEmailFragment.kt */
/* loaded from: classes15.dex */
public final class wmp extends a66<ump> implements vmp {
    public EditText s;
    public VkAuthExtendedEditText t;
    public TextView u;
    public VkAuthTextView v;

    /* compiled from: EnterEmailFragment.kt */
    public static final class a {
        public static Bundle a(boolean z) {
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("isSkippableKey", z);
            return bundle;
        }
    }

    @Override // xsna.vmp
    public final void Pm(String str) {
        boolean z = str != null;
        VkAuthExtendedEditText vkAuthExtendedEditText = this.t;
        if (vkAuthExtendedEditText != null) {
            vkAuthExtendedEditText.setErrorState(z);
        }
        TextView textView = this.u;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        TextView textView2 = this.u;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // xsna.vmp
    public final void W4(boolean z) {
        VkAuthTextView vkAuthTextView = this.v;
        if (vkAuthTextView != null) {
            vkAuthTextView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_enter_email_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = (EditText) view.findViewById(R.id.enter_email_input);
        this.t = (VkAuthExtendedEditText) view.findViewById(R.id.enter_email_input_container);
        this.u = (TextView) view.findViewById(R.id.enter_email_input_error_text);
        this.v = (VkAuthTextView) view.findViewById(R.id.enter_email_skip_button);
        EditText editText = this.s;
        if (editText != null) {
            oa01.a(editText, new wik(this, 5));
        }
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setOnClickListener(new a50(this, 5));
        }
        VkAuthTextView vkAuthTextView = this.v;
        if (vkAuthTextView != null) {
            vkAuthTextView.setOnClickListener(new z00(this, 4));
        }
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((ump) obj).y0(this);
        EditText editText2 = this.s;
        if (editText2 != null) {
            t65.a(editText2);
        }
    }

    @Override // xsna.vmp
    public final void setContinueButtonEnabled(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(z);
        }
    }

    @Override // xsna.a66
    public final ump tn(Bundle bundle) {
        Bundle arguments = getArguments();
        return new xmp(arguments != null ? arguments.getBoolean("isSkippableKey") : false);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.REGISTRATION_EMAIL;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        boolean z2 = !z;
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(z2);
        }
    }
}
