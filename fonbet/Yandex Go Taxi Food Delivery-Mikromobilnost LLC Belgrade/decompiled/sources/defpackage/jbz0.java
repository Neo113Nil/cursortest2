package defpackage;

import android.app.Activity;
import androidx.appcompat.widget.Toolbar;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.chat.h;
import com.yandex.messaging.input.d;
import com.yandex.messaging.internal.net.Error;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.internal.view.chat.b;
import com.yandex.messaging.internal.view.chat.e;
import com.yandex.messaging.internal.view.chat.input.textsuggest.c;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.ui.statuses.a;
import com.yandex.messaging.ui.timeline.g;

/* loaded from: classes15.dex */
public final class jbz0 {
    public final c A;
    public final n720 B;
    public final oey0 C;
    public final rcy0 D;
    public j3b E;
    public final ike G;
    public pzt0 H;
    public pzt0 I;
    public final Activity a;
    public final ChatRequest b;
    public final hbz0 c;
    public final pu31 d;
    public final sfl0 e;
    public final ucz0 f;
    public final i g;
    public final dbz0 h;
    public final blt0 i;
    public final ChatSearchToolbarBrick j;
    public final com.yandex.messaging.internal.view.chat.c k;
    public final e l;
    public final ig3 m;
    public final b n;
    public final mrh o;
    public final h3y p;
    public final h3y q;
    public final o9x r;
    public final d s;
    public final a t;
    public final com.yandex.messaging.internal.view.chat.input.a u;
    public final odz0 v;
    public final m0w w;
    public final com.yandex.messaging.domain.chat.e x;
    public final com.yandex.messaging.ui.settings.a y;
    public final jey0 z;
    public fqb1 F = ldz0.a;
    public final i3y J = kotlin.a.a(new oew0(27, this));

    public jbz0(Activity activity, ChatRequest chatRequest, hbz0 hbz0Var, pu31 pu31Var, sfl0 sfl0Var, ucz0 ucz0Var, i iVar, dbz0 dbz0Var, blt0 blt0Var, ChatSearchToolbarBrick chatSearchToolbarBrick, com.yandex.messaging.internal.view.chat.c cVar, e eVar, ig3 ig3Var, b bVar, mrh mrhVar, h3y h3yVar, h3y h3yVar2, o9x o9xVar, d dVar, a aVar, com.yandex.messaging.internal.view.chat.input.a aVar2, odz0 odz0Var, m0w m0wVar, com.yandex.messaging.domain.chat.e eVar2, com.yandex.messaging.ui.settings.a aVar3, h hVar, jey0 jey0Var, c cVar2, n720 n720Var, vse vseVar, oey0 oey0Var, rcy0 rcy0Var) {
        this.a = activity;
        this.b = chatRequest;
        this.c = hbz0Var;
        this.d = pu31Var;
        this.e = sfl0Var;
        this.f = ucz0Var;
        this.g = iVar;
        this.h = dbz0Var;
        this.i = blt0Var;
        this.j = chatSearchToolbarBrick;
        this.k = cVar;
        this.l = eVar;
        this.m = ig3Var;
        this.n = bVar;
        this.o = mrhVar;
        this.p = h3yVar;
        this.q = h3yVar2;
        this.r = o9xVar;
        this.s = dVar;
        this.t = aVar;
        this.u = aVar2;
        this.v = odz0Var;
        this.w = m0wVar;
        this.x = eVar2;
        this.y = aVar3;
        this.z = jey0Var;
        this.A = cVar2;
        this.B = n720Var;
        this.C = oey0Var;
        this.D = rcy0Var;
        this.G = vseVar.a(activity);
    }

    public final void a() {
        if (this.B.a()) {
            fdz0 fdz0Var = (fdz0) this.q.get();
            Toolbar toolbar = (Toolbar) fdz0Var.w.getValue();
            toolbar.getMenu().clear();
            toolbar.getMenu();
            fdz0Var.c.getClass();
            int i = n720.a;
        }
    }

    public final void b(fqb1 fqb1Var) {
        if (this.F.equals(fqb1Var)) {
            return;
        }
        this.F = fqb1Var;
        boolean z = fqb1Var instanceof ldz0;
        h3y h3yVar = this.p;
        n720 n720Var = this.B;
        hbz0 hbz0Var = this.c;
        if (z) {
            hbz0Var.y.a(this.g);
            ai91.f(hbz0Var.y.a, false);
            ai91.c(hbz0Var.z.a, false);
            if (n720Var.a()) {
                ((g) h3yVar.get()).v();
                return;
            }
            return;
        }
        this.h.c = ((hdz0) fqb1Var).c();
        tje.e();
        hbz0Var.z.a((Brick) this.J.getValue());
        ai91.f(hbz0Var.z.a, false);
        ai91.c(hbz0Var.y.a, false);
        ycz0 ycz0Var = this.v.d;
        if (ycz0Var.i) {
            ycz0Var.a();
        }
        if (n720Var.a()) {
            ((g) h3yVar.get()).u(Error.PRIVACY_RESTRICTIONS);
        }
    }
}
