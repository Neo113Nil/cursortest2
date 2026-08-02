package xsna;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class i76 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ i76(boolean z, int i) {
        this.b = i;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        switch (i) {
            case 0:
                Fragment fragment = (Fragment) obj;
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    int i2 = VkFriendsPickerActivity.p;
                    fragment.startActivityForResult(new Intent(activity, (Class<?>) VkFriendsPickerActivity.class).putExtra("isMulti", z), 108);
                }
                break;
            default:
                bn40.c((Throwable) obj, new Object[0]);
                if (z) {
                    cvk.u(R.string.common_network_error, false);
                }
                break;
        }
        return s3q0.a;
    }
}
