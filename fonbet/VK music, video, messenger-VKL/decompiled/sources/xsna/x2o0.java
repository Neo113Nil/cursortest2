package xsna;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.tapandpay.zzaf;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenStatus;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public interface x2o0 {
    public static final a.g<com.google.android.gms.internal.tapandpay.zzh> a;
    public static final com.google.android.gms.common.api.a<a.d.InterfaceC0113d> b;

    /* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
    public interface a {
        void onDataChanged();
    }

    /* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
    public interface b extends qdg0 {
        String getActiveWalletId();
    }

    /* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
    public interface c extends qdg0 {
        String getStableHardwareId();
    }

    /* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
    public interface d extends qdg0 {
        TokenStatus getTokenStatus();
    }

    /* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
    public static abstract class e<R extends qdg0> extends com.google.android.gms.common.api.internal.a<R, com.google.android.gms.internal.tapandpay.zzh> {
        public e(com.google.android.gms.common.api.c cVar) {
            super(x2o0.a, cVar);
        }
    }

    static {
        new com.google.android.gms.internal.tapandpay.zzm();
        new zzaf();
        a.g<com.google.android.gms.internal.tapandpay.zzh> gVar = new a.g<>();
        a = gVar;
        b = new com.google.android.gms.common.api.a<>("TapAndPay.TAP_AND_PAY_API", new n101(), gVar);
    }

    @Deprecated
    cv90<b> getActiveWalletId(com.google.android.gms.common.api.c cVar);

    @Deprecated
    cv90<c> getStableHardwareId(com.google.android.gms.common.api.c cVar);

    @Deprecated
    cv90<d> getTokenStatus(com.google.android.gms.common.api.c cVar, int i, String str);

    @Deprecated
    void pushTokenize(com.google.android.gms.common.api.c cVar, Activity activity, PushTokenizeRequest pushTokenizeRequest, int i);

    /* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
    public static abstract class f extends e<Status> {
        public f(com.google.android.gms.common.api.c cVar) {
            super(cVar);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public /* synthetic */ qdg0 createFailedResult(Status status) {
            return status;
        }
    }
}
