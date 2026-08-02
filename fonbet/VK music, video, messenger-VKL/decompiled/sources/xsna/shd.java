package xsna;

import android.content.ComponentCallbacks2;
import com.vk.auth.external.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class shd implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ shd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((thd) this.c).f = null;
                break;
            case 1:
                ((xam) this.c).s = null;
                break;
            case 2:
                ((asm) this.c).c();
                break;
            case 3:
                ((gzs) this.c).invoke();
                break;
            case 4:
                ((m3g0) this.c).n = true;
                break;
            case 5:
                dfi0 dfi0Var = (dfi0) this.c;
                ComponentCallbacks2 h = e3m.h(dfi0Var.a);
                aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
                if (aeg0Var != null) {
                    aeg0Var.yk(dfi0Var.d);
                    break;
                }
                break;
            case 6:
                ((yau0) this.c).i.setLoading(false);
                break;
            default:
                com.vk.auth.external.b bVar = (com.vk.auth.external.b) this.c;
                a.C0400a c0400a = new a.C0400a("");
                bVar.e = c0400a;
                bVar.f = c0400a;
                bVar.b.tn(c0400a);
                break;
        }
    }
}
