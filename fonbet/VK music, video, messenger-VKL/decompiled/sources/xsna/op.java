package xsna;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.sdk.SharedKt;

/* compiled from: AccountManagerRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class op implements mp {
    public final Context a;
    public final mxi0 b;
    public final AccountManager c;
    public final bpn0 d;

    public op(Context context, mxi0 mxi0Var) {
        AccountManager accountManager = AccountManager.get(context);
        this.a = context;
        this.b = mxi0Var;
        this.c = accountManager;
        this.d = new bpn0(new np(this, 0));
    }

    @Override // xsna.mp
    public final hp a(UserId userId) {
        Integer m;
        Long n;
        Integer m2;
        AccountManager accountManager = this.c;
        try {
            Account i = i(userId);
            if (i == null) {
                return null;
            }
            String str = i.name;
            UserId userId2 = new UserId(Long.parseLong(accountManager.getUserData(i, "uid")));
            String userData = accountManager.getUserData(i, SharedKt.PARAM_ACCESS_TOKEN);
            String userData2 = accountManager.getUserData(i, "secret");
            String userData3 = accountManager.getUserData(i, SharedKt.PARAM_EXPIRES_IN);
            int i2 = 0;
            int intValue = (userData3 == null || (m2 = arm0.m(10, userData3)) == null) ? 0 : m2.intValue();
            String userData4 = accountManager.getUserData(i, "created");
            long longValue = (userData4 == null || (n = arm0.n(userData4)) == null) ? 0L : n.longValue();
            String userData5 = accountManager.getUserData(i, MediationMetaData.KEY_ORDINAL);
            if (userData5 != null && (m = arm0.m(10, userData5)) != null) {
                i2 = m.intValue();
            }
            String userData6 = accountManager.getUserData(i, "exchange_token");
            if (userData6 == null) {
                userData6 = "";
            }
            return new hp(userId2, str, userData, userData2, intValue, longValue, i2, userData6, k(i), j(i));
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            return null;
        }
    }

    @Override // xsna.mp
    public final synchronized List<hp> b() {
        return f();
    }

    @Override // xsna.mp
    public final synchronized boolean c(UserId userId) {
        boolean z;
        Account account;
        Account account2;
        Long n;
        z = false;
        try {
            try {
                Account[] accountsByTypeForPackage = this.c.getAccountsByTypeForPackage((String) this.d.getValue(), this.a.getPackageName());
                int length = accountsByTypeForPackage.length;
                int i = 0;
                while (true) {
                    account = null;
                    UserId userId2 = null;
                    if (i >= length) {
                        break;
                    }
                    account2 = accountsByTypeForPackage[i];
                    String userData = this.c.getUserData(account2, "uid");
                    if (new UserId((userData == null || (n = arm0.n(userData)) == null) ? UserId.d.b : n.longValue()).equals(userId)) {
                        break;
                    }
                    Long n2 = arm0.n(account2.name);
                    if (n2 != null) {
                        long longValue = n2.longValue();
                        gzs<s3q0> gzsVar = fkq0.a;
                        userId2 = new UserId(longValue);
                    }
                    if (epx.f(userId2, userId)) {
                        break;
                    }
                    i++;
                }
                account = account2;
                Iterator<T> it = h(account, accountsByTypeForPackage).iterator();
                while (it.hasNext()) {
                    this.c.removeAccountExplicitly((Account) it.next());
                }
                if (account != null) {
                    z = this.c.removeAccountExplicitly(account);
                }
            } catch (Exception e) {
                xgx0.a.getClass();
                xgx0.d(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // xsna.mp
    public final synchronized Account d(hp hpVar) {
        Account account;
        account = null;
        try {
            try {
                Account account2 = new Account(hpVar.k(), (String) this.d.getValue());
                Bundle bundle = new Bundle(9);
                bundle.putString("uid", String.valueOf(hpVar.j().b));
                bundle.putString(SharedKt.PARAM_ACCESS_TOKEN, hpVar.b());
                bundle.putString("secret", hpVar.i());
                bundle.putString(SharedKt.PARAM_EXPIRES_IN, String.valueOf(hpVar.f()));
                bundle.putString("created", String.valueOf(hpVar.d()));
                bundle.putString(MediationMetaData.KEY_ORDINAL, String.valueOf(hpVar.h()));
                bundle.putString("exchange_token", hpVar.e());
                bundle.putString("account_profile_type", String.valueOf(hpVar.c().h()));
                UserId g = hpVar.g();
                bundle.putString("master_account_id", String.valueOf(g != null ? Long.valueOf(g.b) : null));
                c(hpVar.j());
                this.c.addAccountExplicitly(account2, null, bundle);
                account = account2;
            } catch (Exception e) {
                xgx0.a.getClass();
                xgx0.d(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return account;
    }

    @Override // xsna.mp
    public final synchronized hp e(UserId userId) {
        return a(userId);
    }

    @Override // xsna.mp
    public final List<hp> f() {
        Integer m;
        Long n;
        Integer m2;
        AccountManager accountManager = this.c;
        try {
            Account[] accountsByTypeForPackage = accountManager.getAccountsByTypeForPackage((String) this.d.getValue(), this.a.getPackageName());
            ArrayList arrayList = new ArrayList();
            for (Account account : accountsByTypeForPackage) {
                String userData = accountManager.getUserData(account, "uid");
                if ((userData != null ? arm0.n(userData) : null) != null) {
                    arrayList.add(account);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Account account2 = (Account) it.next();
                String str = account2.name;
                UserId userId = new UserId(Long.parseLong(accountManager.getUserData(account2, "uid")));
                String userData2 = accountManager.getUserData(account2, SharedKt.PARAM_ACCESS_TOKEN);
                String userData3 = accountManager.getUserData(account2, "secret");
                String userData4 = accountManager.getUserData(account2, SharedKt.PARAM_EXPIRES_IN);
                int intValue = (userData4 == null || (m2 = arm0.m(10, userData4)) == null) ? 0 : m2.intValue();
                String userData5 = accountManager.getUserData(account2, "created");
                long longValue = (userData5 == null || (n = arm0.n(userData5)) == null) ? 0L : n.longValue();
                String userData6 = accountManager.getUserData(account2, MediationMetaData.KEY_ORDINAL);
                int intValue2 = (userData6 == null || (m = arm0.m(10, userData6)) == null) ? 0 : m.intValue();
                String userData7 = accountManager.getUserData(account2, "exchange_token");
                if (userData7 == null) {
                    userData7 = "";
                }
                arrayList2.add(new hp(userId, str, userData2, userData3, intValue, longValue, intValue2, userData7, k(account2), j(account2)));
            }
            return arrayList2;
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
            return EmptyList.b;
        }
    }

    @Override // xsna.mp
    public final synchronized Account g(hp hpVar) {
        Account account = null;
        try {
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.d(e);
        }
        if (i(hpVar.j()) == null) {
            xgx0.a.getClass();
            xgx0.f("Update data was called when user does not contain");
            return null;
        }
        account = d(new hp(hpVar.j(), hpVar.k(), hpVar.b(), hpVar.i(), hpVar.f(), hpVar.d(), hpVar.h(), hpVar.e(), hpVar.c(), hpVar.g()));
        return account;
    }

    public final List<Account> h(Account account, Account[] accountArr) {
        long longValue;
        UserId j;
        if (account != null) {
            try {
                if (k(account) == AccountProfileType.NORMAL) {
                    Long n = arm0.n(this.c.getUserData(account, "uid"));
                    if (n != null) {
                        longValue = n.longValue();
                    } else {
                        Long n2 = arm0.n(account.name);
                        if (n2 == null) {
                            return EmptyList.b;
                        }
                        longValue = n2.longValue();
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Account account2 : accountArr) {
                        if (k(account2) != AccountProfileType.NORMAL && (j = j(account2)) != null && j.b == longValue) {
                            arrayList.add(account2);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable unused) {
                return EmptyList.b;
            }
        }
        return EmptyList.b;
    }

    public final Account i(UserId userId) {
        Long n;
        String str = (String) this.d.getValue();
        String packageName = this.a.getPackageName();
        AccountManager accountManager = this.c;
        for (Account account : accountManager.getAccountsByTypeForPackage(str, packageName)) {
            String userData = accountManager.getUserData(account, "uid");
            if (new UserId((userData == null || (n = arm0.n(userData)) == null) ? UserId.d.b : n.longValue()).equals(userId)) {
                return account;
            }
        }
        return null;
    }

    public final UserId j(Account account) {
        try {
            Long n = arm0.n(this.c.getUserData(account, "master_account_id"));
            if (n != null) {
                if (n.longValue() != UserId.d.b) {
                    return new UserId(n.longValue());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final AccountProfileType k(Account account) {
        try {
            Integer m = arm0.m(10, this.c.getUserData(account, "account_profile_type"));
            AccountProfileType.Companion.getClass();
            AccountProfileType a = AccountProfileType.a.a(m);
            return a == null ? AccountProfileType.NORMAL : a;
        } catch (Exception unused) {
            return AccountProfileType.NORMAL;
        }
    }
}
