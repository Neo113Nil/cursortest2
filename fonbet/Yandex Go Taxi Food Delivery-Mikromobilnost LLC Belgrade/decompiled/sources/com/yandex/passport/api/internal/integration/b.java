package com.yandex.passport.api.internal.integration;

import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.account.c;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.tje;
import defpackage.w511;
import defpackage.wwg;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes15.dex */
public final class b {
    public final DatabaseHelper a;
    public final c b;
    public final String c;
    public final Bundle d;
    public final Bundle e = wwg.g(new Pair("version", 1));

    public b(DatabaseHelper databaseHelper, c cVar, String str, Bundle bundle) {
        this.a = databaseHelper;
        this.b = cVar;
        this.c = str;
        this.d = bundle;
    }

    public final Bundle a() {
        int i = a.a[TestInternalDataResponder$Method.valueOf(this.c).ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i != 2) {
            if (i != 3) {
                w511.b();
                return null;
            }
            Bundle bundle = this.d;
            if ((bundle != null ? bundle.getString(LegacyAccountType.STRING_LOGIN) : null) != null && bundle.getString(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD) != null) {
                Uid uid = ((ModernAccount) tje.Y(EmptyCoroutineContext.a, new TestInternalDataResponder$authorizeByCredentials$1(this, new UserCredentials(PassportEnvironmentImpl.from(bundle.getInt(WebViewActivity.KEY_ENVIRONMENT, Environment.PRODUCTION.getInteger())), bundle.getString(LegacyAccountType.STRING_LOGIN, ""), bundle.getString(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, ""), null), bundle.getString("captcha-answer"), null))).getUid();
                return wwg.g(new Pair(WebViewActivity.KEY_ENVIRONMENT, uid.getEnvironment()), new Pair("uid", Long.valueOf(uid.getValue())));
            }
            throw new RuntimeException(TestInternalDataResponder$Method.LOGIN_ACCOUNT + ": Invalid arguments");
        }
        Bundle bundle2 = new Bundle();
        List<AccountRow> accountRows = this.a.getAccountRows();
        bundle2.putInt("accounts-size", accountRows.size());
        for (AccountRow accountRow : accountRows) {
            bundle2.putString("account-" + accountRow + "-name", accountRow.name);
            bundle2.putString("account-" + accountRow + "-uid", accountRow.uidString);
            bundle2.putString("account-" + accountRow + "-legacy-account-type", accountRow.legacyAccountType);
            bundle2.putString("account-" + accountRow + "-legacy-affinity", accountRow.legacyAffinity);
        }
        com.yandex.passport.legacy.a.a("getAllAccountsFromBackup: " + bundle2);
        return bundle2;
    }
}
