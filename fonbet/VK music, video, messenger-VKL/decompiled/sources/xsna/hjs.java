package xsna;

import android.widget.FrameLayout;
import com.vk.core.view.ProgressIconButton;
import com.vk.dto.user.RequestUserProfile;

/* compiled from: FriendRequestProcessingHelper.kt */
/* loaded from: classes16.dex */
public final class hjs implements fd3 {
    public final Object a;
    public final Object b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public hjs(x3e0 x3e0Var, ProgressIconButton progressIconButton, x3e0 x3e0Var2) {
        this.a = (FrameLayout) x3e0Var;
        this.c = progressIconButton;
        this.b = (FrameLayout) x3e0Var2;
    }

    @Override // xsna.fd3
    public Object a() {
        return this.c;
    }

    @Override // xsna.fd3
    public void b(Object obj, wzs wzsVar) {
        ((ng50) this.a).c(7);
        fh50 fh50Var = (fh50) this.b;
        fh50Var.j(wzsVar);
        fh50Var.j(obj);
    }

    @Override // xsna.fd3
    public void d() {
        ((ng50) this.a).c(8);
    }

    @Override // xsna.fd3
    public void e(int i, Object obj) {
        ng50 ng50Var = (ng50) this.a;
        ng50Var.c(5);
        ng50Var.c(i);
        ((fh50) this.b).j(obj);
    }

    @Override // xsna.fd3
    public void f(Object obj) {
        ((ng50) this.a).c(1);
        ((fh50) this.b).j(obj);
    }

    @Override // xsna.fd3
    public void g(int i, int i2) {
        ng50 ng50Var = (ng50) this.a;
        ng50Var.c(2);
        ng50Var.c(i);
        ng50Var.c(i2);
    }

    @Override // xsna.fd3
    public void h(int i, int i2, int i3) {
        ng50 ng50Var = (ng50) this.a;
        ng50Var.c(3);
        ng50Var.c(i);
        ng50Var.c(i2);
        ng50Var.c(i3);
    }

    @Override // xsna.fd3
    public void i(int i, Object obj) {
        ng50 ng50Var = (ng50) this.a;
        ng50Var.c(6);
        ng50Var.c(i);
        ((fh50) this.b).j(obj);
    }

    @Override // xsna.fd3
    public void j() {
        ((ng50) this.a).c(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, xsna.x3e0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.FrameLayout, xsna.x3e0] */
    public void k(RequestUserProfile requestUserProfile) {
        ?? r0 = (FrameLayout) this.a;
        ProgressIconButton progressIconButton = (ProgressIconButton) this.c;
        ?? r2 = (FrameLayout) this.b;
        if (xo9.s(requestUserProfile)) {
            r0.S(true);
            progressIconButton.S(false);
            r2.S(false);
            r0.setEnabled(true);
            progressIconButton.setEnabled(false);
            r2.setEnabled(false);
            return;
        }
        if (xo9.r(requestUserProfile)) {
            r0.S(false);
            progressIconButton.S(true);
            r2.S(false);
            r0.setEnabled(false);
            progressIconButton.setEnabled(true);
            r2.setEnabled(false);
            return;
        }
        if (requestUserProfile.s.getInt("friend_request_status", 0) == -3) {
            r0.S(false);
            progressIconButton.S(false);
            r2.S(true);
            r0.setEnabled(false);
            progressIconButton.setEnabled(false);
            r2.setEnabled(true);
            return;
        }
        r0.S(false);
        progressIconButton.S(false);
        r2.S(false);
        r0.setEnabled(true);
        progressIconButton.setEnabled(true);
        r2.setEnabled(true);
    }

    public void l(oc ocVar, ytf0 ytf0Var) {
        Exception exc;
        int i;
        ng50 ng50Var = (ng50) this.a;
        int i2 = ng50Var.b;
        fh50 fh50Var = (fh50) this.b;
        fh50 fh50Var2 = new fh50((Object) null);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (ng50Var.a(i3)) {
                        case 0:
                            ocVar.j();
                            i3 = i5;
                        case 1:
                            int i6 = i4 + 1;
                            ocVar.f(fh50Var.d(i4));
                            i4 = i6;
                            i3 = i5;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            ocVar.g(ng50Var.a(i5), ng50Var.a(i7));
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    ocVar.h(ng50Var.a(i5), ng50Var.a(i8), ng50Var.a(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                    throw new eqi(fh50Var, fh50Var2, ng50Var, i3 - 1, exc);
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                        case 4:
                            ocVar.p();
                            i3 = i5;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            ocVar.e(ng50Var.a(i5), fh50Var.d(i4));
                            i4 = i;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                ocVar.i(ng50Var.a(i5), fh50Var.d(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc = e3;
                                throw new eqi(fh50Var, fh50Var2, ng50Var, i3 - 1, exc);
                            }
                        case 7:
                            int i10 = i4 + 1;
                            E d = fh50Var.d(i4);
                            ttp0.d(2, d);
                            i4 += 2;
                            ocVar.b(fh50Var.d(i10), (wzs) d);
                            i3 = i5;
                        case 8:
                            Object obj = ocVar.b;
                            if (obj instanceof ypi) {
                                ypi ypiVar = (ypi) obj;
                                if (ytf0Var.f.j(ypiVar)) {
                                    ypiVar.j();
                                }
                            }
                            fh50Var2.j(obj);
                            ocVar.d();
                            i3 = i5;
                        default:
                            i3 = i5;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i3 = i5;
                }
            } catch (Throwable th) {
                ocVar.c();
                throw th;
            }
        }
        if (i4 != fh50Var.b) {
            androidx.compose.runtime.b.a("Applier operation size mismatch");
        }
        fh50Var.m();
        ng50Var.b = 0;
        ocVar.c();
    }

    public hjs(Object obj) {
        this.a = new ng50();
        this.b = new fh50((Object) null);
        this.c = obj;
    }
}
