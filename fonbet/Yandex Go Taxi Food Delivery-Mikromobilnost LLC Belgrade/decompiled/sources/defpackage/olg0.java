package defpackage;

import android.content.res.Resources;
import com.yandex.messaging.internal.entities.DivMessageData;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;

/* loaded from: classes15.dex */
public final class olg0 implements MediaMessageData.MessageHandler {
    public final Resources a;
    public final String b;

    public olg0(Resources resources, String str) {
        this.a = resources;
        this.b = str;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object a(ImageMessageData imageMessageData) {
        return new plg0(imageMessageData.animated ? 3 : 1, imageMessageData.fileSource, this.b, imageMessageData.text, imageMessageData.fileId, null);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object b(VoiceMessageData voiceMessageData) {
        return new rlg0(this.b, ne10.a(voiceMessageData, this.a), false);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object c(StickerMessageData stickerMessageData) {
        return new plg0(2, null, this.b, stickerMessageData.text, stickerMessageData.id, null);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object d(DivMessageData divMessageData) {
        throw new IllegalArgumentException("DivMessageData is unsupported");
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object e(GalleryMessageData galleryMessageData) {
        return new nlg0(this.b, galleryMessageData.text, galleryMessageData.previewId, false, galleryMessageData.b());
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object f(VideoMessageData videoMessageData) {
        return new plg0(0, videoMessageData.fileSource, this.b, videoMessageData.text, videoMessageData.fileId, videoMessageData.fileName);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object g(FileMessageData fileMessageData) {
        return new plg0(0, fileMessageData.fileSource, this.b, fileMessageData.text, fileMessageData.fileId, fileMessageData.fileName);
    }
}
