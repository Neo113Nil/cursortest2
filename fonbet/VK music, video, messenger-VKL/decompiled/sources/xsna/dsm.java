package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.dialogslist.api.list.DialogsListConfigToken;
import com.vk.dialogslist.impl.DialogsFragment;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vkontakte.android.R;
import xsna.odw;

/* compiled from: DialogsListComponent.kt */
/* loaded from: classes18.dex */
public final class dsm extends yj50<psm, oum, ytm, fum, num, dtm, qtm> {
    public final DialogsFragment n;
    public final DialogsListConfigToken o;
    public final ko8 p;
    public final int q;
    public final ksm r;
    public final FolderType s;
    public final a1w t;
    public final mxv u;
    public final bpn0 v;
    public final bpn0 w;

    public dsm(DialogsFragment dialogsFragment, DialogsListConfigToken dialogsListConfigToken, ko8 ko8Var, ksm ksmVar, FolderType folderType) {
        super(dialogsFragment, dialogsFragment, ytm.class, false);
        this.n = dialogsFragment;
        this.o = dialogsListConfigToken;
        this.p = ko8Var;
        this.q = R.layout.dialogs_list;
        this.r = ksmVar;
        this.s = folderType;
        this.t = ksmVar.a;
        this.u = g2v.c();
        this.v = new bpn0(new y3i(this, 3));
        this.w = new bpn0(new x5i(this, 8));
    }

    @Override // xsna.yj50
    public final psm a(Bundle bundle) {
        odw qdwVar;
        esm esmVar = (esm) this.w.getValue();
        a1w a1wVar = this.t;
        tum tumVar = new tum(a1wVar);
        io.reactivex.rxjava3.internal.operators.observable.m1 a = a1wVar.l.a();
        htm htmVar = (htm) e(itm.class, (String) this.v.getValue(), new ozf(a1wVar, 26));
        cau0 cau0Var = a1wVar.r().h;
        Peer q = a1wVar.q();
        q.getClass();
        if (q.Ab(Peer.Type.GROUP)) {
            odw.a.getClass();
            qdwVar = odw.a.b;
        } else {
            qdwVar = new qdw(a1wVar, this.u.g());
        }
        return new psm(esmVar, tumVar, a, htmVar, this.r, cau0Var, qdwVar, this.t, this.u, this.s, ((ImReportersComponent) m7m.d(this.n).a(fpf0.a(ImReportersComponent.class))).K().w());
    }

    @Override // xsna.yj50
    public final qtm b() {
        FragmentActivity kn = this.n.kn();
        bpn0 bpn0Var = this.w;
        return new qtm(kn, this.u, ((esm) bpn0Var.getValue()).f(), ((esm) bpn0Var.getValue()).e(), ((esm) bpn0Var.getValue()).n());
    }

    @Override // xsna.yj50
    public final fum d() {
        a1w a1wVar = this.t;
        return new fum(this.q, a1wVar, a1wVar.r().h, (esm) this.w.getValue(), this.r.d());
    }
}
