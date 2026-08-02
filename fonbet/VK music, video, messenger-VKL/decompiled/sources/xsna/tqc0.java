package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import xsna.nqc0;
import xsna.yqc0;

/* compiled from: PostingWithAuthorView.kt */
/* loaded from: classes4.dex */
public final class tqc0 extends i6v0<yqc0, kqc0> {
    public final ttk0<Boolean> f;

    public tqc0(lqc0 lqc0Var, Context context, utk0 utk0Var) {
        super(context, lqc0Var);
        this.f = utk0Var;
        vq.b(-1, -2, this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xpo0
    public final void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        yqc0 yqc0Var = (yqc0) ao50Var;
        aVar.K(-467668043);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-467668043, 512, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.PostingWithAuthorView.ThemedContent (PostingWithAuthorView.kt:83)");
        }
        fm50 fm50Var = (fm50) d(yqc0.c.a, new n0u0[]{yqc0Var.a, yqc0Var.b, yqc0Var.c}, aVar, 518).getValue();
        if ((fm50Var instanceof yqc0.c) || (fm50Var instanceof yqc0.d)) {
            aVar2 = aVar;
            aVar2.K(575752790);
            xqc0.d(0, aVar2);
            aVar2.j();
        } else if (fm50Var instanceof yqc0.a) {
            aVar.K(575882928);
            wh50 c = jk50.c(((yqc0.a) fm50Var).a, aVar);
            wh50 s = nr2.s(kci.e(this.f, 500L), Boolean.FALSE, null, aVar, 48, 2);
            aVar2 = aVar;
            vcc0 vcc0Var = (vcc0) c.getValue();
            boolean booleanValue = ((Boolean) s.getValue()).booleanValue();
            boolean J = aVar2.J(izsVar) | aVar2.J(c);
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new ml1(20, izsVar, c);
                aVar2.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean J2 = aVar2.J(izsVar);
            Object x2 = aVar2.x();
            if (J2 || x2 == c0012a) {
                x2 = new b97(izsVar, 7);
                aVar2.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean J3 = aVar2.J(izsVar);
            Object x3 = aVar2.x();
            if (J3 || x3 == c0012a) {
                x3 = new wq0(izsVar, 5);
                aVar2.R(x3);
            }
            xqc0.e(vcc0Var, booleanValue, izsVar2, gzsVar, (gzs) x3, aVar2, 0);
            aVar2.j();
        } else {
            aVar2 = aVar;
            if (fm50Var instanceof yqc0.b) {
                aVar2.K(576684061);
                nqc0 nqc0Var = (nqc0) jk50.c(((yqc0.b) fm50Var).a, aVar2).getValue();
                if (nqc0Var instanceof nqc0.b) {
                    aVar2.K(576813269);
                    ctz.a(izsVar, aVar2, 0);
                    aVar2.j();
                } else {
                    if (!(nqc0Var instanceof nqc0.a) && !(nqc0Var instanceof nqc0.c)) {
                        throw alb0.c(1542625459, aVar2);
                    }
                    aVar2.K(577004043);
                    rnx.a(izsVar, aVar2, 0);
                    aVar2.j();
                }
            } else {
                aVar2.K(571106541);
            }
            aVar2.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
    }
}
