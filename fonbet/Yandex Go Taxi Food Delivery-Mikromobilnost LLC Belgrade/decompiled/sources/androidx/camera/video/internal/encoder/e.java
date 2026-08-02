package androidx.camera.video.internal.encoder;

import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import defpackage.hzn;
import defpackage.sgb1;
import defpackage.vbj;
import defpackage.xyn;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ e(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                Runnable runnable = (Runnable) this.w;
                if (jVar.w != EncoderImpl$InternalState.ERROR) {
                    if (!arrayList.isEmpty()) {
                        sgb1.g(3, jVar.a);
                    }
                    if ((jVar.g instanceof hzn) && !jVar.E && vbj.a.b(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        boolean z = jVar.t;
                        String str = jVar.a;
                        if (z) {
                            sgb1.g(3, str);
                            jVar.f.stop();
                        } else {
                            sgb1.g(3, str);
                            jVar.f.flush();
                        }
                        jVar.D = true;
                    } else {
                        sgb1.g(3, jVar.a);
                        jVar.f.stop();
                    }
                }
                runnable.run();
                EncoderImpl$InternalState encoderImpl$InternalState = jVar.w;
                if (encoderImpl$InternalState != EncoderImpl$InternalState.PENDING_RELEASE) {
                    if (!jVar.D) {
                        jVar.i();
                    }
                    jVar.j(EncoderImpl$InternalState.CONFIGURED);
                    if (encoderImpl$InternalState == EncoderImpl$InternalState.PENDING_START || encoderImpl$InternalState == EncoderImpl$InternalState.PENDING_START_PAUSED) {
                        jVar.l();
                        if (encoderImpl$InternalState == EncoderImpl$InternalState.PENDING_START_PAUSED) {
                            jVar.f();
                            break;
                        }
                    }
                } else {
                    jVar.g();
                    break;
                }
                break;
            default:
                ((EncoderImpl$MediaCodecCallback) this.b).lambda$reachEndData$2((Executor) this.c, (xyn) this.w);
                break;
        }
    }
}
