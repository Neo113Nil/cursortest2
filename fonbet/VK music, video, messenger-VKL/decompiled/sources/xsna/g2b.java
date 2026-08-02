package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageAttachesColumn;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ChannelMessagesDb.kt */
/* loaded from: classes2.dex */
public final class g2b implements moa0<MsgFromChannel> {
    public final /* synthetic */ sgl0 b;
    public final /* synthetic */ moa0<MsgFromChannel> c;
    public final tgl0 d;
    public final com.vk.im.engine.internal.storage.delegates.channel_messages.b e;
    public final w1b f;

    public g2b(tgl0 tgl0Var, boolean z) {
        String str = z ? "channel_postponed_messages" : "channel_messages";
        sgl0 sgl0Var = new sgl0(str, ChannelMessageColumn.class);
        moa0<MsgFromChannel> sdyVar = z ? new sdy() : new xhb(tgl0Var);
        this.b = sgl0Var;
        this.c = sdyVar;
        this.d = tgl0Var;
        this.e = new com.vk.im.engine.internal.storage.delegates.channel_messages.b(tgl0Var.b(), str);
        this.f = new w1b(z);
    }

    @Override // xsna.moa0
    public final void a(int i, long j, boolean z) {
        this.c.a(i, j, z);
    }

    public final List<Msg> b(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        Cursor d = this.d.b().d("\n            SELECT *\n            FROM " + this.b.a + "\n            WHERE " + ChannelMessageColumn.LOCAL_ID.getKey() + " IN(" + xqm0.g("\n            SELECT " + ChannelMessageAttachesColumn.MSG_LOCAL_ID.getKey() + " \n            FROM channel_message_attaches \n            WHERE " + ChannelMessageAttachesColumn.ATTACH_LOCAL_ID.getKey() + " IN (" + p4g.k(collection, StringUtils.COMMA, null) + ")\n            \n        ") + ")\n            ", null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(this.f.a(d));
                        d.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.moa0
    public final Collection<MsgFromChannel> c(long j) {
        return this.c.c(j);
    }

    public final Attach d(int i) {
        Object obj = null;
        Cursor d = this.d.b().d(xqm0.g("\n                SELECT *\n                FROM " + this.b.a + "\n                WHERE " + ChannelMessageColumn.LOCAL_ID.getKey() + " IN(" + xqm0.g("\n            SELECT " + ChannelMessageAttachesColumn.MSG_LOCAL_ID.getKey() + "\n            FROM channel_message_attaches\n            WHERE " + ChannelMessageAttachesColumn.ATTACH_LOCAL_ID.getKey() + " = " + i + "\n        ") + ")\n            "), null);
        try {
            MsgFromChannel a = d.moveToFirst() ? this.f.a(d) : null;
            if (a == null) {
                return null;
            }
            Iterator it = a.Zb().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Attach) next).xb() == i) {
                    obj = next;
                    break;
                }
            }
            return (Attach) obj;
        } finally {
            d.close();
        }
    }

    public final Msg e(int i) {
        Cursor d = this.d.b().d("SELECT * FROM " + this.b.a + " WHERE " + ChannelMessageColumn.LOCAL_ID.getKey() + " = ?", new String[]{String.valueOf(i)});
        try {
            return d.moveToFirst() ? this.f.a(d) : null;
        } finally {
            d.close();
        }
    }
}
