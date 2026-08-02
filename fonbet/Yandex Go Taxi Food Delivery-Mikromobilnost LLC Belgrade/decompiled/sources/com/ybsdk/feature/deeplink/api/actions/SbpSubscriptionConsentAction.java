package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/SbpSubscriptionConsentAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "Landroid/net/Uri;", "deeplinkUri", "<init>", "(Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbpSubscriptionConsentAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<SbpSubscriptionConsentAction> CREATOR = new Creator();
    private final Uri deeplinkUri;

    public SbpSubscriptionConsentAction(Uri uri) {
        this.deeplinkUri = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.deeplinkUri, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SbpSubscriptionConsentAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SbpSubscriptionConsentAction createFromParcel(Parcel parcel) {
            return new SbpSubscriptionConsentAction((Uri) parcel.readParcelable(SbpSubscriptionConsentAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SbpSubscriptionConsentAction[] newArray(int i) {
            return new SbpSubscriptionConsentAction[i];
        }
    }
}
