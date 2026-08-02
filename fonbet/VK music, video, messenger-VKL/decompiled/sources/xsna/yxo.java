package xsna;

import com.huawei.hms.health.aacm;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.HealthRecordReadOptions;
import com.huawei.hms.hihealth.result.HealthRecordResult;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.bridges.LogoutReason;
import java.util.concurrent.Callable;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.commons.util.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yxo implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yxo(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Optional lambda$executeOptional$1;
        HealthRecordResult aab;
        switch (this.b) {
            case 0:
                UserId userId = (UserId) this.c;
                UserId userId2 = (UserId) this.d;
                wdx0 wdx0Var = e370.f;
                if (wdx0Var == null) {
                    wdx0Var = null;
                }
                wdx0Var.a(LogoutReason.MULTIACCOUNT_LOGOUT, userId, !fkq0.c(userId2));
                return s3q0.a;
            case 1:
                lambda$executeOptional$1 = ((RxApiClient) this.c).lambda$executeOptional$1((ApiExecutableRequest) this.d);
                return lambda$executeOptional$1;
            default:
                aab = aacm.aab((HealthKitApiInvoker) this.c, (HealthRecordReadOptions) this.d);
                return aab;
        }
    }
}
