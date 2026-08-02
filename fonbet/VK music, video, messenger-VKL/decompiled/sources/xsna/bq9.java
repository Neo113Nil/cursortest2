package xsna;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Lambda;

/* compiled from: CancelWorkRunnable.kt */
/* loaded from: classes.dex */
public final class bq9 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ String $name;
    final /* synthetic */ dwx0 $workManagerImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq9(String str, dwx0 dwx0Var) {
        super(0);
        this.$name = str;
        this.$workManagerImpl = dwx0Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        String str = this.$name;
        dwx0 dwx0Var = this.$workManagerImpl;
        WorkDatabase workDatabase = dwx0Var.c;
        workDatabase.v(new zp9(workDatabase, str, dwx0Var));
        dwx0 dwx0Var2 = this.$workManagerImpl;
        i8h0.b(dwx0Var2.b, dwx0Var2.c, dwx0Var2.e);
        return s3q0.a;
    }
}
