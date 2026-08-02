package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/OpenUrlAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "url", "Landroid/net/Uri;", "deeplinkUri", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Landroid/net/Uri;", "copy", "(Ljava/lang/String;Landroid/net/Uri;)Lcom/ybsdk/feature/deeplink/api/actions/OpenUrlAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Landroid/net/Uri;", "getDeeplinkUri", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenUrlAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<OpenUrlAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String url;

    public /* synthetic */ OpenUrlAction(String str, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Uri.parse("ybapp://screen.open/open_url") : uri);
    }

    public static /* synthetic */ OpenUrlAction copy$default(OpenUrlAction openUrlAction, String str, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openUrlAction.url;
        }
        if ((i & 2) != 0) {
            uri = openUrlAction.deeplinkUri;
        }
        return openUrlAction.copy(str, uri);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final OpenUrlAction copy(String url, Uri deeplinkUri) {
        return new OpenUrlAction(url, deeplinkUri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenUrlAction)) {
            return false;
        }
        OpenUrlAction openUrlAction = (OpenUrlAction) other;
        return jl40.l(this.url, openUrlAction.url) && jl40.l(this.deeplinkUri, openUrlAction.deeplinkUri);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.deeplinkUri.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        return "OpenUrlAction(url=" + this.url + ", deeplinkUri=" + this.deeplinkUri + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeParcelable(this.deeplinkUri, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenUrlAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenUrlAction createFromParcel(Parcel parcel) {
            return new OpenUrlAction(parcel.readString(), (Uri) parcel.readParcelable(OpenUrlAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenUrlAction[] newArray(int i) {
            return new OpenUrlAction[i];
        }
    }

    public OpenUrlAction(String str, Uri uri) {
        this.url = str;
        this.deeplinkUri = uri;
    }
}
