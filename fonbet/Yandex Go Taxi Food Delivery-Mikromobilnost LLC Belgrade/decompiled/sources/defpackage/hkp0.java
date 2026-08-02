package defpackage;

import androidx.compose.foundation.gestures.x;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.focus.d;

/* loaded from: classes10.dex */
public final /* synthetic */ class hkp0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ hkp0(x xVar, int i) {
        this.a = i;
        this.b = xVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        x xVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(xVar.isAttached());
            default:
                lvr lvrVar = xVar.U;
                if (!lvrVar.getNode().isAttached()) {
                    return null;
                }
                FocusStateImpl J0 = ((d) lvrVar).J0();
                if (!J0.a()) {
                    return null;
                }
                if (J0.b()) {
                    return ((d) lvrVar).H0(null);
                }
                d i2 = ((c) qje.Q(lvrVar).getFocusOwner()).i();
                if (i2 != null) {
                    return i2.H0(qje.O(lvrVar));
                }
                return null;
        }
    }
}
