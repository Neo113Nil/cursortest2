package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.RequestUserProfile;
import xsna.fss;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bjs implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ RecyclerView.e0 c;
    public final /* synthetic */ Serializer.StreamParcelable d;

    public /* synthetic */ bjs(RecyclerView.e0 e0Var, Serializer.StreamParcelable streamParcelable, int i) {
        this.b = i;
        this.c = e0Var;
        this.d = streamParcelable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((cjs) this.c).n.a(new fss.b.d((RequestUserProfile) this.d));
                break;
            default:
                com.vk.stickers.details.holders.a aVar = (com.vk.stickers.details.holders.a) this.c;
                aVar.l.R((StickerStockItem) this.d);
                break;
        }
    }
}
