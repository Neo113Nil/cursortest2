package xsna;

import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.OneVideoPlayer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class p9s implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p9s(List list, boolean z, u5f u5fVar) {
        this.d = list;
        this.c = z;
        this.e = u5fVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                one.video.player.j jVar = (one.video.player.j) this.d;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.e;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().y(oneVideoPlayer, this.c);
                }
                return s3q0.a;
            default:
                List list = (List) this.d;
                u5f u5fVar = (u5f) this.e;
                StringBuilder sb = new StringBuilder("Save ");
                sb.append(list.size());
                sb.append(" items; count valid=");
                sb.append(this.c);
                sb.append("; packsCount=");
                sb.append(((kbl0) u5fVar.e).d());
                sb.append("; activated=");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((StickerStockItem) obj).k) {
                        arrayList.add(obj);
                    }
                }
                List<StickerStockItem> D0 = j5g.D0(new cni0(), arrayList);
                ArrayList arrayList2 = new ArrayList(c5g.u(D0, 10));
                for (StickerStockItem stickerStockItem : D0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(stickerStockItem.b);
                    sb2.append(':');
                    sb2.append(stickerStockItem.z);
                    arrayList2.add(sb2.toString());
                }
                sb.append(arrayList2);
                return sb.toString();
        }
    }

    public /* synthetic */ p9s(one.video.player.j jVar, OneVideoPlayer oneVideoPlayer, boolean z) {
        this.d = jVar;
        this.e = oneVideoPlayer;
        this.c = z;
    }
}
