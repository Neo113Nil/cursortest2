package com.vkontakte.android;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.vk.pushes.PushAwareActivity;
import com.vk.typography.FontFamily;
import com.vkontakte.android.activities.LogoutReceiver;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.cvk;
import xsna.dhr0;
import xsna.gdr0;
import xsna.h7u0;
import xsna.jx2;
import xsna.mhy;
import xsna.mn;
import xsna.msa;
import xsna.rok;
import xsna.sok;
import xsna.tok;

/* loaded from: classes7.dex */
public class ChangePasswordActivity extends PushAwareActivity implements rok {
    public androidx.appcompat.app.d x;
    public View y;
    public final sok v = new sok(this);
    public LogoutReceiver w = null;
    public final a z = new a();

    public class b implements DialogInterface.OnShowListener {
        public final /* synthetic */ TextView b;

        public b(TextView textView) {
            this.b = textView;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            mhy.j(this.b);
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            ChangePasswordActivity.this.finish();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ChangePasswordActivity changePasswordActivity = ChangePasswordActivity.this;
            String charSequence = ((TextView) changePasswordActivity.y.findViewById(R.id.old_password)).getText().toString();
            String charSequence2 = ((TextView) changePasswordActivity.y.findViewById(R.id.new_password)).getText().toString();
            String charSequence3 = ((TextView) changePasswordActivity.y.findViewById(R.id.new_password2)).getText().toString();
            if (charSequence.length() < 4) {
                cvk.u(R.string.old_password_incorrect, false);
                return;
            }
            if (!charSequence2.equals(charSequence3)) {
                cvk.u(R.string.passwords_not_match, false);
                return;
            }
            if (charSequence2.length() < 6) {
                cvk.u(R.string.signup_pass_too_short, false);
                return;
            }
            mn mnVar = new mn("account.changePassword");
            mnVar.K(LoginApiConstants.PARAM_NAME_OLD_PASSWORD, charSequence);
            mnVar.K("new_password", charSequence2);
            jx2 jx2Var = new jx2(mnVar, new msa(changePasswordActivity, changePasswordActivity));
            jx2Var.g = changePasswordActivity;
            jx2Var.a();
        }
    }

    @Override // xsna.rok
    @Nullable
    public final tok R() {
        return this.v;
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.L() ? R.style.TranslucentStyle : R.style.TranslucentStyleDark);
        super.onCreate(bundle);
        this.w = LogoutReceiver.a(this);
        View inflate = ((gdr0) getSystemService("layout_inflater")).inflate(R.layout.change_password, (ViewGroup) null);
        this.y = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.old_password);
        TextView textView2 = (TextView) this.y.findViewById(R.id.new_password);
        TextView textView3 = (TextView) this.y.findViewById(R.id.new_password2);
        FontFamily fontFamily = FontFamily.REGULAR;
        com.vk.typography.b.f(textView, fontFamily);
        com.vk.typography.b.f(textView2, fontFamily);
        com.vk.typography.b.f(textView3, fontFamily);
        a aVar = this.z;
        textView.addTextChangedListener(aVar);
        textView2.addTextChangedListener(aVar);
        textView3.addTextChangedListener(aVar);
        h7u0.a aVar2 = new h7u0.a(this);
        aVar2.g0(R.string.change_password);
        aVar2.f = this.y;
        aVar2.c0(R.string.ok, null);
        aVar2.W(R.string.cancel, null);
        androidx.appcompat.app.d m = aVar2.m();
        this.x = m;
        m.getWindow().clearFlags(131080);
        this.x.getWindow().setSoftInputMode(5);
        this.x.setOnShowListener(new b(textView));
        this.x.setOnDismissListener(new c());
        this.x.h.j.setEnabled(false);
        this.x.h.j.setOnClickListener(new d());
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.w.b();
        super.onDestroy();
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ChangePasswordActivity changePasswordActivity = ChangePasswordActivity.this;
            changePasswordActivity.x.h.j.setEnabled(((TextView) changePasswordActivity.y.findViewById(R.id.old_password)).getText().toString().length() > 0 && ((TextView) changePasswordActivity.y.findViewById(R.id.new_password)).getText().toString().length() > 0 && ((TextView) changePasswordActivity.y.findViewById(R.id.new_password2)).getText().toString().length() > 0);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
