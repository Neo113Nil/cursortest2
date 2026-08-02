package defpackage;

import android.net.Uri;
import com.yandex.payment.divkit.bind.b;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class mrf implements ox90 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ mrf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void h() {
    }

    private final void i(String str) {
    }

    private final void j() {
    }

    private final void k(ct20 ct20Var) {
    }

    @Override // defpackage.ox90
    public final void a(Uri uri, List list) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b) obj).B.l(new ml41(uri, list));
                break;
            default:
                ((ryj0) obj).onSuccess(new pm0(uri.toString(), list));
                break;
        }
    }

    @Override // defpackage.ox90
    public final void b(String str) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((ryj0) this.b).onSuccess(new mm0(str));
                break;
        }
    }

    @Override // defpackage.ox90
    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b) obj).B.l(kl41.a);
                break;
            default:
                ((ryj0) obj).onSuccess(lm0.a);
                break;
        }
    }

    @Override // defpackage.ox90
    public final void d(Uri uri) {
        switch (this.a) {
            case 0:
                ((b) this.b).B.l(new ll41(uri));
                break;
            default:
                a(uri, EmptyList.a);
                break;
        }
    }

    @Override // defpackage.ox90
    public final void e(ct20 ct20Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((ryj0) this.b).onSuccess(new qm0(ct20Var));
                break;
        }
    }

    @Override // defpackage.ox90
    public final void f() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((sls) this.c).invoke();
                break;
        }
    }

    @Override // defpackage.ox90
    public final void g() {
        switch (this.a) {
            case 0:
                ((bg8) this.c).provideCardData();
                break;
        }
    }
}
