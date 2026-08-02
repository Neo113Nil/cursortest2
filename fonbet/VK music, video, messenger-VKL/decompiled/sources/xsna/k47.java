package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;

/* compiled from: BiometricAuthHandler.kt */
/* loaded from: classes15.dex */
public interface k47 {
    int a(Context context);

    boolean b(Context context);

    boolean c(Context context);

    void d(Fragment fragment, t6e0 t6e0Var, vjk vjkVar, SharedPreferences sharedPreferences, n47 n47Var);

    /* compiled from: BiometricAuthHandler.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final k47 STUB = new C3162a();

        public final k47 getSTUB() {
            return STUB;
        }

        /* compiled from: BiometricAuthHandler.kt */
        /* renamed from: xsna.k47$a$a, reason: collision with other inner class name */
        public static final class C3162a implements k47 {
            @Override // xsna.k47
            public final int a(Context context) {
                return -1;
            }

            @Override // xsna.k47
            public final boolean b(Context context) {
                return false;
            }

            @Override // xsna.k47
            public final boolean c(Context context) {
                return false;
            }

            @Override // xsna.k47
            public final void d(Fragment fragment, t6e0 t6e0Var, vjk vjkVar, SharedPreferences sharedPreferences, n47 n47Var) {
            }
        }
    }
}
