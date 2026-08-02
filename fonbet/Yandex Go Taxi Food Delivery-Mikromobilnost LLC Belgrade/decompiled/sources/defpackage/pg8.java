package defpackage;

import android.net.Uri;
import com.yandex.payment.divkit.bind.b;
import com.yandex.payment.sdk.ui.preselect.newbind.PreselectNewBindFragment;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class pg8 implements ox90, us20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pg8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n(String str) {
    }

    private final void o(String str) {
    }

    private final void p(String str) {
    }

    private final void q(String str) {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void t() {
    }

    private final void u() {
    }

    private final void v(ct20 ct20Var) {
    }

    private final void w(ct20 ct20Var) {
    }

    private final void x(ct20 ct20Var) {
    }

    private final void y(ct20 ct20Var) {
    }

    private final void z(ct20 ct20Var) {
    }

    @Override // defpackage.ox90
    public final void a(Uri uri, List list) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ol41 ol41Var = ((qg8) obj).e;
                if (ol41Var != null) {
                    ol41Var.c(new ml41(uri, list));
                    break;
                }
                break;
            case 1:
                cle cleVar = ((jle) obj).b;
                ((wke) cleVar).a.d(uri.toString(), list);
                break;
            case 2:
                ((b) obj).O.l(new ml41(uri, list));
                break;
            case 3:
                ((kvf) obj).N.m(new ml41(uri, list));
                break;
            case 4:
                ((l560) obj).y.l(new ml41(uri, list));
                break;
            default:
                ((wve0) obj).D.l(new sve0(uri.toString(), list));
                break;
        }
    }

    @Override // defpackage.ox90
    public final void b(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((wke) ((jle) obj).b).a.K();
                break;
            case 3:
                ((kvf) obj).N.m(kl41.a);
                break;
        }
    }

    @Override // defpackage.ox90
    public final void c() {
        int i = this.a;
        kl41 kl41Var = kl41.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ol41 ol41Var = ((qg8) obj).e;
                if (ol41Var != null) {
                    ol41Var.c(kl41Var);
                    break;
                }
                break;
            case 1:
                ((wke) ((jle) obj).b).a.f();
                break;
            case 2:
                ((b) obj).O.l(kl41Var);
                break;
            case 3:
                ((kvf) obj).N.m(kl41Var);
                break;
            case 4:
                ((l560) obj).y.l(kl41Var);
                break;
            default:
                ((wve0) obj).D.l(rve0.a);
                break;
        }
    }

    @Override // defpackage.ox90
    public final void d(Uri uri) {
        int i = this.a;
        EmptyList emptyList = EmptyList.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ol41 ol41Var = ((qg8) obj).e;
                if (ol41Var != null) {
                    ol41Var.c(new ll41(uri));
                    break;
                }
                break;
            case 1:
                a(uri, emptyList);
                break;
            case 2:
                ((b) obj).O.l(new ll41(uri));
                break;
            case 3:
                ((kvf) obj).N.l(new ll41(uri));
                break;
            case 4:
                ((l560) obj).y.l(new ll41(uri));
                break;
            default:
                a(uri, emptyList);
                break;
        }
    }

    @Override // defpackage.ox90
    public final void e(ct20 ct20Var) {
        fvf fvfVar;
        switch (this.a) {
            case 3:
                p89 p89Var = ct20Var instanceof p89 ? (p89) ct20Var : null;
                if (p89Var != null && (fvfVar = ((kvf) this.b).E) != null) {
                    fvfVar.invoke(p89Var.b);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ox90
    public final void f() {
        int i = this.a;
    }

    @Override // defpackage.ox90
    public final void g() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bg8 bg8Var = ((qg8) obj).c;
                if (bg8Var != null) {
                    bg8Var.provideCardData();
                    break;
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                CardInputViewImpl cardInputViewImpl = ((PreselectNewBindFragment.a) ((wve0) obj).w).a;
                if (cardInputViewImpl != null) {
                    cardInputViewImpl.provideCardData();
                    break;
                }
                break;
        }
    }
}
