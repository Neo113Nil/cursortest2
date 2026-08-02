package xsna;

import android.util.Pair;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j4l implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        return ((NetworkClient.ClientType) ((Pair) obj).second).name();
    }
}
