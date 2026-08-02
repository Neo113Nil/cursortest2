package com.yandex.messaging.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.messaging.internal.LocalMessageRef;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J^\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010!¨\u00066"}, d2 = {"Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "Landroid/os/Parcelable;", "", "fileId", "fileName", "Lcom/yandex/messaging/internal/LocalMessageRef;", "localMessageRef", "chatId", "fileExtension", "", "fileSource", "", "fileSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/internal/LocalMessageRef;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/yandex/messaging/internal/LocalMessageRef;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/messaging/internal/LocalMessageRef;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/yandex/messaging/mediaviewer/MediaViewerInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileId", "getFileName", "Lcom/yandex/messaging/internal/LocalMessageRef;", "getLocalMessageRef", "getChatId", "getFileExtension", "Ljava/lang/Integer;", "getFileSource", "Ljava/lang/Long;", "getFileSize", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MediaViewerInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MediaViewerInfo> CREATOR = new Creator();
    private final String chatId;
    private final String fileExtension;
    private final String fileId;
    private final String fileName;
    private final Long fileSize;
    private final Integer fileSource;
    private final LocalMessageRef localMessageRef;

    public MediaViewerInfo(String str, String str2, LocalMessageRef localMessageRef, String str3, String str4, Integer num, Long l) {
        this.fileId = str;
        this.fileName = str2;
        this.localMessageRef = localMessageRef;
        this.chatId = str3;
        this.fileExtension = str4;
        this.fileSource = num;
        this.fileSize = l;
    }

    public static /* synthetic */ MediaViewerInfo copy$default(MediaViewerInfo mediaViewerInfo, String str, String str2, LocalMessageRef localMessageRef, String str3, String str4, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaViewerInfo.fileId;
        }
        if ((i & 2) != 0) {
            str2 = mediaViewerInfo.fileName;
        }
        if ((i & 4) != 0) {
            localMessageRef = mediaViewerInfo.localMessageRef;
        }
        if ((i & 8) != 0) {
            str3 = mediaViewerInfo.chatId;
        }
        if ((i & 16) != 0) {
            str4 = mediaViewerInfo.fileExtension;
        }
        if ((i & 32) != 0) {
            num = mediaViewerInfo.fileSource;
        }
        if ((i & 64) != 0) {
            l = mediaViewerInfo.fileSize;
        }
        Integer num2 = num;
        Long l2 = l;
        String str5 = str4;
        LocalMessageRef localMessageRef2 = localMessageRef;
        return mediaViewerInfo.copy(str, str2, localMessageRef2, str3, str5, num2, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final LocalMessageRef getLocalMessageRef() {
        return this.localMessageRef;
    }

    /* renamed from: component4, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getFileSource() {
        return this.fileSource;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    public final MediaViewerInfo copy(String fileId, String fileName, LocalMessageRef localMessageRef, String chatId, String fileExtension, Integer fileSource, Long fileSize) {
        return new MediaViewerInfo(fileId, fileName, localMessageRef, chatId, fileExtension, fileSource, fileSize);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaViewerInfo)) {
            return false;
        }
        MediaViewerInfo mediaViewerInfo = (MediaViewerInfo) other;
        return jl40.l(this.fileId, mediaViewerInfo.fileId) && jl40.l(this.fileName, mediaViewerInfo.fileName) && jl40.l(this.localMessageRef, mediaViewerInfo.localMessageRef) && jl40.l(this.chatId, mediaViewerInfo.chatId) && jl40.l(this.fileExtension, mediaViewerInfo.fileExtension) && jl40.l(this.fileSource, mediaViewerInfo.fileSource) && jl40.l(this.fileSize, mediaViewerInfo.fileSize);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final Integer getFileSource() {
        return this.fileSource;
    }

    public final LocalMessageRef getLocalMessageRef() {
        return this.localMessageRef;
    }

    public int hashCode() {
        int b = unr0.b(this.fileId.hashCode() * 31, 31, this.fileName);
        LocalMessageRef localMessageRef = this.localMessageRef;
        int b2 = unr0.b((b + (localMessageRef == null ? 0 : localMessageRef.hashCode())) * 31, 31, this.chatId);
        String str = this.fileExtension;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.fileSource;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.fileSize;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.fileId;
        String str2 = this.fileName;
        LocalMessageRef localMessageRef = this.localMessageRef;
        String str3 = this.chatId;
        String str4 = this.fileExtension;
        Integer num = this.fileSource;
        Long l = this.fileSize;
        StringBuilder v = b64.v("MediaViewerInfo(fileId=", str, ", fileName=", str2, ", localMessageRef=");
        v.append(localMessageRef);
        v.append(", chatId=");
        v.append(str3);
        v.append(", fileExtension=");
        vfc.w(num, str4, ", fileSource=", ", fileSize=", v);
        v.append(l);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fileId);
        dest.writeString(this.fileName);
        LocalMessageRef localMessageRef = this.localMessageRef;
        if (localMessageRef == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localMessageRef.writeToParcel(dest, flags);
        }
        dest.writeString(this.chatId);
        dest.writeString(this.fileExtension);
        Integer num = this.fileSource;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        Long l = this.fileSize;
        if (l == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MediaViewerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaViewerInfo createFromParcel(Parcel parcel) {
            return new MediaViewerInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LocalMessageRef.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaViewerInfo[] newArray(int i) {
            return new MediaViewerInfo[i];
        }
    }
}
