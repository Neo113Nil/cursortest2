package xsna;

import android.util.Pair;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class qb9 implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((jkh0) obj).c.stream();
            default:
                String[] strArr = DebugDevSettingsFragment.t0;
                return (String) ((Pair) obj).first;
        }
    }
}
