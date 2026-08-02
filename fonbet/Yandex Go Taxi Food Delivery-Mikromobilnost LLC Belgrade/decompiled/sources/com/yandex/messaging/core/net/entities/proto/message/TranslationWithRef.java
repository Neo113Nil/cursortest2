package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.x4e;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/TranslationWithRef;", "", "chatId", "", ClidProvider.TIMESTAMP, "", "version", "translation", "Lcom/yandex/messaging/core/net/entities/proto/message/Translation;", "<init>", "(Ljava/lang/String;JJLcom/yandex/messaging/core/net/entities/proto/message/Translation;)V", "getChatId", "()Ljava/lang/String;", "getTimestamp", "()J", "getVersion", "getTranslation", "()Lcom/yandex/messaging/core/net/entities/proto/message/Translation;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TranslationWithRef {

    @xuf0(tag = 1)
    private final String chatId;

    @xuf0(tag = 2)
    private final long timestamp;

    @xuf0(tag = 4)
    private final Translation translation;

    @xuf0(tag = 3)
    private final long version;

    public TranslationWithRef(@Json(name = "ChatId") String str, @Json(name = "Timestamp") long j, @Json(name = "Version") long j2, @Json(name = "Translation") Translation translation) {
        this.chatId = str;
        this.timestamp = j;
        this.version = j2;
        this.translation = translation;
    }

    public static /* synthetic */ TranslationWithRef copy$default(TranslationWithRef translationWithRef, String str, long j, long j2, Translation translation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = translationWithRef.chatId;
        }
        if ((i & 2) != 0) {
            j = translationWithRef.timestamp;
        }
        if ((i & 4) != 0) {
            j2 = translationWithRef.version;
        }
        if ((i & 8) != 0) {
            translation = translationWithRef.translation;
        }
        Translation translation2 = translation;
        return translationWithRef.copy(str, j, j2, translation2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final Translation getTranslation() {
        return this.translation;
    }

    public final TranslationWithRef copy(@Json(name = "ChatId") String chatId, @Json(name = "Timestamp") long timestamp, @Json(name = "Version") long version, @Json(name = "Translation") Translation translation) {
        return new TranslationWithRef(chatId, timestamp, version, translation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslationWithRef)) {
            return false;
        }
        TranslationWithRef translationWithRef = (TranslationWithRef) other;
        return jl40.l(this.chatId, translationWithRef.chatId) && this.timestamp == translationWithRef.timestamp && this.version == translationWithRef.version && jl40.l(this.translation, translationWithRef.translation);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final Translation getTranslation() {
        return this.translation;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        int c = qv10.c(qv10.c(this.chatId.hashCode() * 31, 31, this.timestamp), 31, this.version);
        Translation translation = this.translation;
        return c + (translation == null ? 0 : translation.hashCode());
    }

    public String toString() {
        String str = this.chatId;
        long j = this.timestamp;
        long j2 = this.version;
        Translation translation = this.translation;
        StringBuilder l = x4e.l("TranslationWithRef(chatId=", str, ", timestamp=", j);
        x4e.A(j2, ", version=", ", translation=", l);
        l.append(translation);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
