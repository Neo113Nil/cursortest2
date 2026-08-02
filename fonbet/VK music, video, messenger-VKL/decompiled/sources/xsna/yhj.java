package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes16.dex */
public final class yhj implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ zzf0 c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ izs f;
    public final /* synthetic */ vtu g;

    public yhj(List list, zzf0 zzf0Var, Integer num, boolean z, izs izsVar, vtu vtuVar) {
        this.b = list;
        this.c = zzf0Var;
        this.d = num;
        this.e = z;
        this.f = izsVar;
        this.g = vtuVar;
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
            Object obj = this.b.get(intValue);
            int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            aVar2.K(-41816869);
            izs izsVar = this.f;
            vtu vtuVar = this.g;
            Integer num3 = this.d;
            boolean z = this.e;
            zzf0 zzf0Var = this.c;
            vzf0.a(ksyVar2, zzf0Var, intValue, null, false, kai.c(-327825140, new vhj(intValue, num3, z, (zzc) obj, izsVar, zzf0Var, vtuVar), aVar2), aVar2, (i & 14) | 196608 | ((i2 << 3) & 896));
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
