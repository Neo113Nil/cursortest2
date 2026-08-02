package xsna;

import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class xw50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                nx50 nx50Var = (nx50) this.c;
                if (((wa80) obj).c()) {
                    ((g9g0) nx50Var.m0.getValue()).d();
                }
                return s3q0.a;
            case 1:
                return ((qvn0) this.c).e(false);
            default:
                dks0 dks0Var = (dks0) this.c;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (obj2 instanceof VideoUploadEvent.Done) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (((VideoUploadEvent.Done) (obj2 instanceof VideoUploadEvent.Done ? obj2 : null)) != null) {
                    dks0Var.c(new oon0("videos_video_processed", null, false, false, 14));
                }
                return s3q0.a;
        }
    }
}
