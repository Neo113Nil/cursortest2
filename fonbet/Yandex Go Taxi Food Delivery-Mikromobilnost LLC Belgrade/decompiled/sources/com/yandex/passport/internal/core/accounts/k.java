package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.text.TextUtils;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.LegacyExtraData;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.report.reporters.DropPlace;
import com.yandex.passport.internal.stash.Stash;
import defpackage.w53;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class k {
    public final g a;
    public final com.yandex.passport.internal.network.client.c b;
    public final c0 c;

    public k(g gVar, com.yandex.passport.internal.network.client.c cVar, c0 c0Var) {
        this.a = gVar;
        this.b = cVar;
        this.c = c0Var;
    }

    public final ModernAccount a(AccountRow accountRow, com.yandex.passport.internal.analytics.m mVar, DropPlace dropPlace) {
        g gVar = this.a;
        com.yandex.passport.legacy.a.a("repairCorruptedAccount: repairing " + accountRow);
        Environment environment = Environment.PRODUCTION;
        MasterToken from = MasterToken.from(accountRow.masterTokenValue);
        Account account = accountRow.toAccount();
        try {
            UserInfo n = this.b.a(environment).n(from);
            b(accountRow, "user_info_refreshed", mVar);
            com.yandex.passport.internal.stash.a aVar = Stash.Companion;
            LegacyExtraData optionalFrom = LegacyExtraData.optionalFrom(accountRow.legacyExtraDataBody);
            aVar.getClass();
            ModernAccount modernAccount = new ModernAccount(account.name, a0.b(environment, n.getUidValue()), a0.c(environment, n.getMuidValue()), from, n, com.yandex.passport.internal.stash.a.c(optionalFrom));
            gVar.k(modernAccount, mVar);
            com.yandex.passport.legacy.a.a("repairCorruptedAccount: repaired " + modernAccount);
            return modernAccount;
        } catch (InvalidTokenException e) {
            b(accountRow, "master_token_invalid", mVar);
            gVar.e.j(dropPlace, null, null);
            if (gVar.a.p(accountRow, "-")) {
                com.yandex.passport.internal.core.announcing.c.c(gVar.b, com.yandex.passport.internal.analytics.i.f);
            }
            throw e;
        }
    }

    public final void b(AccountRow accountRow, String str, com.yandex.passport.internal.analytics.m mVar) {
        LegacyExtraData optionalFrom = LegacyExtraData.optionalFrom(accountRow.legacyExtraDataBody);
        if (optionalFrom == null || optionalFrom.uidValue == null) {
            String str2 = accountRow.name;
            String str3 = accountRow.masterTokenValue;
            long j = optionalFrom != null ? optionalFrom.updatedTimestamp : 0L;
            String str4 = optionalFrom != null ? optionalFrom.displayName : null;
            c0 c0Var = this.c;
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("account_name", str2);
            w53Var.put(ACSPConstants.STATUS, str);
            w53Var.put(CRLReasonCodeExtension.REASON, mVar.a);
            if (!TextUtils.isEmpty(str4)) {
                w53Var.put("display_name", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                w53Var.put("master_token", str3.substring(0, str3.length() / 2));
            }
            if (j > 0) {
                w53Var.put("max_timestamp", String.valueOf(j));
            }
            c0Var.a.a(com.yandex.passport.internal.analytics.i.l, w53Var);
        }
    }
}
