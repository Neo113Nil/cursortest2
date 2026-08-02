package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.internal.storage.structure.Table;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: ChannelsPinnedEntryStorageManager.kt */
/* loaded from: classes2.dex */
public final class xhb implements moa0<MsgFromChannel> {
    public final tgl0 c;
    public final e0w d;
    public final /* synthetic */ sgl0 b = new sgl0(Table.CHANNEL_MESSAGES.i(), ChannelMessageColumn.class);
    public final w1b e = new w1b(false);

    public xhb(tgl0 tgl0Var) {
        this.c = tgl0Var;
        this.d = tgl0Var.b();
    }

    @Override // xsna.moa0
    public final void a(int i, long j, boolean z) {
        this.d.execSQL(xqm0.g("\n            UPDATE " + this.b.a + "\n            SET " + ChannelMessageColumn.IS_MSG_PINNED + " = " + (z ? 1 : 0) + "\n            WHERE " + ChannelMessageColumn.CHANNEL_ID + " = " + j + " AND " + ChannelMessageColumn.CNV_MSG_ID + " = " + i + "\n        "));
    }

    @Override // xsna.moa0
    public final Collection<MsgFromChannel> c(long j) {
        Cursor d = this.d.d(xqm0.g("\n            SELECT * FROM " + this.b.a + "\n            WHERE " + ChannelMessageColumn.CHANNEL_ID + " = " + j + "\n            AND " + ChannelMessageColumn.IS_MSG_PINNED + " = 1\n            ORDER BY " + ChannelMessageColumn.CNV_MSG_ID + "\n        "), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(this.e.a(d));
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
}
