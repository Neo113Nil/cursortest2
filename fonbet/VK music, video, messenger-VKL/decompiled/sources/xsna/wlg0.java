package xsna;

import com.vk.libvideo.upload.impl.VideoPersistedUpload;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wlg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wlg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((gzs) this.c).invoke();
            default:
                com.vk.libvideo.upload.impl.b bVar = (com.vk.libvideo.upload.impl.b) this.c;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    bVar.d.append(((VideoPersistedUpload) entry.getValue()).Cb().Eb(), ((VideoPersistedUpload) entry.getValue()).Cb());
                }
                return s3q0.a;
        }
    }
}
