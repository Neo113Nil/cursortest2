package xsna;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.chromium.base.TimeUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class vyz0 extends dd01 {
    public long f;
    public String g;
    public AccountManager h;
    public Boolean i;
    public long j;

    @Override // xsna.dd01
    public final boolean l() {
        Calendar calendar = Calendar.getInstance();
        this.f = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.g = pzl.b(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long o() {
        k();
        return this.j;
    }

    public final long p() {
        m();
        return this.f;
    }

    public final String q() {
        m();
        return this.g;
    }

    public final boolean r() {
        Account[] result;
        k();
        mb01 mb01Var = (mb01) this.b;
        jcl jclVar = mb01Var.o;
        k901 k901Var = mb01Var.j;
        Context context = mb01Var.b;
        jclVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.j > TimeUtils.MILLISECONDS_PER_DAY) {
            this.i = null;
        }
        Boolean bool = this.i;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (anj.a(context, "android.permission.GET_ACCOUNTS") != 0) {
            mb01.k(k901Var);
            k901Var.m.a("Permission error checking for dasher/unicorn accounts");
            this.j = currentTimeMillis;
            this.i = Boolean.FALSE;
            return false;
        }
        if (this.h == null) {
            this.h = AccountManager.get(context);
        }
        try {
            result = this.h.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e) {
            e = e;
            mb01.k(k901Var);
            k901Var.j.b(e, "Exception checking account types");
            this.j = currentTimeMillis;
            this.i = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e2) {
            e = e2;
            mb01.k(k901Var);
            k901Var.j.b(e, "Exception checking account types");
            this.j = currentTimeMillis;
            this.i = Boolean.FALSE;
            return false;
        } catch (IOException e3) {
            e = e3;
            mb01.k(k901Var);
            k901Var.j.b(e, "Exception checking account types");
            this.j = currentTimeMillis;
            this.i = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.i = Boolean.TRUE;
            this.j = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.h.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.i = Boolean.TRUE;
            this.j = currentTimeMillis;
            return true;
        }
        this.j = currentTimeMillis;
        this.i = Boolean.FALSE;
        return false;
    }
}
