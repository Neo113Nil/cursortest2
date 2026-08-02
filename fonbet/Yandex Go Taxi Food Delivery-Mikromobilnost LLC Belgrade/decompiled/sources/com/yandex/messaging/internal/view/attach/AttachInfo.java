package com.yandex.messaging.internal.view.attach;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.j63;
import defpackage.unr0;
import java.util.Objects;

/* loaded from: classes15.dex */
public class AttachInfo implements Parcelable {
    private static final j63 ALLOWED_IMAGE_MIME_TYPES;
    public static final Parcelable.Creator<AttachInfo> CREATOR;
    static final String GIF_MIME_TYPE = "image/gif";
    static final String JPEG_MIME_TYPE = "image/jpeg";
    private static final String PNG_MIME_TYPE = "image/png";
    private static final String WEBP_MIME_TYPE = "image/webp";

    @Json(name = "duration")
    public final long durationMs;

    @Json(name = "existingId")
    public final String existingId;

    @Json(name = "filename")
    public final String fileName;

    @Json(name = "forceAsFile")
    public final boolean forceAsFile;

    @Json(name = "height")
    public final int height;

    @Json(name = "mimeType")
    public final String mimeType;

    @Json(name = "originalChatId")
    public final String originalChatId;

    @Json(name = "size")
    public final long size;

    @Json(name = "thumbHash")
    public final byte[] thumbHash;

    @Json(name = LaunchBrowserActivity.KEY_URI)
    public final Uri uri;

    @Json(name = "width")
    public final int width;

    static {
        j63 j63Var = new j63();
        ALLOWED_IMAGE_MIME_TYPES = j63Var;
        j63Var.add(JPEG_MIME_TYPE);
        j63Var.add(PNG_MIME_TYPE);
        j63Var.add(GIF_MIME_TYPE);
        j63Var.add("image/webp");
        CREATOR = new Parcelable.Creator<AttachInfo>() { // from class: com.yandex.messaging.internal.view.attach.AttachInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AttachInfo createFromParcel(Parcel parcel) {
                return new AttachInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public AttachInfo[] newArray(int i) {
                return new AttachInfo[i];
            }
        };
    }

    public AttachInfo(Parcel parcel) {
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.existingId = parcel.readString();
        this.originalChatId = parcel.readString();
        this.fileName = parcel.readString();
        this.size = parcel.readLong();
        this.mimeType = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.forceAsFile = parcel.readByte() != 0;
        this.durationMs = parcel.readLong();
        this.thumbHash = parcel.createByteArray();
    }

    public static boolean isAnimated(String str) {
        return str != null && str.equals(GIF_MIME_TYPE);
    }

    public static boolean isVideo(String str) {
        if (str == null) {
            return false;
        }
        return str.toLowerCase().startsWith("video/");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachInfo attachInfo = (AttachInfo) obj;
        if (this.size != attachInfo.size || !this.uri.equals(attachInfo.uri) || !Objects.equals(this.existingId, attachInfo.existingId) || !Objects.equals(this.originalChatId, attachInfo.originalChatId) || !this.fileName.equals(attachInfo.fileName)) {
            return false;
        }
        String str = this.mimeType;
        String str2 = attachInfo.mimeType;
        return str == null ? str2 == null : str.equals(str2);
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.uri.hashCode() * 31;
        String str = this.originalChatId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.existingId;
        int b = unr0.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.fileName);
        long j = this.size;
        int i = (b + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.mimeType;
        return i + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean isImage() {
        return !this.forceAsFile && isImage(this.mimeType);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.uri, i);
        parcel.writeString(this.existingId);
        parcel.writeString(this.originalChatId);
        parcel.writeString(this.fileName);
        parcel.writeLong(this.size);
        parcel.writeString(this.mimeType);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeByte(this.forceAsFile ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.durationMs);
        parcel.writeByteArray(this.thumbHash);
    }

    public boolean isAnimated() {
        return isAnimated(this.mimeType);
    }

    public boolean isVideo() {
        return isVideo(this.mimeType);
    }

    public static boolean isImage(String str) {
        if (str == null) {
            return false;
        }
        return ALLOWED_IMAGE_MIME_TYPES.contains(str.toLowerCase());
    }

    public AttachInfo(Uri uri, String str, String str2, String str3, long j, String str4, int i, int i2, boolean z) {
        this(uri, str, str2, str3, j, str4, i, i2, z, 0L, null);
    }

    public AttachInfo(Uri uri, String str, String str2, String str3, long j, String str4, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.uri = uri;
        this.existingId = str;
        this.originalChatId = str2;
        this.fileName = str3;
        this.size = j;
        this.mimeType = str4;
        this.width = i;
        this.height = i2;
        this.forceAsFile = z;
        this.durationMs = j2;
        this.thumbHash = bArr;
    }

    public AttachInfo(Uri uri, String str, String str2, String str3, long j, String str4, int i, int i2) {
        this(uri, str, str2, str3, j, str4, i, i2, false, 0L, null);
    }
}
