package xsna;

import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.VideoUrl;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class x3l implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String[] strArr = DebugDevSettingsFragment.t0;
                return !((List) obj2).contains((VideoUrl) obj);
            default:
                return ((Boolean) ((u6k) obj2).invoke(obj)).booleanValue();
        }
    }
}
