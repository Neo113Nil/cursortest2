package xsna;

import android.accounts.Account;
import kotlin.Lazy;

/* compiled from: VkSystemAccountProvider.kt */
/* loaded from: classes11.dex */
public final class apv0 implements jpn0 {
    public final Object a;
    public final b25 b;

    public apv0(Lazy<? extends mp> lazy, b25 b25Var) {
        this.a = lazy;
        this.b = b25Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Account a() {
        String k;
        hp e = ((mp) this.a.getValue()).e(this.b.c());
        if (e == null || (k = e.k()) == null) {
            return null;
        }
        return new Account(k, "com.vkontakte.account");
    }
}
