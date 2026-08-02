package xsna;

import android.util.Pair;
import com.vk.api.internal.debug.FakeApiErrorTypes;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class e4l implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String[] strArr = DebugDevSettingsFragment.t0;
        return ((FakeApiErrorTypes) ((Pair) obj).second).name();
    }
}
