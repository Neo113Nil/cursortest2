package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.Fragment;
import java.security.Key;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import xsna.j47;
import xsna.y97;

/* compiled from: BiometricAuthHandlerImpl.kt */
/* loaded from: classes15.dex */
public final class l47 implements k47 {
    public final bpn0 a = new bpn0(new x5(4));

    @Override // xsna.k47
    public final int a(Context context) {
        return c57.c(context).a(255);
    }

    @Override // xsna.k47
    public final boolean b(Context context) {
        int a = c57.c(context).a(15);
        return (a == 1 || a == 12) ? false : true;
    }

    @Override // xsna.k47
    public final boolean c(Context context) {
        return c57.c(context).a(15) == 0;
    }

    @Override // xsna.k47
    public final void d(Fragment fragment, t6e0 t6e0Var, vjk vjkVar, final SharedPreferences sharedPreferences, final n47 n47Var) {
        Fragment fragment2;
        io.reactivex.rxjava3.disposables.c subscribe;
        if (!c(fragment.requireContext())) {
            n47Var.pd(j47.b.a);
            return;
        }
        final y97 y97Var = (y97) this.a.getValue();
        y97Var.getClass();
        int i = y97.a.$EnumSwitchMapping$0[vjkVar.a.ordinal()];
        if (i == 1) {
            fragment2 = fragment;
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new rc3(y97Var));
            asu0 asu0Var = asu0.a;
            subscribe = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.r(vVar.q(asu0Var.c()).m(asu0Var.d()), new rj4(new r97(y97Var, fragment2, t6e0Var, n47Var, 0), 2)).m(asu0Var.c()), new zj0(new s53(vjkVar, y97Var, sharedPreferences), 1)).o(asu0Var.d()).subscribe(new x97(n47Var, 0), new b00(new k9(n47Var, 12), 4));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            io.reactivex.rxjava3.internal.operators.maybe.p pVar = new io.reactivex.rxjava3.internal.operators.maybe.p(new Callable() { // from class: xsna.s97
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Key key = y97.this.a.getKey("KEY_NAME", null);
                    String string = sharedPreferences.getString("INITIALIZATION_VECTOR", null);
                    byte[] decode = string != null ? Base64.decode(string, 0) : null;
                    if (key == null || decode == null) {
                        n47Var.pm();
                        return null;
                    }
                    Cipher cipher = Cipher.getInstance(j5g.g0(e43.l("AES", "CBC", "PKCS7Padding"), DomExceptionUtils.SEPARATOR, null, null, 0, null, 62));
                    cipher.init(2, key, new IvParameterSpec(decode));
                    return cipher;
                }
            });
            asu0 asu0Var2 = asu0.a;
            fragment2 = fragment;
            subscribe = new io.reactivex.rxjava3.internal.operators.maybe.u(new io.reactivex.rxjava3.internal.operators.maybe.n(pVar.n(asu0Var2.c()).k(asu0Var2.d()), new vj0(new t97(y97Var, fragment2, t6e0Var, n47Var, 0), 2)).k(asu0.i()), new ed(new nk0(2, y97Var, sharedPreferences), 4)).k(asu0Var2.d()).subscribe(new ew(new k00(n47Var, 7), 4), new defpackage.n(new l5(y97Var, n47Var), 8));
        }
        hg1.a(subscribe, fragment2);
    }
}
