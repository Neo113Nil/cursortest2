package xsna;

import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ar40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ ar40(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder("VkMusicMigration Start playlist migration for playlists: ");
                List list = this.c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Playlist) it.next()).h);
                }
                sb.append(j5g.g0(arrayList, null, null, null, 0, null, 63));
                return sb.toString();
            default:
                return ((vcy) this.c.get(0)).k();
        }
    }
}
