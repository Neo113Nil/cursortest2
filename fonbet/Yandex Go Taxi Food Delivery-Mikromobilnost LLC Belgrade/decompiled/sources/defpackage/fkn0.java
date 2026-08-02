package defpackage;

import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogAnalyticsState;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$OkDialogButtonListenerType;

/* loaded from: classes13.dex */
public final class fkn0 extends jkn0 {
    public final m2v j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fkn0(ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState, ikn0 ikn0Var, ikn0 ikn0Var2, ikn0 ikn0Var3, String str, ekn0 ekn0Var, String str2, m2v m2vVar, int i) {
        super(scootersErrorDialogAnalyticsState, ikn0Var, r6, ikn0Var3, r8, r9, null, r11, r12);
        ikn0 gkn0Var = (i & 4) != 0 ? new gkn0("") : ikn0Var2;
        String str3 = (i & 16) != 0 ? null : str;
        ekn0 ekn0Var2 = (i & 32) != 0 ? null : ekn0Var;
        String str4 = (i & 128) != 0 ? null : str2;
        boolean z = (i & 256) == 0;
        m2v m2vVar2 = (i & 512) != 0 ? new m2v(null, null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT) : m2vVar;
        this.j = m2vVar2;
    }
}
