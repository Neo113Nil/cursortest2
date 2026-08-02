package defpackage;

import android.os.Looper;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class nhs0 extends ar60 {
    public final Looper w = Looper.myLooper();
    public final bvb x = new bvb(this);

    @Override // defpackage.ar60, java.lang.Iterable
    public final Iterator iterator() {
        z83.b("Iterator access from the thread that is different one at constructor", this.w, Looper.myLooper());
        bvb bvbVar = this.x;
        bvbVar.a();
        ar60 ar60Var = (ar60) bvbVar.x;
        ar60Var.b++;
        bvbVar.b = ar60Var.a.size();
        bvbVar.w = false;
        bvbVar.c = 0;
        return bvbVar;
    }
}
