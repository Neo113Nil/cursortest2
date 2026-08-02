package defpackage;

import android.view.ViewGroup;
import com.yandex.go.due_timetable.experiment.IntercityTimetableConfigExperiment;
import java.util.Iterator;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.widget.due_timetable.adapter.DueTimetableAvailableSlotView;

/* loaded from: classes6.dex */
public final class mym extends xwy0 {
    public static final /* synthetic */ int T = 0;
    public final DueTimetableAvailableSlotView O;
    public final int P;
    public final vhw0 Q;
    public final mzm R;
    public jzm S;

    public mym(DueTimetableAvailableSlotView dueTimetableAvailableSlotView, int i, j2n j2nVar, v8e v8eVar) {
        super(dueTimetableAvailableSlotView);
        this.O = dueTimetableAvailableSlotView;
        this.P = i;
        this.Q = j2nVar;
        this.R = v8eVar;
        dueTimetableAvailableSlotView.setOnClickListener(new cmi(11, this));
    }

    public final void W(jzm jzmVar, boolean z, Object obj) {
        sym symVar;
        IntercityTimetableConfigExperiment.TimeslotConfigurationRule timeslotConfigurationRule;
        Object obj2;
        long j = jzmVar.e;
        this.S = jzmVar;
        v1n v1nVar = (v1n) this.Q.get();
        prs0 prs0Var = null;
        int i = this.P;
        if (v1nVar != null && (timeslotConfigurationRule = (symVar = (sym) v1nVar).b) != null && !e3n.d(j, 0L)) {
            long o = e3n.o(j, DurationUnit.MINUTES);
            Iterator it = timeslotConfigurationRule.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                d6w d6wVar = (d6w) ((IntercityTimetableConfigExperiment.TimeslotConfiguration) obj2).e.getValue();
                if (d6wVar != null) {
                    Integer valueOf = (-2147483648L > o || o >= 2147483648L) ? null : Integer.valueOf((int) o);
                    if (valueOf != null ? d6wVar.b(valueOf) : false) {
                        break;
                    }
                }
            }
            IntercityTimetableConfigExperiment.TimeslotConfiguration timeslotConfiguration = (IntercityTimetableConfigExperiment.TimeslotConfiguration) obj2;
            if ((timeslotConfiguration != null ? timeslotConfiguration.c : null) != null) {
                i = tje.u(timeslotConfiguration.c.intValue(), symVar.a);
            } else {
                if ((timeslotConfiguration != null ? timeslotConfiguration.d : null) != null) {
                    i = (int) (timeslotConfiguration.d.floatValue() * i);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i, -1);
        DueTimetableAvailableSlotView dueTimetableAvailableSlotView = this.O;
        dueTimetableAvailableSlotView.setLayoutParams(layoutParams);
        if (obj instanceof yhj) {
            Object obj3 = ((yhj) obj).a;
            if (obj3 instanceof jzm) {
                prs0Var = ((jzm) obj3).c;
            }
        }
        dueTimetableAvailableSlotView.setBarState(prs0Var, jzmVar.c);
        dueTimetableAvailableSlotView.setBarLabel(jzmVar.b);
        dueTimetableAvailableSlotView.setBarSelected(z, jl40.l(obj, "animate_selection"));
        dueTimetableAvailableSlotView.setContentDescription(jzmVar.g);
    }
}
