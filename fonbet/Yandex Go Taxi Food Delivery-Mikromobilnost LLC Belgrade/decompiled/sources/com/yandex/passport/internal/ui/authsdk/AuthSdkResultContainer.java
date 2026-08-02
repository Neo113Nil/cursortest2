package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.entities.JwtToken;
import com.yandex.passport.internal.network.response.LoginSdkResult;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001(BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\nj\b\u0012\u0004\u0012\u00020\u0006`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\nj\b\u0012\u0004\u0012\u00020\u0006`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/AuthSdkResultContainer;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/internal/network/response/LoginSdkResult;", TarifficatorScenarioActivity.RESULT_KEY, "Lcom/yandex/passport/common/core/Uid;", "uid", "", "clientId", "Lcom/yandex/passport/internal/entities/JwtToken;", "jwtToken", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "scopeCodes", "<init>", "(Lcom/yandex/passport/internal/network/response/LoginSdkResult;Lcom/yandex/passport/common/core/Uid;Ljava/lang/String;Lcom/yandex/passport/internal/entities/JwtToken;Ljava/util/ArrayList;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/passport/internal/network/response/LoginSdkResult;", "getResult", "()Lcom/yandex/passport/internal/network/response/LoginSdkResult;", "Lcom/yandex/passport/common/core/Uid;", "getUid", "()Lcom/yandex/passport/common/core/Uid;", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", "Lcom/yandex/passport/internal/entities/JwtToken;", "getJwtToken", "()Lcom/yandex/passport/internal/entities/JwtToken;", "Ljava/util/ArrayList;", "getScopeCodes", "()Ljava/util/ArrayList;", "Companion", "com/yandex/passport/internal/ui/authsdk/n", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthSdkResultContainer implements Parcelable {
    public static final int $stable = 8;
    private final String clientId;
    private final JwtToken jwtToken;
    private final LoginSdkResult result;
    private final ArrayList<String> scopeCodes;
    private final Uid uid;
    public static final n Companion = new n();
    public static final Parcelable.Creator<AuthSdkResultContainer> CREATOR = new Creator();

    public AuthSdkResultContainer(LoginSdkResult loginSdkResult, Uid uid, String str, JwtToken jwtToken, ArrayList<String> arrayList) {
        this.result = loginSdkResult;
        this.uid = uid;
        this.clientId = str;
        this.jwtToken = jwtToken;
        this.scopeCodes = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final JwtToken getJwtToken() {
        return this.jwtToken;
    }

    public final LoginSdkResult getResult() {
        return this.result;
    }

    public final ArrayList<String> getScopeCodes() {
        return this.scopeCodes;
    }

    public final Uid getUid() {
        return this.uid;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.result, flags);
        dest.writeParcelable(this.uid, flags);
        dest.writeString(this.clientId);
        JwtToken jwtToken = this.jwtToken;
        if (jwtToken == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            jwtToken.writeToParcel(dest, flags);
        }
        dest.writeStringList(this.scopeCodes);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthSdkResultContainer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthSdkResultContainer createFromParcel(Parcel parcel) {
            return new AuthSdkResultContainer((LoginSdkResult) parcel.readParcelable(AuthSdkResultContainer.class.getClassLoader()), (Uid) parcel.readParcelable(AuthSdkResultContainer.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : JwtToken.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthSdkResultContainer[] newArray(int i) {
            return new AuthSdkResultContainer[i];
        }
    }
}
