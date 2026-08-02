package com.ybsdk.feature.deeplink.api.actions;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0013¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/deeplink/api/actions/Intent;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "fallback", "deeplinkUri", "<init>", "(Landroid/net/Uri;Lcom/ybsdk/feature/deeplink/api/Deeplink;Landroid/net/Uri;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Landroid/net/Uri;", "component2", "()Lcom/ybsdk/feature/deeplink/api/Deeplink;", "component3", "copy", "(Landroid/net/Uri;Lcom/ybsdk/feature/deeplink/api/Deeplink;Landroid/net/Uri;)Lcom/ybsdk/feature/deeplink/api/actions/Intent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getUri", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "getFallback", "getDeeplinkUri", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Intent implements BaseDeeplinkAction {
    public static final Parcelable.Creator<Intent> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final Deeplink fallback;
    private final Uri uri;

    public /* synthetic */ Intent(Uri uri, Deeplink deeplink, Uri uri2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, deeplink, (i & 4) != 0 ? Uri.parse("ybapp://screen.open/intent") : uri2);
    }

    public static /* synthetic */ Intent copy$default(Intent intent, Uri uri, Deeplink deeplink, Uri uri2, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = intent.uri;
        }
        if ((i & 2) != 0) {
            deeplink = intent.fallback;
        }
        if ((i & 4) != 0) {
            uri2 = intent.deeplinkUri;
        }
        return intent.copy(uri, deeplink, uri2);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final Deeplink getFallback() {
        return this.fallback;
    }

    /* renamed from: component3, reason: from getter */
    public final Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final Intent copy(Uri uri, Deeplink fallback, Uri deeplinkUri) {
        return new Intent(uri, fallback, deeplinkUri);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Intent)) {
            return false;
        }
        Intent intent = (Intent) other;
        return jl40.l(this.uri, intent.uri) && jl40.l(this.fallback, intent.fallback) && jl40.l(this.deeplinkUri, intent.deeplinkUri);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final Deeplink getFallback() {
        return this.fallback;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = this.uri.hashCode() * 31;
        Deeplink deeplink = this.fallback;
        return this.deeplinkUri.hashCode() + ((hashCode + (deeplink == null ? 0 : deeplink.hashCode())) * 31);
    }

    public String toString() {
        return "Intent(uri=" + this.uri + ", fallback=" + this.fallback + ", deeplinkUri=" + this.deeplinkUri + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.uri, flags);
        Deeplink deeplink = this.fallback;
        if (deeplink == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deeplink.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.deeplinkUri, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Intent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Intent createFromParcel(Parcel parcel) {
            return new Intent((Uri) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt() == 0 ? null : Deeplink.CREATOR.createFromParcel(parcel), (Uri) parcel.readParcelable(Intent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Intent[] newArray(int i) {
            return new Intent[i];
        }
    }

    public Intent(Uri uri, Deeplink deeplink, Uri uri2) {
        this.uri = uri;
        this.fallback = deeplink;
        this.deeplinkUri = uri2;
    }
}
