package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: BroadcastSettingsInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class ui8 {
    public static ArrayList a(BroadcastAuthor broadcastAuthor, LinkedHashMap linkedHashMap) {
        ArrayList o = e43.o(BroadcastStream.New.b);
        List list = (List) linkedHashMap.get(kd8.a(broadcastAuthor));
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new BroadcastStream.Upcoming((VideoFile) it.next()));
            }
            o.addAll(arrayList);
        }
        return o;
    }
}
