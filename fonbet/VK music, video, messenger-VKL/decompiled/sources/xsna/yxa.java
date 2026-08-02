package xsna;

import com.vk.channels.impl.donut.a;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.bya;
import xsna.eya;

/* compiled from: ChannelDonutSupportFeature.kt */
/* loaded from: classes16.dex */
public final class yxa extends wk50<iya, hya, com.vk.channels.impl.donut.a, eya> {
    public final UserId f;
    public final dy2 g;
    public final f4z h;
    public final f4z i;

    public yxa(UserId userId, dy2 dy2Var) {
        super(a.d.b, new fya(new hya(userId, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE)));
        this.f = userId;
        this.g = dy2Var;
        this.h = new f4z();
        this.i = new f4z();
    }

    @Override // xsna.wk50
    public final void N(hya hyaVar, com.vk.channels.impl.donut.a aVar) {
        hya hyaVar2 = hyaVar;
        com.vk.channels.impl.donut.a aVar2 = aVar;
        boolean equals = aVar2.equals(a.d.b);
        dy2 dy2Var = this.g;
        if (equals) {
            T(eya.c.b);
            a7f0.a.f(this, rsg0.W(yfb.x(dy2Var.d(fkq0.e(this.f))), 7), new r7(this, 17), new za(this, 20), 1);
            return;
        }
        boolean equals2 = aVar2.equals(a.C0536a.b);
        f4z f4zVar = this.h;
        if (equals2) {
            f4zVar.b(bya.a.a);
            return;
        }
        if (aVar2.equals(a.c.b)) {
            f4zVar.b(bya.c.a);
            return;
        }
        if (!aVar2.equals(a.b.b)) {
            if (aVar2 instanceof a.e) {
                T(new eya.e(((a.e) aVar2).b));
                return;
            } else {
                if (!(aVar2 instanceof a.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new eya.h(((a.f) aVar2).b));
                return;
            }
        }
        String obj = drm0.p0(hyaVar2.e).toString();
        Integer m = arm0.m(10, hyaVar2.f);
        if (m != null) {
            int intValue = m.intValue();
            T(eya.g.b);
            List c0 = drm0.c0(obj, new String[]{" "}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : c0) {
                if (((String) obj2).length() > 0) {
                    arrayList.add(obj2);
                }
            }
            a7f0.a.f(this, rsg0.W(yfb.x(dy2Var.a(arrayList)), 7), new xxa(this, obj, intValue, 0), new com.vk.im.engine.internal.storage.delegates.messages.b(this, 20), 1);
        }
    }
}
