package xsna;

import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class h79<T> implements Comparator {
    public final /* synthetic */ g79 b;

    public h79(g79 g79Var) {
        this.b = g79Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        return compare != 0 ? compare : jw5.b(Boolean.valueOf(((CallSettingsItem.CallParticipant) t2).c instanceof CallSettingsItem.CallParticipant.b.a), Boolean.valueOf(((CallSettingsItem.CallParticipant) t).c instanceof CallSettingsItem.CallParticipant.b.a));
    }
}
