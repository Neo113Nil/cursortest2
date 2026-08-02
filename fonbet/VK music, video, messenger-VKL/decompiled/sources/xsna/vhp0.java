package xsna;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: TrackingRule.kt */
/* loaded from: classes2.dex */
public abstract class vhp0 {

    /* compiled from: TrackingRule.kt */
    public static class a extends vhp0 {
        public final rfc a;

        public a(rfc rfcVar) {
            this.a = rfcVar;
        }

        public boolean a(Activity activity) {
            return this.a.c(activity);
        }
    }

    /* compiled from: TrackingRule.kt */
    public static final class b<T extends Activity> extends a {
        public final izs<T, Boolean> b;

        public b(rfc rfcVar, izs izsVar) {
            super(rfcVar);
            this.b = izsVar;
        }

        @Override // xsna.vhp0.a
        public final boolean a(Activity activity) {
            return this.a.c(activity) && this.b.invoke(activity).booleanValue();
        }
    }

    /* compiled from: TrackingRule.kt */
    public static class c extends vhp0 {
        public final rfc a;

        public c(rfc rfcVar) {
            this.a = rfcVar;
        }

        public boolean a(Fragment fragment) {
            return this.a.c(fragment);
        }
    }

    /* compiled from: TrackingRule.kt */
    public static final class d<T extends FragmentImpl> extends c {
        public final xx10 b;

        public d(rfc rfcVar, xx10 xx10Var) {
            super(rfcVar);
            this.b = xx10Var;
        }

        @Override // xsna.vhp0.c
        public final boolean a(Fragment fragment) {
            return this.a.c(fragment) && ((Boolean) this.b.invoke((FragmentImpl) fragment)).booleanValue();
        }
    }
}
