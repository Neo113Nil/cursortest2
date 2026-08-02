package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.vk.auth.ui.VkAuthTextView;
import com.vkontakte.android.R;

/* compiled from: PasswordCheckBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public final class gm90 extends com.vk.auth.ui.checkaccess.a {
    public static final int v = iah0.a(0);
    public static final int w = iah0.a(44);
    public View u;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_check_password_bottomsheet_fragment, viewGroup, false);
    }

    @Override // com.vk.auth.ui.checkaccess.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.u = view.findViewById(R.id.divider);
        ((ImageView) view.findViewById(R.id.check_password_navigation_icon)).setOnClickListener(new nn9(this, 5));
        ((VkAuthTextView) view.findViewById(R.id.forget_password)).setOnClickListener(new tg(this, 4));
        ImageView imageView = this.j;
        if (imageView == null) {
            imageView = null;
        }
        f4m.t(v, imageView);
        VkAuthTextView vkAuthTextView = this.i;
        (vkAuthTextView != null ? vkAuthTextView : null).setLayoutParams(new LinearLayout.LayoutParams(-1, w));
    }
}
