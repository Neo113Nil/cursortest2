package xsna;

import androidx.work.ExistingWorkPolicy;
import java.util.Collections;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkerUpdater.kt */
/* loaded from: classes12.dex */
public final class oyx0 extends Lambda implements gzs<s3q0> {
    final /* synthetic */ String $name;
    final /* synthetic */ dwx0 $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ androidx.work.e $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyx0(androidx.work.e eVar, String str, dwx0 dwx0Var) {
        super(0);
        this.$workRequest = eVar;
        this.$this_enqueueUniquelyNamedPeriodic = dwx0Var;
        this.$name = str;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        mmp.a(new xux0(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, Collections.singletonList(this.$workRequest)));
        return s3q0.a;
    }
}
