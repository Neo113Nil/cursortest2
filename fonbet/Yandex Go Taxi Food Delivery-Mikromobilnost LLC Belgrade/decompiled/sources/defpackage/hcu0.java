package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.core.net.entities.StickerPacksData;

/* loaded from: classes15.dex */
public final class hcu0 extends RecyclerView.Adapter {
    public final xav a;
    public StickerPacksData.StickerData[] b;
    public t26 c;
    public String w;

    public hcu0(xav xavVar) {
        this.a = xavVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        StickerPacksData.StickerData[] stickerDataArr = this.b;
        if (stickerDataArr == null) {
            return 0;
        }
        return stickerDataArr.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        String str = this.w;
        StickerPacksData.StickerData stickerData = this.b[i];
        ((xbu0) x0Var).X(str, stickerData.stickerId, stickerData.text);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        xbu0 xbu0Var = new xbu0(viewGroup.getContext(), viewGroup, this.a);
        xbu0Var.T = this.c;
        return xbu0Var;
    }
}
