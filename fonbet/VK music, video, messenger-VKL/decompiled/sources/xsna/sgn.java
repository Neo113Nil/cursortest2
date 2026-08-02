package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes11.dex */
public final class sgn extends Lambda implements gzs<s3q0> {
    final /* synthetic */ v1h0 $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgn(boolean z, v1h0 v1h0Var, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = v1h0Var;
        this.$key = str;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (this.$registered) {
            v1h0 v1h0Var = this.$androidxRegistry;
            String str = this.$key;
            y1h0 y1h0Var = v1h0Var.a;
            synchronized (y1h0Var.c) {
            }
        }
        return s3q0.a;
    }
}
