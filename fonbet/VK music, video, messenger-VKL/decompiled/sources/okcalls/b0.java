package okcalls;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final /* synthetic */ class b0 extends FunctionReferenceImpl implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CallOpenGLRenderer.access$onReleaseContext((CallOpenGLRenderer) this.receiver, (CallOpenGLContext) obj);
        return s3q0.a;
    }
}
