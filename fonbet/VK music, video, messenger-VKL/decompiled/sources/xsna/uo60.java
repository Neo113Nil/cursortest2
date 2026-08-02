package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.nlc;
import xsna.oyg0;
import xsna.xn60;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uo60 implements z960, oyg0.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uo60(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.oyg0.a
    public Object apply(Object obj) {
        oyg0 oyg0Var = (oyg0) this.b;
        HashMap hashMap = (HashMap) this.c;
        nlc.a aVar = (nlc.a) this.d;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i = cursor.getInt(1);
            LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
            if (i != reason.getNumber()) {
                LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                if (i != reason2.getNumber()) {
                    reason2 = LogEventDropped.Reason.CACHE_FULL;
                    if (i != reason2.getNumber()) {
                        reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                        if (i != reason2.getNumber()) {
                            reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            if (i != reason2.getNumber()) {
                                reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                if (i != reason2.getNumber()) {
                                    reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                    if (i != reason2.getNumber()) {
                                        b200.a(Integer.valueOf(i), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                                    }
                                }
                            }
                        }
                    }
                }
                reason = reason2;
            }
            long j = cursor.getLong(2);
            if (!hashMap.containsKey(string)) {
                hashMap.put(string, new ArrayList());
            }
            ((List) hashMap.get(string)).add(new LogEventDropped(j, reason));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int i2 = t000.c;
            new ArrayList();
            aVar.b.add(new t000((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        final long C = oyg0Var.c.C();
        SQLiteDatabase p = oyg0Var.p();
        p.beginTransaction();
        try {
            svo0 svo0Var = (svo0) oyg0.v(p.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new oyg0.a() { // from class: xsna.nyg0
                @Override // xsna.oyg0.a
                public final Object apply(Object obj2) {
                    Cursor cursor2 = (Cursor) obj2;
                    cursor2.moveToNext();
                    return new svo0(cursor2.getLong(0), C);
                }
            });
            p.setTransactionSuccessful();
            p.endTransaction();
            aVar.a = svo0Var;
            aVar.c = new l1u(new ghl0(oyg0Var.p().compileStatement("PRAGMA page_size").simpleQueryForLong() * oyg0Var.p().compileStatement("PRAGMA page_count").simpleQueryForLong(), o0q.a.b));
            aVar.d = oyg0Var.f.get();
            return new nlc(aVar.a, Collections.unmodifiableList(aVar.b), aVar.c, aVar.d);
        } catch (Throwable th) {
            p.endTransaction();
            throw th;
        }
    }

    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        wo60 wo60Var = (wo60) this.b;
        NewsEntry newsEntry = (NewsEntry) this.c;
        yo60.e.C4117e c4117e = (yo60.e.C4117e) this.d;
        wo60Var.a.a(new xn60.a(new NewsfeedExternalAction.d.a(newsEntry, c4117e.c, i, c4117e.d)));
        wo60Var.g = null;
    }
}
