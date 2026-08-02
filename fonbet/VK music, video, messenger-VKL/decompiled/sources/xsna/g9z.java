package xsna;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: LinkHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class g9z extends ae6 {
    public final String l;
    public final String m;
    public final LinearLayoutManager n;
    public final r8z o;

    public g9z(Context context, t8z t8zVar, kkm kkmVar) {
        super(t8zVar);
        this.l = context.getString(R.string.vkim_history_attaches_empty_list_link);
        this.m = context.getString(R.string.vkim_history_attaches_tab_link);
        this.n = new LinearLayoutManager();
        r8z r8zVar = new r8z(kkmVar);
        r8zVar.h.a = new j0u0(t8zVar, this, 2);
        this.o = r8zVar;
    }

    @Override // xsna.ae6
    public final qul e() {
        return this.o;
    }

    @Override // xsna.ae6
    public final String f() {
        return this.l;
    }

    @Override // xsna.ae6
    public final RecyclerView.o g() {
        return this.n;
    }

    @Override // xsna.f8v
    public final String getTitle() {
        return this.m;
    }
}
