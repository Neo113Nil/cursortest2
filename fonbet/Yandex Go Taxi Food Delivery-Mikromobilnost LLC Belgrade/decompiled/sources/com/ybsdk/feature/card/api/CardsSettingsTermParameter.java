package com.ybsdk.feature.card.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/card/api/CardsSettingsTermParameter;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "initialScreenId", "", "fitsSystemWindow", "<init>", "(Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/ybsdk/feature/card/api/CardsSettingsTermParameter;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInitialScreenId", "Z", "getFitsSystemWindow", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardsSettingsTermParameter implements ScreenParams {
    public static final Parcelable.Creator<CardsSettingsTermParameter> CREATOR = new Creator();
    private final boolean fitsSystemWindow;
    private final String initialScreenId;

    public CardsSettingsTermParameter(String str, boolean z) {
        this.initialScreenId = str;
        this.fitsSystemWindow = z;
    }

    public static /* synthetic */ CardsSettingsTermParameter copy$default(CardsSettingsTermParameter cardsSettingsTermParameter, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardsSettingsTermParameter.initialScreenId;
        }
        if ((i & 2) != 0) {
            z = cardsSettingsTermParameter.fitsSystemWindow;
        }
        return cardsSettingsTermParameter.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInitialScreenId() {
        return this.initialScreenId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFitsSystemWindow() {
        return this.fitsSystemWindow;
    }

    public final CardsSettingsTermParameter copy(String initialScreenId, boolean fitsSystemWindow) {
        return new CardsSettingsTermParameter(initialScreenId, fitsSystemWindow);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardsSettingsTermParameter)) {
            return false;
        }
        CardsSettingsTermParameter cardsSettingsTermParameter = (CardsSettingsTermParameter) other;
        return jl40.l(this.initialScreenId, cardsSettingsTermParameter.initialScreenId) && this.fitsSystemWindow == cardsSettingsTermParameter.fitsSystemWindow;
    }

    public final boolean getFitsSystemWindow() {
        return this.fitsSystemWindow;
    }

    public final String getInitialScreenId() {
        return this.initialScreenId;
    }

    public int hashCode() {
        String str = this.initialScreenId;
        return Boolean.hashCode(this.fitsSystemWindow) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return xvz.k("CardsSettingsTermParameter(initialScreenId=", this.initialScreenId, ", fitsSystemWindow=", this.fitsSystemWindow, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.initialScreenId);
        dest.writeInt(this.fitsSystemWindow ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardsSettingsTermParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardsSettingsTermParameter createFromParcel(Parcel parcel) {
            return new CardsSettingsTermParameter(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardsSettingsTermParameter[] newArray(int i) {
            return new CardsSettingsTermParameter[i];
        }
    }
}
