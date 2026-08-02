package com.ybsdk.api.pro.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.si;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006!"}, d2 = {"Lcom/ybsdk/api/pro/entities/YBProSdkAccessor;", "Landroid/os/Parcelable;", "Lcom/ybsdk/api/pro/entities/YBProSdkAccessorId;", "id", "<init>", "(Lcom/ybsdk/api/pro/entities/YBProSdkAccessorId;)V", "Lsi;", "entity", "(Lsi;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/pro/entities/YBProSdkAccessorId;", "copy", "(Lcom/ybsdk/api/pro/entities/YBProSdkAccessorId;)Lcom/ybsdk/api/pro/entities/YBProSdkAccessor;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/pro/entities/YBProSdkAccessorId;", "getId", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBProSdkAccessor implements Parcelable {
    public static final Parcelable.Creator<YBProSdkAccessor> CREATOR = new Creator();
    private final YBProSdkAccessorId id;

    public YBProSdkAccessor(si siVar) {
        this(new YBProSdkAccessorId(siVar.a));
    }

    public static /* synthetic */ YBProSdkAccessor copy$default(YBProSdkAccessor yBProSdkAccessor, YBProSdkAccessorId yBProSdkAccessorId, int i, Object obj) {
        if ((i & 1) != 0) {
            yBProSdkAccessorId = yBProSdkAccessor.id;
        }
        return yBProSdkAccessor.copy(yBProSdkAccessorId);
    }

    /* renamed from: component1, reason: from getter */
    public final YBProSdkAccessorId getId() {
        return this.id;
    }

    public final YBProSdkAccessor copy(YBProSdkAccessorId id) {
        return new YBProSdkAccessor(id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YBProSdkAccessor) && jl40.l(this.id, ((YBProSdkAccessor) other).id);
    }

    public final YBProSdkAccessorId getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return "YBProSdkAccessor(id=" + this.id + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.id.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBProSdkAccessor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBProSdkAccessor createFromParcel(Parcel parcel) {
            return new YBProSdkAccessor(YBProSdkAccessorId.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBProSdkAccessor[] newArray(int i) {
            return new YBProSdkAccessor[i];
        }
    }

    public YBProSdkAccessor(YBProSdkAccessorId yBProSdkAccessorId) {
        this.id = yBProSdkAccessorId;
    }
}
