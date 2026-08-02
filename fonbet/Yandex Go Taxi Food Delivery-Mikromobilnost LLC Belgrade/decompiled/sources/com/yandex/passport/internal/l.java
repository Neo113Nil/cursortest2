package com.yandex.passport.internal;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.internal.stash.Stash;

/* loaded from: classes15.dex */
public final class l {
    public static ModernAccount a(Environment environment, MasterToken masterToken, UserInfo userInfo, Stash stash, String str) {
        Uid uid = new Uid(environment, userInfo.getUidValue());
        Environment environment2 = uid.getEnvironment();
        int primaryAliasType = userInfo.getPrimaryAliasType();
        if (com.yandex.passport.internal.ui.c.t(environment2)) {
            str = userInfo.getNormalizedDisplayLogin().concat(ModernAccount.ACCOUNT_NAME_SUFFIX_TEAM);
        } else {
            if (primaryAliasType != 1) {
                if (primaryAliasType != 10) {
                    if (primaryAliasType != 12 && primaryAliasType != 5) {
                        if (primaryAliasType == 6) {
                            str = userInfo.getDisplayName() + " #" + uid.getValue();
                        } else if (primaryAliasType != 7) {
                            str = null;
                        }
                    }
                }
            }
            str = userInfo.getNormalizedDisplayLogin();
        }
        if (str == null || str.length() == 0) {
            str = userInfo.getDisplayName() + " #" + uid.getValue();
        }
        if (primaryAliasType == 5) {
            str = str.concat(" ﹫");
        } else if (primaryAliasType == 12) {
            str = str.concat(" ✉");
        }
        if (environment2 == Environment.TESTING || environment2 == Environment.TEAM_TESTING) {
            str = ModernAccount.ACCOUNT_NAME_PREFIX_TESTING.concat(str);
        } else if (environment2 == Environment.RC) {
            str = "[RC] ".concat(str);
        }
        String str2 = str;
        Environment environment3 = uid.getEnvironment();
        Long muidValue = userInfo.getMuidValue();
        return new ModernAccount(str2, uid, muidValue != null ? new Uid(environment3, muidValue.longValue()) : null, masterToken, userInfo, stash);
    }

    public static /* synthetic */ ModernAccount b(Environment environment, MasterToken masterToken, UserInfo userInfo, String str) {
        Stash.Companion.getClass();
        return a(environment, masterToken, userInfo, com.yandex.passport.internal.stash.a.a(), str);
    }
}
