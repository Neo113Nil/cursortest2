package xsna;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.ironsource.O6;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vkontakte.android.R;

/* compiled from: MethodSelectorBottomSheetFragment.kt */
/* loaded from: classes3.dex */
public class oj20 extends oeu0 {
    public rj20 C;
    public final otu0 D = new otu0();
    public final int E = R.layout.vk_auth_method_selector_fragment;

    @Override // xsna.oeu0
    public final int Gn() {
        return this.E;
    }

    public final void Mn() {
        if (getParentFragmentManager().T()) {
            tn();
        } else {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        rj20 rj20Var = this.C;
        if (rj20Var != null) {
            rj20Var.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MethodSelectorView methodSelectorView = (MethodSelectorView) view.findViewById(R.id.method_selector_view);
        ImageView imageView = (ImageView) view.findViewById(R.id.method_selector_cancel_button);
        rj20 rj20Var = this.C;
        if (rj20Var != null) {
            methodSelectorView.setOnMethodSelectorListener(new l3g(this, rj20Var));
        }
        methodSelectorView.setOnHelpClickListener(new lo10(this, 1));
        methodSelectorView.setListUpdatedListener(new ko00(this, 6));
        int i = 7;
        methodSelectorView.setOnMethodSelectorErrorListener(new oyr(this, i));
        imageView.setOnClickListener(new l44(this, i));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(O6.e1) : null;
        if (string == null) {
            throw new IllegalArgumentException("Sid must be passed in order to make network requests");
        }
        methodSelectorView.setSid(string);
        Bundle arguments2 = getArguments();
        methodSelectorView.setIsOkMimicry(arguments2 != null ? arguments2.getBoolean("is_ok_mimicry", false) : false);
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("login") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Login must be passed in order to open restore");
        }
        methodSelectorView.setLogin(string2);
        Bundle arguments4 = getArguments();
        VerificationMethodTypes verificationMethodTypes = arguments4 != null ? (VerificationMethodTypes) arguments4.getParcelable("selected_type") : null;
        methodSelectorView.setSelectedType(verificationMethodTypes != null ? verificationMethodTypes : null);
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setOnShowListener(new nj20(this, 0));
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFastLoginBottomSheetTheme;
    }
}
