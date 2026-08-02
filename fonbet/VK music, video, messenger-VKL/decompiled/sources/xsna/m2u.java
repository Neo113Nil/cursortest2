package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: GlobalSnapshotManager.android.kt */
/* loaded from: classes11.dex */
public final class m2u extends Lambda implements izs<Object, s3q0> {
    final /* synthetic */ qta<s3q0> $channel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2u(nm8 nm8Var) {
        super(1);
        this.$channel = nm8Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Object obj) {
        if (n2u.b.compareAndSet(false, true)) {
            this.$channel.f(s3q0.a);
        }
        return s3q0.a;
    }
}
