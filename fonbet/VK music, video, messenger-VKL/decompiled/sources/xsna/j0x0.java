package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import xsna.a7f0;
import xsna.a990;
import xsna.g0x0;
import xsna.h0x0;
import xsna.o0x0;

/* compiled from: VoipSelectVideoPlaylistsFeature.kt */
/* loaded from: classes7.dex */
public final class j0x0 extends wk50<p0x0, o0x0, h0x0, g0x0> {
    public final UserId f;
    public final kvw0 g;
    public final int h;

    public j0x0(n0x0 n0x0Var, UserId userId, kvw0 kvw0Var) {
        super(new h0x0.a(false), n0x0Var);
        this.f = userId;
        this.g = kvw0Var;
        this.h = 20;
    }

    @Override // xsna.wk50
    public final void N(o0x0 o0x0Var, h0x0 h0x0Var) {
        o0x0 o0x0Var2 = o0x0Var;
        h0x0 h0x0Var2 = h0x0Var;
        boolean z = h0x0Var2 instanceof h0x0.a;
        int i = this.h;
        UserId userId = this.f;
        kvw0 kvw0Var = this.g;
        if (z) {
            final boolean z2 = ((h0x0.a) h0x0Var2).b;
            a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(kvw0Var.a(i, null, userId), new l8u0(new meh(z2, this, 4), 3)), new io.reactivex.rxjava3.functions.a() { // from class: xsna.i0x0
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    if (z2) {
                        this.T(new g0x0.a.f(false));
                    }
                }
            }), new xkw0(this, 2), new hij0(this, 25), 1);
            return;
        }
        if (!(h0x0Var2 instanceof h0x0.b)) {
            if ((h0x0Var2 instanceof h0x0.c) && (o0x0Var2 instanceof o0x0.a)) {
                o0x0.d dVar = ((o0x0.a) o0x0Var2).b;
                a990<Integer> a990Var = dVar.b;
                if (a990Var.b) {
                    a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(kvw0Var.a(i, a990Var.a, userId), new e7q0(new ntw0(this, 1), 12)), new h9i0(9, this, dVar), new w7w0(this, 6), 1);
                    return;
                }
                return;
            }
            return;
        }
        if (o0x0Var2 instanceof o0x0.a) {
            o0x0.d dVar2 = ((o0x0.a) o0x0Var2).b;
            a990<Integer> a990Var2 = dVar2.b;
            if (a990Var2.b && (a990Var2.d instanceof a990.b.a) && (a990Var2.c instanceof a990.a.b)) {
                a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.n(kvw0Var.a(i, a990Var2.a, userId), new tk40(new ijw0(this, 3), 28)), new y5m0(7, this, dVar2), new u5p0(this, 24), 1);
            }
        }
    }

    public final void U(s6x0 s6x0Var, o0x0.d dVar) {
        ArrayList arrayList = s6x0Var.a;
        int size = dVar.a.size();
        ArrayList arrayList2 = s6x0Var.a;
        T(new g0x0.a.c.C2907c(arrayList, arrayList2.size() + size, s6x0Var.b > arrayList2.size() + dVar.a.size()));
    }
}
