package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageAttachmentHolder.kt */
/* loaded from: classes4.dex */
public abstract class ufw<T extends AttachmentWithMedia> extends m56<T> implements bnw {
    public anw D;

    /* JADX WARN: Multi-variable type inference failed */
    public final int X6(ArrayList<AttachmentWithMedia> arrayList) {
        AttachmentWithMedia attachmentWithMedia = (AttachmentWithMedia) this.C;
        if (attachmentWithMedia == null) {
            return 0;
        }
        Parcelable q6 = q6();
        fsx0 fsx0Var = q6 instanceof fsx0 ? (fsx0) q6 : null;
        List<EntryAttachment> N7 = fsx0Var != null ? fsx0Var.N7() : null;
        List<EntryAttachment> list = N7;
        if (list == null || list.isEmpty()) {
            arrayList.add(attachmentWithMedia);
            return 0;
        }
        int size = N7.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Attachment attachment = N7.get(i2).b;
            if (attachmentWithMedia == attachment) {
                i = arrayList.size();
            }
            if ((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) {
                arrayList.add(attachment);
            } else if ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).Ib()) {
                arrayList.add(attachment);
            }
        }
        if (!arrayList.isEmpty()) {
            return i;
        }
        arrayList.add(attachmentWithMedia);
        return 0;
    }

    public void b5(anw anwVar) {
        this.D = anwVar;
    }
}
