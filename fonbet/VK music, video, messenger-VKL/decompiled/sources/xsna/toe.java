package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;

/* compiled from: ClipsOwnerSwipeInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class toe implements soe {
    public final urf a;
    public final bpe b;
    public final xne c;

    public toe(urf urfVar, bpe bpeVar, xne xneVar) {
        this.a = urfVar;
        this.b = bpeVar;
        this.c = xneVar;
    }

    @Override // xsna.soe
    public final void a(String str) {
        this.b.a(str);
    }

    @Override // xsna.soe
    public final boolean b(String str) {
        return this.b.b(str);
    }

    @Override // xsna.soe
    public final io.reactivex.rxjava3.internal.operators.observable.b0 c(String str) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        urf urfVar = this.a;
        io.reactivex.rxjava3.core.q<ClipFeedTab> c = urfVar.c(str);
        c.getClass();
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(c, qVar, aVar).subscribe(new az(new ml1(6, this, str), 17)));
        io.reactivex.rxjava3.core.q<tqf> v = urfVar.v(str);
        v.getClass();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(v, qVar, aVar).s0(new kb(new i8(21), 18)).subscribe(new cz(new ju(4, this, str), 16)));
        return this.b.c(str).G(new ntb(bVar, 2));
    }

    @Override // xsna.soe
    public final void d(String str, boolean z) {
        this.b.d(str, z);
    }
}
