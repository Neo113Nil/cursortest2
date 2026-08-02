package defpackage;

import android.view.View;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class dyf0 implements vt31 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    @Override // defpackage.vt31
    public final void a(int i, String str) {
    }

    @Override // defpackage.vt31
    public final View b(String str) {
        Object obj = this.a.get(str);
        if (obj != null) {
            return ((ar31) obj).a();
        }
        w511.i(null);
        return null;
    }

    @Override // defpackage.vt31
    public final void c(String str, ar31 ar31Var, int i) {
        this.a.put(str, ar31Var);
    }
}
