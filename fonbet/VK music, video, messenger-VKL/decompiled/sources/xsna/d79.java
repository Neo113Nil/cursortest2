package xsna;

import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class d79<T> implements Comparator {
    public final /* synthetic */ e79 b;

    public d79(e79 e79Var) {
        this.b = e79Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        return compare != 0 ? compare : jw5.b(Long.valueOf(((CallSettingsItem.CallParticipant) t).h), Long.valueOf(((CallSettingsItem.CallParticipant) t2).h));
    }
}
