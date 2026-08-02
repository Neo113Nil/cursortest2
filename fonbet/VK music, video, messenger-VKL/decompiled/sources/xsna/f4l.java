package xsna;

import android.util.Pair;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class f4l implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = DebugDevSettingsFragment.t0;
                return (String) ((Pair) obj).first;
            case 1:
                return ((pt50) obj).b();
            default:
                Optional optional = (Optional) obj;
                return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
        }
    }
}
