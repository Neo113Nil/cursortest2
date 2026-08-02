package xsna;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: AudioHistoryAttachesVC.kt */
/* loaded from: classes2.dex */
public final class pp4 extends ae6 {
    public final String l;
    public final String m;
    public final LinearLayoutManager n;
    public final cc4 o;

    public pp4(Context context, jc4 jc4Var, kkm kkmVar) {
        super(jc4Var);
        this.l = context.getString(R.string.vkim_history_attaches_empty_list_audio);
        this.m = context.getString(R.string.vkim_history_attaches_tab_audio);
        this.n = new LinearLayoutManager();
        op4 op4Var = new op4(jc4Var, this);
        cc4 cc4Var = new cc4(false);
        cc4Var.y0(new ic4(op4Var));
        cc4Var.y0(new tsz(kkmVar));
        this.o = cc4Var;
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
