package xsna;

import com.vk.catalog2.feature.search.dto.ui.UIBlockGroupsMapPreview;
import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.libvideo.api.Subscription;
import com.vk.log.L;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.log.UrlSecretEraser;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lwp0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ lwp0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Serializer.c<UIBlockGroupsMapPreview> cVar = UIBlockGroupsMapPreview.CREATOR;
                return String.valueOf(((UIBlockGroupsMapPreview.PreviewGroupItem) obj).b.c.b);
            case 1:
                return UrlSecretEraser.a((String) obj);
            case 2:
                return s3q0.a;
            case 3:
                tq2 tq2Var = (tq2) obj;
                int round = Math.round(tq2Var.a);
                if (round < 0) {
                    round = 0;
                }
                return new q9x(((Math.round(tq2Var.b) >= 0 ? r7 : 0) & 4294967295L) | (round << 32));
            case 4:
                qgi0.r((tgi0) obj, "Video2ClipsModalTags.BUTTON_VIDEO");
                return s3q0.a;
            case 5:
                return EmptyList.b;
            case 6:
                return Boolean.valueOf(((Subscription) obj) instanceof Subscription.Subscribed);
            case 7:
                hp hpVar = (hp) obj;
                return new h2q(hpVar.a, hpVar.h);
            case 8:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 9:
                it80.a aVar = it80.b;
                Object a0 = j5g.a0(((gi10) obj).a);
                aVar.getClass();
                return new it80(a0);
            case 10:
                L.i((Throwable) obj);
                return s3q0.a;
            case 11:
                L.i((Throwable) obj);
                return s3q0.a;
            default:
                return new i5g(((AttachWall) obj).o);
        }
    }
}
