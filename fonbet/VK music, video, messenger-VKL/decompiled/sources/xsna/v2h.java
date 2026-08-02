package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import xsna.an50;

/* compiled from: CommunityEventsStore.kt */
/* loaded from: classes5.dex */
public final class v2h implements t2h, mm50<CommunityEventsState, com.vk.profile.community.impl.ui.events.a, com.vk.profile.community.impl.ui.events.b> {
    public final /* synthetic */ mm50<CommunityEventsState, com.vk.profile.community.impl.ui.events.a, com.vk.profile.community.impl.ui.events.b> b;

    public v2h(UserId userId) {
        this.b = new ql50((aqw) null, 7).a(an50.a.b(new qn8(new lbe(userId, 9)), new u2h(), new un8()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super CommunityEventsState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.profile.community.impl.ui.events.b, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(com.vk.profile.community.impl.ui.events.a aVar) {
        this.b.b(aVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final CommunityEventsState getCurrentState() {
        return this.b.getCurrentState();
    }
}
