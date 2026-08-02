package defpackage;

import com.yandex.go.taxi.summary.ui.a;
import java.util.function.Supplier;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;

/* loaded from: classes6.dex */
public final /* synthetic */ class i7t0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ SolidSummaryView b;

    public /* synthetic */ i7t0(SolidSummaryView solidSummaryView, int i) {
        this.a = i;
        this.b = solidSummaryView;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Integer _init_$lambda$4;
        a aVar;
        int i = this.a;
        SolidSummaryView solidSummaryView = this.b;
        switch (i) {
            case 0:
                _init_$lambda$4 = SolidSummaryView._init_$lambda$4(solidSummaryView);
                return _init_$lambda$4;
            default:
                aVar = solidSummaryView.summaryAddressControlCoordinator;
                return Integer.valueOf(aVar.b.getPaddingBottom());
        }
    }
}
