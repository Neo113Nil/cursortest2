package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.auth.screendata.VkExistingProfileScreenData;
import com.vk.auth.ui.VkCustomExistingProfile;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.ImageSizeKey;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: ExistingProfileNoPasswordFragment.kt */
/* loaded from: classes15.dex */
public class v4q extends ed6 {
    public TextView y;
    public final int z = R.layout.vk_auth_existing_profile_login_no_password_fragment;

    @Override // xsna.ed6
    public final int An() {
        return this.z;
    }

    @Override // xsna.ed6
    public final void Bn(View view) {
        this.y = (TextView) view.findViewById(R.id.phone_number);
        r55 r55Var = r55.a;
        Object i = r55.i();
        VkCustomExistingProfile vkCustomExistingProfile = i instanceof VkCustomExistingProfile ? (VkCustomExistingProfile) i : null;
        if (vkCustomExistingProfile != null) {
            VkCustomExistingProfile.Mode mode = VkCustomExistingProfile.Mode.NeedPassword;
            vkCustomExistingProfile.b();
            vkCustomExistingProfile.a();
        }
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new y01(this, 9));
        }
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD;
    }

    @Override // xsna.ed6
    public final void zn() {
        VKImageController.b a = adu0.a(6, requireContext());
        VKImageController<? extends View> vKImageController = this.x;
        if (vKImageController == null) {
            vKImageController = null;
        }
        VkExistingProfileScreenData vkExistingProfileScreenData = this.t;
        if (vkExistingProfileScreenData == null) {
            vkExistingProfileScreenData = null;
        }
        vKImageController.f(vkExistingProfileScreenData.c.e, a);
        TextView textView = this.u;
        if (textView == null) {
            textView = null;
        }
        VkExistingProfileScreenData vkExistingProfileScreenData2 = this.t;
        if (vkExistingProfileScreenData2 == null) {
            vkExistingProfileScreenData2 = null;
        }
        textView.setText(vkExistingProfileScreenData2.c.i);
        TextView textView2 = this.y;
        if (textView2 == null) {
            textView2 = null;
        }
        VkExistingProfileScreenData vkExistingProfileScreenData3 = this.t;
        textView2.setText((vkExistingProfileScreenData3 != null ? vkExistingProfileScreenData3 : null).c.f.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183));
    }

    @Override // xsna.ed6
    public final void yn() {
    }
}
