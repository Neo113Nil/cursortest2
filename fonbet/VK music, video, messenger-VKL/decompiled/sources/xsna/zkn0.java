package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.auth.suspicious_auth.SuspiciousAuthComponent;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.SendOtpInfo;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SuspiciousAuthFragment.kt */
/* loaded from: classes15.dex */
public final class zkn0 extends a66<cln0> implements dln0 {
    public final Object s;
    public final Object t;
    public final Object u;

    /* compiled from: SuspiciousAuthFragment.kt */
    public static final class a {
        public static Bundle a(VkAuthState vkAuthState, SendOtpInfo sendOtpInfo, ValidateInfo validateInfo) {
            Bundle bundle = new Bundle(2);
            bundle.putParcelable("arg_validate_info", validateInfo);
            bundle.putParcelable("arg_send_otp_info", sendOtpInfo);
            bundle.putParcelable("arg_credentials", vkAuthState.Ab());
            return bundle;
        }
    }

    public zkn0() {
        fem0 fem0Var = new fem0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s = msy.a(lazyThreadSafetyMode, fem0Var);
        this.t = msy.a(lazyThreadSafetyMode, new odc0(this, 19));
        this.u = msy.a(lazyThreadSafetyMode, new wrl0(this, 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_suspicious_auth_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((cln0) obj).y0(this);
        if (bundle == null) {
            Object obj2 = this.o;
            ((cln0) (obj2 != null ? obj2 : null)).J();
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.vk_id_logo);
        r55 r55Var = r55.a;
        imageView.setImageDrawable(r55.i().b(view.getContext()));
        ((VkSimpleButton) view.findViewById(R.id.vk_suspicious_auth_action_button)).setOnClickListener(new isk(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.a66
    public final cln0 tn(Bundle bundle) {
        return new aln0((SendOtpInfo) this.t.getValue(), ((SuspiciousAuthComponent) m7m.d(this).a(fpf0.a(SuspiciousAuthComponent.class))).c(), new ykn0());
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
