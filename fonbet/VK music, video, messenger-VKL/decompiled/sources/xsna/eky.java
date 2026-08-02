package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: KnetInitializer.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class eky extends FunctionReferenceImpl implements gzs<jjy> {
    @Override // xsna.gzs
    public final jjy invoke() {
        jjy jjyVar;
        synchronized (((wjy) this.receiver)) {
            jjyVar = wjy.b;
            if (jjyVar == null) {
                throw new IllegalStateException("#init() not called!");
            }
        }
        return jjyVar;
    }
}
