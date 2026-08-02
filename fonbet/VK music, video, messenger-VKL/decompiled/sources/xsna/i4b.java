package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.f4b;

/* compiled from: ChannelMonetizationReducer.kt */
/* loaded from: classes16.dex */
public final class i4b extends dm50<l4b, f4b, j4b> {
    public i4b() {
        super(new j4b(0));
    }

    @Override // xsna.dm50
    public final j4b c(j4b j4bVar, f4b f4bVar) {
        j4b j4bVar2 = j4bVar;
        f4b f4bVar2 = f4bVar;
        if (f4bVar2 instanceof f4b.b) {
            return j4b.a(j4bVar2, true, false, false, false, 0, false, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        if (f4bVar2 instanceof f4b.a) {
            f4b.a aVar = (f4b.a) f4bVar2;
            return j4b.a(j4bVar2, false, aVar.c, aVar.b, false, 0, aVar.d, aVar.e, 24);
        }
        if (f4bVar2 instanceof f4b.d) {
            f4b.d dVar = (f4b.d) f4bVar2;
            return j4b.a(j4bVar2, false, false, false, dVar.b, dVar.c, false, null, 103);
        }
        if (!(f4bVar2 instanceof f4b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        f4b.c cVar = (f4b.c) f4bVar2;
        return j4b.a(j4bVar2, false, false, false, cVar.b, 0, cVar.c, null, 87);
    }

    @Override // xsna.dm50
    public final l4b d() {
        return new l4b(e(new g60(this, 21)));
    }

    @Override // xsna.dm50
    public final void h(j4b j4bVar, l4b l4bVar) {
        f(l4bVar.a, j4bVar);
    }
}
