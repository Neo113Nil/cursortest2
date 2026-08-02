package xsna;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Peer;

/* compiled from: AppsHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class if3 extends ae6 {
    public final Context l;
    public final String m;
    public final String n;
    public final Peer o;
    public final LinearLayoutManager p;
    public final vd3 q;

    public if3(Context context, yd3 yd3Var, kkm kkmVar, String str, String str2, Peer peer) {
        super(yd3Var);
        this.l = context;
        this.m = str;
        this.n = str2;
        this.o = peer;
        this.p = new LinearLayoutManager();
        com.vk.movika.sdk.base.observable.e eVar = new com.vk.movika.sdk.base.observable.e(this, 6);
        ul1 ul1Var = new ul1(yd3Var, 5);
        vd3 vd3Var = new vd3(false);
        vd3Var.y0(new xd3(eVar, ul1Var));
        vd3Var.y0(new tsz(kkmVar));
        this.q = vd3Var;
    }

    @Override // xsna.ae6
    public final qul e() {
        return this.q;
    }

    @Override // xsna.ae6
    public final String f() {
        return this.m;
    }

    @Override // xsna.ae6
    public final RecyclerView.o g() {
        return this.p;
    }

    @Override // xsna.f8v
    public final String getTitle() {
        return this.n;
    }
}
