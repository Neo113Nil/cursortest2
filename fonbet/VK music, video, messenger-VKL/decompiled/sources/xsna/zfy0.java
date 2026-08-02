package xsna;

import java.util.function.BiConsumer;
import one.video.calls.sdk_private.bE;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class zfy0 implements BiConsumer {
    public final /* synthetic */ bE a;

    public /* synthetic */ zfy0(bE bEVar) {
        this.a = bEVar;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        bE bEVar = this.a;
        bEVar.getClass();
        bEVar.m(((Integer) obj).intValue(), (String) obj2);
    }
}
