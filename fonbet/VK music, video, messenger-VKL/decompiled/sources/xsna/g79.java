package xsna;

import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class g79<T> implements Comparator {
    public final /* synthetic */ f79 b;

    public g79(f79 f79Var) {
        this.b = f79Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        return compare != 0 ? compare : jw5.b(Boolean.valueOf(((CallSettingsItem.CallParticipant) t2).c instanceof CallSettingsItem.CallParticipant.b.C2087b), Boolean.valueOf(((CallSettingsItem.CallParticipant) t).c instanceof CallSettingsItem.CallParticipant.b.C2087b));
    }
}
