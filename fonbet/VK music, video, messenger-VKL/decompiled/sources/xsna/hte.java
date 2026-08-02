package xsna;

import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;
import xsna.gte;

/* compiled from: ClipsPlaylistsFolderNamingStateMapper.kt */
/* loaded from: classes16.dex */
public final class hte {
    public static SpinnerState a(gte.a.InterfaceC2955a interfaceC2955a) {
        if (epx.f(interfaceC2955a, gte.a.InterfaceC2955a.d.a)) {
            return null;
        }
        if (epx.f(interfaceC2955a, gte.a.InterfaceC2955a.c.a)) {
            return SpinnerState.Loading;
        }
        if (epx.f(interfaceC2955a, gte.a.InterfaceC2955a.b.a)) {
            return SpinnerState.Error;
        }
        if (interfaceC2955a instanceof gte.a.InterfaceC2955a.C2956a) {
            return SpinnerState.Done;
        }
        throw new NoWhenBranchMatchedException();
    }
}
