package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;

/* loaded from: classes3.dex */
public final class kij extends RecyclerView.g {
    public final /* synthetic */ DiffRateCalendarView a;

    public kij(DiffRateCalendarView diffRateCalendarView) {
        this.a = diffRateCalendarView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        tls onMinVisibleDateChanged;
        String minVisibleDayShortServerIsoOrEmpty;
        DiffRateCalendarView diffRateCalendarView = this.a;
        tls onRecyclerScrollStateChanged = diffRateCalendarView.getOnRecyclerScrollStateChanged();
        if (onRecyclerScrollStateChanged != null) {
            onRecyclerScrollStateChanged.invoke(Integer.valueOf(i));
        }
        if (i != 0 || (onMinVisibleDateChanged = diffRateCalendarView.getOnMinVisibleDateChanged()) == null) {
            return;
        }
        minVisibleDayShortServerIsoOrEmpty = diffRateCalendarView.minVisibleDayShortServerIsoOrEmpty();
        onMinVisibleDateChanged.invoke(minVisibleDayShortServerIsoOrEmpty);
    }
}
