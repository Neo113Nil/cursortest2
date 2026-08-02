package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.common.Image;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.CompactRemovablePhotoStyle;
import com.vk.feed.core.models.attachment.EntryPhotoStyle;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AttachmentCompactStyle.kt */
/* loaded from: classes4.dex */
public final class u64 {
    public static final CompactAttachmentStyle a(String str, String str2, boolean z, List list) {
        Description description = new Description(new Text(str2, null, 2, null), null, null, null, null, false, false, false, PsExtractor.AUDIO_STREAM, null);
        if (z) {
            return new CompactRemovablePhotoStyle(null, null, list, EntryPhotoStyle.Square, null, new EntryTitle(new Text(str, null, 2, null), false), description, null);
        }
        return new CompactAttachmentStyle(null, null, list, EntryPhotoStyle.Square, null, new EntryTitle(new Text(str, null, 2, null), false), description, null);
    }

    public static final CompactAttachmentStyle b(DocumentAttachment documentAttachment, Context context, boolean z) {
        Image image = documentAttachment.s;
        List singletonList = image != null ? Collections.singletonList(image) : EmptyList.b;
        Resources resources = context.getResources();
        return a(resources.getString(R.string.photo_attach_title), z ? resources.getString(R.string.photo_attach_status_loading) : resources.getString(R.string.photo_attach_status_loaded), false, singletonList);
    }
}
