package xsna;

import com.vk.core.preference.Preference;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.chromium.base.TimeUtils;

/* compiled from: CallArgumentsApiBridgeTracker.kt */
/* loaded from: classes6.dex */
public final class j19 {
    public final long a = System.currentTimeMillis();
    public Set<String> b = a();
    public boolean c;

    public final Set<String> a() {
        Preference preference = Preference.a;
        Set<String> u = Preference.u(EmptySet.b, "vk_bridge", "vk_app_bridge_call_argument_storage");
        if (this.a - Preference.m(0L, "vk_bridge", "vk_app_bridge_call_argument_last_date") > TimeUtils.SECONDS_PER_DAY) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            vdx0Var.d().U().subscribe(new f40(new e1(this, 14), 4));
        }
        return u;
    }
}
