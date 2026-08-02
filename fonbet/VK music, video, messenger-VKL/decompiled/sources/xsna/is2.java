package xsna;

import com.vk.log.L;
import com.vk.medianative.MediaNative;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class is2 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ is2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ConcurrentLinkedQueue<gzs<s3q0>> concurrentLinkedQueue = ((ms2) this.c).f;
                if (!MediaNative.isCallEffectsSupported()) {
                    concurrentLinkedQueue.clear();
                    L.l("AnimojiRendererProvider", "Failed to load CallEffects (GLEffects + TFLite libs). Animoji renderers cannot be created");
                    break;
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        gzs<s3q0> poll = concurrentLinkedQueue.poll();
                        if (poll != null) {
                            poll.invoke();
                        }
                    }
                    break;
                }
            case 1:
                ((gta) this.c).b();
                break;
            default:
                ((uhe) this.c).f();
                break;
        }
    }
}
