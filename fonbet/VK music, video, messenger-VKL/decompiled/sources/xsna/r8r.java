package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vkontakte.android.attachments.DocumentAttachment;

/* compiled from: FileDtoPreparer.kt */
/* loaded from: classes4.dex */
public final class r8r {
    public static final FileDto a(DocumentAttachment documentAttachment) {
        UserId userId = documentAttachment.o;
        String str = documentAttachment.f;
        if (epx.f(documentAttachment.i, "gif")) {
            int i = documentAttachment.k;
            long j = documentAttachment.n;
            return new FileDto.Gif(i, str, null, j, userId, documentAttachment.j, null, documentAttachment, j, 64, null);
        }
        int i2 = documentAttachment.k;
        long j2 = documentAttachment.n;
        return new FileDto.Doc(i2, str, null, j2, userId, documentAttachment.j, null, j2, 64, null);
    }
}
