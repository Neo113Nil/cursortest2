package com.yandex.messaging.internal.entities;

import android.content.res.Resources;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.DefaultIfNull;
import defpackage.ne10;
import defpackage.yab;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@DefaultIfNull
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010 R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010 R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0016\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u0006#"}, d2 = {"Lcom/yandex/messaging/internal/entities/ReplyData;", "", "authorGuid", "", "text", ClidProvider.TIMESTAMP, "", "fileId", "fileName", "fileSource", "", "isMedia", "", "isVoice", "isGallery", "isSticker", "isHiddenByModeration", "isAnimatedImage", "isPoll", "quotedText", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZZZZZLjava/lang/String;)V", "getAuthorGuid", "()Ljava/lang/String;", "getText", "getTimestamp", "()J", "getFileId", "getFileName", "getFileSource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getQuotedText", "Companion", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReplyData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    @Json(name = "author_guid")
    private final String authorGuid;

    @Json(name = "fileId")
    private final String fileId;

    @Json(name = "fileName")
    private final String fileName;

    @Json(name = "fileSource")
    private final Integer fileSource;

    @Json(name = "isAnimatedImage")
    private final boolean isAnimatedImage;

    @Json(name = "isGallery")
    private final boolean isGallery;

    @Json(name = "isHiddenByModeration")
    private final boolean isHiddenByModeration;

    @Json(name = "isMedia")
    private final boolean isMedia;

    @Json(name = "isPoll")
    private final boolean isPoll;

    @Json(name = "isSticker")
    private final boolean isSticker;

    @Json(name = "isVoice")
    private final boolean isVoice;

    @Json(name = "quotedText")
    private final String quotedText;

    @Json(name = "text")
    private final String text;

    @Json(name = ClidProvider.TIMESTAMP)
    private final long timestamp;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/internal/entities/ReplyData$Companion;", "", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ReplyData a(Resources resources, MessageData messageData, String str, long j, String str2) {
            if (messageData instanceof StickerMessageData) {
                return new ReplyData(str, messageData.text, j, ((StickerMessageData) messageData).id, null, null, false, false, false, true, messageData.hiddenByModeration, false, false, str2);
            }
            if (messageData instanceof GalleryMessageData) {
                GalleryMessageData galleryMessageData = (GalleryMessageData) messageData;
                return new ReplyData(str, messageData.text, j, galleryMessageData.previewId, null, galleryMessageData.b(), false, false, true, false, messageData.hiddenByModeration, false, false, str2);
            }
            if (messageData instanceof ImageMessageData) {
                ImageMessageData imageMessageData = (ImageMessageData) messageData;
                return new ReplyData(str, messageData.text, j, imageMessageData.fileId, null, imageMessageData.fileSource, true, false, false, false, messageData.hiddenByModeration, imageMessageData.animated, false, str2);
            }
            if (messageData instanceof FileMessageData) {
                FileMessageData fileMessageData = (FileMessageData) messageData;
                return new ReplyData(str, messageData.text, j, fileMessageData.fileId, fileMessageData.fileName, fileMessageData.fileSource, true, false, false, false, messageData.hiddenByModeration, false, false, str2);
            }
            if (messageData instanceof VoiceMessageData) {
                return new ReplyData(str, ne10.a((MediaMessageData) messageData, resources), j, ((VoiceMessageData) messageData).fileId, null, null, true, true, false, false, messageData.hiddenByModeration, false, false, str2);
            }
            if (messageData instanceof PollMessageData) {
                String str3 = ((PollMessageData) messageData).title;
                if (str3 == null) {
                    str3 = messageData.text;
                }
                return new ReplyData(str, str3, j, null, null, null, false, false, false, false, messageData.hiddenByModeration, false, true, str2);
            }
            if (!(messageData instanceof VideoMessageData)) {
                return new ReplyData(str, messageData.text, j, null, null, null, false, false, false, false, messageData.hiddenByModeration, false, false, str2);
            }
            VideoMessageData videoMessageData = (VideoMessageData) messageData;
            return new ReplyData(str, messageData.text, j, videoMessageData.fileId, videoMessageData.fileName, videoMessageData.fileSource, true, false, false, false, messageData.hiddenByModeration, false, false, str2);
        }
    }

    public /* synthetic */ ReplyData(String str, String str2, long j, String str3, String str4, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0L : j, str3, str4, num, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? false : z6, (i & 4096) != 0 ? false : z7, (i & 8192) != 0 ? null : str5);
    }

    public static final ReplyData from(Resources resources, Message[] messageArr, String str) {
        INSTANCE.getClass();
        Message message = messageArr[0];
        return Companion.a(resources, message.h, message.g, message.b, str);
    }

    public final String getAuthorGuid() {
        return this.authorGuid;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Integer getFileSource() {
        return this.fileSource;
    }

    public final String getQuotedText() {
        return this.quotedText;
    }

    public final String getText() {
        return this.text;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: isAnimatedImage, reason: from getter */
    public final boolean getIsAnimatedImage() {
        return this.isAnimatedImage;
    }

    /* renamed from: isGallery, reason: from getter */
    public final boolean getIsGallery() {
        return this.isGallery;
    }

    /* renamed from: isHiddenByModeration, reason: from getter */
    public final boolean getIsHiddenByModeration() {
        return this.isHiddenByModeration;
    }

    /* renamed from: isMedia, reason: from getter */
    public final boolean getIsMedia() {
        return this.isMedia;
    }

    /* renamed from: isPoll, reason: from getter */
    public final boolean getIsPoll() {
        return this.isPoll;
    }

    /* renamed from: isSticker, reason: from getter */
    public final boolean getIsSticker() {
        return this.isSticker;
    }

    /* renamed from: isVoice, reason: from getter */
    public final boolean getIsVoice() {
        return this.isVoice;
    }

    public static final ReplyData from(Resources resources, Message message, String str) {
        INSTANCE.getClass();
        return Companion.a(resources, message.h, message.g, message.b, str);
    }

    public static final ReplyData from(Resources resources, yab yabVar, long j, String str) {
        INSTANCE.getClass();
        return Companion.a(resources, yabVar.R(), yabVar.a(), j, str);
    }

    public ReplyData(String str, String str2, long j, String str3, String str4, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str5) {
        this.authorGuid = str;
        this.text = str2;
        this.timestamp = j;
        this.fileId = str3;
        this.fileName = str4;
        this.fileSource = num;
        this.isMedia = z;
        this.isVoice = z2;
        this.isGallery = z3;
        this.isSticker = z4;
        this.isHiddenByModeration = z5;
        this.isAnimatedImage = z6;
        this.isPoll = z7;
        this.quotedText = str5;
    }
}
