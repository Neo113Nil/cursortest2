package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes11.dex */
public final class l710 extends wzs0 {
    public final /* synthetic */ int b0;
    public final /* synthetic */ MaterialCalendar c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l710(MaterialCalendar materialCalendar, Context context, int i, int i2) {
        super(context, i, false);
        this.c0 = materialCalendar;
        this.b0 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z1(RecyclerView.k kVar, int[] iArr) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        int i = this.b0;
        MaterialCalendar materialCalendar = this.c0;
        if (i == 0) {
            recyclerView3 = materialCalendar.recyclerView;
            iArr[0] = recyclerView3.getWidth();
            recyclerView4 = materialCalendar.recyclerView;
            iArr[1] = recyclerView4.getWidth();
            return;
        }
        recyclerView = materialCalendar.recyclerView;
        iArr[0] = recyclerView.getHeight();
        recyclerView2 = materialCalendar.recyclerView;
        iArr[1] = recyclerView2.getHeight();
    }
}
