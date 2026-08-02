package yads;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes10.dex */
public final class rp0 implements nf2 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ tp0 d;

    public rp0(tp0 tp0Var) {
        this.d = tp0Var;
    }

    @Override // yads.nf2
    public final void a(qn0 qn0Var) {
        tp0 tp0Var = this.d;
        p72 p72Var = tp0Var.h;
        p72 p72Var2 = tp0Var.i;
        Pair pair = (p72Var == null || p72Var2 == null) ? null : new Pair(p72Var, p72Var2);
        if (pair != null && !tp0Var.l.contains(pair)) {
            this.d.l.add(pair);
            this.d.a((gg3) pair.j());
            return;
        }
        this.a = false;
        ((ad2) this.d.g.b).a();
        ao0 ao0Var = (ao0) this.d.a;
        ao0Var.r();
        ao0Var.r();
        yk ykVar = ao0Var.v;
        ao0Var.r();
        ykVar.a(ao0Var.Z.l, 1);
        ao0Var.a((qn0) null);
        int i = q20.b;
        String message = qn0Var.getMessage();
        uj3 uj3Var = this.d.c;
        gp2 a = uj3Var.b.a();
        a.b(message, "error_message");
        uj3Var.a.a(new fp2(dp2.l.a(), new LinkedHashMap(a.a), a.b));
        tp0 tp0Var2 = this.d;
        og3 og3Var = tp0Var2.k;
        gg3 gg3Var = tp0Var2.j;
        if (og3Var == null || gg3Var == null) {
            return;
        }
        tp0Var2.d.getClass();
        og3Var.a(new ng3(p62.a(qn0Var), qn0Var));
    }

    @Override // yads.nf2
    public final void onIsPlayingChanged(boolean z) {
        if (!z) {
            if (this.b) {
                return;
            }
            this.c = true;
            tp0 tp0Var = this.d;
            og3 og3Var = tp0Var.k;
            gg3 gg3Var = tp0Var.j;
            if (og3Var == null || gg3Var == null) {
                return;
            }
            og3Var.i();
            return;
        }
        if (!this.a) {
            tp0 tp0Var2 = this.d;
            og3 og3Var2 = tp0Var2.k;
            gg3 gg3Var2 = tp0Var2.j;
            if (og3Var2 == null || gg3Var2 == null) {
                return;
            }
            this.a = true;
            og3Var2.c();
            return;
        }
        if (this.c) {
            this.c = false;
            tp0 tp0Var3 = this.d;
            og3 og3Var3 = tp0Var3.k;
            gg3 gg3Var3 = tp0Var3.j;
            if (og3Var3 == null || gg3Var3 == null) {
                return;
            }
            og3Var3.f();
        }
    }

    @Override // yads.nf2
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            this.b = true;
            tp0 tp0Var = this.d;
            og3 og3Var = tp0Var.k;
            gg3 gg3Var = tp0Var.j;
            if (og3Var == null || gg3Var == null) {
                return;
            }
            og3Var.b();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.a = false;
            tp0 tp0Var2 = this.d;
            og3 og3Var2 = tp0Var2.k;
            gg3 gg3Var2 = tp0Var2.j;
            if (og3Var2 == null || gg3Var2 == null) {
                return;
            }
            og3Var2.d();
            return;
        }
        ((ad2) this.d.g.b).a();
        tp0 tp0Var3 = this.d;
        og3 og3Var3 = tp0Var3.k;
        gg3 gg3Var3 = tp0Var3.j;
        if (og3Var3 != null && gg3Var3 != null) {
            og3Var3.h();
        }
        if (this.b) {
            this.b = false;
            tp0 tp0Var4 = this.d;
            og3 og3Var4 = tp0Var4.k;
            gg3 gg3Var4 = tp0Var4.j;
            if (og3Var4 == null || gg3Var4 == null) {
                return;
            }
            og3Var4.a();
        }
    }
}
