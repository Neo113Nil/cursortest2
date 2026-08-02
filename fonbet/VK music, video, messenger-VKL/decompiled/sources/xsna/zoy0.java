package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.utils.time.TimeProvider;

/* loaded from: classes8.dex */
public final class zoy0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ TimeProvider d;

    public zoy0(Ref$ObjectRef ref$ObjectRef, izs izsVar, TimeProvider timeProvider) {
        this.b = ref$ObjectRef;
        this.c = izsVar;
        this.d = timeProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Long l = (Long) this.b.element;
        if (l != null) {
            this.c.invoke(Long.valueOf(this.d.getMsSinceBoot() - l.longValue()));
        }
    }
}
