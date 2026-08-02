package com.yandex.messaging.ui.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"com/yandex/messaging/ui/sharing/SharingData$SharingFileData", "Landroid/os/Parcelable;", "", "origChatId", "existingFileId", "name", "", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "Lcom/yandex/messaging/ui/sharing/SharingData$SharingFileData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/yandex/messaging/ui/sharing/SharingData$SharingFileData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrigChatId", "getExistingFileId", "getName", "J", "getSize", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SharingData$SharingFileData implements Parcelable {
    public static final Parcelable.Creator<SharingData$SharingFileData> CREATOR = new Creator();
    private final String existingFileId;
    private final String name;
    private final String origChatId;
    private final long size;

    public SharingData$SharingFileData(String str, String str2, String str3, long j) {
        this.origChatId = str;
        this.existingFileId = str2;
        this.name = str3;
        this.size = j;
    }

    public static /* synthetic */ SharingData$SharingFileData copy$default(SharingData$SharingFileData sharingData$SharingFileData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharingData$SharingFileData.origChatId;
        }
        if ((i & 2) != 0) {
            str2 = sharingData$SharingFileData.existingFileId;
        }
        if ((i & 4) != 0) {
            str3 = sharingData$SharingFileData.name;
        }
        if ((i & 8) != 0) {
            j = sharingData$SharingFileData.size;
        }
        String str4 = str3;
        return sharingData$SharingFileData.copy(str, str2, str4, j);
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

    public final SharingData$SharingFileData copy(String origChatId, String existingFileId, String name, long size) {
        return new SharingData$SharingFileData(origChatId, existingFileId, name, size);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharingData$SharingFileData)) {
            return false;
        }
        SharingData$SharingFileData sharingData$SharingFileData = (SharingData$SharingFileData) other;
        return jl40.l(this.origChatId, sharingData$SharingFileData.origChatId) && jl40.l(this.existingFileId, sharingData$SharingFileData.existingFileId) && jl40.l(this.name, sharingData$SharingFileData.name) && this.size == sharingData$SharingFileData.size;
    }

    public final String getExistingFileId() {
        return this.existingFileId;
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

    public int hashCode() {
        return Long.hashCode(this.size) + unr0.b(unr0.b(this.origChatId.hashCode() * 31, 31, this.existingFileId), 31, this.name);
    }

    public String toString() {
        String str = this.origChatId;
        String str2 = this.existingFileId;
        String str3 = this.name;
        long j = this.size;
        StringBuilder v = b64.v("SharingFileData(origChatId=", str, ", existingFileId=", str2, ", name=");
        ly3.y(j, str3, ", size=", v);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.origChatId);
        dest.writeString(this.existingFileId);
        dest.writeString(this.name);
        dest.writeLong(this.size);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SharingData$SharingFileData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharingData$SharingFileData createFromParcel(Parcel parcel) {
            return new SharingData$SharingFileData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharingData$SharingFileData[] newArray(int i) {
            return new SharingData$SharingFileData[i];
        }
    }
}
