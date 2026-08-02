package xsna;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import xsna.lvf0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class p201 implements nzz0 {
    public final /* synthetic */ w201 a;

    public p201(w201 w201Var) {
        this.a = w201Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[LOOP:0: B:8:0x002f->B:10:0x0035, LOOP_END] */
    @Override // xsna.nzz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, long j, int i, @Nullable Object obj, long j2, long j3) {
        int i2;
        Iterator it;
        w201 w201Var = this.a;
        try {
            i2 = i;
            try {
                w201Var.setResult(new z201(new Status(i2)));
            } catch (IllegalStateException e) {
                e = e;
                o100 o100Var = lvf0.l;
                Log.e(o100Var.a, o100Var.c("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = w201Var.c.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e2) {
            e = e2;
            i2 = i;
        }
        it = w201Var.c.i.iterator();
        while (it.hasNext()) {
            ((lvf0.a) it.next()).f(str, j, i2, j2, j3);
            i2 = i;
        }
    }

    @Override // xsna.nzz0
    public final void b(long j, long j2, long j3, String str) {
        w201 w201Var = this.a;
        try {
            w201Var.setResult(new q201(w201Var, new Status(2103)));
        } catch (IllegalStateException e) {
            o100 o100Var = lvf0.l;
            Log.e(o100Var.a, o100Var.c("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = w201Var.c.i.iterator();
        while (it.hasNext()) {
            ((lvf0.a) it.next()).f(str, j, 2103, j2, j3);
        }
    }
}
