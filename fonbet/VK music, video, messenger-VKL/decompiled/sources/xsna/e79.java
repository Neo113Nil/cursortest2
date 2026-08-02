package xsna;

import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes7.dex */
public final class e79<T> implements Comparator {
    public final /* synthetic */ v12 b;

    public e79(v12 v12Var) {
        this.b = v12Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        return compare != 0 ? compare : jw5.b(Boolean.valueOf(((CallSettingsItem.CallParticipant) t2).g), Boolean.valueOf(((CallSettingsItem.CallParticipant) t).g));
    }
}
