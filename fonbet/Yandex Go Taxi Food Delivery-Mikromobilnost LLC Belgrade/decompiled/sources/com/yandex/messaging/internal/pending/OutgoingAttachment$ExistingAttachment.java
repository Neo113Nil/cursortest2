package com.yandex.messaging.internal.pending;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw80;
import defpackage.x4e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJz\u0010!\u001a\u00020 2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b4\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b5\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f¨\u00068"}, d2 = {"com/yandex/messaging/internal/pending/OutgoingAttachment$ExistingAttachment", "Luw80;", "", "originalChatId", "existingId", "fileName", "", "fileSize", LaunchBrowserActivity.KEY_URI, "mimeType", "", "width", "height", "durationMs", "", "thumbHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIJ[B)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "component6", "component7", "()I", "component8", "component9", "component10", "()[B", "Lcom/yandex/messaging/internal/pending/OutgoingAttachment$ExistingAttachment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IIJ[B)Lcom/yandex/messaging/internal/pending/OutgoingAttachment$ExistingAttachment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOriginalChatId", "getExistingId", "getFileName", "J", "getFileSize", "getUri", "getMimeType", CA20Status.STATUS_USER_I, "getWidth", "getHeight", "getDurationMs", "[B", "getThumbHash", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OutgoingAttachment$ExistingAttachment implements uw80 {
    private final long durationMs;
    private final String existingId;
    private final String fileName;
    private final long fileSize;
    private final int height;
    private final String mimeType;
    private final String originalChatId;
    private final byte[] thumbHash;
    private final String uri;
    private final int width;

    public /* synthetic */ OutgoingAttachment$ExistingAttachment(String str, String str2, String str3, long j, String str4, String str5, int i, int i2, long j2, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, str5, i, i2, (i3 & 256) != 0 ? 0L : j2, (i3 & 512) != 0 ? null : bArr);
    }

    public static /* synthetic */ OutgoingAttachment$ExistingAttachment copy$default(OutgoingAttachment$ExistingAttachment outgoingAttachment$ExistingAttachment, String str, String str2, String str3, long j, String str4, String str5, int i, int i2, long j2, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = outgoingAttachment$ExistingAttachment.originalChatId;
        }
        if ((i3 & 2) != 0) {
            str2 = outgoingAttachment$ExistingAttachment.existingId;
        }
        if ((i3 & 4) != 0) {
            str3 = outgoingAttachment$ExistingAttachment.fileName;
        }
        if ((i3 & 8) != 0) {
            j = outgoingAttachment$ExistingAttachment.fileSize;
        }
        if ((i3 & 16) != 0) {
            str4 = outgoingAttachment$ExistingAttachment.uri;
        }
        if ((i3 & 32) != 0) {
            str5 = outgoingAttachment$ExistingAttachment.mimeType;
        }
        if ((i3 & 64) != 0) {
            i = outgoingAttachment$ExistingAttachment.width;
        }
        if ((i3 & 128) != 0) {
            i2 = outgoingAttachment$ExistingAttachment.height;
        }
        if ((i3 & 256) != 0) {
            j2 = outgoingAttachment$ExistingAttachment.durationMs;
        }
        if ((i3 & 512) != 0) {
            bArr = outgoingAttachment$ExistingAttachment.thumbHash;
        }
        byte[] bArr2 = bArr;
        long j3 = j2;
        long j4 = j;
        String str6 = str3;
        return outgoingAttachment$ExistingAttachment.copy(str, str2, str6, j4, str4, str5, i, i2, j3, bArr2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOriginalChatId() {
        return this.originalChatId;
    }

    /* renamed from: component10, reason: from getter */
    public final byte[] getThumbHash() {
        return this.thumbHash;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExistingId() {
        return this.existingId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component7, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component8, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component9, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    public final OutgoingAttachment$ExistingAttachment copy(@Json(name = "orig_chat_id") String originalChatId, @Json(name = "existing_id") String existingId, @Json(name = "name") String fileName, @Json(name = "size") long fileSize, @Json(name = "uri") String uri, @Json(name = "mime_type") String mimeType, @Json(name = "width") int width, @Json(name = "height") int height, @Json(name = "duration") long durationMs, @Json(name = "thumb_hash") byte[] thumbHash) {
        return new OutgoingAttachment$ExistingAttachment(originalChatId, existingId, fileName, fileSize, uri, mimeType, width, height, durationMs, thumbHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutgoingAttachment$ExistingAttachment)) {
            return false;
        }
        OutgoingAttachment$ExistingAttachment outgoingAttachment$ExistingAttachment = (OutgoingAttachment$ExistingAttachment) other;
        return jl40.l(this.originalChatId, outgoingAttachment$ExistingAttachment.originalChatId) && jl40.l(this.existingId, outgoingAttachment$ExistingAttachment.existingId) && jl40.l(this.fileName, outgoingAttachment$ExistingAttachment.fileName) && this.fileSize == outgoingAttachment$ExistingAttachment.fileSize && jl40.l(this.uri, outgoingAttachment$ExistingAttachment.uri) && jl40.l(this.mimeType, outgoingAttachment$ExistingAttachment.mimeType) && this.width == outgoingAttachment$ExistingAttachment.width && this.height == outgoingAttachment$ExistingAttachment.height && this.durationMs == outgoingAttachment$ExistingAttachment.durationMs && jl40.l(this.thumbHash, outgoingAttachment$ExistingAttachment.thumbHash);
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final String getExistingId() {
        return this.existingId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getOriginalChatId() {
        return this.originalChatId;
    }

    public final byte[] getThumbHash() {
        return this.thumbHash;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int c = qv10.c(unr0.b(unr0.b(this.originalChatId.hashCode() * 31, 31, this.existingId), 31, this.fileName), 31, this.fileSize);
        String str = this.uri;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int c2 = qv10.c(oyr.b(this.height, oyr.b(this.width, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.durationMs);
        byte[] bArr = this.thumbHash;
        return c2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        String str = this.originalChatId;
        String str2 = this.existingId;
        String str3 = this.fileName;
        long j = this.fileSize;
        String str4 = this.uri;
        String str5 = this.mimeType;
        int i = this.width;
        int i2 = this.height;
        long j2 = this.durationMs;
        String arrays = Arrays.toString(this.thumbHash);
        StringBuilder v = b64.v("ExistingAttachment(originalChatId=", str, ", existingId=", str2, ", fileName=");
        ly3.y(j, str3, ", fileSize=", v);
        g8e.D(v, ", uri=", str4, ", mimeType=", str5);
        v.append(", width=");
        v.append(i);
        v.append(", height=");
        v.append(i2);
        x4e.A(j2, ", durationMs=", ", thumbHash=", v);
        return oyr.t(v, arrays, Extension.C_BRAKE);
    }

    public OutgoingAttachment$ExistingAttachment(@Json(name = "orig_chat_id") String str, @Json(name = "existing_id") String str2, @Json(name = "name") String str3, @Json(name = "size") long j, @Json(name = "uri") String str4, @Json(name = "mime_type") String str5, @Json(name = "width") int i, @Json(name = "height") int i2, @Json(name = "duration") long j2, @Json(name = "thumb_hash") byte[] bArr) {
        this.originalChatId = str;
        this.existingId = str2;
        this.fileName = str3;
        this.fileSize = j;
        this.uri = str4;
        this.mimeType = str5;
        this.width = i;
        this.height = i2;
        this.durationMs = j2;
        this.thumbHash = bArr;
    }
}
