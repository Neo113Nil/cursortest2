package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockEmbeddedTabs;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.log.L;
import com.vk.voip.ui.actions.menu.fragments.CallParticipantPermissionsFragment;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import java.util.Collections;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.d5u0;
import xsna.l5v0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mcl0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ mcl0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return mol0.a((mol0) obj, null, null, null, null, null, LoadingState.Full, 191);
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                return s3q0.a;
            case 5:
                int i = StreamInfoFragment.S;
                return Boolean.valueOf(((it80) obj).a != 0);
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                npp0 npp0Var = (npp0) obj;
                if (!(npp0Var instanceof ftm0)) {
                    return Boolean.TRUE;
                }
                ((ftm0) npp0Var).getClass();
                new Ref$ObjectRef().element = null;
                throw null;
            case 8:
                UIBlock uIBlock = (UIBlock) obj;
                Serializer.c<UIBlockEmbeddedTabs> cVar = UIBlockEmbeddedTabs.CREATOR;
                UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                return (uIBlockList == null || (str = uIBlockList.z) == null) ? uIBlock.toString() : str;
            case 9:
                return Integer.valueOf(((ryq0) obj).l.ordinal() + 1);
            case 10:
                long j = ((q9x) obj).a;
                return new tq2((int) (j >> 32), (int) (j & 4294967295L));
            case 11:
                qgi0.r((tgi0) obj, "Video2ClipsModalTags.BUTTON_CLIP");
                return s3q0.a;
            case 12:
                VideoAdvertisementsRepository.a aVar = (VideoAdvertisementsRepository.a) obj;
                return Collections.singletonList(aVar instanceof VideoAdvertisementsRepository.a.d ? new AboutVideoItem.c.a(((VideoAdvertisementsRepository.a.d) aVar).a) : AboutVideoItem.c.b.b);
            case 13:
                qgi0.r((tgi0) obj, "VideoToClipsDismissButton");
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                return io.reactivex.rxjava3.core.x.k((d5u0.a) obj);
            case 16:
                return s3q0.a;
            case 17:
                return Boolean.valueOf(((hp) obj).h.length() > 0);
            case 18:
                return new l5v0.a.C3235a(((Boolean) obj).booleanValue());
            case 19:
                u59 u59Var = ((xcw0.w) obj).a;
                int i2 = CallParticipantPermissionsFragment.S;
                u59Var.c(CallParticipantPermissionsFragment.a.a(u59Var, false), false);
                return s3q0.a;
            default:
                return Boolean.valueOf(((Attach) obj) instanceof AttachSticker);
        }
    }
}
