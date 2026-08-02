package xsna;

import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.d;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class vy10 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vy10(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                h.a aVar = (h.a) this.c;
                Pair pair = (Pair) this.d;
                pr10 pr10Var = (pr10) this.e;
                zw1 zw1Var = androidx.media3.exoplayer.h.this.h;
                int intValue = ((Integer) pair.first).intValue();
                i.b bVar = (i.b) pair.second;
                bVar.getClass();
                zw1Var.h(intValue, bVar, pr10Var);
                break;
            case 1:
                ((vm30) this.c).B((MsgFromUser) this.d, (fm20) this.e);
                break;
            case 2:
                d.C0069d c0069d = (d.C0069d) this.c;
                VideoSink.a aVar2 = (VideoSink.a) this.d;
                VideoFrameProcessingException videoFrameProcessingException = (VideoFrameProcessingException) this.e;
                androidx.media3.common.a aVar3 = c0069d.c;
                aVar3.getClass();
                aVar2.a(new VideoSink.VideoSinkException(videoFrameProcessingException, aVar3));
                break;
            default:
                com.ironsource.mediationsdk.c.b((AbstractAdapter) this.c, (String) this.d, (List) this.e);
                break;
        }
    }
}
