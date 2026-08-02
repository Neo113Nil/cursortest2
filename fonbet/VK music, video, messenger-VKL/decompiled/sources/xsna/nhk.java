package xsna;

import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import kotlin.Pair;
import xsna.lhk;

/* compiled from: CropImageStateTransformer.kt */
/* loaded from: classes4.dex */
public final class nhk {
    public static lhk a(PhotoAttachment photoAttachment) {
        if (!(photoAttachment instanceof LocalPhotoAttachment)) {
            float E0 = photoAttachment.E0();
            String Hb = photoAttachment.Hb();
            Pair<Integer, Integer> e = com.vk.newsfeed.posting.impl.domain.model.c.e(photoAttachment);
            return new lhk.b(Hb, E0, e != null ? new iba0(e.i().intValue(), e.j().intValue()) : null);
        }
        LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) photoAttachment;
        Uri uri = localPhotoAttachment.getUri();
        int i = localPhotoAttachment.A;
        float f = i != 0 ? localPhotoAttachment.z / i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Pair<Integer, Integer> e2 = com.vk.newsfeed.posting.impl.domain.model.c.e(localPhotoAttachment);
        return new lhk.a(uri, f, e2 != null ? new iba0(e2.i().intValue(), e2.j().intValue()) : null);
    }
}
