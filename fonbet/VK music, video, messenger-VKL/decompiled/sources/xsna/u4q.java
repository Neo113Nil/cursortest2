package xsna;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.ui.VkCustomExistingProfile;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.ImageSizeKey;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: ExistingProfileNeedPasswordFragment.kt */
/* loaded from: classes15.dex */
public class u4q extends ed6 {
    public EditText A;
    public TextView B;
    public TextView C;
    public jr80 E;
    public e68 F;
    public View y;
    public View z;
    public final int D = R.layout.vk_auth_existing_profile_login_need_password_fragment;
    public final a G = new a();

    /* compiled from: ExistingProfileNeedPasswordFragment.kt */
    public static final class a extends xsj0 {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.xsj0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = u4q.this.o;
            if (obj == null) {
                obj = null;
            }
            w4q w4qVar = (w4q) obj;
            String obj2 = editable.toString();
            if (epx.f(w4qVar.y, obj2)) {
                return;
            }
            w4qVar.y = obj2;
            ((jm90) w4qVar.x.getValue()).a();
            w4qVar.A0();
        }
    }

    @Override // xsna.ed6
    public final int An() {
        return this.D;
    }

    @Override // xsna.ed6
    public final void Bn(View view) {
        this.y = view.findViewById(R.id.existing_profile_need_password_container);
        this.m = (NestedScrollView) view.findViewById(R.id.base_auth_scrollable_content_container);
        View findViewById = view.findViewById(R.id.existing_fragment_forget_password);
        if (findViewById != null) {
            jjc.g(findViewById, new lrk(this, 10));
        } else {
            findViewById = null;
        }
        this.z = findViewById;
        this.C = (TextView) view.findViewById(R.id.phone_number);
        EditText editText = (EditText) view.findViewById(R.id.vk_password);
        editText.addTextChangedListener(this.G);
        this.A = editText;
        this.B = (TextView) view.findViewById(R.id.auth_existing_profile_error);
        jr80 jr80Var = new jr80(this.m, new q5f(this, 18));
        this.E = jr80Var;
        efy.a(jr80Var);
        e68 e68Var = new e68(this.y);
        efy.a(e68Var);
        this.F = e68Var;
        r55 r55Var = r55.a;
        Object i = r55.i();
        VkCustomExistingProfile vkCustomExistingProfile = i instanceof VkCustomExistingProfile ? (VkCustomExistingProfile) i : null;
        if (vkCustomExistingProfile != null) {
            VkCustomExistingProfile.Mode mode = VkCustomExistingProfile.Mode.NeedPassword;
            vkCustomExistingProfile.b();
            vkCustomExistingProfile.a();
        }
        view.post(new hv1(this, 5));
        View findViewById2 = view.findViewById(R.id.help_button);
        if (findViewById2 != null) {
            un().getClass();
            findViewById2.setVisibility(otu0.a() ? 0 : 8);
            findViewById2.setOnClickListener(new vw0(this, 7));
        }
    }

    @Override // xsna.ed6, xsna.y4q
    public final void Fk(String str) {
        EditText editText = this.A;
        if (editText != null) {
            editText.setBackgroundResource(R.drawable.vk_ui_auth_bg_edittext_error);
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.B;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // xsna.ed6, xsna.y4q
    public final void H2() {
        EditText editText = this.A;
        if (editText != null) {
            editText.setBackgroundResource(R.drawable.vk_auth_bg_edittext_stated);
        }
        TextView textView = this.B;
        if (textView != null) {
            f4m.j(textView);
        }
    }

    @Override // xsna.ed6, xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e68 e68Var = this.F;
        if (e68Var != null) {
            efy.b(e68Var);
        }
        super.onDestroyView();
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT;
    }

    @Override // xsna.ed6, xsna.q200
    public final void w8(String str, String str2) {
        s3q0 s3q0Var;
        EditText editText;
        EditText editText2 = this.A;
        if (editText2 != null) {
            editText2.setText(str2);
        }
        EditText editText3 = this.A;
        if (editText3 != null) {
            editText3.setSelection(str2.length());
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var != null || (editText = this.A) == null) {
            return;
        }
        editText.setText("");
        s3q0 s3q0Var2 = s3q0.a;
    }

    @Override // xsna.ed6, xsna.x65
    public final void wm(boolean z) {
        EditText editText = this.A;
        if (editText != null) {
            editText.setEnabled(!z);
        }
    }

    @Override // xsna.ed6
    public final void yn() {
        int i = efy.a;
        jr80 jr80Var = this.E;
        if (jr80Var == null) {
            jr80Var = null;
        }
        efy.b(jr80Var);
        e68 e68Var = this.F;
        if (e68Var != null) {
            efy.b(e68Var);
        }
        EditText editText = this.A;
        if (editText != null) {
            editText.removeTextChangedListener(this.G);
        }
    }

    @Override // xsna.ed6
    public final void zn() {
        VKImageController.b a2 = adu0.a(6, requireContext());
        VKImageController<? extends View> vKImageController = this.x;
        if (vKImageController == null) {
            vKImageController = null;
        }
        VkExistingProfileScreenData vkExistingProfileScreenData = this.t;
        if (vkExistingProfileScreenData == null) {
            vkExistingProfileScreenData = null;
        }
        vKImageController.f(vkExistingProfileScreenData.c.e, a2);
        TextView textView = this.u;
        if (textView == null) {
            textView = null;
        }
        VkExistingProfileScreenData vkExistingProfileScreenData2 = this.t;
        if (vkExistingProfileScreenData2 == null) {
            vkExistingProfileScreenData2 = null;
        }
        textView.setText(vkExistingProfileScreenData2.c.i);
        TextView textView2 = this.C;
        if (textView2 != null) {
            VkExistingProfileScreenData vkExistingProfileScreenData3 = this.t;
            textView2.setText((vkExistingProfileScreenData3 != null ? vkExistingProfileScreenData3 : null).c.f.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 8226));
        }
    }
}
