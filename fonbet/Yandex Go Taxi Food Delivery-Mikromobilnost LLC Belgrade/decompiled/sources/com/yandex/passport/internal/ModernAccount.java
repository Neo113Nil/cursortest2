package com.yandex.passport.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.KPassportStashCell;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Partition;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.internal.stash.Stash;
import com.yandex.passport.internal.stash.StashCell;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.uw51;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\f\b\u0081\b\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u0002:\u0002\u009c\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010&R \u0010<\u001a\u00020;8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u001d\u0010B\u001a\u00020\u00038\u0006¢\u0006\u0012\n\u0004\bB\u00100\u0012\u0004\bD\u0010A\u001a\u0004\bC\u0010\u001dR \u0010E\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bE\u00100\u0012\u0004\bG\u0010A\u001a\u0004\bF\u0010\u001dR\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bP\u0010\u001bR\u0014\u0010S\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u001dR\u001c\u0010V\u001a\u0004\u0018\u00010\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\bU\u0010A\u001a\u0004\bT\u0010\u001dR\u0016\u0010Y\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u001dR\u0013\u0010[\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010\u001dR\u0014\u0010\\\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u001bR\u0016\u0010a\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u001dR\u0011\u0010b\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bb\u0010]R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020d0c8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010k\u001a\u00020h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010m\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bl\u0010\u001dR\u0011\u0010o\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bn\u0010]R\u0011\u0010q\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bp\u0010]R\u0011\u0010s\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\br\u0010]R\u0011\u0010t\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bt\u0010]R\u0011\u0010u\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bu\u0010]R#\u0010z\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030w0v8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0011\u0010|\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b{\u0010]R\u0014\u0010~\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010]R\u0015\u0010\u0080\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010]R\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u001dR\u0018\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u001dR\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u001dR\u0018\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u001dR\u0018\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\u001dR\u0016\u0010\u008c\u0001\u001a\u00020-8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010]R\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u001dR\u0016\u0010\u0090\u0001\u001a\u00020L8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010NR\u0014\u0010\u0093\u0001\u001a\u00030\u0091\u00018F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010NR\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010\u001dR\u0013\u0010\u0096\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010]R\u0013\u0010\u0097\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010]R\u0013\u0010\u0098\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010]R\u0013\u0010\u0099\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010]R\u0013\u0010\u009a\u0001\u001a\u00020-8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010]¨\u0006\u009d\u0001"}, d2 = {"Lcom/yandex/passport/internal/ModernAccount;", "Lcom/yandex/passport/common/account/a;", "Landroid/os/Parcelable;", "", "name", "Lcom/yandex/passport/common/core/Uid;", "uid", "masterUid", "Lcom/yandex/passport/common/account/MasterToken;", "masterToken", "Lcom/yandex/passport/common/core/UserInfo;", "userInfo", "Lcom/yandex/passport/internal/stash/Stash;", "stash", "<init>", "(Ljava/lang/String;Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/account/MasterToken;Lcom/yandex/passport/common/core/UserInfo;Lcom/yandex/passport/internal/stash/Stash;)V", "Lcom/yandex/passport/internal/LegacyExtraData;", "assembleLegacyExtraData", "()Lcom/yandex/passport/internal/LegacyExtraData;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/passport/common/core/Uid;", "component3", "component4", "()Lcom/yandex/passport/common/account/MasterToken;", "component5", "()Lcom/yandex/passport/common/core/UserInfo;", "component6", "()Lcom/yandex/passport/internal/stash/Stash;", "copy", "(Ljava/lang/String;Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/common/account/MasterToken;Lcom/yandex/passport/common/core/UserInfo;Lcom/yandex/passport/internal/stash/Stash;)Lcom/yandex/passport/internal/ModernAccount;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/yandex/passport/common/core/Uid;", "getUid", "getMasterUid", "Lcom/yandex/passport/common/account/MasterToken;", "getMasterToken", "Lcom/yandex/passport/common/core/UserInfo;", "getUserInfo", "Lcom/yandex/passport/internal/stash/Stash;", "getStash", "Landroid/accounts/Account;", "account", "Landroid/accounts/Account;", "getAccount", "()Landroid/accounts/Account;", "getAccount$annotations", "()V", "legacyAccountType", "getLegacyAccountType", "getLegacyAccountType$annotations", "accountName", "getAccountName", "getAccountName$annotations", "Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", "getUpgradeStatus", "()Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", "upgradeStatus", "Lcom/yandex/passport/common/time/a;", "getUpgradePostponedAt-R7zlAxo", "()J", "upgradePostponedAt", "getXTokenIssuedAt", "xTokenIssuedAt", "getPrimaryDisplayName", "primaryDisplayName", "getSecondaryDisplayName", "getSecondaryDisplayName$annotations", "secondaryDisplayName", "Lcom/yandex/passport/common/url/b;", "getAvatarUrl-xSn-V4o", "avatarUrl", "getPhoneNumber", "phoneNumber", "isAvatarEmpty", "()Z", "getPrimaryAliasType", "primaryAliasType", "getSocialProviderCode", "socialProviderCode", "isChild", "", "Lcom/yandex/passport/common/core/Partition;", "getPartitions", "()Ljava/util/List;", "partitions", "Lcom/yandex/passport/api/PassportAccountType;", "getAccountType", "()Lcom/yandex/passport/api/PassportAccountType;", "accountType", "getMachineReadableLogin", "machineReadableLogin", "getHasPlusCard", "hasPlusCard", "getHasProCard", "hasProCard", "getHasFamily", "hasFamily", "isDriveUser", "isTaxiCompanyBound", "", "", "getFilterParameters", "()Ljava/util/Map;", "filterParameters", "getHasMasterToken", "hasMasterToken", "getHasPlus", "hasPlus", "getHasMusicSubscription", "hasMusicSubscription", "getFirstName", "firstName", "getLastName", "lastName", "getNativeDefaultEmail", "nativeDefaultEmail", "getDisplayLogin", "displayLogin", "getNormalizedDisplayLogin", "normalizedDisplayLogin", "getHasPassword", "hasPassword", "getPublicId", "publicId", "getRetrievalTime-R7zlAxo", "retrievalTime", "", "getLocationId", "locationId", "getPublicName", "publicName", "isPortal", "isPhonish", "isMailish", "isSocial", "isPdd", "Companion", "com/yandex/passport/internal/k", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ModernAccount implements com.yandex.passport.common.account.a, Parcelable {
    public static final int $stable = 8;
    public static final String ACCOUNT_NAME_PREFIX_TESTING = "[TS] ";
    public static final String ACCOUNT_NAME_SUFFIX_TEAM = "@yandex-team.ru";
    private final Account account;
    private final String accountName;
    private final String legacyAccountType;
    private final MasterToken masterToken;
    private final Uid masterUid;
    private final String name;
    private final Stash stash;
    private final Uid uid;
    private final UserInfo userInfo;
    public static final k Companion = new k();
    public static final Parcelable.Creator<ModernAccount> CREATOR = new Creator();

    public ModernAccount(String str, Uid uid, Uid uid2, MasterToken masterToken, UserInfo userInfo, Stash stash) {
        this.name = str;
        this.uid = uid;
        this.masterUid = uid2;
        this.masterToken = masterToken;
        this.userInfo = userInfo;
        this.stash = stash;
        this.account = new Account(str, i.a);
        this.legacyAccountType = k.a(Companion, userInfo.getPrimaryAliasType(), com.yandex.passport.internal.ui.c.t(getUid().getEnvironment()));
        this.accountName = str;
    }

    public static /* synthetic */ ModernAccount copy$default(ModernAccount modernAccount, String str, Uid uid, Uid uid2, MasterToken masterToken, UserInfo userInfo, Stash stash, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modernAccount.name;
        }
        if ((i & 2) != 0) {
            uid = modernAccount.uid;
        }
        if ((i & 4) != 0) {
            uid2 = modernAccount.masterUid;
        }
        if ((i & 8) != 0) {
            masterToken = modernAccount.masterToken;
        }
        if ((i & 16) != 0) {
            userInfo = modernAccount.userInfo;
        }
        if ((i & 32) != 0) {
            stash = modernAccount.stash;
        }
        UserInfo userInfo2 = userInfo;
        Stash stash2 = stash;
        return modernAccount.copy(str, uid, uid2, masterToken, userInfo2, stash2);
    }

    public static /* synthetic */ void getAccount$annotations() {
    }

    public static /* synthetic */ void getAccountName$annotations() {
    }

    public static /* synthetic */ void getLegacyAccountType$annotations() {
    }

    @jxi
    public static /* synthetic */ void getSecondaryDisplayName$annotations() {
    }

    public final LegacyExtraData assembleLegacyExtraData() {
        boolean t = com.yandex.passport.internal.ui.c.t(getUid().getEnvironment());
        UserInfo userInfo = this.userInfo;
        return new LegacyExtraData(Long.valueOf(this.userInfo.getUidValue()), !t ? userInfo.getDisplayName() : userInfo.getNormalizedDisplayLogin().concat(ACCOUNT_NAME_SUFFIX_TEAM), this.userInfo.getAvatarUrl(), Boolean.valueOf(this.userInfo.isAvatarEmpty()), Boolean.valueOf(this.userInfo.isYandexoid()), Boolean.valueOf(this.userInfo.isBetaTester()), this.stash.get(KPassportStashCell.DISK_PIN_CODE), this.stash.get(KPassportStashCell.MAIL_PIN_CODE), 0L);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Uid getUid() {
        return this.uid;
    }

    /* renamed from: component3, reason: from getter */
    public final Uid getMasterUid() {
        return this.masterUid;
    }

    /* renamed from: component4, reason: from getter */
    public final MasterToken getMasterToken() {
        return this.masterToken;
    }

    /* renamed from: component5, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final Stash getStash() {
        return this.stash;
    }

    public final ModernAccount copy(String name, Uid uid, Uid masterUid, MasterToken masterToken, UserInfo userInfo, Stash stash) {
        return new ModernAccount(name, uid, masterUid, masterToken, userInfo, stash);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModernAccount)) {
            return false;
        }
        ModernAccount modernAccount = (ModernAccount) other;
        return jl40.l(this.name, modernAccount.name) && jl40.l(this.uid, modernAccount.uid) && jl40.l(this.masterUid, modernAccount.masterUid) && jl40.l(this.masterToken, modernAccount.masterToken) && jl40.l(this.userInfo, modernAccount.userInfo) && jl40.l(this.stash, modernAccount.stash);
    }

    public Account getAccount() {
        return this.account;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public final PassportAccountType getAccountType() {
        com.yandex.passport.api.l lVar = PassportAccountType.Companion;
        UserInfo userInfo = this.userInfo;
        lVar.getClass();
        if (userInfo.isChild()) {
            return PassportAccountType.CHILDISH;
        }
        return com.yandex.passport.api.l.a(userInfo.getPrimaryAliasType(), userInfo.getHasPlus() || userInfo.getHasMusicSubscription());
    }

    /* renamed from: getAvatarUrl-xSn-V4o, reason: not valid java name */
    public String m296getAvatarUrlxSnV4o() {
        String avatarUrl = this.userInfo.getAvatarUrl();
        if (avatarUrl != null) {
            return avatarUrl;
        }
        return null;
    }

    public String getDisplayLogin() {
        return this.userInfo.getDisplayLogin();
    }

    public final Map<String, Set<String>> getFilterParameters() {
        return this.userInfo.getFilterParameters();
    }

    public String getFirstName() {
        return this.userInfo.getFirstName();
    }

    public final boolean getHasFamily() {
        return this.userInfo.getHasFamily();
    }

    public final boolean getHasMasterToken() {
        return this.userInfo.getHasMasterToken();
    }

    public boolean getHasMusicSubscription() {
        return this.userInfo.getHasMusicSubscription();
    }

    public boolean getHasPassword() {
        return this.userInfo.getHasPassword();
    }

    public boolean getHasPlus() {
        return this.userInfo.getHasPlus();
    }

    public final boolean getHasPlusCard() {
        return this.userInfo.getHasPlusCard();
    }

    public final boolean getHasProCard() {
        return this.userInfo.getHasProCard();
    }

    public String getLastName() {
        return this.userInfo.getLastName();
    }

    public final String getLegacyAccountType() {
        return this.legacyAccountType;
    }

    public final long getLocationId() {
        Long locationId = this.userInfo.getLocationId();
        if (locationId != null) {
            return locationId.longValue();
        }
        return 0L;
    }

    public final String getMachineReadableLogin() {
        return this.userInfo.getMachineReadableLogin();
    }

    public MasterToken getMasterToken() {
        return this.masterToken;
    }

    public final Uid getMasterUid() {
        return this.masterUid;
    }

    public final String getName() {
        return this.name;
    }

    public String getNativeDefaultEmail() {
        return this.userInfo.getNativeDefaultEmail();
    }

    public String getNormalizedDisplayLogin() {
        return this.userInfo.getNormalizedDisplayLogin();
    }

    public final List<Partition> getPartitions() {
        return this.userInfo.getPartitions();
    }

    public final String getPhoneNumber() {
        return this.userInfo.getPhoneNumber();
    }

    public int getPrimaryAliasType() {
        return this.userInfo.getPrimaryAliasType();
    }

    public String getPrimaryDisplayName() {
        boolean t = com.yandex.passport.internal.ui.c.t(getUid().getEnvironment());
        UserInfo userInfo = this.userInfo;
        return t ? userInfo.getNormalizedDisplayLogin().concat(ACCOUNT_NAME_SUFFIX_TEAM) : userInfo.getPrimaryAliasType() != 10 ? this.userInfo.getDisplayName() : this.name;
    }

    public final String getPublicId() {
        return this.userInfo.getPublicId();
    }

    public final String getPublicName() {
        return this.userInfo.getPublicName();
    }

    /* renamed from: getRetrievalTime-R7zlAxo, reason: not valid java name */
    public long m297getRetrievalTimeR7zlAxo() {
        return this.userInfo.m263getRetrievalTimeR7zlAxo();
    }

    public String getSecondaryDisplayName() {
        if (com.yandex.passport.internal.ui.c.t(getUid().getEnvironment())) {
            return null;
        }
        int primaryAliasType = this.userInfo.getPrimaryAliasType();
        if (primaryAliasType == 1 || primaryAliasType == 5 || primaryAliasType == 7) {
            String displayName = this.userInfo.getDisplayName();
            String nativeDefaultEmail = this.userInfo.getNativeDefaultEmail();
            String normalizedDisplayLogin = this.userInfo.getNormalizedDisplayLogin();
            if (nativeDefaultEmail != null && !nativeDefaultEmail.equals(displayName)) {
                return nativeDefaultEmail;
            }
            if (normalizedDisplayLogin != null && !normalizedDisplayLogin.equals(displayName)) {
                return normalizedDisplayLogin;
            }
        }
        return null;
    }

    public String getSocialProviderCode() {
        String socialProviderCode = this.userInfo.getSocialProviderCode();
        return (socialProviderCode == null && isMailish()) ? this.stash.get(StashCell.MAILISH_SOCIAL_CODE) : socialProviderCode;
    }

    public final Stash getStash() {
        return this.stash;
    }

    @Override // com.yandex.passport.common.account.a
    public Uid getUid() {
        return this.uid;
    }

    /* renamed from: getUpgradePostponedAt-R7zlAxo, reason: not valid java name */
    public final long m298getUpgradePostponedAtR7zlAxo() {
        long b;
        String str = this.stash.get(StashCell.UPGRADE_POSTPONED_AT);
        if (str == null) {
            return 0L;
        }
        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, Long.parseLong(str));
        return b;
    }

    public final PassportAccountUpgradeStatus getUpgradeStatus() {
        PassportAccountUpgradeStatus passportAccountUpgradeStatus;
        String str = this.stash.get(StashCell.UPGRADE_STATUS);
        int i = 0;
        int parseInt = str != null ? Integer.parseInt(str) : 0;
        PassportAccountUpgradeStatus[] values = PassportAccountUpgradeStatus.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                passportAccountUpgradeStatus = null;
                break;
            }
            passportAccountUpgradeStatus = values[i];
            if (passportAccountUpgradeStatus.ordinal() == parseInt) {
                break;
            }
            i++;
        }
        return passportAccountUpgradeStatus == null ? PassportAccountUpgradeStatus.NOT_NEEDED : passportAccountUpgradeStatus;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final int getXTokenIssuedAt() {
        return this.userInfo.getXTokenIssuedAt();
    }

    public int hashCode() {
        int a = uw51.a(this.uid, this.name.hashCode() * 31, 31);
        Uid uid = this.masterUid;
        return this.stash.hashCode() + ((this.userInfo.hashCode() + ((this.masterToken.hashCode() + ((a + (uid == null ? 0 : uid.hashCode())) * 31)) * 31)) * 31);
    }

    public boolean isAvatarEmpty() {
        return this.userInfo.isAvatarEmpty();
    }

    public final boolean isChild() {
        return this.userInfo.isChild();
    }

    public final boolean isDriveUser() {
        return this.userInfo.isDriveUser();
    }

    public final boolean isMailish() {
        return getPrimaryAliasType() == 12;
    }

    public final boolean isPdd() {
        return getPrimaryAliasType() == 7;
    }

    public final boolean isPhonish() {
        return getPrimaryAliasType() == 10;
    }

    public final boolean isPortal() {
        return getPrimaryAliasType() == 1;
    }

    public final boolean isSocial() {
        return getPrimaryAliasType() == 6;
    }

    public final boolean isTaxiCompanyBound() {
        return this.userInfo.isTaxiCompanyBound();
    }

    public String toString() {
        return "ModernAccount(name=" + this.name + ", uid=" + this.uid + ", masterUid=" + this.masterUid + ", masterToken=" + this.masterToken + ", userInfo=" + this.userInfo + ", stash=" + this.stash + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeParcelable(this.uid, flags);
        dest.writeParcelable(this.masterUid, flags);
        dest.writeParcelable(this.masterToken, flags);
        dest.writeParcelable(this.userInfo, flags);
        this.stash.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Creator implements Parcelable.Creator<ModernAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModernAccount createFromParcel(Parcel parcel) {
            return new ModernAccount(parcel.readString(), (Uid) parcel.readParcelable(ModernAccount.class.getClassLoader()), (Uid) parcel.readParcelable(ModernAccount.class.getClassLoader()), (MasterToken) parcel.readParcelable(ModernAccount.class.getClassLoader()), (UserInfo) parcel.readParcelable(ModernAccount.class.getClassLoader()), Stash.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ModernAccount[] newArray(int i) {
            return new ModernAccount[i];
        }
    }

    public /* synthetic */ ModernAccount(String str, Uid uid, Uid uid2, MasterToken masterToken, UserInfo userInfo, Stash stash, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uid, (i & 4) != 0 ? null : uid2, masterToken, userInfo, stash);
    }
}
