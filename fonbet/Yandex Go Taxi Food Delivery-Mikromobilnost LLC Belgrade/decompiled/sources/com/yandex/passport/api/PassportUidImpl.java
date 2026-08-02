package com.yandex.passport.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0015R\u0014\u0010&\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0015¨\u0006)"}, d2 = {"Lcom/yandex/passport/api/PassportUidImpl;", "Lcom/yandex/passport/api/k2;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "", "value", "<init>", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;J)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component2", "()J", "copy", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;J)Lcom/yandex/passport/api/PassportUidImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "J", "getValue", "getUidValue-XITkWrY", "uidValue", "Companion", "com/yandex/passport/api/l2", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PassportUidImpl implements k2, Parcelable {
    public static final int $stable = 8;
    private final PassportEnvironmentImpl environment;
    private final long value;
    public static final l2 Companion = new l2();
    public static final Parcelable.Creator<PassportUidImpl> CREATOR = new Creator();

    public PassportUidImpl(PassportEnvironmentImpl passportEnvironmentImpl, long j) {
        this.environment = passportEnvironmentImpl;
        this.value = j;
    }

    public static /* synthetic */ PassportUidImpl copy$default(PassportUidImpl passportUidImpl, PassportEnvironmentImpl passportEnvironmentImpl, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            passportEnvironmentImpl = passportUidImpl.environment;
        }
        if ((i & 2) != 0) {
            j = passportUidImpl.value;
        }
        return passportUidImpl.copy(passportEnvironmentImpl, j);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final PassportUidImpl copy(PassportEnvironmentImpl environment, long value) {
        return new PassportUidImpl(environment, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportUidImpl)) {
            return false;
        }
        PassportUidImpl passportUidImpl = (PassportUidImpl) other;
        return jl40.l(this.environment, passportUidImpl.environment) && this.value == passportUidImpl.value;
    }

    /* renamed from: getUidValue-XITkWrY, reason: not valid java name */
    public long m242getUidValueXITkWrY() {
        return getValue();
    }

    @Override // com.yandex.passport.api.k2
    public long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value) + (this.environment.hashCode() * 31);
    }

    public void putToExtras(Bundle bundle) {
        com.yandex.passport.internal.ui.c.w(this, bundle);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PassportUidImpl(environment=");
        sb.append(this.environment);
        sb.append(", value=");
        return b64.o(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.environment, flags);
        dest.writeLong(this.value);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportUidImpl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportUidImpl createFromParcel(Parcel parcel) {
            return new PassportUidImpl((PassportEnvironmentImpl) parcel.readParcelable(PassportUidImpl.class.getClassLoader()), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportUidImpl[] newArray(int i) {
            return new PassportUidImpl[i];
        }
    }

    @Override // com.yandex.passport.api.k2
    public PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }
}
