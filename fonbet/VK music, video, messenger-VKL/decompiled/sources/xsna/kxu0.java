package xsna;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.vk.superapp.ui.SuperAppFragment;

/* compiled from: VkHealthComponentWrapper.kt */
/* loaded from: classes6.dex */
public final class kxu0 {
    public Fragment a;
    public Activity b;

    /* compiled from: VkHealthComponentWrapper.kt */
    public static final class a {
        public static kxu0 a(SuperAppFragment superAppFragment) {
            kxu0 kxu0Var = new kxu0();
            kxu0Var.a = superAppFragment;
            return kxu0Var;
        }
    }

    public final Activity a() {
        Activity activity = this.b;
        if (activity != null) {
            return activity;
        }
        Fragment fragment = this.a;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }
}
