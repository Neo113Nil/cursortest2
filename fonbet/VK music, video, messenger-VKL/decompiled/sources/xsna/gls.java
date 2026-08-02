package xsna;

import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.bls;
import xsna.hls;
import xsna.ols;
import xsna.qtf0;
import xsna.r1r0;
import xsna.rf90;

/* compiled from: FriendsAndFollowersTabFeature.kt */
/* loaded from: classes15.dex */
public final class gls extends wk50<qls, ols, bls, hls> {
    public final rb f;
    public final fsn0 g;
    public final wj50<fks> h;
    public final FriendsAndFollowersTabType i;
    public final f4z j;

    public gls(rb rbVar, fsn0 fsn0Var, wj50 wj50Var, FriendsAndFollowersTabType friendsAndFollowersTabType, mls mlsVar) {
        super(bls.a.b, mlsVar);
        this.f = rbVar;
        this.g = fsn0Var;
        this.h = wj50Var;
        this.i = friendsAndFollowersTabType;
        this.j = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ols olsVar, bls blsVar) {
        ols olsVar2 = olsVar;
        bls blsVar2 = blsVar;
        if (blsVar2 instanceof bls.a) {
            U();
            return;
        }
        boolean z = blsVar2 instanceof bls.c;
        rb rbVar = this.f;
        if (z) {
            bls.c cVar = (bls.c) blsVar2;
            if (cVar instanceof bls.c.b) {
                U();
                return;
            }
            if (!(cVar instanceof bls.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((olsVar2 instanceof ols.a) && (((ols.a) olsVar2).c instanceof qtf0.a)) {
                T(hls.d.c.b);
                a7f0.a.f(this, rbVar.a(0, true), new m1k(this, 10), new qcl(this, 11), 1);
                return;
            }
            return;
        }
        if (!(blsVar2 instanceof bls.b)) {
            if (blsVar2 instanceof yks) {
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(nts.d(rbVar.c, rbVar.a, null, null, rbVar.b, null, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE))), new nb(new mb(rbVar, 0), 0)), new wze(this, 28), new zkh(this, 16), 1);
                return;
            } else if (blsVar2 instanceof zks) {
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(nts.g(rbVar.c, rbVar.a, null, null, rbVar.b, null, 22))), new l8(new lb(rbVar, 0), 1)), new l2i(this, 12), new ire(this, 17), 1);
                return;
            } else {
                if (!(blsVar2 instanceof als)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new hls.c(((als) blsVar2).b));
                return;
            }
        }
        bls.b bVar = (bls.b) blsVar2;
        if (olsVar2 instanceof ols.a) {
            ols.a aVar = (ols.a) olsVar2;
            dls dlsVar = aVar.b;
            if (dlsVar.b && (aVar.c instanceof qtf0.a)) {
                if (!(bVar instanceof bls.b.C2612b) || (aVar.d instanceof rf90.b)) {
                    T(hls.b.c.b);
                    a7f0.a.f(this, rbVar.a(dlsVar.a.size(), false), new rop(this, 4), new fgh(this, 15), 1);
                }
            }
        }
    }

    public final void U() {
        T(hls.a.c.b);
        rb rbVar = this.f;
        a7f0.a.f(this, rsg0.w0(yfb.x(r1r0.a.b(rbVar.d, Collections.singletonList(rbVar.a), rbVar.g, null, null, 58))).l(new kb(new i8(1), 0)), new pcg(this, 23), new wpg(this, 14), 1);
    }
}
