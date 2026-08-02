package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NewsfeedListDependencies.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class to60 extends FunctionReferenceImpl implements gzs<String> {
    @Override // xsna.gzs
    public final String invoke() {
        return (String) ((AtomicReference) this.receiver).get();
    }
}
