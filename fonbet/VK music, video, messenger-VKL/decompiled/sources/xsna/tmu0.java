package xsna;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tmu0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ tmu0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new com.vk.auth.validation.a((FragmentActivity) obj);
            default:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                boolean t = BuildInfo.t();
                return new u0v0(componentActivity, t ? R.drawable.ic_launcher_me : R.drawable.ic_launcher, t ? R.string.update_vkme_downloaded : R.string.update_downloaded);
        }
    }
}
