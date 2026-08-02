package xsna;

import com.vk.sharing.api.dto.AttachmentInfo;

/* compiled from: ExternalSharingAnalyticsActionProvider.kt */
/* loaded from: classes5.dex */
public final class rfq extends r9l {
    public final ibj0 b;

    public rfq(AttachmentInfo attachmentInfo) {
        super(5);
        this.b = new ibj0(true, false, attachmentInfo, 0, null, null);
    }

    @Override // xsna.r9l
    public final void a(String str) {
        this.b.g(this.a, str);
    }
}
