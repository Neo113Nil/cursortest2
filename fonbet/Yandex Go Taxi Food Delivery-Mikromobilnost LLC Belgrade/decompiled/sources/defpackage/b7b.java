package defpackage;

import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.entities.DivMessageData;
import com.yandex.messaging.internal.entities.FileMessageData;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.StickerMessageData;
import com.yandex.messaging.internal.entities.VideoMessageData;
import com.yandex.messaging.internal.entities.VoiceMessageData;

/* loaded from: classes15.dex */
public final class b7b implements MediaMessageData.MessageHandler {
    public final ShortMessageInfo a;
    public final /* synthetic */ i7b b;

    public b7b(i7b i7bVar, ShortMessageInfo shortMessageInfo) {
        this.b = i7bVar;
        this.a = shortMessageInfo;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object a(ImageMessageData imageMessageData) {
        if (imageMessageData.fileId != null) {
            oab oabVar = this.b.j;
            long j = this.a.timestamp;
            l020 C = oabVar.w.C();
            try {
                long j2 = oabVar.b.a;
                ph9 ph9Var = C.z;
                if (C.D.h(j2, j, imageMessageData)) {
                    ph9Var.a(j2);
                    ph9Var.e(j2, j);
                }
                C.s();
                C.close();
            } finally {
            }
        }
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object b(VoiceMessageData voiceMessageData) {
        if (voiceMessageData.fileId != null) {
            this.b.j.o(this.a.timestamp, voiceMessageData);
        }
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final /* bridge */ /* synthetic */ Object c(StickerMessageData stickerMessageData) {
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final /* bridge */ /* synthetic */ Object d(DivMessageData divMessageData) {
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object e(GalleryMessageData galleryMessageData) {
        oab oabVar = this.b.j;
        long j = this.a.timestamp;
        l020 C = oabVar.w.C();
        try {
            long j2 = oabVar.b.a;
            PlainMessage.Item[] itemArr = galleryMessageData.items;
            ph9 ph9Var = C.z;
            ndz0 ndz0Var = C.D;
            Boolean bool = (Boolean) skb1.a(alb1.i(ndz0Var.c, ndz0Var.h, j2, j), new pa6(ndz0Var, j2, j, itemArr, 3));
            if (bool != null ? bool.booleanValue() : false) {
                ph9Var.a(j2);
                ph9Var.e(j2, j);
            }
            C.s();
            C.close();
            return zy11.a;
        } finally {
        }
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object f(VideoMessageData videoMessageData) {
        if (videoMessageData.fileId != null) {
            this.b.j.o(this.a.timestamp, videoMessageData);
        }
        return zy11.a;
    }

    @Override // com.yandex.messaging.internal.entities.MediaMessageData.MessageHandler
    public final Object g(FileMessageData fileMessageData) {
        if (fileMessageData.fileId != null) {
            this.b.j.o(this.a.timestamp, fileMessageData);
        }
        return zy11.a;
    }
}
