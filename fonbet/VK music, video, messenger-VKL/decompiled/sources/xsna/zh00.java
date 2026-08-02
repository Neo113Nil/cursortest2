package xsna;

import com.vk.libvideo.upload.api.VideoUploadEvent;
import xsna.yh00;

/* compiled from: _Sequences.kt */
/* loaded from: classes3.dex */
public final class zh00 implements izs {
    public static final zh00 c = new zh00(0);
    public static final zh00 d = new zh00(1);
    public final /* synthetic */ int b;

    public /* synthetic */ zh00(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof yh00.a);
            default:
                return Boolean.valueOf(obj instanceof VideoUploadEvent.Removed);
        }
    }
}
