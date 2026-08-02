package com.ybsdk.core.common.utils.theme;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.design.theme.ThemedParams;
import defpackage.jl40;
import defpackage.kob1;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lcom/ybsdk/core/common/utils/theme/ThemedBooleanParams;", "Lcom/ybsdk/core/design/theme/ThemedParams;", "", "light", "dark", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ybsdk/core/common/utils/theme/ThemedBooleanParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getLight", "getDark", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ThemedBooleanParams implements ThemedParams<Boolean> {
    public static final Parcelable.Creator<ThemedBooleanParams> CREATOR = new Creator();
    private final Boolean dark;
    private final Boolean light;

    public ThemedBooleanParams(Boolean bool, Boolean bool2) {
        this.light = bool;
        this.dark = bool2;
    }

    public static /* synthetic */ ThemedBooleanParams copy$default(ThemedBooleanParams themedBooleanParams, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = themedBooleanParams.light;
        }
        if ((i & 2) != 0) {
            bool2 = themedBooleanParams.dark;
        }
        return themedBooleanParams.copy(bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getLight() {
        return this.light;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getDark() {
        return this.dark;
    }

    public final ThemedBooleanParams copy(Boolean light, Boolean dark) {
        return new ThemedBooleanParams(light, dark);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemedBooleanParams)) {
            return false;
        }
        ThemedBooleanParams themedBooleanParams = (ThemedBooleanParams) other;
        return jl40.l(this.light, themedBooleanParams.light) && jl40.l(this.dark, themedBooleanParams.dark);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.design.theme.ThemedParams
    public Boolean get(Context context) {
        return (Boolean) kob1.d(this, context);
    }

    public int hashCode() {
        Boolean bool = this.light;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.dark;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "ThemedBooleanParams(light=" + this.light + ", dark=" + this.dark + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Boolean bool = this.light;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
        Boolean bool2 = this.dark;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ThemedBooleanParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedBooleanParams createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ThemedBooleanParams(valueOf, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemedBooleanParams[] newArray(int i) {
            return new ThemedBooleanParams[i];
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.design.theme.ThemedParams
    public Boolean getDark() {
        return this.dark;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.design.theme.ThemedParams
    public Boolean getLight() {
        return this.light;
    }
}
