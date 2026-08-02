package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class jij extends GridLayoutManager.b {
    public final /* synthetic */ DiffRateCalendarView d;

    public jij(DiffRateCalendarView diffRateCalendarView) {
        this.d = diffRateCalendarView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        qa3 qa3Var;
        qa3Var = this.d.calendarAdapter;
        return ((kf7) a.S(i, qa3Var.b.f)) instanceof jf7 ? 7 : 1;
    }
}
