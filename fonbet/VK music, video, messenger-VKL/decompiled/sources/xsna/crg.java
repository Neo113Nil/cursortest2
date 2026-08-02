package xsna;

import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.MetroStation;
import java.util.ArrayList;
import xsna.uqg;

/* compiled from: CommunityAddressesAdapter.kt */
/* loaded from: classes5.dex */
public final class crg extends RecyclerView.Adapter<a> implements vic {
    public final frg c;
    public final ArrayList<Address> d = new ArrayList<>();
    public Location e;

    /* compiled from: CommunityAddressesAdapter.kt */
    public final class a extends vif0<Address> {
        public final uqg n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0);
            uqg uqgVar = new uqg(viewGroup.getContext());
            uqgVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            uqg uqgVar2 = (uqg) this.itemView;
            this.n = uqgVar2;
            uqgVar2.setOnClickListener(new brg(0, crg.this, this));
        }

        @Override // xsna.vif0
        public final void i6(Address address) {
            Integer j;
            Address address2 = address;
            ucp ucpVar = ucp.a;
            CharSequence i = ucp.i(address2.e);
            uqg uqgVar = this.n;
            uqgVar.setTitle(i);
            uqgVar.setAddress(nt0.d(address2));
            Location location = crg.this.e;
            uqg.a aVar = null;
            uqgVar.setDistance((location == null || (j = sv1.j(location, address2)) == null) ? null : k7b0.e(j.intValue(), uqgVar.getContext()));
            MetroStation metroStation = address2.p;
            if (metroStation != null) {
                int i2 = metroStation.d;
                String str = metroStation.c;
                if (str == null) {
                    str = "";
                }
                aVar = new uqg.a(i2, str);
            }
            uqgVar.setMetroStation(aVar);
            uqgVar.setWorkStatus(sv1.q(address2, uqgVar.getContext()));
        }
    }

    public crg(frg frgVar) {
        this.c = frgVar;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.d.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        aVar.V5(this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }

    public final void x0(RecyclerView recyclerView, bo3 bo3Var) {
        a aVar = new a(recyclerView);
        int i = iah0.f().heightPixels;
        if (i > 0) {
            ArrayList<Address> arrayList = this.d;
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                aVar.V5(arrayList.get(i4));
                aVar.itemView.measure(View.MeasureSpec.makeMeasureSpec(iah0.f().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i2 += aVar.itemView.getMeasuredHeight();
                if (i4 == 0) {
                    i3 = aVar.itemView.getMeasuredHeight();
                }
                if (i2 >= i) {
                    break;
                }
            }
            bo3Var.invoke(Integer.valueOf(i3), Integer.valueOf(i2));
        }
    }
}
