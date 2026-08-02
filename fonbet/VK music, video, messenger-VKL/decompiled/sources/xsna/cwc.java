package xsna;

import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import xsna.n0x;
import xsna.uvg0;
import xsna.z2d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cwc implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cwc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((gwc) this.c).a((SdkVideoFile) this.d);
                return;
            case 1:
                ((rl70) this.c).c.a(((z2d.a) this.d).b.b, n0x.a.a);
                return;
            default:
                ((SensorManager) this.c).unregisterListener((uvg0.a) this.d);
                ntu ntuVar = (ntu) uvg0.a.getValue();
                if (ntuVar.a == null) {
                    ntuVar.b.decrementAndGet();
                    return;
                }
                synchronized (ntuVar) {
                    try {
                        if (ntuVar.b.decrementAndGet() == 0) {
                            HandlerThread handlerThread = ntuVar.a;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            ntuVar.a = null;
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
