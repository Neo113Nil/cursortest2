package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.viewer.edit.api.domain.model.ClipVideoAttachmentSdkItem;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: ClipsEditSdkVideoAttachHandlerVk.kt */
/* loaded from: classes16.dex */
public final class pvd implements nvd {
    public final imf a;
    public final boolean b;
    public final int c;

    public pvd(imf imfVar) {
        this.a = imfVar;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIP_ATTACH_VIDEO;
        videoFeatures.getClass();
        this.b = com.vk.toggle.b.A.a(videoFeatures);
        this.c = 7850;
    }

    @Override // xsna.nvd
    public final ClipVideoAttachmentSdkItem a(Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("clips_video_attachment_result", ClipsVideoAttachmentData.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                Parcelable parcelableExtra2 = intent.getParcelableExtra("clips_video_attachment_result");
                if (!(parcelableExtra2 instanceof ClipsVideoAttachmentData)) {
                    parcelableExtra2 = null;
                }
                parcelable = (ClipsVideoAttachmentData) parcelableExtra2;
            }
            ClipsVideoAttachmentData clipsVideoAttachmentData = (ClipsVideoAttachmentData) parcelable;
            if (clipsVideoAttachmentData != null) {
                return new ClipVideoAttachmentSdkItem(clipsVideoAttachmentData.d, clipsVideoAttachmentData.e, clipsVideoAttachmentData.f, clipsVideoAttachmentData.g, clipsVideoAttachmentData.h);
            }
        }
        return null;
    }

    @Override // xsna.nvd
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.nvd
    public final int c() {
        return this.c;
    }

    @Override // xsna.nvd
    public final void d(Context context, ClipVideoAttachmentSdkItem clipVideoAttachmentSdkItem, String str) {
        xa4.L(context).D(this.a.b(new ClipsVideoAttachmentData(str, false, clipVideoAttachmentSdkItem.b, clipVideoAttachmentSdkItem.c, clipVideoAttachmentSdkItem.d, clipVideoAttachmentSdkItem.e, clipVideoAttachmentSdkItem.f), context), this.c, null);
    }
}
