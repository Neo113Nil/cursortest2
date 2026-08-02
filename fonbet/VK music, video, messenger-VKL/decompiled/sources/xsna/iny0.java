package xsna;

import java.util.function.Consumer;
import one.video.calls.sdk_private.aG;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class iny0 implements Consumer {
    public final /* synthetic */ mny0 a;
    public final /* synthetic */ aG b;

    public /* synthetic */ iny0(mny0 mny0Var, aG aGVar) {
        this.a = mny0Var;
        this.b = aGVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.b[this.b.h().ordinal()] = null;
    }
}
