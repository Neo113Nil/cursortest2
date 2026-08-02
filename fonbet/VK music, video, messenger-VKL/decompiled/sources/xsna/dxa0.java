package xsna;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class dxa0 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ jai b;
    public final /* synthetic */ wow c;

    public dxa0(jai jaiVar, wow wowVar) {
        this.b = jaiVar;
        this.c = wowVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            this.b.invoke(ksyVar2, Integer.valueOf(intValue), this.c.b.get(intValue), aVar2, Integer.valueOf(i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
