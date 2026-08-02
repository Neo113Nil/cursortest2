package defpackage;

import ru.yandex.taxi.order.state.checkin.CheckInStateView;

/* loaded from: classes14.dex */
public final /* synthetic */ class agb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CheckInStateView b;

    public /* synthetic */ agb(CheckInStateView checkInStateView, int i) {
        this.a = i;
        this.b = checkInStateView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CheckInStateView checkInStateView = this.b;
        switch (i) {
            case 0:
                CheckInStateView.applyCheckInActionButtons$lambda$1(checkInStateView);
                break;
            default:
                CheckInStateView.applyCheckInInstruction$lambda$0(checkInStateView);
                break;
        }
    }
}
