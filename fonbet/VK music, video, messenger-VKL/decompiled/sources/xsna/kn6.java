package xsna;

import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.sharing.core.view.IntentAction;
import java.util.function.IntFunction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kn6 implements IntFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new IntentAction[i];
            default:
                String[] strArr = DebugDevSettingsFragment.t0;
                return new String[i];
        }
    }
}
