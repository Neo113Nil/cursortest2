package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vk.music.mixsettings.MixCategoryType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SettingsCategoryItemVh.kt */
/* loaded from: classes3.dex */
public final class c1j0 extends RecyclerView.e0 {
    public final View l;
    public final o0r m;
    public final TextView n;
    public final RecyclerView o;
    public final GridLayoutManager p;
    public final igu q;

    public c1j0(View view, o0r o0rVar) {
        super(view);
        this.l = view;
        this.m = o0rVar;
        this.n = (TextView) view.findViewById(R.id.text_category);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_category);
        this.o = recyclerView;
        recyclerView.getContext();
        this.p = new GridLayoutManager(3);
        int b = cn70.b(8);
        this.q = new igu(3, b, b);
    }

    public final void V5(MixCategory mixCategory, a3j0 a3j0Var) {
        List<MixOption> list = mixCategory.e;
        boolean z = a3j0Var.b;
        this.n.setText(mixCategory.c);
        RecyclerView recyclerView = this.o;
        igu iguVar = this.q;
        recyclerView.removeItemDecoration(iguVar);
        MixCategoryType mixCategoryType = mixCategory.d;
        MixCategoryType mixCategoryType2 = MixCategoryType.BUTTONS;
        if (mixCategoryType == mixCategoryType2) {
            recyclerView.addItemDecoration(iguVar);
        }
        int i = 0;
        if (!z && !a3j0Var.c) {
            if (mixCategoryType != mixCategoryType2) {
                recyclerView.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.setOrientation(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                i4v0 i4v0Var = new i4v0(new rm0(27, this, mixCategory));
                i4v0Var.setItems(list);
                recyclerView.setAdapter(i4v0Var);
                return;
            }
            GridLayoutManager gridLayoutManager = this.p;
            recyclerView.setLayoutManager(gridLayoutManager);
            d4v0 d4v0Var = new d4v0(new aq1(21, this, mixCategory));
            int size = list.size();
            if (size > 0) {
                gridLayoutManager.setSpanCount(size);
                iguVar.b = size;
            }
            d4v0Var.setItems(list);
            recyclerView.setAdapter(d4v0Var);
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        o4v0 o4v0Var = adapter instanceof o4v0 ? (o4v0) adapter : null;
        if (o4v0Var != null) {
            ArrayList arrayList = o4v0Var.c;
            arrayList.clear();
            arrayList.addAll(list);
            int i2 = o4v0Var.d;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (((MixOption) next).f) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
            int intValue = valueOf != null ? valueOf.intValue() : -1;
            o4v0Var.d = intValue;
            o4v0Var.notifyItemChanged(intValue, Boolean.valueOf(z));
            o4v0Var.notifyItemChanged(i2, Boolean.valueOf(z));
        }
    }
}
