package defpackage;

import com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView;
import java.util.function.Consumer;

/* loaded from: classes14.dex */
public final class o1y0 implements Consumer {
    public boolean a;
    public final /* synthetic */ TaxiOrderFlexView b;

    public o1y0(TaxiOrderFlexView taxiOrderFlexView) {
        this.b = taxiOrderFlexView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r4 = r3.previousScreen;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r4 == null) goto L19;
     */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        sei0 sei0Var;
        String str;
        String str2;
        sei0 sei0Var2;
        String str3;
        String str4 = (String) obj;
        boolean z = this.a;
        TaxiOrderFlexView taxiOrderFlexView = this.b;
        if (z && cvu0.x(str4, "feed_taxi_", false)) {
            taxiOrderFlexView.onResume();
        } else {
            taxiOrderFlexView.onPause();
            this.a = true;
        }
        if (cvu0.x(str4, "feed_taxi_", false)) {
            str = taxiOrderFlexView.previousScreen;
            if (str4.equals(str) || str3 == null || cvu0.x(str3, "feed_taxi_", false)) {
                str2 = taxiOrderFlexView.previousScreen;
            }
            sei0Var2 = taxiOrderFlexView.realtimeEventsReporter;
            ((pei0) ((tei0) sei0Var2).a).b.clear();
            taxiOrderFlexView.previousScreen = str4;
        }
        if (!cvu0.x(str4, "feed_taxi_", false)) {
            sei0Var = taxiOrderFlexView.realtimeEventsReporter;
            ((pei0) ((tei0) sei0Var).a).b.clear();
        }
        taxiOrderFlexView.previousScreen = str4;
    }
}
