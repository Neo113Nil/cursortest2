package defpackage;

import android.view.View;
import com.yandex.go.superapp.orders.card.header.trails.OrderCardTimerView;
import ru.yandex.taxi.widget.TimerTextView;

/* loaded from: classes14.dex */
public final class gn70 implements zo31 {
    public final OrderCardTimerView a;
    public final TimerTextView b;

    public gn70(OrderCardTimerView orderCardTimerView, TimerTextView timerTextView) {
        this.a = orderCardTimerView;
        this.b = timerTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
