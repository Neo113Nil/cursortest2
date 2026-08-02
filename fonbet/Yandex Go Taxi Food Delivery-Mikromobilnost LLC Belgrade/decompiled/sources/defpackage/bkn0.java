package defpackage;

import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogAnalyticsState;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$BackDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$RetryDialogButtonListenerType;

/* loaded from: classes13.dex */
public final class bkn0 extends jkn0 {
    public final m2v j;
    public final m2v k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bkn0(ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState, ikn0 ikn0Var, hkn0 hkn0Var, ikn0 ikn0Var2, ekn0 ekn0Var, ckn0 ckn0Var, String str, m2v m2vVar, m2v m2vVar2, int i) {
        super(scootersErrorDialogAnalyticsState, ikn0Var, r5, ikn0Var2, null, ekn0Var, r9, r10, false);
        ikn0 gkn0Var = (i & 4) != 0 ? new gkn0("") : hkn0Var;
        ckn0 ckn0Var2 = (i & 64) != 0 ? null : ckn0Var;
        String str2 = (i & 128) != 0 ? null : str;
        m2v m2vVar3 = (i & 512) != 0 ? new m2v(null, null, null, ScootersErrorDialogPresentation$BackDialogButtonListenerType.DEFAULT) : m2vVar;
        m2v m2vVar4 = (i & 1024) != 0 ? new m2v(null, null, null, ScootersErrorDialogPresentation$RetryDialogButtonListenerType.DEFAULT) : m2vVar2;
        this.j = m2vVar3;
        this.k = m2vVar4;
    }
}
