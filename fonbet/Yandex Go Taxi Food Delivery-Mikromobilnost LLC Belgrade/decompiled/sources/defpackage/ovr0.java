package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersLayoutIdentifiers;

/* loaded from: classes12.dex */
public final class ovr0 {
    public static void a(int i, FragmentManager fragmentManager, pvr0 pvr0Var, Boolean bool) {
        if (fragmentManager.F("shimmers_fragment_tag") != null) {
            return;
        }
        ShimmersLayoutIdentifiers b = pvr0Var.b();
        ShimmersFragment shimmersFragment = new ShimmersFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shimmers_fragment_layout_ids", b);
        if (bool != null) {
            bundle.putBoolean("shimmers_fragment_forced_night_mode", bool.booleanValue());
        }
        shimmersFragment.setArguments(bundle);
        a aVar = new a(fragmentManager);
        aVar.i(emg0.finsdk_fade_in, emg0.finsdk_fade_out, 0, 0);
        aVar.h(i, shimmersFragment, "shimmers_fragment_tag");
        aVar.d();
    }
}
