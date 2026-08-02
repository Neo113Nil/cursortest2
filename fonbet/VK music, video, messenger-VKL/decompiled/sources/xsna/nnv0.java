package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.picture.VkImage;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vkontakte.android.R;

/* compiled from: VkSubscribeBottomSheetDialog.kt */
/* loaded from: classes6.dex */
public final class nnv0 extends smu0 {
    public static final /* synthetic */ int j1 = 0;

    /* compiled from: VkSubscribeBottomSheetDialog.kt */
    public static final class a {
        public static nnv0 a(FragmentActivity fragmentActivity, WebGroup webGroup) {
            Bundle bundle = new Bundle();
            bundle.putString("arg_photo", webGroup.d);
            bundle.putString("arg_title", webGroup.c);
            bundle.putString("arg_subtitle", fragmentActivity.getString(R.string.vk_apps_permissions_subscribe_to_group_subtitle));
            nnv0 nnv0Var = new nnv0();
            nnv0Var.setArguments(bundle);
            return nnv0Var;
        }
    }

    @Override // xsna.smu0
    public final View Zn(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.vk_bottom_sheet_permissions, (ViewGroup) frameLayout, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        Bundle arguments = getArguments();
        textView.setText(arguments != null ? arguments.getString("arg_title") : null);
        TextView textView2 = (TextView) inflate.findViewById(R.id.subtitle);
        Bundle arguments2 = getArguments();
        textView2.setText(arguments2 != null ? arguments2.getString("arg_subtitle") : null);
        ((ImageView) inflate.findViewById(R.id.icon)).setVisibility(8);
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.photo);
        vkImage.setVisibility(0);
        vkImage.setRound(true);
        Bundle arguments3 = getArguments();
        vkImage.o0(arguments3 != null ? arguments3.getString("arg_photo") : null, null);
        return inflate;
    }

    @Override // xsna.smu0
    public final String ao() {
        return getString(R.string.vk_apps_join_page);
    }
}
