package okcalls;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final /* synthetic */ class z extends FunctionReferenceImpl implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r0.a.reportException(((CallOpenGLContext) this.receiver).j, "Unexpected error during media processing", (Throwable) obj);
        return s3q0.a;
    }
}
