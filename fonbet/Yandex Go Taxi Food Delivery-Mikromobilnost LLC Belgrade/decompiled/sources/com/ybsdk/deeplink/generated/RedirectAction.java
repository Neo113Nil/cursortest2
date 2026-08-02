package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012R \u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ybsdk/deeplink/generated/RedirectAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "url", "auth", "ymevent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/RedirectAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getAuth", "getYmevent", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RedirectAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<RedirectAction> CREATOR = new Creator();
    private final String auth;
    private final Uri deeplinkUri;
    private final String url;
    private final String ymevent;

    public RedirectAction(String str, String str2, String str3) {
        this.url = str;
        this.auth = str2;
        this.ymevent = str3;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/redirect", "url", str);
        j.appendQueryParameter("auth", str2);
        if (str3 != null) {
            j.appendQueryParameter("ymevent", str3);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ RedirectAction copy$default(RedirectAction redirectAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = redirectAction.url;
        }
        if ((i & 2) != 0) {
            str2 = redirectAction.auth;
        }
        if ((i & 4) != 0) {
            str3 = redirectAction.ymevent;
        }
        return redirectAction.copy(str, str2, str3);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuth() {
        return this.auth;
    }

    /* renamed from: component3, reason: from getter */
    public final String getYmevent() {
        return this.ymevent;
    }

    public final RedirectAction copy(String url, String auth, String ymevent) {
        return new RedirectAction(url, auth, ymevent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectAction)) {
            return false;
        }
        RedirectAction redirectAction = (RedirectAction) other;
        return jl40.l(this.url, redirectAction.url) && jl40.l(this.auth, redirectAction.auth) && jl40.l(this.ymevent, redirectAction.ymevent);
    }

    public final String getAuth() {
        return this.auth;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getYmevent() {
        return this.ymevent;
    }

    public int hashCode() {
        int b = unr0.b(this.url.hashCode() * 31, 31, this.auth);
        String str = this.ymevent;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.url;
        String str2 = this.auth;
        return oyr.t(b64.v("RedirectAction(url=", str, ", auth=", str2, ", ymevent="), this.ymevent, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.auth);
        dest.writeString(this.ymevent);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RedirectAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectAction createFromParcel(Parcel parcel) {
            return new RedirectAction(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectAction[] newArray(int i) {
            return new RedirectAction[i];
        }
    }

    public /* synthetic */ RedirectAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "none" : str2, (i & 4) != 0 ? null : str3);
    }
}
