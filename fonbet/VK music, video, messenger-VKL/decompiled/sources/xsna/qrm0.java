package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: LoadingStubHolder.kt */
/* loaded from: classes6.dex */
public final class qrm0 extends RecyclerView.Adapter<a> {
    public final ArrayList c = new ArrayList();

    /* compiled from: LoadingStubHolder.kt */
    public static final class a extends v96<s3q0> {
        @Override // xsna.v96
        public final /* bridge */ /* synthetic */ void W5(s3q0 s3q0Var) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        this.c.get(i);
        aVar.V5(s3q0.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        a aVar = new a(R.layout.vk_item_apps_catalog_loading_stub_item, viewGroup);
        ((ImageView) aVar.itemView.findViewById(R.id.stub_icon)).setImageDrawable(new enk0(krv0.m(R.attr.vk_ui_background_secondary, aVar.itemView.getContext())));
        return aVar;
    }
}
