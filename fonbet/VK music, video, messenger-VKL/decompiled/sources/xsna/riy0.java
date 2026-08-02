package xsna;

import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.utils.time.TimeProvider;

/* loaded from: classes8.dex */
public final class riy0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ TimeProvider c;

    public riy0(Ref$ObjectRef ref$ObjectRef, TimeProvider timeProvider) {
        this.b = ref$ObjectRef;
        this.c = timeProvider;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Long] */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        this.b.element = Long.valueOf(this.c.getMsSinceBoot());
    }
}
