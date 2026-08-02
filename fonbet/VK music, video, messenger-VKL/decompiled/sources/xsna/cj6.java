package xsna;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: BasePasswordMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public abstract class cj6 extends mly<km90> implements lm90 {
    public final a A = new a();
    public View t;
    public TextView u;
    public VkAuthPasswordView v;
    public EditText w;
    public TextView x;
    public View y;
    public e68 z;

    /* compiled from: BasePasswordMethodSelectorFragment.kt */
    public static final class a extends xsj0 {
        public a() {
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = cj6.this.o;
            if (obj == null) {
                obj = null;
            }
            ((km90) obj).G1(editable.toString());
        }
    }

    @Override // xsna.rys
    public final void G1(String str) {
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.setText(str);
    }

    @Override // xsna.rys
    public final void H2() {
        VkAuthPasswordView vkAuthPasswordView = this.v;
        if (vkAuthPasswordView == null) {
            vkAuthPasswordView = null;
        }
        vkAuthPasswordView.setPasswordBackgroundId(Integer.valueOf(R.drawable.vk_ui_auth_bg_edittext_stated));
        TextView textView = this.x;
        f4m.j(textView != null ? textView : null);
    }

    @Override // xsna.rys
    public final void J1() {
        VkAuthPasswordView vkAuthPasswordView = this.v;
        if (vkAuthPasswordView == null) {
            vkAuthPasswordView = null;
        }
        vkAuthPasswordView.setPasswordBackgroundId(Integer.valueOf(R.drawable.vk_ui_auth_bg_edittext_error));
        TextView textView = this.x;
        (textView != null ? textView : null).setVisibility(0);
    }

    @Override // xsna.rys
    public final void Rh() {
        View view = this.y;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
    }

    @Override // xsna.rys
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.rys
    public final void i3(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(!z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(yn(), layoutInflater, null);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e68 e68Var = this.z;
        if (e68Var != null) {
            efy.b(e68Var);
        }
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.removeTextChangedListener(this.A);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.t = view.findViewById(R.id.fullscreen_password_root_contrainer);
        this.u = (TextView) view.findViewById(R.id.sub_title);
        this.v = (VkAuthPasswordView) view.findViewById(R.id.password_container);
        ((TextView) view.findViewById(R.id.fullscreen_password_forget_password)).setOnClickListener(new qa6(this, 1));
        EditText editText = (EditText) view.findViewById(R.id.vk_password);
        this.w = editText;
        editText.addTextChangedListener(this.A);
        this.x = (TextView) view.findViewById(R.id.error_message);
        View findViewById = view.findViewById(R.id.verify_by_phone);
        this.y = findViewById;
        jjc.g(findViewById, new sz(this, 6));
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setOnClickListener(new sa6(this, 1));
        }
        View view2 = this.t;
        if (view2 == null) {
            view2 = null;
        }
        e68 e68Var = new e68(view2);
        efy.a(e68Var);
        this.z = e68Var;
        zn(view);
        bpn0 bpn0Var = t65.a;
        EditText editText2 = this.w;
        if (editText2 == null) {
            editText2 = null;
        }
        t65.a(editText2);
        View findViewById2 = view.findViewById(R.id.help_button);
        if (findViewById2 != null) {
            un().getClass();
            findViewById2.setVisibility(otu0.a() ? 0 : 8);
            findViewById2.setOnClickListener(new f9(this, 3));
        }
        Object obj = this.o;
        ((km90) (obj != null ? obj : null)).y0(this);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.AUTH_PASSWORD;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        boolean z2;
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            if (!z) {
                Object obj = this.o;
                if (obj == null) {
                    obj = null;
                }
                if (((km90) obj).I1()) {
                    z2 = true;
                    vkLoadingButton.setEnabled(z2);
                }
            }
            z2 = false;
            vkLoadingButton.setEnabled(z2);
        }
        View view = this.y;
        (view != null ? view : null).setEnabled(!z);
    }

    public abstract int yn();

    public void zn(View view) {
    }
}
