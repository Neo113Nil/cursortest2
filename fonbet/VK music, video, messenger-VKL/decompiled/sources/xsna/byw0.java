package xsna;

import com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item;
import java.util.List;

/* compiled from: VoipScheduledCallSettingsContentViewState.kt */
/* loaded from: classes7.dex */
public final class byw0 {
    public final List<VoipScheduledCallSettingsContentViewState$ScreenState$Item> a;

    /* JADX WARN: Multi-variable type inference failed */
    public byw0(List<? extends VoipScheduledCallSettingsContentViewState$ScreenState$Item> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byw0) && epx.f(this.a, ((byw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("VoipScheduledCallSettingsContentViewState(items="), this.a);
    }
}
