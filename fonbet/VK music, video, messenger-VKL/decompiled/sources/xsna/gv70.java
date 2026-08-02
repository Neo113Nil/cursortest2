package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import xsna.an50;

/* compiled from: OfflinePodcastEpisodesMviStore.kt */
/* loaded from: classes3.dex */
public final class gv70 implements ev70, mm50<OfflinePodcastEpisodesMviState, com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a, dv70> {
    public final /* synthetic */ mm50<OfflinePodcastEpisodesMviState, com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a, dv70> b;

    public gv70(UserId userId, String str, wu70 wu70Var) {
        this.b = new ql50((aqw) null, 7).a(an50.a.b(new rn8(new dgk(str, 2)), new wn8(new aq1(16, wu70Var, userId), 0), new un8()));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super OfflinePodcastEpisodesMviState, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super dv70, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.a aVar) {
        this.b.b(aVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final OfflinePodcastEpisodesMviState getCurrentState() {
        return this.b.getCurrentState();
    }
}
