package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.g0o;
import xsna.tlo0;

/* compiled from: ClipCtaWithDonutViewStateMapper.kt */
/* loaded from: classes16.dex */
public final class aqc {
    public static final zpc a(ppc ppcVar) {
        xjk xjkVar;
        ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams;
        g0o g0oVar = ppcVar.f;
        tlo0.f h = tq.h(tlo0.Companion, R.string.clips_involvement_write);
        tlo0.f fVar = new tlo0.f(R.string.clips_involvement_write_description);
        ClipInvolvementActionButton<?> clipInvolvementActionButton = ppcVar.b;
        xjk xjkVar2 = new xjk(-1, epx.f(clipInvolvementActionButton, ClipInvolvementActionButton.MessageToBusinessCommunity.e), h, fVar);
        xjk xjkVar3 = new xjk(-2, epx.f(clipInvolvementActionButton, ClipInvolvementActionButton.OnlineBooking.e), new tlo0.f(R.string.clips_involvement_booking), new tlo0.f(R.string.clips_involvement_booking_description));
        xjk xjkVar4 = new xjk(-3, epx.f(clipInvolvementActionButton, ClipInvolvementActionButton.OpenChannel.e), new tlo0.f(R.string.clips_involvement_open_channel), new tlo0.f(R.string.clips_involvement_open_channel_description));
        if (ppcVar.j != null) {
            boolean z = clipInvolvementActionButton instanceof ClipInvolvementActionButton.VkTicket;
            ClipInvolvementActionButton.VkTicket vkTicket = z ? (ClipInvolvementActionButton.VkTicket) clipInvolvementActionButton : null;
            String zb = (vkTicket == null || (vkTicketParams = vkTicket.g) == null) ? null : vkTicketParams.zb();
            xjkVar = new xjk(-4, z, new tlo0.f(R.string.clips_involvement_vk_ticket_title), zb != null ? new tlo0.h(zb) : new tlo0.f(R.string.clips_involvement_vk_ticket_description));
        } else {
            xjkVar = null;
        }
        tlo0.f fVar2 = new tlo0.f(R.string.clips_involvement_section_actions);
        ListBuilder e = e43.e();
        p4g.a(xjkVar2, e, ppcVar.c);
        p4g.a(xjkVar3, e, ppcVar.d);
        p4g.a(xjkVar4, e, ppcVar.e);
        if (xjkVar != null) {
            e.add(xjkVar);
        }
        jkk jkkVar = new jkk(fVar2, e.g(), false);
        tlo0.f fVar3 = new tlo0.f(R.string.clips_involvement_section_regular_support);
        g0o.a aVar = g0oVar instanceof g0o.a ? (g0o.a) g0oVar : null;
        List list = aVar != null ? aVar.a : null;
        Iterable wowVar = list != null ? new wow(list) : null;
        if (wowVar == null) {
            wowVar = EmptyList.b;
        }
        Iterable iterable = wowVar;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                jkk jkkVar2 = new jkk(fVar3, arrayList, epx.f(g0oVar, g0o.b.a));
                ListBuilder e2 = e43.e();
                p4g.a(jkkVar, e2, !jkkVar.b.isEmpty());
                p4g.a(jkkVar2, e2, !epx.f(g0oVar, g0o.c.a));
                return new zpc(e2.g(), ppcVar.g);
            }
            qaq0 qaq0Var = (qaq0) it.next();
            int i = qaq0Var.a;
            tlo0.h d = oq.d(tlo0.Companion, qaq0Var.b);
            tlo0.h hVar = new tlo0.h(qaq0Var.c);
            ClipInvolvementActionButton.DonutLevel donutLevel = clipInvolvementActionButton instanceof ClipInvolvementActionButton.DonutLevel ? (ClipInvolvementActionButton.DonutLevel) clipInvolvementActionButton : null;
            if (donutLevel == null || donutLevel.e != qaq0Var.a) {
                z2 = false;
            }
            arrayList.add(new xjk(i, z2, d, hVar));
        }
    }
}
