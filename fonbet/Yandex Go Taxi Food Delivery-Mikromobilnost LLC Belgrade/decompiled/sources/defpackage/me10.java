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
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes15.dex */
public class me10 implements MediaMessageData.MessageHandler {
    public final Resources a;

    public me10(Resources resources) {
        this.a = resources;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object a(ImageMessageData imageMessageData) {
        boolean z = imageMessageData.animated;
        Resources resources = this.a;
        return z ? resources.getString(oyh0.messenger_message_with_gif) : resources.getString(oyh0.messenger_message_with_image);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object b(VoiceMessageData voiceMessageData) {
        String str;
        return String.format(Locale.getDefault(), "%s %s", Arrays.copyOf(new Object[]{"🎙", (!voiceMessageData.wasRecognized || (str = voiceMessageData.recognizedText) == null || str.length() == 0) ? this.a.getString(oyh0.voice_message_placeholder_text) : voiceMessageData.recognizedText}, 2));
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object c(StickerMessageData stickerMessageData) {
        return this.a.getString(oyh0.messenger_message_with_sticker);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object f(VideoMessageData videoMessageData) {
        return this.a.getString(oyh0.messenger_message_with_file);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object g(FileMessageData fileMessageData) {
        return this.a.getString(oyh0.messenger_message_with_file);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String d(DivMessageData divMessageData) {
        return this.a.getString(oyh0.messenger_message_with_div_card);
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String e(GalleryMessageData galleryMessageData) {
        return this.a.getString(oyh0.messenger_message_with_gallery);
    }
}
