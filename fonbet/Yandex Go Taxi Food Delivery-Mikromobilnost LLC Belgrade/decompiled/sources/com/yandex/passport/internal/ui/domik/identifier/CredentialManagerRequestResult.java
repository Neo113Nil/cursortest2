package com.yandex.passport.internal.ui.domik.identifier;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/identifier/CredentialManagerRequestResult;", "Landroid/os/Parcelable;", "", LegacyAccountType.STRING_LOGIN, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "avatarUrl", "", "isFromDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getLogin", "()Ljava/lang/String;", "getPassword", "getAvatarUrl", "Z", "()Z", "Companion", "com/yandex/passport/internal/ui/domik/identifier/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CredentialManagerRequestResult implements Parcelable {
    public static final int $stable = 0;
    private static final String KEY_CREDENTIAL_MANAGER_RESULT = "smartlock_result";
    private final String avatarUrl;
    private final boolean isFromDialog;
    private final String login;
    private final String password;
    public static final a Companion = new a();
    public static final Parcelable.Creator<CredentialManagerRequestResult> CREATOR = new Creator();

    public CredentialManagerRequestResult(String str, String str2, String str3, boolean z) {
        this.login = str;
        this.password = str2;
        this.avatarUrl = str3;
        this.isFromDialog = z;
    }

    public static final CredentialManagerRequestResult empty() {
        Companion.getClass();
        return new CredentialManagerRequestResult(null, null, null, false);
    }

    public static final CredentialManagerRequestResult optionalFrom(Bundle bundle) {
        Companion.getClass();
        return (CredentialManagerRequestResult) bundle.getParcelable(KEY_CREDENTIAL_MANAGER_RESULT);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getLogin() {
        return this.login;
    }

    public final String getPassword() {
        return this.password;
    }

    /* renamed from: isFromDialog, reason: from getter */
    public final boolean getIsFromDialog() {
        return this.isFromDialog;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_CREDENTIAL_MANAGER_RESULT, this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.login);
        dest.writeString(this.password);
        dest.writeString(this.avatarUrl);
        dest.writeInt(this.isFromDialog ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CredentialManagerRequestResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CredentialManagerRequestResult createFromParcel(Parcel parcel) {
            return new CredentialManagerRequestResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CredentialManagerRequestResult[] newArray(int i) {
            return new CredentialManagerRequestResult[i];
        }
    }
}
