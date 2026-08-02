package xsna;

import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class rxx0 implements Callable<Boolean> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ayx0 c;

    public rxx0(ayx0 ayx0Var, dmg0 dmg0Var) {
        this.c = ayx0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Boolean call() throws Exception {
        Boolean bool;
        Cursor h = u370.h(this.c.a, this.b, false);
        try {
            if (h.moveToFirst()) {
                bool = Boolean.valueOf(h.getInt(0) != 0);
            } else {
                bool = Boolean.FALSE;
            }
            h.close();
            return bool;
        } catch (Throwable th) {
            h.close();
            throw th;
        }
    }

    public final void finalize() {
        this.b.n();
    }
}
