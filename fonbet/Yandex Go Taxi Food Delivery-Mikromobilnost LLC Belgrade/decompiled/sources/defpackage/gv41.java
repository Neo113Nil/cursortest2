package defpackage;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class gv41 extends uc5 {
    public static /* synthetic */ void c0(gv41 gv41Var, String str, Throwable th, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        if ((i & 64) != 0) {
            bool4 = null;
        }
        gv41Var.b0(str, th, num, bool, bool2, bool3, bool4);
    }

    public abstract void b0(String str, Throwable th, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4);

    public abstract void d0(String str);

    public abstract void e0(String str);

    public abstract void f0();

    public abstract void g0();

    public abstract void h0();

    public abstract void i0();

    public abstract void j0(boolean z);

    public abstract void k0(String str);

    public abstract void l0(boolean z);

    public abstract void m0();

    public abstract void n0(boolean z);

    public abstract void o0(Throwable th);

    public abstract void p0();

    public abstract void q0(String str);

    public abstract void r0(String str);

    public abstract Object s0(Uri uri, List list, ContinuationImpl continuationImpl);

    public abstract void t0(String str);

    public abstract void u0(String str, Map map);

    public abstract void v0(String str);

    public abstract boolean w0(FragmentActivity fragmentActivity, String str, boolean z);
}
