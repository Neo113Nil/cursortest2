package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ChannelMessagesAttachesDownloadStorage.kt */
/* loaded from: classes2.dex */
public final class c2b implements l64 {
    public final w2w b;
    public final p3b c;
    public final p3b d;
    public final bzp e;

    public c2b(w2w w2wVar) {
        this.b = w2wVar;
        this.c = w2wVar.I0().y();
        this.d = w2wVar.I0().e();
        this.e = w2wVar.S0();
    }

    public static LinkedHashMap a(p3b p3bVar, AttachWithDownload attachWithDownload) {
        List<Msg> V = p3bVar.V(Collections.singletonList(Integer.valueOf(attachWithDownload.xb())));
        ArrayList arrayList = new ArrayList();
        for (Object obj : V) {
            if (obj instanceof MsgFromChannel) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MsgFromChannel) it.next()).L2(attachWithDownload);
        }
        p3bVar.a(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Long valueOf = Long.valueOf(((MsgFromChannel) next).c);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((MsgFromChannel) it3.next()).b));
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    @Override // xsna.l64
    public final Attach b(int i) {
        Attach b = this.c.b(i);
        return b == null ? this.d.b(i) : b;
    }

    @Override // xsna.l64
    public final void c(AttachWithDownload attachWithDownload, DownloadState downloadState, File file) {
        attachWithDownload.A6(downloadState);
        attachWithDownload.a3(file);
        this.b.I0().u(new com.vk.libvideo.design.view.video.a(6, this, attachWithDownload));
    }
}
