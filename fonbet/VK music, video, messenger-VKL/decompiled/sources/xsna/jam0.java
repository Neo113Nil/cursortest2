package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: StoryPrivacyView.kt */
/* loaded from: classes16.dex */
public final class jam0 implements gm50 {
    public final d9m0 b;
    public final View c;
    public final b9m0 d;

    public jam0(Context context, d9m0 d9m0Var, View view, boolean z, emh0 emh0Var) {
        this.b = d9m0Var;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.content);
        View findViewById = view.findViewById(R.id.confirm);
        this.c = findViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        svk0 svk0Var = new svk0(emh0Var, 7);
        b9m0 b9m0Var = new b9m0();
        b9m0Var.y0(new u9m0(svk0Var));
        b9m0Var.y0(new e9m0(svk0Var));
        b9m0Var.y0(new gam0());
        this.d = b9m0Var;
        dhr0.a.getClass();
        gpu0 gpu0Var = new gpu0(dhr0.s());
        gpu0Var.j = new iam0(this);
        recyclerView.setAdapter(b9m0Var);
        recyclerView.addItemDecoration(gpu0Var);
        if (!z) {
            f4m.q(cn70.b(8), recyclerView);
        }
        findViewById.setVisibility(z ? 0 : 8);
        bwt0.i0(findViewById, new ptl0(emh0Var, 3));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
