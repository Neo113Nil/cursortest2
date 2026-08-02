package com.yandex.messaging.ui.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b#\u0010$J`\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u001a\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0018R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b\u000e\u0010$¨\u0006:"}, d2 = {"com/yandex/messaging/ui/sharing/SharingData$SharingImageData", "Landroid/os/Parcelable;", "", "origChatId", "existingFileId", "name", "", "size", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "width", "height", "", "isAnimated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/net/Uri;IIZ)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "()Landroid/net/Uri;", "component6", "component7", "component8", "()Z", "Lcom/yandex/messaging/ui/sharing/SharingData$SharingImageData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/net/Uri;IIZ)Lcom/yandex/messaging/ui/sharing/SharingData$SharingImageData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrigChatId", "getExistingFileId", "getName", "J", "getSize", "Landroid/net/Uri;", "getUri", CA20Status.STATUS_USER_I, "getWidth", "getHeight", "Z", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SharingData$SharingImageData implements Parcelable {
    public static final Parcelable.Creator<SharingData$SharingImageData> CREATOR = new Creator();
    private final String existingFileId;
    private final int height;
    private final boolean isAnimated;
    private final String name;
    private final String origChatId;
    private final long size;
    private final Uri uri;
    private final int width;

    public SharingData$SharingImageData(String str, String str2, String str3, long j, Uri uri, int i, int i2, boolean z) {
        this.origChatId = str;
        this.existingFileId = str2;
        this.name = str3;
        this.size = j;
        this.uri = uri;
        this.width = i;
        this.height = i2;
        this.isAnimated = z;
    }

    public static /* synthetic */ SharingData$SharingImageData copy$default(SharingData$SharingImageData sharingData$SharingImageData, String str, String str2, String str3, long j, Uri uri, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sharingData$SharingImageData.origChatId;
        }
        if ((i3 & 2) != 0) {
            str2 = sharingData$SharingImageData.existingFileId;
        }
        if ((i3 & 4) != 0) {
            str3 = sharingData$SharingImageData.name;
        }
        if ((i3 & 8) != 0) {
            j = sharingData$SharingImageData.size;
        }
        if ((i3 & 16) != 0) {
            uri = sharingData$SharingImageData.uri;
        }
        if ((i3 & 32) != 0) {
            i = sharingData$SharingImageData.width;
        }
        if ((i3 & 64) != 0) {
            i2 = sharingData$SharingImageData.height;
        }
        if ((i3 & 128) != 0) {
            z = sharingData$SharingImageData.isAnimated;
        }
        long j2 = j;
        String str4 = str3;
        return sharingData$SharingImageData.copy(str, str2, str4, j2, uri, i, i2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrigChatId() {
        return this.origChatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExistingFileId() {
        return this.existingFileId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: component5, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component6, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAnimated() {
        return this.isAnimated;
    }

    public final SharingData$SharingImageData copy(String origChatId, String existingFileId, String name, long size, Uri uri, int width, int height, boolean isAnimated) {
        return new SharingData$SharingImageData(origChatId, existingFileId, name, size, uri, width, height, isAnimated);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharingData$SharingImageData)) {
            return false;
        }
        SharingData$SharingImageData sharingData$SharingImageData = (SharingData$SharingImageData) other;
        return jl40.l(this.origChatId, sharingData$SharingImageData.origChatId) && jl40.l(this.existingFileId, sharingData$SharingImageData.existingFileId) && jl40.l(this.name, sharingData$SharingImageData.name) && this.size == sharingData$SharingImageData.size && jl40.l(this.uri, sharingData$SharingImageData.uri) && this.width == sharingData$SharingImageData.width && this.height == sharingData$SharingImageData.height && this.isAnimated == sharingData$SharingImageData.isAnimated;
    }

    public final String getExistingFileId() {
        return this.existingFileId;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrigChatId() {
        return this.origChatId;
    }

    public final long getSize() {
        return this.size;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAnimated) + oyr.b(this.height, oyr.b(this.width, (this.uri.hashCode() + qv10.c(unr0.b(unr0.b(this.origChatId.hashCode() * 31, 31, this.existingFileId), 31, this.name), 31, this.size)) * 31, 31), 31);
    }

    public final boolean isAnimated() {
        return this.isAnimated;
    }

    public String toString() {
        String str = this.origChatId;
        String str2 = this.existingFileId;
        String str3 = this.name;
        long j = this.size;
        Uri uri = this.uri;
        int i = this.width;
        int i2 = this.height;
        boolean z = this.isAnimated;
        StringBuilder v = b64.v("SharingImageData(origChatId=", str, ", existingFileId=", str2, ", name=");
        ly3.y(j, str3, ", size=", v);
        v.append(", uri=");
        v.append(uri);
        v.append(", width=");
        v.append(i);
        v.append(", height=");
        v.append(i2);
        v.append(", isAnimated=");
        v.append(z);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.origChatId);
        dest.writeString(this.existingFileId);
        dest.writeString(this.name);
        dest.writeLong(this.size);
        dest.writeParcelable(this.uri, flags);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeInt(this.isAnimated ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SharingData$SharingImageData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharingData$SharingImageData createFromParcel(Parcel parcel) {
            return new SharingData$SharingImageData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), (Uri) parcel.readParcelable(SharingData$SharingImageData.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharingData$SharingImageData[] newArray(int i) {
            return new SharingData$SharingImageData[i];
        }
    }
}
