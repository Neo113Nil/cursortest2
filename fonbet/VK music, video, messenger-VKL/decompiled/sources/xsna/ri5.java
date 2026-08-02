package xsna;

import android.os.Handler;
import android.os.MessageQueue;
import com.vk.dto.common.VideoFile;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: AutoPlaysWarmUpHelper.kt */
/* loaded from: classes2.dex */
public final class ri5 implements MessageQueue.IdleHandler {
    public final /* synthetic */ List<VideoFile> b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Handler d;
    public final /* synthetic */ si5 e;

    /* JADX WARN: Multi-variable type inference failed */
    public ri5(List<? extends VideoFile> list, Ref$IntRef ref$IntRef, Handler handler, si5 si5Var) {
        this.b = list;
        this.c = ref$IntRef;
        this.d = handler;
        this.e = si5Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        Ref$IntRef ref$IntRef = this.c;
        VideoFile videoFile = (VideoFile) j5g.b0(ref$IntRef.element, this.b);
        if (videoFile == null) {
            this.e.b.remove(this);
            return false;
        }
        this.d.post(new c0(1, videoFile, ref$IntRef));
        return true;
    }
}
