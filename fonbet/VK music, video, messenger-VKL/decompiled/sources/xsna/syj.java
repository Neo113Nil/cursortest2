package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* compiled from: CountriesAdapter.kt */
/* loaded from: classes15.dex */
public final class syj extends RecyclerView.Adapter<nvx<?>> {
    public final dg c;
    public List<? extends gtx> d;
    public String e;
    public final ArrayList f;

    /* compiled from: CountriesAdapter.kt */
    public static final class a extends nvx<wyj> {
        public final izs<Country, s3q0> l;
        public final TextView m;
        public final TextView n;
        public final AppCompatImageView o;

        public a(ViewGroup viewGroup, dg dgVar) {
            super(tf3.b(viewGroup, R.layout.vk_auth_country_with_code_item, viewGroup, false));
            this.l = dgVar;
            this.m = (TextView) this.itemView.findViewById(R.id.name);
            this.n = (TextView) this.itemView.findViewById(R.id.code);
            this.o = (AppCompatImageView) this.itemView.findViewById(R.id.country_selected);
        }

        @Override // xsna.nvx
        public final void V5(wyj wyjVar) {
            wyj wyjVar2 = wyjVar;
            jjc.g(this.itemView, new cq3(7, this, wyjVar2));
            Country country = wyjVar2.a;
            String str = country.e;
            String str2 = country.c;
            this.m.setText(str);
            String concat = "+".concat(str2);
            TextView textView = this.n;
            textView.setText(concat);
            textView.setVisibility(0);
            this.o.setVisibility(8);
        }
    }

    /* compiled from: CountriesAdapter.kt */
    public static final class b extends nvx<dgp> {
        @Override // xsna.nvx
        public final /* bridge */ /* synthetic */ void V5(dgp dgpVar) {
        }
    }

    /* compiled from: CountriesAdapter.kt */
    public static final class c extends nvx<j2z> {
        @Override // xsna.nvx
        public final void V5(j2z j2zVar) {
            ((TextView) this.itemView).setText(Character.toString(j2zVar.a));
        }
    }

    public syj(dg dgVar) {
        this.c = dgVar;
        EmptyList emptyList = EmptyList.b;
        this.d = emptyList;
        this.f = new ArrayList(emptyList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = Collections.singletonList(dgp.a);
        }
        return arrayList2.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = Collections.singletonList(dgp.a);
        }
        gtx gtxVar = (gtx) arrayList2.get(i);
        if (gtxVar instanceof j2z) {
            return 0;
        }
        if (gtxVar instanceof wyj) {
            return 1;
        }
        if (gtxVar instanceof dgp) {
            return 2;
        }
        throw new IllegalStateException("Unknown item of class ".concat(arrayList2.get(i).getClass().getSimpleName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(nvx<?> nvxVar, int i) {
        nvx<?> nvxVar2 = nvxVar;
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = Collections.singletonList(dgp.a);
        }
        nvxVar2.V5((gtx) arrayList2.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final nvx<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new c(tf3.b(viewGroup, R.layout.vk_auth_country_first_letter_item, viewGroup, false));
        }
        if (i == 1) {
            return new a(viewGroup, this.c);
        }
        if (i == 2) {
            return new b(tf3.b(viewGroup, R.layout.vk_auth_country_empty_list_item, viewGroup, false));
        }
        throw new IllegalStateException(lhg.a(i, "Unknown viewType = "));
    }

    public final void x0(String str) {
        ArrayList arrayList;
        this.e = str;
        ArrayList arrayList2 = this.f;
        if (str == null || drm0.N(str)) {
            arrayList2.clear();
            arrayList2.addAll(this.d);
            notifyDataSetChanged();
            return;
        }
        arrayList2.clear();
        Character ch = null;
        if (new Regex("^[+0-9]*$").a(str)) {
            List<gtx> D0 = j5g.D0(new tyj(0), rli0.A(rli0.j(rli0.k(new i5g(this.d), wyj.class), new rqd(str, 3))));
            arrayList = new ArrayList();
            for (gtx gtxVar : D0) {
                if (gtxVar instanceof wyj) {
                    char charAt = ((wyj) gtxVar).a.e.charAt(0);
                    if (ch == null || charAt != ch.charValue()) {
                        ch = Character.valueOf(charAt);
                        arrayList.add(new j2z(charAt));
                    }
                    arrayList.add(gtxVar);
                }
            }
        } else {
            List<? extends gtx> list = this.d;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                gtx gtxVar2 = (gtx) obj;
                wyj wyjVar = gtxVar2 instanceof wyj ? (wyj) gtxVar2 : null;
                if (wyjVar != null ? drm0.D(wyjVar.a.e, str, true) : false) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                gtx gtxVar3 = (gtx) it.next();
                if (gtxVar3 instanceof wyj) {
                    char charAt2 = ((wyj) gtxVar3).a.e.charAt(0);
                    if (ch == null || charAt2 != ch.charValue()) {
                        ch = Character.valueOf(charAt2);
                        arrayList.add(new j2z(charAt2));
                    }
                    arrayList.add(gtxVar3);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
        }
        notifyDataSetChanged();
    }
}
