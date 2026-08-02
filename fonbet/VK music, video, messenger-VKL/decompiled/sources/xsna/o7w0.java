package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: VmojiCharacterLoadingHolders.kt */
/* loaded from: classes7.dex */
public final class o7w0 extends c7w0<u9w0> {
    public final RecyclerView l;
    public final a m;

    /* compiled from: VmojiCharacterLoadingHolders.kt */
    public static final class a extends sxm {
    }

    public o7w0(ViewGroup viewGroup) {
        super(R.layout.vmoji_character_paid_elements_loading_item, viewGroup);
        this.l = (RecyclerView) this.itemView.findViewById(R.id.list);
        a aVar = new a();
        aVar.x0(n9w0.class, new n7w0(0));
        this.m = aVar;
    }

    @Override // xsna.c7w0, xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(hfz hfzVar) {
        i6();
    }

    @Override // xsna.c7w0
    /* renamed from: h6 */
    public final /* bridge */ /* synthetic */ void W5(u9w0 u9w0Var) {
        i6();
    }

    public final void i6() {
        this.itemView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        RecyclerView recyclerView = this.l;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.m);
        recyclerView.post(new kv2(this, 17));
    }
}
