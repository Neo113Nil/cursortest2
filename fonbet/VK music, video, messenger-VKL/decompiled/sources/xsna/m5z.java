package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.l5z;

/* compiled from: LifecycleRetainedValuesStoreOwner.android.kt */
/* loaded from: classes11.dex */
public final class m5z extends Lambda implements gzs<s3q0> {
    final /* synthetic */ l5z.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5z(l5z.b bVar) {
        super(0);
        this.this$0 = bVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        aj00 aj00Var = (aj00) this.this$0.a.b;
        if (!aj00Var.c) {
            if (aj00Var.d) {
                hxc0.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
            }
            aj00Var.a();
            aj00Var.d = true;
        }
        return s3q0.a;
    }
}
