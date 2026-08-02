package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.ProfilesInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import xsna.shm;

/* compiled from: DialogMentionVc.kt */
/* loaded from: classes2.dex */
public final class thm {
    public final View a;
    public final fj0 b;
    public shm.a c;

    /* compiled from: DialogMentionVc.kt */
    public final class a implements gj0 {
        public a() {
        }

        @Override // xsna.gj0
        public final void a(k320 k320Var) {
            g2z g2zVar;
            shm.a aVar = thm.this.c;
            if (aVar == null || (g2zVar = shm.this.r) == null) {
                return;
            }
            v420 v420Var = ((o420) g2zVar.b).i;
            v420Var.b.a();
            int[] b = v420Var.b();
            v420Var.a.getEditableText().replace(b[0], b[1], k320Var.a() + ' ');
        }
    }

    public thm(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_dialog_mention, viewGroup, false);
        this.a = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        fj0 fj0Var = new fj0(layoutInflater, new a());
        this.b = fj0Var;
        layoutInflater.getContext();
        if (recyclerView != null) {
            recyclerView.setRecycledViewPool(new rru());
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(fj0Var);
        a(new h6n0((m420) null, 3));
    }

    public final void a(h6n0 h6n0Var) {
        Integer valueOf;
        fj0 fj0Var = this.b;
        fj0Var.getClass();
        ArrayList arrayList = new ArrayList();
        m420 m420Var = h6n0Var.a;
        Collection<k320> collection = m420Var.a;
        ProfilesInfo profilesInfo = m420Var.b;
        for (k320 k320Var : collection) {
            if (k320Var instanceof x120) {
                x120 x120Var = (x120) k320Var;
                if (h6n0Var.b.get(x120Var.a) != null) {
                    profilesInfo.Bb(x120Var.a);
                }
                arrayList.add(new w120(x120Var, profilesInfo));
            } else {
                if (!(k320Var instanceof xi10)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new yi10((xi10) k320Var));
            }
        }
        int i = m420Var.d;
        if (i == 0) {
            valueOf = null;
        } else {
            int size = i - collection.size();
            if (size < 0) {
                size = 0;
            }
            valueOf = Integer.valueOf(size);
        }
        p4g.a(new ftz(valueOf), arrayList, !m420Var.c);
        fj0Var.setItems(arrayList);
        fj0Var.notifyDataSetChanged();
    }
}
