package defpackage;

import android.net.Uri;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;

/* loaded from: classes15.dex */
public final class lhv {
    public static ImageViewerInfo a(LocalMessageRef localMessageRef, PlainMessage.Image image, Integer num, Integer num2) {
        String f = b.f(image.fileInfo.id2);
        PlainMessage.FileInfo fileInfo = image.fileInfo;
        String str = fileInfo.name;
        if (str == null && (str = fileInfo.id2) == null) {
            str = "";
        }
        return new ImageViewerInfo(localMessageRef, f, str, image.width, image.height, image.animated, fileInfo.size, fileInfo.source, num, num2, fileInfo.id2);
    }

    public static ImageViewerInfo b(LocalMessageRef localMessageRef, ImageMessageData imageMessageData, Integer num, Integer num2) {
        String f = b.f(imageMessageData.fileId);
        String str = imageMessageData.fileName;
        if (str == null && (str = imageMessageData.fileId) == null) {
            str = "";
        }
        String str2 = str;
        Integer num3 = imageMessageData.width;
        int intValue = num3 != null ? num3.intValue() : -1;
        Integer num4 = imageMessageData.height;
        int intValue2 = num4 != null ? num4.intValue() : -1;
        boolean z = imageMessageData.animated;
        Integer num5 = imageMessageData.fileSource;
        String str3 = imageMessageData.fileId;
        Long l = imageMessageData.imageSize;
        return new ImageViewerInfo(localMessageRef, f, str2, intValue, intValue2, z, l == null ? 0L : l.longValue(), num5, num, num2, str3);
    }

    public static ImageViewerInfo c(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, String str3, long j) {
        String str4;
        if (str2 == null) {
            str4 = b64.j(Uri.parse(str).getLastPathSegment(), z ? ".gif" : ".jpeg");
        } else {
            str4 = str2;
        }
        return new ImageViewerInfo(localMessageRef, str, str4, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1, z, j, num3, num4, num5, str3);
    }

    public static /* synthetic */ ImageViewerInfo d(lhv lhvVar, String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, String str3, int i) {
        if ((i & 4) != 0) {
            localMessageRef = null;
        }
        if ((i & 8) != 0) {
            num = -1;
        }
        if ((i & 16) != 0) {
            num2 = -1;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            num3 = null;
        }
        if ((i & 128) != 0) {
            num4 = null;
        }
        if ((i & 256) != 0) {
            num5 = null;
        }
        if ((i & 512) != 0) {
            str3 = null;
        }
        lhvVar.getClass();
        return c(str, z, localMessageRef, num, num2, str2, num3, num4, num5, str3, 0L);
    }
}
