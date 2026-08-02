package xsna;

import android.accounts.Account;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class olc {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final ylj0 g;
    public Integer h;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    public static final class a {
        public Account a;
        public el3 b;
        public String c;
        public String d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    public olc(Account account, @NonNull Set set, @NonNull zk3 zk3Var, @NonNull String str, @NonNull String str2, ylj0 ylj0Var) {
        this.a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        zk3 zk3Var2 = zk3Var == null ? Collections.EMPTY_MAP : zk3Var;
        this.d = zk3Var2;
        this.e = str;
        this.f = str2;
        this.g = ylj0Var == null ? ylj0.b : ylj0Var;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = zk3Var2.values().iterator();
        while (it.hasNext()) {
            ((vnz0) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
