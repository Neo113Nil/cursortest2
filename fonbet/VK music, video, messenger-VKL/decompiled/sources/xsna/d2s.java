package xsna;

import android.os.Bundle;
import com.vk.folders.impl.show.FoldersShowFragment;

/* compiled from: FoldersShowComponent.kt */
/* loaded from: classes18.dex */
public final class d2s extends yj50<i2s, t2s, p2s, r2s, s2s, m2s, n2s> {
    public final FoldersShowFragment n;
    public final a1w o;
    public final l2s p;
    public final bpn0 q;

    public d2s(FoldersShowFragment foldersShowFragment, a1w a1wVar, l2s l2sVar) {
        super(foldersShowFragment, foldersShowFragment, p2s.class, false);
        this.n = foldersShowFragment;
        this.o = a1wVar;
        this.p = l2sVar;
        this.q = new bpn0(new n1i(this, 6));
    }

    @Override // xsna.yj50
    public final i2s a(Bundle bundle) {
        bpn0 bpn0Var = this.q;
        String str = (String) bpn0Var.getValue();
        a1w a1wVar = this.o;
        b1s t = zq70.t(this, str, a1wVar);
        String str2 = (String) bpn0Var.getValue();
        com.vk.folders.impl.model.a aVar = (com.vk.folders.impl.model.a) e(com.vk.folders.impl.model.a.class, str2, new kk(a1wVar, this, str2, 3));
        io.reactivex.rxjava3.subjects.f<a1s> fVar = t.c;
        String str3 = (String) bpn0Var.getValue();
        v0s v0sVar = (v0s) e(v0s.class, str3, new j5q(a1wVar, this, str3, 1));
        return new i2s(aVar, new y1s(a1wVar), fVar, v0sVar, this.p, a1wVar.r().h);
    }

    @Override // xsna.yj50
    public final n2s b() {
        return new n2s(this.n);
    }

    @Override // xsna.yj50
    public final r2s d() {
        return new r2s();
    }
}
