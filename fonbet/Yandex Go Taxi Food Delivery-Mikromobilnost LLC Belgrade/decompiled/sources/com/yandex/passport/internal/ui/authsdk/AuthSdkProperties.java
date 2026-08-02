package com.yandex.passport.internal.ui.authsdk;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.sloth.command.data.SlothAccountType;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothTheme;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tcc;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u0000 J2\u00020\u0001:\u0001KB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0013J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0013J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b.\u0010\u0018J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u0013J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u0013J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u0013Jx\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u0013J\u0010\u00107\u001a\u00020!HÖ\u0001¢\u0006\u0004\b7\u0010'J\u001a\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010*R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bG\u0010\u0013R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bH\u0010\u0013R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bI\u0010\u0013¨\u0006L"}, d2 = {"Lcom/yandex/passport/internal/ui/authsdk/AuthSdkProperties;", "Landroid/os/Parcelable;", "", "clientId", "", "scopes", "responseType", "Lcom/yandex/passport/internal/properties/LoginProperties;", "loginProperties", "", "forceConfirm", "Lcom/yandex/passport/api/PassportUidImpl;", "selectedUid", "callerAppId", "callerFingerprint", "turboAppIdentifier", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/yandex/passport/internal/properties/LoginProperties;ZLcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTurboAppRedirectUri", "()Ljava/lang/String;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "isTurboApp", "()Z", "Lcom/yandex/passport/common/core/Uid;", "uid", ClidProvider.STATE, "Lcom/yandex/passport/sloth/data/SlothParams;", "toSlothAuthSdk", "(Lcom/yandex/passport/common/core/Uid;Ljava/lang/String;)Lcom/yandex/passport/sloth/data/SlothParams;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/yandex/passport/internal/properties/LoginProperties;", "component5", "component6", "()Lcom/yandex/passport/api/PassportUidImpl;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/yandex/passport/internal/properties/LoginProperties;ZLcom/yandex/passport/api/PassportUidImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/passport/internal/ui/authsdk/AuthSdkProperties;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientId", "Ljava/util/List;", "getScopes", "getResponseType", "Lcom/yandex/passport/internal/properties/LoginProperties;", "getLoginProperties", "Z", "getForceConfirm", "Lcom/yandex/passport/api/PassportUidImpl;", "getSelectedUid", "getCallerAppId", "getCallerFingerprint", "getTurboAppIdentifier", "Companion", "com/yandex/passport/internal/ui/authsdk/m", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AuthSdkProperties implements Parcelable {
    public static final int $stable = 8;
    private static final String KEY_AUTH_SDK_PROPERTIES = "auth_sdk_properties";
    private final String callerAppId;
    private final String callerFingerprint;
    private final String clientId;
    private final boolean forceConfirm;
    private final LoginProperties loginProperties;
    private final String responseType;
    private final List<String> scopes;
    private final PassportUidImpl selectedUid;
    private final String turboAppIdentifier;
    public static final m Companion = new m();
    public static final Parcelable.Creator<AuthSdkProperties> CREATOR = new Creator();

    public AuthSdkProperties(String str, List<String> list, String str2, LoginProperties loginProperties, boolean z, PassportUidImpl passportUidImpl, String str3, String str4, String str5) {
        this.clientId = str;
        this.scopes = list;
        this.responseType = str2;
        this.loginProperties = loginProperties;
        this.forceConfirm = z;
        this.selectedUid = passportUidImpl;
        this.callerAppId = str3;
        this.callerFingerprint = str4;
        this.turboAppIdentifier = str5;
    }

    public static /* synthetic */ AuthSdkProperties copy$default(AuthSdkProperties authSdkProperties, String str, List list, String str2, LoginProperties loginProperties, boolean z, PassportUidImpl passportUidImpl, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSdkProperties.clientId;
        }
        if ((i & 2) != 0) {
            list = authSdkProperties.scopes;
        }
        if ((i & 4) != 0) {
            str2 = authSdkProperties.responseType;
        }
        if ((i & 8) != 0) {
            loginProperties = authSdkProperties.loginProperties;
        }
        if ((i & 16) != 0) {
            z = authSdkProperties.forceConfirm;
        }
        if ((i & 32) != 0) {
            passportUidImpl = authSdkProperties.selectedUid;
        }
        if ((i & 64) != 0) {
            str3 = authSdkProperties.callerAppId;
        }
        if ((i & 128) != 0) {
            str4 = authSdkProperties.callerFingerprint;
        }
        if ((i & 256) != 0) {
            str5 = authSdkProperties.turboAppIdentifier;
        }
        String str6 = str4;
        String str7 = str5;
        PassportUidImpl passportUidImpl2 = passportUidImpl;
        String str8 = str3;
        boolean z2 = z;
        String str9 = str2;
        return authSdkProperties.copy(str, list, str9, loginProperties, z2, passportUidImpl2, str8, str6, str7);
    }

    public static final Filter createDefaultFilter(boolean z) {
        Companion.getClass();
        PassportEnvironmentImpl passportEnvironmentImpl = z ? PassportEnvironmentImpl.TESTING : PassportEnvironmentImpl.PRODUCTION;
        Filter.a aVar = new Filter.a();
        aVar.e(passportEnvironmentImpl);
        aVar.c(PassportAccountType.CHILDISH);
        return aVar.a();
    }

    public static final AuthSdkProperties from(Bundle bundle) {
        Companion.getClass();
        return (AuthSdkProperties) bundle.getParcelable(KEY_AUTH_SDK_PROPERTIES);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    public final List<String> component2() {
        return this.scopes;
    }

    /* renamed from: component3, reason: from getter */
    public final String getResponseType() {
        return this.responseType;
    }

    /* renamed from: component4, reason: from getter */
    public final LoginProperties getLoginProperties() {
        return this.loginProperties;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getForceConfirm() {
        return this.forceConfirm;
    }

    /* renamed from: component6, reason: from getter */
    public final PassportUidImpl getSelectedUid() {
        return this.selectedUid;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCallerAppId() {
        return this.callerAppId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCallerFingerprint() {
        return this.callerFingerprint;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTurboAppIdentifier() {
        return this.turboAppIdentifier;
    }

    public final AuthSdkProperties copy(String clientId, List<String> scopes, String responseType, LoginProperties loginProperties, boolean forceConfirm, PassportUidImpl selectedUid, String callerAppId, String callerFingerprint, String turboAppIdentifier) {
        return new AuthSdkProperties(clientId, scopes, responseType, loginProperties, forceConfirm, selectedUid, callerAppId, callerFingerprint, turboAppIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthSdkProperties)) {
            return false;
        }
        AuthSdkProperties authSdkProperties = (AuthSdkProperties) other;
        return jl40.l(this.clientId, authSdkProperties.clientId) && jl40.l(this.scopes, authSdkProperties.scopes) && jl40.l(this.responseType, authSdkProperties.responseType) && jl40.l(this.loginProperties, authSdkProperties.loginProperties) && this.forceConfirm == authSdkProperties.forceConfirm && jl40.l(this.selectedUid, authSdkProperties.selectedUid) && jl40.l(this.callerAppId, authSdkProperties.callerAppId) && jl40.l(this.callerFingerprint, authSdkProperties.callerFingerprint) && jl40.l(this.turboAppIdentifier, authSdkProperties.turboAppIdentifier);
    }

    public final String getCallerAppId() {
        return this.callerAppId;
    }

    public final String getCallerFingerprint() {
        return this.callerFingerprint;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final boolean getForceConfirm() {
        return this.forceConfirm;
    }

    public final LoginProperties getLoginProperties() {
        return this.loginProperties;
    }

    public final String getResponseType() {
        return this.responseType;
    }

    public final List<String> getScopes() {
        return this.scopes;
    }

    public final PassportUidImpl getSelectedUid() {
        return this.selectedUid;
    }

    public final String getTurboAppIdentifier() {
        return this.turboAppIdentifier;
    }

    public final String getTurboAppRedirectUri() {
        String str = this.turboAppIdentifier;
        if (str == null) {
            return null;
        }
        return b64.k("^https://", str, "yandexta://");
    }

    public int hashCode() {
        int e = unr0.e((this.loginProperties.hashCode() + unr0.b(unr0.c(this.clientId.hashCode() * 31, 31, this.scopes), 31, this.responseType)) * 31, 31, this.forceConfirm);
        PassportUidImpl passportUidImpl = this.selectedUid;
        int hashCode = (e + (passportUidImpl == null ? 0 : passportUidImpl.hashCode())) * 31;
        String str = this.callerAppId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.callerFingerprint;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.turboAppIdentifier;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isTurboApp() {
        return this.turboAppIdentifier != null;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_AUTH_SDK_PROPERTIES, this);
        return bundle;
    }

    public final SlothParams toSlothAuthSdk(Uid uid, String state) {
        String str = this.clientId;
        String str2 = this.responseType;
        String source = this.loginProperties.getSource();
        if (source == null) {
            source = "null";
        }
        String str3 = source;
        boolean isSocialAuthorizationEnabled = this.loginProperties.getVisualProperties().isSocialAuthorizationEnabled();
        boolean isNoReturnToHost = this.loginProperties.getVisualProperties().isNoReturnToHost();
        String mo243getAdditionalActionRequestJWfNWPw = this.loginProperties.mo243getAdditionalActionRequestJWfNWPw();
        if (mo243getAdditionalActionRequestJWfNWPw == null) {
            mo243getAdditionalActionRequestJWfNWPw = null;
        }
        String str4 = mo243getAdditionalActionRequestJWfNWPw;
        SlothTheme W = com.yandex.passport.internal.properties.u.W(this.loginProperties.getTheme());
        Filter filter = this.loginProperties.getFilter();
        Filter.a aVar = new Filter.a();
        aVar.d(filter);
        aVar.c(PassportAccountType.CHILDISH);
        EnumSet supportedAccountTypes = aVar.a().getSupportedAccountTypes();
        ArrayList arrayList = new ArrayList(tcc.n(supportedAccountTypes, 10));
        Iterator it = supportedAccountTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(com.yandex.passport.internal.properties.u.V((PassportAccountType) it.next()));
        }
        EnumSet noneOf = EnumSet.noneOf(SlothAccountType.class);
        noneOf.addAll(arrayList);
        SlothLoginProperties slothLoginProperties = new SlothLoginProperties(str3, isSocialAuthorizationEnabled, isNoReturnToHost, false, str4, W, noneOf, false, null, null, 896, null);
        boolean z = this.forceConfirm;
        PassportUidImpl passportUidImpl = this.selectedUid;
        return new SlothParams(new com.yandex.passport.sloth.data.n(str, str2, slothLoginProperties, z, passportUidImpl != null ? com.yandex.passport.internal.util.p.B(passportUidImpl) : uid, this.callerAppId, this.callerFingerprint, state), com.yandex.passport.internal.util.p.u(this.loginProperties.getFilter().getPrimaryEnvironment()), null, new CommonWebProperties(true, null, false, false, 14, null), 4, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthSdkProperties(clientId=");
        sb.append(this.clientId);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", responseType=");
        sb.append(this.responseType);
        sb.append(", loginProperties=");
        sb.append(this.loginProperties);
        sb.append(", forceConfirm=");
        sb.append(this.forceConfirm);
        sb.append(", selectedUid=");
        sb.append(this.selectedUid);
        sb.append(", callerAppId=");
        sb.append(this.callerAppId);
        sb.append(", callerFingerprint=");
        sb.append(this.callerFingerprint);
        sb.append(", turboAppIdentifier=");
        return b64.p(sb, this.turboAppIdentifier, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.clientId);
        dest.writeStringList(this.scopes);
        dest.writeString(this.responseType);
        this.loginProperties.writeToParcel(dest, flags);
        dest.writeInt(this.forceConfirm ? 1 : 0);
        PassportUidImpl passportUidImpl = this.selectedUid;
        if (passportUidImpl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            passportUidImpl.writeToParcel(dest, flags);
        }
        dest.writeString(this.callerAppId);
        dest.writeString(this.callerFingerprint);
        dest.writeString(this.turboAppIdentifier);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuthSdkProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthSdkProperties createFromParcel(Parcel parcel) {
            return new AuthSdkProperties(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), LoginProperties.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PassportUidImpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthSdkProperties[] newArray(int i) {
            return new AuthSdkProperties[i];
        }
    }

    public static final AuthSdkProperties from(Bundle bundle, Activity activity) {
        Companion.getClass();
        return m.a(bundle, activity);
    }
}
