package xsna;

import android.content.Context;
import android.os.Build;
import com.vk.dto.Push;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.webrtc.VideoFrame;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameEncoderImpl;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.EffectResourceProvider;
import xsna.mx90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class h9p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h9p(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((EffectHolder) obj3).lambda$selectEffect$1((EffectRegistry.EffectId) obj2, (EffectResourceProvider) obj);
                return;
            case 1:
                ((FrameEncoderImpl) obj3).a((FrameEncoder.SenderBackpressure) obj2, (VideoFrame) obj);
                return;
            case 2:
                xf00 xf00Var = (xf00) obj3;
                String str = (String) obj2;
                Push push = (Push) obj;
                ExecutorService executorService = wum0.a;
                Context context = xf00Var.a;
                if (str == null) {
                    str = "";
                }
                wum0.a(context, str, "push_delivered");
                try {
                    xf00Var.c.c(push);
                    return;
                } catch (Throwable th) {
                    if (!"huawei".equalsIgnoreCase(Build.MANUFACTURER) || Build.VERSION.SDK_INT != 28) {
                        throw th;
                    }
                    com.vk.metrics.eventtracking.b.a.a(th);
                    return;
                }
            default:
                mx90.a aVar = (mx90.a) obj3;
                v7i v7iVar = (v7i) obj;
                if (!((v7i) obj2).b()) {
                    mx90.i.log(Level.FINE, "Exporter failed");
                }
                v7iVar.e();
                aVar.b.set(true);
                return;
        }
    }
}
