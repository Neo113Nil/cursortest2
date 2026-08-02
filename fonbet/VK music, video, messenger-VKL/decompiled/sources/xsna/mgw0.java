package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.contacts.Contact;
import kotlin.NoWhenBranchMatchedException;
import xsna.lgw0;
import xsna.ogw0;
import xsna.pgw0;
import xsna.rgw0;

/* compiled from: VoipCallByPhoneFeature.kt */
/* loaded from: classes7.dex */
public final class mgw0 extends wk50<tgw0, rgw0, lgw0, pgw0> {
    public final a1w f;
    public final b25 g;
    public final o6k h;
    public final f4z<ogw0> i;
    public final f4z<sgw0> j;
    public io.reactivex.rxjava3.disposables.c k;

    public mgw0(a1w a1wVar, b25 b25Var, o6k o6kVar, qgw0 qgw0Var) {
        super(lgw0.d.b, qgw0Var);
        this.f = a1wVar;
        this.g = b25Var;
        this.h = o6kVar;
        this.i = new f4z<>();
        this.j = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(rgw0 rgw0Var, lgw0 lgw0Var) {
        rgw0 rgw0Var2 = rgw0Var;
        lgw0 lgw0Var2 = lgw0Var;
        if (lgw0Var2 instanceof lgw0.d) {
            T(pgw0.f.b);
            return;
        }
        if (lgw0Var2 instanceof lgw0.e) {
            String str = ((lgw0.e) lgw0Var2).b;
            io.reactivex.rxjava3.disposables.c cVar = this.k;
            if (cVar != null) {
                cVar.dispose();
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            T(new pgw0.h(str, sb.toString().length() >= 11, false));
            return;
        }
        if (lgw0Var2 instanceof lgw0.c) {
            io.reactivex.rxjava3.disposables.c cVar2 = this.k;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            T(new pgw0.h("", false, true));
            return;
        }
        if (!(lgw0Var2 instanceof lgw0.a)) {
            if (!(lgw0Var2 instanceof lgw0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (rgw0Var2 instanceof rgw0.i) {
                U(((rgw0.i) rgw0Var2).b);
                return;
            }
            return;
        }
        boolean z = rgw0Var2 instanceof rgw0.d;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (!z) {
            if (rgw0Var2 instanceof rgw0.b) {
                U(((rgw0.b) rgw0Var2).b);
                return;
            }
            if ((rgw0Var2 instanceof rgw0.h) || (rgw0Var2 instanceof rgw0.c) || (rgw0Var2 instanceof rgw0.i)) {
                T(new pgw0.c(rgw0Var2));
                o6k o6kVar = this.h;
                io.reactivex.rxjava3.internal.operators.observable.f0 a = o6kVar.a(o6kVar.b());
                asu0 asu0Var = asu0.a;
                io.reactivex.rxjava3.disposables.c e = io.reactivex.rxjava3.kotlin.c.e(a.q(asu0Var.c()).m(asu0Var.d()), new mz80(22, this, rgw0Var2), new h9i0(8, this, rgw0Var2));
                bVar.b(e);
                this.k = e;
                return;
            }
            return;
        }
        String str2 = ((rgw0.d) rgw0Var2).b;
        StringBuilder sb2 = new StringBuilder();
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt2 = str2.charAt(i2);
            if (Character.isDigit(charAt2) || charAt2 == '+') {
                sb2.append(charAt2);
            }
        }
        io.reactivex.rxjava3.internal.operators.single.c C = this.f.C(this, new s8j(sb2.toString(), this.g.L()));
        asu0 asu0Var2 = asu0.a;
        io.reactivex.rxjava3.disposables.c e2 = io.reactivex.rxjava3.kotlin.c.e(C.q(asu0Var2.c()).m(asu0Var2.d()), new i2s0(3, this, str2), new a2a(1, this, mgw0.class, "handleLoadedProfile", "handleLoadedProfile(Lcom/vk/im/engine/models/Profile;)V", 0, 14));
        bVar.b(e2);
        this.k = e2;
        T(pgw0.e.b);
    }

    public final void U(qtd0 qtd0Var) {
        f4z<ogw0> f4zVar = this.i;
        if (qtd0Var instanceof Contact) {
            f4zVar.b(new ogw0.a((Contact) qtd0Var));
            return;
        }
        long id = qtd0Var.id();
        gzs<s3q0> gzsVar = fkq0.a;
        f4zVar.b(new ogw0.b(new UserId(id)));
    }

    public final void V(rgw0 rgw0Var) {
        if (rgw0Var instanceof rgw0.h) {
            T(pgw0.g.b);
        } else if (rgw0Var instanceof rgw0.c) {
            T(new pgw0.d(((rgw0.c) rgw0Var).b));
        } else if (rgw0Var instanceof rgw0.i) {
            T(new pgw0.i(((rgw0.i) rgw0Var).b));
        }
    }
}
