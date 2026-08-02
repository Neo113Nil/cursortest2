package xsna;

import android.app.Activity;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c63;
import xsna.k5x;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class p5x extends c63.b {
    public final /* synthetic */ q5x b;

    /* compiled from: InspectorImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((q5x) this.receiver).l();
            return s3q0.a;
        }
    }

    public p5x(q5x q5xVar) {
        this.b = q5xVar;
    }

    @Override // xsna.c63.b
    public final void m(Activity activity) {
        q5x q5xVar = this.b;
        if (q5xVar.c) {
            int i = k5x.b;
            k5x.a.a(activity, new a(0, q5xVar, q5x.class, "showControls", "showControls()V", 0));
        }
    }
}
