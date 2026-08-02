package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.view.tile.b;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MarketProductTilePaginatedImagesView.kt */
/* loaded from: classes18.dex */
public final class nnw extends RecyclerView.Adapter<com.vk.ecomm.design.view.tile.a> {
    public final cnh c;
    public List<tjw> d = EmptyList.b;
    public Integer e;

    public nnw(cnh cnhVar) {
        this.c = cnhVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        Integer num = this.e;
        return num != null ? num.intValue() : this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(com.vk.ecomm.design.view.tile.a aVar, int i) {
        com.vk.ecomm.design.view.tile.a aVar2 = aVar;
        List<tjw> list = this.d;
        tjw tjwVar = list.get(i % list.size());
        Context context = aVar2.itemView.getContext();
        if (context == null) {
            return;
        }
        VkPicture vkPicture = aVar2.m;
        ImageView imageView = aVar2.n;
        Image image = tjwVar.a;
        String str = tjwVar.b;
        Integer num = tjwVar.c;
        boolean z = tjwVar.e;
        b.a aVar3 = new b.a(context, vkPicture, imageView, image, str, num, tjwVar.d);
        if (z) {
            com.vk.ecomm.design.view.tile.b.b(aVar3);
        } else {
            com.vk.ecomm.design.view.tile.b.a(aVar3);
        }
        jjc.g(aVar2.itemView, new qpj(aVar2, 20));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final com.vk.ecomm.design.view.tile.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new com.vk.ecomm.design.view.tile.a(viewGroup, this.c);
    }
}
