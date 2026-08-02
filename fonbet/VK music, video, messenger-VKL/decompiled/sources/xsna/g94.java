package xsna;

import com.vk.dto.common.Attachment;
import com.vk.pending.PendingPhotoAttachment;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: AttachmentsProvider.kt */
/* loaded from: classes7.dex */
public interface g94 {
    default int d(Attachment attachment) {
        return -1;
    }

    List<Attachment> getAll();

    default void i(int i) {
    }

    default void j(LinkedHashMap linkedHashMap) {
    }

    default void g(PendingPhotoAttachment pendingPhotoAttachment, Integer num) {
    }
}
