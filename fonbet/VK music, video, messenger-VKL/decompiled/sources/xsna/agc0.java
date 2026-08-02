package xsna;

import android.net.Uri;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.RemoteImageLink;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: PostingImageCropDataExt.kt */
/* loaded from: classes4.dex */
public final class agc0 {
    public static final boolean a(ImageLink imageLink, ImageCropArea imageCropArea) {
        if (imageLink instanceof LocalImageLink) {
            Uri uri = ((LocalImageLink) imageLink).b;
            Uri uri2 = imageCropArea.c;
            return uri2 != null && uri2.equals(uri);
        }
        if (imageLink instanceof RemoteImageLink) {
            String str = ((RemoteImageLink) imageLink).b;
            String str2 = imageCropArea.b;
            if (!e(str2) && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(ImageCropArea imageCropArea, Photo photo) {
        String str = imageCropArea.b;
        if (!e(str) && str.equals(photo.Cb())) {
            return true;
        }
        Uri uri = imageCropArea.c;
        return uri != null && String.valueOf(uri).equals(photo.t);
    }

    public static final boolean c(ImageCropArea imageCropArea, ImageCropArea imageCropArea2) {
        String str = imageCropArea.b;
        if (!e(str) && epx.f(str, imageCropArea2.b)) {
            return true;
        }
        Uri uri = imageCropArea.c;
        return uri != null && epx.f(uri, imageCropArea2.c);
    }

    public static final boolean d(ImageCropArea imageCropArea, PhotoAttachment photoAttachment) {
        if (!(photoAttachment instanceof LocalPhotoAttachment)) {
            String str = imageCropArea.b;
            return !e(str) && epx.f(str, photoAttachment.Hb());
        }
        LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) photoAttachment;
        Uri uri = imageCropArea.c;
        return uri != null && epx.f(uri, localPhotoAttachment.getUri());
    }

    public static final boolean e(String str) {
        return str.length() == 0 || str.equals("0_0");
    }

    public static final int f(int i, int i2, int i3) {
        return swe0.g(swe0.g(i2 + i, 0, i3) - i, 0, i3);
    }
}
