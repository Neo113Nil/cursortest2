package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.enterphone.choosecountry.Country;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.c0v0;

/* compiled from: IdentityCountryAdapter.kt */
/* loaded from: classes6.dex */
public final class evv extends RecyclerView.Adapter<RecyclerView.e0> {
    public final c0v0.a c;
    public final ArrayList d;
    public Integer e;

    /* compiled from: IdentityCountryAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public a(j2c j2cVar) {
            super(j2cVar);
            jjc.g(j2cVar, new v74(18, evv.this, this));
        }
    }

    public evv(Context context, c0v0.a aVar) {
        this.c = aVar;
        LinkedHashMap linkedHashMap = uyj.a;
        bpn0 bpn0Var = t65.a;
        ArrayList arrayList = new ArrayList(uyj.a(context, ply.a()));
        arrayList.add(0, uyj.b(context, arrayList));
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((Country) next).e)) {
                arrayList2.add(next);
            }
        }
        this.d = arrayList2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = (a) e0Var;
        Country country = (Country) this.d.get(i);
        j2c j2cVar = (j2c) aVar.itemView;
        String str = country.e;
        evv evvVar = evv.this;
        int i2 = country.b;
        Integer num = evvVar.e;
        Boolean valueOf = Boolean.valueOf(num != null && num.intValue() == i2);
        j2cVar.setText(str);
        j2cVar.setChecked(valueOf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(new j2c(viewGroup.getContext()));
    }
}
