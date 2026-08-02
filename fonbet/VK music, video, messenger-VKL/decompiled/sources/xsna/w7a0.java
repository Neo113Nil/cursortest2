package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: PhotoFlowGridSkeletonView.kt */
/* loaded from: classes4.dex */
public final class w7a0 extends zoj0<Object, vif0<Object>> {
    public final /* synthetic */ Context e;

    public w7a0(Context context) {
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new v7a0(R.layout.photo_flow_item_skeleton, this.e);
    }
}
