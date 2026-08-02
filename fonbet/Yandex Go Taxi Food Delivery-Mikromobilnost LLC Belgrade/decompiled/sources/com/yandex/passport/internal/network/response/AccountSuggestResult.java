package com.yandex.passport.internal.network.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.PassportSocialConfiguration;
import defpackage.k4o;
import defpackage.oo31;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/yandex/passport/internal/network/response/AccountSuggestResult;", "Landroid/os/Parcelable;", "", "Lcom/yandex/passport/internal/network/response/AccountSuggestResult$SuggestedAccount;", "accounts", "Lcom/yandex/passport/internal/network/response/AccountSuggestResult$RegistrationFlow;", "allowedRegistrationFlows", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/util/List;", "getAccounts", "()Ljava/util/List;", "getAllowedRegistrationFlows", "SuggestedAccount", "RegistrationFlow", "AuthorizationFlow", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AccountSuggestResult implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountSuggestResult> CREATOR = new Creator();
    private final List<SuggestedAccount> accounts;
    private final List<RegistrationFlow> allowedRegistrationFlows;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/internal/network/response/AccountSuggestResult$AuthorizationFlow;", "", "", "value", "Ljava/lang/String;", "Companion", "com/yandex/passport/internal/network/response/a", "FULL", "INSTANT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthorizationFlow {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AuthorizationFlow[] $VALUES;
        public static final a Companion;
        public static final AuthorizationFlow FULL;
        public static final AuthorizationFlow INSTANT;
        private final String value;

        static {
            AuthorizationFlow authorizationFlow = new AuthorizationFlow("FULL", 0, "full");
            FULL = authorizationFlow;
            AuthorizationFlow authorizationFlow2 = new AuthorizationFlow("INSTANT", 1, "instant");
            INSTANT = authorizationFlow2;
            AuthorizationFlow[] authorizationFlowArr = {authorizationFlow, authorizationFlow2};
            $VALUES = authorizationFlowArr;
            $ENTRIES = kotlin.enums.a.a(authorizationFlowArr);
            Companion = new a();
        }

        public AuthorizationFlow(String str, int i, String str2) {
            this.value = str2;
        }

        public static AuthorizationFlow valueOf(String str) {
            return (AuthorizationFlow) Enum.valueOf(AuthorizationFlow.class, str);
        }

        public static AuthorizationFlow[] values() {
            return (AuthorizationFlow[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/internal/network/response/AccountSuggestResult$RegistrationFlow;", "", "", "value", "Ljava/lang/String;", "Companion", "com/yandex/passport/internal/network/response/b", "PORTAL", "NEO_PHONISH", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RegistrationFlow {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RegistrationFlow[] $VALUES;
        public static final b Companion;
        public static final RegistrationFlow NEO_PHONISH;
        public static final RegistrationFlow PORTAL;
        private final String value;

        static {
            RegistrationFlow registrationFlow = new RegistrationFlow("PORTAL", 0, "portal");
            PORTAL = registrationFlow;
            RegistrationFlow registrationFlow2 = new RegistrationFlow("NEO_PHONISH", 1, "neophonish");
            NEO_PHONISH = registrationFlow2;
            RegistrationFlow[] registrationFlowArr = {registrationFlow, registrationFlow2};
            $VALUES = registrationFlowArr;
            $ENTRIES = kotlin.enums.a.a(registrationFlowArr);
            Companion = new b();
        }

        public RegistrationFlow(String str, int i, String str2) {
            this.value = str2;
        }

        public static RegistrationFlow valueOf(String str) {
            return (RegistrationFlow) Enum.valueOf(RegistrationFlow.class, str);
        }

        public static RegistrationFlow[] values() {
            return (RegistrationFlow[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountSuggestResult(List<SuggestedAccount> list, List<? extends RegistrationFlow> list2) {
        this.accounts = list;
        this.allowedRegistrationFlows = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<SuggestedAccount> getAccounts() {
        return this.accounts;
    }

    public final List<RegistrationFlow> getAllowedRegistrationFlows() {
        return this.allowedRegistrationFlows;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator t = vfc.t(dest, this.accounts);
        while (t.hasNext()) {
            ((SuggestedAccount) t.next()).writeToParcel(dest, flags);
        }
        Iterator t2 = vfc.t(dest, this.allowedRegistrationFlows);
        while (t2.hasNext()) {
            dest.writeString(((RegistrationFlow) t2.next()).name());
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u00100\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010,R\u0011\u00101\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u0010,¨\u00062"}, d2 = {"Lcom/yandex/passport/internal/network/response/AccountSuggestResult$SuggestedAccount;", "Landroid/os/Parcelable;", "", "uid", LegacyAccountType.STRING_LOGIN, "avatarUrl", "displayName", "phoneNumber", "", "Lcom/yandex/passport/internal/network/response/AccountSuggestResult$AuthorizationFlow;", "authorizationFlows", "", "primaryAliasType", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "passportSocialConfiguration", "", "hasPlus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/yandex/passport/api/PassportSocialConfiguration;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "getLogin", "getAvatarUrl", "getDisplayName", "getPhoneNumber", "Ljava/util/List;", "getAuthorizationFlows", "()Ljava/util/List;", CA20Status.STATUS_USER_I, "getPrimaryAliasType", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "getPassportSocialConfiguration", "()Lcom/yandex/passport/api/PassportSocialConfiguration;", "Z", "getHasPlus", "()Z", "getHasFullAuth", "hasFullAuth", "getHasInstantAuth", "hasInstantAuth", "isSocial", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuggestedAccount implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SuggestedAccount> CREATOR = new Creator();
        private final List<AuthorizationFlow> authorizationFlows;
        private final String avatarUrl;
        private final String displayName;
        private final boolean hasPlus;
        private final String login;
        private final PassportSocialConfiguration passportSocialConfiguration;
        private final String phoneNumber;
        private final int primaryAliasType;
        private final String uid;

        /* JADX WARN: Multi-variable type inference failed */
        public SuggestedAccount(String str, String str2, String str3, String str4, String str5, List<? extends AuthorizationFlow> list, int i, PassportSocialConfiguration passportSocialConfiguration, boolean z) {
            this.uid = str;
            this.login = str2;
            this.avatarUrl = str3;
            this.displayName = str4;
            this.phoneNumber = str5;
            this.authorizationFlows = list;
            this.primaryAliasType = i;
            this.passportSocialConfiguration = passportSocialConfiguration;
            this.hasPlus = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<AuthorizationFlow> getAuthorizationFlows() {
            return this.authorizationFlows;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final boolean getHasFullAuth() {
            return this.authorizationFlows.contains(AuthorizationFlow.FULL);
        }

        public final boolean getHasInstantAuth() {
            return this.authorizationFlows.contains(AuthorizationFlow.INSTANT);
        }

        public final boolean getHasPlus() {
            return this.hasPlus;
        }

        public final String getLogin() {
            return this.login;
        }

        public final PassportSocialConfiguration getPassportSocialConfiguration() {
            return this.passportSocialConfiguration;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final int getPrimaryAliasType() {
            return this.primaryAliasType;
        }

        public final String getUid() {
            return this.uid;
        }

        public final boolean isSocial() {
            return this.primaryAliasType == 6;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.uid);
            dest.writeString(this.login);
            dest.writeString(this.avatarUrl);
            dest.writeString(this.displayName);
            dest.writeString(this.phoneNumber);
            Iterator t = vfc.t(dest, this.authorizationFlows);
            while (t.hasNext()) {
                dest.writeString(((AuthorizationFlow) t.next()).name());
            }
            dest.writeInt(this.primaryAliasType);
            PassportSocialConfiguration passportSocialConfiguration = this.passportSocialConfiguration;
            if (passportSocialConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(passportSocialConfiguration.name());
            }
            dest.writeInt(this.hasPlus ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SuggestedAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuggestedAccount createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(AuthorizationFlow.valueOf(parcel.readString()));
                }
                return new SuggestedAccount(readString, readString2, readString3, readString4, readString5, arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : PassportSocialConfiguration.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SuggestedAccount[] newArray(int i) {
                return new SuggestedAccount[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSuggestResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSuggestResult createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(SuggestedAccount.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(RegistrationFlow.valueOf(parcel.readString()));
            }
            return new AccountSuggestResult(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSuggestResult[] newArray(int i) {
            return new AccountSuggestResult[i];
        }
    }
}
