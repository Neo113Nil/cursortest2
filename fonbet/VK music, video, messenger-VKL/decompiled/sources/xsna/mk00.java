package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class mk00 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ yj00 d;

    public mk00(List list, izs izsVar, yj00 yj00Var) {
        this.b = list;
        this.c = izsVar;
        this.d = yj00Var;
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
            s90 s90Var = (s90) obj;
            aVar2.K(-2030883279);
            yj00 yj00Var = this.d;
            e9t.b(s90Var, this.c, intValue, yj00Var.e, yj00Var.c, ksy.c(ksyVar2, q630.a.a, 7), aVar2, (i2 << 3) & 896);
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
