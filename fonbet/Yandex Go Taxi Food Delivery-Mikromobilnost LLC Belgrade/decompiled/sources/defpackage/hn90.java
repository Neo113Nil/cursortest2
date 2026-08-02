package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.impl.p;
import com.yandex.passport.internal.properties.AuthorizationUrlProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes10.dex */
public final class hn90 implements dn90 {
    public final Intent a(Context context, boolean z) {
        Filter.a aVar = new Filter.a();
        aVar.e(z ? h.c : h.a);
        Filter a = aVar.a();
        LoginProperties.a aVar2 = new LoginProperties.a();
        aVar2.g(a);
        return h.a(context).e.a.i(context, aVar2.a());
    }

    public final String b(Context context, String str, long j, String str2, boolean z) {
        Object failure;
        try {
            p a = h.a(context.getApplicationContext());
            AuthorizationUrlProperties.a aVar = new AuthorizationUrlProperties.a();
            aVar.a = new PassportUidImpl(PassportEnvironmentImpl.from(z ? h.c : h.a), j);
            aVar.c = str2;
            aVar.b = str;
            failure = a.b(aVar.a());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public final String c(Context context, long j, String str, String str2, boolean z, boolean z2, m7b m7bVar) {
        p a = h.a(context.getApplicationContext());
        PassportUidImpl passportUidImpl = new PassportUidImpl(PassportEnvironmentImpl.from(z ? h.c : h.a), j);
        ClientCredentials.Factory.getClass();
        Credentials credentials = new Credentials(str, str2);
        if (z2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a.a(a.c(passportUidImpl, credentials).getValue());
            long longValue = ((Number) new Pair(zy11.a, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)).getSecond()).longValue();
            if (m7bVar != null) {
                m7bVar.a.invoke(Long.valueOf(longValue));
            }
        }
        Pair pair = new Pair(a.c(passportUidImpl, credentials).getValue(), Long.valueOf(SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()));
        String str3 = (String) pair.getFirst();
        long longValue2 = ((Number) pair.getSecond()).longValue();
        if (m7bVar != null) {
            m7bVar.b.invoke(Long.valueOf(longValue2));
        }
        return str3;
    }
}
