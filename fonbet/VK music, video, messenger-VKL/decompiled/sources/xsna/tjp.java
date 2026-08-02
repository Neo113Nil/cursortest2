package xsna;

import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import xsna.hzg0;
import xsna.usi0;

/* compiled from: EncryptedStorage.kt */
/* loaded from: classes11.dex */
public final class tjp {
    public final hzg0 a;
    public final mxi0 b;

    public tjp(hzg0 hzg0Var, mxi0 mxi0Var) {
        this.a = hzg0Var;
        this.b = mxi0Var;
    }

    public final List<usi0.a> a() {
        try {
            String string = this.a.getString("authorized", null);
            return string == null ? EmptyList.b : usi0.a.C3827a.a(new JSONArray(string));
        } catch (Throwable th) {
            this.b.a(pn00.k(new Pair("action", "prefs_read_all"), new Pair("stacktrace", rte0.w(th))));
            L.i(th);
            return EmptyList.b;
        }
    }

    public final boolean b() {
        try {
            return this.a.b().getBoolean("migration_was_completed", false);
        } catch (Throwable th) {
            this.b.a(pn00.k(new Pair("action", "prefs_get_migration"), new Pair("stacktrace", rte0.w(th))));
            L.i(th);
            return false;
        }
    }

    public final void c(usi0.a aVar) {
        ArrayList arrayList = new ArrayList(a());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(((usi0.a) it.next()).c().b(), aVar.c().b())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
        }
        d(arrayList);
    }

    public final void d(ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((usi0.a) it.next()).d());
            }
            String jSONArray2 = jSONArray.toString();
            hzg0.b bVar = (hzg0.b) this.a.edit();
            bVar.putString("authorized", jSONArray2);
            bVar.commit();
        } catch (Throwable th) {
            this.b.a(pn00.k(new Pair("action", "prefs_replace_all"), new Pair("stacktrace", rte0.w(th))));
            L.i(th);
        }
    }

    public final void e() {
        try {
            this.a.b().edit().putBoolean("migration_was_completed", true).apply();
        } catch (Throwable th) {
            this.b.a(pn00.k(new Pair("action", "prefs_set_migration"), new Pair("value", String.valueOf(true)), new Pair("stacktrace", rte0.w(th))));
            L.i(th);
        }
    }
}
