package xsna;

import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import xsna.ugf;

/* compiled from: ClipsUploadPrefsMiddleware.kt */
/* loaded from: classes17.dex */
public final class wgf implements h7f0<ClipsUploadState, lbf, Object, mjf, ugf, qef> {
    public final sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> b;
    public final lwe c;
    public final uwe d;

    public wgf(sl50<ClipsUploadState, lbf, Object, mjf, ugf, qef> sl50Var, lwe lweVar, uwe uweVar) {
        this.b = sl50Var;
        this.c = lweVar;
        this.d = uweVar;
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void K(lj50 lj50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void T(pk50 pk50Var) {
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final void o(yl50 yl50Var) {
        ugf ugfVar = (ugf) yl50Var;
        if (ugfVar instanceof ugf.g.k) {
            this.d.f(((ugf.g.k) ugfVar).a.b);
            return;
        }
        boolean z = ugfVar instanceof ugf.g.d;
        lwe lweVar = this.c;
        if (z) {
            lweVar.g(((ugf.g.d) ugfVar).a);
            return;
        }
        if (ugfVar instanceof ugf.g.m) {
            lweVar.e(((ugf.g.m) ugfVar).a);
            return;
        }
        if (ugfVar instanceof ugf.g.e) {
            lweVar.c(((ugf.g.e) ugfVar).a);
        } else if (ugfVar instanceof ugf.g.h) {
            lweVar.b(((ugf.g.h) ugfVar).a);
        } else if (ugfVar instanceof ugf.g.a) {
            lweVar.a(((ugf.g.a) ugfVar).a);
        }
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
