package xsna;

import android.app.Activity;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.dto.common.id.UserId;

/* compiled from: CoauthorsHelper.kt */
/* loaded from: classes17.dex */
public final class tyf {
    public final u6d a;
    public final zof b;
    public final ClipsCoauthorsComponent c;
    public final anc d;
    public final j70 e;
    public final a f = new a();

    /* compiled from: CoauthorsHelper.kt */
    public final class a implements syf {
        public a() {
        }

        @Override // xsna.syf
        public final void a(UserId userId, boolean z) {
            tyf.this.a.a(new q4d(userId, z));
        }

        @Override // xsna.syf
        public final void b(UserId userId, w8 w8Var) {
            tyf.this.a.a(new s4d(userId, new k7f(w8Var, 2)));
        }

        @Override // xsna.syf
        public final void c(UserId userId, e5 e5Var) {
            tyf tyfVar = tyf.this;
            Activity c = g2u0.c((o1d) tyfVar.e.c);
            if (c == null) {
                return;
            }
            tyfVar.d.a(c, new j2b(tyfVar, userId, e5Var, 1));
        }
    }

    public tyf(j1d j1dVar, zof zofVar, ClipsCoauthorsComponent clipsCoauthorsComponent, anc ancVar, j70 j70Var) {
        this.a = j1dVar;
        this.b = zofVar;
        this.c = clipsCoauthorsComponent;
        this.d = ancVar;
        this.e = j70Var;
    }
}
