package com.ybsdk.feature.kycesia.internal.screens.browser;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/kycesia/internal/screens/browser/OpenEsiaParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "startUri", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/kycesia/internal/screens/browser/OpenEsiaParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartUri", "feature-esia_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenEsiaParams implements ScreenParams {
    public static final Parcelable.Creator<OpenEsiaParams> CREATOR = new Creator();
    private final String startUri;

    public OpenEsiaParams(String str) {
        this.startUri = str;
    }

    public static /* synthetic */ OpenEsiaParams copy$default(OpenEsiaParams openEsiaParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openEsiaParams.startUri;
        }
        return openEsiaParams.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStartUri() {
        return this.startUri;
    }

    public final OpenEsiaParams copy(String startUri) {
        return new OpenEsiaParams(startUri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OpenEsiaParams) && jl40.l(this.startUri, ((OpenEsiaParams) other).startUri);
    }

    public final String getStartUri() {
        return this.startUri;
    }

    public int hashCode() {
        String str = this.startUri;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return oyr.p("OpenEsiaParams(startUri=", this.startUri, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.startUri);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenEsiaParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenEsiaParams createFromParcel(Parcel parcel) {
            return new OpenEsiaParams(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenEsiaParams[] newArray(int i) {
            return new OpenEsiaParams[i];
        }
    }
}
