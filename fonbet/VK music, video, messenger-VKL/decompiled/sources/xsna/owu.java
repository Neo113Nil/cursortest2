package xsna;

import android.database.sqlite.SQLiteDatabase;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import ru.rustore.sdk.metrics.internal.F;
import ru.rustore.sdk.metrics.internal.G;
import xsna.r3y0;

/* compiled from: HeaderDisplayItemsFactory.kt */
/* loaded from: classes.dex */
public final class owu {
    public final Object a;

    public owu(slv slvVar, g620 g620Var, a75 a75Var, r3y0.a aVar) {
        this.a = slvVar;
    }

    public void a(ArrayList arrayList) {
        slv slvVar = (slv) this.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            crk crkVar = (crk) it.next();
            arrayList2.add(new swx(crkVar.a, odz0.a(crkVar.b).getBytes(emb.b)));
        }
        bpn0 bpn0Var = slvVar.b;
        String g0 = j5g.g0(arrayList2, null, null, null, 0, G.i, 31);
        String g = xqm0.g("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + g0 + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) bpn0Var.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) bpn0Var.getValue()).execSQL(g);
            ((SQLiteDatabase) bpn0Var.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) bpn0Var.getValue()).endTransaction();
            new F(g0);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public u1c0 b(NewsEntry newsEntry, NewsEntry newsEntry2, s1c0 s1c0Var) {
        wsx0 wsx0Var = newsEntry instanceof wsx0 ? (wsx0) newsEntry : null;
        if (wsx0Var == null || !di60.o(wsx0Var)) {
            u1c0 u1c0Var = new u1c0(newsEntry, newsEntry2, 302);
            u1c0Var.h = (ol60) j5g.a0(new q5w().a(0, new Triple(newsEntry, newsEntry2, s1c0Var)));
            return u1c0Var;
        }
        ol60 ol60Var = (ol60) j5g.Y(((i1c0) this.a.getValue()).a(0, new Triple(newsEntry, newsEntry2, s1c0Var)));
        u1c0 u1c0Var2 = new u1c0(newsEntry, newsEntry2, ol60Var.g());
        u1c0Var2.h = ol60Var;
        return u1c0Var2;
    }

    public owu() {
        this.a = msy.a(LazyThreadSafetyMode.NONE, new xh6(3));
    }
}
