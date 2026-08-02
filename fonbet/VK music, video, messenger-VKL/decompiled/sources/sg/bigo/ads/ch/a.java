package sg.bigo.ads.ch;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.an.g;
import sg.bigo.ads.ci.f;
import sg.bigo.ads.ci.i;
import sg.bigo.ads.cn.h;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class a extends c {
    sg.bigo.ads.cl.e a;

    public a(sg.bigo.ads.cf.b bVar, g gVar, sg.bigo.ads.ci.e eVar, i iVar) {
        super(bVar, gVar, eVar, iVar);
    }

    @Override // sg.bigo.ads.ch.c
    public final sg.bigo.ads.bh.e a() {
        return sg.bigo.ads.bp.e.d();
    }

    @Override // sg.bigo.ads.ch.c
    public final sg.bigo.ads.cg.b b() {
        return this.b.a.i;
    }

    @Override // sg.bigo.ads.ch.c
    public final void a(final Pair<String, Integer> pair) {
        g gVar;
        if (pair == null || (gVar = this.c) == null || this.d == null || this.e == null) {
            return;
        }
        String a = gVar.a();
        if (r.a((CharSequence) a) || !sg.bigo.ads.cl.c.a().a(a)) {
            return;
        }
        this.h.set(true);
        h hVar = new h(this.c, this.b, this.e, f.F(), new sg.bigo.ads.ce.b() { // from class: sg.bigo.ads.ch.a.1
            @Override // sg.bigo.ads.ce.e
            public final void a(int i, int i2, int i3, @NonNull String str, @Nullable Object obj) {
                a.this.h.set(false);
                a.this.a(pair, c.a(i3));
            }

            @Override // sg.bigo.ads.ce.b
            public final void a(int i, @NonNull String str) {
                a.this.h.set(false);
                sg.bigo.ads.cl.e eVar = a.this.a;
                if (eVar != null) {
                    eVar.a(i, str, true);
                }
                a.this.a(pair, false);
            }
        });
        hVar.i = (String) pair.first;
        hVar.b();
    }
}
