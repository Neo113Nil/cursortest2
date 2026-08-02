package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.g4z;

/* compiled from: LifecycleInitializer.kt */
/* loaded from: classes3.dex */
public class z4z<LL extends g4z, State> {
    public final String b;
    public final Fragment c;
    public final wzs<Bundle, State, LL> d;
    public final quk0<State> e;
    public LL f;

    public z4z() {
        throw null;
    }

    public z4z(String str, Fragment fragment, wzs wzsVar, quk0 quk0Var) {
        this.b = str;
        this.c = fragment;
        this.d = wzsVar;
        this.e = quk0Var;
    }

    public final LL a() {
        nyt0 a;
        if (this.f == null) {
            Lazy a2 = msy.a(LazyThreadSafetyMode.NONE, new y4z(this));
            Fragment fragment = this.c;
            vyt0 vyt0Var = new vyt0(fragment.getViewModelStore(), new a2h0(fragment, a2), fragment.getDefaultViewModelCreationExtras());
            String str = this.b;
            if (str != null) {
                a = vyt0Var.a(str, fpf0.a(xk50.class));
            } else {
                rfc a3 = fpf0.a(xk50.class);
                String h = a3.h();
                if (h == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                a = vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a3);
            }
            this.f = (LL) ((xk50) a).b;
        }
        return this.f;
    }

    public g4z b() {
        return a();
    }
}
