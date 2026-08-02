package xsna;

import androidx.fragment.app.FragmentActivity;
import kotlin.LazyThreadSafetyMode;
import xsna.g4z;

/* compiled from: LifecycleInitializer.kt */
/* loaded from: classes3.dex */
public final class tjt<LL extends g4z> {
    public final String a;
    public final FragmentActivity b;
    public final gzs<LL> c;
    public LL d;

    public tjt(String str, FragmentActivity fragmentActivity, gzs gzsVar) {
        this.a = str;
        this.b = fragmentActivity;
        this.c = gzsVar;
    }

    public final LL a() {
        nyt0 a;
        LL ll = this.d;
        if (ll != null) {
            return ll;
        }
        pyt0 pyt0Var = new pyt0(msy.a(LazyThreadSafetyMode.NONE, new sjt(this)));
        FragmentActivity fragmentActivity = this.b;
        vyt0 vyt0Var = new vyt0(fragmentActivity.getViewModelStore(), pyt0Var, fragmentActivity.getDefaultViewModelCreationExtras());
        String str = this.a;
        if (str != null) {
            a = vyt0Var.a(str, fpf0.a(yyt0.class));
        } else {
            rfc a2 = fpf0.a(yyt0.class);
            String h = a2.h();
            if (h == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            a = vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a2);
        }
        LL ll2 = (LL) ((yyt0) a).b;
        this.d = ll2;
        return ll2;
    }
}
