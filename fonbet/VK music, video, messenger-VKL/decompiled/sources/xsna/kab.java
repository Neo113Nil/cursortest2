package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgIdType;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.hab;
import xsna.lab;
import xsna.pab;

/* compiled from: ChannelReactionQuantitySelectorFeature.kt */
/* loaded from: classes16.dex */
public final class kab extends wk50<vab, sab, hab, pab> {
    public final UserId f;
    public final int g;
    public final a1w h;
    public final oib i;
    public final f4z j;
    public final f4z k;

    public kab(UserId userId, int i, a1w a1wVar, oib oibVar) {
        super(hab.a.b, new rab());
        this.f = userId;
        this.g = i;
        this.h = a1wVar;
        this.i = oibVar;
        this.j = new f4z();
        this.k = new f4z();
    }

    @Override // xsna.wk50
    public final void N(sab sabVar, hab habVar) {
        sab sabVar2 = sabVar;
        hab habVar2 = habVar;
        boolean z = habVar2 instanceof hab.a;
        a1w a1wVar = this.h;
        UserId userId = this.f;
        if (z) {
            a7f0.a.f(this, new lxa(userId.b, a1wVar).e.K(), new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 17), new ot(11), 1);
            return;
        }
        if (habVar2 instanceof hab.b) {
            T(new pab.b(((hab.b) habVar2).b));
            return;
        }
        if (!(habVar2 instanceof hab.c)) {
            boolean z2 = habVar2 instanceof hab.e;
            f4z f4zVar = this.j;
            if (z2) {
                f4zVar.b(lab.c.a);
                return;
            } else {
                if (!(habVar2 instanceof hab.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(lab.a.a);
                return;
            }
        }
        io.reactivex.rxjava3.internal.operators.single.y l = a1wVar.C(this, new n2b(userId.b, Collections.singletonList(Integer.valueOf(this.g)), MsgIdType.CNV_ID, Source.CACHE, false, false)).l(new z7(new fb(this, 16), 12));
        int i = sabVar2.d;
        int i2 = i == 0 ? 1 : i;
        int i3 = sabVar2.b;
        Boolean valueOf = Boolean.valueOf(dhr0.M());
        this.i.getClass();
        tfx tfxVar = new tfx("channels.initializePaymentForMessagesPaidReactions", new dr(10), new com.vk.movika.sdk.android.defaultplayer.view.a(12));
        tfx.l(tfxVar, "amount", i2, 0, 0, 12);
        tfx.o(tfxVar, "source", "DONUT_POST_CHANNEL", 0, 0, 12);
        tfx.n(tfxVar, "channel_id", this.f, 0L, -1L, 4);
        tfx.l(tfxVar, "cmid", this.g, 0, 0, 8);
        tfx.l(tfxVar, "paid_reactions_count", i3, 0, 0, 12);
        tfxVar.j("is_dark", valueOf.booleanValue());
        tfx.o(tfxVar, "screen", "IM_CHANNEL", 0, 0, 12);
        a7f0.a.f(this, io.reactivex.rxjava3.core.x.B(l, rsg0.W(yfb.x(tfxVar), 7), new b8(new f07((byte) 0, 1), 10)), new gb(6, this, sabVar2), new hb(this, 20), 1);
    }
}
