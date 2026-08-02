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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012R \u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/ybsdk/deeplink/generated/OpenOnceAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "id", "onceUrl", "nextUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/OpenOnceAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getOnceUrl", "getNextUrl", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenOnceAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<OpenOnceAction> CREATOR = new Creator();
    private final Uri deeplinkUri;
    private final String id;
    private final String nextUrl;
    private final String onceUrl;

    public OpenOnceAction(String str, String str2, String str3) {
        this.id = str;
        this.onceUrl = str2;
        this.nextUrl = str3;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/open_once", "id", str);
        j.appendQueryParameter("once_url", str2);
        if (str3 != null) {
            j.appendQueryParameter("next_url", str3);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ OpenOnceAction copy$default(OpenOnceAction openOnceAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openOnceAction.id;
        }
        if ((i & 2) != 0) {
            str2 = openOnceAction.onceUrl;
        }
        if ((i & 4) != 0) {
            str3 = openOnceAction.nextUrl;
        }
        return openOnceAction.copy(str, str2, str3);
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOnceUrl() {
        return this.onceUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNextUrl() {
        return this.nextUrl;
    }

    public final OpenOnceAction copy(String id, String onceUrl, String nextUrl) {
        return new OpenOnceAction(id, onceUrl, nextUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenOnceAction)) {
            return false;
        }
        OpenOnceAction openOnceAction = (OpenOnceAction) other;
        return jl40.l(this.id, openOnceAction.id) && jl40.l(this.onceUrl, openOnceAction.onceUrl) && jl40.l(this.nextUrl, openOnceAction.nextUrl);
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNextUrl() {
        return this.nextUrl;
    }

    public final String getOnceUrl() {
        return this.onceUrl;
    }

    public int hashCode() {
        int b = unr0.b(this.id.hashCode() * 31, 31, this.onceUrl);
        String str = this.nextUrl;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.onceUrl;
        return oyr.t(b64.v("OpenOnceAction(id=", str, ", onceUrl=", str2, ", nextUrl="), this.nextUrl, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.onceUrl);
        dest.writeString(this.nextUrl);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OpenOnceAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenOnceAction createFromParcel(Parcel parcel) {
            return new OpenOnceAction(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenOnceAction[] newArray(int i) {
            return new OpenOnceAction[i];
        }
    }

    public /* synthetic */ OpenOnceAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
