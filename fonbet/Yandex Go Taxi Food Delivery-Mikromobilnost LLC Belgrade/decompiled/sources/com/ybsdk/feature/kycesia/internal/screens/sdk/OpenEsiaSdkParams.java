package com.ybsdk.feature.kycesia.internal.screens.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.kycesia.api.EsiaInfoEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/kycesia/internal/screens/sdk/OpenEsiaSdkParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;", "info", "<init>", "(Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;", "copy", "(Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;)Lcom/ybsdk/feature/kycesia/internal/screens/sdk/OpenEsiaSdkParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/kycesia/api/EsiaInfoEntity;", "getInfo", "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenEsiaSdkParams implements ScreenParams {
    public static final Parcelable.Creator<OpenEsiaSdkParams> CREATOR = new Creator();
    private final EsiaInfoEntity info;

    public OpenEsiaSdkParams(EsiaInfoEntity esiaInfoEntity) {
        this.info = esiaInfoEntity;
    }

    public static /* synthetic */ OpenEsiaSdkParams copy$default(OpenEsiaSdkParams openEsiaSdkParams, EsiaInfoEntity esiaInfoEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            esiaInfoEntity = openEsiaSdkParams.info;
        }
        return openEsiaSdkParams.copy(esiaInfoEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final EsiaInfoEntity getInfo() {
        return this.info;
    }

    public final OpenEsiaSdkParams copy(EsiaInfoEntity info) {
        return new OpenEsiaSdkParams(info);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenEsiaSdkParams) && jl40.l(this.info, ((OpenEsiaSdkParams) other).info);
    }

    public final EsiaInfoEntity getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.info.hashCode();
    }

    public String toString() {
        return "OpenEsiaSdkParams(info=" + this.info + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.info, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenEsiaSdkParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenEsiaSdkParams createFromParcel(Parcel parcel) {
            return new OpenEsiaSdkParams((EsiaInfoEntity) parcel.readParcelable(OpenEsiaSdkParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenEsiaSdkParams[] newArray(int i) {
            return new OpenEsiaSdkParams[i];
        }
    }
}
