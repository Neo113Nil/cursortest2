package xsna;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: DocHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class jtn extends ae6 {
    public final String l;
    public final String m;
    public final LinearLayoutManager n;
    public final ftn o;

    public jtn(Context context, htn htnVar, kkm kkmVar) {
        super(htnVar);
        this.l = context.getString(R.string.vkim_history_attaches_empty_list_doc);
        this.m = context.getString(R.string.vkim_history_attaches_tab_doc);
        this.n = new LinearLayoutManager();
        ftn ftnVar = new ftn(kkmVar);
        ftnVar.h.a = new rd7(htnVar, this);
        this.o = ftnVar;
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
