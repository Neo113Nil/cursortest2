package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: VKPaySuperAppFragment.kt */
/* loaded from: classes6.dex */
public class ker0 extends com.vk.superapp.browser.ui.a implements txv0 {
    public boolean S;
    public final Object T = msy.a(LazyThreadSafetyMode.NONE, new kld0(this, 20));
    public final bpn0 U = new bpn0(new i6m0(this, 8));

    /* compiled from: VKPaySuperAppFragment.kt */
    public static final class a implements i1v0 {
        public final ybv0 a;

        public a(ybv0 ybv0Var) {
            this.a = ybv0Var;
        }

        @Override // xsna.i1v0
        public final zxx get() {
            return new zxx(new l7y(this.a));
        }
    }

    @Override // xsna.txv0
    public final void A() {
        ((xuv0) this.U.getValue()).getClass();
        startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 21);
    }

    @Override // xsna.txv0
    public final void Am(srq0 srq0Var) {
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity activity = getActivity();
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, activity, PermissionHelper.u, R.string.vk_permissions_contacts_vkpay, R.string.vk_permissions_contacts_vkpay_settings, srq0Var, new e750(26), 64);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.browser.ui.a
    public final agu0 En() {
        return new ier0(this, yn(), (tzu0) this.w.getValue(), new x1e0(this, 20), new jcf0(this, 14), new z4d0(this, 24));
    }

    @Override // xsna.txv0
    public final void Mf(int i, Intent intent) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        qro0.c(new tfm0(this, 13));
    }

    @Override // com.vk.superapp.browser.ui.a
    public final wwv0 m5(tvv0 tvv0Var) {
        return new ybv0(this, tvv0Var, (com.vk.superapp.navigation.api.di.c) this.Q.getValue());
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 21 || i2 != -1 || intent == null) {
            if (i == 21) {
                ((xuv0) this.U.getValue()).b("Cancelled");
            }
        } else {
            PermissionHelper permissionHelper = PermissionHelper.a;
            FragmentActivity activity = getActivity();
            permissionHelper.getClass();
            PermissionHelper.h(permissionHelper, activity, PermissionHelper.u, R.string.vk_permissions_contacts_vkpay, R.string.vk_permissions_contacts_vkpay_settings, new zv(21, this, intent), null, 96);
        }
    }

    @Override // com.vk.superapp.browser.ui.a, xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        this.S = arguments != null ? arguments.getBoolean("for_result", false) : false;
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.D) {
            vn().d.r(JsApiEvent.UPDATE_INFO, new JSONObject());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.superapp.browser.ui.a
    public final i1v0 xn() {
        return (i1v0) this.T.getValue();
    }

    @Override // xsna.txv0
    public final void y1(String str) {
    }
}
