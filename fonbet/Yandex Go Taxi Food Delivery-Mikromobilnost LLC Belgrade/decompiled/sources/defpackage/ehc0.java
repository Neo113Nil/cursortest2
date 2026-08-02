package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.entities.DivMessageData;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class ehc0 implements MediaMessageData.MessageHandler {
    public final /* synthetic */ PlainMessage a;
    public final /* synthetic */ fhc0 b;

    public ehc0(PlainMessage plainMessage, fhc0 fhc0Var) {
        this.a = plainMessage;
        this.b = fhc0Var;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object a(ImageMessageData imageMessageData) {
        String str;
        Integer num = imageMessageData.width;
        if (num == null) {
            ny61.g("Required value was null.");
            return null;
        }
        int intValue = num.intValue();
        Integer num2 = imageMessageData.height;
        if (num2 == null) {
            ny61.g("Required value was null.");
            return null;
        }
        int intValue2 = num2.intValue();
        String str2 = imageMessageData.fileId;
        if (str2 == null) {
            z83.j("No fileId");
            str = null;
        } else {
            str = str2;
        }
        String str3 = imageMessageData.fileName;
        Long l = imageMessageData.imageSize;
        return PlainMessage.copy$default(this.a, null, new PlainMessage.Image(new PlainMessage.FileInfo(0L, str3, l == null ? 0L : l.longValue(), str, imageMessageData.fileSource, 1, null), intValue, intValue2, imageMessageData.animated), null, null, null, null, null, null, null, 0L, null, null, null, null, false, null, false, null, null, null, 1048573, null);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object b(VoiceMessageData voiceMessageData) {
        PlainMessage.FileInfo fileInfo = new PlainMessage.FileInfo(0L, voiceMessageData.fileName, 0L, voiceMessageData.fileId, null, 21, null);
        int i = voiceMessageData.duration;
        String str = voiceMessageData.recognizedText;
        boolean z = voiceMessageData.wasRecognized;
        byte[] bArr = voiceMessageData.waveform;
        if (bArr != null) {
            Arrays.copyOf(bArr, bArr.length);
        } else {
            bArr = new byte[0];
        }
        return PlainMessage.copy$default(this.a, null, null, null, null, null, null, new PlainMessage.Voice(fileInfo, i, str, z, bArr, voiceMessageData.a), null, null, 0L, null, null, null, null, false, null, false, null, null, null, 1048511, null);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object c(StickerMessageData stickerMessageData) {
        return PlainMessage.copy$default(this.a, null, null, null, new PlainMessage.Sticker(stickerMessageData.id, stickerMessageData.setId), null, null, null, null, null, 0L, null, null, null, null, false, null, false, null, null, null, 1048567, null);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object d(DivMessageData divMessageData) {
        return this.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object e(GalleryMessageData galleryMessageData) {
        return PlainMessage.copy$default(this.a, null, null, null, null, null, new PlainMessage.Gallery(galleryMessageData.text, galleryMessageData.items), null, null, null, 0L, null, null, null, null, false, null, false, null, null, null, 1048543, null);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object f(VideoMessageData videoMessageData) {
        String str;
        String str2 = videoMessageData.fileId;
        if (str2 == null) {
            z83.j("No fileId");
            str = null;
        } else {
            str = str2;
        }
        String str3 = videoMessageData.fileName;
        Long l = videoMessageData.size;
        return PlainMessage.copy$default(this.a, null, null, new PlainMessage.File(new PlainMessage.FileInfo(0L, str3, l == null ? 0L : l.longValue(), str, videoMessageData.fileSource, 1, null), ((wk31) this.b.a.get()).c ? new PlainMessage.File.PreviewHint(new PlainMessage.File.VideoPreview(videoMessageData.width, videoMessageData.height, videoMessageData.durationMs, videoMessageData.thumbHash)) : null), null, null, null, null, null, null, 0L, null, null, null, null, false, null, false, null, null, null, 1048571, null);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object g(FileMessageData fileMessageData) {
        String str;
        String str2 = fileMessageData.fileId;
        if (str2 == null) {
            z83.j("No fileId");
            str = null;
        } else {
            str = str2;
        }
        String str3 = fileMessageData.fileName;
        Long l = fileMessageData.size;
        return PlainMessage.copy$default(this.a, null, null, new PlainMessage.File(new PlainMessage.FileInfo(0L, str3, l == null ? 0L : l.longValue(), str, fileMessageData.fileSource, 1, null), null, 2, null), null, null, null, null, null, null, 0L, null, null, null, null, false, null, false, null, null, null, 1048571, null);
    }
}
