package xsna;

import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.Comparator;
import kotlin.Pair;

/* compiled from: Comparisons.kt */
/* loaded from: classes17.dex */
public final class v12 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ v12(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(((gek0) obj).c(), ((gek0) obj2).c());
            case 1:
                return jw5.b(Boolean.valueOf(((CallSettingsItem.CallParticipant) obj2).e), Boolean.valueOf(((CallSettingsItem.CallParticipant) obj).e));
            default:
                return jw5.b((Integer) ((Pair) obj).j(), (Integer) ((Pair) obj2).j());
        }
    }
}
