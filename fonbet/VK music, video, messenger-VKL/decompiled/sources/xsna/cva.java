package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.dto.common.Peer;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ChannelChangeDonatLpTask.kt */
/* loaded from: classes2.dex */
public final class cva extends e500 {
    public final w2w c;
    public final long d;
    public List<? extends Msg> e;

    public cva(w2w w2wVar, Peer peer) {
        super("ChannelChangeDonatLpTask");
        this.c = w2wVar;
        this.d = peer.b;
        this.e = EmptyList.b;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        PostDonut postDonut;
        g2b g2bVar = this.c.I0().y().b;
        StringBuilder sb = new StringBuilder("\n            SELECT * FROM ");
        sb.append(g2bVar.b.a);
        sb.append("\n            WHERE ");
        sb.append(ChannelMessageColumn.CHANNEL_ID.getKey());
        sb.append(" = ");
        long j = this.d;
        sb.append(j);
        sb.append("\n        ");
        Cursor d = g2bVar.d.b().d(xqm0.g(sb.toString()), null);
        ArrayList<Msg> arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(g2bVar.f.a(d));
                        d.moveToNext();
                    }
                }
                Trace.endSection();
                for (Msg msg : arrayList) {
                    Map map = (Map) c400Var.j.get(Long.valueOf(j));
                    if ((map != null ? Boolean.valueOf(map.containsKey(Integer.valueOf(msg.d))) : null) == null) {
                        MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
                        if (msgFromChannel != null && (postDonut = msgFromChannel.I.g) != null && postDonut.b) {
                            f400Var.b(msg.d, j);
                        }
                    }
                }
            } finally {
                d.close();
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        for (Msg msg : this.e) {
            z300Var.b(msg.b, this.d);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Collection collection;
        LinkedHashMap linkedHashMap = c400Var.j;
        long j = this.d;
        Map map = (Map) linkedHashMap.get(Long.valueOf(j));
        if (map == null || (collection = map.values()) == null) {
            collection = EmptyList.b;
        }
        if (collection.isEmpty()) {
            return;
        }
        this.e = (List) new v3b(j, collection, false).o(this.c);
    }
}
