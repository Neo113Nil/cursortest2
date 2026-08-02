package xsna;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.whitelabelauth.di.data.WhiteLabelAuthData;
import com.vkontakte.android.R;

/* compiled from: WhiteLabelAuthFragment.kt */
/* loaded from: classes15.dex */
public final class vkx0 extends a66<skx0> implements tkx0, w8i {
    public CircularProgressView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public final bpn0 x = new bpn0(new gos0(5));
    public VkLoadingButton y;
    public VKImageController<? extends View> z;

    @Override // xsna.a66, xsna.dhg
    public final ehg Mb() {
        return new wcl(requireContext(), new DialogInterface.OnDismissListener() { // from class: xsna.ukx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vkx0.this.e();
            }
        });
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        super.S(z);
        CircularProgressView circularProgressView = this.s;
        if (circularProgressView != null) {
            awt0.v(circularProgressView, z);
        }
    }

    @Override // xsna.tkx0
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_white_label_auth_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = (CircularProgressView) view.findViewById(R.id.white_label_progress_bar);
        this.t = (TextView) view.findViewById(R.id.white_label_title);
        this.u = (TextView) view.findViewById(R.id.white_label_subtitle);
        this.v = (TextView) view.findViewById(R.id.white_label_user_name);
        this.w = (TextView) view.findViewById(R.id.white_label_user_phone);
        this.y = (VkLoadingButton) view.findViewById(R.id.white_label_another_account);
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((skx0) obj).y0(this);
        VKReplacerView vKReplacerView = (VKReplacerView) view.findViewById(R.id.white_label_avatar_view);
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var != null ? ifx0Var : null).b().create(requireContext());
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        this.z = create;
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            jjc.g(vkLoadingButton, new bjm0(this, 28));
        }
        VkLoadingButton vkLoadingButton2 = this.y;
        if (vkLoadingButton2 != null) {
            jjc.g(vkLoadingButton2, new biw0(this, 9));
        }
        bpn0 bpn0Var = t65.a;
        mhy.b(requireContext());
    }

    @Override // xsna.a66
    public final skx0 tn(Bundle bundle) {
        WhiteLabelAuthData whiteLabelAuthData;
        Bundle arguments = getArguments();
        if (arguments == null || (whiteLabelAuthData = (WhiteLabelAuthData) arguments.getParcelable("key_white_label_auth_data")) == null) {
            whiteLabelAuthData = new WhiteLabelAuthData("", "");
        }
        return new xkx0(whiteLabelAuthData, kn());
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        CircularProgressView circularProgressView = this.s;
        return (circularProgressView == null || circularProgressView.getVisibility() == 0) ? SchemeStatSak$EventScreen.SILENT_AUTH_LOADING : SchemeStatSak$EventScreen.SILENT_AUTH_EXISTING_ACCOUNT;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
