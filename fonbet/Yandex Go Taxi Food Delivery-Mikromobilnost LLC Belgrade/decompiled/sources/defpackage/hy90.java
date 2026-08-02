package defpackage;

import androidx.fragment.app.FragmentActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class hy90 extends jd5 implements at41, bt41, di41, so41 {
    public final FragmentActivity b;
    public final iy90 c;
    public final qtd d;
    public final gcj e;
    public final List f;
    public boolean g;
    public int h;

    public hy90(FragmentActivity fragmentActivity, iy90 iy90Var, qtd qtdVar, gcj gcjVar, List list) {
        this.b = fragmentActivity;
        this.c = iy90Var;
        this.d = qtdVar;
        this.e = gcjVar;
        this.f = list;
        this.h = fragmentActivity.getRequestedOrientation();
    }

    @Override // defpackage.bt41
    public final void d(srd0 srd0Var) {
        this.e.d(srd0Var);
        this.c.b();
    }

    @Override // defpackage.in41
    public final void e() {
        if (this.g) {
            this.b.setRequestedOrientation(this.h);
            this.g = false;
        }
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        this.d.f(str, i, str2, str3, z);
        if (z) {
            this.c.b();
        }
    }

    @Override // defpackage.in41
    public final void g() {
        FragmentActivity fragmentActivity = this.b;
        this.h = fragmentActivity.getRequestedOrientation();
        int i = fragmentActivity.getResources().getConfiguration().orientation;
        fragmentActivity.setRequestedOrientation(i != 1 ? i != 2 ? -1 : 6 : 7);
        this.g = true;
    }

    @Override // defpackage.di41
    public final void k(String str) {
        this.c.a();
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        this.d.l(str, i, str2, str3, z);
        if (z) {
            this.c.b();
        }
    }

    @Override // defpackage.at41
    public final boolean o(urd0 urd0Var) {
        Object failure;
        if (!(urd0Var instanceof srd0)) {
            if (urd0Var instanceof trd0) {
                return true;
            }
            w511.b();
            return false;
        }
        int i = gy90.a[((srd0) urd0Var).c.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
            w511.b();
            return false;
        }
        try {
            failure = ((srd0) urd0Var).a.getHost();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str = (String) failure;
        if (str == null) {
            return false;
        }
        List list = this.f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bt41
    public final void q(srd0 srd0Var) {
        this.e.getClass();
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        this.d.r(str, i, str2, str3, z);
        if (z) {
            this.c.b();
        }
    }
}
