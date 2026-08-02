package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;

/* compiled from: ClipsVideoAttachmentFactoryImpl.kt */
/* loaded from: classes16.dex */
public final class jmf implements imf {
    @Override // xsna.imf
    public final com.vk.clips.attachments.api.di.f a() {
        return new qmf();
    }

    @Override // xsna.imf
    public final Intent b(ClipsVideoAttachmentData clipsVideoAttachmentData, Context context) {
        ClipsVideoAttachmentPickerFragment.a aVar = new ClipsVideoAttachmentPickerFragment.a(ClipsVideoAttachmentPickerFragment.class, null, null);
        aVar.j.putParcelable("clips_video_attachment_video_data", clipsVideoAttachmentData);
        aVar.s(true);
        return aVar.n(context);
    }
}
