package xsna;

import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.DzenArticleBlockItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.external.miniapp.net.app.WebLegalInfo;
import xsna.crg;
import xsna.i7m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class brg implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ brg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.b) {
            case 0:
                ((crg) this.c).c.invoke(((crg.a) this.d).m);
                break;
            case 1:
                DzenArticleBlockItem dzenArticleBlockItem = (DzenArticleBlockItem) this.c;
                kro kroVar = (kro) this.d;
                if (dzenArticleBlockItem != null && (str = dzenArticleBlockItem.b) != null) {
                    kroVar.n.invoke(str, Integer.valueOf(kroVar.getLayoutPosition()));
                    break;
                }
                break;
            case 2:
                g2v.c().b().L(((qis) this.c).itemView.getContext(), "", "friend_request", ((UserId) this.d).b);
                break;
            case 3:
                i7m0.a aVar = (i7m0.a) this.c;
                i7m0 i7m0Var = (i7m0) this.d;
                Playlist playlist = (Playlist) aVar.l;
                if (playlist != null) {
                    i7m0Var.e.a(playlist);
                    break;
                }
                break;
            default:
                new r3(((VkCell) this.c).getContext()).a((WebLegalInfo) this.d);
                break;
        }
    }
}
