package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/SplitDepositAutoTopupSaveRetry;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "Landroid/net/Uri;", "deeplinkUri", "<init>", "(Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/ybsdk/feature/deeplink/api/actions/SplitDepositAutoTopupSaveRetry;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getDeeplinkUri", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitDepositAutoTopupSaveRetry implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SplitDepositAutoTopupSaveRetry> CREATOR = new Creator();
    private final Uri deeplinkUri;

    public SplitDepositAutoTopupSaveRetry(Uri uri) {
        this.deeplinkUri = uri;
    }

    public static /* synthetic */ SplitDepositAutoTopupSaveRetry copy$default(SplitDepositAutoTopupSaveRetry splitDepositAutoTopupSaveRetry, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = splitDepositAutoTopupSaveRetry.deeplinkUri;
        }
        return splitDepositAutoTopupSaveRetry.copy(uri);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final SplitDepositAutoTopupSaveRetry copy(Uri deeplinkUri) {
        return new SplitDepositAutoTopupSaveRetry(deeplinkUri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SplitDepositAutoTopupSaveRetry) && jl40.l(this.deeplinkUri, ((SplitDepositAutoTopupSaveRetry) other).deeplinkUri);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public int hashCode() {
        return this.deeplinkUri.hashCode();
    }

    public String toString() {
        return g8e.m(this.deeplinkUri, "SplitDepositAutoTopupSaveRetry(deeplinkUri=", Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.deeplinkUri, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SplitDepositAutoTopupSaveRetry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositAutoTopupSaveRetry createFromParcel(Parcel parcel) {
            return new SplitDepositAutoTopupSaveRetry((Uri) parcel.readParcelable(SplitDepositAutoTopupSaveRetry.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SplitDepositAutoTopupSaveRetry[] newArray(int i) {
            return new SplitDepositAutoTopupSaveRetry[i];
        }
    }
}
