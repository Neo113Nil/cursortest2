package xsna;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;
import xsna.z55;

/* compiled from: LandingFragment.kt */
/* loaded from: classes.dex */
public abstract class mly<P extends z55<?>> extends a66<P> {
    public ImageView s;

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.logo);
        this.s = imageView;
        if (imageView != null) {
            ycu0 ycu0Var = this.p;
            if (ycu0Var == null) {
                ycu0Var = null;
            }
            ycu0Var.getClass();
            imageView.setImageResource(R.drawable.vk_icon_new_vk_logo_color_48);
        }
    }
}
