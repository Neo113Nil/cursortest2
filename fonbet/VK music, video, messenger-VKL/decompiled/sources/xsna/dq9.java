package xsna;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;

/* compiled from: CancelWorkRunnable.kt */
/* loaded from: classes12.dex */
public final class dq9 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ String $tag = "com.vk.android.push_fallback_task";
    final /* synthetic */ dwx0 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq9(dwx0 dwx0Var) {
        super(0);
        this.$workManagerImpl = dwx0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        final dwx0 dwx0Var = this.$workManagerImpl;
        final WorkDatabase workDatabase = dwx0Var.c;
        final String str = this.$tag;
        workDatabase.v(new Runnable() { // from class: xsna.cq9
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = WorkDatabase.this.D().o(str).iterator();
                while (it.hasNext()) {
                    eq9.a((String) it.next(), dwx0Var);
                }
            }
        });
        dwx0 dwx0Var2 = this.$workManagerImpl;
        i8h0.b(dwx0Var2.b, dwx0Var2.c, dwx0Var2.e);
        return s3q0.a;
    }
}
