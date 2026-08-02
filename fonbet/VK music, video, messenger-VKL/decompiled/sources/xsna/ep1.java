package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.photos.root.albums.presentation.a;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.dum0;
import xsna.f0s;
import xsna.ylm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ep1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ep1(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                cVar.r(!r3.b);
                cVar.q(cVar.k() + cVar.i());
                ((hp1) this.e).e.invoke(new a.h(((AlbumsRepository.a) obj).a, this.c));
                return s3q0.a;
            default:
                pdm pdmVar = (pdm) this.d;
                Collection collection = (Collection) this.e;
                Set S0 = j5g.S0(pdmVar.k().a());
                Set S02 = j5g.S0(collection);
                Set g = izi0.g(S02, S0);
                Set g2 = izi0.g(S0, S02);
                dum0 k = pdmVar.k();
                Set set = g2;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gum0) it.next()).a);
                }
                k.getClass();
                String g0 = j5g.g0(arrayList, null, "(", ")", 0, new k990(21), 25);
                k.b.b().execSQL("DELETE FROM " + k.a.a + " WHERE " + dum0.a.TYPE + " in " + g0);
                dum0 k2 = pdmVar.k();
                Set<gum0> set2 = g;
                k2.getClass();
                if (!set2.isEmpty()) {
                    k2.b.b().h(new h9i0(2, k2, set2));
                }
                for (gum0 gum0Var : set2) {
                    hpm e = pdmVar.b.I0().b().e();
                    fum0 fum0Var = gum0Var.d;
                    String str = gum0Var.a;
                    Cursor d = e.b.b().d("SELECT id\nFROM dialogs\nWHERE flags != 0\n  AND flags & ? = ?;", new Integer[]{Integer.valueOf(fum0Var.a), Integer.valueOf(fum0Var.b)});
                    ArrayList arrayList2 = new ArrayList(d.getCount());
                    Trace.beginSection(ndp0.f("Cursor.forEach"));
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                arrayList2.add(Long.valueOf(d.getLong(0)));
                                d.moveToNext();
                            }
                        }
                        try {
                            Trace.endSection();
                            ylm g3 = pdmVar.g();
                            g3.getClass();
                            if (!arrayList2.isEmpty()) {
                                String g02 = j5g.g0(arrayList2, null, null, null, 0, new rf5(str, 2), 31);
                                g3.b.b().execSQL("INSERT OR IGNORE INTO " + g3.a.a + " (" + ylm.a.SUBLIST_TYPE + ", " + ylm.a.DIALOG_ID + ") VALUES " + g02);
                            }
                            if (this.c) {
                                f0s l = pdmVar.l();
                                d = l.b.b().d(l.a.a(f0s.a.SUBLIST_TYPE, str), null);
                                ArrayList arrayList3 = new ArrayList(d.getCount());
                                Trace.beginSection(ndp0.f("Cursor.forEach"));
                                try {
                                    if (d.moveToFirst()) {
                                        while (!d.isAfterLast()) {
                                            arrayList3.add(Integer.valueOf(d.getInt(0)));
                                            d.moveToNext();
                                        }
                                    }
                                    try {
                                        Trace.endSection();
                                        Iterator it2 = arrayList3.iterator();
                                        while (it2.hasNext()) {
                                            pdmVar.o(((Number) it2.next()).intValue(), arrayList2);
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                ylm g4 = pdmVar.g();
                Set set3 = g2;
                ArrayList arrayList4 = new ArrayList(c5g.u(set3, 10));
                Iterator it3 = set3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((gum0) it3.next()).a);
                }
                g4.getClass();
                if (!arrayList4.isEmpty()) {
                    g4.b.b().f(g4.a.a, ylm.a.SUBLIST_TYPE.getKey() + " in " + j5g.g0(arrayList4, null, "(", ")", 0, new g8(19), 25), new Object[0]);
                }
                return s3q0.a;
        }
    }
}
