package xsna;

import android.net.Uri;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.newsfeed.api.posting.attachments.PendingAudioAttachmentWrapper;
import com.vk.newsfeed.api.posting.attachments.PendingDocumentAttachmentWrapper;
import com.vk.newsfeed.api.posting.attachments.PendingPhotoAttachmentWrapper;
import com.vk.newsfeed.api.posting.attachments.PendingVideoAttachmentWrapper;
import com.vk.pending.PendingAudioAttachment;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AttachmentsHelper.kt */
/* loaded from: classes4.dex */
public final class r84 {
    public final ln20 a;

    public r84(ln20 ln20Var) {
        this.a = ln20Var;
    }

    public final List<Attachment> a(Collection<? extends Attachment> collection) {
        Attachment pendingAudioAttachmentWrapper;
        if (collection == null) {
            return EmptyList.b;
        }
        Collection<? extends Attachment> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        for (Attachment attachment : collection2) {
            boolean z = attachment instanceof PendingDocumentAttachment;
            ln20 ln20Var = this.a;
            if (z) {
                PendingDocumentAttachment pendingDocumentAttachment = (PendingDocumentAttachment) attachment;
                pendingDocumentAttachment.g = ((gfc0) ln20Var.invoke()).a(Uri.parse(pendingDocumentAttachment.g)).toString();
                pendingAudioAttachmentWrapper = new PendingDocumentAttachmentWrapper(pendingDocumentAttachment);
            } else if (attachment instanceof PendingPhotoAttachment) {
                pendingAudioAttachmentWrapper = new PendingPhotoAttachmentWrapper(new PendingPhotoAttachment(((gfc0) ln20Var.invoke()).a(Uri.parse(((PendingPhotoAttachment) attachment).f)).toString()));
            } else if (attachment instanceof PendingVideoAttachment) {
                PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) attachment;
                String uri = ((gfc0) ln20Var.invoke()).a(Uri.parse(pendingVideoAttachment.getUri())).toString();
                pendingVideoAttachment.k.D9(new Image((List<ImageSize>) Collections.singletonList(new ImageSize(uri, pendingVideoAttachment.k.getWidth(), pendingVideoAttachment.k.getHeight(), null, (char) 0, false, 56, null))));
                VideoFile videoFile = pendingVideoAttachment.k;
                HashMap hashMap = new HashMap();
                VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                if (!myc0.f(uri)) {
                    uri = null;
                }
                if (uri != null) {
                    VideoUrlStorage.b bVar = VideoUrlStorage.c;
                    VideoUrlStorage.d.b(hashMap, videoUrl, uri);
                }
                videoFile.ua(new VideoUrlStorage(hashMap));
                pendingAudioAttachmentWrapper = new PendingVideoAttachmentWrapper(pendingVideoAttachment);
            } else if (attachment instanceof PendingAudioAttachment) {
                PendingAudioAttachment pendingAudioAttachment = (PendingAudioAttachment) attachment;
                pendingAudioAttachment.f.i = ((gfc0) ln20Var.invoke()).a(Uri.parse(pendingAudioAttachment.f.i)).toString();
                pendingAudioAttachmentWrapper = new PendingAudioAttachmentWrapper(pendingAudioAttachment);
            } else {
                arrayList.add(attachment);
            }
            attachment = pendingAudioAttachmentWrapper;
            arrayList.add(attachment);
        }
        return arrayList;
    }
}
