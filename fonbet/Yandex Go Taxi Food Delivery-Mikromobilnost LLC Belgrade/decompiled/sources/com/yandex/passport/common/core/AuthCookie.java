package com.yandex.passport.common.core;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/yandex/passport/common/core/AuthCookie;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/common/core/Uid;", "uid", "", "", "cookies", "domain", "<init>", "(Lcom/yandex/passport/common/core/Uid;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/common/core/Uid;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/yandex/passport/common/core/Uid;Ljava/util/List;Ljava/lang/String;)Lcom/yandex/passport/common/core/AuthCookie;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/common/core/Uid;", "getUid", "Ljava/util/List;", "getCookies", "Ljava/lang/String;", "getDomain", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AuthCookie implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AuthCookie> CREATOR = new Creator();
    private final List<String> cookies;
    private final String domain;
    private final Uid uid;

    public AuthCookie(Uid uid, List<String> list, String str) {
        this.uid = uid;
        this.cookies = list;
        this.domain = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthCookie copy$default(AuthCookie authCookie, Uid uid, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uid = authCookie.uid;
        }
        if ((i & 2) != 0) {
            list = authCookie.cookies;
        }
        if ((i & 4) != 0) {
            str = authCookie.domain;
        }
        return authCookie.copy(uid, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Uid getUid() {
        return this.uid;
    }

    public final List<String> component2() {
        return this.cookies;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    public final AuthCookie copy(Uid uid, List<String> cookies, String domain) {
        return new AuthCookie(uid, cookies, domain);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthCookie)) {
            return false;
        }
        AuthCookie authCookie = (AuthCookie) other;
        return jl40.l(this.uid, authCookie.uid) && jl40.l(this.cookies, authCookie.cookies) && jl40.l(this.domain, authCookie.domain);
    }

    public final List<String> getCookies() {
        return this.cookies;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Uid getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.domain.hashCode() + unr0.c(this.uid.hashCode() * 31, 31, this.cookies);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthCookie(uid=");
        sb.append(this.uid);
        sb.append(", cookies=");
        sb.append(this.cookies);
        sb.append(", domain=");
        return b64.p(sb, this.domain, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.uid.writeToParcel(dest, flags);
        dest.writeStringList(this.cookies);
        dest.writeString(this.domain);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthCookie> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthCookie createFromParcel(Parcel parcel) {
            return new AuthCookie(Uid.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthCookie[] newArray(int i) {
            return new AuthCookie[i];
        }
    }
}
