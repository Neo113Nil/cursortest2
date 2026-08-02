package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoUpload;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VideoExternalEventHandlerDelegate.kt */
/* loaded from: classes.dex */
public final class dks0 extends l5a {
    public final io.reactivex.rxjava3.disposables.b c;
    public final wot0 d;
    public final c6s0 e;

    public dks0(q3a q3aVar) {
        super(q3aVar);
        this.c = new io.reactivex.rxjava3.disposables.b();
        this.d = new wot0();
        this.e = new c6s0();
    }

    public static boolean b(UIBlockList uIBlockList, String str) {
        if (epx.f(uIBlockList.Jb(), str)) {
            return true;
        }
        ArrayList<UIBlock> Sb = uIBlockList.Sb();
        if (Sb != null && Sb.isEmpty()) {
            return false;
        }
        Iterator<T> it = Sb.iterator();
        while (it.hasNext()) {
            if (((UIBlock) it.next()) instanceof UIBlockVideoUpload) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.l5a
    public final void a() {
        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = fVar.a0(asu0Var.d()).subscribe(new y0v(new m0p0(this, 1), 1));
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        hg1.e(bVar, subscribe);
        hg1.e(bVar, xwk.e().T().m().d.a0(asu0Var.d()).subscribe(new a1v(new cks0(this), 3)));
        hg1.e(bVar, fxc0.B().E().b().a0(asu0Var.d()).subscribe(new ax50(new xw50(this, 2), 1)));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.observable.q(new pzn(context)).a0(asu0Var.d()).subscribe(new f340(new aks0(this), 2)));
    }

    public final void c(n3a n3aVar) {
        this.b.b(n3aVar, false);
    }

    public final void d(n3a... n3aVarArr) {
        for (n3a n3aVar : n3aVarArr) {
            this.b.b(n3aVar, false);
        }
    }
}
