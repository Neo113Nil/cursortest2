package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsConPostingStat$AttachmentInfo;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: AttachmentAnalyticsUtils.kt */
/* loaded from: classes18.dex */
public final class t64 {
    public static final MobileOfficialAppsConPostingStat$AttachmentInfo a(GeoAttachment geoAttachment) {
        MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType attachmentType = MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.GEO;
        long j = UserId.d.b;
        StringBuilder sb = new StringBuilder();
        sb.append(geoAttachment.f);
        sb.append(',');
        sb.append(geoAttachment.g);
        return new MobileOfficialAppsConPostingStat$AttachmentInfo(attachmentType, j, 0L, sb.toString());
    }

    public static final MobileOfficialAppsConPostingStat$AttachmentInfo b(PhotoAttachment photoAttachment) {
        return new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.PHOTO, photoAttachment.g.b, photoAttachment.f, null, 8, null);
    }

    public static final MobileOfficialAppsConPostingStat$AttachmentInfo c(VideoAttachment videoAttachment) {
        return new MobileOfficialAppsConPostingStat$AttachmentInfo(MobileOfficialAppsConPostingStat$AttachmentInfo.AttachmentType.VIDEO, videoAttachment.k.I0().b, videoAttachment.k.o0(), null, 8, null);
    }
}
