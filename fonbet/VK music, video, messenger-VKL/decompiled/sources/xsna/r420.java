package xsna;

import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class r420 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return jw5.b(Integer.valueOf(((vg6) obj).a), Integer.valueOf(((vg6) obj2).a));
            case 1:
                return jw5.b(Integer.valueOf(((ic50) obj).e), Integer.valueOf(((ic50) obj2).e));
            default:
                return jw5.b(Integer.valueOf(((VoipScheduleCallTimeZone) obj).e), Integer.valueOf(((VoipScheduleCallTimeZone) obj2).e));
        }
    }
}
