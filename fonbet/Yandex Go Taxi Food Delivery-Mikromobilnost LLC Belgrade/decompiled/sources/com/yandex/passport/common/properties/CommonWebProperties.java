package com.yandex.passport.common.properties;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0006\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/yandex/passport/common/properties/CommonWebProperties;", "Landroid/os/Parcelable;", "", "ignoreBackToNativeFallback", "", "testId", "isClearCookiesBeforeAuthorization", "useBundleCache", "<init>", "(ZLjava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Z", "getIgnoreBackToNativeFallback", "()Z", "Ljava/lang/String;", "getTestId", "()Ljava/lang/String;", "getUseBundleCache", "Companion", "com/yandex/passport/common/properties/a", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommonWebProperties implements Parcelable {
    public static final int $stable = 0;
    private final boolean ignoreBackToNativeFallback;
    private final boolean isClearCookiesBeforeAuthorization;
    private final String testId;
    private final boolean useBundleCache;
    public static final a Companion = new a();
    public static final Parcelable.Creator<CommonWebProperties> CREATOR = new Creator();

    public /* synthetic */ CommonWebProperties(boolean z, String str, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean getIgnoreBackToNativeFallback() {
        return this.ignoreBackToNativeFallback;
    }

    public final String getTestId() {
        return this.testId;
    }

    public final boolean getUseBundleCache() {
        return this.useBundleCache;
    }

    /* renamed from: isClearCookiesBeforeAuthorization, reason: from getter */
    public final boolean getIsClearCookiesBeforeAuthorization() {
        return this.isClearCookiesBeforeAuthorization;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.ignoreBackToNativeFallback ? 1 : 0);
        dest.writeString(this.testId);
        dest.writeInt(this.isClearCookiesBeforeAuthorization ? 1 : 0);
        dest.writeInt(this.useBundleCache ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonWebProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonWebProperties createFromParcel(Parcel parcel) {
            return new CommonWebProperties(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonWebProperties[] newArray(int i) {
            return new CommonWebProperties[i];
        }
    }

    public CommonWebProperties(boolean z, String str, boolean z2, boolean z3) {
        this.ignoreBackToNativeFallback = z;
        this.testId = str;
        this.isClearCookiesBeforeAuthorization = z2;
        this.useBundleCache = z3;
    }

    public CommonWebProperties() {
        this(false, null, false, false, 15, null);
    }
}
