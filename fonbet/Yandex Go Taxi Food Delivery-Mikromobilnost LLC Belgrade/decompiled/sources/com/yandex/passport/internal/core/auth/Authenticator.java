package com.yandex.passport.internal.core.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.R;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.account.b;
import com.yandex.passport.internal.core.accounts.v;
import com.yandex.passport.internal.core.announcing.c;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.passport.internal.usecase.c1;
import com.yandex.passport.internal.usecase.d1;
import com.yandex.passport.internal.usecase.g1;
import com.yandex.passport.legacy.a;
import defpackage.oyr;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class Authenticator extends AbstractAccountAuthenticator {
    private final c accountsChangesAnnouncer;
    private final Context context;
    private final b currentAccountStorage;
    private final DatabaseHelper dbHelper;
    private final g1 revokeMasterTokenWrapper;

    public Authenticator(Context context, g1 g1Var, DatabaseHelper databaseHelper, c cVar, b bVar) {
        super(context);
        this.context = context;
        this.dbHelper = databaseHelper;
        this.revokeMasterTokenWrapper = g1Var;
        this.accountsChangesAnnouncer = cVar;
        this.currentAccountStorage = bVar;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
        StringBuilder sb = new StringBuilder("addAccount: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" accountType=");
        sb.append(str);
        sb.append(" authTokenType=");
        sb.append(str2);
        sb.append(" requiredFeatures.length=");
        sb.append(strArr != null ? Integer.valueOf(strArr.length) : null);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        a.a(sb.toString());
        Context context = this.context;
        GlobalRouterActivity.Companion.getClass();
        Intent a = com.yandex.passport.internal.ui.router.c.a(context, null, true, null, "com.yandex.passport.ACTION_SYSTEM_ADD_ACCOUNT");
        a.setAction("com.yandex.passport.ACTION_SYSTEM_ADD_ACCOUNT");
        a.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", a);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
        StringBuilder sb = new StringBuilder("confirmCredentials: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        a.a(sb.toString());
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        a.a("editProperties: response=" + accountAuthenticatorResponse + " accountType=" + str);
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) throws NetworkErrorException {
        boolean isEmpty = v.a.isEmpty();
        a.a("getAccountRemovalAllowed: response=" + accountAuthenticatorResponse + " account=" + account + " fromSystemSettings=" + isEmpty);
        if (isEmpty) {
            ModernAccount findAccountByName = this.dbHelper.findAccountByName(account.name);
            if (findAccountByName == null) {
                a.d(new IllegalArgumentException(oyr.t(new StringBuilder("Account with name "), account.name, " not found in db to revoke token")));
            } else {
                this.accountsChangesAnnouncer.b(findAccountByName, true);
                this.currentAccountStorage.a(findAccountByName.getUid());
                this.revokeMasterTokenWrapper.a(new c1(findAccountByName, findAccountByName.getMasterToken(), new d1(account), findAccountByName.getUid(), RevokePlace.AUTHENTICATOR, true));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", true);
        return bundle;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        StringBuilder sb = new StringBuilder("getAuthToken: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" authTokenType=");
        sb.append(str);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        a.a(sb.toString());
        throw new UnsupportedOperationException();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String str) {
        a.a("getAuthTokenLabel: authTokenType=" + str);
        return this.context.getString(R.string.passport_auth_token_label);
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
        StringBuilder sb = new StringBuilder("hasFeatures: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" paramArray=");
        sb.append(strArr != null ? Arrays.asList(strArr) : null);
        a.a(sb.toString());
        Bundle bundle = new Bundle();
        bundle.putBoolean("booleanResult", false);
        return bundle;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
        StringBuilder sb = new StringBuilder("updateCredentials: response=");
        sb.append(accountAuthenticatorResponse);
        sb.append(" account=");
        sb.append(account);
        sb.append(" authTokenType=");
        sb.append(str);
        sb.append(" options=");
        sb.append(bundle != null ? bundle.toString() : null);
        a.a(sb.toString());
        throw new UnsupportedOperationException();
    }
}
