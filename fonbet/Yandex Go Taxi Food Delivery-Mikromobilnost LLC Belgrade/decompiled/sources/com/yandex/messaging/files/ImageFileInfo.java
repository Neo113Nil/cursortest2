package com.yandex.messaging.files;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.u9v;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b-\u0010\u001aR\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/yandex/messaging/files/ImageFileInfo;", "Landroid/os/Parcelable;", "", "byteSize", "Lkotlin/Pair;", "", "pixelSize", "", "url", "mimeType", "filename", "<init>", "(JLkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()J", "component2", "()Lkotlin/Pair;", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(JLkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/messaging/files/ImageFileInfo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getByteSize", "Lkotlin/Pair;", "getPixelSize", "Ljava/lang/String;", "getUrl", "getMimeType", "getFilename", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Companion", "u9v", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ImageFileInfo implements Parcelable {
    private final long byteSize;
    private final String filename;
    private final String mimeType;
    private final Pair<Integer, Integer> pixelSize;
    private final String url;
    public static final u9v Companion = new u9v();
    public static final Parcelable.Creator<ImageFileInfo> CREATOR = new Creator();

    public /* synthetic */ ImageFileInfo(long j, Pair pair, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, pair, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? "" : str3);
    }

    public static /* synthetic */ ImageFileInfo copy$default(ImageFileInfo imageFileInfo, long j, Pair pair, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = imageFileInfo.byteSize;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            pair = imageFileInfo.pixelSize;
        }
        Pair pair2 = pair;
        if ((i & 4) != 0) {
            str = imageFileInfo.url;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = imageFileInfo.mimeType;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = imageFileInfo.filename;
        }
        return imageFileInfo.copy(j2, pair2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getByteSize() {
        return this.byteSize;
    }

    public final Pair<Integer, Integer> component2() {
        return this.pixelSize;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    public final ImageFileInfo copy(long byteSize, Pair<Integer, Integer> pixelSize, String url, String mimeType, String filename) {
        return new ImageFileInfo(byteSize, pixelSize, url, mimeType, filename);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageFileInfo)) {
            return false;
        }
        ImageFileInfo imageFileInfo = (ImageFileInfo) other;
        return this.byteSize == imageFileInfo.byteSize && jl40.l(this.pixelSize, imageFileInfo.pixelSize) && jl40.l(this.url, imageFileInfo.url) && jl40.l(this.mimeType, imageFileInfo.mimeType) && jl40.l(this.filename, imageFileInfo.filename);
    }

    public final long getByteSize() {
        return this.byteSize;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Pair<Integer, Integer> getPixelSize() {
        return this.pixelSize;
    }

    public final Uri getUri() {
        return Uri.parse(this.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int b = unr0.b((this.pixelSize.hashCode() + (Long.hashCode(this.byteSize) * 31)) * 31, 31, this.url);
        String str = this.mimeType;
        return this.filename.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        long j = this.byteSize;
        Pair<Integer, Integer> pair = this.pixelSize;
        String str = this.url;
        String str2 = this.mimeType;
        String str3 = this.filename;
        StringBuilder sb = new StringBuilder("ImageFileInfo(byteSize=");
        sb.append(j);
        sb.append(", pixelSize=");
        sb.append(pair);
        g8e.D(sb, ", url=", str, ", mimeType=", str2);
        return unr0.r(sb, ", filename=", str3, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.byteSize);
        dest.writeSerializable(this.pixelSize);
        dest.writeString(this.url);
        dest.writeString(this.mimeType);
        dest.writeString(this.filename);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageFileInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageFileInfo createFromParcel(Parcel parcel) {
            return new ImageFileInfo(parcel.readLong(), (Pair) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageFileInfo[] newArray(int i) {
            return new ImageFileInfo[i];
        }
    }

    public ImageFileInfo(long j, Pair<Integer, Integer> pair, String str, String str2, String str3) {
        this.byteSize = j;
        this.pixelSize = pair;
        this.url = str;
        this.mimeType = str2;
        this.filename = str3;
    }
}
