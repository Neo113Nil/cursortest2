package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.internal.data.FragmentNavigationControllerState;
import com.vk.core.serialize.Serializer;
import com.vk.core.util.RecreateActivity;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;

/* compiled from: FragmentNavigationStateCache.kt */
/* loaded from: classes.dex */
public final class lcs {
    public static FragmentNavigationControllerState a(Bundle bundle) {
        FragmentNavigationControllerState fragmentNavigationControllerState;
        try {
            fragmentNavigationControllerState = (FragmentNavigationControllerState) com.vk.core.util.state.a.b(FragmentNavigationControllerState.class, bundle, "_fragment_navigation_controller_key_state");
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(new Serializer.DeserializationError("Error while unboxing app state", e));
            com.vk.core.util.state.a.b.d("_fragment_navigation_controller_key_state");
            fragmentNavigationControllerState = null;
        }
        if (fragmentNavigationControllerState == null || fragmentNavigationControllerState.e == BuildInfo.e) {
            if (fragmentNavigationControllerState != null) {
                return fragmentNavigationControllerState;
            }
            L.G("[RECREATE] Recreate app");
            int i = RecreateActivity.b;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            RecreateActivity.a.b(0L, context);
            return null;
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("UPGRADE.RECREATE.START");
        aVar.i("FirebaseTracker");
        bVar.k(aVar.e());
        L.p("[RECREATE] State version on changed");
        L.p("[RECREATE] Clear persistence cache");
        com.vk.core.util.state.a.b.d("_fragment_navigation_controller_key_state");
        L.G("[RECREATE] Clear memory cache");
        L.G("[RECREATE] Finish app");
        bVar.a(new IllegalStateException("Version is changed but app is still alive!"));
        int i2 = RecreateActivity.b;
        c63 c63Var = c63.a;
        RecreateActivity.a.a(0L, new x1e0(c63.b(), 4));
        return null;
    }
}
