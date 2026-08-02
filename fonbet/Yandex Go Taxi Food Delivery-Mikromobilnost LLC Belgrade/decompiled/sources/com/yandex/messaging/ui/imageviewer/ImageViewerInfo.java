package com.yandex.messaging.ui.imageviewer;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.ImageMessageData;
import defpackage.b64;
import defpackage.jl40;
import defpackage.lhv;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0001FBq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0088\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001fJ\u0010\u0010/\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b/\u0010\u001bJ\u001a\u00102\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b;\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bB\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bC\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bD\u0010\u001f¨\u0006G"}, d2 = {"Lcom/yandex/messaging/ui/imageviewer/ImageViewerInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/messaging/internal/LocalMessageRef;", "localMessageRef", "", "url", "name", "", "width", "height", "", "animated", "", "size", "fileSource", "thumbWidth", "thumbHeight", "fileId", "<init>", "(Lcom/yandex/messaging/internal/LocalMessageRef;Ljava/lang/String;Ljava/lang/String;IIZJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/messaging/internal/LocalMessageRef;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Z", "component7", "()J", "component8", "()Ljava/lang/Integer;", "component9", "component10", "component11", "copy", "(Lcom/yandex/messaging/internal/LocalMessageRef;Ljava/lang/String;Ljava/lang/String;IIZJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/yandex/messaging/ui/imageviewer/ImageViewerInfo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/messaging/internal/LocalMessageRef;", "getLocalMessageRef", "Ljava/lang/String;", "getUrl", "getName", CA20Status.STATUS_USER_I, "getWidth", "getHeight", "Z", "getAnimated", "J", "getSize", "Ljava/lang/Integer;", "getFileSource", "getThumbWidth", "getThumbHeight", "getFileId", "Companion", "lhv", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ImageViewerInfo implements Parcelable {
    public static final int $stable = 0;
    private final boolean animated;
    private final String fileId;
    private final Integer fileSource;
    private final int height;
    private final LocalMessageRef localMessageRef;
    private final String name;
    private final long size;
    private final Integer thumbHeight;
    private final Integer thumbWidth;
    private final String url;
    private final int width;
    public static final lhv Companion = new lhv();
    public static final Parcelable.Creator<ImageViewerInfo> CREATOR = new Creator();

    public ImageViewerInfo(LocalMessageRef localMessageRef, String str, String str2, int i, int i2, boolean z, long j, Integer num, Integer num2, Integer num3, String str3) {
        this.localMessageRef = localMessageRef;
        this.url = str;
        this.name = str2;
        this.width = i;
        this.height = i2;
        this.animated = z;
        this.size = j;
        this.fileSource = num;
        this.thumbWidth = num2;
        this.thumbHeight = num3;
        this.fileId = str3;
    }

    public static /* synthetic */ ImageViewerInfo copy$default(ImageViewerInfo imageViewerInfo, LocalMessageRef localMessageRef, String str, String str2, int i, int i2, boolean z, long j, Integer num, Integer num2, Integer num3, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            localMessageRef = imageViewerInfo.localMessageRef;
        }
        if ((i3 & 2) != 0) {
            str = imageViewerInfo.url;
        }
        if ((i3 & 4) != 0) {
            str2 = imageViewerInfo.name;
        }
        if ((i3 & 8) != 0) {
            i = imageViewerInfo.width;
        }
        if ((i3 & 16) != 0) {
            i2 = imageViewerInfo.height;
        }
        if ((i3 & 32) != 0) {
            z = imageViewerInfo.animated;
        }
        if ((i3 & 64) != 0) {
            j = imageViewerInfo.size;
        }
        if ((i3 & 128) != 0) {
            num = imageViewerInfo.fileSource;
        }
        if ((i3 & 256) != 0) {
            num2 = imageViewerInfo.thumbWidth;
        }
        if ((i3 & 512) != 0) {
            num3 = imageViewerInfo.thumbHeight;
        }
        if ((i3 & 1024) != 0) {
            str3 = imageViewerInfo.fileId;
        }
        long j2 = j;
        int i4 = i2;
        boolean z2 = z;
        String str4 = str2;
        int i5 = i;
        return imageViewerInfo.copy(localMessageRef, str, str4, i5, i4, z2, j2, num, num2, num3, str3);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, String str3) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, num, num2, str2, num3, num4, num5, str3, 1024);
    }

    /* renamed from: component1, reason: from getter */
    public final LocalMessageRef getLocalMessageRef() {
        return this.localMessageRef;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getThumbHeight() {
        return this.thumbHeight;
    }

    /* renamed from: component11, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAnimated() {
        return this.animated;
    }

    /* renamed from: component7, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getFileSource() {
        return this.fileSource;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getThumbWidth() {
        return this.thumbWidth;
    }

    public final ImageViewerInfo copy(LocalMessageRef localMessageRef, String url, String name, int width, int height, boolean animated, long size, Integer fileSource, Integer thumbWidth, Integer thumbHeight, String fileId) {
        return new ImageViewerInfo(localMessageRef, url, name, width, height, animated, size, fileSource, thumbWidth, thumbHeight, fileId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageViewerInfo)) {
            return false;
        }
        ImageViewerInfo imageViewerInfo = (ImageViewerInfo) other;
        return jl40.l(this.localMessageRef, imageViewerInfo.localMessageRef) && jl40.l(this.url, imageViewerInfo.url) && jl40.l(this.name, imageViewerInfo.name) && this.width == imageViewerInfo.width && this.height == imageViewerInfo.height && this.animated == imageViewerInfo.animated && this.size == imageViewerInfo.size && jl40.l(this.fileSource, imageViewerInfo.fileSource) && jl40.l(this.thumbWidth, imageViewerInfo.thumbWidth) && jl40.l(this.thumbHeight, imageViewerInfo.thumbHeight) && jl40.l(this.fileId, imageViewerInfo.fileId);
    }

    public final boolean getAnimated() {
        return this.animated;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final Integer getFileSource() {
        return this.fileSource;
    }

    public final int getHeight() {
        return this.height;
    }

    public final LocalMessageRef getLocalMessageRef() {
        return this.localMessageRef;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSize() {
        return this.size;
    }

    public final Integer getThumbHeight() {
        return this.thumbHeight;
    }

    public final Integer getThumbWidth() {
        return this.thumbWidth;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        LocalMessageRef localMessageRef = this.localMessageRef;
        int c = qv10.c(unr0.e(oyr.b(this.height, oyr.b(this.width, unr0.b(unr0.b((localMessageRef == null ? 0 : localMessageRef.hashCode()) * 31, 31, this.url), 31, this.name), 31), 31), 31, this.animated), 31, this.size);
        Integer num = this.fileSource;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.thumbWidth;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.thumbHeight;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.fileId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        LocalMessageRef localMessageRef = this.localMessageRef;
        String str = this.url;
        String str2 = this.name;
        int i = this.width;
        int i2 = this.height;
        boolean z = this.animated;
        long j = this.size;
        Integer num = this.fileSource;
        Integer num2 = this.thumbWidth;
        Integer num3 = this.thumbHeight;
        String str3 = this.fileId;
        StringBuilder sb = new StringBuilder("ImageViewerInfo(localMessageRef=");
        sb.append(localMessageRef);
        sb.append(", url=");
        sb.append(str);
        sb.append(", name=");
        b64.A(i, str2, ", width=", ", height=", sb);
        tse0.z(sb, i2, ", animated=", z, ", size=");
        sb.append(j);
        sb.append(", fileSource=");
        sb.append(num);
        sb.append(", thumbWidth=");
        sb.append(num2);
        sb.append(", thumbHeight=");
        sb.append(num3);
        return unr0.r(sb, ", fileId=", str3, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        LocalMessageRef localMessageRef = this.localMessageRef;
        if (localMessageRef == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localMessageRef.writeToParcel(dest, flags);
        }
        dest.writeString(this.url);
        dest.writeString(this.name);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeInt(this.animated ? 1 : 0);
        dest.writeLong(this.size);
        Integer num = this.fileSource;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        Integer num2 = this.thumbWidth;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num2);
        }
        Integer num3 = this.thumbHeight;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num3);
        }
        dest.writeString(this.fileId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageViewerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageViewerInfo createFromParcel(Parcel parcel) {
            return new ImageViewerInfo(parcel.readInt() == 0 ? null : LocalMessageRef.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageViewerInfo[] newArray(int i) {
            return new ImageViewerInfo[i];
        }
    }

    public /* synthetic */ ImageViewerInfo(LocalMessageRef localMessageRef, String str, String str2, int i, int i2, boolean z, long j, Integer num, Integer num2, Integer num3, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(localMessageRef, str, str2, i, i2, z, j, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : num3, (i3 & 1024) != 0 ? null : str3);
    }

    public static final ImageViewerInfo create(LocalMessageRef localMessageRef, ImageMessageData imageMessageData, Integer num, Integer num2) {
        Companion.getClass();
        return lhv.b(localMessageRef, imageMessageData, num, num2);
    }

    public static final ImageViewerInfo create(String str, boolean z) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, null, null, null, null, null, null, null, null, 2044);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, null, null, null, null, null, null, null, 2040);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, num, null, null, null, null, null, null, 2032);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, num, num2, null, null, null, null, null, 2016);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, num, num2, str2, null, null, null, null, 1984);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2, Integer num3) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, num, num2, str2, num3, null, null, null, 1920);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2, Integer num3, Integer num4) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, num, num2, str2, num3, num4, null, null, 1792);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5) {
        lhv lhvVar = Companion;
        lhvVar.getClass();
        return lhv.d(lhvVar, str, z, localMessageRef, num, num2, str2, num3, num4, num5, null, HProv.ALG_TYPE_BLOCK);
    }

    public static final ImageViewerInfo create(LocalMessageRef localMessageRef, PlainMessage.Image image, Integer num, Integer num2) {
        Companion.getClass();
        return lhv.a(localMessageRef, image, num, num2);
    }

    public static final ImageViewerInfo create(String str, boolean z, LocalMessageRef localMessageRef, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, String str3, long j) {
        Companion.getClass();
        return lhv.c(str, z, localMessageRef, num, num2, str2, num3, num4, num5, str3, j);
    }
}
