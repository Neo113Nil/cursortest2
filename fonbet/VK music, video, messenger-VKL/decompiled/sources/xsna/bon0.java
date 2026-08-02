package xsna;

import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import java.util.List;
import kotlin.Pair;

/* compiled from: SwitcherViewStateConfigurator.kt */
/* loaded from: classes6.dex */
public final class bon0 {
    public static final List<Pair<Class<? extends SwitcherUiMode>, Class<? extends SwitcherLaunchMode>>> c = e43.l(new Pair(SwitcherUiMode.Ecoplate.class, SwitcherLaunchMode.SwitcherCallbackMode.class), new Pair(SwitcherUiMode.EcoplateLK.class, SwitcherLaunchMode.SwitcherCallbackMode.class));
    public final SwitcherUiMode a;
    public final SwitcherLaunchMode b;

    public bon0(SwitcherUiMode switcherUiMode, SwitcherLaunchMode switcherLaunchMode) {
        this.a = switcherUiMode;
        this.b = switcherLaunchMode;
        if (c.contains(new Pair(switcherUiMode.getClass(), switcherLaunchMode.getClass()))) {
            throw new IllegalStateException("Incompatible UIMode " + qjg.a(switcherUiMode) + " and LaunchMode " + switcherLaunchMode);
        }
    }
}
