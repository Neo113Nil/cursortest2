package defpackage;

import com.yandex.go.payments.shared.data.model.Account;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes13.dex */
public final class il {
    public Account a;
    public final String b;
    public final String c;
    public final SharedAccountType d;

    public il(Account account, String str, String str2, SharedAccountType sharedAccountType) {
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = sharedAccountType;
    }

    public final SharedAccountType a() {
        return this.d;
    }

    public final Account b() {
        Account account = this.a;
        if (account != null) {
            return account;
        }
        jst.e.w(new NullPointerException("Account is null"));
        ny61.g("Account must be not null");
        return null;
    }
}
