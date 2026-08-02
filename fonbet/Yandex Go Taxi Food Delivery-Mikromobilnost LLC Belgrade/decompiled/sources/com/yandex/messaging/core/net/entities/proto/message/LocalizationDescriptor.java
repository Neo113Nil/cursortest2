package com.yandex.messaging.core.net.entities.proto.message;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u001e¨\u0006("}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;", "Landroid/os/Parcelable;", "", "version", "", "default", "", "langs", "<init>", "(JLjava/lang/String;[Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()[Ljava/lang/String;", "copy", "(JLjava/lang/String;[Ljava/lang/String;)Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationDescriptor;", "toString", "J", "getVersion", "Ljava/lang/String;", "getDefault", "[Ljava/lang/String;", "getLangs", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LocalizationDescriptor implements Parcelable {
    public static final Parcelable.Creator<LocalizationDescriptor> CREATOR = new Creator();

    @xuf0(tag = 2)
    private final String default;

    @xuf0(tag = 3)
    private final String[] langs;

    @xuf0(tag = 1)
    private final long version;

    public LocalizationDescriptor(@Json(name = "Version") long j, @Json(name = "Default") String str, @Json(name = "Langs") String[] strArr) {
        this.version = j;
        this.default = str;
        this.langs = strArr;
    }

    public static /* synthetic */ LocalizationDescriptor copy$default(LocalizationDescriptor localizationDescriptor, long j, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            j = localizationDescriptor.version;
        }
        if ((i & 2) != 0) {
            str = localizationDescriptor.default;
        }
        if ((i & 4) != 0) {
            strArr = localizationDescriptor.langs;
        }
        return localizationDescriptor.copy(j, str, strArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDefault() {
        return this.default;
    }

    /* renamed from: component3, reason: from getter */
    public final String[] getLangs() {
        return this.langs;
    }

    public final LocalizationDescriptor copy(@Json(name = "Version") long version, @Json(name = "Default") String r3, @Json(name = "Langs") String[] langs) {
        return new LocalizationDescriptor(version, r3, langs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LocalizationDescriptor.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        LocalizationDescriptor localizationDescriptor = (LocalizationDescriptor) other;
        return this.version == localizationDescriptor.version && jl40.l(this.default, localizationDescriptor.default) && Arrays.equals(this.langs, localizationDescriptor.langs);
    }

    public final String getDefault() {
        return this.default;
    }

    public final String[] getLangs() {
        return this.langs;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return unr0.b(Long.hashCode(this.version) * 31, 31, this.default) + Arrays.hashCode(this.langs);
    }

    public String toString() {
        long j = this.version;
        String str = this.default;
        return unr0.r(x4e.k("LocalizationDescriptor(version=", j, ", default=", str), ", langs=", Arrays.toString(this.langs), Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.version);
        dest.writeString(this.default);
        dest.writeStringArray(this.langs);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalizationDescriptor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizationDescriptor createFromParcel(Parcel parcel) {
            return new LocalizationDescriptor(parcel.readLong(), parcel.readString(), parcel.createStringArray());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizationDescriptor[] newArray(int i) {
            return new LocalizationDescriptor[i];
        }
    }
}
