package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "Landroid/os/Parcelable;", "", "lightUrl", "darkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLightUrl", "getDarkUrl", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ThemedImageUrlEntity implements Parcelable {
    public static final Parcelable.Creator<ThemedImageUrlEntity> CREATOR = new Creator();
    private final String darkUrl;
    private final String lightUrl;

    public ThemedImageUrlEntity(String str, String str2) {
        this.lightUrl = str;
        this.darkUrl = str2;
    }

    public static /* synthetic */ ThemedImageUrlEntity copy$default(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themedImageUrlEntity.lightUrl;
        }
        if ((i & 2) != 0) {
            str2 = themedImageUrlEntity.darkUrl;
        }
        return themedImageUrlEntity.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLightUrl() {
        return this.lightUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDarkUrl() {
        return this.darkUrl;
    }

    public final ThemedImageUrlEntity copy(String lightUrl, String darkUrl) {
        return new ThemedImageUrlEntity(lightUrl, darkUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedImageUrlEntity)) {
            return false;
        }
        ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) other;
        return jl40.l(this.lightUrl, themedImageUrlEntity.lightUrl) && jl40.l(this.darkUrl, themedImageUrlEntity.darkUrl);
    }

    public final String getDarkUrl() {
        return this.darkUrl;
    }

    public final String getLightUrl() {
        return this.lightUrl;
    }

    public int hashCode() {
        String str = this.lightUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("ThemedImageUrlEntity(lightUrl=", this.lightUrl, ", darkUrl=", this.darkUrl, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.lightUrl);
        dest.writeString(this.darkUrl);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ThemedImageUrlEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedImageUrlEntity createFromParcel(Parcel parcel) {
            return new ThemedImageUrlEntity(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedImageUrlEntity[] newArray(int i) {
            return new ThemedImageUrlEntity[i];
        }
    }
}
