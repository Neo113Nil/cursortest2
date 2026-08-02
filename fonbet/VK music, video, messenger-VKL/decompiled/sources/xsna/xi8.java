package xsna;

import com.vk.dto.group.Group;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.nj8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi8 implements zzs {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList] */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r14;
        Group group;
        BroadcastAuthor broadcastAuthor = (BroadcastAuthor) obj;
        BroadcastStream broadcastStream = (BroadcastStream) obj2;
        List list = (List) obj3;
        Map map = (Map) obj4;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            arrayList.add(new nj8.d(R.string.live_broadcast_settings_header_author_title, Integer.valueOf(R.string.live_broadcast_settings_header_author_subtitle)));
            List<BroadcastAuthor> list2 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (BroadcastAuthor broadcastAuthor2 : list2) {
                boolean f = epx.f(broadcastAuthor2, broadcastAuthor);
                BroadcastAuthor.Group group2 = broadcastAuthor2 instanceof BroadcastAuthor.Group ? (BroadcastAuthor.Group) broadcastAuthor2 : null;
                boolean z = false;
                if (group2 != null && (group = group2.b) != null && group.l) {
                    z = true;
                }
                arrayList2.add(new nj8.a(broadcastAuthor2, f, z));
            }
            arrayList.add(new nj8.b(arrayList2));
            arrayList.add(nj8.c.b);
        }
        arrayList.add(new nj8.d(R.string.live_broadcast_settings_header_stream_title, null));
        List list3 = (List) map.get(broadcastAuthor);
        if (list3 != null) {
            List<BroadcastStream> list4 = list3;
            r14 = new ArrayList(c5g.u(list4, 10));
            for (BroadcastStream broadcastStream2 : list4) {
                r14.add(new nj8.e(broadcastAuthor, broadcastStream2, epx.f(broadcastStream2, broadcastStream)));
            }
        } else {
            r14 = EmptyList.b;
        }
        arrayList.addAll((Collection) r14);
        return arrayList;
    }
}
