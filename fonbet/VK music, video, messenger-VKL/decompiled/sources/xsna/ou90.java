package xsna;

import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.dto.common.id.UserId;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.richcontent.api.MimeType;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import xsna.wjg0;

/* compiled from: PendingAttachmentTransformer.kt */
/* loaded from: classes7.dex */
public final class ou90 implements ku90 {
    public static final ou90 a = new ou90();
    public static final Set<String> b = Collections.singleton("image/gif");

    @Override // xsna.ku90
    public final ju90<?> a(wjg0.a aVar) {
        File file = aVar.a;
        Uri fromFile = Uri.fromFile(file);
        String lastPathSegment = fromFile.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        return new PendingDocumentAttachment(lastPathSegment, fromFile.toString(), file.length(), "", UserId.d, 0, com.vk.core.files.a.g(fromFile.toString()));
    }

    @Override // xsna.ku90
    public final boolean b(String str) {
        return b.contains(str) || MimeType.DOCUMENT.a(str);
    }
}
