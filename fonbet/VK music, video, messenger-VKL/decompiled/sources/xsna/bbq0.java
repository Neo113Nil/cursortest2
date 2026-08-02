package xsna;

import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import xsna.efc0;

/* compiled from: UploadFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class bbq0 {
    public final efc0.a a;
    public final ibc0 b;
    public final nbq0 c;
    public final com.vk.newsfeed.posting.impl.domain.model.upload.a d;

    public bbq0(efc0.a aVar, r8c0 r8c0Var, ibc0 ibc0Var) {
        this.a = aVar;
        this.b = ibc0Var;
        this.c = r8c0Var.a;
        this.d = r8c0Var.b;
    }

    public final void a(UploadDto uploadDto) {
        boolean z = uploadDto instanceof PhotoDto;
        ibc0 ibc0Var = this.b;
        if (z) {
            ibc0Var.u().y(new PostingAttachmentInfo(((PhotoDto) uploadDto).d.b, r12.b, null, null, null, 28, null));
        } else if (uploadDto instanceof VideoDto) {
            ibc0Var.u().B(new PostingAttachmentInfo(((VideoDto) uploadDto).d.b, r12.b, null, null, null, 28, null));
        }
    }
}
