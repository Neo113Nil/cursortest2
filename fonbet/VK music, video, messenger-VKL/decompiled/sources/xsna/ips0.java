package xsna;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: VideoHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class ips0 extends ae6 {
    public final Context l;
    public final j2s0 m;
    public final String n;
    public final String o;
    public final LinearLayoutManager p;
    public final d2s0 q;

    public ips0(Context context, j2s0 j2s0Var, kkm kkmVar) {
        super(j2s0Var);
        this.l = context;
        this.m = j2s0Var;
        this.n = context.getString(R.string.vkim_history_attaches_empty_list_video);
        this.o = context.getString(R.string.vkim_history_attaches_tab_video);
        this.p = i(context.getResources().getConfiguration().orientation);
        d2s0 d2s0Var = new d2s0(kkmVar);
        m6a m6aVar = new m6a(this);
        p1u0<SimpleAttachListItem> p1u0Var = d2s0Var.h;
        if (p1u0Var instanceof h2s0) {
            ((h2s0) p1u0Var).a = m6aVar;
        } else if (p1u0Var instanceof g2s0) {
            ((g2s0) p1u0Var).a = m6aVar;
        }
        this.q = d2s0Var;
    }

    @Override // xsna.ae6
    public final qul e() {
        return this.q;
    }

    @Override // xsna.ae6
    public final String f() {
        return this.n;
    }

    @Override // xsna.ae6
    public final RecyclerView.o g() {
        return this.p;
    }

    @Override // xsna.f8v
    public final String getTitle() {
        return this.o;
    }

    public final LinearLayoutManager i(int i) {
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(this.l);
        return i == 1 ? d ? new GridLayoutManager(2) : new LinearLayoutManager() : d ? new GridLayoutManager(3) : new GridLayoutManager(2);
    }
}
