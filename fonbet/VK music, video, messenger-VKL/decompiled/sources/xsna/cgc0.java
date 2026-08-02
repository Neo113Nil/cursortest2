package xsna;

import com.vk.dto.common.Attachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.List;

/* compiled from: PostingImageTypeChecker.kt */
/* loaded from: classes4.dex */
public final class cgc0 {
    public static final List<String> a = e43.l("jpg", "png", "heic", "heif", "webp");

    public static boolean a(Attachment attachment) {
        if (!(attachment instanceof DocumentAttachment)) {
            return false;
        }
        return a.contains(((DocumentAttachment) attachment).i);
    }
}
