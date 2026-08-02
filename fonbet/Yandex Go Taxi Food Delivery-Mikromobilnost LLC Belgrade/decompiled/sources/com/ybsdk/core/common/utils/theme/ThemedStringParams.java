package com.ybsdk.core.common.utils.theme;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.design.theme.ThemedParams;
import defpackage.jl40;
import defpackage.kob1;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/core/common/utils/theme/ThemedStringParams;", "Lcom/ybsdk/core/design/theme/ThemedParams;", "", "light", "dark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/core/common/utils/theme/ThemedStringParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLight", "getDark", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ThemedStringParams implements ThemedParams<String> {
    public static final Parcelable.Creator<ThemedStringParams> CREATOR = new Creator();
    private final String dark;
    private final String light;

    public ThemedStringParams(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public static /* synthetic */ ThemedStringParams copy$default(ThemedStringParams themedStringParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themedStringParams.light;
        }
        if ((i & 2) != 0) {
            str2 = themedStringParams.dark;
        }
        return themedStringParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDark() {
        return this.dark;
    }

    public final ThemedStringParams copy(String light, String dark) {
        return new ThemedStringParams(light, dark);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedStringParams)) {
            return false;
        }
        ThemedStringParams themedStringParams = (ThemedStringParams) other;
        return jl40.l(this.light, themedStringParams.light) && jl40.l(this.dark, themedStringParams.dark);
    }

    @Override // com.ybsdk.core.design.theme.ThemedParams
    public String get(Context context) {
        return (String) kob1.d(this, context);
    }

    public int hashCode() {
        String str = this.light;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("ThemedStringParams(light=", this.light, ", dark=", this.dark, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.light);
        dest.writeString(this.dark);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ThemedStringParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedStringParams createFromParcel(Parcel parcel) {
            return new ThemedStringParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedStringParams[] newArray(int i) {
            return new ThemedStringParams[i];
        }
    }

    @Override // com.ybsdk.core.design.theme.ThemedParams
    public String getDark() {
        return this.dark;
    }

    @Override // com.ybsdk.core.design.theme.ThemedParams
    public String getLight() {
        return this.light;
    }
}
