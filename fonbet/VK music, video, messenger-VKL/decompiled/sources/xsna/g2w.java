package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.log.L;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g2w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ g2w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VideoFile videoFile = (VideoFile) obj;
                a1w a1wVar = i2w.c;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.D(i2w.a, new b1g0(videoFile));
                return s3q0.a;
            case 1:
                final String str = (String) obj;
                return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: xsna.hrk0
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(runnable, str);
                    }
                });
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }
}
