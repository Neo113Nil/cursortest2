package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.apps.BuildInfo;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import xsna.c2r0;

/* compiled from: CompanionUserStorage.kt */
/* loaded from: classes.dex */
public final class s6i implements Closeable {
    public final Context b;
    public final bpn0 c = new bpn0(new s0f(this, 2));
    public final bpn0 d = new bpn0(new an(this, 3));

    public s6i(Context context) {
        this.b = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bpn0 bpn0Var = this.d;
        if (bpn0Var.isInitialized()) {
            ((ewz) bpn0Var.getValue()).close();
        }
    }

    public final List<Long> m() {
        String string = ((SharedPreferences) this.c.getValue()).getString("authorized_users", "[]");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ArrayList L = f370.L(new JSONArray(string));
        if (!BuildInfo.t()) {
            return L;
        }
        List<c2r0.b> h = ((ewz) this.d.getValue()).h(this.b, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = h.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Long.valueOf(((c2r0.b) it.next()).d().b));
        }
        linkedHashSet.addAll(L);
        return j5g.O0(linkedHashSet);
    }

    public final void n(Iterable<Long> iterable) {
        if (!(iterable instanceof Set)) {
            iterable = j5g.R(iterable);
        }
        ((SharedPreferences) this.c.getValue()).edit().putString("authorized_users", kvf.a((Collection) iterable).toString()).apply();
        j6i.a().c();
    }
}
