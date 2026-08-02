package xsna;

import android.graphics.Bitmap;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoUploadVh;
import com.vk.media.MediaUtils;
import java.util.concurrent.Callable;
import kotlin.Pair;
import ru.ok.android.webrtc.log.CallCodecLogger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class s19 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s19(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return CallCodecLogger.a((CallCodecLogger) obj);
            case 1:
                return ((com.vk.im.ui.components.msg_list.c) obj).g();
            default:
                String str = (String) obj;
                qcy<Object>[] qcyVarArr = VideoUploadVh.w;
                Bitmap k = MediaUtils.a.k(10L, str);
                int h = (int) (MediaUtils.a.h(str) / 1000);
                gpt0 gpt0Var = gpt0.a;
                return new Pair(k, z8s.a(h));
        }
    }
}
