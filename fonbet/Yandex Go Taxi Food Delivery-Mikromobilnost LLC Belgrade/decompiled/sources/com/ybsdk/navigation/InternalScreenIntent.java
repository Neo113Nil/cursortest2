package com.ybsdk.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$LaunchScreenRequested;
import com.ybsdk.feature.deeplink.api.Deeplink;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/navigation/InternalScreenIntent;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", Constants.DEEPLINK, "Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$LaunchScreenRequested;", "requestedScreen", "<init>", "(Lcom/ybsdk/feature/deeplink/api/Deeplink;Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$LaunchScreenRequested;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/deeplink/api/Deeplink;", "component2", "()Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$LaunchScreenRequested;", "copy", "(Lcom/ybsdk/feature/deeplink/api/Deeplink;Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$LaunchScreenRequested;)Lcom/ybsdk/navigation/InternalScreenIntent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "getDeeplink", "Lcom/ybsdk/core/analytics/generated/delegates/CommonEvents$LaunchScreenRequested;", "getRequestedScreen", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternalScreenIntent implements Parcelable {
    public static final Parcelable.Creator<InternalScreenIntent> CREATOR = new Creator();
    private final Deeplink deeplink;
    private final CommonEvents$LaunchScreenRequested requestedScreen;

    public InternalScreenIntent(Deeplink deeplink, CommonEvents$LaunchScreenRequested commonEvents$LaunchScreenRequested) {
        this.deeplink = deeplink;
        this.requestedScreen = commonEvents$LaunchScreenRequested;
    }

    public static /* synthetic */ InternalScreenIntent copy$default(InternalScreenIntent internalScreenIntent, Deeplink deeplink, CommonEvents$LaunchScreenRequested commonEvents$LaunchScreenRequested, int i, Object obj) {
        if ((i & 1) != 0) {
            deeplink = internalScreenIntent.deeplink;
        }
        if ((i & 2) != 0) {
            commonEvents$LaunchScreenRequested = internalScreenIntent.requestedScreen;
        }
        return internalScreenIntent.copy(deeplink, commonEvents$LaunchScreenRequested);
    }

    /* renamed from: component1, reason: from getter */
    public final Deeplink getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonEvents$LaunchScreenRequested getRequestedScreen() {
        return this.requestedScreen;
    }

    public final InternalScreenIntent copy(Deeplink deeplink, CommonEvents$LaunchScreenRequested requestedScreen) {
        return new InternalScreenIntent(deeplink, requestedScreen);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalScreenIntent)) {
            return false;
        }
        InternalScreenIntent internalScreenIntent = (InternalScreenIntent) other;
        return jl40.l(this.deeplink, internalScreenIntent.deeplink) && this.requestedScreen == internalScreenIntent.requestedScreen;
    }

    public final Deeplink getDeeplink() {
        return this.deeplink;
    }

    public final CommonEvents$LaunchScreenRequested getRequestedScreen() {
        return this.requestedScreen;
    }

    public int hashCode() {
        return this.requestedScreen.hashCode() + (this.deeplink.hashCode() * 31);
    }

    public String toString() {
        return "InternalScreenIntent(deeplink=" + this.deeplink + ", requestedScreen=" + this.requestedScreen + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.deeplink, flags);
        dest.writeString(this.requestedScreen.name());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InternalScreenIntent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalScreenIntent createFromParcel(Parcel parcel) {
            return new InternalScreenIntent((Deeplink) parcel.readParcelable(InternalScreenIntent.class.getClassLoader()), CommonEvents$LaunchScreenRequested.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalScreenIntent[] newArray(int i) {
            return new InternalScreenIntent[i];
        }
    }
}
