package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollInfo;
import com.vkontakte.android.attachments.PollAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dsb0;
import xsna.osb0;
import xsna.tsb0;

/* compiled from: PollV3Feature.kt */
/* loaded from: classes4.dex */
public final class lsb0 extends wk50<atb0, usb0, dsb0, osb0> {
    public final umb0 f;
    public final f4z g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsb0(PollAttachment pollAttachment, Integer num, UserId userId, String str, String str2, String str3) {
        super(new dsb0.c(pollAttachment, num, userId, str, str2, str3), new ssb0(new usb0(0)));
        umb0 umb0Var = new umb0();
        this.f = umb0Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(usb0 usb0Var, dsb0 dsb0Var) {
        usb0 usb0Var2 = usb0Var;
        dsb0 dsb0Var2 = dsb0Var;
        PollAttachment pollAttachment = usb0Var2.b;
        Poll poll = usb0Var2.c;
        boolean z = dsb0Var2 instanceof dsb0.c;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        if (z) {
            dsb0.c cVar = (dsb0.c) dsb0Var2;
            UserId userId = cVar.d;
            PollAttachment pollAttachment2 = cVar.b;
            if (pollAttachment2 != null) {
                T(new osb0.b(pollAttachment2, cVar.e, cVar.f, cVar.g));
                return;
            }
            int i = 13;
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.c0(rsg0.y0(new cub0(new PollInfo(cVar.c.intValue(), userId, false)), null, null, 3), new xk30(new d2y(this, 17), i), kVar).G(new g9b(this, 7)).subscribe(new sl30(new zl20(this, 19), i), new tl30(new lw20(this, 19), 14)));
            return;
        }
        boolean z2 = dsb0Var2 instanceof dsb0.d;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        umb0 umb0Var = this.f;
        if (z2) {
            if (poll != null && !poll.Bb()) {
                U(new tsb0.d(poll));
                return;
            }
            if (poll != null && poll.Ib()) {
                T(new osb0.c(((dsb0.d) dsb0Var2).b));
                return;
            }
            long j = ((dsb0.d) dsb0Var2).b;
            if (pollAttachment == null || poll == null) {
                return;
            }
            UserId userId2 = poll.c;
            int i2 = poll.b;
            boolean z3 = poll.j;
            String str = usb0Var2.d;
            String str2 = usb0Var2.e;
            String str3 = usb0Var2.f;
            wmb0 wmb0Var = umb0Var.a;
            new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(rsg0.y0(new rtb0(userId2, str, str2, z3, Collections.singletonList(Long.valueOf(j)), i2, str3), null, null, 3).E(new p350(new q7a0(2, pollAttachment, this), 7), lVar, kVar, kVar), new sj4(new n3b0(poll, 2), 25)), new d750(new hb40(this, 10), 5), kVar).G(new d9b(this, 2)).subscribe(new cx00(new o440(this, 13), 14), new lav(new bv1(29, this, poll), 18));
            new hx3(bVar, 6);
            return;
        }
        if (dsb0Var2 instanceof dsb0.f) {
            if (poll != null) {
                if (!poll.Ib() || !poll.Bb()) {
                    U(new tsb0.d(poll));
                    return;
                }
                List O0 = j5g.O0(poll.x);
                if (pollAttachment != null) {
                    UserId userId3 = poll.c;
                    int i3 = poll.b;
                    boolean z4 = poll.j;
                    String str4 = usb0Var2.d;
                    String str5 = usb0Var2.e;
                    String str6 = usb0Var2.f;
                    wmb0 wmb0Var2 = umb0Var.a;
                    io.reactivex.rxjava3.internal.operators.observable.b0 G = new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.i0(rsg0.y0(new rtb0(userId3, str4, str5, z4, O0, i3, str6), null, null, 3).E(new ox80(new hn0(22, pollAttachment, this), 3), lVar, kVar, kVar), new kxa0(new kb40(poll, 13), 3)), new g600(new t440(this, 11), 14), kVar).G(new ueb(this, 3));
                    int i4 = 12;
                    G.subscribe(new zk30(new xgv(this, 26), i4), new s520(new uh40(this, i4), 8));
                    new hoh(bVar, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (dsb0Var2 instanceof dsb0.e) {
            PollAttachment pollAttachment3 = ((dsb0.e) dsb0Var2).b;
            ysg0.b.a(new zrb0(pollAttachment3.f));
            U(new tsb0.a(pollAttachment3));
            T(new osb0.e(pollAttachment3));
            return;
        }
        if (!(dsb0Var2 instanceof dsb0.a)) {
            if (!(dsb0Var2 instanceof dsb0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (pollAttachment != null) {
                U(new tsb0.c(pollAttachment));
                return;
            }
            return;
        }
        if (pollAttachment == null || poll == null) {
            return;
        }
        UserId userId4 = poll.c;
        int i5 = poll.b;
        boolean z5 = poll.j;
        String str7 = usb0Var2.d;
        String str8 = usb0Var2.e;
        wmb0 wmb0Var3 = umb0Var.a;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(rsg0.y0(new aub0(i5, userId4, str7, str8, z5), null, null, 3).E(new xj50(new isb0(0, pollAttachment, this), 5), lVar, kVar, kVar), new fhb0(new uv20(poll, 22), 2));
        int i6 = 0;
        new io.reactivex.rxjava3.internal.operators.observable.c0(i0Var, new jsb0(new ggb0(this, 1), i6), kVar).G(new lg4(this, 5)).subscribe(new ksb0(new w620(this, 16), i6), new wnt(new c230(this, 16), 19));
        new vs6(bVar, 7);
    }

    public final void U(tsb0 tsb0Var) {
        this.g.b(tsb0Var);
    }
}
