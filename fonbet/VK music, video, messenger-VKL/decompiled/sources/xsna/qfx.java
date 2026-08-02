package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qfx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qfx(long j, Object obj, int i) {
        this.b = i;
        this.c = j;
        this.d = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                long j = ((UserId) obj).b;
                long j2 = this.c;
                if (j2 <= j && j <= Long.MAX_VALUE) {
                    return String.valueOf(j);
                }
                StringBuilder d = rqi.d(j2, "Param ", str, " not in ");
                d.append("..9223372036854775807");
                throw new IllegalArgumentException(d.toString());
            default:
                oio.P((oio) obj, this.c, 0L, 0L, swe0.f(((Number) ((mtk0) this.d).getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                return s3q0.a;
        }
    }
}
