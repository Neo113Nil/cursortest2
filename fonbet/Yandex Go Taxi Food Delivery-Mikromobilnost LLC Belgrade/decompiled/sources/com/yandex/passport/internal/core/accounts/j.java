package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.core.auth.AuthenticationService;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.k6;
import com.yandex.passport.internal.report.reporters.y0;
import com.yandex.passport.internal.report.yd;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.sl41;
import defpackage.tje;
import defpackage.w53;
import defpackage.zy11;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class j {
    public static final Object j = new Object();
    public final AccountManager a;
    public final r b;
    public final Context c;
    public final c0 d;
    public final y0 e;
    public final com.yandex.passport.internal.storage.i f;
    public final com.yandex.passport.data.network.core.o g;
    public final DatabaseHelper h;
    public final com.yandex.passport.internal.report.reporters.t i;

    public j(AccountManager accountManager, r rVar, Context context, c0 c0Var, y0 y0Var, com.yandex.passport.internal.storage.i iVar, com.yandex.passport.common.a aVar, com.yandex.passport.data.network.core.o oVar, DatabaseHelper databaseHelper, com.yandex.passport.internal.report.reporters.t tVar) {
        this.a = accountManager;
        this.b = rVar;
        this.c = context;
        this.d = c0Var;
        this.e = y0Var;
        this.f = iVar;
        this.g = oVar;
        this.h = databaseHelper;
        this.i = tVar;
    }

    public static void h(f fVar) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Remove account result false", 8);
        }
        fVar.onFailure(new RuntimeException("Failed to remove account"));
    }

    public final h a(AccountRow accountRow) {
        e();
        Bundle bundle = new Bundle();
        String str = accountRow.uidString;
        if (str != null) {
            bundle.putString("uid", str);
        }
        String str2 = accountRow.userInfoBody;
        if (str2 != null) {
            bundle.putString("user_info_body", str2);
        }
        String str3 = accountRow.userInfoMeta;
        if (str3 != null) {
            bundle.putString("user_info_meta", str3);
        }
        String str4 = accountRow.stashBody;
        if (str4 != null) {
            bundle.putString("stash", str4);
        }
        bundle.putString("account_type", accountRow.legacyAccountType);
        bundle.putString("affinity", accountRow.legacyAffinity);
        bundle.putString("extra_data", accountRow.legacyExtraDataBody);
        String b = this.b.b(accountRow.masterTokenValue);
        Account account = accountRow.toAccount();
        boolean addAccountExplicitly = this.a.addAccountExplicitly(account, b, bundle);
        String str5 = accountRow.uidString;
        String str6 = accountRow.stashBody;
        this.e.j(str6 != null ? Integer.valueOf(str6.length()) : null, str5);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "addAccount: account=" + account + " result=" + addAccountExplicitly + " bundle=" + bundle, 8);
        }
        return new h(account, addAccountExplicitly);
    }

    public final ArrayList b() {
        Account[] accountArr;
        e();
        Account[] c = c();
        ArrayList arrayList = new ArrayList();
        int length = c.length;
        int i = 0;
        while (i < length) {
            Account account = c[i];
            String g = g(account);
            AccountRow accountRow = null;
            if (g == null) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "System account '" + account + "' not found or it has no master token value", 8);
                }
                accountArr = c;
            } else {
                AccountManager accountManager = this.a;
                String userData = accountManager.getUserData(account, "uid");
                String userData2 = accountManager.getUserData(account, "user_info_body");
                String userData3 = accountManager.getUserData(account, "user_info_meta");
                String userData4 = accountManager.getUserData(account, "stash");
                String userData5 = accountManager.getUserData(account, "account_type");
                String userData6 = accountManager.getUserData(account, "affinity");
                accountArr = c;
                String userData7 = accountManager.getUserData(account, "extra_data");
                if (g(account) == null) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        accountRow = null;
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "System account '" + account + "' not found or it has no master token value", 8);
                    } else {
                        accountRow = null;
                    }
                } else {
                    accountRow = new AccountRow(account.name, g, userData, userData2, userData3, userData4, userData5, userData6, userData7);
                }
            }
            if (accountRow != null) {
                arrayList.add(accountRow);
            }
            i++;
            c = accountArr;
        }
        return arrayList;
    }

    public final Account[] c() {
        e();
        return this.a.getAccountsByType(com.yandex.passport.internal.i.a);
    }

    public final LinkedHashMap d() {
        AuthenticatorDescription[] authenticatorTypes = this.a.getAuthenticatorTypes();
        int d = gw00.d(authenticatorTypes.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (AuthenticatorDescription authenticatorDescription : authenticatorTypes) {
            Pair pair = new Pair(authenticatorDescription.type, authenticatorDescription.packageName);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    public final String e() {
        String str = (String) d().get(com.yandex.passport.internal.i.a);
        if (str != null) {
            return str;
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "performAuthenticatorFix", 8);
        }
        c0 c0Var = this.d;
        w53 w53Var = new w53();
        com.yandex.passport.internal.analytics.t tVar = c0Var.a;
        com.yandex.passport.internal.analytics.k kVar = com.yandex.passport.internal.analytics.k.b;
        tVar.a(a0.r(), w53Var);
        synchronized (j) {
            j();
            String str2 = (String) d().get(com.yandex.passport.internal.i.a);
            c0 c0Var2 = this.d;
            if (str2 != null) {
                w53 w53Var2 = new w53();
                w53Var2.put("try", String.valueOf(1));
                c0Var2.a.a(a0.p(), w53Var2);
                return str2;
            }
            w53 w53Var3 = new w53();
            w53Var3.put("try", String.valueOf(1));
            c0Var2.a.a(a0.q(), w53Var3);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "call: timeout", e);
                }
            }
            String str3 = (String) d().get(com.yandex.passport.internal.i.a);
            c0 c0Var3 = this.d;
            if (str3 != null) {
                w53 w53Var4 = new w53();
                w53Var4.put("try", String.valueOf(2));
                com.yandex.passport.internal.analytics.t tVar2 = c0Var3.a;
                com.yandex.passport.internal.analytics.k kVar2 = com.yandex.passport.internal.analytics.k.b;
                tVar2.a(a0.p(), w53Var4);
                return str3;
            }
            w53 w53Var5 = new w53();
            w53Var5.put("try", String.valueOf(2));
            com.yandex.passport.internal.analytics.t tVar3 = c0Var3.a;
            com.yandex.passport.internal.analytics.k kVar3 = com.yandex.passport.internal.analytics.k.b;
            tVar3.a(a0.q(), w53Var5);
            ny61.r("Authenticator package name is null");
            return null;
        }
    }

    public final Set f(Account account) {
        e();
        Map<String, Integer> packagesAndVisibilityForAccount = this.a.getPackagesAndVisibilityForAccount(account);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : packagesAndVisibilityForAccount.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == 3) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public final String g(Account account) {
        q a = this.b.a(this.a.getPassword(account));
        if (a.a() != null) {
            Exception a2 = a.a();
            w53 w53Var = new w53();
            w53Var.put("error", Log.getStackTraceString(a2));
            com.yandex.passport.internal.analytics.t tVar = this.d.a;
            com.yandex.passport.internal.analytics.k kVar = com.yandex.passport.internal.analytics.k.b;
            tVar.a(a0.E(), w53Var);
        }
        return a.b();
    }

    public final void i(f fVar, String str) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Remove account result true", 8);
        }
        fVar.onSuccess();
        tje.X(new AndroidAccountManagerHelper$onSuccessfulAccountDeletion$2(this, str, null));
    }

    public final void j() {
        com.yandex.passport.internal.storage.i iVar = this.f;
        iVar.e.setValue(iVar, com.yandex.passport.internal.storage.i.m[3], null);
        Context context = this.c;
        String packageName = context.getPackageName();
        String canonicalName = AuthenticationService.class.getCanonicalName();
        if (canonicalName == null) {
            ny61.r("AuthenticationService::class canonical name is missing");
            return;
        }
        ComponentName componentName = new ComponentName(packageName, canonicalName);
        context.getPackageManager().setComponentEnabledSetting(componentName, 2, 1);
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 0);
    }

    public final void k(Account account, final String str, f fVar) {
        final f fVar2;
        e();
        final HandlerThread handlerThread = new HandlerThread("Passport-".concat("RemoveAccountCallback"));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        final String b = v.b();
        try {
            fVar2 = fVar;
            try {
                AccountManagerCallback<Bundle> accountManagerCallback = new AccountManagerCallback() { // from class: com.yandex.passport.internal.core.accounts.i
                    @Override // android.accounts.AccountManagerCallback
                    public final void run(AccountManagerFuture accountManagerFuture) {
                        String str2 = b;
                        f fVar3 = fVar2;
                        String str3 = str;
                        HandlerThread handlerThread2 = handlerThread;
                        try {
                            try {
                                v.a(str2);
                                boolean z = ((Bundle) accountManagerFuture.getResult()).getBoolean("booleanResult");
                                j jVar = this;
                                if (z) {
                                    jVar.i(fVar3, str3);
                                } else {
                                    jVar.getClass();
                                    j.h(fVar3);
                                }
                            } catch (Exception e) {
                                if (!(e instanceof OperationCanceledException) && !(e instanceof IOException) && !(e instanceof AuthenticatorException)) {
                                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed remove account " + e.getMessage(), e);
                                    }
                                    throw e;
                                }
                                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error remove account", e);
                                }
                                fVar3.onFailure(e);
                            }
                            v.a(str2);
                            handlerThread2.quitSafely();
                        } catch (Throwable th) {
                            v.a(str2);
                            handlerThread2.quitSafely();
                            throw th;
                        }
                    }
                };
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "accountManager::removeAccount started", 8);
                }
                this.a.removeAccount(account, null, accountManagerCallback, handler);
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "removeAccount in account manager is failed: " + exc.getMessage(), 8);
                }
                fVar2.onFailure(exc);
                v.a(b);
            }
        } catch (Exception e2) {
            e = e2;
            fVar2 = fVar;
        }
    }

    public final void l(Account account, String str, sl41 sl41Var) {
        e();
        String b = v.b();
        try {
            try {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "accountManager::removeAccountExplicitly started", 8);
                }
                if (this.a.removeAccountExplicitly(account)) {
                    i(sl41Var, str);
                } else {
                    h(sl41Var);
                }
                v.a(b);
            } catch (Exception e) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "removeAccountExplicitly in account manager is failed: " + e.getMessage(), 8);
                }
                sl41Var.onFailure(e);
                v.a(b);
            }
        } catch (Throwable th) {
            v.a(b);
            throw th;
        }
    }

    public final boolean m(Account account, String str, boolean z) {
        e();
        boolean accountVisibility = this.a.setAccountVisibility(account, str, z ? 1 : 3);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "setAccountVisibility: account=" + account + " packageName=" + str + " visible=" + z + " result=" + accountVisibility, 8);
        }
        return accountVisibility;
    }

    public final void n(Account account, String str) {
        AccountManager accountManager = this.a;
        String password = accountManager.getPassword(account);
        r rVar = this.b;
        q a = rVar.a(password);
        String b = rVar.b(str);
        w53 w53Var = new w53();
        w53Var.put("masked_old_encrypted", com.yandex.passport.internal.ui.sloth.e.l(password));
        w53Var.put("masked_old_decrypted", com.yandex.passport.internal.ui.sloth.e.l(a.b()));
        w53Var.put("masked_new_encrypted", com.yandex.passport.internal.ui.sloth.e.l(b));
        w53Var.put("masked_new_decrypted", com.yandex.passport.internal.ui.sloth.e.l(str));
        if (a.a() != null) {
            w53Var.put("old_decrypt_error", Log.getStackTraceString(a.a()));
        }
        com.yandex.passport.internal.analytics.t tVar = this.d.a;
        com.yandex.passport.internal.analytics.k kVar = com.yandex.passport.internal.analytics.k.b;
        tVar.a(a0.F(), w53Var);
        com.yandex.passport.common.util.a.i(new AndroidAccountManagerHelper$setPassword$1(this, a, null));
        accountManager.setPassword(account, b);
    }

    public final void o(Account account, String str) {
        e();
        this.a.setUserData(account, "extra_data", str);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateLegacyExtraData: account=" + account + " legacyExtraDataBody=" + str, 8);
        }
    }

    public final boolean p(AccountRow accountRow, String str) {
        Object failure;
        e();
        Account account = accountRow.toAccount();
        String g = g(account);
        if (g != null && g.equals(str)) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateMasterToken: update isn't required for account=" + account, 8);
            }
            return false;
        }
        n(account, str);
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateMasterToken: account=" + account + " masterTokenValue=" + str, 8);
        }
        try {
            this.h.updateDelayedAccount(AccountRow.copy$default(accountRow, null, str, null, null, null, null, null, null, null, 509, null));
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            this.i.f(k6.w, new jd(String.valueOf(accountRow.uidString), 3), new yd(a));
        }
        return true;
    }
}
