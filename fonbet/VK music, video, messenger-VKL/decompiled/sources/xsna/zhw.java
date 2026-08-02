package xsna;

import com.vk.core.view.components.text.VkFadeText;
import com.vk.dto.group.Group;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import java.util.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zhw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zhw(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ajk ajkVar = (ajk) this.d;
                tdu tduVar = (tdu) obj;
                tduVar.o(ajkVar.d() * ajkVar.b());
                tduVar.n(ajkVar.d() * ajkVar.c());
                tduVar.A(ajkVar.d());
                tduVar.B(ajkVar.d());
                tduVar.f(this.c);
                break;
            case 1:
                Group group = (Group) this.d;
                ((Integer) obj).intValue();
                dw20 dw20Var = com.vk.qrcode.d.k;
                if (dw20Var != null) {
                    dw20Var.Pn(-2);
                }
                group.k = this.c;
                break;
            case 2:
                VkFadeText vkFadeText = (VkFadeText) obj;
                vkFadeText.setText((String) this.d);
                vkFadeText.setFade(this.c);
                break;
            default:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.d;
                Optional optional = (Optional) obj;
                gVar.v0();
                gVar.v.h();
                if (!this.c) {
                    VideoMinimizableScreenArgs videoMinimizableScreenArgs = (VideoMinimizableScreenArgs) optional.orElse(null);
                    if (videoMinimizableScreenArgs == null) {
                        break;
                    } else {
                        gVar.J.b(new VideoMinimizableDiscoverySideEffect.r(videoMinimizableScreenArgs));
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zhw(boolean z, com.vk.video.ui.discovery.minimizable.g gVar) {
        this.b = 3;
        this.c = z;
        this.d = gVar;
    }
}
