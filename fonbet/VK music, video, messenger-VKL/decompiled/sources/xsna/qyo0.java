package xsna;

import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TimezonePickerViewModel.kt */
/* loaded from: classes7.dex */
public final class qyo0 {
    public final VoipScheduleCallTimeZone a;
    public final List<VoipScheduleCallTimeZone> b;
    public final io.reactivex.rxjava3.subjects.f<uxp> c = new io.reactivex.rxjava3.subjects.f<>();

    public qyo0(VoipScheduleCallTimeZone voipScheduleCallTimeZone, List<VoipScheduleCallTimeZone> list) {
        this.a = voipScheduleCallTimeZone;
        this.b = list;
    }

    public final wvo0 a(List<VoipScheduleCallTimeZone> list) {
        VoipScheduleCallTimeZone voipScheduleCallTimeZone;
        List<VoipScheduleCallTimeZone> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            voipScheduleCallTimeZone = this.a;
            if (!hasNext) {
                break;
            }
            VoipScheduleCallTimeZone voipScheduleCallTimeZone2 = (VoipScheduleCallTimeZone) it.next();
            arrayList.add(new vvo0(voipScheduleCallTimeZone2.b, voipScheduleCallTimeZone2.c, voipScheduleCallTimeZone2.d, epx.f(voipScheduleCallTimeZone, voipScheduleCallTimeZone2)));
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (((vvo0) it2.next()).b.equals(voipScheduleCallTimeZone.b)) {
                break;
            }
            i++;
        }
        return new wvo0(arrayList, i);
    }
}
