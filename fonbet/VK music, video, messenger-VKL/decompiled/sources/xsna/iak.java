package xsna;

import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: CreateRoomsTimeLimitPresetsViewHolder.kt */
/* loaded from: classes7.dex */
public final class iak {
    public final RecyclerView a;
    public final eak b;
    public int c;

    public iak(RecyclerView recyclerView, lwh lwhVar) {
        this.a = recyclerView;
        eak eakVar = new eak();
        eakVar.x0(fak.class, new frg(lwhVar, 4));
        this.b = eakVar;
        eakVar.setItems(a());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        int b = cn70.b(4);
        recyclerView.addItemDecoration(new un00(0, new Rect(0, b, b * 2, b)));
        recyclerView.setAdapter(eakVar);
    }

    public final ArrayList a() {
        Integer[] numArr = {5, 10, 20, 30, 60};
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            int intValue = numArr[i].intValue();
            arrayList.add(new fak(intValue, intValue == this.c));
        }
        return arrayList;
    }
}
