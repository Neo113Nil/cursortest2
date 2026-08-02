package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/FpsPayScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "tokenIntentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/fpspay/presentation/FpsPayScreenParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTokenIntentId", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FpsPayScreenParams implements ScreenParams {
    public static final Parcelable.Creator<FpsPayScreenParams> CREATOR = new Creator();
    private final String tokenIntentId;

    public FpsPayScreenParams(String str) {
        this.tokenIntentId = str;
    }

    public static /* synthetic */ FpsPayScreenParams copy$default(FpsPayScreenParams fpsPayScreenParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fpsPayScreenParams.tokenIntentId;
        }
        return fpsPayScreenParams.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTokenIntentId() {
        return this.tokenIntentId;
    }

    public final FpsPayScreenParams copy(String tokenIntentId) {
        return new FpsPayScreenParams(tokenIntentId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FpsPayScreenParams) && jl40.l(this.tokenIntentId, ((FpsPayScreenParams) other).tokenIntentId);
    }

    public final String getTokenIntentId() {
        return this.tokenIntentId;
    }

    public int hashCode() {
        return this.tokenIntentId.hashCode();
    }

    public String toString() {
        return oyr.p("FpsPayScreenParams(tokenIntentId=", this.tokenIntentId, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tokenIntentId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FpsPayScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FpsPayScreenParams createFromParcel(Parcel parcel) {
            return new FpsPayScreenParams(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FpsPayScreenParams[] newArray(int i) {
            return new FpsPayScreenParams[i];
        }
    }
}
