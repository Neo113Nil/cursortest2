package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsCtaPreselectProviderImpl.kt */
/* loaded from: classes16.dex */
public final class rod implements qod {
    public final m3a a;

    public rod(m3a m3aVar) {
        this.a = m3aVar;
    }

    @Override // xsna.qod
    public final io.reactivex.rxjava3.core.x<Boolean> a(UserId userId, ClipInvolvementActionButton<?> clipInvolvementActionButton) {
        return clipInvolvementActionButton instanceof ClipInvolvementActionButton.VkTicket ? io.reactivex.rxjava3.core.x.k(Boolean.FALSE) : clipInvolvementActionButton instanceof ClipInvolvementActionButton.DonutLevel ? this.a.e(userId).m0().l(new e8(new com.vk.movika.sdk.base.observable.c(clipInvolvementActionButton, 26), 11)) : io.reactivex.rxjava3.core.x.k(Boolean.TRUE);
    }

    @Override // xsna.qod
    public final io.reactivex.rxjava3.core.q<ClipInvolvementActionButton<?>> b(UserId userId) {
        return this.a.e(userId).L(new c8(new yy(11), 5), false);
    }
}
