package xsna;

import com.vk.dto.common.VideoFile;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class km9 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ km9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                List<tam0> S = ((com.vk.cameraui.impl.a) this.c).S(false);
                return S == null ? EmptyList.b : S;
            case 1:
                return twc.Q4((VideoFile) this.c);
            default:
                return (v8v) ((gzs) this.c).invoke();
        }
    }

    public /* synthetic */ km9(twc twcVar, VideoFile videoFile) {
        this.b = 1;
        this.c = videoFile;
    }
}
