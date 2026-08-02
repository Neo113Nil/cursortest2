package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.due_timetable.adapter.DueTimetableAvailableSlotView;
import ru.yandex.taxi.widget.due_timetable.adapter.DueTimetableUnavailableSlotView;

/* loaded from: classes6.dex */
public final class oym extends dvy0 {
    public List A = EmptyList.a;
    public int B = -1;
    public int C = -1;
    public final t1n c;
    public final j2n w;
    public final int x;
    public final int y;
    public final v8e z;

    public oym(t1n t1nVar, j2n j2nVar, int i, int i2, v8e v8eVar) {
        this.c = t1nVar;
        this.w = j2nVar;
        this.x = i;
        this.y = i2;
        this.z = v8eVar;
        setHasStableIds(true);
    }

    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g */
    public final void onBindViewHolder(xwy0 xwy0Var, int i) {
        int i2;
        super.onBindViewHolder(xwy0Var, i);
        lzm lzmVar = (lzm) this.A.get(i);
        boolean z = i == this.B;
        if (xwy0Var instanceof mym) {
            int i3 = mym.T;
            ((mym) xwy0Var).W((jzm) lzmVar, z, null);
            return;
        }
        if (xwy0Var instanceof nym) {
            nym nymVar = (nym) xwy0Var;
            kzm kzmVar = (kzm) lzmVar;
            nymVar.R = kzmVar;
            DueTimetableUnavailableSlotView dueTimetableUnavailableSlotView = nymVar.O;
            boolean z2 = kzmVar.d;
            String str = kzmVar.c;
            if (z2) {
                i2 = (tje.r(usg0.due_timetable_unavailable_slot_side_padding, dueTimetableUnavailableSlotView.getContext()) * 2) + new yzh(dueTimetableUnavailableSlotView.getContext()).o(str);
            } else {
                i2 = nymVar.P;
            }
            dueTimetableUnavailableSlotView.setLayoutParams(new ViewGroup.LayoutParams(i2, -1));
            dueTimetableUnavailableSlotView.setTopText(str);
            dueTimetableUnavailableSlotView.setBarLabel(kzmVar.b);
            dueTimetableUnavailableSlotView.setBarSelected(z);
            dueTimetableUnavailableSlotView.setContentDescription(kzmVar.g);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.A.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        lzm lzmVar = (lzm) this.A.get(i);
        if (!(lzmVar instanceof jzm)) {
            if (lzmVar instanceof kzm) {
                return 2;
            }
            w511.b();
            return 0;
        }
        jzm jzmVar = (jzm) lzmVar;
        if (!jzmVar.f) {
            return 0;
        }
        if (this.C != -1) {
            return 1;
        }
        this.C = this.c.e(jzmVar.b);
        return 1;
    }

    public final void j(int i, boolean z) {
        int i2 = this.B;
        if (i2 != i) {
            this.B = i;
            if (z) {
                notifyItemChanged(i2, "animate_selection");
                notifyItemChanged(i, "animate_selection");
            } else {
                notifyItemChanged(i2);
                notifyItemChanged(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        xwy0 xwy0Var = (xwy0) x0Var;
        if (list.isEmpty()) {
            super.onBindViewHolder(xwy0Var, i, list);
            return;
        }
        for (Object obj : list) {
            if (xwy0Var instanceof mym) {
                ((mym) xwy0Var).W((jzm) ((lzm) this.A.get(i)), i == this.B, obj);
            } else {
                super.onBindViewHolder(xwy0Var, i, list);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        j2n j2nVar = this.w;
        v8e v8eVar = this.z;
        if (i == 0) {
            DueTimetableAvailableSlotView dueTimetableAvailableSlotView = new DueTimetableAvailableSlotView(context, null, 0, 6, null);
            int i2 = this.x;
            dueTimetableAvailableSlotView.setLayoutParams(new ViewGroup.LayoutParams(i2, -1));
            dueTimetableAvailableSlotView.setPaddingRelative(tje.r(usg0.due_timetable_available_slot_side_padding, dueTimetableAvailableSlotView.getContext()), dueTimetableAvailableSlotView.getPaddingTop(), tje.r(usg0.due_timetable_available_slot_side_padding, dueTimetableAvailableSlotView.getContext()), dueTimetableAvailableSlotView.getPaddingBottom());
            return new mym(dueTimetableAvailableSlotView, i2, j2nVar, v8eVar);
        }
        if (i == 1) {
            DueTimetableAvailableSlotView dueTimetableAvailableSlotView2 = new DueTimetableAvailableSlotView(context, null, 0, 6, null);
            dueTimetableAvailableSlotView2.setLayoutParams(new ViewGroup.LayoutParams(this.C, -1));
            dueTimetableAvailableSlotView2.setPaddingRelative(tje.r(usg0.due_timetable_available_slot_side_padding, dueTimetableAvailableSlotView2.getContext()), dueTimetableAvailableSlotView2.getPaddingTop(), tje.r(usg0.due_timetable_available_slot_side_padding, dueTimetableAvailableSlotView2.getContext()), dueTimetableAvailableSlotView2.getPaddingBottom());
            return new mym(dueTimetableAvailableSlotView2, this.C, j2nVar, v8eVar);
        }
        if (i != 2) {
            ny61.g(oyr.j(i, "View type ", " is not supported"));
            return null;
        }
        DueTimetableUnavailableSlotView dueTimetableUnavailableSlotView = new DueTimetableUnavailableSlotView(context, null, 0, 6, null);
        int i3 = this.y;
        dueTimetableUnavailableSlotView.setLayoutParams(new ViewGroup.LayoutParams(i3, -1));
        dueTimetableUnavailableSlotView.setPaddingRelative(tje.r(usg0.due_timetable_unavailable_slot_side_padding, dueTimetableUnavailableSlotView.getContext()), dueTimetableUnavailableSlotView.getPaddingTop(), tje.r(usg0.due_timetable_unavailable_slot_side_padding, dueTimetableUnavailableSlotView.getContext()), dueTimetableUnavailableSlotView.getPaddingBottom());
        return new nym(dueTimetableUnavailableSlotView, i3, v8eVar);
    }
}
