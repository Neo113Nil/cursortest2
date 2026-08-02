package xsna;

import android.util.Pair;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class n4l implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        return ((FakeNetworkConditions) ((Pair) obj).second).name();
    }
}
