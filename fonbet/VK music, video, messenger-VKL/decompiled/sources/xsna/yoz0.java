package xsna;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class yoz0 extends mpz0 {
    public final SparseArray f;

    public yoz0(t4z t4zVar) {
        super(t4zVar, GoogleApiAvailability.getInstance());
        this.f = new SparseArray();
        this.mLifecycleFragment.Hm("AutoManageHelper", this);
    }

    public static yoz0 e() {
        t4z fragment = c4z.getFragment((y3z) null);
        yoz0 yoz0Var = (yoz0) fragment.Y3(yoz0.class, "AutoManageHelper");
        return yoz0Var != null ? yoz0Var : new yoz0(fragment);
    }

    @Override // xsna.mpz0
    public final void b(ConnectionResult connectionResult, int i) {
        SparseArray sparseArray = this.f;
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        if (((voz0) sparseArray.get(i)) != null) {
            voz0 voz0Var = (voz0) sparseArray.get(i);
            sparseArray.remove(i);
            if (voz0Var != null) {
                nlz0 nlz0Var = voz0Var.b;
                kpz0 kpz0Var = nlz0Var.d;
                kpz0Var.getClass();
                synchronized (kpz0Var.j) {
                    try {
                        if (!kpz0Var.e.remove(voz0Var)) {
                            new StringBuilder(String.valueOf(voz0Var).length() + 57);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                nlz0Var.n();
            }
        }
    }

    @Override // xsna.mpz0
    public final void c() {
        for (int i = 0; i < this.f.size(); i++) {
            voz0 g = g(i);
            if (g != null) {
                g.b.l();
            }
        }
    }

    @Override // xsna.c4z
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        for (int i = 0; i < this.f.size(); i++) {
            voz0 g = g(i);
            if (g != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(g.a);
                printWriter.println(StringUtils.PROCESS_POSTFIX_DELIMITER);
                g.b.o(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void f(int i, nlz0 nlz0Var) {
        SparseArray sparseArray = this.f;
        exc0.k(z23.b(i, "Already managing a GoogleApiClient with id ", new StringBuilder(String.valueOf(i).length() + 43)), sparseArray.indexOfKey(i) < 0);
        epz0 epz0Var = (epz0) this.c.get();
        boolean z = this.b;
        String valueOf = String.valueOf(epz0Var);
        new StringBuilder(lr.a(String.valueOf(i).length(), 32, String.valueOf(z).length(), 1) + valueOf.length());
        voz0 voz0Var = new voz0(this, i, nlz0Var);
        nlz0Var.d.a(voz0Var);
        sparseArray.put(i, voz0Var);
        if (this.b && epz0Var == null) {
            "connecting ".concat(nlz0Var.toString());
            nlz0Var.l();
        }
    }

    @Nullable
    public final voz0 g(int i) {
        SparseArray sparseArray = this.f;
        if (sparseArray.size() <= i) {
            return null;
        }
        return (voz0) sparseArray.get(sparseArray.keyAt(i));
    }

    @Override // xsna.mpz0, xsna.c4z
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.f;
        boolean z = this.b;
        String valueOf = String.valueOf(sparseArray);
        new StringBuilder(String.valueOf(z).length() + 9 + valueOf.length());
        if (this.c.get() == null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                voz0 g = g(i);
                if (g != null) {
                    g.b.l();
                }
            }
        }
    }

    @Override // xsna.mpz0, xsna.c4z
    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.f.size(); i++) {
            voz0 g = g(i);
            if (g != null) {
                g.b.n();
            }
        }
    }
}
