package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.messages.Msg;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f2b implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f2b(Map map, SQLiteStatement sQLiteStatement, g2b g2bVar, ArrayList arrayList) {
        this.d = map;
        this.e = sQLiteStatement;
        this.f = g2bVar;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Map map = (Map) this.d;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) this.e;
                g2b g2bVar = (g2b) this.f;
                for (Map.Entry entry : map.entrySet()) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    int intValue = ((Number) entry.getValue()).intValue();
                    sQLiteStatement.bindLong(1, longValue);
                    sQLiteStatement.bindLong(2, intValue);
                    sQLiteStatement.executeUpdateDelete();
                    Cursor d = g2bVar.d.b().d(xqm0.g("\n            SELECT * FROM " + g2bVar.b.a + " \n            WHERE " + ChannelMessageColumn.OWNER_ID + " = " + longValue + " \n            AND " + ChannelMessageColumn.POST_ID + " = " + intValue + "\n        "), null);
                    ArrayList arrayList = new ArrayList(d.getCount());
                    Trace.beginSection(ndp0.f("Cursor.forEach"));
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                arrayList.add(g2bVar.f.a(d));
                                d.moveToNext();
                            }
                        }
                        try {
                            Trace.endSection();
                            Msg msg = (Msg) j5g.a0(arrayList);
                            if (msg != null) {
                                this.c.add(msg);
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } finally {
                    }
                }
                return s3q0.a;
            default:
                return fb50.K((fb50) this.d, this.c, (ArrayList) this.e, (String) this.f);
        }
    }

    public /* synthetic */ f2b(fb50 fb50Var, ArrayList arrayList, ArrayList arrayList2, String str) {
        this.d = fb50Var;
        this.c = arrayList;
        this.e = arrayList2;
        this.f = str;
    }
}
