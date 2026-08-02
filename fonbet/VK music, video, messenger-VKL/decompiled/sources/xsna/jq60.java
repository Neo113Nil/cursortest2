package xsna;

import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.awg0;
import xsna.ds60;

/* compiled from: NewsfeedListExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class jq60 extends evg0<ur60, on50, ds60.a, ds60, qr60, yo60> {
    public final ysg0<Object> f;
    public final Lazy g;
    public final Lazy h;
    public io.reactivex.rxjava3.disposables.c i;
    public final qg50 j;
    public final Object k;
    public final uc60 l;

    /* compiled from: NewsfeedListExternalEventsTaskExecutor.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            jq60 jq60Var = (jq60) this.receiver;
            jq60Var.getClass();
            jq60Var.a(new ds60.g.a(userId));
            return s3q0.a;
        }
    }

    public jq60(ysg0 ysg0Var, Lazy lazy, h7m h7mVar, Lazy lazy2, jm50 jm50Var, eht ehtVar) {
        super(jm50Var, ehtVar);
        this.f = ysg0Var;
        this.g = lazy2;
        this.h = lazy;
        int[] iArr = {100, 101, 102, 103, 104, 105, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 109, 110, 111, 112, 113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 123, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 125, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 128, 129, 130, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 134, 135, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 138, 139, VersionConstants.PRODUCT_MAJOR_VERSION, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152};
        int[] iArr2 = p9x.a;
        qg50 qg50Var = new qg50(49);
        for (int i = 0; i < 49; i++) {
            qg50Var.g(iArr[i]);
        }
        this.j = qg50Var;
        this.k = msy.a(LazyThreadSafetyMode.NONE, new nef(this, 26));
        this.l = new uc60(new ie8(1, this, jq60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0, 8), h7mVar);
    }

    @Override // xsna.mn50
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final yvg0 d(ds60.a aVar) {
        if (!(aVar instanceof ds60.a.C2747a)) {
            if (!(aVar instanceof ds60.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.subjects.f(), new ux00(new c2u(this, 25), 6), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new l46(this, 7)), new iq60(0), null, null, 6);
        }
        io.reactivex.rxjava3.subjects.f<Object> fVar = this.f.a;
        uf3 uf3Var = new uf3(20);
        fVar.getClass();
        return awg0.a.b(this, new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, uf3Var).a0(asu0.a.d()), new le50(com.vk.metrics.eventtracking.b.a, 25), null, new n3t(this, 13), 2);
    }
}
