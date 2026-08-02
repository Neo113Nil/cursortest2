package xsna;

import com.vk.core.view.fresco.FrescoImageView;
import com.vk.im.engine.models.attaches.AttachVideo;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class fm3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fm3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            case 1:
                ((wow) this.c).get(((Number) obj).intValue());
                return null;
            default:
                art0 art0Var = (art0) this.c;
                AttachVideo attachVideo = art0Var.p;
                FrescoImageView frescoImageView = art0Var.d;
                if (!attachVideo.n.i()) {
                    art0Var.e.setVisibility(0);
                }
                frescoImageView.setPlaceholder(art0Var.h);
                frescoImageView.setLocalImage(art0Var.p.f);
                frescoImageView.setRemoteImage(art0Var.p.c);
                return s3q0.a;
        }
    }
}
