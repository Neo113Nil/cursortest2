package com.yandex.passport.internal.entities;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001+B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006,"}, d2 = {"Lcom/yandex/passport/internal/entities/Code;", "", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", WebViewActivity.KEY_ENVIRONMENT, "", "value", "", "expiresIn", "<init>", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;I)V", "Landroid/os/Bundle;", "bundle", "toBundle", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;Ljava/lang/String;I)Lcom/yandex/passport/internal/entities/Code;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/passport/api/impl/PassportEnvironmentImpl;", "getEnvironment", "Ljava/lang/String;", "getValue", CA20Status.STATUS_USER_I, "getExpiresIn", "Companion", "com/yandex/passport/internal/entities/c", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Code implements Parcelable {
    public static final int $stable = 8;
    public static final int DEFAULT_EXPIRES_IN_SECONDS = Integer.MAX_VALUE;
    private final PassportEnvironmentImpl environment;
    private final int expiresIn;
    private final String value;
    public static final c Companion = new c();
    public static final Parcelable.Creator<Code> CREATOR = new Creator();

    public Code(PassportEnvironmentImpl passportEnvironmentImpl, String str, int i) {
        this.environment = passportEnvironmentImpl;
        this.value = str;
        this.expiresIn = i;
    }

    public static /* synthetic */ Code copy$default(Code code, PassportEnvironmentImpl passportEnvironmentImpl, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            passportEnvironmentImpl = code.environment;
        }
        if ((i2 & 2) != 0) {
            str = code.value;
        }
        if ((i2 & 4) != 0) {
            i = code.expiresIn;
        }
        return code.copy(passportEnvironmentImpl, str, i);
    }

    public static /* synthetic */ Bundle toBundle$default(Code code, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = new Bundle();
        }
        return code.toBundle(bundle);
    }

    /* renamed from: component1, reason: from getter */
    public final PassportEnvironmentImpl getEnvironment() {
        return this.environment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final Code copy(PassportEnvironmentImpl environment, String value, int expiresIn) {
        return new Code(environment, value, expiresIn);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Code)) {
            return false;
        }
        Code code = (Code) other;
        return jl40.l(this.environment, code.environment) && jl40.l(this.value, code.value) && this.expiresIn == code.expiresIn;
    }

    public int getExpiresIn() {
        return this.expiresIn;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.expiresIn) + unr0.b(this.environment.hashCode() * 31, 31, this.value);
    }

    public final Bundle toBundle(Bundle bundle) {
        bundle.putParcelable("passport-code", this);
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Code(environment=");
        sb.append(this.environment);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", expiresIn=");
        return oyr.s(sb, this.expiresIn, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.environment, flags);
        dest.writeString(this.value);
        dest.writeInt(this.expiresIn);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Code> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Code createFromParcel(Parcel parcel) {
            return new Code((PassportEnvironmentImpl) parcel.readParcelable(Code.class.getClassLoader()), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Code[] newArray(int i) {
            return new Code[i];
        }
    }

    /* renamed from: getEnvironment, reason: merged with bridge method [inline-methods] */
    public PassportEnvironmentImpl m302getEnvironment() {
        return this.environment;
    }
}
