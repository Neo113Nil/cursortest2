package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.ix00;
import xsna.kx00;

/* compiled from: MarketEditAlbumCoverReducer.kt */
/* loaded from: classes18.dex */
public final class jx00 extends dm50<ox00, ix00, kx00> {
    @Override // xsna.dm50
    public final kx00 c(kx00 kx00Var, ix00 ix00Var) {
        kx00 kx00Var2 = kx00Var;
        ix00 ix00Var2 = ix00Var;
        if (ix00Var2 instanceof ix00.b) {
            return kx00.c.b;
        }
        if (ix00Var2 instanceof ix00.a) {
            ix00.a aVar = (ix00.a) ix00Var2;
            if (kx00Var2 instanceof kx00.a) {
                if (aVar instanceof ix00.a.d) {
                    ix00.a.d dVar = (ix00.a.d) aVar;
                    return kx00.a.a((kx00.a) kx00Var2, dVar.b, dVar.c, false, null, false, false, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                if (aVar instanceof ix00.a.C3086a) {
                    return kx00.a.a((kx00.a) kx00Var2, null, 0, false, ((ix00.a.C3086a) aVar).b, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                }
                if (aVar instanceof ix00.a.b) {
                    return kx00.a.a((kx00.a) kx00Var2, null, 0, false, null, ((ix00.a.b) aVar).b, false, 111);
                }
                if (aVar instanceof ix00.a.c) {
                    return kx00.a.a((kx00.a) kx00Var2, null, 0, false, null, false, ((ix00.a.c) aVar).b, 95);
                }
                if (aVar instanceof ix00.a.e) {
                    return kx00.a.a((kx00.a) kx00Var2, null, 0, ((ix00.a.e) aVar).b, null, false, false, 123);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(ix00Var2 instanceof ix00.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (kx00Var2 instanceof kx00.c) {
                ix00.c cVar = (ix00.c) ix00Var2;
                boolean z = cVar.b;
                String str = cVar.c;
                return new kx00.a(str, str != null ? str.length() : 0, false, cVar.d, cVar.e, cVar.f, z);
            }
        }
        return kx00Var2;
    }

    @Override // xsna.dm50
    public final ox00 d() {
        return new ox00(e(new kpr(4)), e(new per(9)), e(new viu(5)));
    }

    @Override // xsna.dm50
    public final void h(kx00 kx00Var, ox00 ox00Var) {
        kx00 kx00Var2 = kx00Var;
        ox00 ox00Var2 = ox00Var;
        if (kx00Var2 instanceof kx00.a) {
            f(ox00Var2.b, kx00Var2);
        } else if (kx00Var2 instanceof kx00.b) {
            f(ox00Var2.c, kx00Var2);
        } else {
            if (!(kx00Var2 instanceof kx00.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f(ox00Var2.a, kx00Var2);
        }
    }
}
