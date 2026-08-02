package defpackage;

import android.view.View;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class h9p implements ut31 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.ut31
    public final View b(String str) {
        Object obj = this.a.get(str);
        if (obj != null) {
            return ((zq31) obj).a();
        }
        w511.i(null);
        return null;
    }

    @Override // defpackage.ut31
    public final void d(String str, zq31 zq31Var, int i) {
        this.a.put(str, zq31Var);
    }
}
