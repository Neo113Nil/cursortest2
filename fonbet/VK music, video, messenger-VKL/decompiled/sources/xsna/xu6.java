package xsna;

import android.opengl.EGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class xu6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xu6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                v7i v7iVar = (v7i) this.c;
                v7i v7iVar2 = (v7i) this.d;
                v7i v7iVar3 = (v7i) this.e;
                if (!v7iVar.b() || !v7iVar2.b()) {
                    v7iVar3.a(null);
                    break;
                } else {
                    v7iVar3.e();
                    break;
                }
                break;
            default:
                CallOpenGLContext.a((CallOpenGLContext) this.c, (int[]) this.d, (EGLContext) this.e);
                break;
        }
    }
}
