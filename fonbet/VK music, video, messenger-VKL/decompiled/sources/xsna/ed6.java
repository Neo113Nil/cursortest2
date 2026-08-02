package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;

/* compiled from: BaseExistingProfileFragment.kt */
/* loaded from: classes15.dex */
public abstract class ed6 extends mly<w4q> implements y4q {
    public VkExistingProfileScreenData t;
    public TextView u;
    public View v;
    public VkLoadingButton w;
    public VKImageController<? extends View> x;

    /* compiled from: BaseExistingProfileFragment.kt */
    public static final class a {
        public static Bundle a(VkExistingProfileScreenData vkExistingProfileScreenData) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("screen_data", vkExistingProfileScreenData);
            return bundle;
        }
    }

    public abstract int An();

    public abstract void Bn(View view);

    @Override // xsna.y4q
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.q200
    public final void i3(boolean z) {
        VkLoadingButton vkLoadingButton = this.w;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setEnabled(!z);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        this.t = arguments != null ? (VkExistingProfileScreenData) arguments.getParcelable("screen_data") : null;
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(An(), layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((w4q) obj).e();
        super.onDestroy();
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onDestroyView() {
        yn();
        super.onDestroyView();
    }

    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        y4q y4qVar;
        super.onViewCreated(view, bundle);
        VKReplacerView vKReplacerView = (VKReplacerView) view.findViewById(R.id.existing_profile_avatar_view);
        this.u = (TextView) view.findViewById(R.id.name);
        this.v = view.findViewById(R.id.not_my_account);
        this.w = (VkLoadingButton) view.findViewById(R.id.continue_btn);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        VKImageController<View> create = ifx0Var.b().create(requireContext());
        this.x = create;
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        VkLoadingButton vkLoadingButton = this.w;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setOnClickListener(new f9(this, 2));
        View view2 = this.v;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnClickListener(new dd6(this, 0));
        Bn(view);
        zn();
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        w4q w4qVar = (w4q) obj;
        w4qVar.y0(this);
        SignUpDataHolder signUpDataHolder = w4qVar.p;
        String str = (signUpDataHolder != null ? signUpDataHolder : null).y;
        if (str != null && (y4qVar = (y4q) w4qVar.a) != null) {
            y4qVar.w8(w4qVar.z, str);
        }
        w4qVar.A0();
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        VkExistingProfileScreenData vkExistingProfileScreenData = this.t;
        if (vkExistingProfileScreenData == null) {
            vkExistingProfileScreenData = null;
        }
        return new w4q(vkExistingProfileScreenData);
    }

    public abstract void yn();

    public abstract void zn();

    @Override // xsna.y4q
    public void H2() {
    }

    @Override // xsna.y4q
    public void Fk(String str) {
    }

    @Override // xsna.x65
    public void wm(boolean z) {
    }

    @Override // xsna.q200
    public void w8(String str, String str2) {
    }
}
