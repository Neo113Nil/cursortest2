package xsna;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public abstract class u2u<T extends IInterface> extends rd6<T> implements a.f {

    @Nullable
    private static volatile Executor zaa;
    private final olc zab;
    private final Set zac;

    @Nullable
    private final Account zad;

    public u2u(@NonNull Context context, @NonNull Handler handler, int i, @NonNull olc olcVar) {
        super(context, handler, v2u.a(context), GoogleApiAvailability.getInstance(), i, null, null);
        exc0.i(olcVar);
        this.zab = olcVar;
        this.zad = olcVar.a;
        this.zac = zac(olcVar.c);
        zab(context);
    }

    private static void zab(Context context) {
        if (zaa == null) {
            synchronized (u2u.class) {
                try {
                    if (zaa == null) {
                        context.getPackageName();
                        zaa = fpz0.a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final Set zac(@NonNull Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    public static void zag(@Nullable Executor executor) {
        zaa = executor;
    }

    @Override // xsna.rd6
    @Nullable
    public final Account getAccount() {
        return this.zad;
    }

    @Override // xsna.rd6
    @Nullable
    public Executor getBindServiceExecutor() {
        return zaa;
    }

    @NonNull
    public final olc getClientSettings() {
        return this.zab;
    }

    @NonNull
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // xsna.rd6
    @NonNull
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @NonNull
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    public u2u(@NonNull Context context, @NonNull Looper looper, int i, @NonNull olc olcVar) {
        this(context, looper, v2u.a(context), GoogleApiAvailability.getInstance(), i, olcVar, null, null);
    }

    @Deprecated
    public u2u(@NonNull Context context, @NonNull Looper looper, int i, @NonNull olc olcVar, @NonNull c.b bVar, @NonNull c.InterfaceC0114c interfaceC0114c) {
        this(context, looper, i, olcVar, (x3j) bVar, (i380) interfaceC0114c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u2u(@NonNull Context context, @NonNull Looper looper, int i, @NonNull olc olcVar, @NonNull x3j x3jVar, @NonNull i380 i380Var) {
        this(context, looper, r3, r4, i, olcVar, x3jVar, i380Var);
        do01 a = v2u.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        exc0.i(x3jVar);
        exc0.i(i380Var);
    }

    public u2u(@NonNull Context context, @NonNull Looper looper, @NonNull v2u v2uVar, @NonNull GoogleApiAvailability googleApiAvailability, int i, @NonNull olc olcVar, @Nullable x3j x3jVar, @Nullable i380 i380Var) {
        super(context, looper, v2uVar, googleApiAvailability, i, x3jVar == null ? null : new woz0(x3jVar), i380Var != null ? new zoz0(i380Var) : null, olcVar.f);
        this.zab = olcVar;
        this.zad = olcVar.a;
        this.zac = zac(olcVar.c);
        zab(context);
    }

    @NonNull
    public Set<Scope> validateScopes(@NonNull Set<Scope> set) {
        return set;
    }
}
