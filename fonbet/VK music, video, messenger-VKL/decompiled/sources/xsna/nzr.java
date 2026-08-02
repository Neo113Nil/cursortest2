package xsna;

import android.os.Bundle;
import com.vk.folders.impl.select.FolderPeersSelectFragment;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.esz;

/* compiled from: FolderPeersSelectComponent.kt */
/* loaded from: classes18.dex */
public final class nzr extends yj50<pzr, vzr, szr, tzr, uzr, qzr, rzr> {
    public final a1w n;
    public final FolderPeersSelectFragment o;
    public final iu90 p;
    public final bpn0 q;

    public nzr(a1w a1wVar, FolderPeersSelectFragment folderPeersSelectFragment, iu90 iu90Var) {
        super(folderPeersSelectFragment, folderPeersSelectFragment, szr.class, false);
        this.n = a1wVar;
        this.o = folderPeersSelectFragment;
        this.p = iu90Var;
        this.q = new bpn0(new cwg(this, 18));
    }

    @Override // xsna.yj50
    public final pzr a(Bundle bundle) {
        Integer num = this.p.a;
        bpn0 bpn0Var = this.q;
        String str = (String) bpn0Var.getValue();
        a1w a1wVar = this.n;
        b1s t = zq70.t(this, str, a1wVar);
        io.reactivex.rxjava3.core.q T = num == null ? io.reactivex.rxjava3.core.q.T(EmptySet.b) : new jzr(a1wVar, t.c, num.intValue()).d;
        io.reactivex.rxjava3.core.q T2 = num == null ? io.reactivex.rxjava3.core.q.T(EmptyList.b) : new d0s(a1wVar, t.c).b(num.intValue());
        a1wVar.a.getClass();
        esz.a.getClass();
        return new pzr(new ysm(a1wVar, 30, esz.a.b), new kzr(a1wVar), this.p, t.c, T, (htm) e(itm.class, (String) bpn0Var.getValue(), new ozf(a1wVar, 26)), T2);
    }

    @Override // xsna.yj50
    public final rzr b() {
        return new rzr(this.o);
    }

    @Override // xsna.yj50
    public final tzr d() {
        return new tzr();
    }
}
