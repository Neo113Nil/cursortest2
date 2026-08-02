package xsna;

import android.net.Uri;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.richcontent.api.MimeType;
import java.util.Collections;
import java.util.Set;
import xsna.wjg0;

/* compiled from: PendingAttachmentTransformer.kt */
/* loaded from: classes7.dex */
public final class yu90 implements ku90 {
    public static final yu90 a = new yu90();
    public static final Set<String> b = Collections.singleton("image/gif");

    @Override // xsna.ku90
    public final ju90<?> a(wjg0.a aVar) {
        return new PendingPhotoAttachment(Uri.fromFile(aVar.a).toString());
    }

    @Override // xsna.ku90
    public final boolean b(String str) {
        return !b.contains(str) && MimeType.IMAGE.a(str);
    }
}
