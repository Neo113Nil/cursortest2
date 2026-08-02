package defpackage;

import ru.yandex.taxi.widget.due_timetable.adapter.DueTimetableUnavailableSlotView;

/* loaded from: classes6.dex */
public final class nym extends xwy0 {
    public final DueTimetableUnavailableSlotView O;
    public final int P;
    public final mzm Q;
    public kzm R;

    public nym(DueTimetableUnavailableSlotView dueTimetableUnavailableSlotView, int i, v8e v8eVar) {
        super(dueTimetableUnavailableSlotView);
        this.O = dueTimetableUnavailableSlotView;
        this.P = i;
        this.Q = v8eVar;
        dueTimetableUnavailableSlotView.setOnClickListener(new cmi(12, this));
    }
}
