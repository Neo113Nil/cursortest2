package com.yandex.passport.user_id.di;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.AuthCookie;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"com/yandex/passport/user_id/di/GetUserIdUrlRequester$Response", "Landroid/os/Parcelable;", "", "url", "Lcom/yandex/passport/common/core/AuthCookie;", "authCookie", "<init>", "(Ljava/lang/String;Lcom/yandex/passport/common/core/AuthCookie;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/passport/common/core/AuthCookie;", "Lcom/yandex/passport/user_id/di/GetUserIdUrlRequester$Response;", "copy", "(Ljava/lang/String;Lcom/yandex/passport/common/core/AuthCookie;)Lcom/yandex/passport/user_id/di/GetUserIdUrlRequester$Response;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lcom/yandex/passport/common/core/AuthCookie;", "getAuthCookie", "passport-user-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GetUserIdUrlRequester$Response implements Parcelable {
    public static final int $stable = AuthCookie.$stable;
    public static final Parcelable.Creator<GetUserIdUrlRequester$Response> CREATOR = new Creator();
    private final AuthCookie authCookie;
    private final String url;

    public /* synthetic */ GetUserIdUrlRequester$Response(String str, AuthCookie authCookie, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : authCookie);
    }

    public static /* synthetic */ GetUserIdUrlRequester$Response copy$default(GetUserIdUrlRequester$Response getUserIdUrlRequester$Response, String str, AuthCookie authCookie, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getUserIdUrlRequester$Response.url;
        }
        if ((i & 2) != 0) {
            authCookie = getUserIdUrlRequester$Response.authCookie;
        }
        return getUserIdUrlRequester$Response.copy(str, authCookie);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final AuthCookie getAuthCookie() {
        return this.authCookie;
    }

    public final GetUserIdUrlRequester$Response copy(String url, AuthCookie authCookie) {
        return new GetUserIdUrlRequester$Response(url, authCookie);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUserIdUrlRequester$Response)) {
            return false;
        }
        GetUserIdUrlRequester$Response getUserIdUrlRequester$Response = (GetUserIdUrlRequester$Response) other;
        return jl40.l(this.url, getUserIdUrlRequester$Response.url) && jl40.l(this.authCookie, getUserIdUrlRequester$Response.authCookie);
    }

    public final AuthCookie getAuthCookie() {
        return this.authCookie;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        AuthCookie authCookie = this.authCookie;
        return hashCode + (authCookie == null ? 0 : authCookie.hashCode());
    }

    public String toString() {
        return "Response(url=" + this.url + ", authCookie=" + this.authCookie + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeParcelable(this.authCookie, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GetUserIdUrlRequester$Response> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetUserIdUrlRequester$Response createFromParcel(Parcel parcel) {
            return new GetUserIdUrlRequester$Response(parcel.readString(), (AuthCookie) parcel.readParcelable(GetUserIdUrlRequester$Response.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetUserIdUrlRequester$Response[] newArray(int i) {
            return new GetUserIdUrlRequester$Response[i];
        }
    }

    public GetUserIdUrlRequester$Response(String str, AuthCookie authCookie) {
        this.url = str;
        this.authCookie = authCookie;
    }
}
