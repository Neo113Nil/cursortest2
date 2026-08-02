package defpackage;

import com.google.android.gms.common.api.Status;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes11.dex */
public final class ko2 {
    public final Object a;
    public final Status b;

    public ko2(Object obj, Status status) {
        this.a = obj;
        this.b = status;
    }

    public final String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(this.b, ACSPConstants.STATUS);
        kjzVar.b(this.a, TarifficatorScenarioActivity.RESULT_KEY);
        return kjzVar.toString();
    }
}
