package xsna;

import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class f79<T> implements Comparator {
    public final /* synthetic */ d79 b;

    public f79(d79 d79Var) {
        this.b = d79Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        CallSettingsItem.CallParticipant.a aVar = ((CallSettingsItem.CallParticipant) t2).f;
        CallSettingsItem.CallParticipant.a.c cVar = CallSettingsItem.CallParticipant.a.c.a;
        return jw5.b(Boolean.valueOf(!epx.f(aVar, cVar)), Boolean.valueOf(!epx.f(((CallSettingsItem.CallParticipant) t).f, cVar)));
    }
}
