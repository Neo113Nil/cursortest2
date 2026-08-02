package defpackage;

import com.yandex.go.payments.paymentlist.data.EditModeState;

/* loaded from: classes8.dex */
public final class pmn {
    public final qmn a;

    public pmn(qmn qmnVar) {
        this.a = qmnVar;
    }

    public final boolean a() {
        return ((EditModeState) this.a.a.getValue()) == EditModeState.ENABLED;
    }
}
